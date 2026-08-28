public class czb extends cyi {
   public czb(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (deu.a($$5.g()) instanceof dlt) {
               $$2++;
            } else {
               if (!($$5.g() instanceof cte)) {
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

   public cuk a(cqf $$0, jk.a $$1) {
      cuk $$2 = cuk.l;
      cte $$3 = (cte)cun.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cuf $$6 = $$5.g();
            if (deu.a($$6) instanceof dlt) {
               $$2 = $$5;
            } else if ($$6 instanceof cte) {
               $$3 = (cte)$$6;
            }
         }
      }

      deu $$7 = dlt.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.m;
   }
}
