public class czq extends cym {
   public czq(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cuo $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cur.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cur.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuo a(cqj $$0, jk.a $$1) {
      cuo $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cur.vr)) {
         return cuo.l;
      } else {
         cuo $$3 = new cuo(cur.vq, 8);
         $$3.b(km.G, $$2.a(km.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.j;
   }
}
