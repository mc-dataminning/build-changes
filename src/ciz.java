public class ciz extends chv {
   public ciz(brn<? extends ciz> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static boolean a(brn<ciz> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      in $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(ddg.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bse.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avb v() {
      return avc.yY;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.za;
   }

   @Override
   protected avb o_() {
      return avc.yZ;
   }

   @Override
   avb u() {
      return avc.zb;
   }

   @Override
   protected cln b(csz $$0, float $$1) {
      cln $$2 = super.b($$0, $$1);
      if ($$2 instanceof clp) {
         ((clp)$$2).a(new bqt(bqv.b, 600));
      }

      return $$2;
   }
}
