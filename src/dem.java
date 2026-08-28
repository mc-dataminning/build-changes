public class dem extends def {
   public dem(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kk.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dac.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      int $$2 = 0;
      czy $$3 = czy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kk.M)) {
               if (!$$3.f()) {
                  return czy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(dac.vt)) {
                  return czy.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : czy.k;
   }

   @Override
   public dez<dem> a() {
      return dez.e;
   }
}
