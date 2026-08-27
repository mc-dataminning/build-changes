public class bzl extends byi {
   public bzl(bik<? extends bzl> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static boolean a(bik<bzl> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      gv $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(csl.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bja.c || $$1.g($$5.d()));
   }

   @Override
   protected aot r() {
      return aou.xu;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.xw;
   }

   @Override
   protected aot h_() {
      return aou.xv;
   }

   @Override
   aot q() {
      return aou.xx;
   }

   @Override
   protected cbr b(ciw $$0, float $$1) {
      cbr $$2 = super.b($$0, $$1);
      if ($$2 instanceof cbt) {
         ((cbt)$$2).a(new bht(bhv.b, 600));
      }

      return $$2;
   }
}
