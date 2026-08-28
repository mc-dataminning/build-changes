public class bvj implements bwu {
   private final iz a;
   private final evp b;

   public bvj(iz $$0) {
      this.a = $$0.i();
      this.b = evp.b($$0);
   }

   public bvj(evp $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evp a() {
      return this.b;
   }

   @Override
   public iz b() {
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
