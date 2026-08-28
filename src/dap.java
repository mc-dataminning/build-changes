public class dap extends dav {
   public dap(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(cwu.uY)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwu.uX)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      int $$2 = 0;
      cwq $$3 = cwq.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwu.uY)) {
               if (!$$3.f()) {
                  return cwq.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwu.uX)) {
                  return cwq.j;
               }

               $$2++;
            }
         }
      }

      czy $$6 = $$3.a(kv.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czy $$7 = $$6.b();
         if ($$7 == null) {
            return cwq.j;
         } else {
            cwq $$8 = $$3.c($$2);
            $$8.b(kv.T, $$7);
            return $$8;
         }
      } else {
         return cwq.j;
      }
   }

   @Override
   public ka<cwq> a(dat $$0) {
      ka<cwq> $$1 = ka.a($$0.a(), cwq.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwq $$3 = $$0.a($$2);
         cwq $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof cym) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dbp<dap> a() {
      return dbp.d;
   }
}
