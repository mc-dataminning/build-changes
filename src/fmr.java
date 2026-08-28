public interface fmr {
   fmh b();

   void d();

   static fmr f() {
      return new fmr() {
         private final fmh a = new fmh();

         @Override
         public fmh b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
