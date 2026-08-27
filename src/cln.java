public class cln extends cls {
   public cln(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      int $$2 = 0;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cja.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cja.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cix a(cer $$0, hs $$1) {
      int $$2 = 0;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cja.th)) {
               if (!$$3.b()) {
                  return cix.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cja.tg)) {
                  return cix.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && ckt.d($$3) < 2) {
         cix $$6 = new cix(cja.th, $$2);
         qr $$7 = $$3.v().h();
         $$7.a("generation", ckt.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cix.b;
      }
   }

   public hn<cix> a(cer $$0) {
      hn<cix> $$1 = hn.a($$0.b(), cix.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cix $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cix($$3.d().s()));
         } else if ($$3.d() instanceof ckt) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
