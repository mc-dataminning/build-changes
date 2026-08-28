public class chk extends chw {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ars $$0, bxu $$1, bxu $$2) {
      return this.b($$1, $$2) && $$2.bi() && (this.b($$2) || this.a($$1, $$2)) && cic.c($$0, $$1, $$2);
   }

   private boolean a(bxu $$0, bxu $$1) {
      return !$$0.ec().a(cgw.V) && $$1.an().a(axh.j);
   }

   private boolean b(bxu $$0) {
      return $$0.an().a(axh.i);
   }

   private boolean b(bxu $$0, bxu $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cgw<bxu> b() {
      return cgw.C;
   }
}
