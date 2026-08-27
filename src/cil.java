import java.util.EnumSet;

public class cil extends cjd {
   private float b = 0.5F;
   private int c;
   private static final ajy<Byte> d = akc.a(cil.class, aka.a);

   public cil(bsb<? extends cil> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, -1.0F);
      this.a(epv.i, 8.0F);
      this.a(epv.n, 0.0F);
      this.a(epv.o, 0.0F);
      this.bW = 10;
   }

   @Override
   protected void y() {
      this.cb.a(4, new cil.a(this));
      this.cb.a(5, new bzz(this, 1.0));
      this.cb.a(7, new cay(this, 1.0, 0.0F));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
      this.cc.a(1, new cbd(this).a());
      this.cc.a(2, new cbe<>(this, cly.class, true));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.c, 6.0).a(btv.r, 0.23F).a(btv.k, 48.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avn u() {
      return avo.cl;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.co;
   }

   @Override
   protected avn n_() {
      return avo.cn;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aE() && this.dx().d < 0.0) {
         this.g(this.dx().d(1.0, 0.6, 1.0));
      }

      if (this.dU().C) {
         if (this.al.a(24) == 0 && !this.ba()) {
            this.dU().a(this.dz() + 0.5, this.dB() + 0.5, this.dF() + 0.5, avo.cm, this.dj(), 1.0F + this.al.i(), this.al.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(lb.V, this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fy() {
      return true;
   }

   @Override
   protected void Y() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.al.a(0.5, 6.891);
      }

      bso $$0 = this.p();
      if ($$0 != null && $$0.dD() > this.dD() + (double)this.b && this.c($$0)) {
         ewu $$1 = this.dx();
         this.g(this.dx().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.az = true;
      }

      super.Y();
   }

   @Override
   public boolean bV() {
      return this.t();
   }

   private boolean t() {
      return (this.as.a(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.as.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.as.a(d, $$1);
   }

   static class a extends bzl {
      private final cil a;
      private int b;
      private int c;
      private int d;

      public a(cil $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.a.p();
         return $$0 != null && $$0.bI() && this.a.c($$0);
      }

      @Override
      public void c() {
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.w(false);
         this.d = 0;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         bso $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.K().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((brv)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.G().a($$0.dz(), $$0.dB(), $$0.dF(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dz() - this.a.dz();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dF() - this.a.dF();
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
                     if (!this.a.ba()) {
                        this.a.dU().a(null, 1018, this.a.du(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cmw $$8 = new cmw(this.a.dU(), this.a, this.a.et().a($$3, 2.297 * $$6), $$4, this.a.et().a($$5, 2.297 * $$6));
                        $$8.a_($$8.dz(), this.a.e(0.5) + 0.5, $$8.dF());
                        this.a.dU().b($$8);
                     }
                  }
               }

               this.a.F().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.G().a($$0.dz(), $$0.dB(), $$0.dF(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(btv.k);
      }
   }
}
