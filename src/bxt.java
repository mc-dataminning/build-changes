public class bxt implements bze {
   private final jh a;
   private final fbr b;

   public bxt(jh $$0) {
      this.a = $$0.j();
      this.b = fbr.b($$0);
   }

   public bxt(fbr $$0) {
      this.a = jh.a((ka)$$0);
      this.b = $$0;
   }

   @Override
   public fbr a() {
      return this.b;
   }

   @Override
   public jh b() {
      return this.a;
   }

   @Override
   public boolean a(bvx $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
