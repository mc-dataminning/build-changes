public class clq extends clw {
   public clq(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      int $$2 = 0;
      cja $$3 = cja.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjd.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjd.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cja a(ceu $$0, hu $$1) {
      int $$2 = 0;
      cja $$3 = cja.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjd.th)) {
               if (!$$3.b()) {
                  return cja.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjd.tg)) {
                  return cja.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && ckw.d($$3) < 2) {
         cja $$6 = new cja(cjd.th, $$2);
         qu $$7 = $$3.v().h();
         $$7.a("generation", ckw.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cja.b;
      }
   }

   public hp<cja> a(ceu $$0) {
      hp<cja> $$1 = hp.a($$0.b(), cja.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cja $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cja($$3.d().s()));
         } else if ($$3.d() instanceof ckw) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
