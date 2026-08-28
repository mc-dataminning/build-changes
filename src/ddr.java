public class ddr extends ddk {
   public ddr(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czh.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      int $$2 = 0;
      czd $$3 = czd.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.M)) {
               if (!$$3.f()) {
                  return czd.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(czh.vt)) {
                  return czd.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : czd.k;
   }

   @Override
   public dee<ddr> a() {
      return dee.e;
   }
}
