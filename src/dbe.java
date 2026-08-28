public class dbe extends dak {
   public dbe(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      cwf $$2 = cwf.k;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cui) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwj.vK)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               dsi $$6 = $$5.a(ku.ai, dsi.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cwf a(dai $$0, js.a $$1) {
      cwf $$2 = cwf.k;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cui) {
               $$2 = $$5;
            } else if ($$5.a(cwj.vK)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cui)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public day<?> aq_() {
      return day.l;
   }
}
