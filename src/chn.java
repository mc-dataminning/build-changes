import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chn extends cgm {
   private static final akk<jg> bZ = ako.a(chn.class, akm.o);
   private static final akk<Boolean> ca = ako.a(chn.class, akm.k);
   private static final akk<Boolean> cc = ako.a(chn.class, akm.k);
   private static final akk<jg> cd = ako.a(chn.class, akm.o);
   private static final akk<Boolean> ce = ako.a(chn.class, akm.k);
   private static final akk<Boolean> cf = ako.a(chn.class, akm.k);
   private static final float cg = 0.3F;
   private static final buc ch = bug.bh.n().a(bub.a().a(bua.a, 0.0F, bug.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<buv> bY = $$0 -> $$0.p_() && !$$0.bk();

   public chn(bug<? extends chn> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.j, 0.0F);
      this.a(erv.t, -1.0F);
      this.a(erv.s, -1.0F);
      this.a(erv.r, -1.0F);
      this.bP = new chn.e(this);
   }

   public void h(jg $$0) {
      this.am.a(bZ, $$0);
   }

   jg gv() {
      return this.am.a(bZ);
   }

   void i(jg $$0) {
      this.am.a(cd, $$0);
   }

   jg gw() {
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

   boolean gx() {
      return this.am.a(ce);
   }

   void z(boolean $$0) {
      this.am.a(ce, $$0);
   }

   boolean gy() {
      return this.am.a(cf);
   }

   void A(boolean $$0) {
      this.am.a(cf, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, jg.c);
      $$0.a(ca, false);
      $$0.a(cd, jg.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gv().u());
      $$0.a("HomePosY", this.gv().v());
      $$0.a("HomePosZ", this.gv().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.gw().u());
      $$0.a("TravelPosY", this.gw().v());
      $$0.a("TravelPosZ", this.gw().w());
   }

   @Override
   public void a(uj $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new jg($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new jg($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.h(this.dx());
      this.i(jg.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bug<chn> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$3.v() < $$1.N() + 4 && dqq.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bS.a(0, new chn.f(this, 1.2));
      this.bS.a(1, new chn.a(this, 1.0));
      this.bS.a(1, new chn.d(this, 1.0));
      this.bS.a(2, new cdb(this, 1.1, $$0 -> $$0.a(axi.aw), false));
      this.bS.a(3, new chn.c(this, 1.0));
      this.bS.a(4, new chn.b(this, 1.0));
      this.bS.a(7, new chn.i(this, 1.0));
      this.bS.a(8, new ccb(this, coh.class, 8.0F));
      this.bS.a(9, new chn.h(this, 1.0, 100));
   }

   public static bwc.a y() {
      return cgm.gA().a(bwd.s, 30.0).a(bwd.v, 0.25).a(bwd.B, 1.0);
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
   protected awj w() {
      return !this.bk() && this.aJ() && !this.p_() ? awk.Aj : super.w();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awj aV() {
      return awk.Au;
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return this.p_() ? awk.Aq : awk.Ap;
   }

   @Nullable
   @Override
   protected awj o_() {
      return this.p_() ? awk.Al : awk.Ak;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      awj $$2 = this.p_() ? awk.At : awk.As;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gC() {
      return super.gC() && !this.q();
   }

   @Override
   protected float aU() {
      return this.Y + 0.15F;
   }

   @Override
   public float ek() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected ceh b(dev $$0) {
      return new chn.g(this, $$0);
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return bug.bh.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.aw);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      if (!this.gx() && $$1.b_($$0).a(axf.a)) {
         return 10.0F;
      } else {
         return dqq.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bM() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         jg $$0 = this.dx();
         if (dqq.a(this.dX(), $$0)) {
            this.dX().c(2001, $$0, dhy.j(this.dX().a_($$0.e())));
            this.a(eaa.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dX().ac().b(der.f)) {
         this.a(cwb.oq, 1);
      }
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(0.1F, $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null && (!this.gx() || !this.gv().a(this.dv(), 20.0))) {
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
   public void a(arm $$0, buu $$1) {
      this.a(this.dY().c(), Float.MAX_VALUE);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends cbf {
      private final chn d;

      a(chn $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arn $$0 = this.a.gE();
         if ($$0 == null && this.c.gE() != null) {
            $$0 = this.c.gE();
         }

         if ($$0 != null) {
            $$0.a(awu.P);
            an.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gG();
         this.c.gG();
         azr $$1 = this.a.ea();
         if (this.b.ac().b(der.f)) {
            this.b.b(new bul(this.b, this.a.dC(), this.a.dE(), this.a.dI(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends cbt {
      private final chn a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chn $$0, double $$1) {
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
            return this.a.ea().a(b(700)) != 0 ? false : !this.a.gv().a(this.a.dv(), 64.0);
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
         return !this.a.gv().a(this.a.dv(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jg $$0 = this.a.gv();
         boolean $$1 = $$0.a(this.a.dv(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.P().m()) {
            ezh $$2 = ezh.c($$0);
            ezh $$3 = cfq.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cfq.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dX().a_(jg.a((jz)$$3)).a(dia.G)) {
               $$3 = cfq.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccg {
      private static final int g = 1200;
      private final chn h;

      c(chn $$0, double $$1) {
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
            return !this.h.gx() && !this.h.bk() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dey $$0, jg $$1) {
         return $$0.a_($$1).a(dia.G);
      }
   }

   static class d extends ccg {
      private final chn g;

      d(chn $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gv().a(this.g.dv(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gv().a(this.g.dv(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jg $$0 = this.g.dx();
         if (!this.g.bk() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dev $$1 = this.g.dX();
               $$1.a(null, $$0, awk.Ar, awl.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jg $$2 = this.e.d();
               dvd $$3 = dia.mf.m().b(dqq.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eaa.i, $$2, eaa.a.a(this.g, $$3));
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
      protected boolean a(dey $$0, jg $$1) {
         return !$$0.u($$1.d()) ? false : dqq.b($$0, $$1);
      }
   }

   static class e extends caw {
      private final chn l;

      e(chn $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bk()) {
            this.l.h(this.l.dA().b(0.0, 0.005, 0.0));
            if (!this.l.gv().a(this.l.dv(), 16.0)) {
               this.l.C(Math.max(this.l.fr() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.C(Math.max(this.l.fr() / 3.0F, 0.06F));
            }
         } else if (this.l.aJ()) {
            this.l.C(Math.max(this.l.fr() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == caw.a.b && !this.l.P().m()) {
            double $$0 = this.e - this.l.dC();
            double $$1 = this.f - this.l.dE();
            double $$2 = this.g - this.l.dI();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azj.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dN(), $$4, 90.0F));
               this.l.aU = this.l.dN();
               float $$5 = (float)(this.h * this.l.h(bwd.v));
               this.l.C(azj.h(0.125F, this.l.fr(), $$5));
               this.l.h(this.l.dA().b(0.0, (double)this.l.fr() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccm {
      f(chn $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jg $$0 = this.a(this.c.dX(), this.c, 7);
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

   static class g extends cee {
      g(chn $$0, dev $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jg $$0) {
         if (this.a instanceof chn $$1 && $$1.gy()) {
            return this.b.a_($$0).a(dia.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends ccq {
      private final chn i;

      h(chn $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bk() && !this.i.gx() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends cbt {
      private final chn a;
      private final double b;
      private boolean c;

      i(chn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gx() && !this.a.q() && this.a.bk();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azr $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dE() > (double)(this.a.dX().N() - 1)) {
            $$4 = 0;
         }

         jg $$6 = jg.a((double)$$3 + this.a.dC(), (double)$$4 + this.a.dE(), (double)$$5 + this.a.dI());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            ezh $$0 = ezh.c(this.a.gw());
            ezh $$1 = cfq.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfq.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azj.a($$1.d);
               int $$3 = azj.a($$1.f);
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
         return !this.a.P().m() && !this.c && !this.a.gx() && !this.a.gF() && !this.a.q();
      }

      @Override
      public void e() {
         this.a.A(false);
         super.e();
      }
   }
}
