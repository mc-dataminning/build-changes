public interface fis {
   fii b();

   void d();

   static fis f() {
      return new fis() {
         private final fii a = new fii();

         @Override
         public fii b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
