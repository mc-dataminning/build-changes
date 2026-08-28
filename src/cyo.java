public class cyo extends cyi {
   public cyo(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      int $$2 = 0;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cun.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cun.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuk a(cqf $$0, jk.a $$1) {
      int $$2 = 0;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cun.rU)) {
               if (!$$3.e()) {
                  return cuk.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cun.uj)) {
                  return cuk.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cuk.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.e;
   }
}
