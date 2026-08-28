public class ddx extends def {
   public ddx(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cyw $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            czy $$6 = $$0.a($$5);
            if (!$$6.f()) {
               czu $$7 = $$6.h();
               if (!($$7 instanceof cye)) {
                  return false;
               }

               cye $$8 = (cye)$$7;
               if ($$2 == null) {
                  $$2 = $$8.a();
               } else if ($$2 != $$8.a()) {
                  return false;
               }

               int $$10 = $$6.a(kk.am, dxs.a).b().size();
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

   public czy a(ded $$0, jh.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         czy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kk.am, dxs.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return czy.k;
   }

   @Override
   public jo<czy> a(ded $$0) {
      jo<czy> $$1 = jo.a($$0.a(), czy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            czy $$4 = $$3.h().i();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kk.am, dxs.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dez<ddx> a() {
      return dez.k;
   }
}
