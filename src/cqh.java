public class cqh extends cpd {
   public cqh(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cmh $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cmk.vk)) {
                     return false;
                  }
               } else if (!$$4.a(cmk.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cmk.vk)) {
         return cmh.f;
      } else {
         cmh $$3 = new cmh(cmk.vj, 8);
         cog.a($$3, cog.d($$2));
         cog.a($$3, cog.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.j;
   }
}
