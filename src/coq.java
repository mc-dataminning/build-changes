public class coq extends cnx {
   public coq(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cut.a($$5.d()) instanceof dbr) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cjq)) {
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

   public clb a(cgu $$0, ip $$1) {
      clb $$2 = clb.b;
      cjq $$3 = (cjq)cle.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            ckw $$6 = $$5.d();
            if (cut.a($$6) instanceof dbr) {
               $$2 = $$5;
            } else if ($$6 instanceof cjq) {
               $$3 = (cjq)$$6;
            }
         }
      }

      clb $$7 = dbr.b($$3.d());
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
   public coj<?> aq_() {
      return coj.m;
   }
}
