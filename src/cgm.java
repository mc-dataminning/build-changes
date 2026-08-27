public class cgm extends cfi {
   public cgm(bpd<? extends cgm> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bpd<cgm> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      ib $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dae.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bpt.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected atx v() {
      return aty.yN;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.yP;
   }

   @Override
   protected atx n_() {
      return aty.yO;
   }

   @Override
   atx s() {
      return aty.yQ;
   }

   @Override
   protected cja b(cqm $$0, float $$1) {
      cja $$2 = super.b($$0, $$1);
      if ($$2 instanceof cjc) {
         ((cjc)$$2).a(new bok(bom.b, 600));
      }

      return $$2;
   }
}
