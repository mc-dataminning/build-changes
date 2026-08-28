public class dbf extends dbl {
   public dbf(dbi $$0) {
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
               if ($$5.b(kv.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(awy.bR)) {
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
            if ($$5.b(kv.V)) {
               if (!$$3.f()) {
                  return cxh.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(awy.bR)) {
                  return cxh.k;
               }

               $$2++;
            }
         }
      }

      dao $$6 = $$3.a(kv.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dao $$7 = $$6.b();
         if ($$7 == null) {
            return cxh.k;
         } else {
            cxh $$8 = $$3.c($$2);
            $$8.b(kv.V, $$7);
            return $$8;
         }
      } else {
         return cxh.k;
      }
   }

   @Override
   public ka<cxh> a(dbj $$0) {
      ka<cxh> $$1 = ka.a($$0.a(), cxh.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxh $$3 = $$0.a($$2);
         cxh $$4 = $$3.h().j();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.b(kv.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dcf<dbf> a() {
      return dcf.d;
   }
}
