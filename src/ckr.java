import javax.annotation.Nullable;

public class ckr extends cjk {
   private static final akl<Boolean> bJ = akp.a(ckr.class, akn.k);
   private static final akl<Boolean> bK = akp.a(ckr.class, akn.k);
   private static final float bM = 0.3F;
   private static final bww bN = bxc.bC.n().a(bwv.a().a(bwu.a, 0.0F, bxc.bC.m(), -0.25F)).a(0.3F);
   private static final boolean bO = false;
   int bP;
   public static final cij.a bI = ($$0, $$1) -> $$0.n_() && !$$0.bi();
   iv bQ = iv.c;
   @Nullable
   iv bR;
   boolean bS;

   public ckr(bxc<? extends ckr> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.j, 0.0F);
      this.a(eyf.t, -1.0F);
      this.a(eyf.s, -1.0F);
      this.a(eyf.r, -1.0F);
      this.bC = new ckr.e(this);
   }

   public void h(iv $$0) {
      this.bQ = $$0;
   }

   public boolean q() {
      return this.al.a(bJ);
   }

   void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   public boolean t() {
      return this.al.a(bK);
   }

   void x(boolean $$0) {
      this.bP = $$0 ? 1 : 0;
      this.al.a(bK, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("home_pos", iv.a, this.bQ);
      $$0.a("has_egg", this.q());
   }

   @Override
   public void a(tz $$0) {
      this.h($$0.<iv>a("home_pos", iv.a).orElse(this.dv()));
      super.a($$0);
      this.w($$0.b("has_egg", false));
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.h(this.dv());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bxc<ckr> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$3.v() < $$1.P() + 4 && dwj.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bF.a(0, new ckr.f(this, 1.2));
      this.bF.a(1, new ckr.a(this, 1.0));
      this.bF.a(1, new ckr.d(this, 1.0));
      this.bF.a(2, new cfy(this, 1.1, $$0 -> $$0.a(axm.aA), false));
      this.bF.a(3, new ckr.c(this, 1.0));
      this.bF.a(4, new ckr.b(this, 1.0));
      this.bF.a(7, new ckr.i(this, 1.0));
      this.bF.a(8, new cey(this, crx.class, 8.0F));
      this.bF.a(9, new ckr.h(this, 1.0, 100));
   }

   public static byz.a x() {
      return cjk.gz().a(bza.s, 30.0).a(bza.v, 0.25).a(bza.B, 1.0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public int S() {
      return 200;
   }

   @Nullable
   @Override
   protected awo u() {
      return !this.bi() && this.aH() && !this.n_() ? awp.Bj : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awo aU() {
      return awp.Bu;
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return this.n_() ? awp.Bq : awp.Bp;
   }

   @Nullable
   @Override
   protected awo l_() {
      return this.n_() ? awp.Bl : awp.Bk;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      awo $$2 = this.n_() ? awp.Bt : awp.Bs;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.q();
   }

   @Override
   protected float aT() {
      return this.X + 0.15F;
   }

   @Override
   public float ek() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected che b(djx $$0) {
      return new ckr.g(this, $$0);
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.bC.a($$0, bxb.e);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.aA);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      if (!this.bS && $$1.b_($$0).a(axj.a)) {
         return 10.0F;
      } else {
         return dwj.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bJ() && this.t() && this.bP >= 1 && this.bP % 5 == 0) {
         iv $$0 = this.dv();
         if (dwj.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dnc.j(this.dV().a_($$0.e())));
            this.a(ege.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dV() instanceof ars $$0 && $$0.O().c(djt.g)) {
         this.a($$0, dac.pd, 1);
      }
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(0.1F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null && (!this.bS || !this.bQ.a(this.dt(), 20.0))) {
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
   public void a(ars $$0, bxt $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   static class a extends cec {
      private final ckr d;

      a(ckr $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         art $$0 = this.a.gD();
         if ($$0 == null && this.c.gD() != null) {
            $$0 = this.c.gD();
         }

         if ($$0 != null) {
            $$0.a(awz.P);
            aq.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gF();
         this.c.gF();
         azx $$1 = this.a.dY();
         if (a(this.b).O().c(djt.g)) {
            this.b.b(new bxh(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ceq {
      private final ckr a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(ckr $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.n_()) {
            return false;
         } else if (this.a.q()) {
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
         iv $$0 = this.a.bQ;
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            ffq $$2 = ffq.c($$0);
            ffq $$3 = cin.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cin.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(iv.a((jp)$$3)).a(dne.J)) {
               $$3 = cin.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cfd {
      private static final int g = 1200;
      private final ckr h;

      c(ckr $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bi() && this.d <= 1200 && this.a(this.h.dV(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.n_() && !this.h.bi()) {
            return super.b();
         } else {
            return !this.h.bS && !this.h.bi() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dka $$0, iv $$1) {
         return $$0.a_($$1).a(dne.J);
      }
   }

   static class d extends cfd {
      private final ckr g;

      d(ckr $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.bQ.a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.bQ.a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iv $$0 = this.g.dv();
         if (!this.g.bi() && this.m()) {
            if (this.g.bP < 1) {
               this.g.x(true);
            } else if (this.g.bP > this.a(200)) {
               djx $$1 = this.g.dV();
               $$1.a(null, $$0, awp.Br, awq.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iv $$2 = this.e.d();
               ebe $$3 = dne.mL.m().b(dwj.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ege.i, $$2, ege.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.bP++;
            }
         }
      }

      @Override
      protected boolean a(dka $$0, iv $$1) {
         return !$$0.v($$1.d()) ? false : dwj.b($$0, $$1);
      }
   }

   static class e extends cdt {
      private final ckr l;

      e(ckr $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bi()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.bQ.a(this.l.dt(), 16.0)) {
               this.l.B(Math.max(this.l.fo() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.B(Math.max(this.l.fo() / 3.0F, 0.06F));
            }
         } else if (this.l.aH()) {
            this.l.B(Math.max(this.l.fo() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cdt.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azo.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aV = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(bza.v));
               this.l.B(azo.h(0.125F, this.l.fo(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cfj {
      f(ckr $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            iv $$0 = this.a(this.c.dV(), this.c, 7);
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

   static class g extends chb {
      g(ckr $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iv $$0) {
         if (this.a instanceof ckr $$1 && $$1.bR != null) {
            return this.b.a_($$0).a(dne.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cfn {
      private final ckr i;

      h(ckr $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bi() && !this.i.bS && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends ceq {
      private final ckr a;
      private final double b;
      private boolean c;

      i(ckr $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.bS && !this.a.q() && this.a.bi();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azx $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().P() - 1)) {
            $$4 = 0;
         }

         this.a.bR = iv.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.bR == null) {
            this.c = true;
         } else {
            if (this.a.O().k()) {
               ffq $$0 = ffq.c(this.a.bR);
               ffq $$1 = cin.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
               if ($$1 == null) {
                  $$1 = cin.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
               }

               if ($$1 != null) {
                  int $$2 = azo.a($$1.d);
                  int $$3 = azo.a($$1.f);
                  int $$4 = 34;
                  if (!this.a.dV().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                     $$1 = null;
                  }
               }

               if ($$1 == null) {
                  this.c = true;
                  return;
               }

               this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k() && !this.c && !this.a.bS && !this.a.gE() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.bR = null;
         super.e();
      }
   }
}
