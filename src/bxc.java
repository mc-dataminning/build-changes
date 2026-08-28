public class bxc implements byn {
   private final ji a;
   private final faz b;

   public bxc(ji $$0) {
      this.a = $$0.j();
      this.b = faz.b($$0);
   }

   public bxc(faz $$0) {
      this.a = ji.a((kb)$$0);
      this.b = $$0;
   }

   @Override
   public faz a() {
      return this.b;
   }

   @Override
   public ji b() {
      return this.a;
   }

   @Override
   public boolean a(bvg $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
