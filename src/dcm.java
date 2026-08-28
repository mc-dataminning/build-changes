public class dcm extends dbl {
   public dcm(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxg $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvj) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxk.ws)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  duh $$6 = $$5.a(ku.ai, duh.a);
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

   public cxg a(dbj $$0, js.a $$1) {
      cxg $$2 = cxg.j;
      cxg $$3 = cxg.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxg $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvj) {
               $$2 = $$5;
            } else if ($$5.a(cxk.ws)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cvj)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dcf<dcm> a() {
      return dcf.l;
   }
}
