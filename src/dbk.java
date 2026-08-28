public class dbk extends dbq {
   public dbk(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      int $$2 = 0;
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cxo.uP)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxo.uO)) {
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
            if ($$5.a(cxo.uP)) {
               if (!$$3.f()) {
                  return cxk.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxo.uO)) {
                  return cxk.k;
               }

               $$2++;
            }
         }
      }

      das $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         das $$7 = $$6.b();
         if ($$7 == null) {
            return cxk.k;
         } else {
            cxk $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cxk.k;
      }
   }

   @Override
   public jz<cxk> a(dbo $$0) {
      jz<cxk> $$1 = jz.a($$0.a(), cxk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxk $$3 = $$0.a($$2);
         cxk $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof czg) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dci<dbk> a() {
      return dci.d;
   }
}
