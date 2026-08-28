public class bzo implements caz {
   private final iv a;
   private final ffq b;

   public bzo(iv $$0) {
      this.a = $$0.j();
      this.b = ffq.b($$0);
   }

   public bzo(ffq $$0) {
      this.a = iv.a((jp)$$0);
      this.b = $$0;
   }

   @Override
   public ffq a() {
      return this.b;
   }

   @Override
   public iv b() {
      return this.a;
   }

   @Override
   public boolean a(bxu $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
