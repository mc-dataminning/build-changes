public class cmi extends cls {
   public cmi(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csl.a($$5.d()) instanceof czk) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chm)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cix a(cer $$0, hs $$1) {
      cix $$2 = cix.b;
      chm $$3 = (chm)cja.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cis $$6 = $$5.d();
            if (csl.a($$6) instanceof czk) {
               $$2 = $$5;
            } else if ($$6 instanceof chm) {
               $$3 = (chm)$$6;
            }
         }
      }

      cix $$7 = czk.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.m;
   }
}
