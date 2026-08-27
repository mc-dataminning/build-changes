public class bkv implements bmf {
   private final gw a;
   private final ehi b;

   public bkv(gw $$0) {
      this.a = $$0.i();
      this.b = ehi.b($$0);
   }

   public bkv(ehi $$0) {
      this.a = gw.a($$0);
      this.b = $$0;
   }

   @Override
   public ehi a() {
      return this.b;
   }

   @Override
   public gw b() {
      return this.a;
   }

   @Override
   public boolean a(bjb $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
