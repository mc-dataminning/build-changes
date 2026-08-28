public class dfs extends der {
   public dfs(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyq) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dao.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dye $$6 = $$5.a(kl.am, dye.a);
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

   public dak a(dep $$0, ji.a $$1) {
      dak $$2 = dak.l;
      dak $$3 = dak.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cyq) {
               $$2 = $$5;
            } else if ($$5.a(dao.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kl.am, $$2.a(kl.am));
         $$3.b(kl.an, ((cyq)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public dfl<dfs> a() {
      return dfl.l;
   }
}
