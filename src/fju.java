public interface fju {
   fjk b();

   void d();

   static fju f() {
      return new fju() {
         private final fjk a = new fjk();

         @Override
         public fjk b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
