public class dfc extends ddr {
   public dfc(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               czk $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(czo.wC)) {
                     return false;
                  }
               } else if (!$$4.a(czo.pk)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      czk $$2 = $$0.a(1, 1);
      if (!$$2.a(czo.wC)) {
         return czk.k;
      } else {
         czk $$3 = new czk(czo.wB, 8);
         $$3.b(kk.R, $$2.a(kk.R));
         return $$3;
      }
   }

   @Override
   public del<dfc> a() {
      return del.j;
   }
}
