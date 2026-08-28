public class fks {
   private static volatile boolean a;

   public static void a() {
      if (!a) {
         a = true;
         hbm.a();
         hdw.a();
         fmt.a();
         hdg.a();
         hbv.a();
         hcr.a();
      }
   }
}
