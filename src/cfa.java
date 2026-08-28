public class cfa extends cfm {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ard $$0, bvi $$1, bvi $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cfs.c($$0, $$1, $$2);
   }

   private boolean a(bvi $$0, bvi $$1) {
      return !$$0.eb().a(cem.U) && $$1.aq().a(awt.j);
   }

   private boolean b(bvi $$0) {
      return $$0.aq().a(awt.i);
   }

   private boolean b(bvi $$0, bvi $$1) {
      return $$1.g((bum)$$0) <= 64.0;
   }

   @Override
   protected cem<bvi> b() {
      return cem.B;
   }
}
