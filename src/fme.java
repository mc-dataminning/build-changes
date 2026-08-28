public interface fme {
   flu b();

   void d();

   static fme f() {
      return new fme() {
         private final flu a = new flu();

         @Override
         public flu b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
