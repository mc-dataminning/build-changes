import java.util.function.Predicate;

public class chd extends cjv implements ckz {
   public static final int a = 20;
   public static final int b = 15;

   public chd(cja.a $$0) {
      super($$0);
   }

   @Override
   public void a(cjf $$0, cpv $$1, bjg $$2, int $$3) {
      if ($$2 instanceof cbu $$4) {
         boolean $$5 = $$4.fS().d || cnq.a(cns.B, $$0) > 0;
         cjf $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cjf(cji.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cji.nH);
               if (!$$1.B) {
                  cgt $$10 = (cgt)($$6.d() instanceof cgt ? $$6.d() : cji.nH);
                  cca $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dD(), $$4.dB(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cnq.a(cns.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.x() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cnq.a(cns.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cnq.a(cns.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fn()));
                  if ($$9 || $$4.fS().d && ($$6.a(cji.uv) || $$6.a(cji.uw))) {
                     $$11.d = cca.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dq(), $$4.ds(), $$4.dw(), ape.ar, apf.h, 1.0F, 1.0F / ($$1.D_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fS().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fR().g($$6);
                  }
               }

               $$4.b(apo.c.b(this));
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
   public int b(cjf $$0) {
      return 72000;
   }

   @Override
   public cky c(cjf $$0) {
      return cky.e;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fS().d && !$$4) {
         return bgz.d($$3);
      } else {
         $$1.c($$2);
         return bgz.b($$3);
      }
   }

   @Override
   public Predicate<cjf> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
