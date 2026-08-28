public class dbn extends dbt {
   public dbn(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(cxs.uP)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxs.uO)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      int $$2 = 0;
      cxo $$3 = cxo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cxs.uP)) {
               if (!$$3.f()) {
                  return cxo.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxs.uO)) {
                  return cxo.j;
               }

               $$2++;
            }
         }
      }

      daw $$6 = $$3.a(ku.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         daw $$7 = $$6.b();
         if ($$7 == null) {
            return cxo.j;
         } else {
            cxo $$8 = $$3.c($$2);
            $$8.b(ku.T, $$7);
            return $$8;
         }
      } else {
         return cxo.j;
      }
   }

   @Override
   public jz<cxo> a(dbr $$0) {
      jz<cxo> $$1 = jz.a($$0.a(), cxo.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxo $$3 = $$0.a($$2);
         cxo $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof czk) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dcn<dbn> a() {
      return dcn.d;
   }
}
