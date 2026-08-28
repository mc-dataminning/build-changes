import java.util.EnumSet;

public class cjk extends ckb {
   private float b = 0.5F;
   private int c;
   private static final ajv<Byte> d = ajz.a(cjk.class, ajx.a);

   public cjk(bsw<? extends cjk> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, -1.0F);
      this.a(epp.i, 8.0F);
      this.a(epp.n, 0.0F);
      this.a(epp.o, 0.0F);
      this.bP = 10;
   }

   @Override
   protected void z() {
      this.bU.a(4, new cjk.a(this));
      this.bU.a(5, new cay(this, 1.0));
      this.bU.a(7, new cbx(this, 1.0, 0.0F));
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cbf(this));
      this.bV.a(1, new ccc(this).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true));
   }

   public static but.a s() {
      return ckb.gs().a(buu.c, 6.0).a(buu.v, 0.23F).a(buu.m, 48.0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avn v() {
      return avo.cg;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.cj;
   }

   @Override
   protected avn n_() {
      return avo.ci;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aF() && this.dt().d < 0.0) {
         this.i(this.dt().d(1.0, 0.6, 1.0));
      }

      if (this.dQ().B) {
         if (this.ah.a(24) == 0 && !this.aX()) {
            this.dQ().a(this.dv() + 0.5, this.dx() + 0.5, this.dB() + 0.5, avo.ch, this.df(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lm.X, this.d(0.5), this.dy(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Z() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ah.a(0.5, 6.891);
      }

      btl $$0 = this.p();
      if ($$0 != null && $$0.dz() > this.dz() + (double)this.b && this.c($$0)) {
         eww $$1 = this.dt();
         this.i(this.dt().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.Z();
   }

   @Override
   public boolean bR() {
      return this.t();
   }

   private boolean t() {
      return (this.ao.a(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.ao.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ao.a(d, $$1);
   }

   static class a extends cak {
      private final cjk a;
      private int b;
      private int c;
      private int d;

      public a(cjk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         btl $$0 = this.a.p();
         return $$0 != null && $$0.bE() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.w(false);
         this.d = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         btl $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.L().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bsq)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.D($$0);
               }

               this.a.H().a($$0.dv(), $$0.dx(), $$0.dB(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dv() - this.a.dv();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dB() - this.a.dB();
               if (this.c <= 0) {
                  this.b++;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.w(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.w(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.aX()) {
                        this.a.dQ().a(null, 1018, this.a.dq(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        eww $$8 = new eww(this.a.dT().a($$3, 2.297 * $$6), $$4, this.a.dT().a($$5, 2.297 * $$6));
                        cnr $$9 = new cnr(this.a.dQ(), this.a, $$8.d());
                        $$9.a_($$9.dv(), this.a.e(0.5) + 0.5, $$9.dB());
                        this.a.dQ().b($$9);
                     }
                  }
               }

               this.a.F().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.dv(), $$0.dx(), $$0.dB(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.g(buu.m);
      }
   }
}
