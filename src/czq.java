public class czq extends czy {
   public czq(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      cuj $$2 = null;
      cvp $$3 = null;
      cvp $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cvp $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cvk $$7 = $$6.h();
            if (!($$7 instanceof cto)) {
               return false;
            }

            cto $$8 = (cto)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kr.ad, drj.a).b().size();
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

   public cvp a(czw $$0, jp.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cvp $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kr.ad, drj.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cvp.k;
   }

   public jw<cvp> a(czw $$0) {
      jw<cvp> $$1 = jw.a($$0.a(), cvp.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvp $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().u()) {
               $$1.set($$2, new cvp($$3.h().t()));
            } else if (!$$3.a(kr.ad, drj.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dam<?> aq_() {
      return dam.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
