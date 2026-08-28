public class daz extends das {
   public daz(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(kv.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwr.vi)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      int $$2 = 0;
      cwn $$3 = cwn.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(kv.L)) {
               if (!$$3.f()) {
                  return cwn.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwr.vi)) {
                  return cwn.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwn.j;
   }

   @Override
   public dbm<daz> a() {
      return dbm.e;
   }
}
