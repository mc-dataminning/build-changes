public class dba extends dat {
   public dba(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(kv.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cws.vi)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      int $$2 = 0;
      cwo $$3 = cwo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(kv.L)) {
               if (!$$3.f()) {
                  return cwo.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cws.vi)) {
                  return cwo.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwo.j;
   }

   @Override
   public dbn<dba> a() {
      return dbn.e;
   }
}
