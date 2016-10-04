import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
 
public class Main
{
  public static void main(String[] args)
   {
      	int min; // minimalna liczba z zakresu
	int max; // max liczba z zakresu

        Scanner liczba = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
 	System.out.println("Podaj liczb� minimaln�: ");
	
	while(!liczba.hasNextInt()) {
            System.out.println("Podaj liczb� ca�kowit�!");
	    System.out.println("Podaj liczb� minimaln�: ");
            liczba.next(); 
        }

	min = liczba.nextInt();

	System.out.println("Podaj liczb� maksymaln�: ");

        while(!liczba.hasNextInt()) {
            System.out.println("Podaj liczb� ca�kowit�!");
	    System.out.println("Podaj liczb� maksymaln�: ");
            liczba.next();   
        }

        max = liczba.nextInt();
	
	Random rand = new Random();
	int a = rand.nextInt(max - min + 1) + min;

 	System.out.println("Wylosowano liczb� :" + a);


	for (int i = 0; i < 1000; i++)
	{
		if(i%a == 0 && i!=0)
		{  
			System.out.println(i);
		}
	}

   }
}