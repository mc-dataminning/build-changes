public class dde extends dbt {
   public dde(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxo $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cxs.wh)) {
                     return false;
                  }
               } else if (!$$4.a(cxs.oS)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      cxo $$2 = $$0.a(1, 1);
      if (!$$2.a(cxs.wh)) {
         return cxo.j;
      } else {
         cxo $$3 = new cxo(cxs.wg, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public dcn<dde> a() {
      return dcn.j;
   }
}
