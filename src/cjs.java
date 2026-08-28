import javax.annotation.Nullable;

public class cjs extends cio {
   private static final akh<iu> bG = akl.a(cjs.class, akj.o);
   private static final akh<Boolean> bH = akl.a(cjs.class, akj.k);
   private static final akh<Boolean> bJ = akl.a(cjs.class, akj.k);
   private static final akh<iu> bK = akl.a(cjs.class, akj.o);
   private static final akh<Boolean> bL = akl.a(cjs.class, akj.k);
   private static final akh<Boolean> bM = akl.a(cjs.class, akj.k);
   private static final float bN = 0.3F;
   private static final bwd bO = bwj.bB.n().a(bwc.a().a(bwb.a, 0.0F, bwj.bB.m(), -0.25F)).a(0.3F);
   int bP;
   public static final cho.a bF = ($$0, $$1) -> $$0.n_() && !$$0.bj();

   public cjs(bwj<? extends cjs> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.j, 0.0F);
      this.a(ewm.t, -1.0F);
      this.a(ewm.s, -1.0F);
      this.a(ewm.r, -1.0F);
      this.bz = new cjs.e(this);
   }

   public void h(iu $$0) {
      this.al.a(bG, $$0);
   }

   iu gq() {
      return this.al.a(bG);
   }

   void i(iu $$0) {
      this.al.a(bK, $$0);
   }

   iu gr() {
      return this.al.a(bK);
   }

   public boolean q() {
      return this.al.a(bH);
   }

   void w(boolean $$0) {
      this.al.a(bH, $$0);
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   void x(boolean $$0) {
      this.bP = $$0 ? 1 : 0;
      this.al.a(bJ, $$0);
   }

   boolean gs() {
      return this.al.a(bL);
   }

   void y(boolean $$0) {
      this.al.a(bL, $$0);
   }

   boolean gt() {
      return this.al.a(bM);
   }

   void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bG, iu.c);
      $$0.a(bH, false);
      $$0.a(bK, iu.c);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gq().u());
      $$0.a("HomePosY", this.gq().v());
      $$0.a("HomePosZ", this.gq().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gr().u());
      $$0.a("TravelPosY", this.gr().v());
      $$0.a("TravelPosZ", this.gr().w());
   }

   @Override
   public void a(tx $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new iu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new iu($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.h(this.dv());
      this.i(iu.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwj<cjs> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$3.v() < $$1.P() + 4 && duv.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cjs.f(this, 1.2));
      this.bC.a(1, new cjs.a(this, 1.0));
      this.bC.a(1, new cjs.d(this, 1.0));
      this.bC.a(2, new cfd(this, 1.1, $$0 -> $$0.a(axi.az), false));
      this.bC.a(3, new cjs.c(this, 1.0));
      this.bC.a(4, new cjs.b(this, 1.0));
      this.bC.a(7, new cjs.i(this, 1.0));
      this.bC.a(8, new ced(this, cqs.class, 8.0F));
      this.bC.a(9, new cjs.h(this, 1.0, 100));
   }

   public static bye.a x() {
      return cio.gv().a(byf.s, 30.0).a(byf.v, 0.25).a(byf.B, 1.0);
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
   protected awk u() {
      return !this.bj() && this.aJ() && !this.n_() ? awl.Bd : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awk aV() {
      return awl.Bo;
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return this.n_() ? awl.Bk : awl.Bj;
   }

   @Nullable
   @Override
   protected awk l_() {
      return this.n_() ? awl.Bf : awl.Be;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      awk $$2 = this.n_() ? awl.Bn : awl.Bm;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gx() {
      return super.gx() && !this.q();
   }

   @Override
   protected float aU() {
      return this.X + 0.15F;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.3F : 1.0F;
   }

   @Override
   protected cgj b(dip $$0) {
      return new cjs.g(this, $$0);
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return bwj.bB.a($$0, bwi.e);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.az);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      if (!this.gs() && $$1.b_($$0).a(axf.a)) {
         return 10.0F;
      } else {
         return duv.a($$1, $$0) ? 10.0F : $$1.x($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK() && this.t() && this.bP >= 1 && this.bP % 5 == 0) {
         iu $$0 = this.dv();
         if (duv.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dlu.j(this.dV().a_($$0.e())));
            this.a(eeo.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dV() instanceof aro $$0 && $$0.O().c(dil.f)) {
         this.a($$0, cyw.oY, 1);
      }
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null && (!this.gs() || !this.gq().a(this.dt(), 20.0))) {
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
   public void a(aro $$0, bwy $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   static class a extends cdh {
      private final cjs d;

      a(cjs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arp $$0 = this.a.gz();
         if ($$0 == null && this.c.gz() != null) {
            $$0 = this.c.gz();
         }

         if ($$0 != null) {
            $$0.a(awv.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gB();
         this.c.gB();
         azt $$1 = this.a.dY();
         if (a(this.b).O().c(dil.f)) {
            this.b.b(new bwo(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cdv {
      private final cjs a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cjs $$0, double $$1) {
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
            return this.a.dY().a(b(700)) != 0 ? false : !this.a.gq().a(this.a.dt(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
      }

      @Override
      public boolean c() {
         return !this.a.gq().a(this.a.dt(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         iu $$0 = this.a.gq();
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            fdw $$2 = fdw.c($$0);
            fdw $$3 = chs.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = chs.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(iu.a((jo)$$3)).a(dlw.J)) {
               $$3 = chs.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cei {
      private static final int g = 1200;
      private final cjs h;

      c(cjs $$0, double $$1) {
         super($$0, $$0.n_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bj() && this.d <= 1200 && this.a(this.h.dV(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.n_() && !this.h.bj()) {
            return super.b();
         } else {
            return !this.h.gs() && !this.h.bj() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dis $$0, iu $$1) {
         return $$0.a_($$1).a(dlw.J);
      }
   }

   static class d extends cei {
      private final cjs g;

      d(cjs $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gq().a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gq().a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         iu $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.bP < 1) {
               this.g.x(true);
            } else if (this.g.bP > this.a(200)) {
               dip $$1 = this.g.dV();
               $$1.a(null, $$0, awl.Bl, awm.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               iu $$2 = this.e.d();
               dzo $$3 = dlw.mH.m().b(duv.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eeo.i, $$2, eeo.a.a(this.g, $$3));
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
      protected boolean a(dis $$0, iu $$1) {
         return !$$0.v($$1.d()) ? false : duv.b($$0, $$1);
      }
   }

   static class e extends ccy {
      private final cjs l;

      e(cjs $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.gq().a(this.l.dt(), 16.0)) {
               this.l.B(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.B(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.B(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == ccy.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azk.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aV = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(byf.v));
               this.l.B(azk.h(0.125F, this.l.fn(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends ceo {
      f(cjs $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            iu $$0 = this.a(this.c.dV(), this.c, 7);
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

   static class g extends cgg {
      g(cjs $$0, dip $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(iu $$0) {
         if (this.a instanceof cjs $$1 && $$1.gt()) {
            return this.b.a_($$0).a(dlw.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends ces {
      private final cjs i;

      h(cjs $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gs() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cdv {
      private final cjs a;
      private final double b;
      private boolean c;

      i(cjs $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gs() && !this.a.q() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azt $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().P() - 1)) {
            $$4 = 0;
         }

         iu $$6 = iu.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.a.i($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fdw $$0 = fdw.c(this.a.gr());
            fdw $$1 = chs.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chs.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azk.a($$1.d);
               int $$3 = azk.a($$1.f);
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

      @Override
      public boolean c() {
         return !this.a.O().k() && !this.c && !this.a.gs() && !this.a.gA() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.z(false);
         super.e();
      }
   }
}
