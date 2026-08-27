public class chs extends cgo {
   public chs(bqg<? extends chs> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqg<chs> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      id $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dcj.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bqx.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected aun v() {
      return auo.yQ;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.yS;
   }

   @Override
   protected aun o_() {
      return auo.yR;
   }

   @Override
   aun u() {
      return auo.yT;
   }

   @Override
   protected ckg b(crs $$0, float $$1) {
      ckg $$2 = super.b($$0, $$1);
      if ($$2 instanceof cki) {
         ((cki)$$2).a(new bpm(bpo.b, 600));
      }

      return $$2;
   }
}
