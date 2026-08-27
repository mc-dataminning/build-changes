public class eis implements eit {
   private final cwe b;

   public eis(cwe $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ih $$0, dme $$1, ib $$2, ib $$3, int $$4, int $$5) {
      eit.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ib $$0, czf $$1, ib $$2) {
      dme $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dme $$0, ib $$1, czf $$2, ib $$3, boolean $$4) {
      eit.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
