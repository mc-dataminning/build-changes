import java.util.EnumSet;

public class ciz extends cjq {
   private float b = 0.5F;
   private int c;
   private static final ajp<Byte> d = ajt.a(ciz.class, ajr.a);

   public ciz(bsm<? extends ciz> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, -1.0F);
      this.a(eoy.i, 8.0F);
      this.a(eoy.n, 0.0F);
      this.a(eoy.o, 0.0F);
      this.bP = 10;
   }

   @Override
   protected void z() {
      this.bU.a(4, new ciz.a(this));
      this.bU.a(5, new can(this, 1.0));
      this.bU.a(7, new cbm(this, 1.0, 0.0F));
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cau(this));
      this.bV.a(1, new cbr(this).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.c, 6.0).a(buj.v, 0.23F).a(buj.m, 48.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avg v() {
      return avh.cg;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.cj;
   }

   @Override
   protected avg o_() {
      return avh.ci;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public void n_() {
      if (!this.aF() && this.dt().d < 0.0) {
         this.i(this.dt().d(1.0, 0.6, 1.0));
      }

      if (this.dQ().B) {
         if (this.ah.a(24) == 0 && !this.aX()) {
            this.dQ().a(this.dv() + 0.5, this.dx() + 0.5, this.dB() + 0.5, avh.ch, this.df(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lj.X, this.d(0.5), this.dy(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.n_();
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

      btb $$0 = this.p();
      if ($$0 != null && $$0.dz() > this.dz() + (double)this.b && this.c($$0)) {
         ewf $$1 = this.dt();
         this.i(this.dt().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.Z();
   }

   @Override
   public boolean bR() {
      return this.u();
   }

   private boolean u() {
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

   static class a extends bzz {
      private final ciz a;
      private int b;
      private int c;
      private int d;

      public a(ciz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         btb $$0 = this.a.p();
         return $$0 != null && $$0.bE() && this.a.c($$0);
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
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         btb $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bsg)$$0);
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
                        ewf $$8 = new ewf(this.a.dT().a($$3, 2.297 * $$6), $$4, this.a.dT().a($$5, 2.297 * $$6));
                        cng $$9 = new cng(this.a.dQ(), this.a, $$8.d());
                        $$9.a_($$9.dv(), this.a.e(0.5) + 0.5, $$9.dB());
                        this.a.dQ().b($$9);
                     }
                  }
               }

               this.a.G().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.dv(), $$0.dx(), $$0.dB(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(buj.m);
      }
   }
}
