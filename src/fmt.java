public interface fmt {
   fmj b();

   void d();

   static fmt f() {
      return new fmt() {
         private final fmj a = new fmj();

         @Override
         public fmj b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
