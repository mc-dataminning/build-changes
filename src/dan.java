public class dan extends dat {
   public dan(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(cws.uY)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cws.uX)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      int $$2 = 0;
      cwo $$3 = cwo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cws.uY)) {
               if (!$$3.f()) {
                  return cwo.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cws.uX)) {
                  return cwo.j;
               }

               $$2++;
            }
         }
      }

      czw $$6 = $$3.a(kv.T);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czw $$7 = $$6.b();
         if ($$7 == null) {
            return cwo.j;
         } else {
            cwo $$8 = $$3.c($$2);
            $$8.b(kv.T, $$7);
            return $$8;
         }
      } else {
         return cwo.j;
      }
   }

   @Override
   public ka<cwo> a(dar $$0) {
      ka<cwo> $$1 = ka.a($$0.a(), cwo.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwo $$3 = $$0.a($$2);
         cwo $$4 = $$3.h().k();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.h() instanceof cyk) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dbn<dan> a() {
      return dbn.d;
   }
}
