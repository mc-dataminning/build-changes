public class ccv extends cbs {
   public ccv(blt<? extends ccv> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static boolean a(blt<ccv> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      hx $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cwl.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bmj.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected arl y() {
      return arm.yp;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.yr;
   }

   @Override
   protected arl n_() {
      return arm.yq;
   }

   @Override
   arl w() {
      return arm.ys;
   }

   @Override
   protected cfh b(cmr $$0, float $$1) {
      cfh $$2 = super.b($$0, $$1);
      if ($$2 instanceof cfj) {
         ((cfj)$$2).a(new blc(ble.b, 600));
      }

      return $$2;
   }
}
