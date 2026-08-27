public class cjq extends cik {
   public cjq(bsb<? extends cjq> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   public static boolean a(bsb<cjq> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      ir $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfe.sa));

      return b($$0, $$1, $$2, $$3, $$4) && (bss.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avn u() {
      return avo.zH;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.zJ;
   }

   @Override
   protected avn n_() {
      return avo.zI;
   }

   @Override
   avn t() {
      return avo.zK;
   }

   @Override
   protected cme b(cuh $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      if ($$2 instanceof cmg) {
         ((cmg)$$2).a(new brh(brj.b, 600));
      }

      return $$2;
   }
}
