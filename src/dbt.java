public class dbt extends dcb {
   public dbt(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cwv $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cxy $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cxu $$7 = $$6.h();
               if (!($$7 instanceof cwc)) {
                  return false;
               }

               cwc $$8 = (cwc)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(kx.ak, dvb.a).b().size();
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

   public cxy a(dbz $$0, ju.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cxy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kx.ak, dvb.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cxy.k;
   }

   @Override
   public kb<cxy> a(dbz $$0) {
      kb<cxy> $$1 = kb.a($$0.a(), cxy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cxy $$4 = $$3.h().j();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kx.ak, dvb.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dcv<dbt> a() {
      return dcv.k;
   }
}
