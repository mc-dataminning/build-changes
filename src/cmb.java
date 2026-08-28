import java.util.EnumSet;

public class cmb extends cms {
   private float a = 0.5F;
   private int b;
   private static final alc<Byte> c = alg.a(cmb.class, ale.a);

   public cmb(bvm<? extends cmb> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.j, -1.0F);
      this.a(eug.i, 8.0F);
      this.a(eug.n, 0.0F);
      this.a(eug.o, 0.0F);
      this.bO = 10;
   }

   @Override
   protected void B() {
      this.bT.a(4, new cmb.a(this));
      this.bT.a(5, new cdn(this, 1.0));
      this.bT.a(7, new cem(this, 1.0, 0.0F));
      this.bT.a(8, new cdh(this, cps.class, 8.0F));
      this.bT.a(8, new cdu(this));
      this.bU.a(1, new cer(this).a());
      this.bU.a(2, new ces<>(this, cps.class, true));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.c, 6.0).a(bxj.v, 0.23F).a(bxj.m, 48.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected axe u() {
      return axf.cg;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.cj;
   }

   @Override
   protected axe o_() {
      return axf.ci;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public void d_() {
      if (!this.aJ() && this.dy().e < 0.0) {
         this.h(this.dy().d(1.0, 0.6, 1.0));
      }

      if (this.dV().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dV().a(this.dA() + 0.5, this.dC() + 0.5, this.dG() + 0.5, axf.ch, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ls.Y, this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bwb $$1 = this.O_();
      if ($$1 != null && $$1.dE() > this.dE() + (double)this.a && this.c($$1)) {
         fbs $$2 = this.dy();
         this.h(this.dy().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.ar = true;
      }

      super.a($$0);
   }

   @Override
   public boolean bY() {
      return this.p();
   }

   private boolean p() {
      return (this.al.a(c) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(c, $$1);
   }

   static class a extends ccz {
      private final cmb a;
      private int b;
      private int c;
      private int d;

      public a(cmb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         bwb $$0 = this.a.O_();
         return $$0 != null && $$0.bL() && this.a.c($$0);
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
         bwb $$0 = this.a.O_();
         if ($$0 != null) {
            boolean $$1 = this.a.N().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bvf)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.I().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dA() - this.a.dA();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dG() - this.a.dG();
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
                     if (!this.a.bb()) {
                        this.a.dV().a(null, 1018, this.a.dv(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        fbs $$8 = new fbs(this.a.dY().a($$3, 2.297 * $$6), $$4, this.a.dY().a($$5, 2.297 * $$6));
                        cqp $$9 = new cqp(this.a.dV(), this.a, $$8.d());
                        $$9.a_($$9.dA(), this.a.e(0.5) + 0.5, $$9.dG());
                        this.a.dV().b($$9);
                     }
                  }
               }

               this.a.H().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.I().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bxj.m);
      }
   }
}
