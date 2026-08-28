public interface fgz {
   fgp b();

   void d();

   static fgz f() {
      return new fgz() {
         private final fgp a = new fgp();

         @Override
         public fgp b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
