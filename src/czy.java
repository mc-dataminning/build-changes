public class czy extends dag {
   public czy(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      cuy $$2 = null;
      cwb $$3 = null;
      cwb $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cwb $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cvx $$7 = $$6.h();
            if (!($$7 instanceof cue)) {
               return false;
            }

            cue $$8 = (cue)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ku.ai, dsd.a).b().size();
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

   public cwb a(dae $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwb $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, dsd.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwb.k;
   }

   public jz<cwb> a(dae $$0) {
      jz<cwb> $$1 = jz.a($$0.a(), cwb.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwb $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().l()) {
               $$1.set($$2, new cwb($$3.h().k()));
            } else if (!$$3.a(ku.ai, dsd.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dau<?> aq_() {
      return dau.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
