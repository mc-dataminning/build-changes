public class cpo extends cok {
   public cpo(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               clo $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(clr.vj)) {
                     return false;
                  }
               } else if (!$$4.a(clr.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public clo a(chh $$0, it $$1) {
      clo $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(clr.vj)) {
         return clo.b;
      } else {
         clo $$3 = new clo(clr.vi, 8);
         cnn.a($$3, cnn.d($$2));
         cnn.a($$3, cnn.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.j;
   }
}
