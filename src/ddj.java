public class ddj extends ddr {
   public ddj(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cyi $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            czk $$6 = $$0.a($$5);
            if (!$$6.f()) {
               czg $$7 = $$6.h();
               if (!($$7 instanceof cxq)) {
                  return false;
               }

               cxq $$8 = (cxq)$$7;
               if ($$2 == null) {
                  $$2 = $$8.a();
               } else if ($$2 != $$8.a()) {
                  return false;
               }

               int $$10 = $$6.a(kk.am, dxc.a).b().size();
               if ($$10 > 6) {
                  return false;
               }

               if ($$10 > 0) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$4 && $$3;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czk $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kk.am, dxc.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return czk.k;
   }

   @Override
   public jo<czk> a(ddp $$0) {
      jo<czk> $$1 = jo.a($$0.a(), czk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czk $$3 = $$0.a($$2);
         if (!$$3.f()) {
            czk $$4 = $$3.h().i();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kk.am, dxc.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public del<ddj> a() {
      return del.k;
   }
}
