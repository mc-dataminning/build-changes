public class dal extends dat {
   public dal(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cvl $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cwo $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cwk $$7 = $$6.h();
               if (!($$7 instanceof cur)) {
                  return false;
               }

               cur $$8 = (cur)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(kv.ai, dtp.a).b().size();
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

   public cwo a(dar $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwo $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kv.ai, dtp.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwo.j;
   }

   @Override
   public ka<cwo> a(dar $$0) {
      ka<cwo> $$1 = ka.a($$0.a(), cwo.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwo $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cwo $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kv.ai, dtp.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dbn<dal> a() {
      return dbn.k;
   }
}
