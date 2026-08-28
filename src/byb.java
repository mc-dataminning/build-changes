public class byb implements bzm {
   private final jh a;
   private final fbx b;

   public byb(jh $$0) {
      this.a = $$0.j();
      this.b = fbx.b($$0);
   }

   public byb(fbx $$0) {
      this.a = jh.a((ka)$$0);
      this.b = $$0;
   }

   @Override
   public fbx a() {
      return this.b;
   }

   @Override
   public jh b() {
      return this.a;
   }

   @Override
   public boolean a(bwf $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
