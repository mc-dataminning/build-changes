public class bxx implements bzi {
   private final jh a;
   private final fbs b;

   public bxx(jh $$0) {
      this.a = $$0.j();
      this.b = fbs.b($$0);
   }

   public bxx(fbs $$0) {
      this.a = jh.a((ka)$$0);
      this.b = $$0;
   }

   @Override
   public fbs a() {
      return this.b;
   }

   @Override
   public jh b() {
      return this.a;
   }

   @Override
   public boolean a(bwb $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
