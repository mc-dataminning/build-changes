public class dbw extends dav {
   public dbw(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cut) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwu.ws)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dtr $$6 = $$5.a(kv.ai, dtr.a);
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

   public cwq a(dat $$0, jt.a $$1) {
      cwq $$2 = cwq.j;
      cwq $$3 = cwq.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cut) {
               $$2 = $$5;
            } else if ($$5.a(cwu.ws)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kv.ai, $$2.a(kv.ai));
         $$3.b(kv.aj, ((cut)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dbp<dbw> a() {
      return dbp.l;
   }
}
