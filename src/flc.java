public interface flc {
   fks b();

   void d();

   static flc f() {
      return new flc() {
         private final fks a = new fks();

         @Override
         public fks b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
