import java.util.EnumSet;

public class bys extends bzi {
   private float b = 0.5F;
   private int c;
   private static final aee<Byte> d = aeh.a(bys.class, aeg.a);

   public bys(biu<? extends bys> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.j, -1.0F);
      this.a(eax.i, 8.0F);
      this.a(eax.n, 0.0F);
      this.a(eax.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      this.bO.a(4, new bys.a(this));
      this.bO.a(5, new bqp(this, 1.0));
      this.bO.a(7, new bro(this, 1.0, 0.0F));
      this.bO.a(8, new bqj(this, cbu.class, 8.0F));
      this.bO.a(8, new bqw(this));
      this.bP.a(1, new brt(this).a());
      this.bP.a(2, new bru<>(this, cbu.class, true));
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.f, 6.0).a(bkm.d, 0.23F).a(bkm.b, 48.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected apc w() {
      return apd.bR;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.bU;
   }

   @Override
   protected apc l_() {
      return apd.bT;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   public void b_() {
      if (!this.aA() && this.do().d < 0.0) {
         this.f(this.do().d(1.0, 0.6, 1.0));
      }

      if (this.dL().B) {
         if (this.ag.a(24) == 0 && !this.aS()) {
            this.dL().a(this.dq() + 0.5, this.ds() + 0.5, this.dw() + 0.5, apd.bS, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(iv.S, this.d(0.5), this.dt(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.b_();
   }

   @Override
   public boolean ff() {
      return true;
   }

   @Override
   protected void X() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ag.a(0.5, 6.891);
      }

      bjg $$0 = this.q();
      if ($$0 != null && $$0.du() > this.du() + (double)this.b && this.c($$0)) {
         ehn $$1 = this.do();
         this.f(this.do().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.au = true;
      }

      super.X();
   }

   @Override
   public boolean bM() {
      return this.t();
   }

   private boolean t() {
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

   static class a extends bqb {
      private final bys a;
      private int b;
      private int c;
      private int d;

      public a(bys $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         bjg $$0 = this.a.q();
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
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         bjg $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((biq)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.I().a($$0.dq(), $$0.ds(), $$0.dw(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dq() - this.a.dq();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dw() - this.a.dw();
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
                        this.a.dL().a(null, 1018, this.a.dl(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ccp $$8 = new ccp(this.a.dL(), this.a, this.a.ef().a($$3, 2.297 * $$6), $$4, this.a.ef().a($$5, 2.297 * $$6));
                        $$8.e($$8.dq(), this.a.e(0.5) + 0.5, $$8.dw());
                        this.a.dL().b($$8);
                     }
                  }
               }

               this.a.G().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.I().a($$0.dq(), $$0.ds(), $$0.dw(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bkm.b);
      }
   }
}
