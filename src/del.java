public class del extends ddk {
   public del(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxj) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czh.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dwv $$6 = $$5.a(kj.am, dwv.a);
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

   public czd a(ddi $$0, jg.a $$1) {
      czd $$2 = czd.k;
      czd $$3 = czd.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cxj) {
               $$2 = $$5;
            } else if ($$5.a(czh.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kj.am, $$2.a(kj.am));
         $$3.b(kj.an, ((cxj)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public dee<del> a() {
      return dee.l;
   }
}
