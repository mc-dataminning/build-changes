public class bks implements bmc {
   private final gu a;
   private final ehd b;

   public bks(gu $$0) {
      this.a = $$0.i();
      this.b = ehd.b($$0);
   }

   public bks(ehd $$0) {
      this.a = gu.a($$0);
      this.b = $$0;
   }

   @Override
   public ehd a() {
      return this.b;
   }

   @Override
   public gu b() {
      return this.a;
   }

   @Override
   public boolean a(biy $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
