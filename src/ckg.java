import javax.annotation.Nullable;

public class ckg extends ciz {
   private static final akj<Boolean> bH = akn.a(ckg.class, akl.k);
   private static final akj<Boolean> bI = akn.a(ckg.class, akl.k);
   private static final float bK = 0.3F;
   private static final bwl bL = bwr.bB.n().a(bwk.a().a(bwj.a, 0.0F, bwr.bB.m(), -0.25F)).a(0.3F);
   int bM;
   public static final chy.a bG = ($$0, $$1) -> $$0.n_() && !$$0.bh();
   iv bN = iv.c;
   @Nullable
   iv bO;
   boolean bP;

   public ckg(bwr<? extends ckg> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.j, 0.0F);
      this.a(exr.t, -1.0F);
      this.a(exr.s, -1.0F);
      this.a(exr.r, -1.0F);
      this.bA = new ckg.e(this);
   }

   public void h(iv $$0) {
      this.bN = $$0;
   }

   public boolean q() {
      return this.al.a(bH);
   }

   void w(boolean $$0) {
      this.al.a(bH, $$0);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   void x(boolean $$0) {
      this.bM = $$0 ? 1 : 0;
      this.al.a(bI, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, false);
      $$0.a(bI, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("home_pos", iv.a, this.bN);
      $$0.a("has_egg", this.q());
   }

   @Override
   public void a(tz $$0) {
      this.h($$0.<iv>a("home_pos", iv.a).orElse(this.du()));
      super.a($$0);
      this.w($$0.o("has_egg"));
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.h(this.du());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwr<ckg> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$3.v() < $$1.P() + 4 && dvy.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bD.a(0, new ckg.f(this, 1.2));
      this.bD.a(1, new ckg.a(this, 1.0));
      this.bD.a(1, new ckg.d(this, 1.0));
      this.bD.a(2, new cfn(this, 1.1, $$0 -> $$0.a(axk.aA), false));
      this.bD.a(3, new ckg.c(this, 1.0));
      this.bD.a(4, new ckg.b(this, 1.0));
      this.bD.a(7, new ckg.i(this, 1.0));
      this.bD.a(8, new cen(this, crm.class, 8.0F));
      this.bD.a(9, new ckg.h(this, 1.0, 100));
   }

   public static byo.a x() {
      return ciz.gy().a(byp.s, 30.0).a(byp.v, 0.25).a(byp.B, 1.0);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   public int S() {
      return 200;
   }

   @Nullable
   @Override
   protected awm u() {
      return !this.bh() && this.aH() && !this.n_() ? awn.Bj : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awm aT() {
      return awn.Bu;
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return this.n_() ? awn.Bq : awn.Bp;
   }

   @Nullable
   @Override
   protected awm l_() {
      return this.n_() ? awn.Bl : awn.Bk;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      awm $$2 = this.n_() ? awn.Bt : awn.Bs;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gA() {
      return super.gA() && !this.q();
   }

   @Override
   protected float aS() {
      return this.X + 0.15F;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected cgt b(djm $$0) {
      return new ckg.g(this, $$0);
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.bB.a($$0, bwq.e);
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.aA);
   }

   @Override
   public float a(iv $$0, djp $$1) {
      if (!this.bP && $$1.b_($$0).a(axh.a)) {
         return 10.0F;
      } else {
         return dvy.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bI() && this.t() && this.bM >= 1 && this.bM % 5 == 0) {
         iv $$0 = this.du();
         if (dvy.a(this.dU(), $$0)) {
            this.dU().c(2001, $$0, dmr.j(this.dU().a_($$0.e())));
            this.a(eft.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dU() instanceof arq $$0 && $$0.O().c(dji.g)) {
         this.a($$0, czr.pd, 1);
      }
   }

   @Override
   public void a_(ffc $$0) {
      if (this.bh()) {
         this.a(0.1F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null && (!this.bP || !this.bN.a(this.ds(), 20.0))) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
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
   public void a(arq $$0, bxi $$1) {
      this.a($$0, this.dV().c(), Float.MAX_VALUE);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bL : super.e($$0);
   }

   static class a extends cdr {
      private final ckg d;

      a(ckg $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arr $$0 = this.a.gC();
         if ($$0 == null && this.c.gC() != null) {
            $$0 = this.c.gC();
         }

         if ($$0 != null) {
            $$0.a(awx.P);
            aq.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gE();
         this.c.gE();
         azv $$1 = this.a.dX();
         if (a(this.b).O().c(dji.g)) {
            this.b.b(new bww(this.b, this.a.dz(), this.a.dB(), this.a.dF(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cef {
      private final ckg a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(ckg $$0, double $$1) {
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
            return this.a.dX().a(b(700)) != 0 ? false : !this.a.bN.a(this.a.ds(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.bP = true;
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.bP = false;
      }

      @Override
      public boolean c() {
         return !this.a.bN.a(this.a.ds(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         iv $$0 = this.a.bN;
         boolean $$1 = $$0.a(this.a.ds(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            ffc $$2 = ffc.c($$0);
            ffc $$3 = cic.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cic.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dU().a_(iv.a((jp)$$3)).a(dmt.J)) {
               $$3 = cic.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ces {
      private static final int g = 1200;
      private final ckg h;

      c(ckg $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bh() && this.d <= 1200 && this.a(this.h.dU(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.n_() && !this.h.bh()) {
            return super.b();
         } else {
            return !this.h.bP && !this.h.bh() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(djp $$0, iv $$1) {
         return $$0.a_($$1).a(dmt.J);
      }
   }

   static class d extends ces {
      private final ckg g;

      d(ckg $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.bN.a(this.g.ds(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.bN.a(this.g.ds(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iv $$0 = this.g.du();
         if (!this.g.bh() && this.m()) {
            if (this.g.bM < 1) {
               this.g.x(true);
            } else if (this.g.bM > this.a(200)) {
               djm $$1 = this.g.dU();
               $$1.a(null, $$0, awn.Br, awo.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iv $$2 = this.e.d();
               eat $$3 = dmt.mL.m().b(dvy.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eft.i, $$2, eft.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.bM++;
            }
         }
      }

      @Override
      protected boolean a(djp $$0, iv $$1) {
         return !$$0.v($$1.d()) ? false : dvy.b($$0, $$1);
      }
   }

   static class e extends cdi {
      private final ckg l;

      e(ckg $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bh()) {
            this.l.i(this.l.dx().b(0.0, 0.005, 0.0));
            if (!this.l.bN.a(this.l.ds(), 16.0)) {
               this.l.B(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.B(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aH()) {
            this.l.B(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cdi.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dz();
            double $$1 = this.f - this.l.dB();
            double $$2 = this.g - this.l.dF();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dK(), $$4, 90.0F));
               this.l.aV = this.l.dK();
               float $$5 = (float)(this.h * this.l.h(byp.v));
               this.l.B(azm.h(0.125F, this.l.fn(), $$5));
               this.l.i(this.l.dx().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cey {
      f(ckg $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            iv $$0 = this.a(this.c.dU(), this.c, 7);
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

   static class g extends cgq {
      g(ckg $$0, djm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iv $$0) {
         if (this.a instanceof ckg $$1 && $$1.bO != null) {
            return this.b.a_($$0).a(dmt.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cfc {
      private final ckg i;

      h(ckg $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bh() && !this.i.bP && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cef {
      private final ckg a;
      private final double b;
      private boolean c;

      i(ckg $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.bP && !this.a.q() && this.a.bh();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azv $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dB() > (double)(this.a.dU().P() - 1)) {
            $$4 = 0;
         }

         this.a.bO = iv.a((double)$$3 + this.a.dz(), (double)$$4 + this.a.dB(), (double)$$5 + this.a.dF());
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.bO == null) {
            this.c = true;
         } else {
            if (this.a.O().k()) {
               ffc $$0 = ffc.c(this.a.bO);
               ffc $$1 = cic.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
               if ($$1 == null) {
                  $$1 = cic.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
               }

               if ($$1 != null) {
                  int $$2 = azm.a($$1.d);
                  int $$3 = azm.a($$1.f);
                  int $$4 = 34;
                  if (!this.a.dU().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.O().k() && !this.c && !this.a.bP && !this.a.gD() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.bO = null;
         super.e();
      }
   }
}
