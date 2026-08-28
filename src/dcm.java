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
            cxh $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvl) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cxl.wu)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  duj $$6 = $$5.a(kv.ak, duj.a);
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

   public cxh a(dbj $$0, jt.a $$1) {
      cxh $$2 = cxh.k;
      cxh $$3 = cxh.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxh $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvl) {
               $$2 = $$5;
            } else if ($$5.a(cxl.wu)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kv.ak, $$2.a(kv.ak));
         $$3.b(kv.al, ((cvl)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dcf<dcm> a() {
      return dcf.l;
   }
}
