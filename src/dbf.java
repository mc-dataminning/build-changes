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
            cxg $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(cxk.uY)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxk.uX)) {
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
            if ($$5.a(cxk.uY)) {
               if (!$$3.f()) {
                  return cxg.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxk.uX)) {
                  return cxg.j;
               }

               $$2++;
            }
         }
      }

      dao $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dao $$7 = $$6.b();
         if ($$7 == null) {
            return cxg.j;
         } else {
            cxg $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cxg.j;
      }
   }

   @Override
   public jz<cxg> a(dbj $$0) {
      jz<cxg> $$1 = jz.a($$0.a(), cxg.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxg $$3 = $$0.a($$2);
         cxg $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof czc) {
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
