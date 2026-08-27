public class bzu extends byr {
   public bzu(biu<? extends bzu> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static boolean a(biu<bzu> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      gw $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(csw.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjk.c || $$1.g($$5.d()));
   }

   @Override
   protected apd w() {
      return ape.xz;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.xB;
   }

   @Override
   protected apd l_() {
      return ape.xA;
   }

   @Override
   apd t() {
      return ape.xC;
   }

   @Override
   protected cca b(cjf $$0, float $$1) {
      cca $$2 = super.b($$0, $$1);
      if ($$2 instanceof ccc) {
         ((ccc)$$2).a(new bid(bif.b, 600));
      }

      return $$2;
   }
}
