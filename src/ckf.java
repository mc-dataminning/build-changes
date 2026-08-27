import java.util.function.Predicate;

public class ckf extends cmx implements cob {
   public static final int a = 20;
   public static final int b = 15;

   public ckf(cmc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmh $$0, csy $$1, blv $$2, int $$3) {
      if ($$2 instanceof cer $$4) {
         boolean $$5 = $$4.fT().d || cqu.a(cqw.B, $$0) > 0;
         cmh $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cmh(cmk.os);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cmk.os);
               if (!$$1.B) {
                  cjv $$10 = (cjv)($$6.d() instanceof cjv ? $$6.d() : cmk.os);
                  cex $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dE(), $$4.dC(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cqu.a(cqw.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.A() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cqu.a(cqw.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cqu.a(cqw.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fo()));
                  if ($$9 || $$4.fT().d && ($$6.a(cmk.vi) || $$6.a(cmk.vj))) {
                     $$11.d = cex.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dr(), $$4.dt(), $$4.dx(), arc.ar, ard.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fT().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fS().g($$6);
                  }
               }

               $$4.b(arm.c.b(this));
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
   public int b(cmh $$0) {
      return 72000;
   }

   @Override
   public coa c(cmh $$0) {
      return coa.e;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fT().d && !$$4) {
         return bjm.d($$3);
      } else {
         $$1.c($$2);
         return bjm.b($$3);
      }
   }

   @Override
   public Predicate<cmh> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
