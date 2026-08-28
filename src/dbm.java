public class dbm extends dbu {
   public dbm(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cwm $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cxp $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cxl $$7 = $$6.h();
               if (!($$7 instanceof cvs)) {
                  return false;
               }

               cvs $$8 = (cvs)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(ku.ai, duo.a).b().size();
               if ($$10 > 6) {
                  return false;
               }

               if ($$10 > 0) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$4 && $$3;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cxp $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, duo.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cxp.j;
   }

   @Override
   public jz<cxp> a(dbs $$0) {
      jz<cxp> $$1 = jz.a($$0.a(), cxp.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxp $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cxp $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(ku.ai, duo.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dco<dbm> a() {
      return dco.k;
   }
}
