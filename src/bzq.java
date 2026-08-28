public class bzq implements cbb {
   private final iw a;
   private final ffs b;

   public bzq(iw $$0) {
      this.a = $$0.j();
      this.b = ffs.b($$0);
   }

   public bzq(ffs $$0) {
      this.a = iw.a((jq)$$0);
      this.b = $$0;
   }

   @Override
   public ffs a() {
      return this.b;
   }

   @Override
   public iw b() {
      return this.a;
   }

   @Override
   public boolean a(bxw $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
