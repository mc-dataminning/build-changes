public class dcb extends dbu {
   public dcb(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.b(ku.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxt.uZ)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      int $$2 = 0;
      cxp $$3 = cxp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cxp.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxt.uZ)) {
                  return cxp.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxp.j;
   }

   @Override
   public dco<dcb> a() {
      return dco.e;
   }
}
