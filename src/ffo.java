public interface ffo {
   ffe b();

   void d();

   static ffo f() {
      return new ffo() {
         private final ffe a = new ffe();

         @Override
         public ffe b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
