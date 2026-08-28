public interface flh {
   fkx b();

   void d();

   static flh f() {
      return new flh() {
         private final fkx a = new fkx();

         @Override
         public fkx b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
