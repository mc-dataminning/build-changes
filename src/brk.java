public class brk implements bsv {
   private final ib a;
   private final ept b;

   public brk(ib $$0) {
      this.a = $$0.i();
      this.b = ept.b($$0);
   }

   public brk(ept $$0) {
      this.a = ib.a($$0);
      this.b = $$0;
   }

   @Override
   public ept a() {
      return this.b;
   }

   @Override
   public ib b() {
      return this.a;
   }

   @Override
   public boolean a(bpp $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
