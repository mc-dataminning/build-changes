public class dde extends ddk {
   public dde(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axk.bS)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      int $$2 = 0;
      czd $$3 = czd.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.V)) {
               if (!$$3.f()) {
                  return czd.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axk.bS)) {
                  return czd.k;
               }

               $$2++;
            }
         }
      }

      dcn $$6 = $$3.a(kj.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dcn $$7 = $$6.b();
         if ($$7 == null) {
            return czd.k;
         } else {
            czd $$8 = $$3.c($$2);
            $$8.b(kj.V, $$7);
            return $$8;
         }
      } else {
         return czd.k;
      }
   }

   @Override
   public jn<czd> a(ddi $$0) {
      jn<czd> $$1 = jn.a($$0.a(), czd.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czd $$3 = $$0.a($$2);
         czd $$4 = $$3.h().i();
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
   public dee<dde> a() {
      return dee.d;
   }
}
