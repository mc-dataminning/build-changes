public class ddm extends ddf {
   public ddm(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(czc.vo)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      int $$2 = 0;
      cyy $$3 = cyy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.M)) {
               if (!$$3.f()) {
                  return cyy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(czc.vo)) {
                  return cyy.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cyy.k;
   }

   @Override
   public ddz<ddm> a() {
      return ddz.e;
   }
}
