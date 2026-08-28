public class dcv extends dbu {
   public dcv(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvs) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxt.wi)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  duo $$6 = $$5.a(ku.ai, duo.a);
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

   public cxp a(dbs $$0, js.a $$1) {
      cxp $$2 = cxp.j;
      cxp $$3 = cxp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvs) {
               $$2 = $$5;
            } else if ($$5.a(cxt.wi)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cvs)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dco<dcv> a() {
      return dco.l;
   }
}
