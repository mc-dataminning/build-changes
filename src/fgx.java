public interface fgx {
   fgn b();

   void d();

   static fgx f() {
      return new fgx() {
         private final fgn a = new fgn();

         @Override
         public fgn b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
