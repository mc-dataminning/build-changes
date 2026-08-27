public class cvt extends cvb {
   public cvt(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      crj $$2 = crj.i;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpe) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crm.vq)) {
                  return false;
               }

               if (!$$2.d()) {
                  return false;
               }

               dlw $$6 = $$5.a(jp.N, dlw.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.d() && !$$3.d();
   }

   public crj a(cnf $$0, iz $$1) {
      crj $$2 = crj.i;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpe) {
               $$2 = $$5;
            } else if ($$5.a(crm.vq)) {
               $$3 = $$5.r();
            }
         }
      }

      if ($$3.d()) {
         return $$3;
      } else {
         $$3.b(jp.N, $$2.a(jp.N));
         $$3.b(jp.O, ((cpe)$$2.f()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.l;
   }
}
