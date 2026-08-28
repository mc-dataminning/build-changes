import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfr extends cfc {
   private static final ajv<Integer> cc = ajz.a(cfr.class, ajx.b);
   private static final ajv<Integer> ce = ajz.a(cfr.class, ajx.b);
   private static final ajv<Integer> cf = ajz.a(cfr.class, ajx.b);
   private static final ajv<Byte> cg = ajz.a(cfr.class, ajx.a);
   private static final ajv<Byte> ch = ajz.a(cfr.class, ajx.a);
   private static final ajv<Byte> ci = ajz.a(cfr.class, ajx.a);
   static final ced cj = ced.b().a(8.0);
   private static final bst ck = bsw.aw.n().a(0.5F).a(bss.a().a(bsr.a, 0.0F, 0.40625F, 0.0F));
   private static final int cl = 2;
   private static final int cm = 4;
   private static final int cn = 8;
   private static final int co = 16;
   private static final int cp = 5;
   public static final int ca = 32;
   private static final int cq = 32;
   boolean cr;
   boolean cs;
   public int cb;
   private eww ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   cfr.g cB;
   static final Predicate<cjf> cC = $$0 -> {
      cuo $$1 = $$0.p();
      return ($$1.a(dfy.mZ.r()) || $$1.a(dfy.eg.r())) && $$0.bE() && !$$0.y();
   };

   public cfr(bsw<? extends cfr> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new cfr.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsx.a && super.f($$0);
   }

   public int s() {
      return this.ao.a(cc);
   }

   public void t(int $$0) {
      this.ao.a(cc, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean x() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gm() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gn() {
      return this.ao.a(cf) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cf, $$0 ? 1 : 0);
   }

   private int gH() {
      return this.ao.a(cf);
   }

   private void v(int $$0) {
      this.ao.a(cf, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int go() {
      return this.ao.a(ce);
   }

   public void u(int $$0) {
      this.ao.a(ce, $$0);
   }

   public cfr.a gp() {
      return cfr.a.a(this.ao.a(cg));
   }

   public void a(cfr.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfr.a.a(this.ah);
      }

      this.ao.a(cg, (byte)$$0.a());
   }

   public cfr.a gq() {
      return cfr.a.a(this.ao.a(ch));
   }

   public void b(cfr.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfr.a.a(this.ah);
      }

      this.ao.a(ch, (byte)$$0.a());
   }

   public boolean gw() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
      $$0.a(ce, 0);
      $$0.a(cg, (byte)0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, (byte)0);
      $$0.a(cf, 0);
   }

   private boolean w(int $$0) {
      return (this.ao.a(ci) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(ci);
      if ($$1) {
         this.ao.a(ci, (byte)($$2 | $$0));
      } else {
         this.ao.a(ci, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gp().c());
      $$0.a("HiddenGene", this.gq().c());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cfr.a.a($$0.l("MainGene")));
      this.b(cfr.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      cfr $$2 = bsw.aw.a((dcu)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfr $$3) {
            $$2.a(this, $$3);
         }

         $$2.gF();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(2, new cfr.i(this, 2.0));
      this.bU.a(2, new cfr.d(this, 1.0));
      this.bU.a(3, new cfr.b(this, 1.2F, true));
      this.bU.a(4, new cbs(this, 1.0, $$0 -> $$0.a(awm.aq), false));
      this.bU.a(6, new cfr.c<>(this, cmv.class, 8.0F, 2.0, 2.0));
      this.bU.a(6, new cfr.c<>(this, ckb.class, 4.0F, 2.0, 2.0));
      this.bU.a(7, new cfr.k());
      this.bU.a(8, new cfr.f(this));
      this.bU.a(8, new cfr.l(this));
      this.cB = new cfr.g(this, cmv.class, 6.0F);
      this.bU.a(9, this.cB);
      this.bU.a(10, new cbf(this));
      this.bU.a(12, new cfr.j(this));
      this.bU.a(13, new caj(this, 1.25));
      this.bU.a(14, new cbx(this, 1.0));
      this.bV.a(1, new cfr.e(this).a(new Class[0]));
   }

   public static but.a gx() {
      return btn.A().a(buu.v, 0.15F).a(buu.c, 6.0);
   }

   public cfr.a gy() {
      return cfr.a.a(this.gp(), this.gq());
   }

   public boolean gz() {
      return this.gy() == cfr.a.b;
   }

   public boolean gA() {
      return this.gy() == cfr.a.c;
   }

   public boolean gB() {
      return this.gy() == cfr.a.d;
   }

   public boolean gC() {
      return this.gy() == cfr.a.e;
   }

   public boolean gD() {
      return this.gy() == cfr.a.f;
   }

   @Override
   public boolean gd() {
      return this.gy() == cfr.a.g;
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   @Override
   public boolean D(bsq $$0) {
      if (!this.gd()) {
         this.cs = true;
      }

      return super.D($$0);
   }

   @Override
   public void gf() {
      this.a(avo.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gA()) {
         if (this.dQ().ac() && !this.bf()) {
            this.w(true);
            this.y(false);
         } else if (!this.gn()) {
            this.w(false);
         }
      }

      btl $$0 = this.p();
      if ($$0 == null) {
         this.cr = false;
         this.cs = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avo.sA, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.go() + 1);
         if (this.go() > 20) {
            this.z(false);
            this.gO();
         } else if (this.go() == 1) {
            this.a(avo.su, 1.0F, 1.0F);
         }
      }

      if (this.gw()) {
         this.gN();
      } else {
         this.cb = 0;
      }

      if (this.x()) {
         this.t(0.0F);
      }

      this.gK();
      this.gI();
      this.gL();
      this.gM();
   }

   public boolean gE() {
      return this.gA() && this.dQ().ac();
   }

   private void gI() {
      if (!this.gn() && this.x() && !this.gE() && !this.a(bsx.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsx.a).e() || !this.x()) {
         this.y(false);
      }

      if (this.gn()) {
         this.gJ();
         if (!this.dQ().B && this.gH() > 80 && this.ah.a(20) == 1) {
            if (this.gH() > 100 && this.n(this.a(bsx.a))) {
               if (!this.dQ().B) {
                  this.a(bsx.a, cuo.l);
                  this.a(dxw.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gH() + 1);
      }
   }

   private void gJ() {
      if (this.gH() % 5 == 0) {
         this.a(avo.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eww $$1 = new eww(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dI() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dG() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            eww $$3 = new eww(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dv(), this.dz() + 1.0, this.dB());
            this.dQ().a(new li(lm.S, this.a(bsx.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gK() {
      this.cv = this.cu;
      if (this.x()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gL() {
      this.cx = this.cw;
      if (this.gm()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   private void gM() {
      this.cz = this.cy;
      if (this.gw()) {
         this.cy = Math.min(1.0F, this.cy + 0.15F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.19F);
      }
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cx, this.cw);
   }

   public float J(float $$0) {
      return ayn.i($$0, this.cz, this.cy);
   }

   private void gN() {
      this.cb++;
      if (this.cb > 32) {
         this.A(false);
      } else {
         if (!this.dQ().B) {
            eww $$0 = this.dt();
            if (this.cb == 1) {
               float $$1 = this.dG() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.ct = new eww($$0.c + (double)(-ayn.a($$1) * $$2), 0.0, $$0.e + (double)(ayn.b($$1) * $$2));
               this.i(this.ct.b(0.0, 0.27, 0.0));
            } else if ((float)this.cb != 7.0F && (float)this.cb != 15.0F && (float)this.cb != 23.0F) {
               this.n(this.ct.c, $$0.d, this.ct.e);
            } else {
               this.n(0.0, this.aF() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gO() {
      eww $$0 = this.dt();
      dcu $$1 = this.dQ();
      $$1.a(
         lm.ag,
         this.dv() - (double)(this.dk() + 1.0F) * 0.5 * (double)ayn.a(this.aY * (float) (Math.PI / 180.0)),
         this.dz() - 0.1F,
         this.dB() + (double)(this.dk() + 1.0F) * 0.5 * (double)ayn.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avo.sv, 1.0F, 1.0F);

      for (cfr $$3 : $$1.a(cfr.class, this.cL().g(10.0))) {
         if (!$$3.o_() && $$3.aF() && !$$3.bf() && $$3.gG()) {
            $$3.fg();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dcq.f)) {
         aqt $$4 = (aqt)$$1;
         erq $$5 = $$4.o().be().b(erh.aV);
         ero $$6 = new ero.a($$4).a(euh.f, this.do()).a(euh.a, this).a(eug.j);

         for (cuo $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cjf $$0) {
      if (this.a(bsx.a).e() && cC.test($$0)) {
         this.a($$0);
         cuo $$1 = $$0.p();
         this.a(bsx.a, $$1);
         this.e(bsx.a);
         this.a($$0, $$1.H());
         $$0.aq();
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (!this.dQ().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      this.a(cfr.a.a($$4));
      this.b(cfr.a.a($$4));
      this.gF();
      if ($$3 == null) {
         $$3 = new bsk.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfr $$0, @Nullable cfr $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gP());
            this.b(cfr.a.a(this.ah));
         } else {
            this.a(cfr.a.a(this.ah));
            this.b($$0.gP());
         }
      } else if (this.ah.h()) {
         this.a($$0.gP());
         this.b($$1.gP());
      } else {
         this.a($$1.gP());
         this.b($$0.gP());
      }

      if (this.ah.a(32) == 0) {
         this.a(cfr.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfr.a.a(this.ah));
      }
   }

   private cfr.a gP() {
      return this.ah.h() ? this.gp() : this.gq();
   }

   public void gF() {
      if (this.gD()) {
         this.f(buu.s).a(10.0);
      }

      if (this.gz()) {
         this.f(buu.v).a(0.07F);
      }
   }

   void gQ() {
      if (!this.bf()) {
         this.D(0.0F);
         this.J().n();
         this.w(true);
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (this.gE()) {
         return bqq.e;
      } else if (this.gm()) {
         this.x(false);
         return bqq.a(this.dQ().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cr = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dQ().B && this.g() == 0 && this.gr()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dQ().B || this.x() || this.bf()) {
               return bqq.e;
            }

            this.gQ();
            this.y(true);
            cuo $$3 = this.a(bsx.a);
            if (!$$3.e() && !$$0.fM()) {
               this.b($$3);
            }

            this.a(bsx.a, new cuo($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqq.a;
      } else {
         return bqq.e;
      }
   }

   @Nullable
   @Override
   protected avn v() {
      if (this.gd()) {
         return avo.sB;
      } else {
         return this.gA() ? avo.sC : avo.sw;
      }
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.sz, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.aq);
   }

   private boolean n(cuo $$0) {
      return this.o($$0) || $$0.a(dfy.eg.r());
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.sx;
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.sD;
   }

   public boolean gG() {
      return !this.gm() && !this.gE() && !this.gn() && !this.gw() && !this.x();
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   public static enum a implements azj {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azj.a<cfr.a> h = azj.a(cfr.a::values);
      private static final IntFunction<cfr.a> i = axd.a(cfr.a::a, values(), axd.a.a);
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

      static cfr.a a(cfr.a $$0, cfr.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfr.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfr.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfr.a a(ayv $$0) {
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

   static class b extends cau {
      private final cfr b;

      public b(cfr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gG() && super.b();
      }
   }

   static class c<T extends btl> extends bzr<T> {
      private final cfr i;

      public c(cfr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsv.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gA() && this.i.gG() && super.b();
      }
   }

   static class d extends bzw {
      private final cfr d;
      private int e;

      public d(cfr $$0, double $$1) {
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
               if (this.d.dc()) {
                  cmv $$0 = this.b.a(cfr.cj, this.d);
                  this.d.cB.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jd $$0 = this.d.dq();
         jd.a $$1 = new jd.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dfy.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ccc {
      private final cfr a;

      public e(cfr $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.cr && !this.a.cs) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(btn $$0, btl $$1) {
         if ($$0 instanceof cfr && $$0.gd()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cak {
      private final cfr a;
      private int b;

      public f(cfr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ai && this.a.gz() && this.a.gG() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bf() && (this.a.gz() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.x(false);
         this.b = this.a.ai + 200;
      }
   }

   static class g extends cas {
      private final cfr h;

      public g(cfr $$0, Class<? extends btl> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btl $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dT().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cmv.class) {
                  this.c = this.b.dQ().a(this.g, this.b, this.b.dv(), this.b.dz(), this.b.dB());
               } else {
                  this.c = this.b
                     .dQ()
                     .a(
                        this.b.dQ().a(this.f, this.b.cL().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dv(),
                        this.b.dz(),
                        this.b.dB()
                     );
               }
            }

            return this.h.gG() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends bzn {
      private final cfr l;

      public h(cfr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gG()) {
            super.a();
         }
      }
   }

   static class i extends cbd {
      private final cfr a;

      public i(cfr $$0, double $$1) {
         super($$0, $$1, awf.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.J().n();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cak {
      private final cfr a;

      public j(cfr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.a, cak.a.b, cak.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.o_() || this.a.gB()) && this.a.aF()) {
            if (!this.a.gG()) {
               return false;
            } else {
               float $$0 = this.a.dG() * (float) (Math.PI / 180.0);
               float $$1 = -ayn.a($$0);
               float $$2 = ayn.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayn.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayn.j((double)$$2) : 0;
               if (this.a.dQ().a_(this.a.dq().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gB() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
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

   class k extends cak {
      private int b;

      public k() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cfr.this.ai && !cfr.this.o_() && !cfr.this.bf() && cfr.this.gG() && cfr.this.s() <= 0) {
            List<cjf> $$0 = cfr.this.dQ().a(cjf.class, cfr.this.cL().c(6.0, 6.0, 6.0), cfr.cC);
            return !$$0.isEmpty() || !cfr.this.a(bsx.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cfr.this.bf() && (cfr.this.gz() || cfr.this.ah.a(b(600)) != 1) ? cfr.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cfr.this.x() && !cfr.this.a(bsx.a).e()) {
            cfr.this.gQ();
         }
      }

      @Override
      public void d() {
         List<cjf> $$0 = cfr.this.dQ().a(cjf.class, cfr.this.cL().c(8.0, 8.0, 8.0), cfr.cC);
         if (!$$0.isEmpty() && cfr.this.a(bsx.a).e()) {
            cfr.this.J().a($$0.get(0), 1.2F);
         } else if (!cfr.this.a(bsx.a).e()) {
            cfr.this.gQ();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cuo $$0 = cfr.this.a(bsx.a);
         if (!$$0.e()) {
            cfr.this.b($$0);
            cfr.this.a(bsx.a, cuo.l);
            int $$1 = cfr.this.gz() ? cfr.this.ah.a(50) + 10 : cfr.this.ah.a(150) + 10;
            this.b = cfr.this.ai + $$1 * 20;
         }

         cfr.this.w(false);
      }
   }

   static class l extends cak {
      private final cfr a;

      public l(cfr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.o_() && this.a.gG()) {
            return this.a.gD() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
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
