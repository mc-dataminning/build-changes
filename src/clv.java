public class clv extends cmb {
   public clv(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      int $$2 = 0;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cji.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cji.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cjf a(cez $$0, hu $$1) {
      int $$2 = 0;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cji.th)) {
               if (!$$3.b()) {
                  return cjf.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cji.tg)) {
                  return cjf.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && clb.d($$3) < 2) {
         cjf $$6 = new cjf(cji.th, $$2);
         qx $$7 = $$3.v().h();
         $$7.a("generation", clb.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cjf.b;
      }
   }

   public hp<cjf> a(cez $$0) {
      hp<cjf> $$1 = hp.a($$0.b(), cjf.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjf $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cjf($$3.d().s()));
         } else if ($$3.d() instanceof clb) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmm<?> an_() {
      return cmm.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
