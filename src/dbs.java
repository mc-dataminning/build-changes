public class dbs extends dbl {
   public dbs(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxh $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(kv.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxl.vk)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxh a(dbj $$0, jt.a $$1) {
      int $$2 = 0;
      cxh $$3 = cxh.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxh $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(kv.M)) {
               if (!$$3.f()) {
                  return cxh.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxl.vk)) {
                  return cxh.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxh.k;
   }

   @Override
   public dcf<dbs> a() {
      return dcf.e;
   }
}
