public class dca extends dap implements dbx {
   private final dbx.a F;

   public dca(dbx.a $$0, dfj $$1, dfi.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfj $$0) {
      return dbx.c($$0.b()).isPresent();
   }

   public dbx.a g() {
      return this.F;
   }
}
