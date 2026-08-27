public class cmx extends cnf {
   public cmx(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      cix $$2 = null;
      ckj $$3 = null;
      ckj $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         ckj $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cke $$7 = $$6.d();
            if (!($$7 instanceof chz)) {
               return false;
            }

            chz $$8 = (chz)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = ddn.c($$6);
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

   public ckj a(cgd $$0, ip $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         ckj $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = ddn.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return ckj.b;
   }

   public il<ckj> a(cgd $$0) {
      il<ckj> $$1 = il.a($$0.b(), ckj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ckj $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new ckj($$3.d().s()));
            } else if ($$3.u() && ddn.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
