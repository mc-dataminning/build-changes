public class bwo extends bvl {
   public bwo(bfn<? extends bwo> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bfn<bwo> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      gu $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cpo.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bgd.c || $$1.g($$5.d()));
   }

   @Override
   protected amg s() {
      return amh.xt;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.xv;
   }

   @Override
   protected amg g_() {
      return amh.xu;
   }

   @Override
   amg r() {
      return amh.xw;
   }

   @Override
   protected byu b(cfz $$0, float $$1) {
      byu $$2 = super.b($$0, $$1);
      if ($$2 instanceof byw) {
         ((byw)$$2).a(new bfa(bfc.b, 600));
      }

      return $$2;
   }
}
