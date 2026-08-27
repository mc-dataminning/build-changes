public class cwo extends cwv {
   public cwo(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      crs $$2 = null;
      csz $$3 = null;
      csz $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         csz $$6 = $$0.a($$5);
         if (!$$6.d()) {
            csu $$7 = $$6.f();
            if (!($$7 instanceof cqu)) {
               return false;
            }

            cqu $$8 = (cqu)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ka.U, dnd.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public csz a(cou $$0, iy.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         csz $$3 = $$0.a($$2);
         if (!$$3.d()) {
            int $$4 = $$3.a(ka.U, dnd.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return csz.i;
   }

   public jf<csz> a(cou $$0) {
      jf<csz> $$1 = jf.a($$0.b(), csz.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         csz $$3 = $$0.a($$2);
         if (!$$3.d()) {
            if ($$3.f().u()) {
               $$1.set($$2, new csz($$3.f().t()));
            } else if (!$$3.a(ka.U, dnd.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
