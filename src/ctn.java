public class ctn extends cth {
   public ctn(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      int $$2 = 0;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqp.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqp.uh)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cqm a(cmg $$0, iz $$1) {
      int $$2 = 0;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqp.rT)) {
               if (!$$3.b()) {
                  return cqm.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqp.uh)) {
                  return cqm.h;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cqm.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.e;
   }
}
