public class coy extends cpd {
   public coy(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      int $$2 = 0;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmk.tU)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmk.tT)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cmh a(cia $$0, is $$1) {
      int $$2 = 0;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmk.tU)) {
               if (!$$3.b()) {
                  return cmh.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmk.tT)) {
                  return cmh.f;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cod.d($$3) < 2) {
         cmh $$6 = new cmh(cmk.tU, $$2);
         sj $$7 = $$3.v().h();
         $$7.a("generation", cod.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cmh.f;
      }
   }

   public io<cmh> a(cia $$0) {
      io<cmh> $$1 = io.a($$0.b(), cmh.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmh $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cmh($$3.d().s()));
         } else if ($$3.d() instanceof cod) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
