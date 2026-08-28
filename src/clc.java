import javax.annotation.Nullable;

public class clc extends cjv {
   private static final aku<Boolean> bJ = aky.a(clc.class, akw.k);
   private static final aku<Boolean> bK = aky.a(clc.class, akw.k);
   private static final float bM = 0.3F;
   private static final bxh bN = bxn.bC.n().a(bxg.a().a(bxf.a, 0.0F, bxn.bC.m(), -0.25F)).a(0.3F);
   private static final boolean bO = false;
   int bP;
   public static final ciu.a bI = ($$0, $$1) -> $$0.e_() && !$$0.bi();
   iw bQ = iw.c;
   @Nullable
   iw bR;
   boolean bS;

   public clc(bxn<? extends clc> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.j, 0.0F);
      this.a(eyr.t, -1.0F);
      this.a(eyr.s, -1.0F);
      this.a(eyr.r, -1.0F);
      this.bC = new clc.e(this);
   }

   public void h(iw $$0) {
      this.bQ = $$0;
   }

   public boolean m() {
      return this.al.a(bJ);
   }

   void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   public boolean p() {
      return this.al.a(bK);
   }

   void x(boolean $$0) {
      this.bP = $$0 ? 1 : 0;
      this.al.a(bK, $$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("home_pos", iw.a, this.bQ);
      $$0.a("has_egg", this.m());
   }

   @Override
   public void a(ua $$0) {
      this.h($$0.<iw>a("home_pos", iw.a).orElse(this.dv()));
      super.a($$0);
      this.w($$0.b("has_egg", false));
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.h(this.dv());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bxn<clc> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$3.v() < $$1.P() + 4 && dwv.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void C() {
      this.bF.a(0, new clc.f(this, 1.2));
      this.bF.a(1, new clc.a(this, 1.0));
      this.bF.a(1, new clc.d(this, 1.0));
      this.bF.a(2, new cgj(this, 1.1, $$0 -> $$0.a(axv.aB), false));
      this.bF.a(3, new clc.c(this, 1.0));
      this.bF.a(4, new clc.b(this, 1.0));
      this.bF.a(7, new clc.i(this, 1.0));
      this.bF.a(8, new cfj(this, csi.class, 8.0F));
      this.bF.a(9, new clc.h(this, 1.0, 100));
   }

   public static bzk.a u() {
      return cjv.gz().a(bzl.s, 30.0).a(bzl.v, 0.25).a(bzl.B, 1.0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public int R() {
      return 200;
   }

   @Nullable
   @Override
   protected awx s() {
      return !this.bi() && this.aH() && !this.e_() ? awy.Bj : super.s();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awx aU() {
      return awy.Bu;
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return this.e_() ? awy.Bq : awy.Bp;
   }

   @Nullable
   @Override
   protected awx j_() {
      return this.e_() ? awy.Bl : awy.Bk;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      awx $$2 = this.e_() ? awy.Bt : awy.Bs;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.m();
   }

   @Override
   protected float aT() {
      return this.X + 0.15F;
   }

   @Override
   public float ek() {
      return this.e_() ? 0.3F : 1.0F;
   }

   @Override
   protected chp b(dkj $$0) {
      return new clc.g(this, $$0);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.bC.a($$0, bxm.e);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.aB);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      if (!this.bS && $$1.b_($$0).a(axs.a)) {
         return 10.0F;
      } else {
         return dwv.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bJ() && this.p() && this.bP >= 1 && this.bP % 5 == 0) {
         iw $$0 = this.dv();
         if (dwv.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dno.j(this.dV().a_($$0.e())));
            this.a(egq.u);
         }
      }
   }

   @Override
   protected void h() {
      super.h();
      if (!this.e_() && this.dV() instanceof asb $$0 && $$0.O().c(dkf.g)) {
         this.a($$0, dao.pd, 1);
      }
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(0.1F, $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.e() == null && (!this.bS || !this.bQ.a(this.dt(), 20.0))) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public void a(asb $$0, bye $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bN : super.e($$0);
   }

   static class a extends cen {
      private final clc d;

      a(clc $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.m();
      }

      @Override
      protected void g() {
         asc $$0 = this.a.gD();
         if ($$0 == null && this.c.gD() != null) {
            $$0 = this.c.gD();
         }

         if ($$0 != null) {
            $$0.a(axi.P);
            aq.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gF();
         this.c.gF();
         bai $$1 = this.a.dY();
         if (a(this.b).O().c(dkf.g)) {
            this.b.b(new bxs(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cfb {
      private final clc a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(clc $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.e_()) {
            return false;
         } else if (this.a.m()) {
            return true;
         } else {
            return this.a.dY().a(b(700)) != 0 ? false : !this.a.bQ.a(this.a.dt(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.bS = true;
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.bS = false;
      }

      @Override
      public boolean c() {
         return !this.a.bQ.a(this.a.dt(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         iw $$0 = this.a.bQ;
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().k()) {
            fgc $$2 = fgc.c($$0);
            fgc $$3 = ciy.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = ciy.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(iw.a((jq)$$3)).a(dnq.J)) {
               $$3 = ciy.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cfo {
      private static final int g = 1200;
      private final clc h;

      c(clc $$0, double $$1) {
         super($$0, $$0.e_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bi() && this.d <= 1200 && this.a(this.h.dV(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.e_() && !this.h.bi()) {
            return super.b();
         } else {
            return !this.h.bS && !this.h.bi() && !this.h.m() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dkm $$0, iw $$1) {
         return $$0.a_($$1).a(dnq.J);
      }
   }

   static class d extends cfo {
      private final clc g;

      d(clc $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.m() && this.g.bQ.a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.m() && this.g.bQ.a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iw $$0 = this.g.dv();
         if (!this.g.bi() && this.m()) {
            if (this.g.bP < 1) {
               this.g.x(true);
            } else if (this.g.bP > this.a(200)) {
               dkj $$1 = this.g.dV();
               $$1.a(null, $$0, awy.Br, awz.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iw $$2 = this.e.d();
               ebq $$3 = dnq.mL.m().b(dwv.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(egq.i, $$2, egq.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.p()) {
               this.g.bP++;
            }
         }
      }

      @Override
      protected boolean a(dkm $$0, iw $$1) {
         return !$$0.v($$1.d()) ? false : dwv.b($$0, $$1);
      }
   }

   static class e extends cee {
      private final clc l;

      e(clc $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bi()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.bQ.a(this.l.dt(), 16.0)) {
               this.l.B(Math.max(this.l.fo() / 2.0F, 0.08F));
            }

            if (this.l.e_()) {
               this.l.B(Math.max(this.l.fo() / 3.0F, 0.06F));
            }
         } else if (this.l.aH()) {
            this.l.B(Math.max(this.l.fo() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cee.a.b && !this.l.N().k()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azz.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aV = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(bzl.v));
               this.l.B(azz.h(0.125F, this.l.fo(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cfu {
      f(clc $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            iw $$0 = this.a(this.c.dV(), this.c, 7);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends chm {
      g(clc $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iw $$0) {
         if (this.a instanceof clc $$1 && $$1.bR != null) {
            return this.b.a_($$0).a(dnq.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cfy {
      private final clc i;

      h(clc $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bi() && !this.i.bS && !this.i.m() ? super.b() : false;
      }
   }

   static class i extends cfb {
      private final clc a;
      private final double b;
      private boolean c;

      i(clc $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.bS && !this.a.m() && this.a.bi();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         bai $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().P() - 1)) {
            $$4 = 0;
         }

         this.a.bR = iw.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.bR == null) {
            this.c = true;
         } else {
            if (this.a.N().k()) {
               fgc $$0 = fgc.c(this.a.bR);
               fgc $$1 = ciy.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
               if ($$1 == null) {
                  $$1 = ciy.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
               }

               if ($$1 != null) {
                  int $$2 = azz.a($$1.d);
                  int $$3 = azz.a($$1.f);
                  int $$4 = 34;
                  if (!this.a.dV().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                     $$1 = null;
                  }
               }

               if ($$1 == null) {
                  this.c = true;
                  return;
               }

               this.a.N().a($$1.d, $$1.e, $$1.f, this.b);
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.N().k() && !this.c && !this.a.bS && !this.a.gE() && !this.a.m();
      }

      @Override
      public void e() {
         this.a.bR = null;
         super.e();
      }
   }
}
