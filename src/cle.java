import java.util.EnumSet;

public class cle extends clv {
   private float b = 0.5F;
   private int c;
   private static final ako<Byte> d = aks.a(cle.class, akq.a);

   public cle(bup<? extends cle> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, -1.0F);
      this.a(esf.i, 8.0F);
      this.a(esf.n, 0.0F);
      this.a(esf.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void D() {
      this.bS.a(4, new cle.a(this));
      this.bS.a(5, new ccq(this, 1.0));
      this.bS.a(7, new cdp(this, 1.0, 0.0F));
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new ccx(this));
      this.bT.a(1, new cdu(this).a());
      this.bT.a(2, new cdv<>(this, cor.class, true));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.c, 6.0).a(bwm.v, 0.23F).a(bwm.m, 48.0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected awn w() {
      return awo.cg;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.cj;
   }

   @Override
   protected awn o_() {
      return awo.ci;
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Override
   public void n_() {
      if (!this.aL() && this.dB().e < 0.0) {
         this.h(this.dB().d(1.0, 0.6, 1.0));
      }

      if (this.dY().C) {
         if (this.af.a(24) == 0 && !this.bd()) {
            this.dY().a(this.dD() + 0.5, this.dF() + 0.5, this.dJ() + 0.5, awo.ch, this.do(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dY().a(ls.X, this.d(0.5), this.dG(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.n_();
   }

   @Override
   public boolean fu() {
      return true;
   }

   @Override
   protected void ac() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      bve $$0 = this.m();
      if ($$0 != null && $$0.dH() > this.dH() + (double)this.b && this.c($$0)) {
         ezr $$1 = this.dB();
         this.h(this.dB().b(0.0, (0.3F - $$1.e) * 0.3F, 0.0));
         this.as = true;
      }

      super.ac();
   }

   @Override
   public boolean ca() {
      return this.t();
   }

   private boolean t() {
      return (this.am.a(d) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.am.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.a(d, $$1);
   }

   static class a extends ccc {
      private final cle a;
      private int b;
      private int c;
      private int d;

      public a(cle $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         bve $$0 = this.a.m();
         return $$0 != null && $$0.bN() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.x(false);
         this.d = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bve $$0 = this.a.m();
         if ($$0 != null) {
            boolean $$1 = this.a.Q().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bui)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.E($$0);
               }

               this.a.M().a($$0.dD(), $$0.dF(), $$0.dJ(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dD() - this.a.dD();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dJ() - this.a.dJ();
               if (this.c <= 0) {
                  this.b++;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.x(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.x(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.bd()) {
                        this.a.dY().a(null, 1018, this.a.dy(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ezr $$8 = new ezr(this.a.eb().a($$3, 2.297 * $$6), $$4, this.a.eb().a($$5, 2.297 * $$6));
                        cpo $$9 = new cpo(this.a.dY(), this.a, $$8.d());
                        $$9.a_($$9.dD(), this.a.e(0.5) + 0.5, $$9.dJ());
                        this.a.dY().b($$9);
                     }
                  }
               }

               this.a.K().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.M().a($$0.dD(), $$0.dF(), $$0.dJ(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bwm.m);
      }
   }
}
