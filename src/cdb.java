public class cdb extends cby {
   public cdb(blz<? extends cdb> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static boolean a(blz<cdb> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      hx $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cws.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bmp.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected arr y() {
      return ars.yp;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.yr;
   }

   @Override
   protected arr n_() {
      return ars.yq;
   }

   @Override
   arr w() {
      return ars.ys;
   }

   @Override
   protected cfo b(cmy $$0, float $$1) {
      cfo $$2 = super.b($$0, $$1);
      if ($$2 instanceof cfq) {
         ((cfq)$$2).a(new bli(blk.b, 600));
      }

      return $$2;
   }
}
