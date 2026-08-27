public class cpn extends cpu {
   public cpn(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      clm $$2 = null;
      cmy $$3 = null;
      cmy $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cmy $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cmt $$7 = $$6.d();
            if (!($$7 instanceof cko)) {
               return false;
            }

            cko $$8 = (cko)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dgl.c($$6);
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

   public cmy a(cir $$0, iu $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cmy $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dgl.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cmy.f;
   }

   public iq<cmy> a(cir $$0) {
      iq<cmy> $$1 = iq.a($$0.b(), cmy.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmy $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cmy($$3.d().s()));
            } else if ($$3.u() && dgl.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
