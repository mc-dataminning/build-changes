public class byl implements bzw {
   private final jj a;
   private final fcu b;

   public byl(jj $$0) {
      this.a = $$0.j();
      this.b = fcu.b($$0);
   }

   public byl(fcu $$0) {
      this.a = jj.a((kc)$$0);
      this.b = $$0;
   }

   @Override
   public fcu a() {
      return this.b;
   }

   @Override
   public jj b() {
      return this.a;
   }

   @Override
   public boolean a(bwr $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
