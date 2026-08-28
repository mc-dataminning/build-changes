public class dax extends dar {
   public dax(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      int $$2 = 0;
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwq.uB)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cwm a(dap $$0, js.a $$1) {
      int $$2 = 0;
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cwm.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwq.uB)) {
                  return cwm.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwm.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.e;
   }
}
