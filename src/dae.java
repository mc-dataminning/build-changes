public class dae extends dak {
   public dae(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      int $$2 = 0;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwj.ur)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwj.uq)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cwf a(dai $$0, js.a $$1) {
      int $$2 = 0;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwj.ur)) {
               if (!$$3.f()) {
                  return cwf.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwj.uq)) {
                  return cwf.k;
               }

               $$2++;
            }
         }
      }

      czn $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czn $$7 = $$6.b();
         if ($$7 == null) {
            return cwf.k;
         } else {
            cwf $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cwf.k;
      }
   }

   public jz<cwf> a(dai $$0) {
      jz<cwf> $$1 = jz.a($$0.a(), cwf.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwf $$3 = $$0.a($$2);
         if ($$3.h().l()) {
            $$1.set($$2, new cwf($$3.h().k()));
         } else if ($$3.h() instanceof cyb) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public day<?> aq_() {
      return day.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
