import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cft extends cfe {
   private static final ajw<Integer> ce = aka.a(cft.class, ajy.b);
   private static final ajw<Integer> cg = aka.a(cft.class, ajy.b);
   private static final ajw<Integer> ch = aka.a(cft.class, ajy.b);
   private static final ajw<Byte> ci = aka.a(cft.class, ajy.a);
   private static final ajw<Byte> cj = aka.a(cft.class, ajy.a);
   private static final ajw<Byte> ck = aka.a(cft.class, ajy.a);
   static final cef cl = cef.b().a(8.0);
   private static final bsu cm = bsx.aw.n().a(0.5F).a(bst.a().a(bss.a, 0.0F, 0.40625F, 0.0F));
   private static final int cn = 2;
   private static final int co = 4;
   private static final int cp = 8;
   private static final int cq = 16;
   private static final int cr = 5;
   public static final int cc = 32;
   private static final int cs = 32;
   boolean ct;
   boolean cu;
   public int cd;
   private exc cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   private float cA;
   private float cB;
   cft.g cD;
   static final Predicate<cjh> cE = $$0 -> {
      cuq $$1 = $$0.p();
      return ($$1.a(dga.mZ.r()) || $$1.a(dga.eg.r())) && $$0.bE() && !$$0.y();
   };

   public cft(bsx<? extends cft> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new cft.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cuq $$0) {
      bsy $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsy.a && super.f($$0);
   }

   public int s() {
      return this.ao.a(ce);
   }

   public void t(int $$0) {
      this.ao.a(ce, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean x() {
      return this.w(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gk() {
      return this.w(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gl() {
      return this.ao.a(ch) > 0;
   }

   public void z(boolean $$0) {
      this.ao.a(ch, $$0 ? 1 : 0);
   }

   private int gF() {
      return this.ao.a(ch);
   }

   private void v(int $$0) {
      this.ao.a(ch, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gm() {
      return this.ao.a(cg);
   }

   public void u(int $$0) {
      this.ao.a(cg, $$0);
   }

   public cft.a gn() {
      return cft.a.a(this.ao.a(ci));
   }

   public void a(cft.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cft.a.a(this.ah);
      }

      this.ao.a(ci, (byte)$$0.a());
   }

   public cft.a go() {
      return cft.a.a(this.ao.a(cj));
   }

   public void b(cft.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cft.a.a(this.ah);
      }

      this.ao.a(cj, (byte)$$0.a());
   }

   public boolean gu() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cg, 0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, (byte)0);
      $$0.a(ch, 0);
   }

   private boolean w(int $$0) {
      return (this.ao.a(ck) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(ck);
      if ($$1) {
         this.ao.a(ck, (byte)($$2 | $$0));
      } else {
         this.ao.a(ck, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gn().c());
      $$0.a("HiddenGene", this.go().c());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cft.a.a($$0.l("MainGene")));
      this.b(cft.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      cft $$2 = bsx.aw.a((dcw)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cft $$3) {
            $$2.a(this, $$3);
         }

         $$2.gD();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bW.a(0, new cag(this));
      this.bW.a(2, new cft.i(this, 2.0));
      this.bW.a(2, new cft.d(this, 1.0));
      this.bW.a(3, new cft.b(this, 1.2F, true));
      this.bW.a(4, new cbu(this, 1.0, $$0 -> $$0.a(awn.aq), false));
      this.bW.a(6, new cft.c<>(this, cmx.class, 8.0F, 2.0, 2.0));
      this.bW.a(6, new cft.c<>(this, ckd.class, 4.0F, 2.0, 2.0));
      this.bW.a(7, new cft.k());
      this.bW.a(8, new cft.f(this));
      this.bW.a(8, new cft.l(this));
      this.cD = new cft.g(this, cmx.class, 6.0F);
      this.bW.a(9, this.cD);
      this.bW.a(10, new cbh(this));
      this.bW.a(12, new cft.j(this));
      this.bW.a(13, new cal(this, 1.25));
      this.bW.a(14, new cbz(this, 1.0));
      this.bX.a(1, new cft.e(this).a(new Class[0]));
   }

   public static buv.a gv() {
      return btp.C().a(buw.v, 0.15F).a(buw.c, 6.0);
   }

   public cft.a gw() {
      return cft.a.a(this.gn(), this.go());
   }

   public boolean gx() {
      return this.gw() == cft.a.b;
   }

   public boolean gy() {
      return this.gw() == cft.a.c;
   }

   public boolean gz() {
      return this.gw() == cft.a.d;
   }

   public boolean gA() {
      return this.gw() == cft.a.e;
   }

   public boolean gB() {
      return this.gw() == cft.a.f;
   }

   @Override
   public boolean gb() {
      return this.gw() == cft.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean D(bsr $$0) {
      if (!this.gb()) {
         this.cu = true;
      }

      return super.D($$0);
   }

   @Override
   public void gd() {
      this.a(avp.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gy()) {
         if (this.dO().ac() && !this.bf()) {
            this.x(true);
            this.z(false);
         } else if (!this.gl()) {
            this.x(false);
         }
      }

      btn $$0 = this.p();
      if ($$0 == null) {
         this.ct = false;
         this.cu = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avp.sA, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.gm() + 1);
         if (this.gm() > 20) {
            this.A(false);
            this.gM();
         } else if (this.gm() == 1) {
            this.a(avp.su, 1.0F, 1.0F);
         }
      }

      if (this.gu()) {
         this.gL();
      } else {
         this.cd = 0;
      }

      if (this.x()) {
         this.u(0.0F);
      }

      this.gI();
      this.gG();
      this.gJ();
      this.gK();
   }

   public boolean gC() {
      return this.gy() && this.dO().ac();
   }

   private void gG() {
      if (!this.gl() && this.x() && !this.gC() && !this.a(bsy.a).e() && this.ah.a(80) == 1) {
         this.z(true);
      } else if (this.a(bsy.a).e() || !this.x()) {
         this.z(false);
      }

      if (this.gl()) {
         this.gH();
         if (!this.dO().B && this.gF() > 80 && this.ah.a(20) == 1) {
            if (this.gF() > 100 && this.n(this.a(bsy.a))) {
               if (!this.dO().B) {
                  this.a(bsy.a, cuq.l);
                  this.a(dxz.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.v(this.gF() + 1);
      }
   }

   private void gH() {
      if (this.gF() % 5 == 0) {
         this.a(avp.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            exc $$1 = new exc(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dG() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dE() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            exc $$3 = new exc(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dt(), this.dx() + 1.0, this.dz());
            this.dO().a(new li(lm.S, this.a(bsy.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gI() {
      this.cx = this.cw;
      if (this.x()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   private void gJ() {
      this.cz = this.cy;
      if (this.gk()) {
         this.cy = Math.min(1.0F, this.cy + 0.15F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.19F);
      }
   }

   private void gK() {
      this.cB = this.cA;
      if (this.gu()) {
         this.cA = Math.min(1.0F, this.cA + 0.15F);
      } else {
         this.cA = Math.max(0.0F, this.cA - 0.19F);
      }
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cx, this.cw);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cz, this.cy);
   }

   public float J(float $$0) {
      return ayo.i($$0, this.cB, this.cA);
   }

   private void gL() {
      this.cd++;
      if (this.cd > 32) {
         this.B(false);
      } else {
         if (!this.dO().B) {
            exc $$0 = this.dr();
            if (this.cd == 1) {
               float $$1 = this.dE() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cv = new exc($$0.c + (double)(-ayo.a($$1) * $$2), 0.0, $$0.e + (double)(ayo.b($$1) * $$2));
               this.i(this.cv.b(0.0, 0.27, 0.0));
            } else if ((float)this.cd != 7.0F && (float)this.cd != 15.0F && (float)this.cd != 23.0F) {
               this.n(this.cv.c, $$0.d, this.cv.e);
            } else {
               this.n(0.0, this.aF() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gM() {
      exc $$0 = this.dr();
      dcw $$1 = this.dO();
      $$1.a(
         lm.ag,
         this.dt() - (double)(this.dj() + 1.0F) * 0.5 * (double)ayo.a(this.aY * (float) (Math.PI / 180.0)),
         this.dx() - 0.1F,
         this.dz() + (double)(this.dj() + 1.0F) * 0.5 * (double)ayo.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avp.sv, 1.0F, 1.0F);

      for (cft $$3 : $$1.a(cft.class, this.cK().g(10.0))) {
         if (!$$3.o_() && $$3.aF() && !$$3.bf() && $$3.gE()) {
            $$3.ff();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dcs.f)) {
         aqu $$4 = (aqu)$$1;
         erw $$5 = $$4.o().be().b(ern.aV);
         eru $$6 = new eru.a($$4).a(eun.f, this.dm()).a(eun.a, this).a(eum.j);

         for (cuq $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cjh $$0) {
      if (this.a(bsy.a).e() && cE.test($$0)) {
         this.a($$0);
         cuq $$1 = $$0.p();
         this.a(bsy.a, $$1);
         this.e(bsy.a);
         this.a($$0, $$1.H());
         $$0.aq();
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (!this.dO().B) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.a(cft.a.a($$4));
      this.b(cft.a.a($$4));
      this.gD();
      if ($$3 == null) {
         $$3 = new bsl.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cft $$0, @Nullable cft $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gN());
            this.b(cft.a.a(this.ah));
         } else {
            this.a(cft.a.a(this.ah));
            this.b($$0.gN());
         }
      } else if (this.ah.h()) {
         this.a($$0.gN());
         this.b($$1.gN());
      } else {
         this.a($$1.gN());
         this.b($$0.gN());
      }

      if (this.ah.a(32) == 0) {
         this.a(cft.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cft.a.a(this.ah));
      }
   }

   private cft.a gN() {
      return this.ah.h() ? this.gn() : this.go();
   }

   public void gD() {
      if (this.gB()) {
         this.f(buw.s).a(10.0);
      }

      if (this.gx()) {
         this.f(buw.v).a(0.07F);
      }
   }

   void gO() {
      if (!this.bf()) {
         this.E(0.0F);
         this.N().n();
         this.x(true);
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.gC()) {
         return bqr.e;
      } else if (this.gk()) {
         this.y(false);
         return bqr.a(this.dO().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.ct = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dO().B && this.g() == 0 && this.gp()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dO().B || this.x() || this.bf()) {
               return bqr.e;
            }

            this.gO();
            this.z(true);
            cuq $$3 = this.a(bsy.a);
            if (!$$3.e() && !$$0.fL()) {
               this.b($$3);
            }

            this.a(bsy.a, new cuq($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqr.a;
      } else {
         return bqr.e;
      }
   }

   @Nullable
   @Override
   protected avo v() {
      if (this.gb()) {
         return avp.sB;
      } else {
         return this.gy() ? avp.sC : avp.sw;
      }
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.sz, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.aq);
   }

   private boolean n(cuq $$0) {
      return this.o($$0) || $$0.a(dga.eg.r());
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.sx;
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return avp.sD;
   }

   public boolean gE() {
      return !this.gk() && !this.gC() && !this.gl() && !this.gu() && !this.x();
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? cm : super.e($$0);
   }

   public static enum a implements azk {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azk.a<cft.a> h = azk.a(cft.a::values);
      private static final IntFunction<cft.a> i = axe.a(cft.a::a, values(), axe.a.a);
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

      static cft.a a(cft.a $$0, cft.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cft.a a(int $$0) {
         return i.apply($$0);
      }

      public static cft.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cft.a a(ayw $$0) {
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

   static class b extends caw {
      private final cft b;

      public b(cft $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gE() && super.b();
      }
   }

   static class c<T extends btn> extends bzt<T> {
      private final cft i;

      public c(cft $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsw.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gy() && this.i.gE() && super.b();
      }
   }

   static class d extends bzy {
      private final cft d;
      private int e;

      public d(cft $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.s() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ai) {
               this.d.t(32);
               this.e = this.d.ai + 600;
               if (this.d.db()) {
                  cmx $$0 = this.b.a(cft.cl, this.d);
                  this.d.cD.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jd $$0 = this.d.do();
         jd.a $$1 = new jd.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dga.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cce {
      private final cft a;

      public e(cft $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.ct && !this.a.cu) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cft && $$0.gb()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cam {
      private final cft a;
      private int b;

      public f(cft $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ai && this.a.gx() && this.a.gE() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bf() && (this.a.gx() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.y(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
         this.b = this.a.ai + 200;
      }
   }

   static class g extends cau {
      private final cft h;

      public g(cft $$0, Class<? extends btn> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btn $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dR().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cmx.class) {
                  this.c = this.b.dO().a(this.g, this.b, this.b.dt(), this.b.dx(), this.b.dz());
               } else {
                  this.c = this.b
                     .dO()
                     .a(
                        this.b.dO().a(this.f, this.b.cK().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dt(),
                        this.b.dx(),
                        this.b.dz()
                     );
               }
            }

            return this.h.gE() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends bzp {
      private final cft l;

      public h(cft $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gE()) {
            super.a();
         }
      }
   }

   static class i extends cbf {
      private final cft a;

      public i(cft $$0, double $$1) {
         super($$0, $$1, awg.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.N().n();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cam {
      private final cft a;

      public j(cft $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a, cam.a.b, cam.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.o_() || this.a.gz()) && this.a.aF()) {
            if (!this.a.gE()) {
               return false;
            } else {
               float $$0 = this.a.dE() * (float) (Math.PI / 180.0);
               float $$1 = -ayo.a($$0);
               float $$2 = ayo.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayo.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayo.j((double)$$2) : 0;
               if (this.a.dO().a_(this.a.do().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gz() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
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

   class k extends cam {
      private int b;

      public k() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cft.this.ai && !cft.this.o_() && !cft.this.bf() && cft.this.gE() && cft.this.s() <= 0) {
            List<cjh> $$0 = cft.this.dO().a(cjh.class, cft.this.cK().c(6.0, 6.0, 6.0), cft.cE);
            return !$$0.isEmpty() || !cft.this.a(bsy.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cft.this.bf() && (cft.this.gx() || cft.this.ah.a(b(600)) != 1) ? cft.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cft.this.x() && !cft.this.a(bsy.a).e()) {
            cft.this.gO();
         }
      }

      @Override
      public void d() {
         List<cjh> $$0 = cft.this.dO().a(cjh.class, cft.this.cK().c(8.0, 8.0, 8.0), cft.cE);
         if (!$$0.isEmpty() && cft.this.a(bsy.a).e()) {
            cft.this.N().a($$0.get(0), 1.2F);
         } else if (!cft.this.a(bsy.a).e()) {
            cft.this.gO();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cuq $$0 = cft.this.a(bsy.a);
         if (!$$0.e()) {
            cft.this.b($$0);
            cft.this.a(bsy.a, cuq.l);
            int $$1 = cft.this.gx() ? cft.this.ah.a(50) + 10 : cft.this.ah.a(150) + 10;
            this.b = cft.this.ai + $$1 * 20;
         }

         cft.this.x(false);
      }
   }

   static class l extends cam {
      private final cft a;

      public l(cft $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.o_() && this.a.gE()) {
            return this.a.gB() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
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
