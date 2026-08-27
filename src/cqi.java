public class cqi extends cqc {
   public cqi(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      int $$2 = 0;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnj.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnj.uf)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cng a(ciz $$0, iu $$1) {
      int $$2 = 0;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnj.rT)) {
               if (!$$3.b()) {
                  return cng.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnj.uf)) {
                  return cng.f;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cng.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cqo<?> at_() {
      return cqo.e;
   }
}
