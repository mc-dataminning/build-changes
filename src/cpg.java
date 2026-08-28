import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpg extends cpk {
   protected static final int b = 80;
   private static final aku<Boolean> a = aky.a(cpg.class, akw.k);
   private static final aku<Integer> d = aky.a(cpg.class, akw.b);
   private float e;
   private float f;
   private float bI;
   private float bJ;
   private float bK;
   @Nullable
   private byf bL;
   private int bM;
   private boolean bN;
   @Nullable
   protected cfy c;

   public cpg(bxn<? extends cpg> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 10;
      this.a(eyr.j, 0.0F);
      this.bC = new cpg.c(this);
      this.e = this.ae.i();
      this.f = this.e;
   }

   @Override
   protected void D() {
      cfp $$0 = new cfp(this, 1.0);
      this.c = new cfy(this, 1.0, 80);
      this.bF.a(4, new cpg.a(this));
      this.bF.a(5, $$0);
      this.bF.a(7, this.c);
      this.bF.a(8, new cfj(this, csi.class, 8.0F));
      this.bF.a(8, new cfj(this, cpg.class, 12.0F, 0.01F));
      this.bF.a(9, new cfw(this));
      this.c.a(EnumSet.of(cfb.a.a, cfb.a.b));
      $$0.a(EnumSet.of(cfb.a.a, cfb.a.b));
      this.bG.a(1, new cgu<>(this, byf.class, 10, true, false, new cpg.b(this)));
   }

   public static bzk.a q() {
      return cpk.gx().a(bzl.c, 6.0).a(bzl.v, 0.5).a(bzl.s, 30.0);
   }

   @Override
   protected chp b(dkj $$0) {
      return new chr(this, $$0);
   }

   @Override
   protected void a(aky.a $$0) {
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
   public byf gu() {
      if (!this.x()) {
         return null;
      } else if (this.dV().C) {
         if (this.bL != null) {
            return this.bL;
         } else {
            bxe $$0 = this.dV().a(this.al.a(d));
            if ($$0 instanceof byf) {
               this.bL = (byf)$$0;
               return this.bL;
            } else {
               return null;
            }
         }
      } else {
         return this.f();
      }
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.bM = 0;
         this.bL = null;
      }
   }

   @Override
   public int S() {
      return 160;
   }

   @Override
   protected awx u() {
      return this.bi() ? awy.lS : awy.lT;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.bi() ? awy.lY : awy.lZ;
   }

   @Override
   protected awx l_() {
      return this.bi() ? awy.lV : awy.lW;
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return $$1.b_($$0).a(axs.a) ? 10.0F + $$1.x($$0) : super.a($$0, $$1);
   }

   @Override
   public void k_() {
      if (this.bJ()) {
         if (this.dV().C) {
            this.f = this.e;
            if (!this.bi()) {
               this.bI = 2.0F;
               fgc $$0 = this.dy();
               if ($$0.e > 0.0 && this.bN && !this.ba()) {
                  this.dV().a(this.dA(), this.dC(), this.dG(), this.n(), this.dm(), 1.0F, 1.0F, false);
               }

               this.bN = $$0.e < 0.0 && this.dV().a(this.dv().e(), this);
            } else if (this.t()) {
               if (this.bI < 0.5F) {
                  this.bI = 4.0F;
               } else {
                  this.bI = this.bI + (0.5F - this.bI) * 0.1F;
               }
            } else {
               this.bI = this.bI + (0.125F - this.bI) * 0.2F;
            }

            this.e = this.e + this.bI;
            this.bK = this.bJ;
            if (!this.bi()) {
               this.bJ = this.ae.i();
            } else if (this.t()) {
               this.bJ = this.bJ + (0.0F - this.bJ) * 0.25F;
            } else {
               this.bJ = this.bJ + (1.0F - this.bJ) * 0.06F;
            }

            if (this.t() && this.bi()) {
               fgc $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dV().a(lz.d, this.d(0.5) - $$1.d * 1.5, this.dD() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.x()) {
               if (this.bM < this.m()) {
                  this.bM++;
               }

               byf $$3 = this.gu();
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
                     this.dV().a(lz.d, this.dA() + $$5 * $$9, this.dE() + $$6 * $$9, this.dG() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bi()) {
            this.j(300);
         } else if (this.aH()) {
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

   protected awx n() {
      return awy.lX;
   }

   public float J(float $$0) {
      return azz.h($$0, this.f, this.e);
   }

   public float K(float $$0) {
      return azz.h($$0, this.bK, this.bJ);
   }

   public float L(float $$0) {
      return ((float)this.bM + $$0) / (float)this.m();
   }

   public float gv() {
      return (float)this.bM;
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   public static boolean b(bxn<? extends cpg> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return ($$4.a(20) == 0 || !$$1.w($$3)) && $$1.an() != buz.a && (bxm.a($$2) || $$1.b_($$3).a(axs.a)) && $$1.b_($$3.e()).a(axs.a);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (!this.t() && !$$1.a(axo.w) && !$$1.a(bvw.P) && $$1.c() instanceof byf $$3) {
         $$3.a($$0, this.dW().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(0.1F, $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
         if (!this.t() && this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cfb {
      private final cpg a;
      private int b;
      private final boolean c;

      public a(cpg $$0) {
         this.a = $$0;
         this.c = $$0 instanceof coz;
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         byf $$0 = this.a.f();
         return $$0 != null && $$0.bJ();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.f() != null && this.a.g((bxe)this.a.f()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.O().m();
         byf $$0 = this.a.f();
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
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         byf $$0 = this.a.f();
         if ($$0 != null) {
            this.a.O().m();
            this.a.J().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.g(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ao());
                  if (!this.a.ba()) {
                     this.a.dV().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.dV().an() == buz.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  asb $$2 = a(this.a);
                  $$0.a($$2, this.a.dW().c(this.a, (bxe)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements ciu.a {
      private final cpg a;

      public b(cpg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable byf $$0, asb $$1) {
         return ($$0 instanceof csi || $$0 instanceof ckz || $$0 instanceof clk) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cee {
      private final cpg l;

      public c(cpg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cee.a.b && !this.l.O().k()) {
            fgc $$0 = new fgc(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azz.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bzl.v));
            float $$7 = azz.h(0.125F, this.l.fo(), $$6);
            this.l.B($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ao()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ao()) * 0.75) * 0.05;
            this.l.i(this.l.dy().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            ced $$12 = this.l.J();
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

            this.l.J().a(azz.d(0.125, $$16, $$13), azz.d(0.125, $$17, $$14), azz.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.B(0.0F);
            this.l.w(false);
         }
      }
   }
}
