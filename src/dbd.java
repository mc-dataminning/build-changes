public class dbd extends dbl {
   public dbd(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cwd $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cxg $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cxc $$7 = $$6.h();
               if (!($$7 instanceof cvj)) {
                  return false;
               }

               cvj $$8 = (cvj)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(ku.ai, duh.a).b().size();
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

   public cxg a(dbj $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cxg $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, duh.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cxg.j;
   }

   @Override
   public jz<cxg> a(dbj $$0) {
      jz<cxg> $$1 = jz.a($$0.a(), cxg.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxg $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cxg $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(ku.ai, duh.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dcf<dbd> a() {
      return dcf.k;
   }
}
