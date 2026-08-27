import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccf extends cbe {
   private static final aim<ib> ca = aiq.a(ccf.class, aio.n);
   private static final aim<Boolean> cb = aiq.a(ccf.class, aio.k);
   private static final aim<Boolean> cc = aiq.a(ccf.class, aio.k);
   private static final aim<ib> cd = aiq.a(ccf.class, aio.n);
   private static final aim<Boolean> ce = aiq.a(ccf.class, aio.k);
   private static final aim<Boolean> cf = aiq.a(ccf.class, aio.k);
   public static final ctm bX = ctm.a(dae.bw.l());
   private static final float cg = 0.3F;
   private static final bpa ch = bpd.bh.n().a(boz.a().a(boy.a, 0.0F, bpd.bh.l(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bpp> bY = $$0 -> $$0.o_() && !$$0.bc();

   public ccf(bpd<? extends ccf> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.j, 0.0F);
      this.a(ejg.t, -1.0F);
      this.a(ejg.s, -1.0F);
      this.a(ejg.r, -1.0F);
      this.bO = new ccf.e(this);
   }

   public void i(ib $$0) {
      this.an.a(ca, $$0);
   }

   ib gn() {
      return this.an.a(ca);
   }

   void j(ib $$0) {
      this.an.a(cd, $$0);
   }

   ib gt() {
      return this.an.a(cd);
   }

   public boolean r() {
      return this.an.a(cb);
   }

   void w(boolean $$0) {
      this.an.a(cb, $$0);
   }

   public boolean s() {
      return this.an.a(cc);
   }

   void x(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.an.a(cc, $$0);
   }

   boolean gu() {
      return this.an.a(ce);
   }

   void y(boolean $$0) {
      this.an.a(ce, $$0);
   }

   boolean gv() {
      return this.an.a(cf);
   }

   void z(boolean $$0) {
      this.an.a(cf, $$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ca, ib.c);
      $$0.a(cb, false);
      $$0.a(cd, ib.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gn().u());
      $$0.a("HomePosY", this.gn().v());
      $$0.a("HomePosZ", this.gn().w());
      $$0.a("HasEgg", this.r());
      $$0.a("TravelPosX", this.gt().u());
      $$0.a("TravelPosY", this.gt().v());
      $$0.a("TravelPosZ", this.gt().w());
   }

   @Override
   public void a(ta $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new ib($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new ib($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.i(this.dm());
      this.j(ib.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bpd<ccf> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$3.v() < $$1.z_() + 4 && dit.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bR.a(0, new ccf.f(this, 1.2));
      this.bR.a(1, new ccf.a(this, 1.0));
      this.bR.a(1, new ccf.d(this, 1.0));
      this.bR.a(2, new bxu(this, 1.1, bX, false));
      this.bR.a(3, new ccf.c(this, 1.0));
      this.bR.a(4, new ccf.b(this, 1.0));
      this.bR.a(7, new ccf.i(this, 1.0));
      this.bR.a(8, new bwu(this, ciu.class, 8.0F));
      this.bR.a(9, new ccf.h(this, 1.0, 100));
   }

   public static bqv.a y() {
      return bpr.A().a(bqw.q, 30.0).a(bqw.r, 0.25).a(bqw.v, 1.0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public int O() {
      return 200;
   }

   @Nullable
   @Override
   protected atx v() {
      return !this.bc() && this.aC() && !this.o_() ? aty.zG : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected atx aN() {
      return aty.zR;
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return this.o_() ? aty.zN : aty.zM;
   }

   @Nullable
   @Override
   protected atx n_() {
      return this.o_() ? aty.zI : aty.zH;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      atx $$2 = this.o_() ? aty.zQ : aty.zP;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean go() {
      return super.go() && !this.r();
   }

   @Override
   protected float aM() {
      return this.Z + 0.15F;
   }

   @Override
   public float ea() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected bza b(cxb $$0) {
      return new ccf.g(this, $$0);
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      return bpd.bh.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(dae.bw.l());
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      if (!this.gu() && $$1.b_($$0).a(aus.a)) {
         return 10.0F;
      } else {
         return dit.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bA() && this.s() && this.ci >= 1 && this.ci % 5 == 0) {
         ib $$0 = this.dm();
         if (dit.a(this.dM(), $$0)) {
            this.dM().c(2001, $$0, dac.i(this.dM().a_($$0.d())));
            this.b(drp.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dM().Z().b(cwx.f)) {
         this.a(cqp.oo, 1);
      }
   }

   @Override
   public void a(ept $$0) {
      if (this.cX() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(bpu.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null && (!this.gu() || !this.gn().a(this.dk(), 20.0))) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return false;
   }

   @Override
   public void a(apf $$0, bpo $$1) {
      this.a(this.dN().b(), Float.MAX_VALUE);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? ch : super.e($$0);
   }

   static class a extends bvy {
      private final ccf d;

      a(ccf $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }

      @Override
      protected void g() {
         apg $$0 = this.a.gq();
         if ($$0 == null && this.c.gq() != null) {
            $$0 = this.c.gq();
         }

         if ($$0 != null) {
            $$0.a(aui.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gs();
         this.c.gs();
         axd $$1 = this.a.ei();
         if (this.b.Z().b(cwx.f)) {
            this.b.b(new bpf(this.b, this.a.dr(), this.a.dt(), this.a.dx(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bwm {
      private final ccf a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(ccf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.r()) {
            return true;
         } else {
            return this.a.ei().a(b(700)) != 0 ? false : !this.a.gn().a(this.a.dk(), 64.0);
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
         return !this.a.gn().a(this.a.dk(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gn();
         boolean $$1 = $$0.a(this.a.dk(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.K().l()) {
            ept $$2 = ept.c($$0);
            ept $$3 = caj.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = caj.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dM().a_(ib.a($$3)).a(dae.G)) {
               $$3 = caj.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bwz {
      private static final int g = 1200;
      private final ccf h;

      c(ccf $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bc() && this.d <= 1200 && this.a(this.h.dM(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.bc()) {
            return super.a();
         } else {
            return !this.h.gu() && !this.h.bc() && !this.h.r() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cxe $$0, ib $$1) {
         return $$0.a_($$1).a(dae.G);
      }
   }

   static class d extends bwz {
      private final ccf g;

      d(ccf $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.r() && this.g.gn().a(this.g.dk(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.r() && this.g.gn().a(this.g.dk(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ib $$0 = this.g.dm();
         if (!this.g.bc() && this.m()) {
            if (this.g.ci < 1) {
               this.g.x(true);
            } else if (this.g.ci > this.a(200)) {
               cxb $$1 = this.g.dM();
               $$1.a(null, $$0, aty.zO, atz.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ib $$2 = this.e.c();
               dnb $$3 = dae.mf.o().a(dit.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(drp.i, $$2, drp.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.s()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(cxe $$0, ib $$1) {
         return !$$0.u($$1.c()) ? false : dit.b($$0, $$1);
      }
   }

   static class e extends bvp {
      private final ccf l;

      e(ccf $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bc()) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
            if (!this.l.gn().a(this.l.dk(), 16.0)) {
               this.l.y(Math.max(this.l.fk() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.y(Math.max(this.l.fk() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.y(Math.max(this.l.fk() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bvp.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.dr();
            double $$1 = this.f - this.l.dt();
            double $$2 = this.g - this.l.dx();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(aww.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$4, 90.0F));
               this.l.aX = this.l.dC();
               float $$5 = (float)(this.h * this.l.g(bqw.r));
               this.l.y(aww.i(0.125F, this.l.fk(), $$5));
               this.l.g(this.l.dp().b(0.0, (double)this.l.fk() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends bxf {
      f(ccf $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ib $$0 = this.a(this.b.dM(), this.b, 7);
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

   static class g extends byx {
      g(ccf $$0, cxb $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ib $$0) {
         if (this.a instanceof ccf $$1 && $$1.gv()) {
            return this.b.a_($$0).a(dae.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bxj {
      private final ccf i;

      h(ccf $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bc() && !this.i.gu() && !this.i.r() ? super.a() : false;
      }
   }

   static class i extends bwm {
      private final ccf a;
      private final double b;
      private boolean c;

      i(ccf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gu() && !this.a.r() && this.a.bc();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         axd $$2 = this.a.ag;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dt() > (double)(this.a.dM().z_() - 1)) {
            $$4 = 0;
         }

         ib $$6 = ib.a((double)$$3 + this.a.dr(), (double)$$4 + this.a.dt(), (double)$$5 + this.a.dx());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            ept $$0 = ept.c(this.a.gt());
            ept $$1 = caj.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = caj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = aww.a($$1.c);
               int $$3 = aww.a($$1.e);
               int $$4 = 34;
               if (!this.a.dM().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l() && !this.c && !this.a.gu() && !this.a.gr() && !this.a.r();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
