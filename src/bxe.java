public class bxe implements byp {
   private final ji a;
   private final fbb b;

   public bxe(ji $$0) {
      this.a = $$0.j();
      this.b = fbb.b($$0);
   }

   public bxe(fbb $$0) {
      this.a = ji.a((kb)$$0);
      this.b = $$0;
   }

   @Override
   public fbb a() {
      return this.b;
   }

   @Override
   public ji b() {
      return this.a;
   }

   @Override
   public boolean a(bvi $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
