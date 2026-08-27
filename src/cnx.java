public class cnx extends cof {
   public cnx(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      cjx $$2 = null;
      clj $$3 = null;
      clj $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         clj $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cle $$7 = $$6.d();
            if (!($$7 instanceof ciz)) {
               return false;
            }

            ciz $$8 = (ciz)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = det.c($$6);
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

   public clj a(chc $$0, ip $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         clj $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = det.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return clj.b;
   }

   public il<clj> a(chc $$0) {
      il<clj> $$1 = il.a($$0.b(), clj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clj $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new clj($$3.d().s()));
            } else if ($$3.u() && det.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cos<?> aq_() {
      return cos.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
