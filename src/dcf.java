public class dcf extends dau {
   public dcf(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwp $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwt.wr)) {
                     return false;
                  }
               } else if (!$$4.a(cwt.pb)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwp a(das $$0, jt.a $$1) {
      cwp $$2 = $$0.a(1, 1);
      if (!$$2.a(cwt.wr)) {
         return cwp.j;
      } else {
         cwp $$3 = new cwp(cwt.wq, 8);
         $$3.b(kv.Q, $$2.a(kv.Q));
         return $$3;
      }
   }

   @Override
   public dbo<dcf> a() {
      return dbo.j;
   }
}
