import java.util.function.Predicate;

public class cih extends ckz implements cmd {
   public static final int a = 20;
   public static final int b = 15;

   public cih(cke.a $$0) {
      super($$0);
   }

   @Override
   public void a(ckj $$0, cqz $$1, bkj $$2, int $$3) {
      if ($$2 instanceof ccx $$4) {
         boolean $$5 = $$4.fT().d || cov.a(cox.B, $$0) > 0;
         ckj $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new ckj(ckm.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(ckm.nH);
               if (!$$1.B) {
                  chx $$10 = (chx)($$6.d() instanceof chx ? $$6.d() : ckm.nH);
                  cdd $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dD(), $$4.dB(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cov.a(cox.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.x() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cov.a(cox.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cov.a(cox.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(ckm.uv) || $$6.a(ckm.uw))) {
                     $$11.d = cdd.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dq(), $$4.ds(), $$4.dw(), aqd.ar, aqe.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(aqn.c.b(this));
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
   public int b(ckj $$0) {
      return 72000;
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.e;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bic.d($$3);
      } else {
         $$1.c($$2);
         return bic.b($$3);
      }
   }

   @Override
   public Predicate<ckj> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
