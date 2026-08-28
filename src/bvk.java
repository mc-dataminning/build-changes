public class bvk implements bwv {
   private final iz a;
   private final evq b;

   public bvk(iz $$0) {
      this.a = $$0.i();
      this.b = evq.b($$0);
   }

   public bvk(evq $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evq a() {
      return this.b;
   }

   @Override
   public iz b() {
      return this.a;
   }

   @Override
   public boolean a(bto $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
