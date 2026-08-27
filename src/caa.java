public class caa extends byx {
   public caa(bja<? extends caa> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bja<caa> $$0, cqq $$1, bjq $$2, gw $$3, ash $$4) {
      gw $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cte.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjq.c || $$1.g($$5.d()));
   }

   @Override
   protected apf w() {
      return apg.xz;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.xB;
   }

   @Override
   protected apf l_() {
      return apg.xA;
   }

   @Override
   apf t() {
      return apg.xC;
   }

   @Override
   protected ccg b(cjl $$0, float $$1) {
      ccg $$2 = super.b($$0, $$1);
      if ($$2 instanceof cci) {
         ((cci)$$2).a(new bij(bil.b, 600));
      }

      return $$2;
   }
}
