public class cfp extends cgb {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arx $$0, bvx $$1, bvx $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cgh.c($$0, $$1, $$2);
   }

   private boolean a(bvx $$0, bvx $$1) {
      return !$$0.ec().a(cfb.U) && $$1.aq().a(axo.j);
   }

   private boolean b(bvx $$0) {
      return $$0.aq().a(axo.i);
   }

   private boolean b(bvx $$0, bvx $$1) {
      return $$1.g((bvb)$$0) <= 64.0;
   }

   @Override
   protected cfb<bvx> b() {
      return cfb.B;
   }
}
