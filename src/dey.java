public class dey extends der {
   public dey(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kl.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dao.vt)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      int $$2 = 0;
      dak $$3 = dak.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kl.M)) {
               if (!$$3.f()) {
                  return dak.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(dao.vt)) {
                  return dak.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : dak.l;
   }

   @Override
   public dfl<dey> a() {
      return dfl.e;
   }
}
