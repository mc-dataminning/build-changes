public class dbx extends dar {
   public dbx(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwm $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwq.vJ)) {
                     return false;
                  }
               } else if (!$$4.a(cwq.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwm a(dap $$0, js.a $$1) {
      cwm $$2 = $$0.a(1, 1);
      if (!$$2.a(cwq.vJ)) {
         return cwm.k;
      } else {
         cwm $$3 = new cwm(cwq.vI, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.j;
   }
}
