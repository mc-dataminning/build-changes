public class blg implements bmq {
   private final gw a;
   private final ehh b;

   public blg(gw $$0) {
      this.a = $$0.i();
      this.b = ehh.b($$0);
   }

   public blg(ehh $$0) {
      this.a = gw.a($$0);
      this.b = $$0;
   }

   @Override
   public ehh a() {
      return this.b;
   }

   @Override
   public gw b() {
      return this.a;
   }

   @Override
   public boolean a(bjm $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
