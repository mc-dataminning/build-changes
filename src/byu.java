import java.util.EnumSet;

public class byu extends bzk {
   private float b = 0.5F;
   private int c;
   private static final aeg<Byte> d = aej.a(byu.class, aei.a);

   public byu(biw<? extends byu> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.j, -1.0F);
      this.a(eaz.i, 8.0F);
      this.a(eaz.n, 0.0F);
      this.a(eaz.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      this.bO.a(4, new byu.a(this));
      this.bO.a(5, new bqr(this, 1.0));
      this.bO.a(7, new brq(this, 1.0, 0.0F));
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bqy(this));
      this.bP.a(1, new brv(this).a());
      this.bP.a(2, new brw<>(this, cbw.class, true));
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.f, 6.0).a(bko.d, 0.23F).a(bko.b, 48.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected ape w() {
      return apf.bR;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.bU;
   }

   @Override
   protected ape l_() {
      return apf.bT;
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
            this.dL().a(this.dq() + 0.5, this.ds() + 0.5, this.dw() + 0.5, apf.bS, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(ix.S, this.d(0.5), this.dt(), this.g(0.5), 0.0, 0.0, 0.0);
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

      bji $$0 = this.q();
      if ($$0 != null && $$0.du() > this.du() + (double)this.b && this.c($$0)) {
         ehp $$1 = this.do();
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

   static class a extends bqd {
      private final byu a;
      private int b;
      private int c;
      private int d;

      public a(byu $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         bji $$0 = this.a.q();
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
         bji $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bis)$$0);
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
                        ccr $$8 = new ccr(this.a.dL(), this.a, this.a.ef().a($$3, 2.297 * $$6), $$4, this.a.ef().a($$5, 2.297 * $$6));
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
         return this.a.b(bko.b);
      }
   }
}
