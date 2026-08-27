import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvu extends but {
   private static final aeg<gw> bW = aej.a(bvu.class, aei.n);
   private static final aeg<Boolean> bX = aej.a(bvu.class, aei.k);
   private static final aeg<Boolean> bY = aej.a(bvu.class, aei.k);
   private static final aeg<gw> bZ = aej.a(bvu.class, aei.n);
   private static final aeg<Boolean> ca = aej.a(bvu.class, aei.k);
   private static final aeg<Boolean> cb = aej.a(bvu.class, aei.k);
   public static final cmi bT = cmi.a(csy.bw.k());
   int cc;
   public static final Predicate<bji> bU = $$0 -> $$0.m_() && !$$0.aX();

   public bvu(biw<? extends bvu> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.j, 0.0F);
      this.a(eaz.t, -1.0F);
      this.a(eaz.s, -1.0F);
      this.a(eaz.r, -1.0F);
      this.bL = new bvu.e(this);
      this.t(1.0F);
   }

   public void i(gw $$0) {
      this.an.b(bW, $$0);
   }

   gw gd() {
      return this.an.b(bW);
   }

   void j(gw $$0) {
      this.an.b(bZ, $$0);
   }

   gw gj() {
      return this.an.b(bZ);
   }

   public boolean s() {
      return this.an.b(bX);
   }

   void w(boolean $$0) {
      this.an.b(bX, $$0);
   }

   public boolean t() {
      return this.an.b(bY);
   }

   void x(boolean $$0) {
      this.cc = $$0 ? 1 : 0;
      this.an.b(bY, $$0);
   }

   boolean gk() {
      return this.an.b(ca);
   }

   void y(boolean $$0) {
      this.an.b(ca, $$0);
   }

   boolean gl() {
      return this.an.b(cb);
   }

   void z(boolean $$0) {
      this.an.b(cb, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, gw.b);
      this.an.a(bX, false);
      this.an.a(bZ, gw.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gd().u());
      $$0.a("HomePosY", this.gd().v());
      $$0.a("HomePosZ", this.gd().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gj().u());
      $$0.a("TravelPosY", this.gj().v());
      $$0.a("TravelPosZ", this.gj().w());
   }

   @Override
   public void a(qy $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new gw($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new gw($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.i(this.dl());
      this.j(gw.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(biw<bvu> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$3.v() < $$1.y_() + 4 && dbo.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bvu.f(this, 1.2));
      this.bO.a(1, new bvu.a(this, 1.0));
      this.bO.a(1, new bvu.d(this, 1.0));
      this.bO.a(2, new brl(this, 1.1, bT, false));
      this.bO.a(3, new bvu.c(this, 1.0));
      this.bO.a(4, new bvu.b(this, 1.0));
      this.bO.a(7, new bvu.i(this, 1.0));
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(9, new bvu.h(this, 1.0, 100));
   }

   public static bkn.a y() {
      return bjk.A().a(bko.a, 30.0).a(bko.d, 0.25);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   public bjn eR() {
      return bjn.e;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected ape w() {
      return !this.aX() && this.aA() && !this.m_() ? apf.yi : super.w();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected ape aL() {
      return apf.yt;
   }

   @Nullable
   @Override
   protected ape d(bhq $$0) {
      return this.m_() ? apf.yp : apf.yo;
   }

   @Nullable
   @Override
   protected ape l_() {
      return this.m_() ? apf.yk : apf.yj;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      ape $$2 = this.m_() ? apf.ys : apf.yr;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean ge() {
      return super.ge() && !this.s();
   }

   @Override
   protected float aK() {
      return this.Z + 0.15F;
   }

   @Override
   public float dY() {
      return this.m_() ? 0.3F : 1.0F;
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bvu.g(this, $$0);
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      return biw.bd.a((cpx)$$0);
   }

   @Override
   public boolean m(cjh $$0) {
      return $$0.a(csy.bw.k());
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      if (!this.gk() && $$1.b_($$0).a(apz.a)) {
         return 10.0F;
      } else {
         return dbo.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.t() && this.cc >= 1 && this.cc % 5 == 0) {
         gw $$0 = this.dl();
         if (dbo.a(this.dL(), $$0)) {
            this.dL().c(2001, $$0, csx.i(this.dL().a_($$0.d())));
            this.a(djv.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.m_() && this.dL().X().b(cpt.f)) {
         this.a(cjk.nD, 1);
      }
   }

   @Override
   public void h(ehp $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjo.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null && (!this.gk() || !this.gd().a(this.dj(), 20.0))) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return false;
   }

   @Override
   public void a(aks $$0, bjh $$1) {
      this.a(this.dM().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.m_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bpp {
      private final bvu d;

      a(bvu $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         akt $$0 = this.a.gg();
         if ($$0 == null && this.c.gg() != null) {
            $$0 = this.c.gg();
         }

         if ($$0 != null) {
            $$0.a(app.P);
            al.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gi();
         this.c.gi();
         ase $$1 = this.a.ef();
         if (this.b.X().b(cpt.f)) {
            this.b.b(new biy(this.b, this.a.dq(), this.a.ds(), this.a.dw(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bqd {
      private final bvu a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bvu $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.m_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.ef().a(b(700)) != 0 ? false : !this.a.gd().a(this.a.dj(), 64.0);
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
         return !this.a.gd().a(this.a.dj(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         gw $$0 = this.a.gd();
         boolean $$1 = $$0.a(this.a.dj(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.L().l()) {
            ehp $$2 = ehp.c($$0);
            ehp $$3 = bty.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bty.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dL().a_(gw.a($$3)).a(csy.G)) {
               $$3 = bty.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bqq {
      private static final int g = 1200;
      private final bvu h;

      c(bvu $$0, double $$1) {
         super($$0, $$0.m_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aX() && this.d <= 1200 && this.a(this.h.dL(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.m_() && !this.h.aX()) {
            return super.a();
         } else {
            return !this.h.gk() && !this.h.aX() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cqa $$0, gw $$1) {
         return $$0.a_($$1).a(csy.G);
      }
   }

   static class d extends bqq {
      private final bvu g;

      d(bvu $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.gd().a(this.g.dj(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.gd().a(this.g.dj(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         gw $$0 = this.g.dl();
         if (!this.g.aX() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cpx $$1 = this.g.dL();
               $$1.a(null, $$0, apf.yq, apg.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               gw $$2 = this.e.c();
               dfl $$3 = csy.mf.n().a(dbo.e, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(djv.i, $$2, djv.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.cc++;
            }
         }
      }

      @Override
      protected boolean a(cqa $$0, gw $$1) {
         return !$$0.t($$1.c()) ? false : dbo.b($$0, $$1);
      }
   }

   static class e extends bpg {
      private final bvu l;

      e(bvu $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aX()) {
            this.l.f(this.l.do().b(0.0, 0.005, 0.0));
            if (!this.l.gd().a(this.l.dj(), 16.0)) {
               this.l.w(Math.max(this.l.fe() / 2.0F, 0.08F));
            }

            if (this.l.m_()) {
               this.l.w(Math.max(this.l.fe() / 3.0F, 0.06F));
            }
         } else if (this.l.aA()) {
            this.l.w(Math.max(this.l.fe() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bpg.a.b && !this.l.L().l()) {
            double $$0 = this.e - this.l.dq();
            double $$1 = this.f - this.l.ds();
            double $$2 = this.g - this.l.dw();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ary.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dB(), $$4, 90.0F));
               this.l.aU = this.l.dB();
               float $$5 = (float)(this.h * this.l.b(bko.d));
               this.l.w(ary.i(0.125F, this.l.fe(), $$5));
               this.l.f(this.l.do().b(0.0, (double)this.l.fe() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bqw {
      f(bvu $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            gw $$0 = this.a(this.b.dL(), this.b, 7);
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

   static class g extends bso {
      g(bvu $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(gw $$0) {
         if (this.a instanceof bvu $$1 && $$1.gl()) {
            return this.b.a_($$0).a(csy.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bra {
      private final bvu i;

      h(bvu $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aX() && !this.i.gk() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends bqd {
      private final bvu a;
      private final double b;
      private boolean c;

      i(bvu $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gk() && !this.a.s() && this.a.aX();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ase $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.ds() > (double)(this.a.dL().y_() - 1)) {
            $$4 = 0;
         }

         gw $$6 = gw.a((double)$$3 + this.a.dq(), (double)$$4 + this.a.ds(), (double)$$5 + this.a.dw());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.L().l()) {
            ehp $$0 = ehp.c(this.a.gj());
            ehp $$1 = bty.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bty.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ary.a($$1.c);
               int $$3 = ary.a($$1.e);
               int $$4 = 34;
               if (!this.a.dL().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.L().l() && !this.c && !this.a.gk() && !this.a.gh() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
