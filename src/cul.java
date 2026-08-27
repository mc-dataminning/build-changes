public class cul extends cth {
   public cul(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cqm $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cqp.vp)) {
                     return false;
                  }
               } else if (!$$4.a(cqp.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cqp.vp)) {
         return cqm.h;
      } else {
         cqm $$3 = new cqm(cqp.vo, 8);
         csl.a($$3, csl.d($$2));
         csl.a($$3, csl.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.j;
   }
}
