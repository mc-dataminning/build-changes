import java.util.EnumSet;
import javax.annotation.Nullable;

public class cog extends cok {
   protected static final int b = 80;
   private static final akj<Boolean> a = akn.a(cog.class, akl.k);
   private static final akj<Integer> d = akn.a(cog.class, akl.b);
   private float bG;
   private float bH;
   private float bI;
   private float bJ;
   private float bK;
   @Nullable
   private bxj bL;
   private int bM;
   private boolean bN;
   @Nullable
   protected cfc c;

   public cog(bwr<? extends cog> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 10;
      this.a(exm.j, 0.0F);
      this.bA = new cog.c(this);
      this.bG = this.ae.i();
      this.bH = this.bG;
   }

   @Override
   protected void D() {
      cet $$0 = new cet(this, 1.0);
      this.c = new cfc(this, 1.0, 80);
      this.bD.a(4, new cog.a(this));
      this.bD.a(5, $$0);
      this.bD.a(7, this.c);
      this.bD.a(8, new cen(this, crj.class, 8.0F));
      this.bD.a(8, new cen(this, cog.class, 12.0F, 0.01F));
      this.bD.a(9, new cfa(this));
      this.c.a(EnumSet.of(cef.a.a, cef.a.b));
      $$0.a(EnumSet.of(cef.a.a, cef.a.b));
      this.bE.a(1, new cfy<>(this, bxj.class, 10, true, false, new cog.b(this)));
   }

   public static byo.a q() {
      return cok.gw().a(byp.c, 6.0).a(byp.v, 0.5).a(byp.s, 30.0);
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgv(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public bxj gt() {
      if (!this.x()) {
         return null;
      } else if (this.dU().C) {
         if (this.bL != null) {
            return this.bL;
         } else {
            bwi $$0 = this.dU().a(this.al.a(d));
            if ($$0 instanceof bxj) {
               this.bL = (bxj)$$0;
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
   public void a(akj<?> $$0) {
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
   protected awm u() {
      return this.bh() ? awn.lS : awn.lT;
   }

   @Override
   protected awm e(bux $$0) {
      return this.bh() ? awn.lY : awn.lZ;
   }

   @Override
   protected awm l_() {
      return this.bh() ? awn.lV : awn.lW;
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return $$1.b_($$0).a(axh.a) ? 10.0F + $$1.x($$0) : super.a($$0, $$1);
   }

   @Override
   public void k_() {
      if (this.bI()) {
         if (this.dU().C) {
            this.bH = this.bG;
            if (!this.bh()) {
               this.bI = 2.0F;
               fex $$0 = this.dx();
               if ($$0.e > 0.0 && this.bN && !this.aZ()) {
                  this.dU().a(this.dz(), this.dB(), this.dF(), this.n(), this.dl(), 1.0F, 1.0F, false);
               }

               this.bN = $$0.e < 0.0 && this.dU().a(this.du().e(), this);
            } else if (this.t()) {
               if (this.bI < 0.5F) {
                  this.bI = 4.0F;
               } else {
                  this.bI = this.bI + (0.5F - this.bI) * 0.1F;
               }
            } else {
               this.bI = this.bI + (0.125F - this.bI) * 0.2F;
            }

            this.bG = this.bG + this.bI;
            this.bK = this.bJ;
            if (!this.bh()) {
               this.bJ = this.ae.i();
            } else if (this.t()) {
               this.bJ = this.bJ + (0.0F - this.bJ) * 0.25F;
            } else {
               this.bJ = this.bJ + (1.0F - this.bJ) * 0.06F;
            }

            if (this.t() && this.bh()) {
               fex $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dU().a(ly.d, this.d(0.5) - $$1.d * 1.5, this.dC() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.x()) {
               if (this.bM < this.m()) {
                  this.bM++;
               }

               bxj $$3 = this.gt();
               if ($$3 != null) {
                  this.J().a($$3, 90.0F, 90.0F);
                  this.J().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dz() - this.dz();
                  double $$6 = $$3.e(0.5) - this.dD();
                  double $$7 = $$3.dF() - this.dF();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ae.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ae.j() * (1.7 - $$4);
                     this.dU().a(ly.d, this.dz() + $$5 * $$9, this.dD() + $$6 * $$9, this.dF() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bh()) {
            this.j(300);
         } else if (this.aH()) {
            this.i(this.dx().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.4F)));
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

   protected awm n() {
      return awn.lX;
   }

   public float J(float $$0) {
      return azm.h($$0, this.bH, this.bG);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bK, this.bJ);
   }

   public float L(float $$0) {
      return ((float)this.bM + $$0) / (float)this.m();
   }

   public float gu() {
      return (float)this.bM;
   }

   @Override
   public boolean a(djk $$0) {
      return $$0.f(this);
   }

   public static boolean b(bwr<? extends cog> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return ($$4.a(20) == 0 || !$$1.w($$3)) && $$1.an() != bud.a && (bwq.a($$2) || $$1.b_($$3).a(axh.a)) && $$1.b_($$3.e()).a(axh.a);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (!this.t() && !$$1.a(axd.w) && !$$1.a(bva.P) && $$1.c() instanceof bxj $$3) {
         $$3.a($$0, this.dV().d(this), 2.0F);
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
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(0.1F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
         if (!this.t() && this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cef {
      private final cog a;
      private int b;
      private final boolean c;

      public a(cog $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cnz;
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         bxj $$0 = this.a.f();
         return $$0 != null && $$0.bI();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.f() != null && this.a.g((bwi)this.a.f()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.O().m();
         bxj $$0 = this.a.f();
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
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxj $$0 = this.a.f();
         if ($$0 != null) {
            this.a.O().m();
            this.a.J().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.g(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ao());
                  if (!this.a.aZ()) {
                     this.a.dU().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.dU().an() == bud.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arq $$2 = a(this.a);
                  $$0.a($$2, this.a.dV().c(this.a, (bwi)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements chy.a {
      private final cog a;

      public b(cog $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bxj $$0, arq $$1) {
         return ($$0 instanceof crj || $$0 instanceof ckd || $$0 instanceof ckr) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cdi {
      private final cog l;

      public c(cog $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdi.a.b && !this.l.O().k()) {
            fex $$0 = new fex(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azm.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dK(), $$5, 90.0F));
            this.l.aV = this.l.dK();
            float $$6 = (float)(this.h * this.l.h(byp.v));
            float $$7 = azm.h(0.125F, this.l.fn(), $$6);
            this.l.B($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ao()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ao()) * 0.75) * 0.05;
            this.l.i(this.l.dx().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cdh $$12 = this.l.J();
            double $$13 = this.l.dz() + $$2 * 2.0;
            double $$14 = this.l.dD() + $$3 / $$1;
            double $$15 = this.l.dF() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.J().a(azm.d(0.125, $$16, $$13), azm.d(0.125, $$17, $$14), azm.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.B(0.0F);
            this.l.w(false);
         }
      }
   }
}
