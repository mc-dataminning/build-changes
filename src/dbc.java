public class dbc extends dav {
   public dbc(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(kv.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwu.vi)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      int $$2 = 0;
      cwq $$3 = cwq.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(kv.L)) {
               if (!$$3.f()) {
                  return cwq.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwu.vi)) {
                  return cwq.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwq.j;
   }

   @Override
   public dbp<dbc> a() {
      return dbp.e;
   }
}
