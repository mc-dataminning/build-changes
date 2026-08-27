public class cuj extends ctf {
   public cuj(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cqk $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cqn.vo)) {
                     return false;
                  }
               } else if (!$$4.a(cqn.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cqn.vo)) {
         return cqk.h;
      } else {
         cqk $$3 = new cqk(cqn.vn, 8);
         csj.a($$3, csj.d($$2));
         csj.a($$3, csj.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.j;
   }
}
