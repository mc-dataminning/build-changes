public interface fgw {
   fgm b();

   void d();

   static fgw f() {
      return new fgw() {
         private final fgm a = new fgm();

         @Override
         public fgm b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
