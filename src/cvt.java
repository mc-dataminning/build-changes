public class cvt extends cvy {
   public cvt(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      int $$2 = 0;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(csg.ua)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(csg.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public csd a(cnx $$0, jj $$1) {
      int $$2 = 0;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(csg.ua)) {
               if (!$$3.d()) {
                  return csd.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(csg.tZ)) {
                  return csd.i;
               }

               $$2++;
            }
         }
      }

      cvj $$6 = $$3.a(jz.A);
      if (!$$3.d() && $$2 >= 1 && $$6 != null) {
         cvj $$7 = $$6.b();
         if ($$7 == null) {
            return csd.i;
         } else {
            csd $$8 = $$3.c($$2);
            $$8.b(jz.A, $$7);
            return $$8;
         }
      } else {
         return csd.i;
      }
   }

   public je<csd> a(cnx $$0) {
      je<csd> $$1 = je.a($$0.b(), csd.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         csd $$3 = $$0.a($$2);
         if ($$3.f().w()) {
            $$1.set($$2, new csd($$3.f().v()));
         } else if ($$3.f() instanceof ctz) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
