public class des extends ddr {
   public des(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxq) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czo.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dxc $$6 = $$5.a(kk.am, dxc.a);
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

   public czk a(ddp $$0, jh.a $$1) {
      czk $$2 = czk.k;
      czk $$3 = czk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cxq) {
               $$2 = $$5;
            } else if ($$5.a(czo.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kk.am, $$2.a(kk.am));
         $$3.b(kk.an, ((cxq)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public del<des> a() {
      return del.l;
   }
}
