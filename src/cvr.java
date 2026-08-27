public class cvr extends cvy {
   public cvr(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      cqw $$2 = null;
      csd $$3 = null;
      csd $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         csd $$6 = $$0.a($$5);
         if (!$$6.d()) {
            cry $$7 = $$6.f();
            if (!($$7 instanceof cpy)) {
               return false;
            }

            cpy $$8 = (cpy)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(jz.N, dmu.a).b().size();
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

   public csd a(cnx $$0, jj $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         csd $$3 = $$0.a($$2);
         if (!$$3.d()) {
            int $$4 = $$3.a(jz.N, dmu.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return csd.i;
   }

   public je<csd> a(cnx $$0) {
      je<csd> $$1 = je.a($$0.b(), csd.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         csd $$3 = $$0.a($$2);
         if (!$$3.d()) {
            if ($$3.f().w()) {
               $$1.set($$2, new csd($$3.f().v()));
            } else if (!$$3.a(jz.N, dmu.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
