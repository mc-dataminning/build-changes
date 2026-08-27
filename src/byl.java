import java.util.EnumSet;

public class byl extends bzb {
   private float b = 0.5F;
   private int c;
   private static final adz<Byte> d = aec.a(byl.class, aeb.a);

   public byl(bim<? extends byl> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.j, -1.0F);
      this.a(eao.i, 8.0F);
      this.a(eao.n, 0.0F);
      this.a(eao.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void w() {
      this.bO.a(4, new byl.a(this));
      this.bO.a(5, new bqi(this, 1.0));
      this.bO.a(7, new brh(this, 1.0, 0.0F));
      this.bO.a(8, new bqc(this, cbn.class, 8.0F));
      this.bO.a(8, new bqp(this));
      this.bP.a(1, new brm(this).a());
      this.bP.a(2, new brn<>(this, cbn.class, true));
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.f, 6.0).a(bkf.d, 0.23F).a(bkf.b, 48.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected aov r() {
      return aow.bR;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.bU;
   }

   @Override
   protected aov h_() {
      return aow.bT;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   public void b_() {
      if (!this.aA() && this.dn().d < 0.0) {
         this.f(this.dn().d(1.0, 0.6, 1.0));
      }

      if (this.dK().B) {
         if (this.ag.a(24) == 0 && !this.aS()) {
            this.dK().a(this.dp() + 0.5, this.dr() + 0.5, this.dv() + 0.5, aow.bS, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dK().a(iv.S, this.d(0.5), this.ds(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.b_();
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   protected void V() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ag.a(0.5, 6.891);
      }

      biy $$0 = this.j();
      if ($$0 != null && $$0.dt() > this.dt() + (double)this.b && this.c($$0)) {
         ehe $$1 = this.dn();
         this.f(this.dn().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.au = true;
      }

      super.V();
   }

   @Override
   public boolean bM() {
      return this.q();
   }

   private boolean q() {
      return (this.an.b(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.an.b(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.b(d, $$1);
   }

   static class a extends bpu {
      private final byl a;
      private int b;
      private int c;
      private int d;

      public a(byl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpu.a.a, bpu.a.b));
      }

      @Override
      public boolean a() {
         biy $$0 = this.a.j();
         return $$0 != null && $$0.bv() && this.a.c($$0);
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
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         biy $$0 = this.a.j();
         if ($$0 != null) {
            boolean $$1 = this.a.J().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bii)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.E().a($$0.dp(), $$0.dr(), $$0.dv(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dp() - this.a.dp();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dv() - this.a.dv();
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
                     if (!this.a.aS()) {
                        this.a.dK().a(null, 1018, this.a.dk(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cci $$8 = new cci(this.a.dK(), this.a, this.a.ee().a($$3, 2.297 * $$6), $$4, this.a.ee().a($$5, 2.297 * $$6));
                        $$8.e($$8.dp(), this.a.e(0.5) + 0.5, $$8.dv());
                        this.a.dK().b($$8);
                     }
                  }
               }

               this.a.D().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.E().a($$0.dp(), $$0.dr(), $$0.dv(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bkf.b);
      }
   }
}
