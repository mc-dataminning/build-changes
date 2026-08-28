public class dcr extends dcz {
   public dcr(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cxq $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cys $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cyo $$7 = $$6.h();
               if (!($$7 instanceof cwy)) {
                  return false;
               }

               cwy $$8 = (cwy)$$7;
               if ($$2 == null) {
                  $$2 = $$8.a();
               } else if ($$2 != $$8.a()) {
                  return false;
               }

               int $$10 = $$6.a(kj.am, dwd.a).b().size();
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

   public cys a(dcx $$0, jg.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cys $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kj.am, dwd.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cys.k;
   }

   @Override
   public jn<cys> a(dcx $$0) {
      jn<cys> $$1 = jn.a($$0.a(), cys.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cys $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cys $$4 = $$3.h().i();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kj.am, dwd.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public ddt<dcr> a() {
      return ddt.k;
   }
}
