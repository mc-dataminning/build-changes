import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cde extends ccd {
   private static final aiy<ib> ca = ajc.a(cde.class, aja.n);
   private static final aiy<Boolean> cb = ajc.a(cde.class, aja.k);
   private static final aiy<Boolean> cc = ajc.a(cde.class, aja.k);
   private static final aiy<ib> cd = ajc.a(cde.class, aja.n);
   private static final aiy<Boolean> ce = ajc.a(cde.class, aja.k);
   private static final aiy<Boolean> cf = ajc.a(cde.class, aja.k);
   public static final cvg bX = cvg.a(dca.bw.p());
   private static final float cg = 0.3F;
   private static final bpy ch = bqb.bg.n().a(bpx.a().a(bpw.a, 0.0F, bqb.bg.l(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bqo> bY = $$0 -> $$0.p_() && !$$0.bc();

   public cde(bqb<? extends cde> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.j, 0.0F);
      this.a(elj.t, -1.0F);
      this.a(elj.s, -1.0F);
      this.a(elj.r, -1.0F);
      this.bO = new cde.e(this);
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

   public boolean u() {
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
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ca, ib.c);
      $$0.a(cb, false);
      $$0.a(cd, ib.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(tm $$0) {
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
   public void a(tm $$0) {
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
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.i(this.dm());
      this.j(ib.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bqb<cde> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$3.v() < $$1.z_() + 4 && dkp.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bR.a(0, new cde.f(this, 1.2));
      this.bR.a(1, new cde.a(this, 1.0));
      this.bR.a(1, new cde.d(this, 1.0));
      this.bR.a(2, new byt(this, 1.1, bX, false));
      this.bR.a(3, new cde.c(this, 1.0));
      this.bR.a(4, new cde.b(this, 1.0));
      this.bR.a(7, new cde.i(this, 1.0));
      this.bR.a(8, new bxt(this, cjt.class, 8.0F));
      this.bR.a(9, new cde.h(this, 1.0, 100));
   }

   public static bru.a y() {
      return bqq.A().a(brv.q, 30.0).a(brv.r, 0.25).a(brv.v, 1.0);
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
   protected aul v() {
      return !this.bc() && this.aC() && !this.p_() ? aum.zJ : super.v();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected aul aN() {
      return aum.zU;
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return this.p_() ? aum.zQ : aum.zP;
   }

   @Nullable
   @Override
   protected aul o_() {
      return this.p_() ? aum.zL : aum.zK;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      aul $$2 = this.p_() ? aum.zT : aum.zS;
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
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cde.g(this, $$0);
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return bqb.bg.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(dca.bw.p());
   }

   @Override
   public float a(ib $$0, cza $$1) {
      if (!this.gu() && $$1.b_($$0).a(avh.a)) {
         return 10.0F;
      } else {
         return dkp.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bA() && this.u() && this.ci >= 1 && this.ci % 5 == 0) {
         ib $$0 = this.dm();
         if (dkp.a(this.dM(), $$0)) {
            this.dM().c(2001, $$0, dby.i(this.dM().a_($$0.d())));
            this.a(dts.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dM().aa().b(cyt.f)) {
         this.a(crm.oo, 1);
      }
   }

   @Override
   public void a(esa $$0) {
      if (this.cX() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null && (!this.gu() || !this.gn().a(this.dk(), 20.0))) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return false;
   }

   @Override
   public void a(aps $$0, bqn $$1) {
      this.a(this.dN().b(), Float.MAX_VALUE);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends bwx {
      private final cde d;

      a(cde $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }

      @Override
      protected void g() {
         apt $$0 = this.a.gq();
         if ($$0 == null && this.c.gq() != null) {
            $$0 = this.c.gq();
         }

         if ($$0 != null) {
            $$0.a(auw.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gs();
         this.c.gs();
         axr $$1 = this.a.ei();
         if (this.b.aa().b(cyt.f)) {
            this.b.b(new bqe(this.b, this.a.dr(), this.a.dt(), this.a.dx(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bxl {
      private final cde a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cde $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.p_()) {
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
            esa $$2 = esa.c($$0);
            esa $$3 = cbi.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cbi.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dM().a_(ib.a($$3)).a(dca.G)) {
               $$3 = cbi.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.K().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bxy {
      private static final int g = 1200;
      private final cde h;

      c(cde $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bc() && this.d <= 1200 && this.a(this.h.dM(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.p_() && !this.h.bc()) {
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
      protected boolean a(cza $$0, ib $$1) {
         return $$0.a_($$1).a(dca.G);
      }
   }

   static class d extends bxy {
      private final cde g;

      d(cde $$0, double $$1) {
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
               cyx $$1 = this.g.dM();
               $$1.a(null, $$0, aum.zR, aun.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ib $$2 = this.e.c();
               doz $$3 = dca.mf.n().a(dkp.f, Integer.valueOf(this.g.ag.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dts.i, $$2, dts.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.u()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(cza $$0, ib $$1) {
         return !$$0.u($$1.c()) ? false : dkp.b($$0, $$1);
      }
   }

   static class e extends bwo {
      private final cde l;

      e(cde $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bc()) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
            if (!this.l.gn().a(this.l.dk(), 16.0)) {
               this.l.y(Math.max(this.l.fk() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.y(Math.max(this.l.fk() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.y(Math.max(this.l.fk() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bwo.a.b && !this.l.K().l()) {
            double $$0 = this.e - this.l.dr();
            double $$1 = this.f - this.l.dt();
            double $$2 = this.g - this.l.dx();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.y(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(axk.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$4, 90.0F));
               this.l.aX = this.l.dC();
               float $$5 = (float)(this.h * this.l.g(brv.r));
               this.l.y(axk.i(0.125F, this.l.fk(), $$5));
               this.l.g(this.l.dp().b(0.0, (double)this.l.fk() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class f extends bye {
      f(cde $$0, double $$1) {
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

   static class g extends bzw {
      g(cde $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ib $$0) {
         if (this.a instanceof cde $$1 && $$1.gv()) {
            return this.b.a_($$0).a(dca.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends byi {
      private final cde i;

      h(cde $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bc() && !this.i.gu() && !this.i.r() ? super.a() : false;
      }
   }

   static class i extends bxl {
      private final cde a;
      private final double b;
      private boolean c;

      i(cde $$0, double $$1) {
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
         axr $$2 = this.a.ag;
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
            esa $$0 = esa.c(this.a.gt());
            esa $$1 = cbi.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cbi.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = axk.a($$1.c);
               int $$3 = axk.a($$1.e);
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
