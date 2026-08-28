public class dcd extends das {
   public dcd(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwn $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwr.wr)) {
                     return false;
                  }
               } else if (!$$4.a(cwr.pb)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      cwn $$2 = $$0.a(1, 1);
      if (!$$2.a(cwr.wr)) {
         return cwn.j;
      } else {
         cwn $$3 = new cwn(cwr.wq, 8);
         $$3.b(kv.Q, $$2.a(kv.Q));
         return $$3;
      }
   }

   @Override
   public dbm<dcd> a() {
      return dbm.j;
   }
}
