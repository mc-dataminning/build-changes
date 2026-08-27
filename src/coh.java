public class coh extends cnf {
   public coh(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               ckj $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(ckm.ux)) {
                     return false;
                  }
               } else if (!$$4.a(ckm.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(ckm.ux)) {
         return ckj.b;
      } else {
         ckj $$3 = new ckj(ckm.uw, 8);
         cmi.a($$3, cmi.d($$2));
         cmi.a($$3, cmi.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.j;
   }
}
