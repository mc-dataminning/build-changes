public class bwi implements bxt {
   private final jf a;
   private final eyw b;

   public bwi(jf $$0) {
      this.a = $$0.j();
      this.b = eyw.b($$0);
   }

   public bwi(eyw $$0) {
      this.a = jf.a((jy)$$0);
      this.b = $$0;
   }

   @Override
   public eyw a() {
      return this.b;
   }

   @Override
   public jf b() {
      return this.a;
   }

   @Override
   public boolean a(bun $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
