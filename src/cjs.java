import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjs extends ciz {
   private static final akj<Integer> bI = akn.a(cjs.class, akl.b);
   private static final akj<Integer> bK = akn.a(cjs.class, akl.b);
   private static final akj<Integer> bL = akn.a(cjs.class, akl.b);
   private static final akj<Byte> bM = akn.a(cjs.class, akl.a);
   private static final akj<Byte> bN = akn.a(cjs.class, akl.a);
   private static final akj<Byte> bO = akn.a(cjs.class, akl.a);
   static final chy bP = chy.b().a(8.0);
   private static final bwl bQ = bwr.aN.n().a(0.5F).a(bwk.a().a(bwj.a, 0.0F, 0.40625F, 0.0F));
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
   private ffc bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   cjs.g cg;

   public cjs(bwr<? extends cjs> $$0, djm $$1) {
      super($$0, $$1);
      this.bA = new cjs.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bws $$0) {
      return $$0 == bws.a && this.fM();
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

   public boolean gt() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.al.a(bL) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bL, $$0 ? 1 : 0);
   }

   private int gQ() {
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

   public int gv() {
      return this.al.a(bK);
   }

   public void t(int $$0) {
      this.al.a(bK, $$0);
   }

   public cjs.a gw() {
      return cjs.a.a(this.al.a(bM));
   }

   public void a(cjs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjs.a.a(this.ae);
      }

      this.al.a(bM, (byte)$$0.a());
   }

   public cjs.a gx() {
      return cjs.a.a(this.al.a(bN));
   }

   public void b(cjs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cjs.a.a(this.ae);
      }

      this.al.a(bN, (byte)$$0.a());
   }

   public boolean gF() {
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
      $$0.a("MainGene", cjs.a.h, this.gw());
      $$0.a("HiddenGene", cjs.a.h, this.gx());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cjs.a>a("MainGene", cjs.a.h).orElse(cjs.a.a));
      this.b($$0.<cjs.a>a("HiddenGene", cjs.a.h).orElse(cjs.a.a));
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      cjs $$2 = bwr.aN.a($$0, bwq.e);
      if ($$2 != null) {
         if ($$1 instanceof cjs $$3) {
            $$2.a(this, $$3);
         }

         $$2.gO();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(2, new cjs.i(this, 2.0));
      this.bD.a(2, new cjs.d(this, 1.0));
      this.bD.a(3, new cjs.b(this, 1.2F, true));
      this.bD.a(4, new cfn(this, 1.0, $$0 -> $$0.a(axk.au), false));
      this.bD.a(6, new cjs.c<>(this, crm.class, 8.0F, 2.0, 2.0));
      this.bD.a(6, new cjs.c<>(this, coo.class, 4.0F, 2.0, 2.0));
      this.bD.a(7, new cjs.k());
      this.bD.a(8, new cjs.f(this));
      this.bD.a(8, new cjs.l(this));
      this.cg = new cjs.g(this, crm.class, 6.0F);
      this.bD.a(9, this.cg);
      this.bD.a(10, new cfa(this));
      this.bD.a(12, new cjs.j(this));
      this.bD.a(13, new cee(this, 1.25));
      this.bD.a(14, new cfs(this, 1.0));
      this.bE.a(1, new cjs.e(this).a(new Class[0]));
   }

   public static byo.a gG() {
      return ciz.gy().a(byp.v, 0.15F).a(byp.c, 6.0);
   }

   public cjs.a gH() {
      return cjs.a.a(this.gw(), this.gx());
   }

   public boolean gI() {
      return this.gH() == cjs.a.b;
   }

   public boolean gJ() {
      return this.gH() == cjs.a.c;
   }

   public boolean gK() {
      return this.gH() == cjs.a.d;
   }

   public boolean gL() {
      return this.gH() == cjs.a.e;
   }

   public boolean gM() {
      return this.gH() == cjs.a.f;
   }

   @Override
   public boolean gk() {
      return this.gH() == cjs.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if (!this.gk()) {
         this.bY = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gm() {
      this.a(awn.tr, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gJ()) {
         if (this.dU().ag() && !this.bh()) {
            this.w(true);
            this.y(false);
         } else if (!this.gu()) {
            this.w(false);
         }
      }

      bxj $$0 = this.f();
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
         this.t(this.gv() + 1);
         if (this.gv() > 20) {
            this.z(false);
            this.gX();
         } else if (this.gv() == 1) {
            this.a(awn.th, 1.0F, 1.0F);
         }
      }

      if (this.gF()) {
         this.gW();
      } else {
         this.bH = 0;
      }

      if (this.x()) {
         this.x(0.0F);
      }

      this.gT();
      this.gR();
      this.gU();
      this.gV();
   }

   public boolean gN() {
      return this.gJ() && this.dU().ag();
   }

   private void gR() {
      if (!this.gu() && this.x() && !this.gN() && !this.a(bws.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bws.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gu()) {
         this.gS();
         if (!this.dU().C && this.gQ() > 80 && this.ae.a(20) == 1) {
            if (this.gQ() > 100 && this.a(bws.a).a(axk.av)) {
               if (!this.dU().C) {
                  this.a(bws.a, czn.k);
                  this.a(eft.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.u(this.gQ() + 1);
      }
   }

   private void gS() {
      if (this.gQ() % 5 == 0) {
         this.a(awn.tl, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ffc $$1 = new ffc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dM() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dK() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            ffc $$3 = new ffc(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dz(), this.dD() + 1.0, this.dF());
            this.dU().a(new lu(ly.U, this.a(bws.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gT() {
      this.cb = this.ca;
      if (this.x()) {
         this.ca = Math.min(1.0F, this.ca + 0.15F);
      } else {
         this.ca = Math.max(0.0F, this.ca - 0.19F);
      }
   }

   private void gU() {
      this.cd = this.cc;
      if (this.gt()) {
         this.cc = Math.min(1.0F, this.cc + 0.15F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.19F);
      }
   }

   private void gV() {
      this.cf = this.ce;
      if (this.gF()) {
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

   private void gW() {
      this.bH++;
      if (this.bH > 32) {
         this.A(false);
      } else {
         if (!this.dU().C) {
            ffc $$0 = this.dx();
            if (this.bH == 1) {
               float $$1 = this.dK() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.bZ = new ffc($$0.d + (double)(-azm.a($$1) * $$2), 0.0, $$0.f + (double)(azm.b($$1) * $$2));
               this.i(this.bZ.b(0.0, 0.27, 0.0));
            } else if ((float)this.bH != 7.0F && (float)this.bH != 15.0F && (float)this.bH != 23.0F) {
               this.n(this.bZ.d, $$0.e, this.bZ.f);
            } else {
               this.n(0.0, this.aH() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gX() {
      ffc $$0 = this.dx();
      djm $$1 = this.dU();
      $$1.a(
         ly.aj,
         this.dz() - (double)(this.dp() + 1.0F) * 0.5 * (double)azm.a(this.aV * (float) (Math.PI / 180.0)),
         this.dD() - 0.1F,
         this.dF() + (double)(this.dp() + 1.0F) * 0.5 * (double)azm.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awn.ti, 1.0F, 1.0F);

      for (cjs $$3 : $$1.a(cjs.class, this.cQ().g(10.0))) {
         if (!$$3.n_() && $$3.aH() && !$$3.bh() && $$3.gP()) {
            $$3.s();
         }
      }

      if (this.dU() instanceof arq $$4 && $$4.O().c(dji.g)) {
         this.a($$4, ezp.aH, this::a);
      }
   }

   @Override
   protected void a(arq $$0, cnr $$1) {
      if (this.a(bws.a).f() && b($$1)) {
         this.a($$1);
         czn $$2 = $$1.f();
         this.a(bws.a, $$2);
         this.g(bws.a);
         this.a($$1, $$2.M());
         $$1.aq();
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      this.a(cjs.a.a($$4));
      this.b(cjs.a.a($$4));
      this.gO();
      if ($$3 == null) {
         $$3 = new bvy.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjs $$0, @Nullable cjs $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gY());
            this.b(cjs.a.a(this.ae));
         } else {
            this.a(cjs.a.a(this.ae));
            this.b($$0.gY());
         }
      } else if (this.ae.h()) {
         this.a($$0.gY());
         this.b($$1.gY());
      } else {
         this.a($$1.gY());
         this.b($$0.gY());
      }

      if (this.ae.a(32) == 0) {
         this.a(cjs.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cjs.a.a(this.ae));
      }
   }

   private cjs.a gY() {
      return this.ae.h() ? this.gw() : this.gx();
   }

   public void gO() {
      if (this.gM()) {
         this.g(byp.s).a(10.0);
      }

      if (this.gI()) {
         this.g(byp.v).a(0.07F);
      }
   }

   void gZ() {
      if (!this.bh()) {
         this.G(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if (this.gN()) {
         return bug.e;
      } else if (this.gt()) {
         this.x(false);
         return bug.a;
      } else if (this.i($$2)) {
         if (this.f() != null) {
            this.bX = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dU().C && this.g() == 0 && this.gA()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dU() instanceof arq $$3) || this.x() || this.bh()) {
               return bug.e;
            }

            this.gZ();
            this.y(true);
            czn $$4 = this.a(bws.a);
            if (!$$4.f() && !$$0.fU()) {
               this.a($$3, $$4);
            }

            this.a(bws.a, new czn($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bug.b;
      } else {
         return bug.e;
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.gk()) {
         return awn.to;
      } else {
         return this.gJ() ? awn.tp : awn.tj;
      }
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.tm, 0.15F, 1.0F);
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.au);
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.tk;
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.tq;
   }

   public boolean gP() {
      return !this.gt() && !this.gN() && !this.gu() && !this.gF() && !this.x();
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   private static boolean b(cnr $$0) {
      return $$0.f().a(axk.av) && $$0.bI() && !$$0.o();
   }

   public static enum a implements bak {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final Codec<cjs.a> h = bak.a(cjs.a::values);
      private static final IntFunction<cjs.a> i = ayc.a(cjs.a::a, values(), ayc.a.a);
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

      static cjs.a a(cjs.a $$0, cjs.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cjs.a a(int $$0) {
         return i.apply($$0);
      }

      public static cjs.a a(azv $$0) {
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

   static class b extends cep {
      private final cjs b;

      public b(cjs $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gP() && super.b();
      }
   }

   static class c<T extends bxj> extends cdm<T> {
      private final cjs i;

      public c(cjs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwp.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gJ() && this.i.gP() && super.b();
      }
   }

   static class d extends cdr {
      private final cjs d;
      private int e;

      public d(cjs $$0, double $$1) {
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
                  crm $$0 = this.b.a(cjs.bP, this.d);
                  this.d.cg.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         iv $$0 = this.d.du();
         iv.a $$1 = new iv.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dmt.nF)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cfx {
      private final cjs a;

      public e(cjs $$0, Class<?>... $$1) {
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
      protected void a(bxl $$0, bxj $$1) {
         if ($$0 instanceof cjs && $$0.gk()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends cef {
      private final cjs a;
      private int b;

      public f(cjs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gI() && this.a.gP() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bh() && (this.a.gI() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends cen {
      private final cjs h;

      public g(cjs $$0, Class<? extends bxj> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bxj $$0) {
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
               arq $$0 = a(this.b);
               if (this.f == crm.class) {
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

            return this.h.gP() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cdi {
      private final cjs l;

      public h(cjs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gP()) {
            super.a();
         }
      }
   }

   static class i extends cey {
      private final cjs a;

      public i(cjs $$0, double $$1) {
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

   static class j extends cef {
      private final cjs a;

      public j(cjs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.a, cef.a.b, cef.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gK()) && this.a.aH()) {
            if (!this.a.gP()) {
               return false;
            } else {
               float $$0 = this.a.dK() * (float) (Math.PI / 180.0);
               float $$1 = -azm.a($$0);
               float $$2 = azm.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azm.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azm.j((double)$$2) : 0;
               if (this.a.dU().a_(this.a.du().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gK() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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

   class k extends cef {
      private int b;

      public k() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cjs.this.af || cjs.this.n_() || cjs.this.bh() || !cjs.this.gP() || cjs.this.q() > 0) {
            return false;
         } else {
            return !cjs.this.a(bws.a).f() ? true : !cjs.this.dU().a(cnr.class, cjs.this.cQ().c(6.0, 6.0, 6.0), cjs::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cjs.this.bh() && (cjs.this.gI() || cjs.this.ae.a(b(600)) != 1) ? cjs.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cjs.this.x() && !cjs.this.a(bws.a).f()) {
            cjs.this.gZ();
         }
      }

      @Override
      public void d() {
         if (cjs.this.a(bws.a).f()) {
            List<cnr> $$0 = cjs.this.dU().a(cnr.class, cjs.this.cQ().c(8.0, 8.0, 8.0), cjs::b);
            if (!$$0.isEmpty()) {
               cjs.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            cjs.this.gZ();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czn $$0 = cjs.this.a(bws.a);
         if (!$$0.f()) {
            cjs.this.a(a(cjs.this.dU()), $$0);
            cjs.this.a(bws.a, czn.k);
            int $$1 = cjs.this.gI() ? cjs.this.ae.a(50) + 10 : cjs.this.ae.a(150) + 10;
            this.b = cjs.this.af + $$1 * 20;
         }

         cjs.this.w(false);
      }
   }

   static class l extends cef {
      private final cjs a;

      public l(cjs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.n_() && this.a.gP()) {
            return this.a.gM() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
