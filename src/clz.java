public class clz extends cmh {
   public clz(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      chz $$2 = null;
      cjl $$3 = null;
      cjl $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cjl $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cjg $$7 = $$6.d();
            if (!($$7 instanceof chb)) {
               return false;
            }

            chb $$8 = (chb)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dcp.c($$6);
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

   public cjl a(cff $$0, hr $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cjl $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dcp.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cjl.b;
   }

   public hn<cjl> a(cff $$0) {
      hn<cjl> $$1 = hn.a($$0.b(), cjl.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjl $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cjl($$3.d().s()));
            } else if ($$3.u() && dcp.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cms<?> an_() {
      return cms.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
