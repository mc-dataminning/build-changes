import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chw extends cgv {
   private static final ako<jh> bZ = aks.a(chw.class, akq.o);
   private static final ako<Boolean> ca = aks.a(chw.class, akq.k);
   private static final ako<Boolean> cc = aks.a(chw.class, akq.k);
   private static final ako<jh> cd = aks.a(chw.class, akq.o);
   private static final ako<Boolean> ce = aks.a(chw.class, akq.k);
   private static final ako<Boolean> cf = aks.a(chw.class, akq.k);
   private static final float cg = 0.3F;
   private static final bul ch = bup.bh.n().a(buk.a().a(buj.a, 0.0F, bup.bh.m(), -0.25F)).a(0.3F);
   int ci;
   public static final Predicate<bve> bY = $$0 -> $$0.p_() && !$$0.bl();

   public chw(bup<? extends chw> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, 0.0F);
      this.a(esf.t, -1.0F);
      this.a(esf.s, -1.0F);
      this.a(esf.r, -1.0F);
      this.bP = new chw.e(this);
   }

   public void h(jh $$0) {
      this.am.a(bZ, $$0);
   }

   jh gv() {
      return this.am.a(bZ);
   }

   void i(jh $$0) {
      this.am.a(cd, $$0);
   }

   jh gw() {
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
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, jh.c);
      $$0.a(ca, false);
      $$0.a(cd, jh.c);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cc, false);
   }

   @Override
   public void b(un $$0) {
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
   public void a(un $$0) {
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
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.h(this.dy());
      this.i(jh.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bup<chw> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$3.v() < $$1.N() + 4 && drb.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void D() {
      this.bS.a(0, new chw.f(this, 1.2));
      this.bS.a(1, new chw.a(this, 1.0));
      this.bS.a(1, new chw.d(this, 1.0));
      this.bS.a(2, new cdk(this, 1.1, $$0 -> $$0.a(axm.aA), false));
      this.bS.a(3, new chw.c(this, 1.0));
      this.bS.a(4, new chw.b(this, 1.0));
      this.bS.a(7, new chw.i(this, 1.0));
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(9, new chw.h(this, 1.0, 100));
   }

   public static bwl.a y() {
      return cgv.gA().a(bwm.s, 30.0).a(bwm.v, 0.25).a(bwm.B, 1.0);
   }

   @Override
   public boolean cL() {
      return false;
   }

   @Override
   public int T() {
      return 200;
   }

   @Nullable
   @Override
   protected awn w() {
      return !this.bl() && this.aL() && !this.p_() ? awo.Aj : super.w();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected awn aX() {
      return awo.Au;
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return this.p_() ? awo.Aq : awo.Ap;
   }

   @Nullable
   @Override
   protected awn o_() {
      return this.p_() ? awo.Al : awo.Ak;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      awn $$2 = this.p_() ? awo.At : awo.As;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gC() {
      return super.gC() && !this.q();
   }

   @Override
   protected float aW() {
      return this.Y + 0.15F;
   }

   @Override
   public float el() {
      return this.p_() ? 0.3F : 1.0F;
   }

   @Override
   protected ceq b(dff $$0) {
      return new chw.g(this, $$0);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return bup.bh.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.aA);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      if (!this.gx() && $$1.b_($$0).a(axj.a)) {
         return 10.0F;
      } else {
         return drb.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bN() && this.t() && this.ci >= 1 && this.ci % 5 == 0) {
         jh $$0 = this.dy();
         if (drb.a(this.dY(), $$0)) {
            this.dY().c(2001, $$0, dij.j(this.dY().a_($$0.e())));
            this.a(eak.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.p_() && this.dY().ac().b(dfb.f)) {
         this.a(cwj.oq, 1);
      }
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(0.1F, $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
         if (this.m() == null && (!this.gx() || !this.gv().a(this.dw(), 20.0))) {
            this.h(this.dB().b(0.0, -0.005, 0.0));
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
   public void a(arq $$0, bvd $$1) {
      this.a(this.dZ().c(), Float.MAX_VALUE);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   static class a extends cbo {
      private final chw d;

      a(chw $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }

      @Override
      protected void g() {
         arr $$0 = this.a.gE();
         if ($$0 == null && this.c.gE() != null) {
            $$0 = this.c.gE();
         }

         if ($$0 != null) {
            $$0.a(awy.P);
            ao.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gG();
         this.c.gG();
         azv $$1 = this.a.eb();
         if (this.b.ac().b(dfb.f)) {
            this.b.b(new buu(this.b, this.a.dD(), this.a.dF(), this.a.dJ(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends ccc {
      private final chw a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(chw $$0, double $$1) {
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
            return this.a.eb().a(b(700)) != 0 ? false : !this.a.gv().a(this.a.dw(), 64.0);
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
         return !this.a.gv().a(this.a.dw(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gv();
         boolean $$1 = $$0.a(this.a.dw(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.P().m()) {
            ezr $$2 = ezr.c($$0);
            ezr $$3 = cfz.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cfz.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dY().a_(jh.a((ka)$$3)).a(dil.G)) {
               $$3 = cfz.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.P().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends ccp {
      private static final int g = 1200;
      private final chw h;

      c(chw $$0, double $$1) {
         super($$0, $$0.p_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bl() && this.d <= 1200 && this.a(this.h.dY(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.p_() && !this.h.bl()) {
            return super.b();
         } else {
            return !this.h.gx() && !this.h.bl() && !this.h.q() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dfi $$0, jh $$1) {
         return $$0.a_($$1).a(dil.G);
      }
   }

   static class d extends ccp {
      private final chw g;

      d(chw $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.q() && this.g.gv().a(this.g.dw(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.q() && this.g.gv().a(this.g.dw(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jh $$0 = this.g.dy();
         if (!this.g.bl() && this.m()) {
            if (this.g.ci < 1) {
               this.g.y(true);
            } else if (this.g.ci > this.a(200)) {
               dff $$1 = this.g.dY();
               $$1.a(null, $$0, awo.Ar, awp.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jh $$2 = this.e.d();
               dvo $$3 = dil.mf.m().b(drb.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(eak.i, $$2, eak.a.a(this.g, $$3));
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
      protected boolean a(dfi $$0, jh $$1) {
         return !$$0.u($$1.d()) ? false : drb.b($$0, $$1);
      }
   }

   static class e extends cbf {
      private final chw l;

      e(chw $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bl()) {
            this.l.h(this.l.dB().b(0.0, 0.005, 0.0));
            if (!this.l.gv().a(this.l.dw(), 16.0)) {
               this.l.C(Math.max(this.l.fs() / 2.0F, 0.08F));
            }

            if (this.l.p_()) {
               this.l.C(Math.max(this.l.fs() / 3.0F, 0.06F));
            }
         } else if (this.l.aL()) {
            this.l.C(Math.max(this.l.fs() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == cbf.a.b && !this.l.P().m()) {
            double $$0 = this.e - this.l.dD();
            double $$1 = this.f - this.l.dF();
            double $$2 = this.g - this.l.dJ();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.C(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(azn.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dO(), $$4, 90.0F));
               this.l.aX = this.l.dO();
               float $$5 = (float)(this.h * this.l.h(bwm.v));
               this.l.C(azn.h(0.125F, this.l.fs(), $$5));
               this.l.h(this.l.dB().b(0.0, (double)this.l.fs() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class f extends ccv {
      f(chw $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jh $$0 = this.a(this.c.dY(), this.c, 7);
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

   static class g extends cen {
      g(chw $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jh $$0) {
         if (this.a instanceof chw $$1 && $$1.gy()) {
            return this.b.a_($$0).a(dil.G);
         }

         return !this.b.a_($$0.e()).l();
      }
   }

   static class h extends ccz {
      private final chw i;

      h(chw $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bl() && !this.i.gx() && !this.i.q() ? super.b() : false;
      }
   }

   static class i extends ccc {
      private final chw a;
      private final double b;
      private boolean c;

      i(chw $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.gx() && !this.a.q() && this.a.bl();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         azv $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dF() > (double)(this.a.dY().N() - 1)) {
            $$4 = 0;
         }

         jh $$6 = jh.a((double)$$3 + this.a.dD(), (double)$$4 + this.a.dF(), (double)$$5 + this.a.dJ());
         this.a.i($$6);
         this.a.A(true);
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            ezr $$0 = ezr.c(this.a.gw());
            ezr $$1 = cfz.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfz.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = azn.a($$1.d);
               int $$3 = azn.a($$1.f);
               int $$4 = 34;
               if (!this.a.dY().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
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
