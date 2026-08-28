public interface fgy {
   fgo b();

   void d();

   static fgy f() {
      return new fgy() {
         private final fgo a = new fgo();

         @Override
         public fgo b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
