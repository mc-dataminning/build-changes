import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjn extends ciu {
   private static final akj<Integer> bI = akn.a(cjn.class, akl.b);
   private static final akj<Integer> bK = akn.a(cjn.class, akl.b);
   private static final akj<Integer> bL = akn.a(cjn.class, akl.b);
   private static final akj<Byte> bM = akn.a(cjn.class, akl.a);
   private static final akj<Byte> bN = akn.a(cjn.class, akl.a);
   private static final akj<Byte> bO = akn.a(cjn.class, akl.a);
   static final cht bP = cht.b().a(8.0);
   private static final bwi bQ = bwo.aN.n().a(0.5F).a(bwh.a().a(bwg.a, 0.0F, 0.40625F, 0.0F));
   private static final int bR = 2;
   private static final int bS = 4;
   private static final int bT = 8;
   private static final int bU = 16;
   private static final int bV = 5;
   public static final int bG = 32;
   private static final int bW = 32;
   boolean bX;
   boolean bY;
   public int bH;
   private feq bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   cjn.g cg;

   public cjn(bwo<? extends cjn> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cjn.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bwp $$0) {
      return $$0 == bwp.a && this.fN();
   }

   public int q() {
      return this.al.a(bI);
   }

   public void s(int $$0) {
      this.al.a(bI, $$0);
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

   public boolean gr() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gs() {
      return this.al.a(bL) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bL, $$0 ? 1 : 0);
   }

   private int gO() {
      return this.al.a(bL);
   }

   private void u(int $$0) {
      this.al.a(bL, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gt() {
      return this.al.a(bK);
   }

   public void t(int $$0) {
      this.al.a(bK, $$0);
   }

   public cjn.a gu() {
      return cjn.a.a(this.al.a(bM));
   }

   public void a(cjn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjn.a.a(this.ae);
      }

      this.al.a(bM, (byte)$$0.a());
   }

   public cjn.a gv() {
      return cjn.a.a(this.al.a(bN));
   }

   public void b(cjn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjn.a.a(this.ae);
      }

      this.al.a(bN, (byte)$$0.a());
   }

   public boolean gD() {
      return this.v(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
      $$0.a(bK, 0);
      $$0.a(bM, (byte)0);
      $$0.a(bN, (byte)0);
      $$0.a(bO, (byte)0);
      $$0.a(bL, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(bO) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(bO);
      if ($$1) {
         this.al.a(bO, (byte)($$2 | $$0));
      } else {
         this.al.a(bO, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gu().c());
      $$0.a("HiddenGene", this.gv().c());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjn.a.a($$0.l("MainGene")));
      this.b(cjn.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      cjn $$2 = bwo.aN.a($$0, bwn.e);
      if ($$2 != null) {
         if ($$1 instanceof cjn $$3) {
            $$2.a(this, $$3);
         }

         $$2.gM();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(2, new cjn.i(this, 2.0));
      this.bD.a(2, new cjn.d(this, 1.0));
      this.bD.a(3, new cjn.b(this, 1.2F, true));
      this.bD.a(4, new cfi(this, 1.0, $$0 -> $$0.a(axk.au), false));
      this.bD.a(6, new cjn.c<>(this, crc.class, 8.0F, 2.0, 2.0));
      this.bD.a(6, new cjn.c<>(this, cod.class, 4.0F, 2.0, 2.0));
      this.bD.a(7, new cjn.k());
      this.bD.a(8, new cjn.f(this));
      this.bD.a(8, new cjn.l(this));
      this.cg = new cjn.g(this, crc.class, 6.0F);
      this.bD.a(9, this.cg);
      this.bD.a(10, new cev(this));
      this.bD.a(12, new cjn.j(this));
      this.bD.a(13, new cdz(this, 1.25));
      this.bD.a(14, new cfn(this, 1.0));
      this.bE.a(1, new cjn.e(this).a(new Class[0]));
   }

   public static byj.a gE() {
      return ciu.gw().a(byk.v, 0.15F).a(byk.c, 6.0);
   }

   public cjn.a gF() {
      return cjn.a.a(this.gu(), this.gv());
   }

   public boolean gG() {
      return this.gF() == cjn.a.b;
   }

   public boolean gH() {
      return this.gF() == cjn.a.c;
   }

   public boolean gI() {
      return this.gF() == cjn.a.d;
   }

   public boolean gJ() {
      return this.gF() == cjn.a.e;
   }

   public boolean gK() {
      return this.gF() == cjn.a.f;
   }

   @Override
   public boolean gi() {
      return this.gF() == cjn.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if (!this.gi()) {
         this.bY = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gk() {
      this.a(awn.tr, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gH()) {
         if (this.dV().ag() && !this.bj()) {
            this.w(true);
            this.y(false);
         } else if (!this.gs()) {
            this.w(false);
         }
      }

      bxe $$0 = this.f();
      if ($$0 == null) {
         this.bX = false;
         this.bY = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awn.tn, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gt() + 1);
         if (this.gt() > 20) {
            this.z(false);
            this.gV();
         } else if (this.gt() == 1) {
            this.a(awn.th, 1.0F, 1.0F);
         }
      }

      if (this.gD()) {
         this.gU();
      } else {
         this.bH = 0;
      }

      if (this.x()) {
         this.x(0.0F);
      }

      this.gR();
      this.gP();
      this.gS();
      this.gT();
   }

   public boolean gL() {
      return this.gH() && this.dV().ag();
   }

   private void gP() {
      if (!this.gs() && this.x() && !this.gL() && !this.a(bwp.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bwp.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gs()) {
         this.gQ();
         if (!this.dV().C && this.gO() > 80 && this.ae.a(20) == 1) {
            if (this.gO() > 100 && this.a(bwp.a).a(axk.av)) {
               if (!this.dV().C) {
                  this.a(bwp.a, czd.k);
                  this.a(efh.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.u(this.gO() + 1);
      }
   }

   private void gQ() {
      if (this.gO() % 5 == 0) {
         this.a(awn.tl, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            feq $$1 = new feq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            feq $$3 = new feq(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lt(lx.U, this.a(bwp.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gR() {
      this.cb = this.ca;
      if (this.x()) {
         this.ca = Math.min(1.0F, this.ca + 0.15F);
      } else {
         this.ca = Math.max(0.0F, this.ca - 0.19F);
      }
   }

   private void gS() {
      this.cd = this.cc;
      if (this.gr()) {
         this.cc = Math.min(1.0F, this.cc + 0.15F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.19F);
      }
   }

   private void gT() {
      this.cf = this.ce;
      if (this.gD()) {
         this.ce = Math.min(1.0F, this.ce + 0.15F);
      } else {
         this.ce = Math.max(0.0F, this.ce - 0.19F);
      }
   }

   public float J(float $$0) {
      return azm.h($$0, this.cb, this.ca);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cd, this.cc);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cf, this.ce);
   }

   private void gU() {
      this.bH++;
      if (this.bH > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            feq $$0 = this.dy();
            if (this.bH == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.bZ = new feq($$0.d + (double)(-azm.a($$1) * $$2), 0.0, $$0.f + (double)(azm.b($$1) * $$2));
               this.i(this.bZ.b(0.0, 0.27, 0.0));
            } else if ((float)this.bH != 7.0F && (float)this.bH != 15.0F && (float)this.bH != 23.0F) {
               this.n(this.bZ.d, $$0.e, this.bZ.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gV() {
      feq $$0 = this.dy();
      dja $$1 = this.dV();
      $$1.a(
         lx.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azm.a(this.aV * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azm.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awn.ti, 1.0F, 1.0F);

      for (cjn $$3 : $$1.a(cjn.class, this.cR().g(10.0))) {
         if (!$$3.n_() && $$3.aJ() && !$$3.bj() && $$3.gN()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof arq $$4 && $$4.O().c(diw.g)) {
         this.a($$4, ezd.aH, this::a);
      }
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      if (this.a(bwp.a).f() && b($$1)) {
         this.a($$1);
         czd $$2 = $$1.f();
         this.a(bwp.a, $$2);
         this.g(bwp.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      this.a(cjn.a.a($$4));
      this.b(cjn.a.a($$4));
      this.gM();
      if ($$3 == null) {
         $$3 = new bvv.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjn $$0, @Nullable cjn $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gW());
            this.b(cjn.a.a(this.ae));
         } else {
            this.a(cjn.a.a(this.ae));
            this.b($$0.gW());
         }
      } else if (this.ae.h()) {
         this.a($$0.gW());
         this.b($$1.gW());
      } else {
         this.a($$1.gW());
         this.b($$0.gW());
      }

      if (this.ae.a(32) == 0) {
         this.a(cjn.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cjn.a.a(this.ae));
      }
   }

   private cjn.a gW() {
      return this.ae.h() ? this.gu() : this.gv();
   }

   public void gM() {
      if (this.gK()) {
         this.g(byk.s).a(10.0);
      }

      if (this.gG()) {
         this.g(byk.v).a(0.07F);
      }
   }

   void gX() {
      if (!this.bj()) {
         this.G(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (this.gL()) {
         return bud.e;
      } else if (this.gr()) {
         this.x(false);
         return bud.a;
      } else if (this.i($$2)) {
         if (this.f() != null) {
            this.bX = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.g() == 0 && this.gy()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dV() instanceof arq $$3) || this.x() || this.bj()) {
               return bud.e;
            }

            this.gX();
            this.y(true);
            czd $$4 = this.a(bwp.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bwp.a, new czd($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bud.b;
      } else {
         return bud.e;
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.gi()) {
         return awn.to;
      } else {
         return this.gH() ? awn.tp : awn.tj;
      }
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.tm, 0.15F, 1.0F);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.au);
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.tk;
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.tq;
   }

   public boolean gN() {
      return !this.gr() && !this.gL() && !this.gs() && !this.gD() && !this.x();
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   private static boolean b(cnh $$0) {
      return $$0.f().a(axk.av) && $$0.bK() && !$$0.o();
   }

   public static enum a implements bak {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bak.a<cjn.a> h = bak.a(cjn.a::values);
      private static final IntFunction<cjn.a> i = ayc.a(cjn.a::a, values(), ayc.a.a);
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

      static cjn.a a(cjn.a $$0, cjn.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cjn.a a(int $$0) {
         return i.apply($$0);
      }

      public static cjn.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cjn.a a(azv $$0) {
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

   static class b extends cek {
      private final cjn b;

      public b(cjn $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gN() && super.b();
      }
   }

   static class c<T extends bxe> extends cdh<T> {
      private final cjn i;

      public c(cjn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwm.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gH() && this.i.gN() && super.b();
      }
   }

   static class d extends cdm {
      private final cjn d;
      private int e;

      public d(cjn $$0, double $$1) {
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
                  crc $$0 = this.b.a(cjn.bP, this.d);
                  this.d.cg.a($$0);
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
                     if (this.b.a_($$1).a(dmh.nF)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cfs {
      private final cjn a;

      public e(cjn $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.bX && !this.a.bY) {
            return super.c();
         } else {
            this.a.g(null);
            return false;
         }
      }

      @Override
      protected void a(bxg $$0, bxe $$1) {
         if ($$0 instanceof cjn && $$0.gi()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends cea {
      private final cjn a;
      private int b;

      public f(cjn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gG() && this.a.gN() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gG() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends cei {
      private final cjn h;

      public g(cjn $$0, Class<? extends bxe> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bxe $$0) {
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
               arq $$0 = a(this.b);
               if (this.f == crc.class) {
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

            return this.h.gN() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cdd {
      private final cjn l;

      public h(cjn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gN()) {
            super.a();
         }
      }
   }

   static class i extends cet {
      private final cjn a;

      public i(cjn $$0, double $$1) {
         super($$0, $$1, axd.G);
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

   static class j extends cea {
      private final cjn a;

      public j(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.a, cea.a.b, cea.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gI()) && this.a.aJ()) {
            if (!this.a.gN()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azm.a($$0);
               float $$2 = azm.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azm.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azm.j((double)$$2) : 0;
               if (this.a.dV().a_(this.a.dv().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gI() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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
      public boolean Q_() {
         return false;
      }
   }

   class k extends cea {
      private int b;

      public k() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cjn.this.af || cjn.this.n_() || cjn.this.bj() || !cjn.this.gN() || cjn.this.q() > 0) {
            return false;
         } else {
            return !cjn.this.a(bwp.a).f() ? true : !cjn.this.dV().a(cnh.class, cjn.this.cR().c(6.0, 6.0, 6.0), cjn::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cjn.this.bj() && (cjn.this.gG() || cjn.this.ae.a(b(600)) != 1) ? cjn.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cjn.this.x() && !cjn.this.a(bwp.a).f()) {
            cjn.this.gX();
         }
      }

      @Override
      public void d() {
         if (cjn.this.a(bwp.a).f()) {
            List<cnh> $$0 = cjn.this.dV().a(cnh.class, cjn.this.cR().c(8.0, 8.0, 8.0), cjn::b);
            if (!$$0.isEmpty()) {
               cjn.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            cjn.this.gX();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czd $$0 = cjn.this.a(bwp.a);
         if (!$$0.f()) {
            cjn.this.a(a(cjn.this.dV()), $$0);
            cjn.this.a(bwp.a, czd.k);
            int $$1 = cjn.this.gG() ? cjn.this.ae.a(50) + 10 : cjn.this.ae.a(150) + 10;
            this.b = cjn.this.af + $$1 * 20;
         }

         cjn.this.w(false);
      }
   }

   static class l extends cea {
      private final cjn a;

      public l(cjn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.n_() && this.a.gN()) {
            return this.a.gK() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
