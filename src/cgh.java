public class cgh extends cgt {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arn $$0, bwr $$1, bwr $$2) {
      return this.b($$1, $$2) && $$2.bj() && (this.b($$2) || this.a($$1, $$2)) && cgz.c($$0, $$1, $$2);
   }

   private boolean a(bwr $$0, bwr $$1) {
      return !$$0.eb().a(cft.V) && $$1.aq().a(axd.j);
   }

   private boolean b(bwr $$0) {
      return $$0.aq().a(axd.i);
   }

   private boolean b(bwr $$0, bwr $$1) {
      return $$1.g((bvs)$$0) <= 64.0;
   }

   @Override
   protected cft<bwr> b() {
      return cft.C;
   }
}
