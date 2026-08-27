public class ctl extends ctf {
   public ctl(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      int $$2 = 0;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqn.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqn.ug)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cqk a(cme $$0, iz $$1) {
      int $$2 = 0;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqn.rT)) {
               if (!$$3.b()) {
                  return cqk.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqn.ug)) {
                  return cqk.h;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cqk.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.e;
   }
}
