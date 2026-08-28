public class ddy extends ddr {
   public ddy(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kk.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czo.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      int $$2 = 0;
      czk $$3 = czk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kk.M)) {
               if (!$$3.f()) {
                  return czk.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(czo.vt)) {
                  return czk.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : czk.k;
   }

   @Override
   public del<ddy> a() {
      return del.e;
   }
}
