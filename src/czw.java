public class czw extends cyp {
   public czw(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cuo $$4 = $$0.a($$3, $$2);
               if ($$4.e()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cur.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cur.ow)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuo a(cyn $$0, jo.a $$1) {
      cuo $$2 = $$0.a(1, 1);
      if (!$$2.a(cur.vr)) {
         return cuo.l;
      } else {
         cuo $$3 = new cuo(cur.vq, 8);
         $$3.b(kq.G, $$2.a(kq.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public czc<?> ap_() {
      return czc.j;
   }
}
