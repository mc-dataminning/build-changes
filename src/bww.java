public class bww implements byh {
   private final jh a;
   private final ezn b;

   public bww(jh $$0) {
      this.a = $$0.j();
      this.b = ezn.b($$0);
   }

   public bww(ezn $$0) {
      this.a = jh.a((ka)$$0);
      this.b = $$0;
   }

   @Override
   public ezn a() {
      return this.b;
   }

   @Override
   public jh b() {
      return this.a;
   }

   @Override
   public boolean a(bva $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
