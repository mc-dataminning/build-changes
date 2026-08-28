import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chs extends cgr {
   private static final akl<jh> bZ = akp.a(chs.class, akn.o);
   private static final akl<Boolean> ca = akp.a(chs.class, akn.k);
   private static final akl<Boolean> cc = akp.a(chs.class, akn.k);
   private static final akl<jh> cd = akp.a(chs.class, akn.o);
   private static final akl<Boolean> ce = akp.a(chs.class, akn.k);
   private static final akl<Boolean> cf = akp.a(chs.class, akn.k);
   private static final float cg = 0.3F;
   private static final buh ch = bul.bh.n().a(bug.a().a(buf.a, 0.0F, bul.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bva> bY = $$0 -> $$0.p_() && !$$0.bk();

   public chs(bul<? extends chs> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, 0.0F);
      this.a(esb.t, -1.0F);
      this.a(esb.s, -1.0F);
      this.a(esb.r, -1.0F);
      this.bP = new chs.e(this);
   }

   public void h(jh $$0) {
      this.am.a(bZ, $$0);
   }

   jh gu() {
      return this.am.a(bZ);
   }

   void i(jh $$0) {
      this.am.a(cd, $$0);
   }

   jh gv() {
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

   boolean gw() {
      return this.am.a(ce);
   }

   void z(boolean $$0) {
      this.am.a(ce, $$0);
   }

   boolean gx() {
      return this.am.a(cf);
   }

   void A(boolean $$0) {
      this.am.a(cf, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bZ, jh.c);
      $$0.a(ca, false);
      $$0.a(cd, jh.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gu().u());
      $$0.a("HomePosY", this.gu().v());
      $$0.a("HomePosZ", this.gu().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gv().u());
      $$0.a("TravelPosY", this.gv().v());
      $$0.a("TravelPosZ", this.gv().w());
   }

   @Override
   public void a(uk $$0) {
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
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.h(this.dx());
      this.i(jh.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bul<chs> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$3.v() < $$1.N() + 4 && dqw.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bS.a(0, new chs.f(this, 1.2));
      this.bS.a(1, new chs.a(this, 1.0));
      this.bS.a(1, new chs.d(this, 1.0));
      this.bS.a(2, new cdg(this, 1.1, $$0 -> $$0.a(axj.az), false));
      this.bS.a(3, new chs.c(this, 1.0));
      this.bS.a(4, new chs.b(this, 1.0));
      this.bS.a(7, new chs.i(this, 1.0));
      this.bS.a(8, new ccg(this, com.class, 8.0F));
      this.bS.a(9, new chs.h(this, 1.0, 100));
   }

   public static bwh.a y() {
      return cgr.gz().a(bwi.s, 30.0).a(bwi.v, 0.25).a(bwi.B, 1.0);
   }

   @Override
   public boolean cK() {
      return false;
   }

   @Override
   public int T() {
      return 200;
   }

   @Nullable
   @Override
   protected awk w() {
      return !this.bk() && this.aK() && !this.p_() ? awl.Aj : super.w();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awk aW() {
      return awl.Au;
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return this.p_() ? awl.Aq : awl.Ap;
   }

   @Nullable
   @Override
   protected awk o_() {
      return this.p_() ? awl.Al : awl.Ak;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      awk $$2 = this.p_() ? awl.At : awl.As;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.q();
   }

   @Override
   protected float aV() {
      return this.Y + 0.15F;
   }

   @Override
   public float ek() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected cem b(dfb $$0) {
      return new chs.g(this, $$0);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.bh.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.az);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      if (!this.gw() && $$1.b_($$0).a(axg.a)) {
         return 10.0F;
      } else {
         return dqw.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bM() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         jh $$0 = this.dx();
         if (dqw.a(this.dX(), $$0)) {
            this.dX().c(2001, $$0, die.j(this.dX().a_($$0.e())));
            this.a(eag.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dX().ac().b(dex.f)) {
         this.a(cwf.oq, 1);
      }
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bk()) {
         this.a(0.1F, $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null && (!this.gw() || !this.gu().a(this.dv(), 20.0))) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
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
   public void a(arn $$0, buz $$1) {
      this.a(this.dY().c(), Float.MAX_VALUE);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends cbk {
      private final chs d;

      a(chs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         aro $$0 = this.a.gD();
         if ($$0 == null && this.c.gD() != null) {
            $$0 = this.c.gD();
         }

         if ($$0 != null) {
            $$0.a(awv.P);
            ao.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gF();
         this.c.gF();
         azs $$1 = this.a.ea();
         if (this.b.ac().b(dex.f)) {
            this.b.b(new buq(this.b, this.a.dC(), this.a.dE(), this.a.dI(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cby {
      private final chs a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chs $$0, double $$1) {
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
            return this.a.ea().a(b(700)) != 0 ? false : !this.a.gu().a(this.a.dv(), 64.0);
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
         return !this.a.gu().a(this.a.dv(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gu();
         boolean $$1 = $$0.a(this.a.dv(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.P().m()) {
            ezn $$2 = ezn.c($$0);
            ezn $$3 = cfv.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cfv.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dX().a_(jh.a((ka)$$3)).a(dig.G)) {
               $$3 = cfv.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccl {
      private static final int g = 1200;
      private final chs h;

      c(chs $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bk() && this.d <= 1200 && this.a(this.h.dX(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.p_() && !this.h.bk()) {
            return super.b();
         } else {
            return !this.h.gw() && !this.h.bk() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dfe $$0, jh $$1) {
         return $$0.a_($$1).a(dig.G);
      }
   }

   static class d extends ccl {
      private final chs g;

      d(chs $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gu().a(this.g.dv(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gu().a(this.g.dv(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jh $$0 = this.g.dx();
         if (!this.g.bk() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dfb $$1 = this.g.dX();
               $$1.a(null, $$0, awl.Ar, awm.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jh $$2 = this.e.d();
               dvj $$3 = dig.mf.m().b(dqw.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eag.i, $$2, eag.a.a(this.g, $$3));
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
      protected boolean a(dfe $$0, jh $$1) {
         return !$$0.u($$1.d()) ? false : dqw.b($$0, $$1);
      }
   }

   static class e extends cbb {
      private final chs l;

      e(chs $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bk()) {
            this.l.h(this.l.dA().b(0.0, 0.005, 0.0));
            if (!this.l.gu().a(this.l.dv(), 16.0)) {
               this.l.C(Math.max(this.l.fr() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.C(Math.max(this.l.fr() / 3.0F, 0.06F));
            }
         } else if (this.l.aK()) {
            this.l.C(Math.max(this.l.fr() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cbb.a.b && !this.l.P().m()) {
            double $$0 = this.e - this.l.dC();
            double $$1 = this.f - this.l.dE();
            double $$2 = this.g - this.l.dI();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azk.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dN(), $$4, 90.0F));
               this.l.aX = this.l.dN();
               float $$5 = (float)(this.h * this.l.h(bwi.v));
               this.l.C(azk.h(0.125F, this.l.fr(), $$5));
               this.l.h(this.l.dA().b(0.0, (double)this.l.fr() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccr {
      f(chs $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jh $$0 = this.a(this.c.dX(), this.c, 7);
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

   static class g extends cej {
      g(chs $$0, dfb $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jh $$0) {
         if (this.a instanceof chs $$1 && $$1.gx()) {
            return this.b.a_($$0).a(dig.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends ccv {
      private final chs i;

      h(chs $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bk() && !this.i.gw() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cby {
      private final chs a;
      private final double b;
      private boolean c;

      i(chs $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gw() && !this.a.q() && this.a.bk();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azs $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dE() > (double)(this.a.dX().N() - 1)) {
            $$4 = 0;
         }

         jh $$6 = jh.a((double)$$3 + this.a.dC(), (double)$$4 + this.a.dE(), (double)$$5 + this.a.dI());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            ezn $$0 = ezn.c(this.a.gv());
            ezn $$1 = cfv.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfv.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azk.a($$1.d);
               int $$3 = azk.a($$1.f);
               int $$4 = 34;
               if (!this.a.dX().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
         return !this.a.P().m() && !this.c && !this.a.gw() && !this.a.gE() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
