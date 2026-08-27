public class bzn extends byk {
   public bzn(bim<? extends bzn> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bim<bzn> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      gu $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(csn.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjc.c || $$1.g($$5.d()));
   }

   @Override
   protected aov r() {
      return aow.xu;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.xw;
   }

   @Override
   protected aov h_() {
      return aow.xv;
   }

   @Override
   aov q() {
      return aow.xx;
   }

   @Override
   protected cbt b(ciy $$0, float $$1) {
      cbt $$2 = super.b($$0, $$1);
      if ($$2 instanceof cbv) {
         ((cbv)$$2).a(new bhv(bhx.b, 600));
      }

      return $$2;
   }
}
