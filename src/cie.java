import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cie extends chp {
   private static final ajx<Integer> bH = akb.a(cie.class, ajz.b);
   private static final ajx<Integer> bJ = akb.a(cie.class, ajz.b);
   private static final ajx<Integer> bK = akb.a(cie.class, ajz.b);
   private static final ajx<Byte> bL = akb.a(cie.class, ajz.a);
   private static final ajx<Byte> bM = akb.a(cie.class, ajz.a);
   private static final ajx<Byte> bN = akb.a(cie.class, ajz.a);
   static final cgp bO = cgp.b().a(8.0);
   private static final bvd bP = bvi.aN.n().a(0.5F).a(bvc.a().a(bvb.a, 0.0F, 0.40625F, 0.0F));
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
   private fbx bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   cie.g cf;

   public cie(bvi<? extends cie> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cie.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bvj $$0) {
      return $$0 == bvj.a && this.fP();
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

   public boolean gs() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.al.a(bK) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bK, $$0 ? 1 : 0);
   }

   private int gP() {
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

   public int gu() {
      return this.al.a(bJ);
   }

   public void t(int $$0) {
      this.al.a(bJ, $$0);
   }

   public cie.a gv() {
      return cie.a.a(this.al.a(bL));
   }

   public void a(cie.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cie.a.a(this.ae);
      }

      this.al.a(bL, (byte)$$0.a());
   }

   public cie.a gw() {
      return cie.a.a(this.al.a(bM));
   }

   public void b(cie.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cie.a.a(this.ae);
      }

      this.al.a(bM, (byte)$$0.a());
   }

   public boolean gE() {
      return this.v(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
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
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gv().c());
      $$0.a("HiddenGene", this.gw().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cie.a.a($$0.l("MainGene")));
      this.b(cie.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      cie $$2 = bvi.aN.a($$0, bvh.e);
      if ($$2 != null) {
         if ($$1 instanceof cie $$3) {
            $$2.a(this, $$3);
         }

         $$2.gN();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(2, new cie.i(this, 2.0));
      this.bC.a(2, new cie.d(this, 1.0));
      this.bC.a(3, new cie.b(this, 1.2F, true));
      this.bC.a(4, new cee(this, 1.0, $$0 -> $$0.a(awy.at), false));
      this.bC.a(6, new cie.c<>(this, cpr.class, 8.0F, 2.0, 2.0));
      this.bC.a(6, new cie.c<>(this, cms.class, 4.0F, 2.0, 2.0));
      this.bC.a(7, new cie.k());
      this.bC.a(8, new cie.f(this));
      this.bC.a(8, new cie.l(this));
      this.cf = new cie.g(this, cpr.class, 6.0F);
      this.bC.a(9, this.cf);
      this.bC.a(10, new cdr(this));
      this.bC.a(12, new cie.j(this));
      this.bC.a(13, new ccv(this, 1.25));
      this.bC.a(14, new cej(this, 1.0));
      this.bD.a(1, new cie.e(this).a(new Class[0]));
   }

   public static bxf.a gF() {
      return chp.gx().a(bxg.v, 0.15F).a(bxg.c, 6.0);
   }

   public cie.a gG() {
      return cie.a.a(this.gv(), this.gw());
   }

   public boolean gH() {
      return this.gG() == cie.a.b;
   }

   public boolean gI() {
      return this.gG() == cie.a.c;
   }

   public boolean gJ() {
      return this.gG() == cie.a.d;
   }

   public boolean gK() {
      return this.gG() == cie.a.e;
   }

   public boolean gL() {
      return this.gG() == cie.a.f;
   }

   @Override
   public boolean gj() {
      return this.gG() == cie.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if (!this.gj()) {
         this.bX = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gl() {
      this.a(awa.tn, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gI()) {
         if (this.dU().ag() && !this.bj()) {
            this.w(true);
            this.y(false);
         } else if (!this.gt()) {
            this.w(false);
         }
      }

      bvy $$0 = this.f();
      if ($$0 == null) {
         this.bW = false;
         this.bX = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awa.tj, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gu() + 1);
         if (this.gu() > 20) {
            this.z(false);
            this.gW();
         } else if (this.gu() == 1) {
            this.a(awa.td, 1.0F, 1.0F);
         }
      }

      if (this.gE()) {
         this.gV();
      } else {
         this.bG = 0;
      }

      if (this.x()) {
         this.x(0.0F);
      }

      this.gS();
      this.gQ();
      this.gT();
      this.gU();
   }

   public boolean gM() {
      return this.gI() && this.dU().ag();
   }

   private void gQ() {
      if (!this.gt() && this.x() && !this.gM() && !this.a(bvj.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bvj.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gt()) {
         this.gR();
         if (!this.dU().C && this.gP() > 80 && this.ae.a(20) == 1) {
            if (this.gP() > 100 && this.a(bvj.a).a(awy.au)) {
               if (!this.dU().C) {
                  this.a(bvj.a, cxh.k);
                  this.a(ecp.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.u(this.gP() + 1);
      }
   }

   private void gR() {
      if (this.gP() % 5 == 0) {
         this.a(awa.th, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fbx $$1 = new fbx(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dM() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dK() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fbx $$3 = new fbx(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dz(), this.dD() + 1.0, this.dF());
            this.dU().a(new lp(lt.U, this.a(bvj.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gS() {
      this.ca = this.bZ;
      if (this.x()) {
         this.bZ = Math.min(1.0F, this.bZ + 0.15F);
      } else {
         this.bZ = Math.max(0.0F, this.bZ - 0.19F);
      }
   }

   private void gT() {
      this.cc = this.cb;
      if (this.gs()) {
         this.cb = Math.min(1.0F, this.cb + 0.15F);
      } else {
         this.cb = Math.max(0.0F, this.cb - 0.19F);
      }
   }

   private void gU() {
      this.ce = this.cd;
      if (this.gE()) {
         this.cd = Math.min(1.0F, this.cd + 0.15F);
      } else {
         this.cd = Math.max(0.0F, this.cd - 0.19F);
      }
   }

   public float K(float $$0) {
      return ayz.h($$0, this.ca, this.bZ);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cc, this.cb);
   }

   public float M(float $$0) {
      return ayz.h($$0, this.ce, this.cd);
   }

   private void gV() {
      this.bG++;
      if (this.bG > 32) {
         this.A(false);
      } else {
         if (!this.dU().C) {
            fbx $$0 = this.dx();
            if (this.bG == 1) {
               float $$1 = this.dK() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.bY = new fbx($$0.d + (double)(-ayz.a($$1) * $$2), 0.0, $$0.f + (double)(ayz.b($$1) * $$2));
               this.i(this.bY.b(0.0, 0.27, 0.0));
            } else if ((float)this.bG != 7.0F && (float)this.bG != 15.0F && (float)this.bG != 23.0F) {
               this.n(this.bY.d, $$0.e, this.bY.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gW() {
      fbx $$0 = this.dx();
      dgz $$1 = this.dU();
      $$1.a(
         lt.aj,
         this.dz() - (double)(this.dp() + 1.0F) * 0.5 * (double)ayz.a(this.aV * (float) (Math.PI / 180.0)),
         this.dD() - 0.1F,
         this.dF() + (double)(this.dp() + 1.0F) * 0.5 * (double)ayz.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awa.te, 1.0F, 1.0F);

      for (cie $$3 : $$1.a(cie.class, this.cQ().g(10.0))) {
         if (!$$3.n_() && $$3.aJ() && !$$3.bj() && $$3.gO()) {
            $$3.s();
         }
      }

      if (this.dU() instanceof ard $$4 && $$4.O().b(dgv.f)) {
         this.a($$4, ewk.aH, this::a);
      }
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      if (this.a(bvj.a).f() && b($$1)) {
         this.a($$1);
         cxh $$2 = $$1.f();
         this.a(bvj.a, $$2);
         this.g(bvj.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      this.a(cie.a.a($$4));
      this.b(cie.a.a($$4));
      this.gN();
      if ($$3 == null) {
         $$3 = new buq.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cie $$0, @Nullable cie $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gX());
            this.b(cie.a.a(this.ae));
         } else {
            this.a(cie.a.a(this.ae));
            this.b($$0.gX());
         }
      } else if (this.ae.h()) {
         this.a($$0.gX());
         this.b($$1.gX());
      } else {
         this.a($$1.gX());
         this.b($$0.gX());
      }

      if (this.ae.a(32) == 0) {
         this.a(cie.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cie.a.a(this.ae));
      }
   }

   private cie.a gX() {
      return this.ae.h() ? this.gv() : this.gw();
   }

   public void gN() {
      if (this.gL()) {
         this.g(bxg.s).a(10.0);
      }

      if (this.gH()) {
         this.g(bxg.v).a(0.07F);
      }
   }

   void gY() {
      if (!this.bj()) {
         this.H(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (this.gM()) {
         return bsy.e;
      } else if (this.gs()) {
         this.x(false);
         return bsy.a;
      } else if (this.j($$2)) {
         if (this.f() != null) {
            this.bW = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dU().C && this.g() == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dU() instanceof ard $$3) || this.x() || this.bj()) {
               return bsy.e;
            }

            this.gY();
            this.y(true);
            cxh $$4 = this.a(bvj.a);
            if (!$$4.f() && !$$0.fX()) {
               this.a($$3, $$4);
            }

            this.a(bvj.a, new cxh($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsy.b;
      } else {
         return bsy.e;
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.gj()) {
         return awa.tk;
      } else {
         return this.gI() ? awa.tl : awa.tf;
      }
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.ti, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.at);
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.tg;
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.tm;
   }

   public boolean gO() {
      return !this.gs() && !this.gM() && !this.gt() && !this.gE() && !this.x();
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bP : super.e($$0);
   }

   private static boolean b(clw $$0) {
      return $$0.f().a(awy.au) && $$0.bJ() && !$$0.o();
   }

   public static enum a implements azv {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azv.a<cie.a> h = azv.a(cie.a::values);
      private static final IntFunction<cie.a> i = axq.a(cie.a::a, values(), axq.a.a);
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

      static cie.a a(cie.a $$0, cie.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cie.a a(int $$0) {
         return i.apply($$0);
      }

      public static cie.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cie.a a(azh $$0) {
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

   static class b extends cdg {
      private final cie b;

      public b(cie $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gO() && super.b();
      }
   }

   static class c<T extends bvy> extends ccd<T> {
      private final cie i;

      public c(cie $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvg.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gI() && this.i.gO() && super.b();
      }
   }

   static class d extends cci {
      private final cie d;
      private int e;

      public d(cie $$0, double $$1) {
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
               if (this.d.di()) {
                  cpr $$0 = this.b.a(cie.bO, this.d);
                  this.d.cf.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ji $$0 = this.d.du();
         ji.a $$1 = new ji.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dkg.nB)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ceo {
      private final cie a;

      public e(cie $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.bW && !this.a.bX) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bwa $$0, bvy $$1) {
         if ($$0 instanceof cie && $$0.gj()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends ccw {
      private final cie a;
      private int b;

      public f(cie $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gH() && this.a.gO() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gH() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends cde {
      private final cie h;

      public g(cie $$0, Class<? extends bvy> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bvy $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dX().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               ard $$0 = a(this.b);
               if (this.f == cpr.class) {
                  this.c = $$0.a(this.g, this.b, this.b.dz(), this.b.dD(), this.b.dF());
               } else {
                  this.c = $$0.a(
                     this.b.dU().a(this.f, this.b.cQ().c((double)this.d, 3.0, (double)this.d), $$0x -> true),
                     this.g,
                     this.b,
                     this.b.dz(),
                     this.b.dD(),
                     this.b.dF()
                  );
               }
            }

            return this.h.gO() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cbz {
      private final cie l;

      public h(cie $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gO()) {
            super.a();
         }
      }
   }

   static class i extends cdp {
      private final cie a;

      public i(cie $$0, double $$1) {
         super($$0, $$1, awr.G);
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

   static class j extends ccw {
      private final cie a;

      public j(cie $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b, ccw.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gJ()) && this.a.aJ()) {
            if (!this.a.gO()) {
               return false;
            } else {
               float $$0 = this.a.dK() * (float) (Math.PI / 180.0);
               float $$1 = -ayz.a($$0);
               float $$2 = ayz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayz.j((double)$$2) : 0;
               if (this.a.dU().a_(this.a.du().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gJ() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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

   class k extends ccw {
      private int b;

      public k() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cie.this.af || cie.this.n_() || cie.this.bj() || !cie.this.gO() || cie.this.q() > 0) {
            return false;
         } else {
            return !cie.this.a(bvj.a).f() ? true : !cie.this.dU().a(clw.class, cie.this.cQ().c(6.0, 6.0, 6.0), cie::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cie.this.bj() && (cie.this.gH() || cie.this.ae.a(b(600)) != 1) ? cie.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cie.this.x() && !cie.this.a(bvj.a).f()) {
            cie.this.gY();
         }
      }

      @Override
      public void d() {
         if (cie.this.a(bvj.a).f()) {
            List<clw> $$0 = cie.this.dU().a(clw.class, cie.this.cQ().c(8.0, 8.0, 8.0), cie::b);
            if (!$$0.isEmpty()) {
               cie.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            cie.this.gY();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxh $$0 = cie.this.a(bvj.a);
         if (!$$0.f()) {
            cie.this.a(a(cie.this.dU()), $$0);
            cie.this.a(bvj.a, cxh.k);
            int $$1 = cie.this.gH() ? cie.this.ae.a(50) + 10 : cie.this.ae.a(150) + 10;
            this.b = cie.this.af + $$1 * 20;
         }

         cie.this.w(false);
      }
   }

   static class l extends ccw {
      private final cie a;

      public l(cie $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.n_() && this.a.gO()) {
            return this.a.gL() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
