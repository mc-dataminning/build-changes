public class eqh implements eqi {
   private final dca b;

   public eqh(dca $$0) {
      this.b = $$0;
   }

   @Override
   public void a(iw $$0, dtc $$1, ir $$2, ir $$3, int $$4, int $$5) {
      eqi.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ir $$0, dfc $$1, ir $$2) {
      dtc $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dtc $$0, ir $$1, dfc $$2, ir $$3, boolean $$4) {
      eqi.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
