public class ddo extends ddu {
   public ddo(ddr $$0) {
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
               if ($$5.c(kk.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axk.bS)) {
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
            if ($$5.c(kk.V)) {
               if (!$$3.f()) {
                  return czn.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axk.bS)) {
                  return czn.k;
               }

               $$2++;
            }
         }
      }

      dcx $$6 = $$3.a(kk.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dcx $$7 = $$6.b();
         if ($$7 == null) {
            return czn.k;
         } else {
            czn $$8 = $$3.c($$2);
            $$8.b(kk.V, $$7);
            return $$8;
         }
      } else {
         return czn.k;
      }
   }

   @Override
   public jo<czn> a(dds $$0) {
      jo<czn> $$1 = jo.a($$0.a(), czn.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czn $$3 = $$0.a($$2);
         czn $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kk.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public deo<ddo> a() {
      return deo.d;
   }
}
