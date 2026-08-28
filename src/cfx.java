public class cfx extends cgj {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ash $$0, bwf $$1, bwf $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cgp.c($$0, $$1, $$2);
   }

   private boolean a(bwf $$0, bwf $$1) {
      return !$$0.eb().a(cfj.U) && $$1.aq().a(axy.j);
   }

   private boolean b(bwf $$0) {
      return $$0.aq().a(axy.i);
   }

   private boolean b(bwf $$0, bwf $$1) {
      return $$1.g((bvj)$$0) <= 64.0;
   }

   @Override
   protected cfj<bwf> b() {
      return cfj.B;
   }
}
