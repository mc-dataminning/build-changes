public class clo extends clt {
   public clo(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      int $$2 = 0;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjb.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjb.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public ciy a(ces $$0, hs $$1) {
      int $$2 = 0;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjb.th)) {
               if (!$$3.b()) {
                  return ciy.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjb.tg)) {
                  return ciy.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cku.d($$3) < 2) {
         ciy $$6 = new ciy(cjb.th, $$2);
         qr $$7 = $$3.v().h();
         $$7.a("generation", cku.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return ciy.b;
      }
   }

   public hn<ciy> a(ces $$0) {
      hn<ciy> $$1 = hn.a($$0.b(), ciy.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ciy $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new ciy($$3.d().s()));
         } else if ($$3.d() instanceof cku) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
