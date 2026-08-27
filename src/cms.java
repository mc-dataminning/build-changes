public class cms extends cmb {
   public cms(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csv.a($$5.d()) instanceof czu) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chu)) {
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

   public cjf a(cez $$0, hr $$1) {
      cjf $$2 = cjf.b;
      chu $$3 = (chu)cji.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cja $$6 = $$5.d();
            if (csv.a($$6) instanceof czu) {
               $$2 = $$5;
            } else if ($$6 instanceof chu) {
               $$3 = (chu)$$6;
            }
         }
      }

      cjf $$7 = czu.b($$3.d());
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
   public cmm<?> an_() {
      return cmm.m;
   }
}
