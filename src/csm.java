public class csm extends crt {
   public csm(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cyo.a($$5.d()) instanceof dfm) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cno)) {
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

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = coz.h;
      cno $$3 = (cno)cpc.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cou $$6 = $$5.d();
            if (cyo.a($$6) instanceof dfm) {
               $$2 = $$5;
            } else if ($$6 instanceof cno) {
               $$3 = (cno)$$6;
            }
         }
      }

      coz $$7 = dfm.b($$3.d());
      if ($$2.v()) {
         $$7.c($$2.w().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csf<?> at_() {
      return csf.m;
   }
}
