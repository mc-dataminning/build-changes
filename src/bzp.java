public class bzp extends bym {
   public bzp(bip<? extends bzp> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static boolean a(bip<bzp> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      gw $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(csr.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjf.c || $$1.g($$5.d()));
   }

   @Override
   protected aoy r() {
      return aoz.xz;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.xB;
   }

   @Override
   protected aoy h_() {
      return aoz.xA;
   }

   @Override
   aoy q() {
      return aoz.xC;
   }

   @Override
   protected cbv b(cja $$0, float $$1) {
      cbv $$2 = super.b($$0, $$1);
      if ($$2 instanceof cbx) {
         ((cbx)$$2).a(new bhy(bia.b, 600));
      }

      return $$2;
   }
}
