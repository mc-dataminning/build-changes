public class cmz extends cnf {
   public cmz(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      int $$2 = 0;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ckm.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ckm.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public ckj a(cgd $$0, ip $$1) {
      int $$2 = 0;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ckm.th)) {
               if (!$$3.b()) {
                  return ckj.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ckm.tg)) {
                  return ckj.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cmf.d($$3) < 2) {
         ckj $$6 = new ckj(ckm.th, $$2);
         rt $$7 = $$3.v().h();
         $$7.a("generation", cmf.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return ckj.b;
      }
   }

   public il<ckj> a(cgd $$0) {
      il<ckj> $$1 = il.a($$0.b(), ckj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ckj $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new ckj($$3.d().s()));
         } else if ($$3.d() instanceof cmf) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
