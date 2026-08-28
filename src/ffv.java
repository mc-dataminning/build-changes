public interface ffv {
   ffl b();

   void d();

   static ffv f() {
      return new ffv() {
         private final ffl a = new ffl();

         @Override
         public ffl b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
