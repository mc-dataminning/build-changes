public class cey extends cfk {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ard $$0, bvg $$1, bvg $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cfq.c($$0, $$1, $$2);
   }

   private boolean a(bvg $$0, bvg $$1) {
      return !$$0.eb().a(cek.U) && $$1.aq().a(awt.j);
   }

   private boolean b(bvg $$0) {
      return $$0.aq().a(awt.i);
   }

   private boolean b(bvg $$0, bvg $$1) {
      return $$1.g((buk)$$0) <= 64.0;
   }

   @Override
   protected cek<bvg> b() {
      return cek.B;
   }
}
