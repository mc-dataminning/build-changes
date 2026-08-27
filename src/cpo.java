public class cpo extends cpt {
   public cpo(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      int $$2 = 0;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cna.tU)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cna.tT)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cmx a(ciq $$0, iu $$1) {
      int $$2 = 0;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cna.tU)) {
               if (!$$3.b()) {
                  return cmx.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cna.tT)) {
                  return cmx.f;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cou.d($$3) < 2) {
         cmx $$6 = new cmx(cna.tU, $$2);
         sn $$7 = $$3.v().h();
         $$7.a("generation", cou.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cmx.f;
      }
   }

   public iq<cmx> a(ciq $$0) {
      iq<cmx> $$1 = iq.a($$0.b(), cmx.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmx $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cmx($$3.d().s()));
         } else if ($$3.d() instanceof cou) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
