public class dam extends das {
   public dam(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(cwr.uY)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwr.uX)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      int $$2 = 0;
      cwn $$3 = cwn.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwr.uY)) {
               if (!$$3.f()) {
                  return cwn.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwr.uX)) {
                  return cwn.j;
               }

               $$2++;
            }
         }
      }

      czv $$6 = $$3.a(kv.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czv $$7 = $$6.b();
         if ($$7 == null) {
            return cwn.j;
         } else {
            cwn $$8 = $$3.c($$2);
            $$8.b(kv.T, $$7);
            return $$8;
         }
      } else {
         return cwn.j;
      }
   }

   @Override
   public ka<cwn> a(daq $$0) {
      ka<cwn> $$1 = ka.a($$0.a(), cwn.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwn $$3 = $$0.a($$2);
         cwn $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof cyj) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dbm<dam> a() {
      return dbm.d;
   }
}
