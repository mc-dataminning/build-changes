public class bwe extends bwq {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bmo $$0, bmo $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bww.c($$0, $$1);
   }

   private boolean e(bmo $$0, bmo $$1) {
      return !$$0.dN().a(bvq.U) && $$1.ai().a(asl.j);
   }

   private boolean b(bmo $$0) {
      return $$0.ai().a(asl.i);
   }

   private boolean f(bmo $$0, bmo $$1) {
      return $$1.f((blw)$$0) <= 64.0;
   }

   @Override
   protected bvq<bmo> b() {
      return bvq.B;
   }
}
