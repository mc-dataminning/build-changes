public class dar extends czk {
   public dar(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cvl $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cvo.vt)) {
                     return false;
                  }
               } else if (!$$4.a(cvo.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cvl a(czi $$0, jp.a $$1) {
      cvl $$2 = $$0.a(1, 1);
      if (!$$2.a(cvo.vt)) {
         return cvl.k;
      } else {
         cvl $$3 = new cvl(cvo.vs, 8);
         $$3.b(kr.I, $$2.a(kr.I));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public czy<?> as_() {
      return czy.j;
   }
}
