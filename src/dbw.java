public class dbw extends dbq {
   public dbw(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      int $$2 = 0;
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxo.uZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cxk a(dbo $$0, js.a $$1) {
      int $$2 = 0;
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cxk.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxo.uZ)) {
                  return cxk.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cxk.k;
   }

   @Override
   public dci<dbw> a() {
      return dci.e;
   }
}
