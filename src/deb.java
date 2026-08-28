public class deb extends deh {
   public deb(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kl.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axo.bT)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      int $$2 = 0;
      daa $$3 = daa.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kl.V)) {
               if (!$$3.f()) {
                  return daa.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axo.bT)) {
                  return daa.k;
               }

               $$2++;
            }
         }
      }

      ddk $$6 = $$3.a(kl.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         ddk $$7 = $$6.b();
         if ($$7 == null) {
            return daa.k;
         } else {
            daa $$8 = $$3.c($$2);
            $$8.b(kl.V, $$7);
            return $$8;
         }
      } else {
         return daa.k;
      }
   }

   @Override
   public jp<daa> a(def $$0) {
      jp<daa> $$1 = jp.a($$0.a(), daa.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         daa $$3 = $$0.a($$2);
         daa $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kl.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dfb<deb> a() {
      return dfb.d;
   }
}
