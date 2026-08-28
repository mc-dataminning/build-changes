public class bvm implements bwx {
   private final iz a;
   private final evs b;

   public bvm(iz $$0) {
      this.a = $$0.i();
      this.b = evs.b($$0);
   }

   public bvm(evs $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evs a() {
      return this.b;
   }

   @Override
   public iz b() {
      return this.a;
   }

   @Override
   public boolean a(btq $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
