import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ext extends exo {
   public static final float e = 0.44444445F;

   @Override
   public exp d() {
      return exr.d;
   }

   @Override
   public exp e() {
      return exr.e;
   }

   @Override
   public czw a() {
      return dae.rq;
   }

   @Override
   public void a(djz $$0, iw $$1, exq $$2, azz $$3) {
      iw $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lz.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awr.oy, aws.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awr.ow, aws.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(aru $$0, iw $$1, exq $$2, azz $$3) {
      if ($$0.O().c(djv.b)) {
         if ($$0.O().c(djv.c) || $$0.g($$1)) {
            int $$4 = $$3.a(3);
            if ($$4 > 0) {
               iw $$5 = $$1;

               for (int $$6 = 0; $$6 < $$4; $$6++) {
                  $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
                  if (!$$0.p($$5)) {
                     return;
                  }

                  ebg $$7 = $$0.a_($$5);
                  if ($$7.l()) {
                     if (this.a((dkc)$$0, $$5)) {
                        $$0.b($$5, dmr.a($$0, $$5));
                        return;
                     }
                  } else if ($$7.d()) {
                     return;
                  }
               }
            } else {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iw $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
                  if (!$$0.p($$9)) {
                     return;
                  }

                  if ($$0.v($$9.d()) && this.b($$0, $$9)) {
                     $$0.b($$9.d(), dmr.a($$0, $$9));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(djz $$0, iw $$1, bwv $$2, bxo $$3) {
      $$3.a(bxp.c);
      $$3.b(bxp.c, bwv::aC);
   }

   private boolean a(dkc $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dkc $$0, iw $$1) {
      return $$0.d($$1.v()) && !$$0.C($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lx h() {
      return lz.i;
   }

   @Override
   protected void a(dka $$0, iw $$1, ebg $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dkc $$0) {
      return $$0.F_().i() ? 4 : 2;
   }

   @Override
   public ebg b(exq $$0) {
      return dng.K.m().b(dsa.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(exp $$0) {
      return $$0 == exr.e || $$0 == exr.d;
   }

   @Override
   public int c(dkc $$0) {
      return $$0.F_().i() ? 1 : 2;
   }

   @Override
   public boolean a(exq $$0, djd $$1, iw $$2, exp $$3, jc $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axl.a);
   }

   @Override
   public int a(dkc $$0) {
      return $$0.F_().i() ? 10 : 30;
   }

   @Override
   public int a(djz $$0, iw $$1, exq $$2, exq $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.G_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dka $$0, iw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(aru $$0) {
      return $$0.O().c(djv.X);
   }

   @Override
   protected void a(dka $$0, iw $$1, ebg $$2, jc $$3, exq $$4) {
      if ($$3 == jc.a) {
         exq $$5 = $$0.b_($$1);
         if (this.a(axl.b) && $$5.a(axl.a)) {
            if ($$2.b() instanceof dsa) {
               $$0.a($$1, dng.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awq> j() {
      return Optional.of(awr.dm);
   }

   public static class a extends ext {
      @Override
      protected void a(ebh.a<exp, exq> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(exq $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(exq $$0) {
         return false;
      }
   }

   public static class b extends ext {
      @Override
      public int d(exq $$0) {
         return 8;
      }

      @Override
      public boolean c(exq $$0) {
         return true;
      }
   }
}
