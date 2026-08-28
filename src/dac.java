public class dac extends dak {
   public dac(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      cvc $$2 = null;
      cwf $$3 = null;
      cwf $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cwf $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cwb $$7 = $$6.h();
            if (!($$7 instanceof cui)) {
               return false;
            }

            cui $$8 = (cui)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ku.ai, dsi.a).b().size();
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

   public cwf a(dai $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwf $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, dsi.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwf.k;
   }

   public jz<cwf> a(dai $$0) {
      jz<cwf> $$1 = jz.a($$0.a(), cwf.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwf $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().l()) {
               $$1.set($$2, new cwf($$3.h().k()));
            } else if (!$$3.a(ku.ai, dsi.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public day<?> aq_() {
      return day.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
