import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqw extends eqr {
   public static final float e = 0.44444445F;

   @Override
   public eqs d() {
      return equ.d;
   }

   @Override
   public eqs e() {
      return equ.e;
   }

   @Override
   public cvn a() {
      return cvw.qB;
   }

   @Override
   public void a(dej $$0, jf $$1, eqt $$2, azn $$3) {
      jf $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lo.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awg.nS, awh.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awg.nQ, awh.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dej $$0, jf $$1, eqt $$2, azn $$3) {
      if ($$0.ac().b(def.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jf $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dus $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dem)$$0, $$5)) {
                     $$0.b($$5, dgz.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jf $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dgz.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dem $$0, jf $$1) {
      for (jk $$2 : jk.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dem $$0, jf $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lm h() {
      return lo.i;
   }

   @Override
   protected void a(dek $$0, jf $$1, dus $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dem $$0) {
      return $$0.C_().i() ? 4 : 2;
   }

   @Override
   public dus b(eqt $$0) {
      return dho.H.n().b(dmc.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqs $$0) {
      return $$0 == equ.e || $$0 == equ.d;
   }

   @Override
   public int c(dem $$0) {
      return $$0.C_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eqt $$0, ddo $$1, jf $$2, eqs $$3, jk $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axb.a);
   }

   @Override
   public int a(dem $$0) {
      return $$0.C_().i() ? 10 : 30;
   }

   @Override
   public int a(dej $$0, jf $$1, eqt $$2, eqt $$3) {
      int $$4 = this.a((dem)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.D_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dek $$0, jf $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dej $$0) {
      return $$0.ac().b(def.V);
   }

   @Override
   protected void a(dek $$0, jf $$1, dus $$2, jk $$3, eqt $$4) {
      if ($$3 == jk.a) {
         eqt $$5 = $$0.b_($$1);
         if (this.a(axb.b) && $$5.a(axb.a)) {
            if ($$2.b() instanceof dmc) {
               $$0.a($$1, dho.b.n(), 3);
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
   public Optional<awf> j() {
      return Optional.of(awg.dl);
   }

   public static class a extends eqw {
      @Override
      protected void a(dut.a<eqs, eqt> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eqt $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eqt $$0) {
         return false;
      }
   }

   public static class b extends eqw {
      @Override
      public int d(eqt $$0) {
         return 8;
      }

      @Override
      public boolean c(eqt $$0) {
         return true;
      }
   }
}
