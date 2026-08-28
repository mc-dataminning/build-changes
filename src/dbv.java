public class dbv extends dcb {
   public dbv(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kx.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axi.bR)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      int $$2 = 0;
      cxy $$3 = cxy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kx.V)) {
               if (!$$3.f()) {
                  return cxy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axi.bR)) {
                  return cxy.k;
               }

               $$2++;
            }
         }
      }

      dbe $$6 = $$3.a(kx.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dbe $$7 = $$6.b();
         if ($$7 == null) {
            return cxy.k;
         } else {
            cxy $$8 = $$3.c($$2);
            $$8.b(kx.V, $$7);
            return $$8;
         }
      } else {
         return cxy.k;
      }
   }

   @Override
   public kb<cxy> a(dbz $$0) {
      kb<cxy> $$1 = kb.a($$0.a(), cxy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxy $$3 = $$0.a($$2);
         cxy $$4 = $$3.h().j();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kx.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dcv<dbv> a() {
      return dcv.d;
   }
}
