public class dal extends dar {
   public dal(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      int $$2 = 0;
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwq.ur)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwq.uq)) {
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
            if ($$5.a(cwq.ur)) {
               if (!$$3.f()) {
                  return cwm.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwq.uq)) {
                  return cwm.k;
               }

               $$2++;
            }
         }
      }

      czu $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czu $$7 = $$6.b();
         if ($$7 == null) {
            return cwm.k;
         } else {
            cwm $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cwm.k;
      }
   }

   public jz<cwm> a(dap $$0) {
      jz<cwm> $$1 = jz.a($$0.a(), cwm.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwm $$3 = $$0.a($$2);
         if ($$3.h().l()) {
            $$1.set($$2, new cwm($$3.h().k()));
         } else if ($$3.h() instanceof cyi) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
