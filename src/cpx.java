public class cpx extends cqc {
   public cpx(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      int $$2 = 0;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnj.tX)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnj.tW)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cng a(ciz $$0, iu $$1) {
      int $$2 = 0;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnj.tX)) {
               if (!$$3.b()) {
                  return cng.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnj.tW)) {
                  return cng.f;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cpd.d($$3) < 2) {
         cng $$6 = new cng(cnj.tX, $$2);
         so $$7 = $$3.v().h();
         $$7.a("generation", cpd.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cng.f;
      }
   }

   public iq<cng> a(ciz $$0) {
      iq<cng> $$1 = iq.a($$0.b(), cng.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cng $$3 = $$0.a($$2);
         if ($$3.d().s()) {
            $$1.set($$2, new cng($$3.d().r()));
         } else if ($$3.d() instanceof cpd) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cqo<?> at_() {
      return cqo.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
