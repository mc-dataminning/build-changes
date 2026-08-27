public class bms implements boc {
   private final ht a;
   private final eji b;

   public bms(ht $$0) {
      this.a = $$0.i();
      this.b = eji.b($$0);
   }

   public bms(eji $$0) {
      this.a = ht.a($$0);
      this.b = $$0;
   }

   @Override
   public eji a() {
      return this.b;
   }

   @Override
   public ht b() {
      return this.a;
   }

   @Override
   public boolean a(bky $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
