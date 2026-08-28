public class dev extends ddu {
   public dev(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxt) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czr.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dxh $$6 = $$5.a(kk.am, dxh.a);
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

   public czn a(dds $$0, jh.a $$1) {
      czn $$2 = czn.k;
      czn $$3 = czn.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cxt) {
               $$2 = $$5;
            } else if ($$5.a(czr.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kk.am, $$2.a(kk.am));
         $$3.b(kk.an, ((cxt)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public deo<dev> a() {
      return deo.l;
   }
}
