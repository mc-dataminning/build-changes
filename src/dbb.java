public interface dbb extends daj<dbc> {
   @Override
   default dap<?> e() {
      return dap.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cvx g() {
      return new cvx(dia.ob);
   }

   default boolean a(dbc $$0, dev $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cvx var1);

   boolean b(cvx var1);

   boolean c(cvx var1);
}
