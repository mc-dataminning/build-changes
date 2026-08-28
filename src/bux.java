public class bux implements bwi {
   private final ja a;
   private final ewf b;

   public bux(ja $$0) {
      this.a = $$0.i();
      this.b = ewf.b($$0);
   }

   public bux(ewf $$0) {
      this.a = ja.a($$0);
      this.b = $$0;
   }

   @Override
   public ewf a() {
      return this.b;
   }

   @Override
   public ja b() {
      return this.a;
   }

   @Override
   public boolean a(btb $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
