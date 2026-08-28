public class dci extends dcb {
   public dci(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kx.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cyc.vm)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      int $$2 = 0;
      cxy $$3 = cxy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kx.M)) {
               if (!$$3.f()) {
                  return cxy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cyc.vm)) {
                  return cxy.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxy.k;
   }

   @Override
   public dcv<dci> a() {
      return dcv.e;
   }
}
