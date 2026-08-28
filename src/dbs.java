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
            cxg $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(ku.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxk.vi)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxg a(dbj $$0, js.a $$1) {
      int $$2 = 0;
      cxg $$3 = cxg.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxg $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cxg.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxk.vi)) {
                  return cxg.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxg.j;
   }

   @Override
   public dcf<dbs> a() {
      return dcf.e;
   }
}
