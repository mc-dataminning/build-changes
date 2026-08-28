public class dbh extends dbq {
   public dbh(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      cwh $$2 = null;
      cxk $$3 = null;
      cxk $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cxk $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cxg $$7 = $$6.h();
            if (!($$7 instanceof cvn)) {
               return false;
            }

            cvn $$8 = (cvn)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ku.ai, dug.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cxk a(dbo $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cxk $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, dug.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cxk.k;
   }

   @Override
   public jz<cxk> a(dbo $$0) {
      jz<cxk> $$1 = jz.a($$0.a(), cxk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxk $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cxk $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(ku.ai, dug.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dci<dbh> a() {
      return dci.k;
   }
}
