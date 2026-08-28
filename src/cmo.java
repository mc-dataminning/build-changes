import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmo extends cms {
   protected static final int b = 80;
   private static final ajx<Boolean> a = akb.a(cmo.class, ajz.k);
   private static final ajx<Integer> d = akb.a(cmo.class, ajz.b);
   private float bF;
   private float bG;
   private float bH;
   private float bI;
   private float bJ;
   @Nullable
   private bvy bK;
   private int bL;
   private boolean bM;
   @Nullable
   protected cdt c;

   public cmo(bvi<? extends cmo> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 10;
      this.a(eun.j, 0.0F);
      this.bz = new cmo.c(this);
      this.bF = this.ae.i();
      this.bG = this.bF;
   }

   @Override
   protected void D() {
      cdk $$0 = new cdk(this, 1.0);
      this.c = new cdt(this, 1.0, 80);
      this.bC.a(4, new cmo.a(this));
      this.bC.a(5, $$0);
      this.bC.a(7, this.c);
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cde(this, cmo.class, 12.0F, 0.01F));
      this.bC.a(9, new cdr(this));
      this.c.a(EnumSet.of(ccw.a.a, ccw.a.b));
      $$0.a(EnumSet.of(ccw.a.a, ccw.a.b));
      this.bD.a(1, new cep<>(this, bvy.class, 10, true, false, new cmo.b(this)));
   }

   public static bxf.a q() {
      return cms.gv().a(bxg.c, 6.0).a(bxg.v, 0.5).a(bxg.s, 30.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfm(this, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
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
   public bvy gs() {
      if (!this.x()) {
         return null;
      } else if (this.dU().C) {
         if (this.bK != null) {
            return this.bK;
         } else {
            bva $$0 = this.dU().a(this.al.a(d));
            if ($$0 instanceof bvy) {
               this.bK = (bvy)$$0;
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
   public void a(ajx<?> $$0) {
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
   protected avz u() {
      return this.bj() ? awa.lO : awa.lP;
   }

   @Override
   protected avz e(btp $$0) {
      return this.bj() ? awa.lU : awa.lV;
   }

   @Override
   protected avz l_() {
      return this.bj() ? awa.lR : awa.lS;
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return $$1.b_($$0).a(awv.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void k_() {
      if (this.bJ()) {
         if (this.dU().C) {
            this.bG = this.bF;
            if (!this.bj()) {
               this.bH = 2.0F;
               fbx $$0 = this.dx();
               if ($$0.e > 0.0 && this.bM && !this.bb()) {
                  this.dU().a(this.dz(), this.dB(), this.dF(), this.n(), this.dl(), 1.0F, 1.0F, false);
               }

               this.bM = $$0.e < 0.0 && this.dU().a(this.du().e(), this);
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
               fbx $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dU().a(lt.d, this.d(0.5) - $$1.d * 1.5, this.dC() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.x()) {
               if (this.bL < this.m()) {
                  this.bL++;
               }

               bvy $$3 = this.gs();
               if ($$3 != null) {
                  this.J().a($$3, 90.0F, 90.0F);
                  this.J().a();
                  double $$4 = (double)this.M(0.0F);
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
                     this.dU().a(lt.d, this.dz() + $$5 * $$9, this.dD() + $$6 * $$9, this.dF() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bj()) {
            this.j(300);
         } else if (this.aJ()) {
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

   protected avz n() {
      return awa.lT;
   }

   public float K(float $$0) {
      return ayz.h($$0, this.bG, this.bF);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.bJ, this.bI);
   }

   public float M(float $$0) {
      return ((float)this.bL + $$0) / (float)this.m();
   }

   public float gt() {
      return (float)this.bL;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   public static boolean b(bvi<? extends cmo> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.an() != bsv.a && (bvh.a($$2) || $$1.b_($$3).a(awv.a)) && $$1.b_($$3.e()).a(awv.a);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (!this.t() && !$$1.a(awr.w) && !$$1.a(bts.P) && $$1.c() instanceof bvy $$3) {
         $$3.a($$0, this.dV().d(this), 2.0F);
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
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
         if (!this.t() && this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends ccw {
      private final cmo a;
      private int b;
      private final boolean c;

      public a(cmo $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cmh;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         bvy $$0 = this.a.f();
         return $$0 != null && $$0.bJ();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.f() != null && this.a.g((bva)this.a.f()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.O().m();
         bvy $$0 = this.a.f();
         if ($$0 != null) {
            this.a.J().a($$0, 90.0F, 90.0F);
         }

         this.a.ar = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.c.i();
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bvy $$0 = this.a.f();
         if ($$0 != null) {
            this.a.O().m();
            this.a.J().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.bb()) {
                     this.a.dU().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.dU().an() == bsv.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  ard $$2 = a(this.a);
                  $$0.a($$2, this.a.dV().c(this.a, (bva)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cgp.a {
      private final cmo a;

      public b(cmo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bvy $$0, ard $$1) {
         return ($$0 instanceof cpr || $$0 instanceof ciq || $$0 instanceof cje) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cbz {
      private final cmo l;

      public c(cmo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbz.a.b && !this.l.O().k()) {
            fbx $$0 = new fbx(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(ayz.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dK(), $$5, 90.0F));
            this.l.aV = this.l.dK();
            float $$6 = (float)(this.h * this.l.h(bxg.v));
            float $$7 = ayz.h(0.125F, this.l.fq(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.i(this.l.dx().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cby $$12 = this.l.J();
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

            this.l.J().a(ayz.d(0.125, $$16, $$13), ayz.d(0.125, $$17, $$14), ayz.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.C(0.0F);
            this.l.w(false);
         }
      }
   }
}
