import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cko extends cjv {
   private static final aku<Integer> bK = aky.a(cko.class, akw.b);
   private static final aku<Integer> bM = aky.a(cko.class, akw.b);
   private static final aku<Integer> bN = aky.a(cko.class, akw.b);
   private static final aku<Byte> bO = aky.a(cko.class, akw.a);
   private static final aku<Byte> bP = aky.a(cko.class, akw.a);
   private static final aku<Byte> bQ = aky.a(cko.class, akw.a);
   static final ciu bR = ciu.b().a(8.0);
   private static final bxh bS = bxn.aO.n().a(0.5F).a(bxg.a().a(bxf.a, 0.0F, 0.40625F, 0.0F));
   private static final int bT = 2;
   private static final int bU = 4;
   private static final int bV = 8;
   private static final int bW = 16;
   private static final int bX = 5;
   public static final int bI = 32;
   private static final int bY = 32;
   boolean bZ;
   boolean ca;
   public int bJ;
   private fgc cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;
   cko.g ci;

   public cko(bxn<? extends cko> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new cko.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bxo $$0) {
      return $$0 == bxo.a && this.fN();
   }

   public int m() {
      return this.al.a(bK);
   }

   public void s(int $$0) {
      this.al.a(bK, $$0);
   }

   public boolean p() {
      return this.v(2);
   }

   public boolean u() {
      return this.v(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gu() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gv() {
      return this.al.a(bN) > 0;
   }

   public void y(boolean $$0) {
      this.al.a(bN, $$0 ? 1 : 0);
   }

   private int gR() {
      return this.al.a(bN);
   }

   private void u(int $$0) {
      this.al.a(bN, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gw() {
      return this.al.a(bM);
   }

   public void t(int $$0) {
      this.al.a(bM, $$0);
   }

   public cko.a gx() {
      return cko.a.a(this.al.a(bO));
   }

   public void a(cko.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cko.a.a(this.ae);
      }

      this.al.a(bO, (byte)$$0.a());
   }

   public cko.a gy() {
      return cko.a.a(this.al.a(bP));
   }

   public void b(cko.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cko.a.a(this.ae);
      }

      this.al.a(bP, (byte)$$0.a());
   }

   public boolean gG() {
      return this.v(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
      $$0.a(bM, 0);
      $$0.a(bO, (byte)0);
      $$0.a(bP, (byte)0);
      $$0.a(bQ, (byte)0);
      $$0.a(bN, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(bQ) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(bQ);
      if ($$1) {
         this.al.a(bQ, (byte)($$2 | $$0));
      } else {
         this.al.a(bQ, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("MainGene", cko.a.h, this.gx());
      $$0.a("HiddenGene", cko.a.h, this.gy());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<cko.a>a("MainGene", cko.a.h).orElse(cko.a.a));
      this.b($$0.<cko.a>a("HiddenGene", cko.a.h).orElse(cko.a.a));
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      cko $$2 = bxn.aO.a($$0, bxm.e);
      if ($$2 != null) {
         if ($$1 instanceof cko $$3) {
            $$2.a(this, $$3);
         }

         $$2.gP();
      }

      return $$2;
   }

   @Override
   protected void C() {
      this.bF.a(0, new cev(this));
      this.bF.a(2, new cko.i(this, 2.0));
      this.bF.a(2, new cko.d(this, 1.0));
      this.bF.a(3, new cko.b(this, 1.2F, true));
      this.bF.a(4, new cgj(this, 1.0, $$0 -> $$0.a(axv.av), false));
      this.bF.a(6, new cko.c<>(this, csi.class, 8.0F, 2.0, 2.0));
      this.bF.a(6, new cko.c<>(this, cpk.class, 4.0F, 2.0, 2.0));
      this.bF.a(7, new cko.k());
      this.bF.a(8, new cko.f(this));
      this.bF.a(8, new cko.l(this));
      this.ci = new cko.g(this, csi.class, 6.0F);
      this.bF.a(9, this.ci);
      this.bF.a(10, new cfw(this));
      this.bF.a(12, new cko.j(this));
      this.bF.a(13, new cfa(this, 1.25));
      this.bF.a(14, new cgo(this, 1.0));
      this.bG.a(1, new cko.e(this).a(new Class[0]));
   }

   public static bzk.a gH() {
      return cjv.gz().a(bzl.v, 0.15F).a(bzl.c, 6.0);
   }

   public cko.a gI() {
      return cko.a.a(this.gx(), this.gy());
   }

   public boolean gJ() {
      return this.gI() == cko.a.b;
   }

   public boolean gK() {
      return this.gI() == cko.a.c;
   }

   public boolean gL() {
      return this.gI() == cko.a.d;
   }

   public boolean gM() {
      return this.gI() == cko.a.e;
   }

   public boolean gN() {
      return this.gI() == cko.a.f;
   }

   @Override
   public boolean gl() {
      return this.gI() == cko.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if (!this.gl()) {
         this.ca = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gn() {
      this.a(awy.tr, 1.0F, 1.0F);
   }

   @Override
   public void g() {
      super.g();
      if (this.gK()) {
         if (this.dV().ag() && !this.bi()) {
            this.w(true);
            this.y(false);
         } else if (!this.gv()) {
            this.w(false);
         }
      }

      byf $$0 = this.e();
      if ($$0 == null) {
         this.bZ = false;
         this.ca = false;
      }

      if (this.m() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.m() == 29 || this.m() == 14) {
            this.a(awy.tn, 1.0F, 1.0F);
         }

         this.s(this.m() - 1);
      }

      if (this.p()) {
         this.t(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gY();
         } else if (this.gw() == 1) {
            this.a(awy.th, 1.0F, 1.0F);
         }
      }

      if (this.gG()) {
         this.gX();
      } else {
         this.bJ = 0;
      }

      if (this.u()) {
         this.x(0.0F);
      }

      this.gU();
      this.gS();
      this.gV();
      this.gW();
   }

   public boolean gO() {
      return this.gK() && this.dV().ag();
   }

   private void gS() {
      if (!this.gv() && this.u() && !this.gO() && !this.a(bxo.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bxo.a).f() || !this.u()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gT();
         if (!this.dV().C && this.gR() > 80 && this.ae.a(20) == 1) {
            if (this.gR() > 100 && this.a(bxo.a).a(axv.aw)) {
               if (!this.dV().C) {
                  this.a(bxo.a, dak.l);
                  this.a(egq.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.u(this.gR() + 1);
      }
   }

   private void gT() {
      if (this.gR() % 5 == 0) {
         this.a(awy.tl, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fgc $$1 = new fgc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fgc $$3 = new fgc(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lv(lz.U, this.a(bxo.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gU() {
      this.cd = this.cc;
      if (this.u()) {
         this.cc = Math.min(1.0F, this.cc + 0.15F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.19F);
      }
   }

   private void gV() {
      this.cf = this.ce;
      if (this.gu()) {
         this.ce = Math.min(1.0F, this.ce + 0.15F);
      } else {
         this.ce = Math.max(0.0F, this.ce - 0.19F);
      }
   }

   private void gW() {
      this.ch = this.cg;
      if (this.gG()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.19F);
      }
   }

   public float J(float $$0) {
      return azz.h($$0, this.cd, this.cc);
   }

   public float K(float $$0) {
      return azz.h($$0, this.cf, this.ce);
   }

   public float L(float $$0) {
      return azz.h($$0, this.ch, this.cg);
   }

   private void gX() {
      this.bJ++;
      if (this.bJ > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            fgc $$0 = this.dy();
            if (this.bJ == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cb = new fgc($$0.d + (double)(-azz.a($$1) * $$2), 0.0, $$0.f + (double)(azz.b($$1) * $$2));
               this.i(this.cb.b(0.0, 0.27, 0.0));
            } else if ((float)this.bJ != 7.0F && (float)this.bJ != 15.0F && (float)this.bJ != 23.0F) {
               this.n(this.cb.d, $$0.e, this.cb.f);
            } else {
               this.n(0.0, this.aH() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gY() {
      fgc $$0 = this.dy();
      dkj $$1 = this.dV();
      $$1.a(
         lz.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azz.a(this.aV * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azz.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awy.ti, 1.0F, 1.0F);

      for (cko $$3 : $$1.a(cko.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aH() && !$$3.bi() && $$3.gQ()) {
            $$3.r();
         }
      }

      if (this.dV() instanceof asb $$4 && $$4.O().c(dkf.g)) {
         this.a($$4, fap.aH, this::a);
      }
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      if (this.a(bxo.a).f() && b($$1)) {
         this.a($$1);
         dak $$2 = $$1.e();
         this.a(bxo.a, $$2);
         this.g(bxo.a);
         this.a($$1, $$2.M());
         $$1.aq();
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      this.a(cko.a.a($$4));
      this.b(cko.a.a($$4));
      this.gP();
      if ($$3 == null) {
         $$3 = new bwu.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cko $$0, @Nullable cko $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gZ());
            this.b(cko.a.a(this.ae));
         } else {
            this.a(cko.a.a(this.ae));
            this.b($$0.gZ());
         }
      } else if (this.ae.h()) {
         this.a($$0.gZ());
         this.b($$1.gZ());
      } else {
         this.a($$1.gZ());
         this.b($$0.gZ());
      }

      if (this.ae.a(32) == 0) {
         this.a(cko.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cko.a.a(this.ae));
      }
   }

   private cko.a gZ() {
      return this.ae.h() ? this.gx() : this.gy();
   }

   public void gP() {
      if (this.gN()) {
         this.g(bzl.s).a(10.0);
      }

      if (this.gJ()) {
         this.g(bzl.v).a(0.07F);
      }
   }

   void ha() {
      if (!this.bi()) {
         this.G(0.0F);
         this.N().m();
         this.w(true);
      }
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (this.gO()) {
         return bvc.e;
      } else if (this.gu()) {
         this.x(false);
         return bvc.a;
      } else if (this.i($$2)) {
         if (this.e() != null) {
            this.bZ = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Y_() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.Y_() == 0 && this.gB()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dV() instanceof asb $$3) || this.u() || this.bi()) {
               return bvc.e;
            }

            this.ha();
            this.y(true);
            dak $$4 = this.a(bxo.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bxo.a, new dak($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bvc.b;
      } else {
         return bvc.e;
      }
   }

   @Nullable
   @Override
   protected awx s() {
      if (this.gl()) {
         return awy.to;
      } else {
         return this.gK() ? awy.tp : awy.tj;
      }
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.tm, 0.15F, 1.0F);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.av);
   }

   @Nullable
   @Override
   protected awx j_() {
      return awy.tk;
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.tq;
   }

   public boolean gQ() {
      return !this.gu() && !this.gO() && !this.gv() && !this.gG() && !this.u();
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bS : super.e($$0);
   }

   private static boolean b(coo $$0) {
      return $$0.e().a(axv.aw) && $$0.bJ() && !$$0.n();
   }

   public static enum a implements bax {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final Codec<cko.a> h = bax.a(cko.a::values);
      private static final IntFunction<cko.a> i = ayo.a(cko.a::a, values(), ayo.a.a);
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

      static cko.a a(cko.a $$0, cko.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cko.a a(int $$0) {
         return i.apply($$0);
      }

      public static cko.a a(bai $$0) {
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

   static class b extends cfl {
      private final cko b;

      public b(cko $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gQ() && super.b();
      }
   }

   static class c<T extends byf> extends cei<T> {
      private final cko i;

      public c(cko $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxl.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gK() && this.i.gQ() && super.b();
      }
   }

   static class d extends cen {
      private final cko d;
      private int e;

      public d(cko $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.m() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.af) {
               this.d.s(32);
               this.e = this.d.af + 600;
               if (this.d.dj()) {
                  csi $$0 = this.b.a(cko.bR, this.d);
                  this.d.ci.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         iw $$0 = this.d.dv();
         iw.a $$1 = new iw.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dnq.nF)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cgt {
      private final cko a;

      public e(cko $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.bZ && !this.a.ca) {
            return super.c();
         } else {
            this.a.g(null);
            return false;
         }
      }

      @Override
      protected void a(byh $$0, byf $$1) {
         if ($$0 instanceof cko && $$0.gl()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends cfb {
      private final cko a;
      private int b;

      public f(cko $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gJ() && this.a.gQ() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bi() && (this.a.gJ() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends cfj {
      private final cko h;

      public g(cko $$0, Class<? extends byf> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(byf $$0) {
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
               asb $$0 = a(this.b);
               if (this.f == csi.class) {
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

   static class h extends cee {
      private final cko l;

      public h(cko $$0) {
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

   static class i extends cfu {
      private final cko a;

      public i(cko $$0, double $$1) {
         super($$0, $$1, axo.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.u()) {
            this.a.N().m();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cfb {
      private final cko a;

      public j(cko $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.a, cfb.a.b, cfb.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gL()) && this.a.aH()) {
            if (!this.a.gQ()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azz.a($$0);
               float $$2 = azz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azz.j((double)$$2) : 0;
               if (this.a.dV().a_(this.a.dv().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gL() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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
      public boolean V_() {
         return false;
      }
   }

   class k extends cfb {
      private int b;

      public k() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cko.this.af || cko.this.e_() || cko.this.bi() || !cko.this.gQ() || cko.this.m() > 0) {
            return false;
         } else {
            return !cko.this.a(bxo.a).f() ? true : !cko.this.dV().a(coo.class, cko.this.cR().c(6.0, 6.0, 6.0), cko::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cko.this.bi() && (cko.this.gJ() || cko.this.ae.a(b(600)) != 1) ? cko.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cko.this.u() && !cko.this.a(bxo.a).f()) {
            cko.this.ha();
         }
      }

      @Override
      public void d() {
         if (cko.this.a(bxo.a).f()) {
            List<coo> $$0 = cko.this.dV().a(coo.class, cko.this.cR().c(8.0, 8.0, 8.0), cko::b);
            if (!$$0.isEmpty()) {
               cko.this.N().a($$0.getFirst(), 1.2F);
            }
         } else {
            cko.this.ha();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         dak $$0 = cko.this.a(bxo.a);
         if (!$$0.f()) {
            cko.this.a(a(cko.this.dV()), $$0);
            cko.this.a(bxo.a, dak.l);
            int $$1 = cko.this.gJ() ? cko.this.ae.a(50) + 10 : cko.this.ae.a(150) + 10;
            this.b = cko.this.af + $$1 * 20;
         }

         cko.this.w(false);
      }
   }

   static class l extends cfb {
      private final cko a;

      public l(cko $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.e_() && this.a.gQ()) {
            return this.a.gN() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
