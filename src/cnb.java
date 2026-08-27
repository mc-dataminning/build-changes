import java.util.function.Predicate;

public class cnb extends cpt {
   public static final int a = 20;
   public static final int b = 15;

   public cnb(coy.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpd $$0, cvr $$1, boi $$2, int $$3) {
      if ($$2 instanceof chl $$4) {
         boolean $$5 = $$4.fU().d || ctn.a(ctp.B, $$0) > 0;
         cpd $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cpd(cpg.ou);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cpg.ou);
               if (!$$1.B) {
                  cmr $$10 = (cmr)($$6.d() instanceof cmr ? $$6.d() : cpg.ou);
                  chr $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dE(), $$4.dC(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = ctn.a(ctp.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.z() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = ctn.a(ctp.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (ctn.a(ctp.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, boi.d($$4.fo()));
                  if ($$9 || $$4.fU().d && ($$6.a(cpg.vl) || $$6.a(cpg.vm))) {
                     $$11.d = chr.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dr(), $$4.dt(), $$4.dx(), atl.aE, atm.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fU().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fT().g($$6);
                  }
               }

               $$4.b(atv.c.b(this));
            }
         }
      }
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int b(cpd $$0) {
      return 72000;
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.e;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fU().d && !$$4) {
         return blx.d($$3);
      } else {
         $$1.c($$2);
         return blx.b($$3);
      }
   }

   @Override
   public Predicate<cpd> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
