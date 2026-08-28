public class cft extends cgf {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ash $$0, bwb $$1, bwb $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cgl.c($$0, $$1, $$2);
   }

   private boolean a(bwb $$0, bwb $$1) {
      return !$$0.eb().a(cff.U) && $$1.aq().a(axy.j);
   }

   private boolean b(bwb $$0) {
      return $$0.aq().a(axy.i);
   }

   private boolean b(bwb $$0, bwb $$1) {
      return $$1.g((bvf)$$0) <= 64.0;
   }

   @Override
   protected cff<bwb> b() {
      return cff.B;
   }
}
