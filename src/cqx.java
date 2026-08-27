public class cqx extends cpt {
   public cqx(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cmx $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cna.vk)) {
                     return false;
                  }
               } else if (!$$4.a(cna.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cna.vk)) {
         return cmx.f;
      } else {
         cmx $$3 = new cmx(cna.vj, 8);
         cox.a($$3, cox.d($$2));
         cox.a($$3, cox.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.j;
   }
}
