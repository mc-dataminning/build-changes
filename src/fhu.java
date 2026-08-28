public interface fhu {
   fhk b();

   void d();

   static fhu f() {
      return new fhu() {
         private final fhk a = new fhk();

         @Override
         public fhk b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
