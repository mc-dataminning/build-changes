import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvl extends buk {
   private static final adz<gu> bW = aec.a(bvl.class, aeb.n);
   private static final adz<Boolean> bX = aec.a(bvl.class, aeb.k);
   private static final adz<Boolean> bY = aec.a(bvl.class, aeb.k);
   private static final adz<gu> bZ = aec.a(bvl.class, aeb.n);
   private static final adz<Boolean> ca = aec.a(bvl.class, aeb.k);
   private static final adz<Boolean> cb = aec.a(bvl.class, aeb.k);
   public static final cly bT = cly.a(csn.bw.k());
   int cc;
   public static final Predicate<biy> bU = $$0 -> $$0.i_() && !$$0.aX();

   public bvl(bim<? extends bvl> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.j, 0.0F);
      this.a(eao.t, -1.0F);
      this.a(eao.s, -1.0F);
      this.a(eao.r, -1.0F);
      this.bL = new bvl.e(this);
      this.t(1.0F);
   }

   public void i(gu $$0) {
      this.an.b(bW, $$0);
   }

   gu fZ() {
      return this.an.b(bW);
   }

   void j(gu $$0) {
      this.an.b(bZ, $$0);
   }

   gu gf() {
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
      this.an.a(bW, gu.b);
      this.an.a(bX, false);
      this.an.a(bZ, gu.b);
      this.an.a(ca, false);
      this.an.a(cb, false);
      this.an.a(bY, false);
   }

   @Override
   public void b(qr $$0) {
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
   public void a(qr $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new gu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new gu($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.i(this.dk());
      this.j(gu.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bim<bvl> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$3.v() < $$1.t_() + 4 && dbd.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bvl.f(this, 1.2));
      this.bO.a(1, new bvl.a(this, 1.0));
      this.bO.a(1, new bvl.d(this, 1.0));
      this.bO.a(2, new brc(this, 1.1, bT, false));
      this.bO.a(3, new bvl.c(this, 1.0));
      this.bO.a(4, new bvl.b(this, 1.0));
      this.bO.a(7, new bvl.i(this, 1.0));
      this.bO.a(8, new bqc(this, cbn.class, 8.0F));
      this.bO.a(9, new bvl.h(this, 1.0, 100));
   }

   public static bke.a t() {
      return bja.x().a(bkf.a, 30.0).a(bkf.d, 0.25);
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
   public bjd eQ() {
      return bjd.e;
   }

   @Override
   public int L() {
      return 200;
   }

   @Nullable
   @Override
   protected aov r() {
      return !this.aX() && this.aA() && !this.i_() ? aow.yd : super.r();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aov aL() {
      return aow.yo;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return this.i_() ? aow.yk : aow.yj;
   }

   @Nullable
   @Override
   protected aov h_() {
      return this.i_() ? aow.yf : aow.ye;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      aov $$2 = this.i_() ? aow.yn : aow.ym;
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
   protected bsi b(cpm $$0) {
      return new bvl.g(this, $$0);
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.bd.a((cpm)$$0);
   }

   @Override
   public boolean m(ciy $$0) {
      return $$0.a(csn.bw.k());
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      if (!this.gg() && $$1.b_($$0).a(apq.a)) {
         return 10.0F;
      } else {
         return dbd.a($$1, $$0) ? 10.0F : $$1.v($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.q() && this.cc >= 1 && this.cc % 5 == 0) {
         gu $$0 = this.dk();
         if (dbd.a(this.dK(), $$0)) {
            this.dK().c(2001, $$0, csm.i(this.dK().a_($$0.d())));
            this.a(djk.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.i_() && this.dK().X().b(cpi.f)) {
         this.a(cjb.nD, 1);
      }
   }

   @Override
   public void h(ehe $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null && (!this.gg() || !this.fZ().a(this.di(), 20.0))) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return false;
   }

   @Override
   public void a(akk $$0, bix $$1) {
      this.a(this.dL().b(), Float.MAX_VALUE);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + (this.i_() ? 0.0F : 0.15625F) * $$2, -0.25F * $$2);
   }

   static class a extends bpg {
      private final bvl d;

      a(bvl $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.p();
      }

      @Override
      protected void g() {
         akl $$0 = this.a.gc();
         if ($$0 == null && this.c.gc() != null) {
            $$0 = this.c.gc();
         }

         if ($$0 != null) {
            $$0.a(apg.P);
            ai.o.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.ge();
         this.c.ge();
         aru $$1 = this.a.ee();
         if (this.b.X().b(cpi.f)) {
            this.b.b(new bio(this.b, this.a.dp(), this.a.dr(), this.a.dv(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bpu {
      private final bvl a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bvl $$0, double $$1) {
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
         gu $$0 = this.a.fZ();
         boolean $$1 = $$0.a(this.a.di(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.H().l()) {
            ehe $$2 = ehe.c($$0);
            ehe $$3 = btp.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = btp.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dK().a_(gu.a($$3)).a(csn.G)) {
               $$3 = btp.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.H().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bqh {
      private static final int g = 1200;
      private final bvl h;

      c(bvl $$0, double $$1) {
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
      protected boolean a(cpp $$0, gu $$1) {
         return $$0.a_($$1).a(csn.G);
      }
   }

   static class d extends bqh {
      private final bvl g;

      d(bvl $$0, double $$1) {
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
         gu $$0 = this.g.dk();
         if (!this.g.aX() && this.m()) {
            if (this.g.cc < 1) {
               this.g.x(true);
            } else if (this.g.cc > this.a(200)) {
               cpm $$1 = this.g.dK();
               $$1.a(null, $$0, aow.yl, aox.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               gu $$2 = this.e.c();
               dfa $$3 = csn.mf.n().a(dbd.e, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(djk.i, $$2, djk.a.a(this.g, $$3));
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
      protected boolean a(cpp $$0, gu $$1) {
         return !$$0.t($$1.c()) ? false : dbd.b($$0, $$1);
      }
   }

   static class e extends box {
      private final bvl l;

      e(bvl $$0) {
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
         if (this.k == box.a.b && !this.l.H().l()) {
            double $$0 = this.e - this.l.dp();
            double $$1 = this.f - this.l.dr();
            double $$2 = this.g - this.l.dv();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(arp.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dA(), $$4, 90.0F));
               this.l.aU = this.l.dA();
               float $$5 = (float)(this.h * this.l.b(bkf.d));
               this.l.w(arp.i(0.125F, this.l.fd(), $$5));
               this.l.f(this.l.dn().b(0.0, (double)this.l.fd() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bqn {
      f(bvl $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            gu $$0 = this.a(this.b.dK(), this.b, 7);
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

   static class g extends bsf {
      g(bvl $$0, cpm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(gu $$0) {
         if (this.a instanceof bvl $$1 && $$1.gh()) {
            return this.b.a_($$0).a(csn.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bqr {
      private final bvl i;

      h(bvl $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aX() && !this.i.gg() && !this.i.p() ? super.a() : false;
      }
   }

   static class i extends bpu {
      private final bvl a;
      private final double b;
      private boolean c;

      i(bvl $$0, double $$1) {
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
         aru $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dr() > (double)(this.a.dK().t_() - 1)) {
            $$4 = 0;
         }

         gu $$6 = gu.a((double)$$3 + this.a.dp(), (double)$$4 + this.a.dr(), (double)$$5 + this.a.dv());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.H().l()) {
            ehe $$0 = ehe.c(this.a.gf());
            ehe $$1 = btp.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = btp.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = arp.a($$1.c);
               int $$3 = arp.a($$1.e);
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
