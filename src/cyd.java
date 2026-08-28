public class cyd extends cyi {
   public cyd(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      int $$2 = 0;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cun.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cun.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuk a(cqf $$0, jk.a $$1) {
      int $$2 = 0;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cun.ua)) {
               if (!$$3.e()) {
                  return cuk.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cun.tZ)) {
                  return cuk.l;
               }

               $$2++;
            }
         }
      }

      cxt $$6 = $$3.a(km.I);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxt $$7 = $$6.b();
         if ($$7 == null) {
            return cuk.l;
         } else {
            cuk $$8 = $$3.c($$2);
            $$8.b(km.I, $$7);
            return $$8;
         }
      } else {
         return cuk.l;
      }
   }

   public jr<cuk> a(cqf $$0) {
      jr<cuk> $$1 = jr.a($$0.b(), cuk.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuk $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cuk($$3.g().u()));
         } else if ($$3.g() instanceof cwi) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
