public class dbu extends dat {
   public dbu(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cur) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cws.ws)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dtp $$6 = $$5.a(kv.ai, dtp.a);
                  if (!$$6.b().isEmpty()) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      cwo $$2 = cwo.j;
      cwo $$3 = cwo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cur) {
               $$2 = $$5;
            } else if ($$5.a(cws.ws)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kv.ai, $$2.a(kv.ai));
         $$3.b(kv.aj, ((cur)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dbn<dbu> a() {
      return dbn.l;
   }
}
