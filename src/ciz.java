import java.util.function.Predicate;

public class ciz extends clr implements cmv {
   public static final int a = 20;
   public static final int b = 15;

   public ciz(ckw.a $$0) {
      super($$0);
   }

   @Override
   public void a(clb $$0, crs $$1, bky $$2, int $$3) {
      if ($$2 instanceof cdm $$4) {
         boolean $$5 = $$4.fT().d || cpo.a(cpq.B, $$0) > 0;
         clb $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new clb(cle.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cle.nH);
               if (!$$1.B) {
                  cip $$10 = (cip)($$6.d() instanceof cip ? $$6.d() : cle.nH);
                  cds $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dD(), $$4.dB(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cpo.a(cpq.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.x() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cpo.a(cpq.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cpo.a(cpq.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(cle.uw) || $$6.a(cle.ux))) {
                     $$11.d = cds.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dq(), $$4.ds(), $$4.dw(), aqn.ar, aqo.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(aqx.c.b(this));
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
   public int b(clb $$0) {
      return 72000;
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.e;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bir.d($$3);
      } else {
         $$1.c($$2);
         return bir.b($$3);
      }
   }

   @Override
   public Predicate<clb> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
