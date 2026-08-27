public class cid extends cgz {
   public cid(bqr<? extends cid> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqr<cid> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      im $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dcx.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bri.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected auy v() {
      return auz.yX;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.yZ;
   }

   @Override
   protected auy o_() {
      return auz.yY;
   }

   @Override
   auy u() {
      return auz.za;
   }

   @Override
   protected ckr b(csd $$0, float $$1) {
      ckr $$2 = super.b($$0, $$1);
      if ($$2 instanceof ckt) {
         ((ckt)$$2).a(new bpx(bpz.b, 600));
      }

      return $$2;
   }
}
