import java.util.function.Predicate;

public class chj extends ckb implements clf {
   public static final int a = 20;
   public static final int b = 15;

   public chj(cjg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cjl $$0, cqb $$1, bjm $$2, int $$3) {
      if ($$2 instanceof cca $$4) {
         boolean $$5 = $$4.fT().d || cnw.a(cny.B, $$0) > 0;
         cjl $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cjl(cjo.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cjo.nH);
               if (!$$1.B) {
                  cgz $$10 = (cgz)($$6.d() instanceof cgz ? $$6.d() : cjo.nH);
                  ccg $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dD(), $$4.dB(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cnw.a(cny.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.x() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cnw.a(cny.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cnw.a(cny.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(cjo.uv) || $$6.a(cjo.uw))) {
                     $$11.d = ccg.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dq(), $$4.ds(), $$4.dw(), apg.ar, aph.h, 1.0F, 1.0F / ($$1.D_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(apq.c.b(this));
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
   public int b(cjl $$0) {
      return 72000;
   }

   @Override
   public cle c(cjl $$0) {
      return cle.e;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bhf.d($$3);
      } else {
         $$1.c($$2);
         return bhf.b($$3);
      }
   }

   @Override
   public Predicate<cjl> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
