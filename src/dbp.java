public class dbp extends dae implements dbm {
   private final dbm.a F;

   public dbp(dbm.a $$0, dey $$1, dex.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dey $$0) {
      return dbm.c($$0.b()).isPresent();
   }

   public dbm.a g() {
      return this.F;
   }
}
