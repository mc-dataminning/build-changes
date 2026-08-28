public interface fhw {
   fhm b();

   void d();

   static fhw f() {
      return new fhw() {
         private final fhm a = new fhm();

         @Override
         public fhm b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
