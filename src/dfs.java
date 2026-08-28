public class dfs extends deh {
   public dfs(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               daa $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(dae.wC)) {
                     return false;
                  }
               } else if (!$$4.a(dae.pk)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      daa $$2 = $$0.a(1, 1);
      if (!$$2.a(dae.wC)) {
         return daa.k;
      } else {
         daa $$3 = new daa(dae.wB, 8);
         $$3.b(kl.R, $$2.a(kl.R));
         return $$3;
      }
   }

   @Override
   public dfb<dfs> a() {
      return dfb.j;
   }
}
