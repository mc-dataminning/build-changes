public class dbt extends das {
   public dbt(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cuq) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwr.ws)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dto $$6 = $$5.a(kv.ai, dto.a);
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

   public cwn a(daq $$0, jt.a $$1) {
      cwn $$2 = cwn.j;
      cwn $$3 = cwn.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cuq) {
               $$2 = $$5;
            } else if ($$5.a(cwr.ws)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kv.ai, $$2.a(kv.ai));
         $$3.b(kv.aj, ((cuq)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dbm<dbt> a() {
      return dbm.l;
   }
}
