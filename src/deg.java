public class deg extends ddf {
   public deg(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxe) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czc.wy)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dwn $$6 = $$5.a(kj.am, dwn.a);
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

   public cyy a(ddd $$0, jg.a $$1) {
      cyy $$2 = cyy.k;
      cyy $$3 = cyy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cxe) {
               $$2 = $$5;
            } else if ($$5.a(czc.wy)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kj.am, $$2.a(kj.am));
         $$3.b(kj.an, ((cxe)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public ddz<deg> a() {
      return ddz.l;
   }
}
