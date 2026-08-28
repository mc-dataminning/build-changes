public class dca extends dbt {
   public dca(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(ku.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxs.uZ)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      int $$2 = 0;
      cxo $$3 = cxo.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cxo.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxs.uZ)) {
                  return cxo.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxo.k;
   }

   @Override
   public dcn<dca> a() {
      return dcn.e;
   }
}
