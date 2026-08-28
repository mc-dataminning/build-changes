public class dev extends ddk {
   public dev(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               czd $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(czh.wC)) {
                     return false;
                  }
               } else if (!$$4.a(czh.pk)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      czd $$2 = $$0.a(1, 1);
      if (!$$2.a(czh.wC)) {
         return czd.k;
      } else {
         czd $$3 = new czd(czh.wB, 8);
         $$3.b(kj.R, $$2.a(kj.R));
         return $$3;
      }
   }

   @Override
   public dee<dev> a() {
      return dee.j;
   }
}
