public class ctb extends crx {
   public ctb(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cpd $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cpg.vn)) {
                     return false;
                  }
               } else if (!$$4.a(cpg.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cpg.vn)) {
         return cpd.h;
      } else {
         cpd $$3 = new cpd(cpg.vm, 8);
         crb.a($$3, crb.d($$2));
         crb.a($$3, crb.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.j;
   }
}
