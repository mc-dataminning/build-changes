public class cod extends cnx {
   public cod(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      int $$2 = 0;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cle.rg)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cle.tq)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public clb a(cgu $$0, ip $$1) {
      int $$2 = 0;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cle.rg)) {
               if (!$$3.b()) {
                  return clb.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cle.tq)) {
                  return clb.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : clb.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public coj<?> aq_() {
      return coj.e;
   }
}
