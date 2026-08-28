public class cyt extends cyn {
   public cyt(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      int $$2 = 0;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cus.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cus.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cup a(cqk $$0, jk.a $$1) {
      int $$2 = 0;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cus.rU)) {
               if (!$$3.e()) {
                  return cup.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cus.uj)) {
                  return cup.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cup.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.e;
   }
}
