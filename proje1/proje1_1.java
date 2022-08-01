package proje1;
import java.util.Scanner;

public class proje1_1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut,elma,domates,muz,patlıcan;
        double toplam;

        System.out.print("kaç kilo armut aldın? : ");
        armut=inp.nextDouble();

        System.out.print("kaç kilo elma aldın?: ");
        elma=inp.nextDouble();

        System.out.print("kaç kilo domates aldın? : ");
        domates=inp.nextDouble();

        System.out.print("kaç kilo muz aldın? : ");
        muz=inp.nextDouble();

        System.out.print("kaç kilo patlıcan aldın? : ");
        patlıcan=inp.nextDouble();

        toplam=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5));

        System.out.print("toplam tutar : "+toplam+" TL");
    }
}
