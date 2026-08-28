public class ddf extends dbu {
   public ddf(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxp $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cxt.wh)) {
                     return false;
                  }
               } else if (!$$4.a(cxt.oS)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      cxp $$2 = $$0.a(1, 1);
      if (!$$2.a(cxt.wh)) {
         return cxp.j;
      } else {
         cxp $$3 = new cxp(cxt.wg, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public dco<ddf> a() {
      return dco.j;
   }
}
