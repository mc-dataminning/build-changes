public class deb extends ddu {
   public deb(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kk.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czr.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czn a(dds $$0, jh.a $$1) {
      int $$2 = 0;
      czn $$3 = czn.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kk.M)) {
               if (!$$3.f()) {
                  return czn.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(czr.vt)) {
                  return czn.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : czn.k;
   }

   @Override
   public deo<deb> a() {
      return deo.e;
   }
}
