import java.util.function.Predicate;

public class clf extends cnw implements cpb {
   public static final int a = 20;
   public static final int b = 15;

   public clf(cnb.a $$0) {
      super($$0);
   }

   @Override
   public void a(cng $$0, ctx $$1, bmo $$2, int $$3) {
      if ($$2 instanceof cfq $$4) {
         boolean $$5 = $$4.fT().d || crt.a(crv.B, $$0) > 0;
         cng $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cng(cnj.ou);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cnj.ou);
               if (!$$1.B) {
                  ckv $$10 = (ckv)($$6.d() instanceof ckv ? $$6.d() : cnj.ou);
                  cfw $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dD(), $$4.dB(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = crt.a(crv.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.z() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = crt.a(crv.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (crt.a(crv.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(cnj.vl) || $$6.a(cnj.vm))) {
                     $$11.d = cfw.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dq(), $$4.ds(), $$4.dw(), art.aD, aru.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(asd.c.b(this));
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
   public int b(cng $$0) {
      return 72000;
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.e;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bkd.d($$3);
      } else {
         $$1.c($$2);
         return bkd.b($$3);
      }
   }

   @Override
   public Predicate<cng> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
