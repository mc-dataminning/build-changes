import java.util.EnumSet;

public class cja extends cjr {
   private float b = 0.5F;
   private int c;
   private static final ajp<Byte> d = ajt.a(cja.class, ajr.a);

   public cja(bsn<? extends cja> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, -1.0F);
      this.a(epa.i, 8.0F);
      this.a(epa.n, 0.0F);
      this.a(epa.o, 0.0F);
      this.bP = 10;
   }

   @Override
   protected void z() {
      this.bU.a(4, new cja.a(this));
      this.bU.a(5, new cao(this, 1.0));
      this.bU.a(7, new cbn(this, 1.0, 0.0F));
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cav(this));
      this.bV.a(1, new cbs(this).a());
      this.bV.a(2, new cbt<>(this, cml.class, true));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.c, 6.0).a(buk.v, 0.23F).a(buk.m, 48.0);
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
   protected avg d(bra $$0) {
      return avh.cj;
   }

   @Override
   protected avg n_() {
      return avh.ci;
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aG() && this.du().d < 0.0) {
         this.j(this.du().d(1.0, 0.6, 1.0));
      }

      if (this.dR().B) {
         if (this.ah.a(24) == 0 && !this.aY()) {
            this.dR().a(this.dw() + 0.5, this.dy() + 0.5, this.dC() + 0.5, avh.ch, this.dg(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dR().a(lj.X, this.d(0.5), this.dz(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   protected void Z() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ah.a(0.5, 6.891);
      }

      btc $$0 = this.p();
      if ($$0 != null && $$0.dA() > this.dA() + (double)this.b && this.c($$0)) {
         ewh $$1 = this.du();
         this.j(this.du().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.Z();
   }

   @Override
   public boolean bS() {
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

   static class a extends caa {
      private final cja a;
      private int b;
      private int c;
      private int d;

      public a(cja $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         btc $$0 = this.a.p();
         return $$0 != null && $$0.bF() && this.a.c($$0);
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
         btc $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.L().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bsh)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.D($$0);
               }

               this.a.H().a($$0.dw(), $$0.dy(), $$0.dC(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dw() - this.a.dw();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dC() - this.a.dC();
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
                     if (!this.a.aY()) {
                        this.a.dR().a(null, 1018, this.a.dr(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ewh $$8 = new ewh(this.a.dU().a($$3, 2.297 * $$6), $$4, this.a.dU().a($$5, 2.297 * $$6));
                        cnh $$9 = new cnh(this.a.dR(), this.a, $$8.d());
                        $$9.a_($$9.dw(), this.a.e(0.5) + 0.5, $$9.dC());
                        this.a.dR().b($$9);
                     }
                  }
               }

               this.a.F().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.dw(), $$0.dy(), $$0.dC(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(buk.m);
      }
   }
}
