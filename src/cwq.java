public class cwq extends cvy {
   public cwq(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      csd $$2 = csd.i;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpy) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(csg.vs)) {
                  return false;
               }

               if (!$$2.d()) {
                  return false;
               }

               dmu $$6 = $$5.a(jz.N, dmu.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.d() && !$$3.d();
   }

   public csd a(cnx $$0, jj $$1) {
      csd $$2 = csd.i;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpy) {
               $$2 = $$5;
            } else if ($$5.a(csg.vs)) {
               $$3 = $$5.r();
            }
         }
      }

      if ($$3.d()) {
         return $$3;
      } else {
         $$3.b(jz.N, $$2.a(jz.N));
         $$3.b(jz.O, ((cpy)$$2.f()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.l;
   }
}
