import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvj extends bui {
   private static final adx<gv> bW = aea.a(bvj.class, adz.n);
   private static final adx<Boolean> bX = aea.a(bvj.class, adz.k);
   private static final adx<Boolean> bY = aea.a(bvj.class, adz.k);
   private static final adx<gv> bZ = aea.a(bvj.class, adz.n);
   private static final adx<Boolean> ca = aea.a(bvj.class, adz.k);
   private static final adx<Boolean> cb = aea.a(bvj.class, adz.k);
   public static final clw bT = clw.a(csl.bw.k());
   int cc;
   public static final Predicate<biw> bU = $$0 -> $$0.i_() && !$$0.aX();

   public bvj(bik<? extends bvj> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.j, 0.0F);
      this.a(eam.t, -1.0F);
      this.a(eam.s, -1.0F);
      this.a(eam.r, -1.0F);
      this.bL = new bvj.e(this);
      this.t(1.0F);
   }

   public void i(gv $$0) {
      this.an.b(bW, $$0);
   }

   gv fZ() {
      return this.an.b(bW);
   }

   void j(gv $$0) {
      this.an.b(bZ, $$0);
   }

   gv gf() {
      return this.an.b(bZ);
   }

   @Override
   public boolean p() {
      return this.an.b(bX);
   }

   void w(boolean $$0) {
      this.an.b(bX, $$0);
   }

   public boolean q() {
      return this.an.b(bY);
   }

   void x(boolean $$0) {
      this.cc = $$0 ? 1 : 0;
      this.an.b(bY, $$0);
   }

   boolean gg() {
      return this.an.b(ca);
   }

   void y(boolean $$0) {
      this.an.b(ca, $$0);
   }

   boolean gh() {
      return this.an.b(cb);
   }

   void z(boolean $$0) {
      this.an.b(cb, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, gv.b);
      this.an.a(bX, false);
      this.an.a(bZ, gv.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.fZ().u());
      $$0.a("HomePosY", this.fZ().v());
      $$0.a("HomePosZ", this.fZ().w());
      $$0.a("HasEgg", this.p());
      $$0.a("TravelPosX", this.gf().u());
      $$0.a("TravelPosY", this.gf().v());
      $$0.a("TravelPosZ", this.gf().w());
   }

   @Override
   public void a(qs $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new gv($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new gv($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.i(this.dk());
      this.j(gv.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bik<bvj> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$3.v() < $$1.t_() + 4 && dbb.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bvj.f(this, 1.2));
      this.bO.a(1, new bvj.a(this, 1.0));
      this.bO.a(1, new bvj.d(this, 1.0));
      this.bO.a(2, new bra(this, 1.1, bT, false));
      this.bO.a(3, new bvj.c(this, 1.0));
      this.bO.a(4, new bvj.b(this, 1.0));
      this.bO.a(7, new bvj.i(this, 1.0));
      this.bO.a(8, new bqa(this, cbl.class, 8.0F));
      this.bO.a(9, new bvj.h(this, 1.0, 100));
   }

   public static bkc.a t() {
      return biy.x().a(bkd.a, 30.0).a(bkd.d, 0.25);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public bjb eQ() {
      return bjb.e;
   }

   @Override
   public int L() {
      return 200;
   }

   @Nullable
   @Override
   protected aot r() {
      return !this.aX() && this.aA() && !this.i_() ? aou.yd : super.r();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aot aL() {
      return aou.yo;
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return this.i_() ? aou.yk : aou.yj;
   }

   @Nullable
   @Override
   protected aot h_() {
      return this.i_() ? aou.yf : aou.ye;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      aot $$2 = this.i_() ? aou.yn : aou.ym;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean ga() {
      return super.ga() && !this.p();
   }

   @Override
   protected float aK() {
      return this.Z + 0.15F;
   }

   @Override
   public float dX() {
      return this.i_() ? 0.3F : 1.0F;
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bvj.g(this, $$0);
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return bik.bd.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(csl.bw.k());
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      if (!this.gg() && $$1.b_($$0).a(apo.a)) {
         return 10.0F;
      } else {
         return dbb.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.q() && this.cc >= 1 && this.cc % 5 == 0) {
         gv $$0 = this.dk();
         if (dbb.a(this.dK(), $$0)) {
            this.dK().c(2001, $$0, csk.i(this.dK().a_($$0.d())));
            this.a(dji.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.i_() && this.dK().X().b(cpg.f)) {
         this.a(ciz.nD, 1);
      }
   }

   @Override
   public void h(ehf $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null && (!this.gg() || !this.fZ().a(this.di(), 20.0))) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return false;
   }

   @Override
   public void a(aki $$0, biv $$1) {
      this.a(this.dL().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.i_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bpe {
      private final bvj d;

      a(bvj $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.p();
      }

      @Override
      protected void g() {
         akj $$0 = this.a.gc();
         if ($$0 == null && this.c.gc() != null) {
            $$0 = this.c.gc();
         }

         if ($$0 != null) {
            $$0.a(ape.P);
            ai.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.ge();
         this.c.ge();
         art $$1 = this.a.ee();
         if (this.b.X().b(cpg.f)) {
            this.b.b(new bim(this.b, this.a.dp(), this.a.dr(), this.a.dv(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bps {
      private final bvj a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bvj $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.i_()) {
            return false;
         } else if (this.a.p()) {
            return true;
         } else {
            return this.a.ee().a(b(700)) != 0 ? false : !this.a.fZ().a(this.a.di(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.y(false);
      }

      @Override
      public boolean b() {
         return !this.a.fZ().a(this.a.di(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         gv $$0 = this.a.fZ();
         boolean $$1 = $$0.a(this.a.di(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.H().l()) {
            ehf $$2 = ehf.c($$0);
            ehf $$3 = btn.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = btn.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dK().a_(gv.a($$3)).a(csl.G)) {
               $$3 = btn.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.H().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bqf {
      private static final int g = 1200;
      private final bvj h;

      c(bvj $$0, double $$1) {
         super($$0, $$0.i_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aX() && this.d <= 1200 && this.a(this.h.dK(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.i_() && !this.h.aX()) {
            return super.a();
         } else {
            return !this.h.gg() && !this.h.aX() && !this.h.p() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cpn $$0, gv $$1) {
         return $$0.a_($$1).a(csl.G);
      }
   }

   static class d extends bqf {
      private final bvj g;

      d(bvj $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.p() && this.g.fZ().a(this.g.di(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.p() && this.g.fZ().a(this.g.di(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         gv $$0 = this.g.dk();
         if (!this.g.aX() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cpk $$1 = this.g.dK();
               $$1.a(null, $$0, aou.yl, aov.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               gv $$2 = this.e.c();
               dey $$3 = csl.mf.n().a(dbb.e, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dji.i, $$2, dji.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.q()) {
               this.g.cc++;
            }
         }
      }

      @Override
      protected boolean a(cpn $$0, gv $$1) {
         return !$$0.t($$1.c()) ? false : dbb.b($$0, $$1);
      }
   }

   static class e extends bov {
      private final bvj l;

      e(bvj $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aX()) {
            this.l.f(this.l.dn().b(0.0, 0.005, 0.0));
            if (!this.l.fZ().a(this.l.di(), 16.0)) {
               this.l.w(Math.max(this.l.fd() / 2.0F, 0.08F));
            }

            if (this.l.i_()) {
               this.l.w(Math.max(this.l.fd() / 3.0F, 0.06F));
            }
         } else if (this.l.aA()) {
            this.l.w(Math.max(this.l.fd() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bov.a.b && !this.l.H().l()) {
            double $$0 = this.e - this.l.dp();
            double $$1 = this.f - this.l.dr();
            double $$2 = this.g - this.l.dv();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aro.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dA(), $$4, 90.0F));
               this.l.aU = this.l.dA();
               float $$5 = (float)(this.h * this.l.b(bkd.d));
               this.l.w(aro.i(0.125F, this.l.fd(), $$5));
               this.l.f(this.l.dn().b(0.0, (double)this.l.fd() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bql {
      f(bvj $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            gv $$0 = this.a(this.b.dK(), this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends bsd {
      g(bvj $$0, cpk $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(gv $$0) {
         if (this.a instanceof bvj $$1 && $$1.gh()) {
            return this.b.a_($$0).a(csl.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bqp {
      private final bvj i;

      h(bvj $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aX() && !this.i.gg() && !this.i.p() ? super.a() : false;
      }
   }

   static class i extends bps {
      private final bvj a;
      private final double b;
      private boolean c;

      i(bvj $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gg() && !this.a.p() && this.a.aX();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         art $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dr() > (double)(this.a.dK().t_() - 1)) {
            $$4 = 0;
         }

         gv $$6 = gv.a((double)$$3 + this.a.dp(), (double)$$4 + this.a.dr(), (double)$$5 + this.a.dv());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.H().l()) {
            ehf $$0 = ehf.c(this.a.gf());
            ehf $$1 = btn.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = btn.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aro.a($$1.c);
               int $$3 = aro.a($$1.e);
               int $$4 = 34;
               if (!this.a.dK().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.H().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.H().l() && !this.c && !this.a.gg() && !this.a.gd() && !this.a.p();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
