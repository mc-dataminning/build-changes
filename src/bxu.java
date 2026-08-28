public class bxu implements bzf {
   private final ji a;
   private final fbx b;

   public bxu(ji $$0) {
      this.a = $$0.j();
      this.b = fbx.b($$0);
   }

   public bxu(fbx $$0) {
      this.a = ji.a((kb)$$0);
      this.b = $$0;
   }

   @Override
   public fbx a() {
      return this.b;
   }

   @Override
   public ji b() {
      return this.a;
   }

   @Override
   public boolean a(bvy $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
