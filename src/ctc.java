public class ctc extends cth {
   public ctc(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      int $$2 = 0;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqp.tZ)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqp.tY)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cqm a(cmg $$0, iz $$1) {
      int $$2 = 0;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqp.tZ)) {
               if (!$$3.b()) {
                  return cqm.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqp.tY)) {
                  return cqm.h;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$2 >= 1 && csi.d($$3) < 2) {
         cqm $$6 = $$3.c($$2);
         $$6.x().a("generation", csi.d($$3) + 1);
         return $$6;
      } else {
         return cqm.h;
      }
   }

   public iu<cqm> a(cmg $$0) {
      iu<cqm> $$1 = iu.a($$0.b(), cqm.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqm $$3 = $$0.a($$2);
         if ($$3.d().u()) {
            $$1.set($$2, new cqm($$3.d().t()));
         } else if ($$3.d() instanceof csi) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
