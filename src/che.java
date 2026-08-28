import java.util.function.Predicate;
import javax.annotation.Nullable;

public class che extends cgd {
   private static final akh<jf> bZ = akl.a(che.class, akj.o);
   private static final akh<Boolean> ca = akl.a(che.class, akj.k);
   private static final akh<Boolean> cc = akl.a(che.class, akj.k);
   private static final akh<jf> cd = akl.a(che.class, akj.o);
   private static final akh<Boolean> ce = akl.a(che.class, akj.k);
   private static final akh<Boolean> cf = akl.a(che.class, akj.k);
   private static final float cg = 0.3F;
   private static final btu ch = bty.bh.n().a(btt.a().a(bts.a, 0.0F, bty.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bun> bY = $$0 -> $$0.p_() && !$$0.bi();

   public che(bty<? extends che> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.j, 0.0F);
      this.a(erk.t, -1.0F);
      this.a(erk.s, -1.0F);
      this.a(erk.r, -1.0F);
      this.bP = new che.e(this);
   }

   public void h(jf $$0) {
      this.am.a(bZ, $$0);
   }

   jf go() {
      return this.am.a(bZ);
   }

   void i(jf $$0) {
      this.am.a(cd, $$0);
   }

   jf gp() {
      return this.am.a(cd);
   }

   @Override
   public boolean q() {
      return this.am.a(ca);
   }

   void x(boolean $$0) {
      this.am.a(ca, $$0);
   }

   public boolean t() {
      return this.am.a(cc);
   }

   void y(boolean $$0) {
      this.ci = $$0 ? 1 : 0;
      this.am.a(cc, $$0);
   }

   boolean gq() {
      return this.am.a(ce);
   }

   void z(boolean $$0) {
      this.am.a(ce, $$0);
   }

   boolean gr() {
      return this.am.a(cf);
   }

   void A(boolean $$0) {
      this.am.a(cf, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, jf.c);
      $$0.a(ca, false);
      $$0.a(cd, jf.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.go().u());
      $$0.a("HomePosY", this.go().v());
      $$0.a("HomePosZ", this.go().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gp().u());
      $$0.a("TravelPosY", this.gp().v());
      $$0.a("TravelPosZ", this.gp().w());
   }

   @Override
   public void a(ug $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new jf($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new jf($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.h(this.ds());
      this.i(jf.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bty<che> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$3.v() < $$1.N() + 4 && dqf.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bS.a(0, new che.f(this, 1.2));
      this.bS.a(1, new che.a(this, 1.0));
      this.bS.a(1, new che.d(this, 1.0));
      this.bS.a(2, new ccs(this, 1.1, $$0 -> $$0.a(axe.av), false));
      this.bS.a(3, new che.c(this, 1.0));
      this.bS.a(4, new che.b(this, 1.0));
      this.bS.a(7, new che.i(this, 1.0));
      this.bS.a(8, new cbs(this, cnx.class, 8.0F));
      this.bS.a(9, new che.h(this, 1.0, 100));
   }

   public static bvt.a y() {
      return cgd.gt().a(bvu.s, 30.0).a(bvu.v, 0.25).a(bvu.B, 1.0);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   public int T() {
      return 200;
   }

   @Nullable
   @Override
   protected awf w() {
      return !this.bi() && this.aH() && !this.p_() ? awg.Al : super.w();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awf aT() {
      return awg.Aw;
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return this.p_() ? awg.As : awg.Ar;
   }

   @Nullable
   @Override
   protected awf o_() {
      return this.p_() ? awg.An : awg.Am;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      awf $$2 = this.p_() ? awg.Av : awg.Au;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.q();
   }

   @Override
   protected float aS() {
      return this.Y + 0.15F;
   }

   @Override
   public float ef() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected cdy b(dej $$0) {
      return new che.g(this, $$0);
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return bty.bh.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.av);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      if (!this.gq() && $$1.b_($$0).a(axb.a)) {
         return 10.0F;
      } else {
         return dqf.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bI() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         jf $$0 = this.ds();
         if (dqf.a(this.dS(), $$0)) {
            this.dS().c(2001, $$0, dhm.j(this.dS().a_($$0.e())));
            this.a(dzp.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dS().ac().b(def.f)) {
         this.a(cvw.oq, 1);
      }
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null && (!this.gq() || !this.go().a(this.dq(), 20.0))) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public void a(arj $$0, bum $$1) {
      this.a(this.dT().c(), Float.MAX_VALUE);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends caw {
      private final che d;

      a(che $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         ark $$0 = this.a.gx();
         if ($$0 == null && this.c.gx() != null) {
            $$0 = this.c.gx();
         }

         if ($$0 != null) {
            $$0.a(awq.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gz();
         this.c.gz();
         azn $$1 = this.a.dV();
         if (this.b.ac().b(def.f)) {
            this.b.b(new bud(this.b, this.a.dx(), this.a.dz(), this.a.dD(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cbk {
      private final che a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(che $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.p_()) {
            return false;
         } else if (this.a.q()) {
            return true;
         } else {
            return this.a.dV().a(b(700)) != 0 ? false : !this.a.go().a(this.a.dq(), 64.0);
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
         return !this.a.go().a(this.a.dq(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jf $$0 = this.a.go();
         boolean $$1 = $$0.a(this.a.dq(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.P().m()) {
            eyw $$2 = eyw.c($$0);
            eyw $$3 = cfh.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cfh.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dS().a_(jf.a((jy)$$3)).a(dho.G)) {
               $$3 = cfh.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends cbx {
      private static final int g = 1200;
      private final che h;

      c(che $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bi() && this.d <= 1200 && this.a(this.h.dS(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.p_() && !this.h.bi()) {
            return super.b();
         } else {
            return !this.h.gq() && !this.h.bi() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dem $$0, jf $$1) {
         return $$0.a_($$1).a(dho.G);
      }
   }

   static class d extends cbx {
      private final che g;

      d(che $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.go().a(this.g.dq(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.go().a(this.g.dq(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jf $$0 = this.g.ds();
         if (!this.g.bi() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dej $$1 = this.g.dS();
               $$1.a(null, $$0, awg.At, awh.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               jf $$2 = this.e.d();
               dus $$3 = dho.mf.n().b(dqf.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dzp.i, $$2, dzp.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.ci++;
            }
         }
      }

      @Override
      protected boolean a(dem $$0, jf $$1) {
         return !$$0.u($$1.d()) ? false : dqf.b($$0, $$1);
      }
   }

   static class e extends can {
      private final che l;

      e(che $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bi()) {
            this.l.h(this.l.dv().b(0.0, 0.005, 0.0));
            if (!this.l.go().a(this.l.dq(), 16.0)) {
               this.l.C(Math.max(this.l.fm() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.C(Math.max(this.l.fm() / 3.0F, 0.06F));
            }
         } else if (this.l.aH()) {
            this.l.C(Math.max(this.l.fm() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == can.a.b && !this.l.P().m()) {
            double $$0 = this.e - this.l.dx();
            double $$1 = this.f - this.l.dz();
            double $$2 = this.g - this.l.dD();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azf.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.a(this.l.dI(), $$4, 90.0F));
               this.l.aT = this.l.dI();
               float $$5 = (float)(this.h * this.l.h(bvu.v));
               this.l.C(azf.h(0.125F, this.l.fm(), $$5));
               this.l.h(this.l.dv().b(0.0, (double)this.l.fm() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccd {
      f(che $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jf $$0 = this.a(this.c.dS(), this.c, 7);
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

   static class g extends cdv {
      g(che $$0, dej $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jf $$0) {
         if (this.a instanceof che $$1 && $$1.gr()) {
            return this.b.a_($$0).a(dho.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cch {
      private final che i;

      h(che $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bi() && !this.i.gq() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cbk {
      private final che a;
      private final double b;
      private boolean c;

      i(che $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gq() && !this.a.q() && this.a.bi();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azn $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dz() > (double)(this.a.dS().N() - 1)) {
            $$4 = 0;
         }

         jf $$6 = jf.a((double)$$3 + this.a.dx(), (double)$$4 + this.a.dz(), (double)$$5 + this.a.dD());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            eyw $$0 = eyw.c(this.a.gp());
            eyw $$1 = cfh.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azf.a($$1.d);
               int $$3 = azf.a($$1.f);
               int $$4 = 34;
               if (!this.a.dS().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      @Override
      public boolean c() {
         return !this.a.P().m() && !this.c && !this.a.gq() && !this.a.gy() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
