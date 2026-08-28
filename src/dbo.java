public class dbo extends dbu {
   public dbo(dbr $$0) {
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
               if ($$5.a(cxt.uP)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxt.uO)) {
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
            if ($$5.a(cxt.uP)) {
               if (!$$3.f()) {
                  return cxp.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxt.uO)) {
                  return cxp.j;
               }

               $$2++;
            }
         }
      }

      dax $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dax $$7 = $$6.b();
         if ($$7 == null) {
            return cxp.j;
         } else {
            cxp $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cxp.j;
      }
   }

   @Override
   public jz<cxp> a(dbs $$0) {
      jz<cxp> $$1 = jz.a($$0.a(), cxp.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxp $$3 = $$0.a($$2);
         cxp $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof czl) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dco<dbo> a() {
      return dco.d;
   }
}
