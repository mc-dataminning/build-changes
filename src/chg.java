import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chg extends cgr {
   private static final akl<Integer> ca = akp.a(chg.class, akn.b);
   private static final akl<Integer> cc = akp.a(chg.class, akn.b);
   private static final akl<Integer> cd = akp.a(chg.class, akn.b);
   private static final akl<Byte> ce = akp.a(chg.class, akn.a);
   private static final akl<Byte> cf = akp.a(chg.class, akn.a);
   private static final akl<Byte> cg = akp.a(chg.class, akn.a);
   static final cfr ch = cfr.b().a(8.0);
   private static final buh ci = bul.aw.n().a(0.5F).a(bug.a().a(buf.a, 0.0F, 0.40625F, 0.0F));
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
   private ezn cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   chg.g cy;

   public chg(bul<? extends chg> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new chg.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bum $$0) {
      return $$0 == bum.a && this.fP();
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

   public boolean gu() {
      return this.w(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gv() {
      return this.am.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.am.a(cd, $$0 ? 1 : 0);
   }

   private int gR() {
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

   public int gw() {
      return this.am.a(cc);
   }

   public void u(int $$0) {
      this.am.a(cc, $$0);
   }

   public chg.a gx() {
      return chg.a.a(this.am.a(ce));
   }

   public void a(chg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chg.a.a(this.af);
      }

      this.am.a(ce, (byte)$$0.a());
   }

   public chg.a gy() {
      return chg.a.a(this.am.a(cf));
   }

   public void b(chg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chg.a.a(this.af);
      }

      this.am.a(cf, (byte)$$0.a());
   }

   public boolean gG() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gx().c());
      $$0.a("HiddenGene", this.gy().c());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(chg.a.a($$0.l("MainGene")));
      this.b(chg.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      chg $$2 = bul.aw.a($$0, buk.e);
      if ($$2 != null) {
         if ($$1 instanceof chg $$3) {
            $$2.a(this, $$3);
         }

         $$2.gP();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(2, new chg.i(this, 2.0));
      this.bS.a(2, new chg.d(this, 1.0));
      this.bS.a(3, new chg.b(this, 1.2F, true));
      this.bS.a(4, new cdg(this, 1.0, $$0 -> $$0.a(axj.at), false));
      this.bS.a(6, new chg.c<>(this, com.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chg.c<>(this, clr.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chg.k());
      this.bS.a(8, new chg.f(this));
      this.bS.a(8, new chg.l(this));
      this.cy = new chg.g(this, com.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new cct(this));
      this.bS.a(12, new chg.j(this));
      this.bS.a(13, new cbx(this, 1.25));
      this.bS.a(14, new cdl(this, 1.0));
      this.bT.a(1, new chg.e(this).a(new Class[0]));
   }

   public static bwh.a gH() {
      return cgr.gz().a(bwi.v, 0.15F).a(bwi.c, 6.0);
   }

   public chg.a gI() {
      return chg.a.a(this.gx(), this.gy());
   }

   public boolean gJ() {
      return this.gI() == chg.a.b;
   }

   public boolean gK() {
      return this.gI() == chg.a.c;
   }

   public boolean gL() {
      return this.gI() == chg.a.d;
   }

   public boolean gM() {
      return this.gI() == chg.a.e;
   }

   public boolean gN() {
      return this.gI() == chg.a.f;
   }

   @Override
   public boolean gj() {
      return this.gI() == chg.a.g;
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public boolean E(bue $$0) {
      if (!this.gj()) {
         this.cq = true;
      }

      return super.E($$0);
   }

   @Override
   public void gl() {
      this.a(awl.sD, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gK()) {
         if (this.dX().ad() && !this.bk()) {
            this.x(true);
            this.z(false);
         } else if (!this.gv()) {
            this.x(false);
         }
      }

      bva $$0 = this.m();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awl.sz, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.gw() + 1);
         if (this.gw() > 20) {
            this.A(false);
            this.gY();
         } else if (this.gw() == 1) {
            this.a(awl.st, 1.0F, 1.0F);
         }
      }

      if (this.gG()) {
         this.gX();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.w(0.0F);
      }

      this.gU();
      this.gS();
      this.gV();
      this.gW();
   }

   public boolean gO() {
      return this.gK() && this.dX().ad();
   }

   private void gS() {
      if (!this.gv() && this.y() && !this.gO() && !this.a(bum.a).f() && this.af.a(80) == 1) {
         this.z(true);
      } else if (this.a(bum.a).f() || !this.y()) {
         this.z(false);
      }

      if (this.gv()) {
         this.gT();
         if (!this.dX().C && this.gR() > 80 && this.af.a(20) == 1) {
            if (this.gR() > 100 && this.a(bum.a).a(axj.au)) {
               if (!this.dX().C) {
                  this.a(bum.a, cwb.k);
                  this.a(eag.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.v(this.gR() + 1);
      }
   }

   private void gT() {
      if (this.gR() % 5 == 0) {
         this.a(awl.sx, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ezn $$1 = new ezn(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dP() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dN() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            ezn $$3 = new ezn(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dC(), this.dG() + 1.0, this.dI());
            this.dX().a(new ln(lr.S, this.a(bum.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gU() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gV() {
      this.cv = this.cu;
      if (this.gu()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gW() {
      this.cx = this.cw;
      if (this.gG()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float J(float $$0) {
      return azk.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return azk.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cx, this.cw);
   }

   private void gX() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dX().C) {
            ezn $$0 = this.dA();
            if (this.bZ == 1) {
               float $$1 = this.dN() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new ezn($$0.d + (double)(-azk.a($$1) * $$2), 0.0, $$0.f + (double)(azk.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aK() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gY() {
      ezn $$0 = this.dA();
      dfb $$1 = this.dX();
      $$1.a(
         lr.ag,
         this.dC() - (double)(this.ds() + 1.0F) * 0.5 * (double)azk.a(this.aX * (float) (Math.PI / 180.0)),
         this.dG() - 0.1F,
         this.dI() + (double)(this.ds() + 1.0F) * 0.5 * (double)azk.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awl.su, 1.0F, 1.0F);

      for (chg $$3 : $$1.a(chg.class, this.cS().g(10.0))) {
         if (!$$3.p_() && $$3.aK() && !$$3.bk() && $$3.gQ()) {
            $$3.v();
         }
      }

      if (!$$1.y_() && $$1.ac().b(dex.f)) {
         this.a(ety.aH, this::b);
      }
   }

   @Override
   protected void b(ckv $$0) {
      if (this.a(bum.a).f() && c($$0)) {
         this.a($$0);
         cwb $$1 = $$0.m();
         this.a(bum.a, $$1);
         this.g(bum.a);
         this.a($$0, $$1.L());
         $$0.av();
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (!this.dX().C) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      this.a(chg.a.a($$4));
      this.b(chg.a.a($$4));
      this.gP();
      if ($$3 == null) {
         $$3 = new btv.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chg $$0, @Nullable chg $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gZ());
            this.b(chg.a.a(this.af));
         } else {
            this.a(chg.a.a(this.af));
            this.b($$0.gZ());
         }
      } else if (this.af.h()) {
         this.a($$0.gZ());
         this.b($$1.gZ());
      } else {
         this.a($$1.gZ());
         this.b($$0.gZ());
      }

      if (this.af.a(32) == 0) {
         this.a(chg.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(chg.a.a(this.af));
      }
   }

   private chg.a gZ() {
      return this.af.h() ? this.gx() : this.gy();
   }

   public void gP() {
      if (this.gN()) {
         this.g(bwi.s).a(10.0);
      }

      if (this.gJ()) {
         this.g(bwi.v).a(0.07F);
      }
   }

   void ha() {
      if (!this.bk()) {
         this.G(0.0F);
         this.P().o();
         this.x(true);
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (this.gO()) {
         return bsd.e;
      } else if (this.gu()) {
         this.y(false);
         return bsd.a;
      } else if (this.l($$2)) {
         if (this.m() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dX().C && this.g() == 0 && this.gB()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dX().C || this.y() || this.bk()) {
               return bsd.e;
            }

            this.ha();
            this.z(true);
            cwb $$3 = this.a(bum.a);
            if (!$$3.f() && !$$0.fX()) {
               this.b($$3);
            }

            this.a(bum.a, new cwb($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsd.b;
      } else {
         return bsd.e;
      }
   }

   @Nullable
   @Override
   protected awk w() {
      if (this.gj()) {
         return awl.sA;
      } else {
         return this.gK() ? awl.sB : awl.sv;
      }
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.sy, 0.15F, 1.0F);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.at);
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.sw;
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.sC;
   }

   public boolean gQ() {
      return !this.gu() && !this.gO() && !this.gv() && !this.gG() && !this.y();
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   private static boolean c(ckv $$0) {
      return $$0.m().a(axj.au) && $$0.bM() && !$$0.w();
   }

   public static enum a implements bag {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bag.a<chg.a> h = bag.a(chg.a::values);
      private static final IntFunction<chg.a> i = ayb.a(chg.a::a, values(), ayb.a.a);
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

      static chg.a a(chg.a $$0, chg.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static chg.a a(int $$0) {
         return i.apply($$0);
      }

      public static chg.a a(String $$0) {
         return h.a($$0, a);
      }

      public static chg.a a(azs $$0) {
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

   static class b extends cci {
      private final chg b;

      public b(chg $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gQ() && super.b();
      }
   }

   static class c<T extends bva> extends cbf<T> {
      private final chg i;

      public c(chg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buj.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gK() && this.i.gQ() && super.b();
      }
   }

   static class d extends cbk {
      private final chg d;
      private int e;

      public d(chg $$0, double $$1) {
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
               if (this.d.dk()) {
                  com $$0 = this.b.a(chg.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jh $$0 = this.d.dx();
         jh.a $$1 = new jh.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dig.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cdq {
      private final chg a;

      public e(chg $$0, Class<?>... $$1) {
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
      protected void a(bvc $$0, bva $$1) {
         if ($$0 instanceof chg && $$0.gj()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cby {
      private final chg a;
      private int b;

      public f(chg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ag && this.a.gJ() && this.a.gQ() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bk() && (this.a.gJ() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
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

   static class g extends ccg {
      private final chg h;

      public g(chg $$0, Class<? extends bva> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bva $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.ea().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == com.class) {
                  this.c = this.b.dX().a(this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
               } else {
                  this.c = this.b
                     .dX()
                     .a(
                        this.b.dX().a(this.f, this.b.cS().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dC(),
                        this.b.dG(),
                        this.b.dI()
                     );
               }
            }

            return this.h.gQ() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cbb {
      private final chg l;

      public h(chg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gQ()) {
            super.a();
         }
      }
   }

   static class i extends ccr {
      private final chg a;

      public i(chg $$0, double $$1) {
         super($$0, $$1, axc.G);
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

   static class j extends cby {
      private final chg a;

      public j(chg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.a, cby.a.b, cby.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.p_() || this.a.gL()) && this.a.aK()) {
            if (!this.a.gQ()) {
               return false;
            } else {
               float $$0 = this.a.dN() * (float) (Math.PI / 180.0);
               float $$1 = -azk.a($$0);
               float $$2 = azk.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azk.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azk.j((double)$$2) : 0;
               if (this.a.dX().a_(this.a.dx().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gL() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
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

   class k extends cby {
      private int b;

      public k() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chg.this.ag || chg.this.p_() || chg.this.bk() || !chg.this.gQ() || chg.this.q() > 0) {
            return false;
         } else {
            return !chg.this.a(bum.a).f() ? true : !chg.this.dX().a(ckv.class, chg.this.cS().c(6.0, 6.0, 6.0), chg::c).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chg.this.bk() && (chg.this.gJ() || chg.this.af.a(b(600)) != 1) ? chg.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chg.this.y() && !chg.this.a(bum.a).f()) {
            chg.this.ha();
         }
      }

      @Override
      public void d() {
         if (chg.this.a(bum.a).f()) {
            List<ckv> $$0 = chg.this.dX().a(ckv.class, chg.this.cS().c(8.0, 8.0, 8.0), chg::c);
            if (!$$0.isEmpty()) {
               chg.this.P().a($$0.getFirst(), 1.2F);
            }
         } else {
            chg.this.ha();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwb $$0 = chg.this.a(bum.a);
         if (!$$0.f()) {
            chg.this.b($$0);
            chg.this.a(bum.a, cwb.k);
            int $$1 = chg.this.gJ() ? chg.this.af.a(50) + 10 : chg.this.af.a(150) + 10;
            this.b = chg.this.ag + $$1 * 20;
         }

         chg.this.x(false);
      }
   }

   static class l extends cby {
      private final chg a;

      public l(chg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.p_() && this.a.gQ()) {
            return this.a.gN() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
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
