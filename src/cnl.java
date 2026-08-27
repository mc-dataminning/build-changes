public class cnl extends cnf {
   public cnl(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      int $$2 = 0;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ckm.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ckm.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public ckj a(cgd $$0, ip $$1) {
      int $$2 = 0;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ckm.rf)) {
               if (!$$3.b()) {
                  return ckj.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ckm.tp)) {
                  return ckj.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : ckj.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.e;
   }
}
