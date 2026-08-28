import javax.annotation.Nullable;

public class cit extends chs {
   private static final alc<jh> ca = alg.a(cit.class, ale.o);
   private static final alc<Boolean> cb = alg.a(cit.class, ale.k);
   private static final alc<Boolean> cd = alg.a(cit.class, ale.k);
   private static final alc<jh> ce = alg.a(cit.class, ale.o);
   private static final alc<Boolean> cf = alg.a(cit.class, ale.k);
   private static final alc<Boolean> cg = alg.a(cit.class, ale.k);
   private static final float ch = 0.3F;
   private static final bvi ci = bvm.bB.n().a(bvh.a().a(bvg.a, 0.0F, bvm.bB.m(), -0.25F)).a(0.3F);
   int cj;
   public static final cgs.a bZ = ($$0, $$1) -> $$0.e_() && !$$0.bj();

   public cit(bvm<? extends cit> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.j, 0.0F);
      this.a(eug.t, -1.0F);
      this.a(eug.s, -1.0F);
      this.a(eug.r, -1.0F);
      this.bQ = new cit.e(this);
   }

   public void h(jh $$0) {
      this.al.a(ca, $$0);
   }

   jh gm() {
      return this.al.a(ca);
   }

   void i(jh $$0) {
      this.al.a(ce, $$0);
   }

   jh gn() {
      return this.al.a(ce);
   }

   public boolean p() {
      return this.al.a(cb);
   }

   void x(boolean $$0) {
      this.al.a(cb, $$0);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   void y(boolean $$0) {
      this.cj = $$0 ? 1 : 0;
      this.al.a(cd, $$0);
   }

   boolean go() {
      return this.al.a(cf);
   }

   void z(boolean $$0) {
      this.al.a(cf, $$0);
   }

   boolean gp() {
      return this.al.a(cg);
   }

   void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, jh.c);
      $$0.a(cb, false);
      $$0.a(ce, jh.c);
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(cd, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gm().u());
      $$0.a("HomePosY", this.gm().v());
      $$0.a("HomePosZ", this.gm().w());
      $$0.a("HasEgg", this.p());
      $$0.a("TravelPosX", this.gn().u());
      $$0.a("TravelPosY", this.gn().v());
      $$0.a("TravelPosZ", this.gn().w());
   }

   @Override
   public void a(ux $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new jh($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.h(this.dv());
      this.i(jh.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bvm<cit> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$3.v() < $$1.O() + 4 && dsz.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cit.f(this, 1.2));
      this.bT.a(1, new cit.a(this, 1.0));
      this.bT.a(1, new cit.d(this, 1.0));
      this.bT.a(2, new ceh(this, 1.1, $$0 -> $$0.a(ayd.aB), false));
      this.bT.a(3, new cit.c(this, 1.0));
      this.bT.a(4, new cit.b(this, 1.0));
      this.bT.a(7, new cit.i(this, 1.0));
      this.bT.a(8, new cdh(this, cps.class, 8.0F));
      this.bT.a(9, new cit.h(this, 1.0, 100));
   }

   public static bxi.a x() {
      return chs.gr().a(bxj.s, 30.0).a(bxj.v, 0.25).a(bxj.B, 1.0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected axe u() {
      return !this.bj() && this.aJ() && !this.e_() ? axf.AD : super.u();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected axe aV() {
      return axf.AO;
   }

   @Nullable
   @Override
   protected axe e(btv $$0) {
      return this.e_() ? axf.AK : axf.AJ;
   }

   @Nullable
   @Override
   protected axe o_() {
      return this.e_() ? axf.AF : axf.AE;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      axe $$2 = this.e_() ? axf.AN : axf.AM;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gt() {
      return super.gt() && !this.p();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ei() {
      return this.e_() ? 0.3F : 1.0F;
   }

   @Override
   protected cfn b(dha $$0) {
      return new cit.g(this, $$0);
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.bB.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.aB);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      if (!this.go() && $$1.b_($$0).a(aya.a)) {
         return 10.0F;
      } else {
         return dsz.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL() && this.t() && this.cj >= 1 && this.cj % 5 == 0) {
         jh $$0 = this.dv();
         if (dsz.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dke.j(this.dV().a_($$0.e())));
            this.a(ecj.u);
         }
      }
   }

   @Override
   protected void i() {
      super.i();
      if (!this.e_() && this.dV() instanceof ash $$0 && $$0.N().b(dgw.f)) {
         this.a($$0, cxo.oL, 1);
      }
   }

   @Override
   public void a_(fbs $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwf.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.O_() == null && (!this.go() || !this.gm().a(this.dt(), 20.0))) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public void a(ash $$0, bwa $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   static class a extends ccl {
      private final cit d;

      a(cit $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.p();
      }

      @Override
      protected void g() {
         asi $$0 = this.a.gv();
         if ($$0 == null && this.c.gv() != null) {
            $$0 = this.c.gv();
         }

         if ($$0 != null) {
            $$0.a(axp.P);
            ao.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gx();
         this.c.gx();
         bam $$1 = this.a.dY();
         if (a(this.b).N().b(dgw.f)) {
            this.b.b(new bvr(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccz {
      private final cit a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cit $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.e_()) {
            return false;
         } else if (this.a.p()) {
            return true;
         } else {
            return this.a.dY().a(b(700)) != 0 ? false : !this.a.gm().a(this.a.dt(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.z(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.z(false);
      }

      @Override
      public boolean c() {
         return !this.a.gm().a(this.a.dt(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gm();
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.L().m()) {
            fbs $$2 = fbs.c($$0);
            fbs $$3 = cgw.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cgw.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(jh.a((ka)$$3)).a(dkg.J)) {
               $$3 = cgw.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cdm {
      private static final int g = 1200;
      private final cit h;

      c(cit $$0, double $$1) {
         super($$0, $$0.e_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bj() && this.d <= 1200 && this.a(this.h.dV(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.e_() && !this.h.bj()) {
            return super.b();
         } else {
            return !this.h.go() && !this.h.bj() && !this.h.p() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dhd $$0, jh $$1) {
         return $$0.a_($$1).a(dkg.J);
      }
   }

   static class d extends cdm {
      private final cit g;

      d(cit $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.p() && this.g.gm().a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.p() && this.g.gm().a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jh $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.cj < 1) {
               this.g.y(true);
            } else if (this.g.cj > this.a(200)) {
               dha $$1 = this.g.dV();
               $$1.a(null, $$0, axf.AL, axg.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jh $$2 = this.e.d();
               dxn $$3 = dkg.mA.m().b(dsz.f, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ecj.i, $$2, ecj.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.cj++;
            }
         }
      }

      @Override
      protected boolean a(dhd $$0, jh $$1) {
         return !$$0.u($$1.d()) ? false : dsz.b($$0, $$1);
      }
   }

   static class e extends ccc {
      private final cit l;

      e(cit $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.h(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.gm().a(this.l.dt(), 16.0)) {
               this.l.C(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.e_()) {
               this.l.C(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.C(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == ccc.a.b && !this.l.L().m()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(bae.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aX = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(bxj.v));
               this.l.C(bae.h(0.125F, this.l.fn(), $$5));
               this.l.h(this.l.dy().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends cds {
      f(cit $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jh $$0 = this.a(this.c.dV(), this.c, 7);
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

   static class g extends cfk {
      g(cit $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jh $$0) {
         if (this.a instanceof cit $$1 && $$1.gp()) {
            return this.b.a_($$0).a(dkg.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cdw {
      private final cit i;

      h(cit $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.go() && !this.i.p() ? super.b() : false;
      }
   }

   static class i extends ccz {
      private final cit a;
      private final double b;
      private boolean c;

      i(cit $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.go() && !this.a.p() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         bam $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().O() - 1)) {
            $$4 = 0;
         }

         jh $$6 = jh.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.L().m()) {
            fbs $$0 = fbs.c(this.a.gn());
            fbs $$1 = cgw.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgw.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = bae.a($$1.d);
               int $$3 = bae.a($$1.f);
               int $$4 = 34;
               if (!this.a.dV().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.L().m() && !this.c && !this.a.go() && !this.a.gw() && !this.a.p();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
