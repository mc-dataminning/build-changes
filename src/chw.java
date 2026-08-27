import java.util.EnumSet;

public class chw extends cin {
   private float b = 0.5F;
   private int c;
   private static final ajm<Byte> d = ajq.a(chw.class, ajo.a);

   public chw(brn<? extends chw> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, -1.0F);
      this.a(emr.i, 8.0F);
      this.a(emr.n, 0.0F);
      this.a(emr.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void z() {
      this.bS.a(4, new chw.a(this));
      this.bS.a(5, new bzl(this, 1.0));
      this.bS.a(7, new cak(this, 1.0, 0.0F));
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzs(this));
      this.bT.a(1, new cap(this).a());
      this.bT.a(2, new caq<>(this, clh.class, true));
   }

   public static btg.a r() {
      return cin.gv().a(bth.c, 6.0).a(bth.r, 0.23F).a(bth.k, 48.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avb v() {
      return avc.cg;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.cj;
   }

   @Override
   protected avb o_() {
      return avc.ci;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   public void n_() {
      if (!this.aC() && this.dq().d < 0.0) {
         this.g(this.dq().d(1.0, 0.6, 1.0));
      }

      if (this.dN().B) {
         if (this.ah.a(24) == 0 && !this.aU()) {
            this.dN().a(this.ds() + 0.5, this.du() + 0.5, this.dy() + 0.5, avc.ch, this.dc(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(kx.U, this.d(0.5), this.dv(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.n_();
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   protected void Y() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ah.a(0.5, 6.891);
      }

      bsa $$0 = this.p();
      if ($$0 != null && $$0.dw() > this.dw() + (double)this.b && this.c($$0)) {
         etp $$1 = this.dq();
         this.g(this.dq().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.Y();
   }

   @Override
   public boolean bO() {
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

   static class a extends byx {
      private final chw a;
      private int b;
      private int c;
      private int d;

      public a(chw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         bsa $$0 = this.a.p();
         return $$0 != null && $$0.bB() && this.a.c($$0);
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
         bsa $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((brh)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.H().a($$0.ds(), $$0.du(), $$0.dy(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.ds() - this.a.ds();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dy() - this.a.dy();
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
                        this.a.dN().a(null, 1018, this.a.dn(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cmd $$8 = new cmd(this.a.dN(), this.a, this.a.ej().a($$3, 2.297 * $$6), $$4, this.a.ej().a($$5, 2.297 * $$6));
                        $$8.a_($$8.ds(), this.a.e(0.5) + 0.5, $$8.dy());
                        this.a.dN().b($$8);
                     }
                  }
               }

               this.a.G().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.ds(), $$0.du(), $$0.dy(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(bth.k);
      }
   }
}
