public class daj extends dar {
   public daj(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      cvj $$2 = null;
      cwm $$3 = null;
      cwm $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cwm $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cwi $$7 = $$6.h();
            if (!($$7 instanceof cup)) {
               return false;
            }

            cup $$8 = (cup)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ku.ai, dsp.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cwm a(dap $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwm $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, dsp.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwm.k;
   }

   public jz<cwm> a(dap $$0) {
      jz<cwm> $$1 = jz.a($$0.a(), cwm.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwm $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().l()) {
               $$1.set($$2, new cwm($$3.h().k()));
            } else if (!$$3.a(ku.ai, dsp.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
