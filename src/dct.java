public class dct extends dcz {
   public dct(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.V)) {
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

   public cys a(dcx $$0, jg.a $$1) {
      int $$2 = 0;
      cys $$3 = cys.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.V)) {
               if (!$$3.f()) {
                  return cys.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axi.bR)) {
                  return cys.k;
               }

               $$2++;
            }
         }
      }

      dcc $$6 = $$3.a(kj.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dcc $$7 = $$6.b();
         if ($$7 == null) {
            return cys.k;
         } else {
            cys $$8 = $$3.c($$2);
            $$8.b(kj.V, $$7);
            return $$8;
         }
      } else {
         return cys.k;
      }
   }

   @Override
   public jn<cys> a(dcx $$0) {
      jn<cys> $$1 = jn.a($$0.a(), cys.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cys $$3 = $$0.a($$2);
         cys $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kj.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public ddt<dct> a() {
      return ddt.d;
   }
}
