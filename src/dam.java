public class dam extends dag {
   public dam(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      int $$2 = 0;
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwf.ul)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cwb a(dae $$0, js.a $$1) {
      int $$2 = 0;
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cwb.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwf.ul)) {
                  return cwb.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwb.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dau<?> aq_() {
      return dau.e;
   }
}
