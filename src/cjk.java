import javax.annotation.Nullable;

public class cjk extends cig {
   private static final akg<jj> bF = akk.a(cjk.class, aki.o);
   private static final akg<Boolean> bG = akk.a(cjk.class, aki.k);
   private static final akg<Boolean> bI = akk.a(cjk.class, aki.k);
   private static final akg<jj> bJ = akk.a(cjk.class, aki.o);
   private static final akg<Boolean> bK = akk.a(cjk.class, aki.k);
   private static final akg<Boolean> bL = akk.a(cjk.class, aki.k);
   private static final float bM = 0.3F;
   private static final bvv bN = bwb.bA.n().a(bvu.a().a(bvt.a, 0.0F, bwb.bA.m(), -0.25F)).a(0.3F);
   int bO;
   public static final chg.a bE = ($$0, $$1) -> $$0.n_() && !$$0.bj();

   public cjk(bwb<? extends cjk> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.j, 0.0F);
      this.a(evk.t, -1.0F);
      this.a(evk.s, -1.0F);
      this.a(evk.r, -1.0F);
      this.by = new cjk.e(this);
   }

   public void i(jj $$0) {
      this.al.a(bF, $$0);
   }

   jj gq() {
      return this.al.a(bF);
   }

   void j(jj $$0) {
      this.al.a(bJ, $$0);
   }

   jj gr() {
      return this.al.a(bJ);
   }

   public boolean q() {
      return this.al.a(bG);
   }

   void w(boolean $$0) {
      this.al.a(bG, $$0);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   void x(boolean $$0) {
      this.bO = $$0 ? 1 : 0;
      this.al.a(bI, $$0);
   }

   boolean gs() {
      return this.al.a(bK);
   }

   void y(boolean $$0) {
      this.al.a(bK, $$0);
   }

   boolean gt() {
      return this.al.a(bL);
   }

   void z(boolean $$0) {
      this.al.a(bL, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, jj.c);
      $$0.a(bG, false);
      $$0.a(bJ, jj.c);
      $$0.a(bK, false);
      $$0.a(bL, false);
      $$0.a(bI, false);
   }

   @Override
   public void b(tw $$0) {
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
   public void a(tw $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new jj($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new jj($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.i(this.dv());
      this.j(jj.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bwb<cjk> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$3.v() < $$1.P() + 4 && dtu.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cjk.f(this, 1.2));
      this.bB.a(1, new cjk.a(this, 1.0));
      this.bB.a(1, new cjk.d(this, 1.0));
      this.bB.a(2, new cev(this, 1.1, $$0 -> $$0.a(axi.az), false));
      this.bB.a(3, new cjk.c(this, 1.0));
      this.bB.a(4, new cjk.b(this, 1.0));
      this.bB.a(7, new cjk.i(this, 1.0));
      this.bB.a(8, new cdv(this, cqi.class, 8.0F));
      this.bB.a(9, new cjk.h(this, 1.0, 100));
   }

   public static bxw.a x() {
      return cig.gv().a(bxx.s, 30.0).a(bxx.v, 0.25).a(bxx.B, 1.0);
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
   protected awj u() {
      return !this.bj() && this.aJ() && !this.n_() ? awk.Bd : super.u();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected awj aV() {
      return awk.Bo;
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return this.n_() ? awk.Bk : awk.Bj;
   }

   @Nullable
   @Override
   protected awj l_() {
      return this.n_() ? awk.Bf : awk.Be;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      awj $$2 = this.n_() ? awk.Bn : awk.Bm;
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
   protected cgb b(dhp $$0) {
      return new cjk.g(this, $$0);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.bA.a($$0, bwa.e);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.az);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      if (!this.gs() && $$1.b_($$0).a(axf.a)) {
         return 10.0F;
      } else {
         return dtu.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK() && this.t() && this.bO >= 1 && this.bO % 5 == 0) {
         jj $$0 = this.dv();
         if (dtu.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, dku.j(this.dV().a_($$0.e())));
            this.a(edm.u);
         }
      }
   }

   @Override
   protected void j() {
      super.j();
      if (!this.n_() && this.dV() instanceof arn $$0 && $$0.O().c(dhl.f)) {
         this.a($$0, cyc.oY, 1);
      }
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwv.a, this.dy());
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
   public void a(arn $$0, bwq $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   static class a extends ccz {
      private final cjk d;

      a(cjk $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         aro $$0 = this.a.gz();
         if ($$0 == null && this.c.gz() != null) {
            $$0 = this.c.gz();
         }

         if ($$0 != null) {
            $$0.a(awu.P);
            ap.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gB();
         this.c.gB();
         azs $$1 = this.a.dY();
         if (a(this.b).O().c(dhl.f)) {
            this.b.b(new bwg(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cdn {
      private final cjk a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cjk $$0, double $$1) {
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
         jj $$0 = this.a.gq();
         boolean $$1 = $$0.a(this.a.dt(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.O().k()) {
            fcu $$2 = fcu.c($$0);
            fcu $$3 = chk.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = chk.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(jj.a((kc)$$3)).a(dkw.J)) {
               $$3 = chk.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.O().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cea {
      private static final int g = 1200;
      private final cjk h;

      c(cjk $$0, double $$1) {
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
      protected boolean a(dhs $$0, jj $$1) {
         return $$0.a_($$1).a(dkw.J);
      }
   }

   static class d extends cea {
      private final cjk g;

      d(cjk $$0, double $$1) {
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
         jj $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.bO < 1) {
               this.g.x(true);
            } else if (this.g.bO > this.a(200)) {
               dhp $$1 = this.g.dV();
               $$1.a(null, $$0, awk.Bl, awl.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jj $$2 = this.e.d();
               dym $$3 = dkw.mH.m().b(dtu.c, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(edm.i, $$2, edm.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.r(600);
            }

            if (this.g.t()) {
               this.g.bO++;
            }
         }
      }

      @Override
      protected boolean a(dhs $$0, jj $$1) {
         return !$$0.u($$1.d()) ? false : dtu.b($$0, $$1);
      }
   }

   static class e extends ccq {
      private final cjk l;

      e(cjk $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bj()) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
            if (!this.l.gq().a(this.l.dt(), 16.0)) {
               this.l.C(Math.max(this.l.fn() / 2.0F, 0.08F));
            }

            if (this.l.n_()) {
               this.l.C(Math.max(this.l.fn() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.C(Math.max(this.l.fn() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == ccq.a.b && !this.l.O().k()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azk.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aU = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(bxx.v));
               this.l.C(azk.h(0.125F, this.l.fn(), $$5));
               this.l.i(this.l.dy().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ceg {
      f(cjk $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jj $$0 = this.a(this.c.dV(), this.c, 7);
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

   static class g extends cfy {
      g(cjk $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jj $$0) {
         if (this.a instanceof cjk $$1 && $$1.gt()) {
            return this.b.a_($$0).a(dkw.J);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cek {
      private final cjk i;

      h(cjk $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.gs() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cdn {
      private final cjk a;
      private final double b;
      private boolean c;

      i(cjk $$0, double $$1) {
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
         azs $$2 = this.a.ae;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dC() > (double)(this.a.dV().P() - 1)) {
            $$4 = 0;
         }

         jj $$6 = jj.a((double)$$3 + this.a.dA(), (double)$$4 + this.a.dC(), (double)$$5 + this.a.dG());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fcu $$0 = fcu.c(this.a.gr());
            fcu $$1 = chk.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chk.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
