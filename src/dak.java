public class dak extends das {
   public dak(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cvk $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cwn $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cwj $$7 = $$6.h();
               if (!($$7 instanceof cuq)) {
                  return false;
               }

               cuq $$8 = (cuq)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(kv.ai, dto.a).b().size();
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

   public cwn a(daq $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwn $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kv.ai, dto.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwn.j;
   }

   @Override
   public ka<cwn> a(daq $$0) {
      ka<cwn> $$1 = ka.a($$0.a(), cwn.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwn $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cwn $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kv.ai, dto.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dbm<dak> a() {
      return dbm.k;
   }
}
