import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chk extends cgv {
   private static final ako<Integer> ca = aks.a(chk.class, akq.b);
   private static final ako<Integer> cc = aks.a(chk.class, akq.b);
   private static final ako<Integer> cd = aks.a(chk.class, akq.b);
   private static final ako<Byte> ce = aks.a(chk.class, akq.a);
   private static final ako<Byte> cf = aks.a(chk.class, akq.a);
   private static final ako<Byte> cg = aks.a(chk.class, akq.a);
   static final cfv ch = cfv.b().a(8.0);
   private static final bul ci = bup.aw.n().a(0.5F).a(buk.a().a(buj.a, 0.0F, 0.40625F, 0.0F));
   private static final int cj = 2;
   private static final int ck = 4;
   private static final int cl = 8;
   private static final int cm = 16;
   private static final int cn = 5;
   public static final int bY = 32;
   private static final int co = 32;
   boolean cp;
   boolean cq;
   public int bZ;
   private ezr cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   chk.g cy;

   public chk(bup<? extends chk> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new chk.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(buq $$0) {
      return $$0 == buq.a && this.fQ();
   }

   public int q() {
      return this.am.a(ca);
   }

   public void t(int $$0) {
      this.am.a(ca, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean y() {
      return this.w(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gv() {
      return this.w(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.am.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.am.a(cd, $$0 ? 1 : 0);
   }

   private int gS() {
      return this.am.a(cd);
   }

   private void v(int $$0) {
      this.am.a(cd, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gx() {
      return this.am.a(cc);
   }

   public void u(int $$0) {
      this.am.a(cc, $$0);
   }

   public chk.a gy() {
      return chk.a.a(this.am.a(ce));
   }

   public void a(chk.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chk.a.a(this.af);
      }

      this.am.a(ce, (byte)$$0.a());
   }

   public chk.a gz() {
      return chk.a.a(this.am.a(cf));
   }

   public void b(chk.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chk.a.a(this.af);
      }

      this.am.a(cf, (byte)$$0.a());
   }

   public boolean gH() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cc, 0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(cd, 0);
   }

   private boolean w(int $$0) {
      return (this.am.a(cg) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(cg);
      if ($$1) {
         this.am.a(cg, (byte)($$2 | $$0));
      } else {
         this.am.a(cg, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gy().c());
      $$0.a("HiddenGene", this.gz().c());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(chk.a.a($$0.l("MainGene")));
      this.b(chk.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      chk $$2 = bup.aw.a($$0, buo.e);
      if ($$2 != null) {
         if ($$1 instanceof chk $$3) {
            $$2.a(this, $$3);
         }

         $$2.gQ();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(2, new chk.i(this, 2.0));
      this.bS.a(2, new chk.d(this, 1.0));
      this.bS.a(3, new chk.b(this, 1.2F, true));
      this.bS.a(4, new cdk(this, 1.0, $$0 -> $$0.a(axm.au), false));
      this.bS.a(6, new chk.c<>(this, cor.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chk.c<>(this, clv.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chk.k());
      this.bS.a(8, new chk.f(this));
      this.bS.a(8, new chk.l(this));
      this.cy = new chk.g(this, cor.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new ccx(this));
      this.bS.a(12, new chk.j(this));
      this.bS.a(13, new ccb(this, 1.25));
      this.bS.a(14, new cdp(this, 1.0));
      this.bT.a(1, new chk.e(this).a(new Class[0]));
   }

   public static bwl.a gI() {
      return cgv.gA().a(bwm.v, 0.15F).a(bwm.c, 6.0);
   }

   public chk.a gJ() {
      return chk.a.a(this.gy(), this.gz());
   }

   public boolean gK() {
      return this.gJ() == chk.a.b;
   }

   public boolean gL() {
      return this.gJ() == chk.a.c;
   }

   public boolean gM() {
      return this.gJ() == chk.a.d;
   }

   public boolean gN() {
      return this.gJ() == chk.a.e;
   }

   public boolean gO() {
      return this.gJ() == chk.a.f;
   }

   @Override
   public boolean gk() {
      return this.gJ() == chk.a.g;
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public boolean E(bui $$0) {
      if (!this.gk()) {
         this.cq = true;
      }

      return super.E($$0);
   }

   @Override
   public void gm() {
      this.a(awo.sD, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gL()) {
         if (this.dY().ad() && !this.bl()) {
            this.x(true);
            this.z(false);
         } else if (!this.gw()) {
            this.x(false);
         }
      }

      bve $$0 = this.m();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awo.sz, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.gx() + 1);
         if (this.gx() > 20) {
            this.A(false);
            this.gZ();
         } else if (this.gx() == 1) {
            this.a(awo.st, 1.0F, 1.0F);
         }
      }

      if (this.gH()) {
         this.gY();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.w(0.0F);
      }

      this.gV();
      this.gT();
      this.gW();
      this.gX();
   }

   public boolean gP() {
      return this.gL() && this.dY().ad();
   }

   private void gT() {
      if (!this.gw() && this.y() && !this.gP() && !this.a(buq.a).f() && this.af.a(80) == 1) {
         this.z(true);
      } else if (this.a(buq.a).f() || !this.y()) {
         this.z(false);
      }

      if (this.gw()) {
         this.gU();
         if (!this.dY().C && this.gS() > 80 && this.af.a(20) == 1) {
            if (this.gS() > 100 && this.a(buq.a).a(axm.av)) {
               if (!this.dY().C) {
                  this.a(buq.a, cwf.k);
                  this.a(eak.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.v(this.gS() + 1);
      }
   }

   private void gU() {
      if (this.gS() % 5 == 0) {
         this.a(awo.sx, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ezr $$1 = new ezr(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dQ() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dO() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            ezr $$3 = new ezr(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dD(), this.dH() + 1.0, this.dJ());
            this.dY().a(new lo(ls.S, this.a(buq.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gV() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gW() {
      this.cv = this.cu;
      if (this.gv()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gX() {
      this.cx = this.cw;
      if (this.gH()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float J(float $$0) {
      return azn.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return azn.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return azn.h($$0, this.cx, this.cw);
   }

   private void gY() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dY().C) {
            ezr $$0 = this.dB();
            if (this.bZ == 1) {
               float $$1 = this.dO() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new ezr($$0.d + (double)(-azn.a($$1) * $$2), 0.0, $$0.f + (double)(azn.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aL() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gZ() {
      ezr $$0 = this.dB();
      dff $$1 = this.dY();
      $$1.a(
         ls.ag,
         this.dD() - (double)(this.dt() + 1.0F) * 0.5 * (double)azn.a(this.aX * (float) (Math.PI / 180.0)),
         this.dH() - 0.1F,
         this.dJ() + (double)(this.dt() + 1.0F) * 0.5 * (double)azn.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awo.su, 1.0F, 1.0F);

      for (chk $$3 : $$1.a(chk.class, this.cT().g(10.0))) {
         if (!$$3.p_() && $$3.aL() && !$$3.bl() && $$3.gR()) {
            $$3.v();
         }
      }

      if (!$$1.y_() && $$1.ac().b(dfb.f)) {
         this.a(euc.aH, this::b);
      }
   }

   @Override
   protected void b(ckz $$0) {
      if (this.a(buq.a).f() && c($$0)) {
         this.a($$0);
         cwf $$1 = $$0.m();
         this.a(buq.a, $$1);
         this.g(buq.a);
         this.a($$0, $$1.L());
         $$0.av();
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (!this.dY().C) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      this.a(chk.a.a($$4));
      this.b(chk.a.a($$4));
      this.gQ();
      if ($$3 == null) {
         $$3 = new btz.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chk $$0, @Nullable chk $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.ha());
            this.b(chk.a.a(this.af));
         } else {
            this.a(chk.a.a(this.af));
            this.b($$0.ha());
         }
      } else if (this.af.h()) {
         this.a($$0.ha());
         this.b($$1.ha());
      } else {
         this.a($$1.ha());
         this.b($$0.ha());
      }

      if (this.af.a(32) == 0) {
         this.a(chk.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(chk.a.a(this.af));
      }
   }

   private chk.a ha() {
      return this.af.h() ? this.gy() : this.gz();
   }

   public void gQ() {
      if (this.gO()) {
         this.g(bwm.s).a(10.0);
      }

      if (this.gK()) {
         this.g(bwm.v).a(0.07F);
      }
   }

   void hb() {
      if (!this.bl()) {
         this.G(0.0F);
         this.P().o();
         this.x(true);
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (this.gP()) {
         return bsh.e;
      } else if (this.gv()) {
         this.y(false);
         return bsh.a;
      } else if (this.l($$2)) {
         if (this.m() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dY().C && this.g() == 0 && this.gC()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dY().C || this.y() || this.bl()) {
               return bsh.e;
            }

            this.hb();
            this.z(true);
            cwf $$3 = this.a(buq.a);
            if (!$$3.f() && !$$0.fY()) {
               this.b($$3);
            }

            this.a(buq.a, new cwf($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsh.b;
      } else {
         return bsh.e;
      }
   }

   @Nullable
   @Override
   protected awn w() {
      if (this.gk()) {
         return awo.sA;
      } else {
         return this.gL() ? awo.sB : awo.sv;
      }
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.sy, 0.15F, 1.0F);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.au);
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.sw;
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.sC;
   }

   public boolean gR() {
      return !this.gv() && !this.gP() && !this.gw() && !this.gH() && !this.y();
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   private static boolean c(ckz $$0) {
      return $$0.m().a(axm.av) && $$0.bN() && !$$0.w();
   }

   public static enum a implements baj {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final baj.a<chk.a> h = baj.a(chk.a::values);
      private static final IntFunction<chk.a> i = aye.a(chk.a::a, values(), aye.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(final int $$0, final String $$1, final boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      @Override
      public String c() {
         return this.l;
      }

      public boolean b() {
         return this.m;
      }

      static chk.a a(chk.a $$0, chk.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static chk.a a(int $$0) {
         return i.apply($$0);
      }

      public static chk.a a(String $$0) {
         return h.a($$0, a);
      }

      public static chk.a a(azv $$0) {
         int $$1 = $$0.a(16);
         if ($$1 == 0) {
            return b;
         } else if ($$1 == 1) {
            return c;
         } else if ($$1 == 2) {
            return d;
         } else if ($$1 == 4) {
            return g;
         } else if ($$1 < 9) {
            return f;
         } else {
            return $$1 < 11 ? e : a;
         }
      }
   }

   static class b extends ccm {
      private final chk b;

      public b(chk $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gR() && super.b();
      }
   }

   static class c<T extends bve> extends cbj<T> {
      private final chk i;

      public c(chk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bun.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gL() && this.i.gR() && super.b();
      }
   }

   static class d extends cbo {
      private final chk d;
      private int e;

      public d(chk $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.q() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ag) {
               this.d.t(32);
               this.e = this.d.ag + 600;
               if (this.d.dl()) {
                  cor $$0 = this.b.a(chk.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jh $$0 = this.d.dy();
         jh.a $$1 = new jh.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dil.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cdu {
      private final chk a;

      public e(chk $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.cp && !this.a.cq) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bvg $$0, bve $$1) {
         if ($$0 instanceof chk && $$0.gk()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends ccc {
      private final chk a;
      private int b;

      public f(chk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ag && this.a.gK() && this.a.gR() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bl() && (this.a.gK() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.y(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
         this.b = this.a.ag + 200;
      }
   }

   static class g extends cck {
      private final chk h;

      public g(chk $$0, Class<? extends bve> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bve $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.eb().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cor.class) {
                  this.c = this.b.dY().a(this.g, this.b, this.b.dD(), this.b.dH(), this.b.dJ());
               } else {
                  this.c = this.b
                     .dY()
                     .a(
                        this.b.dY().a(this.f, this.b.cT().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dD(),
                        this.b.dH(),
                        this.b.dJ()
                     );
               }
            }

            return this.h.gR() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cbf {
      private final chk l;

      public h(chk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gR()) {
            super.a();
         }
      }
   }

   static class i extends ccv {
      private final chk a;

      public i(chk $$0, double $$1) {
         super($$0, $$1, axf.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.y()) {
            this.a.P().o();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends ccc {
      private final chk a;

      public j(chk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b, ccc.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.p_() || this.a.gM()) && this.a.aL()) {
            if (!this.a.gR()) {
               return false;
            } else {
               float $$0 = this.a.dO() * (float) (Math.PI / 180.0);
               float $$1 = -azn.a($$0);
               float $$2 = azn.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azn.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azn.j((double)$$2) : 0;
               if (this.a.dY().a_(this.a.dy().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gM() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.B(true);
      }

      @Override
      public boolean U_() {
         return false;
      }
   }

   class k extends ccc {
      private int b;

      public k() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chk.this.ag || chk.this.p_() || chk.this.bl() || !chk.this.gR() || chk.this.q() > 0) {
            return false;
         } else {
            return !chk.this.a(buq.a).f() ? true : !chk.this.dY().a(ckz.class, chk.this.cT().c(6.0, 6.0, 6.0), chk::c).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chk.this.bl() && (chk.this.gK() || chk.this.af.a(b(600)) != 1) ? chk.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chk.this.y() && !chk.this.a(buq.a).f()) {
            chk.this.hb();
         }
      }

      @Override
      public void d() {
         if (chk.this.a(buq.a).f()) {
            List<ckz> $$0 = chk.this.dY().a(ckz.class, chk.this.cT().c(8.0, 8.0, 8.0), chk::c);
            if (!$$0.isEmpty()) {
               chk.this.P().a($$0.getFirst(), 1.2F);
            }
         } else {
            chk.this.hb();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwf $$0 = chk.this.a(buq.a);
         if (!$$0.f()) {
            chk.this.b($$0);
            chk.this.a(buq.a, cwf.k);
            int $$1 = chk.this.gK() ? chk.this.af.a(50) + 10 : chk.this.af.a(150) + 10;
            this.b = chk.this.ag + $$1 * 20;
         }

         chk.this.x(false);
      }
   }

   static class l extends ccc {
      private final chk a;

      public l(chk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.p_() && this.a.gR()) {
            return this.a.gO() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.A(true);
      }
   }
}
