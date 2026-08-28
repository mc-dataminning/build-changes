public interface dbc extends dak<dbd> {
   @Override
   default daq<?> e() {
      return daq.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cvs g() {
      return new cvs(dho.ob);
   }

   default boolean a(dbd $$0, dej $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cvs var1);

   boolean b(cvs var1);

   boolean c(cvs var1);
}
