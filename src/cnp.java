import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnp extends cnt {
   protected static final int b = 80;
   private static final akh<Boolean> a = akl.a(cnp.class, akj.k);
   private static final akh<Integer> d = akl.a(cnp.class, akj.b);
   private float bF;
   private float bG;
   private float bH;
   private float bI;
   private float bJ;
   @Nullable
   private bwz bK;
   private int bL;
   private boolean bM;
   @Nullable
   protected ces c;

   public cnp(bwj<? extends cnp> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 10;
      this.a(ewm.j, 0.0F);
      this.bz = new cnp.c(this);
      this.bF = this.ae.i();
      this.bG = this.bF;
   }

   @Override
   protected void D() {
      cej $$0 = new cej(this, 1.0);
      this.c = new ces(this, 1.0, 80);
      this.bC.a(4, new cnp.a(this));
      this.bC.a(5, $$0);
      this.bC.a(7, this.c);
      this.bC.a(8, new ced(this, cqs.class, 8.0F));
      this.bC.a(8, new ced(this, cnp.class, 12.0F, 0.01F));
      this.bC.a(9, new ceq(this));
      this.c.a(EnumSet.of(cdv.a.a, cdv.a.b));
      $$0.a(EnumSet.of(cdv.a.a, cdv.a.b));
      this.bD.a(1, new cfo<>(this, bwz.class, 10, true, false, new cnp.b(this)));
   }

   public static bye.a q() {
      return cnt.gt().a(byf.c, 6.0).a(byf.v, 0.5).a(byf.s, 30.0);
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgl(this, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean t() {
      return this.al.a(a);
   }

   void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return 80;
   }

   void b(int $$0) {
      this.al.a(d, $$0);
   }

   public boolean x() {
      return this.al.a(d) != 0;
   }

   @Nullable
   public bwz gq() {
      if (!this.x()) {
         return null;
      } else if (this.dV().C) {
         if (this.bK != null) {
            return this.bK;
         } else {
            bwa $$0 = this.dV().a(this.al.a(d));
            if ($$0 instanceof bwz) {
               this.bK = (bwz)$$0;
               return this.bK;
            } else {
               return null;
            }
         }
      } else {
         return this.f();
      }
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.bL = 0;
         this.bK = null;
      }
   }

   @Override
   public int S() {
      return 160;
   }

   @Override
   protected awk u() {
      return this.bj() ? awl.lO : awl.lP;
   }

   @Override
   protected awk e(bup $$0) {
      return this.bj() ? awl.lU : awl.lV;
   }

   @Override
   protected awk l_() {
      return this.bj() ? awl.lR : awl.lS;
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return $$1.b_($$0).a(axf.a) ? 10.0F + $$1.x($$0) : super.a($$0, $$1);
   }

   @Override
   public void k_() {
      if (this.bK()) {
         if (this.dV().C) {
            this.bG = this.bF;
            if (!this.bj()) {
               this.bH = 2.0F;
               fdw $$0 = this.dy();
               if ($$0.e > 0.0 && this.bM && !this.bb()) {
                  this.dV().a(this.dA(), this.dC(), this.dG(), this.n(), this.dm(), 1.0F, 1.0F, false);
               }

               this.bM = $$0.e < 0.0 && this.dV().a(this.dv().e(), this);
            } else if (this.t()) {
               if (this.bH < 0.5F) {
                  this.bH = 4.0F;
               } else {
                  this.bH = this.bH + (0.5F - this.bH) * 0.1F;
               }
            } else {
               this.bH = this.bH + (0.125F - this.bH) * 0.2F;
            }

            this.bF = this.bF + this.bH;
            this.bJ = this.bI;
            if (!this.bj()) {
               this.bI = this.ae.i();
            } else if (this.t()) {
               this.bI = this.bI + (0.0F - this.bI) * 0.25F;
            } else {
               this.bI = this.bI + (1.0F - this.bI) * 0.06F;
            }

            if (this.t() && this.bj()) {
               fdw $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dV().a(lx.d, this.d(0.5) - $$1.d * 1.5, this.dD() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.x()) {
               if (this.bL < this.m()) {
                  this.bL++;
               }

               bwz $$3 = this.gq();
               if ($$3 != null) {
                  this.J().a($$3, 90.0F, 90.0F);
                  this.J().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dA() - this.dA();
                  double $$6 = $$3.e(0.5) - this.dE();
                  double $$7 = $$3.dG() - this.dG();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ae.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ae.j() * (1.7 - $$4);
                     this.dV().a(lx.d, this.dA() + $$5 * $$9, this.dE() + $$6 * $$9, this.dG() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bj()) {
            this.j(300);
         } else if (this.aJ()) {
            this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.4F)));
            this.w(this.ae.i() * 360.0F);
            this.d(false);
            this.ar = true;
         }

         if (this.x()) {
            this.w(this.aX);
         }
      }

      super.k_();
   }

   protected awk n() {
      return awl.lT;
   }

   public float J(float $$0) {
      return azk.h($$0, this.bG, this.bF);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bJ, this.bI);
   }

   public float L(float $$0) {
      return ((float)this.bL + $$0) / (float)this.m();
   }

   public float gr() {
      return (float)this.bL;
   }

   @Override
   public boolean a(dis $$0) {
      return $$0.f(this);
   }

   public static boolean b(bwj<? extends cnp> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return ($$4.a(20) == 0 || !$$1.w($$3)) && $$1.an() != btv.a && (bwi.a($$2) || $$1.b_($$3).a(axf.a)) && $$1.b_($$3.e()).a(axf.a);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (!this.t() && !$$1.a(axb.w) && !$$1.a(bus.P) && $$1.c() instanceof bwz $$3) {
         $$3.a($$0, this.dW().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
         if (!this.t() && this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cdv {
      private final cnp a;
      private int b;
      private final boolean c;

      public a(cnp $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cni;
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         bwz $$0 = this.a.f();
         return $$0 != null && $$0.bK();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.f() != null && this.a.g((bwa)this.a.f()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.O().m();
         bwz $$0 = this.a.f();
         if ($$0 != null) {
            this.a.J().a($$0, 90.0F, 90.0F);
         }

         this.a.ar = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.g(null);
         this.a.c.i();
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bwz $$0 = this.a.f();
         if ($$0 != null) {
            this.a.O().m();
            this.a.J().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.g(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.bb()) {
                     this.a.dV().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.dV().an() == btv.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  aro $$2 = a(this.a);
                  $$0.a($$2, this.a.dW().c(this.a, (bwa)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cho.a {
      private final cnp a;

      public b(cnp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bwz $$0, aro $$1) {
         return ($$0 instanceof cqs || $$0 instanceof cjp || $$0 instanceof ckd) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends ccy {
      private final cnp l;

      public c(cnp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccy.a.b && !this.l.O().k()) {
            fdw $$0 = new fdw(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azk.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(byf.v));
            float $$7 = azk.h(0.125F, this.l.fn(), $$6);
            this.l.B($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.i(this.l.dy().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            ccx $$12 = this.l.J();
            double $$13 = this.l.dA() + $$2 * 2.0;
            double $$14 = this.l.dE() + $$3 / $$1;
            double $$15 = this.l.dG() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.J().a(azk.d(0.125, $$16, $$13), azk.d(0.125, $$17, $$14), azk.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.B(0.0F);
            this.l.w(false);
         }
      }
   }
}
