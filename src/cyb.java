public class cyb extends cyi {
   public cyb(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      ctd $$2 = null;
      cuk $$3 = null;
      cuk $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cuk $$6 = $$0.a($$5);
         if (!$$6.e()) {
            cuf $$7 = $$6.g();
            if (!($$7 instanceof csf)) {
               return false;
            }

            csf $$8 = (csf)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(km.W, dot.a).b().size();
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

   public cuk a(cqf $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cuk $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(km.W, dot.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cuk.l;
   }

   public jr<cuk> a(cqf $$0) {
      jr<cuk> $$1 = jr.a($$0.b(), cuk.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuk $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cuk($$3.g().u()));
            } else if (!$$3.a(km.W, dot.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
