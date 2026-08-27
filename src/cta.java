public class cta extends ctf {
   public cta(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      int $$2 = 0;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqn.tY)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqn.tX)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cqk a(cme $$0, iz $$1) {
      int $$2 = 0;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cqn.tY)) {
               if (!$$3.b()) {
                  return cqk.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqn.tX)) {
                  return cqk.h;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$2 >= 1 && csg.d($$3) < 2) {
         cqk $$6 = $$3.c($$2);
         $$6.x().a("generation", csg.d($$3) + 1);
         return $$6;
      } else {
         return cqk.h;
      }
   }

   public iu<cqk> a(cme $$0) {
      iu<cqk> $$1 = iu.a($$0.b(), cqk.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqk $$3 = $$0.a($$2);
         if ($$3.d().u()) {
            $$1.set($$2, new cqk($$3.d().t()));
         } else if ($$3.d() instanceof csg) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
