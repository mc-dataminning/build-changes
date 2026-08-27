public class clx extends cmd {
   public clx(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      int $$2 = 0;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjk.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjk.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cjh a(cfb $$0, hu $$1) {
      int $$2 = 0;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjk.th)) {
               if (!$$3.b()) {
                  return cjh.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjk.tg)) {
                  return cjh.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cld.d($$3) < 2) {
         cjh $$6 = new cjh(cjk.th, $$2);
         qy $$7 = $$3.v().h();
         $$7.a("generation", cld.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cjh.b;
      }
   }

   public hp<cjh> a(cfb $$0) {
      hp<cjh> $$1 = hp.a($$0.b(), cjh.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjh $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cjh($$3.d().s()));
         } else if ($$3.d() instanceof cld) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmo<?> an_() {
      return cmo.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
