import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eyd extends exy {
   public static final float e = 0.44444445F;

   @Override
   public exz d() {
      return eyb.d;
   }

   @Override
   public exz e() {
      return eyb.e;
   }

   @Override
   public dag a() {
      return dao.rq;
   }

   @Override
   public void a(dkj $$0, iw $$1, eya $$2, bai $$3) {
      iw $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lz.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awy.oy, awz.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awy.ow, awz.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(asb $$0, iw $$1, eya $$2, bai $$3) {
      if ($$0.O().c(dkf.b)) {
         if ($$0.O().c(dkf.c) || $$0.g($$1)) {
            int $$4 = $$3.a(3);
            if ($$4 > 0) {
               iw $$5 = $$1;

               for (int $$6 = 0; $$6 < $$4; $$6++) {
                  $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
                  if (!$$0.p($$5)) {
                     return;
                  }

                  ebq $$7 = $$0.a_($$5);
                  if ($$7.l()) {
                     if (this.a((dkm)$$0, $$5)) {
                        $$0.b($$5, dnb.a($$0, $$5));
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
                     $$0.b($$9.d(), dnb.a($$0, $$9));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dkj $$0, iw $$1, bxe $$2, bxx $$3) {
      $$3.a(bxy.c);
      $$3.b(bxy.c, bxe::aC);
   }

   private boolean a(dkm $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dkm $$0, iw $$1) {
      return $$0.d($$1.v()) && !$$0.C($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lx h() {
      return lz.i;
   }

   @Override
   protected void a(dkk $$0, iw $$1, ebq $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dkm $$0) {
      return $$0.F_().i() ? 4 : 2;
   }

   @Override
   public ebq b(eya $$0) {
      return dnq.K.m().b(dsk.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(exz $$0) {
      return $$0 == eyb.e || $$0 == eyb.d;
   }

   @Override
   public int c(dkm $$0) {
      return $$0.F_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eya $$0, djn $$1, iw $$2, exz $$3, jc $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axs.a);
   }

   @Override
   public int a(dkm $$0) {
      return $$0.F_().i() ? 10 : 30;
   }

   @Override
   public int a(dkj $$0, iw $$1, eya $$2, eya $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.G_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dkk $$0, iw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(asb $$0) {
      return $$0.O().c(dkf.X);
   }

   @Override
   protected void a(dkk $$0, iw $$1, ebq $$2, jc $$3, eya $$4) {
      if ($$3 == jc.a) {
         eya $$5 = $$0.b_($$1);
         if (this.a(axs.b) && $$5.a(axs.a)) {
            if ($$2.b() instanceof dsk) {
               $$0.a($$1, dnq.b.m(), 3);
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
   public Optional<awx> j() {
      return Optional.of(awy.dm);
   }

   public static class a extends eyd {
      @Override
      protected void a(ebr.a<exz, eya> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eya $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eya $$0) {
         return false;
      }
   }

   public static class b extends eyd {
      @Override
      public int d(eya $$0) {
         return 8;
      }

      @Override
      public boolean c(eya $$0) {
         return true;
      }
   }
}
