public class bwa extends bwl {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bmk $$0, bmk $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bwr.c($$0, $$1);
   }

   private boolean e(bmk $$0, bmk $$1) {
      return !$$0.dO().a(bvm.T) && $$1.ai().a(asj.j);
   }

   private boolean b(bmk $$0) {
      return $$0.ai().a(asj.i);
   }

   private boolean f(bmk $$0, bmk $$1) {
      return $$1.f((blu)$$0) <= 64.0;
   }

   @Override
   protected bvm<bmk> b() {
      return bvm.B;
   }
}
