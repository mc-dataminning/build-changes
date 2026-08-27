public class cmn extends clw {
   public cmn(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csq.a($$5.d()) instanceof czp) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chp)) {
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

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = cja.b;
      chp $$3 = (chp)cjd.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            civ $$6 = $$5.d();
            if (csq.a($$6) instanceof czp) {
               $$2 = $$5;
            } else if ($$6 instanceof chp) {
               $$3 = (chp)$$6;
            }
         }
      }

      cja $$7 = czp.b($$3.d());
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
   public cmh<?> ai_() {
      return cmh.m;
   }
}
