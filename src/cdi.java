public class cdi extends ccf {
   public cdi(bmc<? extends cdi> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bmc<cdi> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      hx $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cxa.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bms.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected ars y() {
      return art.yE;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.yG;
   }

   @Override
   protected ars n_() {
      return art.yF;
   }

   @Override
   ars w() {
      return art.yH;
   }

   @Override
   protected cfw b(cng $$0, float $$1) {
      cfw $$2 = super.b($$0, $$1);
      if ($$2 instanceof cfy) {
         ((cfy)$$2).a(new blj(bll.b, 600));
      }

      return $$2;
   }
}
