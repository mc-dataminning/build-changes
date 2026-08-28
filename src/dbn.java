public class dbn extends dag {
   public dbn(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwb $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwf.vt)) {
                     return false;
                  }
               } else if (!$$4.a(cwf.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwb a(dae $$0, js.a $$1) {
      cwb $$2 = $$0.a(1, 1);
      if (!$$2.a(cwf.vt)) {
         return cwb.k;
      } else {
         cwb $$3 = new cwb(cwf.vs, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dau<?> aq_() {
      return dau.j;
   }
}
