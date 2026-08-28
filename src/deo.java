public class deo extends deh {
   public deo(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kl.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dae.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      int $$2 = 0;
      daa $$3 = daa.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kl.M)) {
               if (!$$3.f()) {
                  return daa.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(dae.vt)) {
                  return daa.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : daa.k;
   }

   @Override
   public dfb<deo> a() {
      return dfb.e;
   }
}
