public class bvg implements bwr {
   private final iz a;
   private final evm b;

   public bvg(iz $$0) {
      this.a = $$0.i();
      this.b = evm.b($$0);
   }

   public bvg(evm $$0) {
      this.a = iz.a($$0);
      this.b = $$0;
   }

   @Override
   public evm a() {
      return this.b;
   }

   @Override
   public iz b() {
      return this.a;
   }

   @Override
   public boolean a(btk $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
