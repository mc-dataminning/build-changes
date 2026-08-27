import java.util.EnumSet;
import javax.annotation.Nullable;

public class byn extends bzs implements bzd {
   public static final float b = 0.03F;
   boolean bX;
   protected final bsi c;
   protected final bsf d;

   public byn(bik<? extends byn> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byn.d(this);
      this.a(eam.j, 0.0F);
      this.c = new bsi(this, $$1);
      this.d = new bsf(this, $$1);
   }

   @Override
   protected void p() {
      this.bO.a(1, new byn.c(this, 1.0));
      this.bO.a(2, new byn.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byn.a(this, 1.0, false));
      this.bO.a(5, new byn.b(this, 1.0));
      this.bO.a(6, new byn.e(this, 1.0, this.dK().t_()));
      this.bO.a(7, new bqp(this, 1.0));
      this.bP.a(1, new brk(this, byn.class).a(bzu.class));
      this.bP.a(2, new brl<>(this, cbl.class, 10, true, false, this::l));
      this.bP.a(3, new brl<>(this, cat.class, false));
      this.bP.a(3, new brl<>(this, buu.class, true));
      this.bP.a(3, new brl<>(this, bvp.class, true, false));
      this.bP.a(5, new brl<>(this, bvj.class, 10, true, false, bvj.bU));
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bil.b).b() && $$0.y_().i() < 0.03F) {
         this.a(bil.b, new ciw(ciz.uX));
         this.e(bil.b);
      }

      return $$3;
   }

   public static boolean a(bik<byn> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      if (!$$1.b_($$3.d()).a(apo.a)) {
         return false;
      } else {
         hf<cqi> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgl.a && a($$1, $$3, $$4) && ($$2 == bja.c || $$1.b_($$3).a(apo.a));
         return $$5.a(api.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpl $$0, gv $$1) {
      return $$1.v() < $$0.t_() - 5;
   }

   @Override
   protected boolean q() {
      return false;
   }

   @Override
   protected aot r() {
      return this.aX() ? aou.gx : aou.gw;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.aX() ? aou.gB : aou.gA;
   }

   @Override
   protected aot h_() {
      return this.aX() ? aou.gz : aou.gy;
   }

   @Override
   protected aot t() {
      return aou.gD;
   }

   @Override
   protected aot aL() {
      return aou.gE;
   }

   @Override
   protected ciw fZ() {
      return ciw.b;
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bil.a, new ciw(ciz.uV));
         } else {
            this.a(bil.a, new ciw(ciz.qh));
         }
      }
   }

   @Override
   protected boolean b(ciw $$0, ciw $$1) {
      if ($$1.a(ciz.uX)) {
         return false;
      } else if ($$1.a(ciz.uV)) {
         return $$0.a(ciz.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(ciz.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ga() {
      return false;
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this);
   }

   public boolean l(@Nullable biw $$0) {
      return $$0 != null ? !this.dK().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean gj() {
      if (this.bX) {
         return true;
      } else {
         biw $$0 = this.j();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(ehf $$0) {
      if (this.cW() && this.aX() && this.gj()) {
         this.a(0.01F, $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dK().B) {
         if (this.cX() && this.aX() && this.gj()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bZ() {
      return this.bY();
   }

   protected boolean gb() {
      eaq $$0 = this.H().j();
      if ($$0 != null) {
         gv $$1 = $$0.l();
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
   public void a(biw $$0, float $$1) {
      ccp $$2 = new ccp(this.dK(), this, new ciw(ciz.uV));
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dr();
      double $$5 = $$0.dv() - this.dv();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aou.gC, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends brh {
      private final byn b;

      public a(byn $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.l(this.b.j());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.l(this.b.j());
      }
   }

   static class b extends bqf {
      private final byn g;

      public b(byn $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dK().N() && this.g.aX() && this.g.dr() >= (double)(this.g.dK().t_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cpn $$0, gv $$1) {
         gv $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
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

   static class c extends bps {
      private final bjf a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpk f;

      public c(bjf $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dK();
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            ehf $$0 = this.h();
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
         return !this.a.H().l();
      }

      @Override
      public void c() {
         this.a.H().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ehf h() {
         art $$0 = this.a.ee();
         gv $$1 = this.a.dk();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gv $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csl.G)) {
               return ehf.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bov {
      private final byn l;

      public d(byn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         biw $$0 = this.l.j();
         if (this.l.gj() && this.l.aX()) {
            if ($$0 != null && $$0.dr() > this.l.dr() || this.l.bX) {
               this.l.f(this.l.dn().b(0.0, 0.002, 0.0));
            }

            if (this.k != bov.a.b || this.l.H().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dp();
            double $$2 = this.f - this.l.dr();
            double $$3 = this.g - this.l.dv();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aro.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dA(), $$5, 90.0F));
            this.l.aU = this.l.dA();
            float $$6 = (float)(this.h * this.l.b(bkd.d));
            float $$7 = aro.i(0.125F, this.l.fd(), $$6);
            this.l.w($$7);
            this.l.f(this.l.dn().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aA()) {
               this.l.f(this.l.dn().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bps {
      private final byn a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byn $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dK().N() && this.a.aX() && this.a.dr() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dr() < (double)(this.c - 1) && (this.a.H().l() || this.a.gb())) {
            ehf $$0 = btn.a(this.a, 4, 8, new ehf(this.a.dp(), (double)(this.c - 1), this.a.dv()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.H().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends bqr {
      private final byn a;

      public f(bzd $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byn)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eR().a(ciz.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bgn.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fr();
         this.a.v(false);
      }
   }
}
