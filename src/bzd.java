public class bzd implements cao {
   private final iv a;
   private final fex b;

   public bzd(iv $$0) {
      this.a = $$0.j();
      this.b = fex.b($$0);
   }

   public bzd(fex $$0) {
      this.a = iv.a((jp)$$0);
      this.b = $$0;
   }

   @Override
   public fex a() {
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
