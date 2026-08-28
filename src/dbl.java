public class dbl extends dar {
   public dbl(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      cwm $$2 = cwm.k;
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cup) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwq.vK)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               dsp $$6 = $$5.a(ku.ai, dsp.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cwm a(dap $$0, js.a $$1) {
      cwm $$2 = cwm.k;
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cup) {
               $$2 = $$5;
            } else if ($$5.a(cwq.vK)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cup)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.l;
   }
}
