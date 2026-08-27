public class brj implements bsu {
   private final ib a;
   private final epr b;

   public brj(ib $$0) {
      this.a = $$0.i();
      this.b = epr.b($$0);
   }

   public brj(epr $$0) {
      this.a = ib.a($$0);
      this.b = $$0;
   }

   @Override
   public epr a() {
      return this.b;
   }

   @Override
   public ib b() {
      return this.a;
   }

   @Override
   public boolean a(bpo $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
