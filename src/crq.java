public class crq extends crx {
   public crq(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      cnr $$2 = null;
      cpd $$3 = null;
      cpd $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cpd $$6 = $$0.a($$5);
         if (!$$6.b()) {
            coy $$7 = $$6.d();
            if (!($$7 instanceof cmt)) {
               return false;
            }

            cmt $$8 = (cmt)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = din.c($$6);
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

   public cpd a(ckv $$0, iw $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cpd $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = din.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cpd.h;
   }

   public is<cpd> a(ckv $$0) {
      is<cpd> $$1 = is.a($$0.b(), cpd.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cpd $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().s()) {
               $$1.set($$2, new cpd($$3.d().r()));
            } else if ($$3.v() && din.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public csj<?> at_() {
      return csj.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
