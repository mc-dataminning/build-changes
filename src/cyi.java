public class cyi extends cyn {
   public cyi(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      int $$2 = 0;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cus.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cus.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cup a(cqk $$0, jk.a $$1) {
      int $$2 = 0;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cus.ua)) {
               if (!$$3.e()) {
                  return cup.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cus.tZ)) {
                  return cup.l;
               }

               $$2++;
            }
         }
      }

      cxy $$6 = $$3.a(km.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxy $$7 = $$6.b();
         if ($$7 == null) {
            return cup.l;
         } else {
            cup $$8 = $$3.c($$2);
            $$8.b(km.J, $$7);
            return $$8;
         }
      } else {
         return cup.l;
      }
   }

   public jr<cup> a(cqk $$0) {
      jr<cup> $$1 = jr.a($$0.b(), cup.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cup $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cup($$3.g().u()));
         } else if ($$3.g() instanceof cwn) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
