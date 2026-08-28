public class ddz extends def {
   public ddz(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kk.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axm.bS)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      int $$2 = 0;
      czy $$3 = czy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kk.V)) {
               if (!$$3.f()) {
                  return czy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axm.bS)) {
                  return czy.k;
               }

               $$2++;
            }
         }
      }

      ddi $$6 = $$3.a(kk.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         ddi $$7 = $$6.b();
         if ($$7 == null) {
            return czy.k;
         } else {
            czy $$8 = $$3.c($$2);
            $$8.b(kk.V, $$7);
            return $$8;
         }
      } else {
         return czy.k;
      }
   }

   @Override
   public jo<czy> a(ded $$0) {
      jo<czy> $$1 = jo.a($$0.a(), czy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czy $$3 = $$0.a($$2);
         czy $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kk.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dez<ddz> a() {
      return dez.d;
   }
}
