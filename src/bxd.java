public class bxd implements byo {
   private final jh a;
   private final ezy b;

   public bxd(jh $$0) {
      this.a = $$0.j();
      this.b = ezy.b($$0);
   }

   public bxd(ezy $$0) {
      this.a = jh.a((ka)$$0);
      this.b = $$0;
   }

   @Override
   public ezy a() {
      return this.b;
   }

   @Override
   public jh b() {
      return this.a;
   }

   @Override
   public boolean a(bvh $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
