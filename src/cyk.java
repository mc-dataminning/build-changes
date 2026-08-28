public class cyk extends cyp {
   public cyk(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      int $$2 = 0;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuu.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuu.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cur a(cqm $$0, jk.a $$1) {
      int $$2 = 0;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuu.ua)) {
               if (!$$3.e()) {
                  return cur.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuu.tZ)) {
                  return cur.l;
               }

               $$2++;
            }
         }
      }

      cya $$6 = $$3.a(km.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cya $$7 = $$6.b();
         if ($$7 == null) {
            return cur.l;
         } else {
            cur $$8 = $$3.c($$2);
            $$8.b(km.J, $$7);
            return $$8;
         }
      } else {
         return cur.l;
      }
   }

   public jr<cur> a(cqm $$0) {
      jr<cur> $$1 = jr.a($$0.b(), cur.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cur $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cur($$3.g().u()));
         } else if ($$3.g() instanceof cwp) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public czb<?> ao_() {
      return czb.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
