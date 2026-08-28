import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckd extends cjk {
   private static final akl<Integer> bK = akp.a(ckd.class, akn.b);
   private static final akl<Integer> bM = akp.a(ckd.class, akn.b);
   private static final akl<Integer> bN = akp.a(ckd.class, akn.b);
   private static final akl<Byte> bO = akp.a(ckd.class, akn.a);
   private static final akl<Byte> bP = akp.a(ckd.class, akn.a);
   private static final akl<Byte> bQ = akp.a(ckd.class, akn.a);
   static final cij bR = cij.b().a(8.0);
   private static final bww bS = bxc.aO.n().a(0.5F).a(bwv.a().a(bwu.a, 0.0F, 0.40625F, 0.0F));
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
   private ffq cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;
   ckd.g ci;

   public ckd(bxc<? extends ckd> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new ckd.h(this);
      if (!this.n_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bxd $$0) {
      return $$0 == bxd.a && this.fN();
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

   public ckd.a gx() {
      return ckd.a.a(this.al.a(bO));
   }

   public void a(ckd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ckd.a.a(this.ae);
      }

      this.al.a(bO, (byte)$$0.a());
   }

   public ckd.a gy() {
      return ckd.a.a(this.al.a(bP));
   }

   public void b(ckd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ckd.a.a(this.ae);
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
   protected void a(akp.a $$0) {
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("MainGene", ckd.a.h, this.gx());
      $$0.a("HiddenGene", ckd.a.h, this.gy());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckd.a>a("MainGene", ckd.a.h).orElse(ckd.a.a));
      this.b($$0.<ckd.a>a("HiddenGene", ckd.a.h).orElse(ckd.a.a));
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      ckd $$2 = bxc.aO.a($$0, bxb.e);
      if ($$2 != null) {
         if ($$1 instanceof ckd $$3) {
            $$2.a(this, $$3);
         }

         $$2.gP();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(2, new ckd.i(this, 2.0));
      this.bF.a(2, new ckd.d(this, 1.0));
      this.bF.a(3, new ckd.b(this, 1.2F, true));
      this.bF.a(4, new cfy(this, 1.0, $$0 -> $$0.a(axm.au), false));
      this.bF.a(6, new ckd.c<>(this, crx.class, 8.0F, 2.0, 2.0));
      this.bF.a(6, new ckd.c<>(this, coz.class, 4.0F, 2.0, 2.0));
      this.bF.a(7, new ckd.k());
      this.bF.a(8, new ckd.f(this));
      this.bF.a(8, new ckd.l(this));
      this.ci = new ckd.g(this, crx.class, 6.0F);
      this.bF.a(9, this.ci);
      this.bF.a(10, new cfl(this));
      this.bF.a(12, new ckd.j(this));
      this.bF.a(13, new cep(this, 1.25));
      this.bF.a(14, new cgd(this, 1.0));
      this.bG.a(1, new ckd.e(this).a(new Class[0]));
   }

   public static byz.a gH() {
      return cjk.gz().a(bza.v, 0.15F).a(bza.c, 6.0);
   }

   public ckd.a gI() {
      return ckd.a.a(this.gx(), this.gy());
   }

   public boolean gJ() {
      return this.gI() == ckd.a.b;
   }

   public boolean gK() {
      return this.gI() == ckd.a.c;
   }

   public boolean gL() {
      return this.gI() == ckd.a.d;
   }

   public boolean gM() {
      return this.gI() == ckd.a.e;
   }

   public boolean gN() {
      return this.gI() == ckd.a.f;
   }

   @Override
   public boolean gl() {
      return this.gI() == ckd.a.g;
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if (!this.gl()) {
         this.ca = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gn() {
      this.a(awp.tr, 1.0F, 1.0F);
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

      bxu $$0 = this.f();
      if ($$0 == null) {
         this.bZ = false;
         this.ca = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awp.tn, 1.0F, 1.0F);
         }

         this.s(this.q() - 1);
      }

      if (this.t()) {
         this.t(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gY();
         } else if (this.gw() == 1) {
            this.a(awp.th, 1.0F, 1.0F);
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
      if (!this.gv() && this.x() && !this.gO() && !this.a(bxd.a).f() && this.ae.a(80) == 1) {
         this.y(true);
      } else if (this.a(bxd.a).f() || !this.x()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gT();
         if (!this.dV().C && this.gR() > 80 && this.ae.a(20) == 1) {
            if (this.gR() > 100 && this.a(bxd.a).a(axm.av)) {
               if (!this.dV().C) {
                  this.a(bxd.a, czy.k);
                  this.a(ege.m);
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
         this.a(awp.tl, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ffq $$1 = new ffq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            ffq $$3 = new ffq(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lu(ly.U, this.a(bxd.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
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
      return azo.h($$0, this.cd, this.cc);
   }

   public float K(float $$0) {
      return azo.h($$0, this.cf, this.ce);
   }

   public float L(float $$0) {
      return azo.h($$0, this.ch, this.cg);
   }

   private void gX() {
      this.bJ++;
      if (this.bJ > 32) {
         this.A(false);
      } else {
         if (!this.dV().C) {
            ffq $$0 = this.dy();
            if (this.bJ == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.cb = new ffq($$0.d + (double)(-azo.a($$1) * $$2), 0.0, $$0.f + (double)(azo.b($$1) * $$2));
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
      ffq $$0 = this.dy();
      djx $$1 = this.dV();
      $$1.a(
         ly.aj,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azo.a(this.aV * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azo.b(this.aV * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awp.ti, 1.0F, 1.0F);

      for (ckd $$3 : $$1.a(ckd.class, this.cR().g(10.0))) {
         if (!$$3.n_() && $$3.aH() && !$$3.bi() && $$3.gQ()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof ars $$4 && $$4.O().c(djt.g)) {
         this.a($$4, fad.aH, this::a);
      }
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      if (this.a(bxd.a).f() && b($$1)) {
         this.a($$1);
         czy $$2 = $$1.f();
         this.a(bxd.a, $$2);
         this.g(bxd.a);
         this.a($$1, $$2.M());
         $$1.aq();
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      this.w(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      this.a(ckd.a.a($$4));
      this.b(ckd.a.a($$4));
      this.gP();
      if ($$3 == null) {
         $$3 = new bwj.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(ckd $$0, @Nullable ckd $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gZ());
            this.b(ckd.a.a(this.ae));
         } else {
            this.a(ckd.a.a(this.ae));
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
         this.a(ckd.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(ckd.a.a(this.ae));
      }
   }

   private ckd.a gZ() {
      return this.ae.h() ? this.gx() : this.gy();
   }

   public void gP() {
      if (this.gN()) {
         this.g(bza.s).a(10.0);
      }

      if (this.gJ()) {
         this.g(bza.v).a(0.07F);
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
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (this.gO()) {
         return bur.e;
      } else if (this.gu()) {
         this.x(false);
         return bur.a;
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
            if (!(this.dV() instanceof ars $$3) || this.x() || this.bi()) {
               return bur.e;
            }

            this.ha();
            this.y(true);
            czy $$4 = this.a(bxd.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bxd.a, new czy($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bur.b;
      } else {
         return bur.e;
      }
   }

   @Nullable
   @Override
   protected awo u() {
      if (this.gl()) {
         return awp.to;
      } else {
         return this.gK() ? awp.tp : awp.tj;
      }
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.tm, 0.15F, 1.0F);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.au);
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.tk;
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return awp.tq;
   }

   public boolean gQ() {
      return !this.gu() && !this.gO() && !this.gv() && !this.gG() && !this.x();
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bS : super.e($$0);
   }

   private static boolean b(coc $$0) {
      return $$0.f().a(axm.av) && $$0.bJ() && !$$0.o();
   }

   public static enum a implements bam {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final Codec<ckd.a> h = bam.a(ckd.a::values);
      private static final IntFunction<ckd.a> i = aye.a(ckd.a::a, values(), aye.a.a);
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

      static ckd.a a(ckd.a $$0, ckd.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static ckd.a a(int $$0) {
         return i.apply($$0);
      }

      public static ckd.a a(azx $$0) {
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

   static class b extends cfa {
      private final ckd b;

      public b(ckd $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gQ() && super.b();
      }
   }

   static class c<T extends bxu> extends cdx<T> {
      private final ckd i;

      public c(ckd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxa.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gK() && this.i.gQ() && super.b();
      }
   }

   static class d extends cec {
      private final ckd d;
      private int e;

      public d(ckd $$0, double $$1) {
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
                  crx $$0 = this.b.a(ckd.bR, this.d);
                  this.d.ci.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         iv $$0 = this.d.dv();
         iv.a $$1 = new iv.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dne.nF)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cgi {
      private final ckd a;

      public e(ckd $$0, Class<?>... $$1) {
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
      protected void a(bxw $$0, bxu $$1) {
         if ($$0 instanceof ckd && $$0.gl()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends ceq {
      private final ckd a;
      private int b;

      public f(ckd $$0) {
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

   static class g extends cey {
      private final ckd h;

      public g(ckd $$0, Class<? extends bxu> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bxu $$0) {
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
               ars $$0 = a(this.b);
               if (this.f == crx.class) {
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

   static class h extends cdt {
      private final ckd l;

      public h(ckd $$0) {
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

   static class i extends cfj {
      private final ckd a;

      public i(ckd $$0, double $$1) {
         super($$0, $$1, axf.G);
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

   static class j extends ceq {
      private final ckd a;

      public j(ckd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.a, ceq.a.b, ceq.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.n_() || this.a.gL()) && this.a.aH()) {
            if (!this.a.gQ()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azo.a($$0);
               float $$2 = azo.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azo.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azo.j((double)$$2) : 0;
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

   class k extends ceq {
      private int b;

      public k() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > ckd.this.af || ckd.this.n_() || ckd.this.bi() || !ckd.this.gQ() || ckd.this.q() > 0) {
            return false;
         } else {
            return !ckd.this.a(bxd.a).f() ? true : !ckd.this.dV().a(coc.class, ckd.this.cR().c(6.0, 6.0, 6.0), ckd::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !ckd.this.bi() && (ckd.this.gJ() || ckd.this.ae.a(b(600)) != 1) ? ckd.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!ckd.this.x() && !ckd.this.a(bxd.a).f()) {
            ckd.this.ha();
         }
      }

      @Override
      public void d() {
         if (ckd.this.a(bxd.a).f()) {
            List<coc> $$0 = ckd.this.dV().a(coc.class, ckd.this.cR().c(8.0, 8.0, 8.0), ckd::b);
            if (!$$0.isEmpty()) {
               ckd.this.O().a($$0.getFirst(), 1.2F);
            }
         } else {
            ckd.this.ha();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czy $$0 = ckd.this.a(bxd.a);
         if (!$$0.f()) {
            ckd.this.a(a(ckd.this.dV()), $$0);
            ckd.this.a(bxd.a, czy.k);
            int $$1 = ckd.this.gJ() ? ckd.this.ae.a(50) + 10 : ckd.this.ae.a(150) + 10;
            this.b = ckd.this.af + $$1 * 20;
         }

         ckd.this.w(false);
      }
   }

   static class l extends ceq {
      private final ckd a;

      public l(ckd $$0) {
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
