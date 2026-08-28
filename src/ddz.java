public class ddz extends deh {
   public ddz(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cyy $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            daa $$6 = $$0.a($$5);
            if (!$$6.f()) {
               czw $$7 = $$6.h();
               if (!($$7 instanceof cyg)) {
                  return false;
               }

               cyg $$8 = (cyg)$$7;
               if ($$2 == null) {
                  $$2 = $$8.a();
               } else if ($$2 != $$8.a()) {
                  return false;
               }

               int $$10 = $$6.a(kl.am, dxu.a).b().size();
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

   public daa a(def $$0, ji.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         daa $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kl.am, dxu.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return daa.k;
   }

   @Override
   public jp<daa> a(def $$0) {
      jp<daa> $$1 = jp.a($$0.a(), daa.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         daa $$3 = $$0.a($$2);
         if (!$$3.f()) {
            daa $$4 = $$3.h().i();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kl.am, dxu.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dfb<ddz> a() {
      return dfb.k;
   }
}
