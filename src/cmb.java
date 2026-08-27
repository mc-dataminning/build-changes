public class cmb extends cmh {
   public cmb(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      int $$2 = 0;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjo.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjo.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cjl a(cff $$0, hr $$1) {
      int $$2 = 0;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjo.th)) {
               if (!$$3.b()) {
                  return cjl.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjo.tg)) {
                  return cjl.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && clh.d($$3) < 2) {
         cjl $$6 = new cjl(cjo.th, $$2);
         qw $$7 = $$3.v().h();
         $$7.a("generation", clh.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cjl.b;
      }
   }

   public hn<cjl> a(cff $$0) {
      hn<cjl> $$1 = hn.a($$0.b(), cjl.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjl $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cjl($$3.d().s()));
         } else if ($$3.d() instanceof clh) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cms<?> an_() {
      return cms.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
