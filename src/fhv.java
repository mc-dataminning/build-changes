public interface fhv {
   fhl b();

   void d();

   static fhv f() {
      return new fhv() {
         private final fhl a = new fhl();

         @Override
         public fhl b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
