public class dbv extends dau {
   public dbv(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cus) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwt.ws)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dtq $$6 = $$5.a(kv.ai, dtq.a);
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

   public cwp a(das $$0, jt.a $$1) {
      cwp $$2 = cwp.j;
      cwp $$3 = cwp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cus) {
               $$2 = $$5;
            } else if ($$5.a(cwt.ws)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kv.ai, $$2.a(kv.ai));
         $$3.b(kv.aj, ((cus)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dbo<dbv> a() {
      return dbo.l;
   }
}
