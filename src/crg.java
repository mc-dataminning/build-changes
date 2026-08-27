public class crg extends cqc {
   public crg(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cng $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cnj.vn)) {
                     return false;
                  }
               } else if (!$$4.a(cnj.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cnj.vn)) {
         return cng.f;
      } else {
         cng $$3 = new cng(cnj.vm, 8);
         cpg.a($$3, cpg.d($$2));
         cpg.a($$3, cpg.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cqo<?> at_() {
      return cqo.j;
   }
}
