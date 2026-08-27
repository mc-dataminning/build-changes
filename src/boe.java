public class boe implements bpp {
   private final hx a;
   private final els b;

   public boe(hx $$0) {
      this.a = $$0.i();
      this.b = els.b($$0);
   }

   public boe(els $$0) {
      this.a = hx.a($$0);
      this.b = $$0;
   }

   @Override
   public els a() {
      return this.b;
   }

   @Override
   public hx b() {
      return this.a;
   }

   @Override
   public boolean a(bmk $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
