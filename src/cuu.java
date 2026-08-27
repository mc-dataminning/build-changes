public class cuu extends cvb {
   public cuu(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      cqc $$2 = null;
      crj $$3 = null;
      crj $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         crj $$6 = $$0.a($$5);
         if (!$$6.d()) {
            cre $$7 = $$6.f();
            if (!($$7 instanceof cpe)) {
               return false;
            }

            cpe $$8 = (cpe)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(jp.N, dlw.a).b().size();
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

   public crj a(cnf $$0, iz $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         crj $$3 = $$0.a($$2);
         if (!$$3.d()) {
            int $$4 = $$3.a(jp.N, dlw.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return crj.i;
   }

   public iu<crj> a(cnf $$0) {
      iu<crj> $$1 = iu.a($$0.b(), crj.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         crj $$3 = $$0.a($$2);
         if (!$$3.d()) {
            if ($$3.f().w()) {
               $$1.set($$2, new crj($$3.f().v()));
            } else if (!$$3.a(jp.N, dlw.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
