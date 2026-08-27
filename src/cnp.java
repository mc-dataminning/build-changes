public class cnp extends cnx {
   public cnp(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      cjp $$2 = null;
      clb $$3 = null;
      clb $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         clb $$6 = $$0.a($$5);
         if (!$$6.b()) {
            ckw $$7 = $$6.d();
            if (!($$7 instanceof cir)) {
               return false;
            }

            cir $$8 = (cir)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = deh.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public clb a(cgu $$0, ip $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         clb $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = deh.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return clb.b;
   }

   public il<clb> a(cgu $$0) {
      il<clb> $$1 = il.a($$0.b(), clb.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clb $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new clb($$3.d().s()));
            } else if ($$3.u() && deh.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public coj<?> aq_() {
      return coj.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
