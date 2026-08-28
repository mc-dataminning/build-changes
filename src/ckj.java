import java.util.EnumSet;

public class ckj extends cla {
   private float b = 0.5F;
   private int c;
   private static final akg<Byte> d = akk.a(ckj.class, aki.a);

   public ckj(btv<? extends ckj> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.j, -1.0F);
      this.a(erg.i, 8.0F);
      this.a(erg.n, 0.0F);
      this.a(erg.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void D() {
      this.bS.a(4, new ckj.a(this));
      this.bS.a(5, new cbv(this, 1.0));
      this.bS.a(7, new ccu(this, 1.0, 0.0F));
      this.bS.a(8, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new ccc(this));
      this.bT.a(1, new ccz(this).a());
      this.bT.a(2, new cda<>(this, cnu.class, true));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.c, 6.0).a(bvr.v, 0.23F).a(bvr.m, 48.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected awd w() {
      return awe.cg;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.cj;
   }

   @Override
   protected awd n_() {
      return awe.ci;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aH() && this.dv().e < 0.0) {
         this.h(this.dv().d(1.0, 0.6, 1.0));
      }

      if (this.dS().B) {
         if (this.af.a(24) == 0 && !this.ba()) {
            this.dS().a(this.dx() + 0.5, this.dz() + 0.5, this.dD() + 0.5, awe.ch, this.di(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dS().a(ln.X, this.d(0.5), this.dA(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   protected void ad() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      buk $$0 = this.m();
      if ($$0 != null && $$0.dB() > this.dB() + (double)this.b && this.c($$0)) {
         eys $$1 = this.dv();
         this.h(this.dv().b(0.0, (0.3F - $$1.e) * 0.3F, 0.0));
         this.as = true;
      }

      super.ad();
   }

   @Override
   public boolean bV() {
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

   static class a extends cbh {
      private final ckj a;
      private int b;
      private int c;
      private int d;

      public a(ckj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         buk $$0 = this.a.m();
         return $$0 != null && $$0.bI() && this.a.c($$0);
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
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         buk $$0 = this.a.m();
         if ($$0 != null) {
            boolean $$1 = this.a.Q().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bto)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.E($$0);
               }

               this.a.M().a($$0.dx(), $$0.dz(), $$0.dD(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dx() - this.a.dx();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dD() - this.a.dD();
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
                     if (!this.a.ba()) {
                        this.a.dS().a(null, 1018, this.a.ds(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        eys $$8 = new eys(this.a.dV().a($$3, 2.297 * $$6), $$4, this.a.dV().a($$5, 2.297 * $$6));
                        cos $$9 = new cos(this.a.dS(), this.a, $$8.d());
                        $$9.a_($$9.dx(), this.a.e(0.5) + 0.5, $$9.dD());
                        this.a.dS().b($$9);
                     }
                  }
               }

               this.a.K().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.M().a($$0.dx(), $$0.dz(), $$0.dD(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bvr.m);
      }
   }
}
