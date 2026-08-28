import javax.annotation.Nullable;

public class chz extends cgy {
   private static final akm<jh> bZ = akq.a(chz.class, ako.o);
   private static final akm<Boolean> ca = akq.a(chz.class, ako.k);
   private static final akm<Boolean> cc = akq.a(chz.class, ako.k);
   private static final akm<jh> cd = akq.a(chz.class, ako.o);
   private static final akm<Boolean> ce = akq.a(chz.class, ako.k);
   private static final akm<Boolean> cf = akq.a(chz.class, ako.k);
   private static final float cg = 0.3F;
   private static final buo ch = bus.bx.n().a(bun.a().a(bum.a, 0.0F, bus.bx.m(), -0.25F)).a(0.3F);
   int ci;
   public static final cfy.a bY = ($$0, $$1) -> $$0.e_() && !$$0.bj();

   public chz(bus<? extends chz> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.j, 0.0F);
      this.a(esm.t, -1.0F);
      this.a(esm.s, -1.0F);
      this.a(esm.r, -1.0F);
      this.bP = new chz.e(this);
   }

   public void h(jh $$0) {
      this.al.a(bZ, $$0);
   }

   jh gm() {
      return this.al.a(bZ);
   }

   void i(jh $$0) {
      this.al.a(cd, $$0);
   }

   jh gn() {
      return this.al.a(cd);
   }

   @Override
   public boolean n() {
      return this.al.a(ca);
   }

   void x(boolean $$0) {
      this.al.a(ca, $$0);
   }

   public boolean q() {
      return this.al.a(cc);
   }

   void y(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.al.a(cc, $$0);
   }

   boolean go() {
      return this.al.a(ce);
   }

   void z(boolean $$0) {
      this.al.a(ce, $$0);
   }

   boolean gp() {
      return this.al.a(cf);
   }

   void A(boolean $$0) {
      this.al.a(cf, $$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bZ, jh.c);
      $$0.a(ca, false);
      $$0.a(cd, jh.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gm().u());
      $$0.a("HomePosY", this.gm().v());
      $$0.a("HomePosZ", this.gm().w());
      $$0.a("HasEgg", this.n());
      $$0.a("TravelPosX", this.gn().u());
      $$0.a("TravelPosY", this.gn().v());
      $$0.a("TravelPosZ", this.gn().w());
   }

   @Override
   public void a(ul $$0) {
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
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.h(this.dv());
      this.i(jh.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bus<chz> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$3.v() < $$1.O() + 4 && dri.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bS.a(0, new chz.f(this, 1.2));
      this.bS.a(1, new chz.a(this, 1.0));
      this.bS.a(1, new chz.d(this, 1.0));
      this.bS.a(2, new cdn(this, 1.1, $$0 -> $$0.a(axl.aA), false));
      this.bS.a(3, new chz.c(this, 1.0));
      this.bS.a(4, new chz.b(this, 1.0));
      this.bS.a(7, new chz.i(this, 1.0));
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(9, new chz.h(this, 1.0, 100));
   }

   public static bwo.a v() {
      return cgy.gr().a(bwp.s, 30.0).a(bwp.v, 0.25).a(bwp.B, 1.0);
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
   protected awm t() {
      return !this.bj() && this.aJ() && !this.e_() ? awn.Aj : super.t();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awm aV() {
      return awn.Au;
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return this.e_() ? awn.Aq : awn.Ap;
   }

   @Nullable
   @Override
   protected awm n_() {
      return this.e_() ? awn.Al : awn.Ak;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      awm $$2 = this.e_() ? awn.At : awn.As;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gt() {
      return super.gt() && !this.n();
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
   protected cet b(dfm $$0) {
      return new chz.g(this, $$0);
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.bx.a($$0, bur.e);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.aA);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      if (!this.go() && $$1.b_($$0).a(axi.a)) {
         return 10.0F;
      } else {
         return dri.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL() && this.q() && this.ci >= 1 && this.ci % 5 == 0) {
         jh $$0 = this.dv();
         if (dri.a(this.dV(), $$0)) {
            this.dV().c(2001, $$0, diq.j(this.dV().a_($$0.e())));
            this.a(ear.u);
         }
      }
   }

   @Override
   protected void i() {
      super.i();
      if (!this.e_() && this.dV() instanceof arp $$0 && $$0.N().b(dfi.f)) {
         this.a($$0, cwq.oq, 1);
      }
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.aa_() == null && (!this.go() || !this.gm().a(this.dt(), 20.0))) {
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
   public void a(arp $$0, bvg $$1) {
      this.a($$0, this.dW().c(), Float.MAX_VALUE);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   static class a extends cbr {
      private final chz d;

      a(chz $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.n();
      }

      @Override
      protected void g() {
         arq $$0 = this.a.gv();
         if ($$0 == null && this.c.gv() != null) {
            $$0 = this.c.gv();
         }

         if ($$0 != null) {
            $$0.a(awx.P);
            ao.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gx();
         this.c.gx();
         azu $$1 = this.a.dY();
         if (a(this.b).N().b(dfi.f)) {
            this.b.b(new bux(this.b, this.a.dA(), this.a.dC(), this.a.dG(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccf {
      private final chz a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.e_()) {
            return false;
         } else if (this.a.n()) {
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
            ezy $$2 = ezy.c($$0);
            ezy $$3 = cgc.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cgc.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dV().a_(jh.a((ka)$$3)).a(dis.G)) {
               $$3 = cgc.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.L().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccs {
      private static final int g = 1200;
      private final chz h;

      c(chz $$0, double $$1) {
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
            return !this.h.go() && !this.h.bj() && !this.h.n() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dfp $$0, jh $$1) {
         return $$0.a_($$1).a(dis.G);
      }
   }

   static class d extends ccs {
      private final chz g;

      d(chz $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.n() && this.g.gm().a(this.g.dt(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.n() && this.g.gm().a(this.g.dt(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jh $$0 = this.g.dv();
         if (!this.g.bj() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dfm $$1 = this.g.dV();
               $$1.a(null, $$0, awn.Ar, awo.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jh $$2 = this.e.d();
               dvv $$3 = dis.mf.m().b(dri.f, Integer.valueOf(this.g.ae.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(ear.i, $$2, ear.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.r(600);
            }

            if (this.g.q()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(dfp $$0, jh $$1) {
         return !$$0.u($$1.d()) ? false : dri.b($$0, $$1);
      }
   }

   static class e extends cbi {
      private final chz l;

      e(chz $$0) {
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
         if (this.k == cbi.a.b && !this.l.L().m()) {
            double $$0 = this.e - this.l.dA();
            double $$1 = this.f - this.l.dC();
            double $$2 = this.g - this.l.dG();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dL(), $$4, 90.0F));
               this.l.aW = this.l.dL();
               float $$5 = (float)(this.h * this.l.h(bwp.v));
               this.l.C(azm.h(0.125F, this.l.fn(), $$5));
               this.l.h(this.l.dy().b(0.0, (double)this.l.fn() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccy {
      f(chz $$0, double $$1) {
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

   static class g extends ceq {
      g(chz $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jh $$0) {
         if (this.a instanceof chz $$1 && $$1.gp()) {
            return this.b.a_($$0).a(dis.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cdc {
      private final chz i;

      h(chz $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bj() && !this.i.go() && !this.i.n() ? super.b() : false;
      }
   }

   static class i extends ccf {
      private final chz a;
      private final double b;
      private boolean c;

      i(chz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.go() && !this.a.n() && this.a.bj();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azu $$2 = this.a.ae;
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
            ezy $$0 = ezy.c(this.a.gn());
            ezy $$1 = cgc.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgc.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azm.a($$1.d);
               int $$3 = azm.a($$1.f);
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
         return !this.a.L().m() && !this.c && !this.a.go() && !this.a.gw() && !this.a.n();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
