public class dbt extends csq implements dbs {
   private final dbs.a d;

   public dbt(dbs.a $$0, dfd.d $$1) {
      super($$1);
      this.d = $$0;
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
      return this.d;
   }
}
