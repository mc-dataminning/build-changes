import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewy extends ewt {
   public static final float e = 0.44444445F;

   @Override
   public ewu d() {
      return eww.d;
   }

   @Override
   public ewu e() {
      return eww.e;
   }

   @Override
   public czg a() {
      return czo.rq;
   }

   @Override
   public void a(djh $$0, iv $$1, ewv $$2, azv $$3) {
      iv $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ly.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awn.oy, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.ow, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arq $$0, iv $$1, ewv $$2, azv $$3) {
      if ($$0.O().c(djd.b)) {
         if ($$0.O().c(djd.c) || $$0.g($$1)) {
            int $$4 = $$3.a(3);
            if ($$4 > 0) {
               iv $$5 = $$1;

               for (int $$6 = 0; $$6 < $$4; $$6++) {
                  $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
                  if (!$$0.p($$5)) {
                     return;
                  }

                  eao $$7 = $$0.a_($$5);
                  if ($$7.l()) {
                     if (this.a((djk)$$0, $$5)) {
                        $$0.b($$5, dlz.a($$0, $$5));
                        return;
                     }
                  } else if ($$7.d()) {
                     return;
                  }
               }
            } else {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iv $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
                  if (!$$0.p($$9)) {
                     return;
                  }

                  if ($$0.v($$9.d()) && this.b($$0, $$9)) {
                     $$0.b($$9.d(), dlz.a($$0, $$9));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(djh $$0, iv $$1, bwi $$2, bxb $$3) {
      $$3.a(bxc.c);
      $$3.b(bxc.c, bwi::aC);
   }

   private boolean a(djk $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(djk $$0, iv $$1) {
      return $$0.d($$1.v()) && !$$0.C($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lw h() {
      return ly.i;
   }

   @Override
   protected void a(dji $$0, iv $$1, eao $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(djk $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public eao b(ewv $$0) {
      return dmo.K.m().b(dri.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewu $$0) {
      return $$0 == eww.e || $$0 == eww.d;
   }

   @Override
   public int c(djk $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ewv $$0, din $$1, iv $$2, ewu $$3, jb $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axh.a);
   }

   @Override
   public int a(djk $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(djh $$0, iv $$1, ewv $$2, ewv $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dji $$0, iv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(djd.X);
   }

   @Override
   protected void a(dji $$0, iv $$1, eao $$2, jb $$3, ewv $$4) {
      if ($$3 == jb.a) {
         ewv $$5 = $$0.b_($$1);
         if (this.a(axh.b) && $$5.a(axh.a)) {
            if ($$2.b() instanceof dri) {
               $$0.a($$1, dmo.b.m(), 3);
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
   public Optional<awm> j() {
      return Optional.of(awn.dm);
   }

   public static class a extends ewy {
      @Override
      protected void a(eap.a<ewu, ewv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ewv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ewv $$0) {
         return false;
      }
   }

   public static class b extends ewy {
      @Override
      public int d(ewv $$0) {
         return 8;
      }

      @Override
      public boolean c(ewv $$0) {
         return true;
      }
   }
}
