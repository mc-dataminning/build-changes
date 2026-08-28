public interface fkg {
   fjw b();

   void d();

   static fkg f() {
      return new fkg() {
         private final fjw a = new fjw();

         @Override
         public fjw b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
