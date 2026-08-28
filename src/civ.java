import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class civ extends cig {
   private static final akg<Integer> bG = akk.a(civ.class, aki.b);
   private static final akg<Integer> bI = akk.a(civ.class, aki.b);
   private static final akg<Integer> bJ = akk.a(civ.class, aki.b);
   private static final akg<Byte> bK = akk.a(civ.class, aki.a);
   private static final akg<Byte> bL = akk.a(civ.class, aki.a);
   private static final akg<Byte> bM = akk.a(civ.class, aki.a);
   static final chg bN = chg.b().a(8.0);
   private static final bvv bO = bwb.aN.n().a(0.5F).a(bvu.a().a(bvt.a, 0.0F, 0.40625F, 0.0F));
   private static final int bP = 2;
   private static final int bQ = 4;
   private static final int bR = 8;
   private static final int bS = 16;
   private static final int bT = 5;
   public static final int bE = 32;
   private static final int bU = 32;
   boolean bV;
   boolean bW;
   public int bF;
   private fcu bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   civ.g ce;

   public civ(bwb<? extends civ> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new civ.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bwc $$0) {
      return $$0 == bwc.a && this.fM();
   }

   public int q() {
      return this.al.a(bG);
   }

   public void s(int $$0) {
      this.al.a(bG, $$0);
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
      return this.al.a(bJ) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bJ, $$0 ? 1 : 0);
   }

   private int gN() {
      return this.al.a(bJ);
   }

   private void u(int $$0) {
      this.al.a(bJ, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gs() {
      return this.al.a(bI);
   }

   public void t(int $$0) {
      this.al.a(bI, $$0);
   }

   public civ.a gt() {
      return civ.a.a(this.al.a(bK));
   }

   public void a(civ.a $$0) {
      if ($$0.a() > 6) {
         $$0 = civ.a.a(this.ae);
      }

      this.al.a(bK, (byte)$$0.a());
   }

   public civ.a gu() {
      return civ.a.a(this.al.a(bL));
   }

   public void b(civ.a $$0) {
      if ($$0.a() > 6) {
         $$0 = civ.a.a(this.ae);
      }

      this.al.a(bL, (byte)$$0.a());
   }

   public boolean gC() {
      return this.v(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bI, 0);
      $$0.a(bK, (byte)0);
      $$0.a(bL, (byte)0);
      $$0.a(bM, (byte)0);
      $$0.a(bJ, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(bM) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(bM);
      if ($$1) {
         this.al.a(bM, (byte)($$2 | $$0));
      } else {
         this.al.a(bM, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gt().c());
      $$0.a("HiddenGene", this.gu().c());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(civ.a.a($$0.l("MainGene")));
      this.b(civ.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      civ $$2 = bwb.aN.a($$0, bwa.e);
      if ($$2 != null) {
         if ($$1 instanceof civ $$3) {
            $$2.a(this, $$3);
         }

         $$2.gL();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(2, new civ.i(this, 2.0));
      this.bB.a(2, new civ.d(this, 1.0));
      this.bB.a(3, new civ.b(this, 1.2F, true));
      this.bB.a(4, new cev(this, 1.0, $$0 -> $$0.a(axi.at), false));
      this.bB.a(6, new civ.c<>(this, cqi.class, 8.0F, 2.0, 2.0));
      this.bB.a(6, new civ.c<>(this, cnj.class, 4.0F, 2.0, 2.0));
      this.bB.a(7, new civ.k());
      this.bB.a(8, new civ.f(this));
      this.bB.a(8, new civ.l(this));
      this.ce = new civ.g(this, cqi.class, 6.0F);
      this.bB.a(9, this.ce);
      this.bB.a(10, new cei(this));
      this.bB.a(12, new civ.j(this));
      this.bB.a(13, new cdm(this, 1.25));
      this.bB.a(14, new cfa(this, 1.0));
      this.bC.a(1, new civ.e(this).a(new Class[0]));
   }

   public static bxw.a gD() {
      return cig.gv().a(bxx.v, 0.15F).a(bxx.c, 6.0);
   }

   public civ.a gE() {
      return civ.a.a(this.gt(), this.gu());
   }

   public boolean gF() {
      return this.gE() == civ.a.b;
   }

   public boolean gG() {
      return this.gE() == civ.a.c;
   }

   public boolean gH() {
      return this.gE() == civ.a.d;
   }

   public boolean gI() {
      return this.gE() == civ.a.e;
   }

   public boolean gJ() {
      return this.gE() == civ.a.f;
   }

   @Override
   public boolean gh() {
      return this.gE() == civ.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if (!this.gh()) {
         this.bW = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gj() {
      this.a(awk.tn, 1.0F, 1.0F);
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

      bwr $$0 = this.f();
      if ($$0 == null) {
         this.bV = false;
         this.bW = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awk.tj, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gs() + 1);
         if (this.gs() > 20) {
            this.z(false);
            this.gU();
         } else if (this.gs() == 1) {
            this.a(awk.td, 1.0F, 1.0F);
         }
      }

      if (this.gC()) {
         this.gT();
      } else {
         this.bF = 0;
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
      if (!this.gr() && this.x() && !this.gK() && !this.a(bwc.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bwc.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gr()) {
         this.gP();
         if (!this.dV().C && this.gN() > 80 && this.ae.a(20) == 1) {
            if (this.gN() > 100 && this.a(bwc.a).a(axi.au)) {
               if (!this.dV().C) {
                  this.a(bwc.a, cxy.k);
                  this.a(edm.m);
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
         this.a(awk.th, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fcu $$1 = new fcu(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fcu $$3 = new fcu(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lr(lv.U, this.a(bwc.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gQ() {
      this.bZ = this.bY;
      if (this.x()) {
         this.bY = Math.min(1.0F, this.bY + 0.15F);
      } else {
         this.bY = Math.max(0.0F, this.bY - 0.19F);
      }
   }

   private void gR() {
      this.cb = this.ca;
      if (this.gq()) {
         this.ca = Math.min(1.0F, this.ca + 0.15F);
      } else {
         this.ca = Math.max(0.0F, this.ca - 0.19F);
      }
   }

   private void gS() {
      this.cd = this.cc;
      if (this.gC()) {
         this.cc = Math.min(1.0F, this.cc + 0.15F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.19F);
      }
   }

   public float K(float $$0) {
      return azk.h($$0, this.bZ, this.bY);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cb, this.ca);
   }

   public float M(float $$0) {
      return azk.h($$0, this.cd, this.cc);
   }

   private void gT() {
      this.bF++;
      if (this.bF > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            fcu $$0 = this.dy();
            if (this.bF == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.bX = new fcu($$0.d + (double)(-azk.a($$1) * $$2), 0.0, $$0.f + (double)(azk.b($$1) * $$2));
               this.i(this.bX.b(0.0, 0.27, 0.0));
            } else if ((float)this.bF != 7.0F && (float)this.bF != 15.0F && (float)this.bF != 23.0F) {
               this.n(this.bX.d, $$0.e, this.bX.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gU() {
      fcu $$0 = this.dy();
      dhp $$1 = this.dV();
      $$1.a(
         lv.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azk.a(this.aU * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azk.b(this.aU * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awk.te, 1.0F, 1.0F);

      for (civ $$3 : $$1.a(civ.class, this.cR().g(10.0))) {
         if (!$$3.n_() && $$3.aJ() && !$$3.bj() && $$3.gM()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof arn $$4 && $$4.O().c(dhl.f)) {
         this.a($$4, exh.aH, this::a);
      }
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      if (this.a(bwc.a).f() && b($$1)) {
         this.a($$1);
         cxy $$2 = $$1.f();
         this.a(bwc.a, $$2);
         this.g(bwc.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      this.a(civ.a.a($$4));
      this.b(civ.a.a($$4));
      this.gL();
      if ($$3 == null) {
         $$3 = new bvi.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(civ $$0, @Nullable civ $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gV());
            this.b(civ.a.a(this.ae));
         } else {
            this.a(civ.a.a(this.ae));
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
         this.a(civ.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(civ.a.a(this.ae));
      }
   }

   private civ.a gV() {
      return this.ae.h() ? this.gt() : this.gu();
   }

   public void gL() {
      if (this.gJ()) {
         this.g(bxx.s).a(10.0);
      }

      if (this.gF()) {
         this.g(bxx.v).a(0.07F);
      }
   }

   void gW() {
      if (!this.bj()) {
         this.H(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (this.gK()) {
         return btq.e;
      } else if (this.gq()) {
         this.x(false);
         return btq.a;
      } else if (this.k($$2)) {
         if (this.f() != null) {
            this.bV = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.g() == 0 && this.gx()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dV() instanceof arn $$3) || this.x() || this.bj()) {
               return btq.e;
            }

            this.gW();
            this.y(true);
            cxy $$4 = this.a(bwc.a);
            if (!$$4.f() && !$$0.fU()) {
               this.a($$3, $$4);
            }

            this.a(bwc.a, new cxy($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return btq.b;
      } else {
         return btq.e;
      }
   }

   @Nullable
   @Override
   protected awj u() {
      if (this.gh()) {
         return awk.tk;
      } else {
         return this.gG() ? awk.tl : awk.tf;
      }
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.ti, 0.15F, 1.0F);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.at);
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.tg;
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.tm;
   }

   public boolean gM() {
      return !this.gq() && !this.gK() && !this.gr() && !this.gC() && !this.x();
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   private static boolean b(cmn $$0) {
      return $$0.f().a(axi.au) && $$0.bK() && !$$0.o();
   }

   public static enum a implements bag {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bag.a<civ.a> h = bag.a(civ.a::values);
      private static final IntFunction<civ.a> i = aya.a(civ.a::a, values(), aya.a.a);
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

      static civ.a a(civ.a $$0, civ.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static civ.a a(int $$0) {
         return i.apply($$0);
      }

      public static civ.a a(String $$0) {
         return h.a($$0, a);
      }

      public static civ.a a(azs $$0) {
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

   static class b extends cdx {
      private final civ b;

      public b(civ $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gM() && super.b();
      }
   }

   static class c<T extends bwr> extends ccu<T> {
      private final civ i;

      public c(civ $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvz.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gG() && this.i.gM() && super.b();
      }
   }

   static class d extends ccz {
      private final civ d;
      private int e;

      public d(civ $$0, double $$1) {
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
                  cqi $$0 = this.b.a(civ.bN, this.d);
                  this.d.ce.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jj $$0 = this.d.dv();
         jj.a $$1 = new jj.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dkw.nB)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cff {
      private final civ a;

      public e(civ $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.bV && !this.a.bW) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bwt $$0, bwr $$1) {
         if ($$0 instanceof civ && $$0.gh()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cdn {
      private final civ a;
      private int b;

      public f(civ $$0) {
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

   static class g extends cdv {
      private final civ h;

      public g(civ $$0, Class<? extends bwr> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bwr $$0) {
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
               arn $$0 = a(this.b);
               if (this.f == cqi.class) {
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

   static class h extends ccq {
      private final civ l;

      public h(civ $$0) {
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

   static class i extends ceg {
      private final civ a;

      public i(civ $$0, double $$1) {
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

   static class j extends cdn {
      private final civ a;

      public j(civ $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.a, cdn.a.b, cdn.a.c));
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

   class k extends cdn {
      private int b;

      public k() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > civ.this.af || civ.this.n_() || civ.this.bj() || !civ.this.gM() || civ.this.q() > 0) {
            return false;
         } else {
            return !civ.this.a(bwc.a).f() ? true : !civ.this.dV().a(cmn.class, civ.this.cR().c(6.0, 6.0, 6.0), civ::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !civ.this.bj() && (civ.this.gF() || civ.this.ae.a(b(600)) != 1) ? civ.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!civ.this.x() && !civ.this.a(bwc.a).f()) {
            civ.this.gW();
         }
      }

      @Override
      public void d() {
         if (civ.this.a(bwc.a).f()) {
            List<cmn> $$0 = civ.this.dV().a(cmn.class, civ.this.cR().c(8.0, 8.0, 8.0), civ::b);
            if (!$$0.isEmpty()) {
               civ.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            civ.this.gW();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxy $$0 = civ.this.a(bwc.a);
         if (!$$0.f()) {
            civ.this.a(a(civ.this.dV()), $$0);
            civ.this.a(bwc.a, cxy.k);
            int $$1 = civ.this.gF() ? civ.this.ae.a(50) + 10 : civ.this.ae.a(150) + 10;
            this.b = civ.this.af + $$1 * 20;
         }

         civ.this.w(false);
      }
   }

   static class l extends cdn {
      private final civ a;

      public l(civ $$0) {
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
