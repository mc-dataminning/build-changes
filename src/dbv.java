public class dbv extends dak implements dbs {
   private final dbs.a F;

   public dbv(dbs.a $$0, dfe $$1, dfd.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfe $$0) {
      return dbs.c($$0.b()).isPresent();
   }

   public dbs.a g() {
      return this.F;
   }
}
