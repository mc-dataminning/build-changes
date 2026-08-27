public class cpp extends cpu {
   public cpp(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      int $$2 = 0;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnb.tU)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnb.tT)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cmy a(cir $$0, iu $$1) {
      int $$2 = 0;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnb.tU)) {
               if (!$$3.b()) {
                  return cmy.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnb.tT)) {
                  return cmy.f;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cov.d($$3) < 2) {
         cmy $$6 = new cmy(cnb.tU, $$2);
         sn $$7 = $$3.v().h();
         $$7.a("generation", cov.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cmy.f;
      }
   }

   public iq<cmy> a(cir $$0) {
      iq<cmy> $$1 = iq.a($$0.b(), cmy.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmy $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cmy($$3.d().s()));
         } else if ($$3.d() instanceof cov) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
