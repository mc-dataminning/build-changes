public class bvl implements bww {
   private final iz a;
   private final evr b;

   public bvl(iz $$0) {
      this.a = $$0.i();
      this.b = evr.b($$0);
   }

   public bvl(evr $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evr a() {
      return this.b;
   }

   @Override
   public iz b() {
      return this.a;
   }

   @Override
   public boolean a(btp $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
