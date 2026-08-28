public class bvi implements bwt {
   private final jd a;
   private final eww b;

   public bvi(jd $$0) {
      this.a = $$0.i();
      this.b = eww.b($$0);
   }

   public bvi(eww $$0) {
      this.a = jd.a((jw)$$0);
      this.b = $$0;
   }

   @Override
   public eww a() {
      return this.b;
   }

   @Override
   public jd b() {
      return this.a;
   }

   @Override
   public boolean a(btl $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
