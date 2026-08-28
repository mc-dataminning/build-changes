public class czq extends cyn {
   public czq(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cup $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfb.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfb.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awy.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cus.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cup a(cqk $$0, jk.a $$1) {
      cup $$2 = new cup(cus.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cup $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnb $$5 = dnb.a($$4.g());
            if ($$5 != null) {
               $$2.b(km.H, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.n;
   }
}
