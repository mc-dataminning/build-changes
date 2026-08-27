public class cnw extends cnf {
   public cnw(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cua.a($$5.d()) instanceof dax) {
               $$2++;
            } else {
               if (!($$5.d() instanceof ciy)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = ckj.b;
      ciy $$3 = (ciy)ckm.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cke $$6 = $$5.d();
            if (cua.a($$6) instanceof dax) {
               $$2 = $$5;
            } else if ($$6 instanceof ciy) {
               $$3 = (ciy)$$6;
            }
         }
      }

      ckj $$7 = dax.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.m;
   }
}
