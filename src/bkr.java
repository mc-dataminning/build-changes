public class bkr implements bmb {
   private final gv a;
   private final ehf b;

   public bkr(gv $$0) {
      this.a = $$0.i();
      this.b = ehf.b($$0);
   }

   public bkr(ehf $$0) {
      this.a = gv.a($$0);
      this.b = $$0;
   }

   @Override
   public ehf a() {
      return this.b;
   }

   @Override
   public gv b() {
      return this.a;
   }

   @Override
   public boolean a(biw $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
