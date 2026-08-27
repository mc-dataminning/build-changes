import java.util.function.Predicate;

public class ckw extends cno implements cot {
   public static final int a = 20;
   public static final int b = 15;

   public ckw(cmt.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmy $$0, ctp $$1, bml $$2, int $$3) {
      if ($$2 instanceof cfi $$4) {
         boolean $$5 = $$4.fT().d || crl.a(crn.B, $$0) > 0;
         cmy $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cmy(cnb.os);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cnb.os);
               if (!$$1.B) {
                  ckm $$10 = (ckm)($$6.d() instanceof ckm ? $$6.d() : cnb.os);
                  cfo $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dE(), $$4.dC(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = crl.a(crn.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.A() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = crl.a(crn.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (crl.a(crn.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(cnb.vi) || $$6.a(cnb.vj))) {
                     $$11.d = cfo.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dr(), $$4.dt(), $$4.dx(), ars.ar, art.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(asc.c.b(this));
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
   public int b(cmy $$0) {
      return 72000;
   }

   @Override
   public cos c(cmy $$0) {
      return cos.e;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bkc.d($$3);
      } else {
         $$1.c($$2);
         return bkc.b($$3);
      }
   }

   @Override
   public Predicate<cmy> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
