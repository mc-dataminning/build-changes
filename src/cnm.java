import java.util.EnumSet;

public class cnm extends cod {
   private float a = 0.5F;
   private int b;
   private static final akj<Byte> c = akn.a(cnm.class, akl.a);

   public cnm(bwo<? extends cnm> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, -1.0F);
      this.a(exf.i, 8.0F);
      this.a(exf.n, 0.0F);
      this.a(exf.o, 0.0F);
      this.by = 10;
   }

   @Override
   protected void D() {
      this.bD.a(4, new cnm.a(this));
      this.bD.a(5, new ceo(this, 1.0));
      this.bD.a(7, new cfn(this, 1.0, 0.0F));
      this.bD.a(8, new cei(this, crc.class, 8.0F));
      this.bD.a(8, new cev(this));
      this.bE.a(1, new cfs(this).a());
      this.bE.a(2, new cft<>(this, crc.class, true));
   }

   public static byj.a j() {
      return cod.gu().a(byk.c, 6.0).a(byk.v, 0.23F).a(byk.m, 48.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected awm u() {
      return awn.cg;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.cj;
   }

   @Override
   protected awm l_() {
      return awn.ci;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public void k_() {
      if (!this.aJ() && this.dy().e < 0.0) {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      if (this.dV().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dV().a(this.dA() + 0.5, this.dC() + 0.5, this.dG() + 0.5, awn.ch, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lx.aa, this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.k_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bxe $$1 = this.f();
      if ($$1 != null && $$1.dE() > this.dE() + (double)this.a && this.c($$1)) {
         feq $$2 = this.dy();
         this.i(this.dy().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.ar = true;
      }

      super.a($$0);
   }

   @Override
   public boolean bY() {
      return this.m();
   }

   private boolean m() {
      return (this.al.a(c) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(c, $$1);
   }

   static class a extends cea {
      private final cnm a;
      private int b;
      private int c;
      private int d;

      public a(cnm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         bxe $$0 = this.a.f();
         return $$0 != null && $$0.bK() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.w(false);
         this.d = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bxe $$0 = this.a.f();
         if ($$0 != null) {
            boolean $$1 = this.a.P().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bwf)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.L().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dA() - this.a.dA();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dG() - this.a.dG();
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
                     if (!this.a.bb()) {
                        this.a.dV().a(null, 1018, this.a.dv(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        feq $$8 = new feq(this.a.dY().a($$3, 2.297 * $$6), $$4, this.a.dY().a($$5, 2.297 * $$6));
                        csb $$9 = new csb(this.a.dV(), this.a, $$8.d());
                        $$9.a_($$9.dA(), this.a.e(0.5) + 0.5, $$9.dG());
                        this.a.dV().b($$9);
                     }
                  }
               }

               this.a.J().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.L().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(byk.m);
      }
   }
}
