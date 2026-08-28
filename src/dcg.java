public class dcg extends dav {
   public dcg(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwq $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwu.wr)) {
                     return false;
                  }
               } else if (!$$4.a(cwu.pb)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      cwq $$2 = $$0.a(1, 1);
      if (!$$2.a(cwu.wr)) {
         return cwq.j;
      } else {
         cwq $$3 = new cwq(cwu.wq, 8);
         $$3.b(kv.Q, $$2.a(kv.Q));
         return $$3;
      }
   }

   @Override
   public dbp<dcg> a() {
      return dbp.j;
   }
}
