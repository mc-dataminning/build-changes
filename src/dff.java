public class dff extends ddu {
   public dff(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               czn $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(czr.wC)) {
                     return false;
                  }
               } else if (!$$4.a(czr.pk)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public czn a(dds $$0, jh.a $$1) {
      czn $$2 = $$0.a(1, 1);
      if (!$$2.a(czr.wC)) {
         return czn.k;
      } else {
         czn $$3 = new czn(czr.wB, 8);
         $$3.b(kk.R, $$2.a(kk.R));
         return $$3;
      }
   }

   @Override
   public deo<dff> a() {
      return deo.j;
   }
}
