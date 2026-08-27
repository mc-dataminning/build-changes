import java.util.EnumSet;

public class cfj extends cga {
   private float b = 0.5F;
   private int c;
   private static final aim<Byte> d = aiq.a(cfj.class, aio.a);

   public cfj(bpd<? extends cfj> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.j, -1.0F);
      this.a(ejg.i, 8.0F);
      this.a(ejg.n, 0.0F);
      this.a(ejg.o, 0.0F);
      this.bM = 10;
   }

   @Override
   protected void z() {
      this.bR.a(4, new cfj.a(this));
      this.bR.a(5, new bxa(this, 1.0));
      this.bR.a(7, new bxz(this, 1.0, 0.0F));
      this.bR.a(8, new bwu(this, ciu.class, 8.0F));
      this.bR.a(8, new bxh(this));
      this.bS.a(1, new bye(this).a());
      this.bS.a(2, new byf<>(this, ciu.class, true));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.c, 6.0).a(bqw.r, 0.23F).a(bqw.k, 48.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected atx v() {
      return aty.cg;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.cj;
   }

   @Override
   protected atx n_() {
      return aty.ci;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aC() && this.dp().d < 0.0) {
         this.g(this.dp().d(1.0, 0.6, 1.0));
      }

      if (this.dM().B) {
         if (this.ag.a(24) == 0 && !this.aU()) {
            this.dM().a(this.dr() + 0.5, this.dt() + 0.5, this.dx() + 0.5, aty.ch, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kc.V, this.d(0.5), this.du(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Y() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ag.a(0.5, 6.891);
      }

      bpp $$0 = this.p();
      if ($$0 != null && $$0.dv() > this.dv() + (double)this.b && this.c($$0)) {
         ept $$1 = this.dp();
         this.g(this.dp().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.au = true;
      }

      super.Y();
   }

   @Override
   public boolean bN() {
      return this.s();
   }

   private boolean s() {
      return (this.an.a(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.an.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.a(d, $$1);
   }

   static class a extends bwm {
      private final cfj a;
      private int b;
      private int c;
      private int d;

      public a(cfj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         bpp $$0 = this.a.p();
         return $$0 != null && $$0.bA() && this.a.c($$0);
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
         bpp $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((box)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.H().a($$0.dr(), $$0.dt(), $$0.dx(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dr() - this.a.dr();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dx() - this.a.dx();
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
                     if (!this.a.aU()) {
                        this.a.dM().a(null, 1018, this.a.dm(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cjq $$8 = new cjq(this.a.dM(), this.a, this.a.ei().a($$3, 2.297 * $$6), $$4, this.a.ei().a($$5, 2.297 * $$6));
                        $$8.a_($$8.dr(), this.a.e(0.5) + 0.5, $$8.dx());
                        this.a.dM().b($$8);
                     }
                  }
               }

               this.a.G().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.dr(), $$0.dt(), $$0.dx(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(bqw.k);
      }
   }
}
