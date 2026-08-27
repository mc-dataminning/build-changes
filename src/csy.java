public class csy extends ctf {
   public csy(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      cpb $$2 = null;
      cqk $$3 = null;
      cqk $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cqk $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cqf $$7 = $$6.d();
            if (!($$7 instanceof coc)) {
               return false;
            }

            coc $$8 = (coc)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = djw.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cqk a(cme $$0, iz $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cqk $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = djw.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cqk.h;
   }

   public iu<cqk> a(cme $$0) {
      iu<cqk> $$1 = iu.a($$0.b(), cqk.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqk $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().u()) {
               $$1.set($$2, new cqk($$3.d().t()));
            } else if (djw.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
