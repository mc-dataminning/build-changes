public class dba extends dag {
   public dba(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      cwb $$2 = cwb.k;
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cue) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwf.vu)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               dsd $$6 = $$5.a(ku.ai, dsd.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cwb a(dae $$0, js.a $$1) {
      cwb $$2 = cwb.k;
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cue) {
               $$2 = $$5;
            } else if ($$5.a(cwf.vu)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cue)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dau<?> aq_() {
      return dau.l;
   }
}
