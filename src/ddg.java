public class ddg extends dcz {
   public ddg(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cyw.vm)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      int $$2 = 0;
      cys $$3 = cys.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.M)) {
               if (!$$3.f()) {
                  return cys.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cyw.vm)) {
                  return cys.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cys.k;
   }

   @Override
   public ddt<ddg> a() {
      return ddt.e;
   }
}
