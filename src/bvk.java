public class bvk implements bwv {
   private final jd a;
   private final exc b;

   public bvk(jd $$0) {
      this.a = $$0.j();
      this.b = exc.b($$0);
   }

   public bvk(exc $$0) {
      this.a = jd.a((jw)$$0);
      this.b = $$0;
   }

   @Override
   public exc a() {
      return this.b;
   }

   @Override
   public jd b() {
      return this.a;
   }

   @Override
   public boolean a(btn $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
