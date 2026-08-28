import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjd extends cio {
   private static final akh<Integer> bH = akl.a(cjd.class, akj.b);
   private static final akh<Integer> bJ = akl.a(cjd.class, akj.b);
   private static final akh<Integer> bK = akl.a(cjd.class, akj.b);
   private static final akh<Byte> bL = akl.a(cjd.class, akj.a);
   private static final akh<Byte> bM = akl.a(cjd.class, akj.a);
   private static final akh<Byte> bN = akl.a(cjd.class, akj.a);
   static final cho bO = cho.b().a(8.0);
   private static final bwd bP = bwj.aN.n().a(0.5F).a(bwc.a().a(bwb.a, 0.0F, 0.40625F, 0.0F));
   private static final int bQ = 2;
   private static final int bR = 4;
   private static final int bS = 8;
   private static final int bT = 16;
   private static final int bU = 5;
   public static final int bF = 32;
   private static final int bV = 32;
   boolean bW;
   boolean bX;
   public int bG;
   private fdw bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   cjd.g cf;

   public cjd(bwj<? extends cjd> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new cjd.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bwk $$0) {
      return $$0 == bwk.a && this.fM();
   }

   public int q() {
      return this.al.a(bH);
   }

   public void s(int $$0) {
      this.al.a(bH, $$0);
   }

   public boolean t() {
      return this.v(2);
   }

   public boolean x() {
      return this.v(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gq() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gr() {
      return this.al.a(bK) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bK, $$0 ? 1 : 0);
   }

   private int gN() {
      return this.al.a(bK);
   }

   private void u(int $$0) {
      this.al.a(bK, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gs() {
      return this.al.a(bJ);
   }

   public void t(int $$0) {
      this.al.a(bJ, $$0);
   }

   public cjd.a gt() {
      return cjd.a.a(this.al.a(bL));
   }

   public void a(cjd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjd.a.a(this.ae);
      }

      this.al.a(bL, (byte)$$0.a());
   }

   public cjd.a gu() {
      return cjd.a.a(this.al.a(bM));
   }

   public void b(cjd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjd.a.a(this.ae);
      }

      this.al.a(bM, (byte)$$0.a());
   }

   public boolean gC() {
      return this.v(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
      $$0.a(bJ, 0);
      $$0.a(bL, (byte)0);
      $$0.a(bM, (byte)0);
      $$0.a(bN, (byte)0);
      $$0.a(bK, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(bN) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(bN);
      if ($$1) {
         this.al.a(bN, (byte)($$2 | $$0));
      } else {
         this.al.a(bN, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gt().c());
      $$0.a("HiddenGene", this.gu().c());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cjd.a.a($$0.l("MainGene")));
      this.b(cjd.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      cjd $$2 = bwj.aN.a($$0, bwi.e);
      if ($$2 != null) {
         if ($$1 instanceof cjd $$3) {
            $$2.a(this, $$3);
         }

         $$2.gL();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(2, new cjd.i(this, 2.0));
      this.bC.a(2, new cjd.d(this, 1.0));
      this.bC.a(3, new cjd.b(this, 1.2F, true));
      this.bC.a(4, new cfd(this, 1.0, $$0 -> $$0.a(axi.at), false));
      this.bC.a(6, new cjd.c<>(this, cqs.class, 8.0F, 2.0, 2.0));
      this.bC.a(6, new cjd.c<>(this, cnt.class, 4.0F, 2.0, 2.0));
      this.bC.a(7, new cjd.k());
      this.bC.a(8, new cjd.f(this));
      this.bC.a(8, new cjd.l(this));
      this.cf = new cjd.g(this, cqs.class, 6.0F);
      this.bC.a(9, this.cf);
      this.bC.a(10, new ceq(this));
      this.bC.a(12, new cjd.j(this));
      this.bC.a(13, new cdu(this, 1.25));
      this.bC.a(14, new cfi(this, 1.0));
      this.bD.a(1, new cjd.e(this).a(new Class[0]));
   }

   public static bye.a gD() {
      return cio.gv().a(byf.v, 0.15F).a(byf.c, 6.0);
   }

   public cjd.a gE() {
      return cjd.a.a(this.gt(), this.gu());
   }

   public boolean gF() {
      return this.gE() == cjd.a.b;
   }

   public boolean gG() {
      return this.gE() == cjd.a.c;
   }

   public boolean gH() {
      return this.gE() == cjd.a.d;
   }

   public boolean gI() {
      return this.gE() == cjd.a.e;
   }

   public boolean gJ() {
      return this.gE() == cjd.a.f;
   }

   @Override
   public boolean gh() {
      return this.gE() == cjd.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if (!this.gh()) {
         this.bX = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gj() {
      this.a(awl.tn, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gG()) {
         if (this.dV().ag() && !this.bj()) {
            this.w(true);
            this.y(false);
         } else if (!this.gr()) {
            this.w(false);
         }
      }

      bwz $$0 = this.f();
      if ($$0 == null) {
         this.bW = false;
         this.bX = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awl.tj, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gs() + 1);
         if (this.gs() > 20) {
            this.z(false);
            this.gU();
         } else if (this.gs() == 1) {
            this.a(awl.td, 1.0F, 1.0F);
         }
      }

      if (this.gC()) {
         this.gT();
      } else {
         this.bG = 0;
      }

      if (this.x()) {
         this.x(0.0F);
      }

      this.gQ();
      this.gO();
      this.gR();
      this.gS();
   }

   public boolean gK() {
      return this.gG() && this.dV().ag();
   }

   private void gO() {
      if (!this.gr() && this.x() && !this.gK() && !this.a(bwk.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bwk.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gr()) {
         this.gP();
         if (!this.dV().C && this.gN() > 80 && this.ae.a(20) == 1) {
            if (this.gN() > 100 && this.a(bwk.a).a(axi.au)) {
               if (!this.dV().C) {
                  this.a(bwk.a, cys.k);
                  this.a(eeo.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.u(this.gN() + 1);
      }
   }

   private void gP() {
      if (this.gN() % 5 == 0) {
         this.a(awl.th, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fdw $$1 = new fdw(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fdw $$3 = new fdw(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lt(lx.U, this.a(bwk.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gQ() {
      this.ca = this.bZ;
      if (this.x()) {
         this.bZ = Math.min(1.0F, this.bZ + 0.15F);
      } else {
         this.bZ = Math.max(0.0F, this.bZ - 0.19F);
      }
   }

   private void gR() {
      this.cc = this.cb;
      if (this.gq()) {
         this.cb = Math.min(1.0F, this.cb + 0.15F);
      } else {
         this.cb = Math.max(0.0F, this.cb - 0.19F);
      }
   }

   private void gS() {
      this.ce = this.cd;
      if (this.gC()) {
         this.cd = Math.min(1.0F, this.cd + 0.15F);
      } else {
         this.cd = Math.max(0.0F, this.cd - 0.19F);
      }
   }

   public float J(float $$0) {
      return azk.h($$0, this.ca, this.bZ);
   }

   public float K(float $$0) {
      return azk.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return azk.h($$0, this.ce, this.cd);
   }

   private void gT() {
      this.bG++;
      if (this.bG > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            fdw $$0 = this.dy();
            if (this.bG == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.bY = new fdw($$0.d + (double)(-azk.a($$1) * $$2), 0.0, $$0.f + (double)(azk.b($$1) * $$2));
               this.i(this.bY.b(0.0, 0.27, 0.0));
            } else if ((float)this.bG != 7.0F && (float)this.bG != 15.0F && (float)this.bG != 23.0F) {
               this.n(this.bY.d, $$0.e, this.bY.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gU() {
      fdw $$0 = this.dy();
      dip $$1 = this.dV();
      $$1.a(
         lx.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azk.a(this.aV * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azk.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awl.te, 1.0F, 1.0F);

      for (cjd $$3 : $$1.a(cjd.class, this.cR().g(10.0))) {
         if (!$$3.n_() && $$3.aJ() && !$$3.bj() && $$3.gM()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof aro $$4 && $$4.O().c(dil.f)) {
         this.a($$4, eyj.aH, this::a);
      }
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      if (this.a(bwk.a).f() && b($$1)) {
         this.a($$1);
         cys $$2 = $$1.f();
         this.a(bwk.a, $$2);
         this.g(bwk.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      this.a(cjd.a.a($$4));
      this.b(cjd.a.a($$4));
      this.gL();
      if ($$3 == null) {
         $$3 = new bvq.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjd $$0, @Nullable cjd $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gV());
            this.b(cjd.a.a(this.ae));
         } else {
            this.a(cjd.a.a(this.ae));
            this.b($$0.gV());
         }
      } else if (this.ae.h()) {
         this.a($$0.gV());
         this.b($$1.gV());
      } else {
         this.a($$1.gV());
         this.b($$0.gV());
      }

      if (this.ae.a(32) == 0) {
         this.a(cjd.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cjd.a.a(this.ae));
      }
   }

   private cjd.a gV() {
      return this.ae.h() ? this.gt() : this.gu();
   }

   public void gL() {
      if (this.gJ()) {
         this.g(byf.s).a(10.0);
      }

      if (this.gF()) {
         this.g(byf.v).a(0.07F);
      }
   }

   void gW() {
      if (!this.bj()) {
         this.G(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (this.gK()) {
         return bty.e;
      } else if (this.gq()) {
         this.x(false);
         return bty.a;
      } else if (this.k($$2)) {
         if (this.f() != null) {
            this.bW = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.g() == 0 && this.gx()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dV() instanceof aro $$3) || this.x() || this.bj()) {
               return bty.e;
            }

            this.gW();
            this.y(true);
            cys $$4 = this.a(bwk.a);
            if (!$$4.f() && !$$0.fU()) {
               this.a($$3, $$4);
            }

            this.a(bwk.a, new cys($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bty.b;
      } else {
         return bty.e;
      }
   }

   @Nullable
   @Override
   protected awk u() {
      if (this.gh()) {
         return awl.tk;
      } else {
         return this.gG() ? awl.tl : awl.tf;
      }
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.ti, 0.15F, 1.0F);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.at);
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.tg;
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.tm;
   }

   public boolean gM() {
      return !this.gq() && !this.gK() && !this.gr() && !this.gC() && !this.x();
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bP : super.e($$0);
   }

   private static boolean b(cmx $$0) {
      return $$0.f().a(axi.au) && $$0.bK() && !$$0.o();
   }

   public static enum a implements bai {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bai.a<cjd.a> h = bai.a(cjd.a::values);
      private static final IntFunction<cjd.a> i = aya.a(cjd.a::a, values(), aya.a.a);
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

      static cjd.a a(cjd.a $$0, cjd.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cjd.a a(int $$0) {
         return i.apply($$0);
      }

      public static cjd.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cjd.a a(azt $$0) {
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

   static class b extends cef {
      private final cjd b;

      public b(cjd $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gM() && super.b();
      }
   }

   static class c<T extends bwz> extends cdc<T> {
      private final cjd i;

      public c(cjd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwh.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gG() && this.i.gM() && super.b();
      }
   }

   static class d extends cdh {
      private final cjd d;
      private int e;

      public d(cjd $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.q() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.af) {
               this.d.s(32);
               this.e = this.d.af + 600;
               if (this.d.dj()) {
                  cqs $$0 = this.b.a(cjd.bO, this.d);
                  this.d.cf.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         iu $$0 = this.d.dv();
         iu.a $$1 = new iu.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dlw.nB)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cfn {
      private final cjd a;

      public e(cjd $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.bW && !this.a.bX) {
            return super.c();
         } else {
            this.a.g(null);
            return false;
         }
      }

      @Override
      protected void a(bxb $$0, bwz $$1) {
         if ($$0 instanceof cjd && $$0.gh()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends cdv {
      private final cjd a;
      private int b;

      public f(cjd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gF() && this.a.gM() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gF() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.x(false);
         this.b = this.a.af + 200;
      }
   }

   static class g extends ced {
      private final cjd h;

      public g(cjd $$0, Class<? extends bwz> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bwz $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dY().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               aro $$0 = a(this.b);
               if (this.f == cqs.class) {
                  this.c = $$0.a(this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG());
               } else {
                  this.c = $$0.a(
                     this.b.dV().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true),
                     this.g,
                     this.b,
                     this.b.dA(),
                     this.b.dE(),
                     this.b.dG()
                  );
               }
            }

            return this.h.gM() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends ccy {
      private final cjd l;

      public h(cjd $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gM()) {
            super.a();
         }
      }
   }

   static class i extends ceo {
      private final cjd a;

      public i(cjd $$0, double $$1) {
         super($$0, $$1, axb.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.O().m();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cdv {
      private final cjd a;

      public j(cjd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.a, cdv.a.b, cdv.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gH()) && this.a.aJ()) {
            if (!this.a.gM()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azk.a($$0);
               float $$2 = azk.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azk.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azk.j((double)$$2) : 0;
               if (this.a.dV().a_(this.a.dv().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gH() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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
         this.a.A(true);
      }

      @Override
      public boolean P_() {
         return false;
      }
   }

   class k extends cdv {
      private int b;

      public k() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cjd.this.af || cjd.this.n_() || cjd.this.bj() || !cjd.this.gM() || cjd.this.q() > 0) {
            return false;
         } else {
            return !cjd.this.a(bwk.a).f() ? true : !cjd.this.dV().a(cmx.class, cjd.this.cR().c(6.0, 6.0, 6.0), cjd::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cjd.this.bj() && (cjd.this.gF() || cjd.this.ae.a(b(600)) != 1) ? cjd.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cjd.this.x() && !cjd.this.a(bwk.a).f()) {
            cjd.this.gW();
         }
      }

      @Override
      public void d() {
         if (cjd.this.a(bwk.a).f()) {
            List<cmx> $$0 = cjd.this.dV().a(cmx.class, cjd.this.cR().c(8.0, 8.0, 8.0), cjd::b);
            if (!$$0.isEmpty()) {
               cjd.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            cjd.this.gW();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cys $$0 = cjd.this.a(bwk.a);
         if (!$$0.f()) {
            cjd.this.a(a(cjd.this.dV()), $$0);
            cjd.this.a(bwk.a, cys.k);
            int $$1 = cjd.this.gF() ? cjd.this.ae.a(50) + 10 : cjd.this.ae.a(150) + 10;
            this.b = cjd.this.af + $$1 * 20;
         }

         cjd.this.w(false);
      }
   }

   static class l extends cdv {
      private final cjd a;

      public l(cjd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.n_() && this.a.gM()) {
            return this.a.gJ() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
         this.a.z(true);
      }
   }
}
