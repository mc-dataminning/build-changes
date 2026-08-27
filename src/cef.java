import java.util.EnumSet;
import javax.annotation.Nullable;

public class cef extends cfk implements cev {
   public static final float b = 0.03F;
   boolean bW;
   protected final bxv c;
   protected final bxs d;

   public cef(bnw<? extends cef> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new cef.d(this);
      this.a(ehh.j, 0.0F);
      this.c = new bxv(this, $$1);
      this.d = new bxs(this, $$1);
   }

   public static bpo.a u() {
      return cfk.gk().a(bpp.r, 1.0);
   }

   @Override
   protected void w() {
      this.bO.a(1, new cef.c(this, 1.0));
      this.bO.a(2, new cef.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new cef.a(this, 1.0, false));
      this.bO.a(5, new cef.b(this, 1.0));
      this.bO.a(6, new cef.e(this, 1.0, this.dM().A_()));
      this.bO.a(7, new bwc(this, 1.0));
      this.bP.a(1, new bwx(this, cef.class).a(cfm.class));
      this.bP.a(2, new bwy<>(this, chl.class, 10, true, false, this::j));
      this.bP.a(3, new bwy<>(this, cgt.class, false));
      this.bP.a(3, new bwy<>(this, caj.class, true));
      this.bP.a(3, new bwy<>(this, cbh.class, true, false));
      this.bP.a(5, new bwy<>(this, cay.class, 10, true, false, cay.bU));
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bnx.b).b() && $$0.F_().i() < 0.03F) {
         this.a(bnx.b, new cpd(cpg.vN));
         this.e(bnx.b);
      }

      return $$3;
   }

   public static boolean a(bnw<cef> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      if (!$$1.b_($$3.d()).a(auf.a) && !bom.a($$2)) {
         return false;
      } else {
         ij<cwq> $$5 = $$1.t($$3);
         boolean $$6 = $$1.aj() != blt.a && (bom.b($$2) || a($$1, $$3, $$4)) && (bom.a($$2) || $$1.b_($$3).a(auf.a));
         if ($$6 && bom.a($$2)) {
            return true;
         } else {
            return $$5.a(atz.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cvs $$0, hz $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean A() {
      return false;
   }

   @Override
   protected atk y() {
      return this.aZ() ? atl.hq : atl.hp;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.aZ() ? atl.hu : atl.ht;
   }

   @Override
   protected atk n_() {
      return this.aZ() ? atl.hs : atl.hr;
   }

   @Override
   protected atk gg() {
      return atl.hw;
   }

   @Override
   protected atk aN() {
      return atl.hx;
   }

   @Override
   protected cpd gh() {
      return cpd.h;
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bnx.a, new cpd(cpg.vL));
         } else {
            this.a(bnx.a, new cpd(cpg.qU));
         }
      }
   }

   @Override
   protected boolean b(cpd $$0, cpd $$1) {
      if ($$1.a(cpg.vN)) {
         return false;
      } else if ($$1.a(cpg.vL)) {
         return $$0.a(cpg.vL) ? $$0.l() < $$1.l() : false;
      } else {
         return $$0.a(cpg.vL) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gi() {
      return false;
   }

   @Override
   public boolean a(cvu $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable boi $$0) {
      return $$0 != null ? !this.dM().P() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gq() {
      if (this.bW) {
         return true;
      } else {
         boi $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(enz $$0) {
      if (this.cX() && this.aZ() && this.gq()) {
         this.a(0.01F, $$0);
         this.a(bon.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dM().B) {
         if (this.cY() && this.aZ() && this.gq()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gj() {
      ehl $$0 = this.N().j();
      if ($$0 != null) {
         hz $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(boi $$0, float $$1) {
      ciq $$2 = new ciq(this.dM(), this, new cpd(cpg.vL));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(atl.hv, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.bW = $$0;
   }

   static class a extends bwu {
      private final cef b;

      public a(cef $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.q());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.q());
      }
   }

   static class b extends bvs {
      private final cef g;

      public b(cef $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().P() && this.g.aZ() && this.g.dt() >= (double)(this.g.dM().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cvu $$0, hz $$1) {
         hz $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bvf {
      private final boq a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cvr f;

      public c(boq $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            enz $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.N().l();
      }

      @Override
      public void c() {
         this.a.N().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private enz h() {
         awp $$0 = this.a.eh();
         hz $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hz $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cyu.G)) {
               return enz.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bui {
      private final cef l;

      public d(cef $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         boi $$0 = this.l.q();
         if (this.l.gq() && this.l.aZ()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.bW) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bui.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(awi.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(bpp.o));
            float $$7 = awi.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            this.l.g(this.l.dp().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dp().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bvf {
      private final cef a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cef $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().P() && this.a.aZ() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.N().l() || this.a.gj())) {
            enz $$0 = bzc.a(this.a, 4, 8, new enz(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.N().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bwe {
      private final cef a;

      public f(cev $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cef)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cpg.vL);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(blv.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
