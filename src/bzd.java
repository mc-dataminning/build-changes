public class bzd implements cao {
   private final iv a;
   private final ffc b;

   public bzd(iv $$0) {
      this.a = $$0.j();
      this.b = ffc.b($$0);
   }

   public bzd(ffc $$0) {
      this.a = iv.a((jp)$$0);
      this.b = $$0;
   }

   @Override
   public ffc a() {
      return this.b;
   }

   @Override
   public iv b() {
      return this.a;
   }

   @Override
   public boolean a(bxj $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
