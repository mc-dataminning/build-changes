public class ddl extends ddr {
   public ddl(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kk.V)) {
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

   public czk a(ddp $$0, jh.a $$1) {
      int $$2 = 0;
      czk $$3 = czk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kk.V)) {
               if (!$$3.f()) {
                  return czk.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axk.bS)) {
                  return czk.k;
               }

               $$2++;
            }
         }
      }

      dcu $$6 = $$3.a(kk.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dcu $$7 = $$6.b();
         if ($$7 == null) {
            return czk.k;
         } else {
            czk $$8 = $$3.c($$2);
            $$8.b(kk.V, $$7);
            return $$8;
         }
      } else {
         return czk.k;
      }
   }

   @Override
   public jo<czk> a(ddp $$0) {
      jo<czk> $$1 = jo.a($$0.a(), czk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czk $$3 = $$0.a($$2);
         czk $$4 = $$3.h().i();
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
   public del<ddl> a() {
      return del.d;
   }
}
