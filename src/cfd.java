public class cfd extends cea {
   public cfd(bnw<? extends cfd> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static boolean a(bnw<cfd> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      hz $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cyu.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bom.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected atk y() {
      return atl.yF;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.yH;
   }

   @Override
   protected atk n_() {
      return atl.yG;
   }

   @Override
   atk w() {
      return atl.yI;
   }

   @Override
   protected chr b(cpd $$0, float $$1) {
      chr $$2 = super.b($$0, $$1);
      if ($$2 instanceof cht) {
         ((cht)$$2).a(new bnd(bnf.b, 600));
      }

      return $$2;
   }
}
