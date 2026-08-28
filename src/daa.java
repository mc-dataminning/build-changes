public class daa extends dag {
   public daa(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      int $$2 = 0;
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwf.ub)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwf.ua)) {
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
            if ($$5.a(cwf.ub)) {
               if (!$$3.f()) {
                  return cwb.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwf.ua)) {
                  return cwb.k;
               }

               $$2++;
            }
         }
      }

      czj $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czj $$7 = $$6.b();
         if ($$7 == null) {
            return cwb.k;
         } else {
            cwb $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cwb.k;
      }
   }

   public jz<cwb> a(dae $$0) {
      jz<cwb> $$1 = jz.a($$0.a(), cwb.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwb $$3 = $$0.a($$2);
         if ($$3.h().l()) {
            $$1.set($$2, new cwb($$3.h().k()));
         } else if ($$3.h() instanceof cxx) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dau<?> aq_() {
      return dau.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
