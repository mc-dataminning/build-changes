public class bqs implements bsd {
   private final ib a;
   private final eov b;

   public bqs(ib $$0) {
      this.a = $$0.i();
      this.b = eov.b($$0);
   }

   public bqs(eov $$0) {
      this.a = ib.a($$0);
      this.b = $$0;
   }

   @Override
   public eov a() {
      return this.b;
   }

   @Override
   public ib b() {
      return this.a;
   }

   @Override
   public boolean a(box $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
