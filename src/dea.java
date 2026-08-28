public class dea extends dcz {
   public dea(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cwy) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cyw.ww)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dwd $$6 = $$5.a(kj.am, dwd.a);
                  if (!$$6.b().isEmpty()) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      cys $$2 = cys.k;
      cys $$3 = cys.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cwy) {
               $$2 = $$5;
            } else if ($$5.a(cyw.ww)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kj.am, $$2.a(kj.am));
         $$3.b(kj.an, ((cwy)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public ddt<dea> a() {
      return ddt.l;
   }
}
