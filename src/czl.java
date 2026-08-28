public class czl extends cyi {
   public czl(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuk $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dew.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dew.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awu.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cun.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuk a(cqf $$0, jk.a $$1) {
      cuk $$2 = new cuk(cun.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuk $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dmw $$5 = dmw.a($$4.g());
            if ($$5 != null) {
               $$2.b(km.G, $$5.b());
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
   public cyu<?> ap_() {
      return cyu.n;
   }
}
