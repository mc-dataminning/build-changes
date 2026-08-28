public class dcu extends dbt {
   public dcu(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvr) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxs.wi)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dun $$6 = $$5.a(ku.ai, dun.a);
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

   public cxo a(dbr $$0, js.a $$1) {
      cxo $$2 = cxo.j;
      cxo $$3 = cxo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvr) {
               $$2 = $$5;
            } else if ($$5.a(cxs.wi)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cvr)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dcn<dcu> a() {
      return dcn.l;
   }
}
