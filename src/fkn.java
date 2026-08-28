public interface fkn {
   fkd b();

   void d();

   static fkn f() {
      return new fkn() {
         private final fkd a = new fkd();

         @Override
         public fkd b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
