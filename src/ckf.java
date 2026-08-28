import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckf extends cjm {
   private static final akn<Integer> bK = akr.a(ckf.class, akp.b);
   private static final akn<Integer> bM = akr.a(ckf.class, akp.b);
   private static final akn<Integer> bN = akr.a(ckf.class, akp.b);
   private static final akn<Byte> bO = akr.a(ckf.class, akp.a);
   private static final akn<Byte> bP = akr.a(ckf.class, akp.a);
   private static final akn<Byte> bQ = akr.a(ckf.class, akp.a);
   static final cil bR = cil.b().a(8.0);
   private static final bwy bS = bxe.aO.n().a(0.5F).a(bwx.a().a(bww.a, 0.0F, 0.40625F, 0.0F));
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
   private ffs cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;
   ckf.g ci;

   public ckf(bxe<? extends ckf> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new ckf.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bxf $$0) {
      return $$0 == bxf.a && this.fN();
   }

   public int q() {
      return this.al.a(bK);
   }

   public void s(int $$0) {
      this.al.a(bK, $$0);
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

   public ckf.a gx() {
      return ckf.a.a(this.al.a(bO));
   }

   public void a(ckf.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ckf.a.a(this.ae);
      }

      this.al.a(bO, (byte)$$0.a());
   }

   public ckf.a gy() {
      return ckf.a.a(this.al.a(bP));
   }

   public void b(ckf.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ckf.a.a(this.ae);
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
   protected void a(akr.a $$0) {
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
      $$0.a("MainGene", ckf.a.h, this.gx());
      $$0.a("HiddenGene", ckf.a.h, this.gy());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckf.a>a("MainGene", ckf.a.h).orElse(ckf.a.a));
      this.b($$0.<ckf.a>a("HiddenGene", ckf.a.h).orElse(ckf.a.a));
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      ckf $$2 = bxe.aO.a($$0, bxd.e);
      if ($$2 != null) {
         if ($$1 instanceof ckf $$3) {
            $$2.a(this, $$3);
         }

         $$2.gP();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(2, new ckf.i(this, 2.0));
      this.bF.a(2, new ckf.d(this, 1.0));
      this.bF.a(3, new ckf.b(this, 1.2F, true));
      this.bF.a(4, new cga(this, 1.0, $$0 -> $$0.a(axo.av), false));
      this.bF.a(6, new ckf.c<>(this, crz.class, 8.0F, 2.0, 2.0));
      this.bF.a(6, new ckf.c<>(this, cpb.class, 4.0F, 2.0, 2.0));
      this.bF.a(7, new ckf.k());
      this.bF.a(8, new ckf.f(this));
      this.bF.a(8, new ckf.l(this));
      this.ci = new ckf.g(this, crz.class, 6.0F);
      this.bF.a(9, this.ci);
      this.bF.a(10, new cfn(this));
      this.bF.a(12, new ckf.j(this));
      this.bF.a(13, new cer(this, 1.25));
      this.bF.a(14, new cgf(this, 1.0));
      this.bG.a(1, new ckf.e(this).a(new Class[0]));
   }

   public static bzb.a gH() {
      return cjm.gz().a(bzc.v, 0.15F).a(bzc.c, 6.0);
   }

   public ckf.a gI() {
      return ckf.a.a(this.gx(), this.gy());
   }

   public boolean gJ() {
      return this.gI() == ckf.a.b;
   }

   public boolean gK() {
      return this.gI() == ckf.a.c;
   }

   public boolean gL() {
      return this.gI() == ckf.a.d;
   }

   public boolean gM() {
      return this.gI() == ckf.a.e;
   }

   public boolean gN() {
      return this.gI() == ckf.a.f;
   }

   @Override
   public boolean gl() {
      return this.gI() == ckf.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      if (!this.gl()) {
         this.ca = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gn() {
      this.a(awr.tr, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gK()) {
         if (this.dV().ag() && !this.bi()) {
            this.w(true);
            this.y(false);
         } else if (!this.gv()) {
            this.w(false);
         }
      }

      bxw $$0 = this.f();
      if ($$0 == null) {
         this.bZ = false;
         this.ca = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awr.tn, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gY();
         } else if (this.gw() == 1) {
            this.a(awr.th, 1.0F, 1.0F);
         }
      }

      if (this.gG()) {
         this.gX();
      } else {
         this.bJ = 0;
      }

      if (this.x()) {
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
      if (!this.gv() && this.x() && !this.gO() && !this.a(bxf.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bxf.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gT();
         if (!this.dV().C && this.gR() > 80 && this.ae.a(20) == 1) {
            if (this.gR() > 100 && this.a(bxf.a).a(axo.aw)) {
               if (!this.dV().C) {
                  this.a(bxf.a, daa.k);
                  this.a(egg.m);
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
         this.a(awr.tl, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ffs $$1 = new ffs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            ffs $$3 = new ffs(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lv(lz.U, this.a(bxf.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gU() {
      this.cd = this.cc;
      if (this.x()) {
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
      return azq.h($$0, this.cd, this.cc);
   }

   public float K(float $$0) {
      return azq.h($$0, this.cf, this.ce);
   }

   public float L(float $$0) {
      return azq.h($$0, this.ch, this.cg);
   }

   private void gX() {
      this.bJ++;
      if (this.bJ > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            ffs $$0 = this.dy();
            if (this.bJ == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.cb = new ffs($$0.d + (double)(-azq.a($$1) * $$2), 0.0, $$0.f + (double)(azq.b($$1) * $$2));
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
      ffs $$0 = this.dy();
      djz $$1 = this.dV();
      $$1.a(
         lz.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azq.a(this.aV * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azq.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awr.ti, 1.0F, 1.0F);

      for (ckf $$3 : $$1.a(ckf.class, this.cR().g(10.0))) {
         if (!$$3.n_() && $$3.aH() && !$$3.bi() && $$3.gQ()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof aru $$4 && $$4.O().c(djv.g)) {
         this.a($$4, faf.aH, this::a);
      }
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      if (this.a(bxf.a).f() && b($$1)) {
         this.a($$1);
         daa $$2 = $$1.f();
         this.a(bxf.a, $$2);
         this.g(bxf.a);
         this.a($$1, $$2.M());
         $$1.aq();
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      this.a(ckf.a.a($$4));
      this.b(ckf.a.a($$4));
      this.gP();
      if ($$3 == null) {
         $$3 = new bwl.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(ckf $$0, @Nullable ckf $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gZ());
            this.b(ckf.a.a(this.ae));
         } else {
            this.a(ckf.a.a(this.ae));
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
         this.a(ckf.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(ckf.a.a(this.ae));
      }
   }

   private ckf.a gZ() {
      return this.ae.h() ? this.gx() : this.gy();
   }

   public void gP() {
      if (this.gN()) {
         this.g(bzc.s).a(10.0);
      }

      if (this.gJ()) {
         this.g(bzc.v).a(0.07F);
      }
   }

   void ha() {
      if (!this.bi()) {
         this.G(0.0F);
         this.O().m();
         this.w(true);
      }
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (this.gO()) {
         return but.e;
      } else if (this.gu()) {
         this.x(false);
         return but.a;
      } else if (this.i($$2)) {
         if (this.f() != null) {
            this.bZ = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.g() == 0 && this.gB()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
         } else {
            if (!(this.dV() instanceof aru $$3) || this.x() || this.bi()) {
               return but.e;
            }

            this.ha();
            this.y(true);
            daa $$4 = this.a(bxf.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bxf.a, new daa($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return but.b;
      } else {
         return but.e;
      }
   }

   @Nullable
   @Override
   protected awq u() {
      if (this.gl()) {
         return awr.to;
      } else {
         return this.gK() ? awr.tp : awr.tj;
      }
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.tm, 0.15F, 1.0F);
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.av);
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.tk;
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.tq;
   }

   public boolean gQ() {
      return !this.gu() && !this.gO() && !this.gv() && !this.gG() && !this.x();
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bS : super.e($$0);
   }

   private static boolean b(coe $$0) {
      return $$0.f().a(axo.aw) && $$0.bJ() && !$$0.o();
   }

   public static enum a implements bao {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final Codec<ckf.a> h = bao.a(ckf.a::values);
      private static final IntFunction<ckf.a> i = ayg.a(ckf.a::a, values(), ayg.a.a);
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

      static ckf.a a(ckf.a $$0, ckf.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static ckf.a a(int $$0) {
         return i.apply($$0);
      }

      public static ckf.a a(azz $$0) {
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

   static class b extends cfc {
      private final ckf b;

      public b(ckf $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gQ() && super.b();
      }
   }

   static class c<T extends bxw> extends cdz<T> {
      private final ckf i;

      public c(ckf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxc.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gK() && this.i.gQ() && super.b();
      }
   }

   static class d extends cee {
      private final ckf d;
      private int e;

      public d(ckf $$0, double $$1) {
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
                  crz $$0 = this.b.a(ckf.bR, this.d);
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
                     if (this.b.a_($$1).a(dng.nF)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cgk {
      private final ckf a;

      public e(ckf $$0, Class<?>... $$1) {
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
      protected void a(bxy $$0, bxw $$1) {
         if ($$0 instanceof ckf && $$0.gl()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends ces {
      private final ckf a;
      private int b;

      public f(ckf $$0) {
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

   static class g extends cfa {
      private final ckf h;

      public g(ckf $$0, Class<? extends bxw> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bxw $$0) {
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
               aru $$0 = a(this.b);
               if (this.f == crz.class) {
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

   static class h extends cdv {
      private final ckf l;

      public h(ckf $$0) {
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

   static class i extends cfl {
      private final ckf a;

      public i(ckf $$0, double $$1) {
         super($$0, $$1, axh.G);
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

   static class j extends ces {
      private final ckf a;

      public j(ckf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.a, ces.a.b, ces.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gL()) && this.a.aH()) {
            if (!this.a.gQ()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azq.a($$0);
               float $$2 = azq.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azq.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azq.j((double)$$2) : 0;
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
      public boolean U_() {
         return false;
      }
   }

   class k extends ces {
      private int b;

      public k() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > ckf.this.af || ckf.this.n_() || ckf.this.bi() || !ckf.this.gQ() || ckf.this.q() > 0) {
            return false;
         } else {
            return !ckf.this.a(bxf.a).f() ? true : !ckf.this.dV().a(coe.class, ckf.this.cR().c(6.0, 6.0, 6.0), ckf::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !ckf.this.bi() && (ckf.this.gJ() || ckf.this.ae.a(b(600)) != 1) ? ckf.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!ckf.this.x() && !ckf.this.a(bxf.a).f()) {
            ckf.this.ha();
         }
      }

      @Override
      public void d() {
         if (ckf.this.a(bxf.a).f()) {
            List<coe> $$0 = ckf.this.dV().a(coe.class, ckf.this.cR().c(8.0, 8.0, 8.0), ckf::b);
            if (!$$0.isEmpty()) {
               ckf.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            ckf.this.ha();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         daa $$0 = ckf.this.a(bxf.a);
         if (!$$0.f()) {
            ckf.this.a(a(ckf.this.dV()), $$0);
            ckf.this.a(bxf.a, daa.k);
            int $$1 = ckf.this.gJ() ? ckf.this.ae.a(50) + 10 : ckf.this.ae.a(150) + 10;
            this.b = ckf.this.af + $$1 * 20;
         }

         ckf.this.w(false);
      }
   }

   static class l extends ces {
      private final ckf a;

      public l(ckf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.n_() && this.a.gQ()) {
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
