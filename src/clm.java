public class clm extends clt {
   public clm(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      chm $$2 = null;
      ciy $$3 = null;
      ciy $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         ciy $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cit $$7 = $$6.d();
            if (!($$7 instanceof cgo)) {
               return false;
            }

            cgo $$8 = (cgo)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dcc.c($$6);
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

   public ciy a(ces $$0, hs $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         ciy $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dcc.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return ciy.b;
   }

   public hn<ciy> a(ces $$0) {
      hn<ciy> $$1 = hn.a($$0.b(), ciy.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ciy $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new ciy($$3.d().s()));
            } else if ($$3.u() && dcc.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
