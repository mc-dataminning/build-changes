public class bxb implements bym {
   private final ji a;
   private final fay b;

   public bxb(ji $$0) {
      this.a = $$0.j();
      this.b = fay.b($$0);
   }

   public bxb(fay $$0) {
      this.a = ji.a((kb)$$0);
      this.b = $$0;
   }

   @Override
   public fay a() {
      return this.b;
   }

   @Override
   public ji b() {
      return this.a;
   }

   @Override
   public boolean a(bvf $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
