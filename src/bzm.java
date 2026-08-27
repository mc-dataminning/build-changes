public class bzm extends byj {
   public bzm(bim<? extends bzm> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public static boolean a(bim<bzm> $$0, cqa $$1, bjc $$2, gu $$3, aru $$4) {
      gu $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(csm.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjc.c || $$1.g($$5.d()));
   }

   @Override
   protected aov r() {
      return aow.xz;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.xB;
   }

   @Override
   protected aov h_() {
      return aow.xA;
   }

   @Override
   aov q() {
      return aow.xC;
   }

   @Override
   protected cbs b(cix $$0, float $$1) {
      cbs $$2 = super.b($$0, $$1);
      if ($$2 instanceof cbu) {
         ((cbu)$$2).a(new bhv(bhx.b, 600));
      }

      return $$2;
   }
}
