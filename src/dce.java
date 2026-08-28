public class dce extends dat {
   public dce(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwo $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cws.wr)) {
                     return false;
                  }
               } else if (!$$4.a(cws.pb)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      cwo $$2 = $$0.a(1, 1);
      if (!$$2.a(cws.wr)) {
         return cwo.j;
      } else {
         cwo $$3 = new cwo(cws.wq, 8);
         $$3.b(kv.Q, $$2.a(kv.Q));
         return $$3;
      }
   }

   @Override
   public dbn<dce> a() {
      return dbn.j;
   }
}
