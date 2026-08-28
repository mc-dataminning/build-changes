public class dcw extends dbl {
   public dcw(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxg $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cxk.wr)) {
                     return false;
                  }
               } else if (!$$4.a(cxk.pb)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxg a(dbj $$0, js.a $$1) {
      cxg $$2 = $$0.a(1, 1);
      if (!$$2.a(cxk.wr)) {
         return cxg.j;
      } else {
         cxg $$3 = new cxg(cxk.wq, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public dcf<dcw> a() {
      return dcf.j;
   }
}
