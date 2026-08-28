public interface fhp {
   fhf b();

   void d();

   static fhp f() {
      return new fhp() {
         private final fhf a = new fhf();

         @Override
         public fhf b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
