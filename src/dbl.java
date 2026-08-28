public class dbl extends dbt {
   public dbl(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cwl $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cxo $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cxk $$7 = $$6.h();
               if (!($$7 instanceof cvr)) {
                  return false;
               }

               cvr $$8 = (cvr)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(ku.ai, dun.a).b().size();
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

   public cxo a(dbr $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cxo $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ku.ai, dun.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cxo.j;
   }

   @Override
   public jz<cxo> a(dbr $$0) {
      jz<cxo> $$1 = jz.a($$0.a(), cxo.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxo $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cxo $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(ku.ai, dun.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dcn<dbl> a() {
      return dcn.k;
   }
}
