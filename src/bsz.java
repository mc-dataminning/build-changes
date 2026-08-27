public class bsz implements buk {
   private final im a;
   private final etf b;

   public bsz(im $$0) {
      this.a = $$0.i();
      this.b = etf.b($$0);
   }

   public bsz(etf $$0) {
      this.a = im.a($$0);
      this.b = $$0;
   }

   @Override
   public etf a() {
      return this.b;
   }

   @Override
   public im b() {
      return this.a;
   }

   @Override
   public boolean a(bre $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
