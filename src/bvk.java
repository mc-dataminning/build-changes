public class bvk implements bwv {
   private final jd a;
   private final exa b;

   public bvk(jd $$0) {
      this.a = $$0.j();
      this.b = exa.b($$0);
   }

   public bvk(exa $$0) {
      this.a = jd.a((jw)$$0);
      this.b = $$0;
   }

   @Override
   public exa a() {
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
