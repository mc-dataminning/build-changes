public class dcw extends dbl {
   public dcw(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxh $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cxl.wt)) {
                     return false;
                  }
               } else if (!$$4.a(cxl.pd)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxh a(dbj $$0, jt.a $$1) {
      cxh $$2 = $$0.a(1, 1);
      if (!$$2.a(cxl.wt)) {
         return cxh.k;
      } else {
         cxh $$3 = new cxh(cxl.ws, 8);
         $$3.b(kv.R, $$2.a(kv.R));
         return $$3;
      }
   }

   @Override
   public dcf<dcw> a() {
      return dcf.j;
   }
}
