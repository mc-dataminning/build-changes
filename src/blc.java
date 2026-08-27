public class blc implements bmm {
   private final gw a;
   private final ehp b;

   public blc(gw $$0) {
      this.a = $$0.i();
      this.b = ehp.b($$0);
   }

   public blc(ehp $$0) {
      this.a = gw.a($$0);
      this.b = $$0;
   }

   @Override
   public ehp a() {
      return this.b;
   }

   @Override
   public gw b() {
      return this.a;
   }

   @Override
   public boolean a(bji $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
