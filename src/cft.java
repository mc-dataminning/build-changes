import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cft extends cfe {
   private static final ajw<Integer> cc = aka.a(cft.class, ajy.b);
   private static final ajw<Integer> ce = aka.a(cft.class, ajy.b);
   private static final ajw<Integer> cf = aka.a(cft.class, ajy.b);
   private static final ajw<Byte> cg = aka.a(cft.class, ajy.a);
   private static final ajw<Byte> ch = aka.a(cft.class, ajy.a);
   private static final ajw<Byte> ci = aka.a(cft.class, ajy.a);
   static final cef cj = cef.b().a(8.0);
   private static final bsu ck = bsx.aw.n().a(0.5F).a(bst.a().a(bss.a, 0.0F, 0.40625F, 0.0F));
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
   private exa ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   cft.g cB;
   static final Predicate<cjh> cC = $$0 -> {
      cuq $$1 = $$0.p();
      return ($$1.a(dga.mZ.r()) || $$1.a(dga.eg.r())) && $$0.bE() && !$$0.y();
   };

   public cft(bsx<? extends cft> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new cft.h(this);
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

   public boolean gl() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gm() {
      return this.ao.a(cf) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cf, $$0 ? 1 : 0);
   }

   private int gG() {
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

   public int gn() {
      return this.ao.a(ce);
   }

   public void u(int $$0) {
      this.ao.a(ce, $$0);
   }

   public cft.a go() {
      return cft.a.a(this.ao.a(cg));
   }

   public void a(cft.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cft.a.a(this.ah);
      }

      this.ao.a(cg, (byte)$$0.a());
   }

   public cft.a gp() {
      return cft.a.a(this.ao.a(ch));
   }

   public void b(cft.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cft.a.a(this.ah);
      }

      this.ao.a(ch, (byte)$$0.a());
   }

   public boolean gv() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
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
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("MainGene", this.go().c());
      $$0.a("HiddenGene", this.gp().c());
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

         $$2.gE();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(2, new cft.i(this, 2.0));
      this.bU.a(2, new cft.d(this, 1.0));
      this.bU.a(3, new cft.b(this, 1.2F, true));
      this.bU.a(4, new cbu(this, 1.0, $$0 -> $$0.a(awn.aq), false));
      this.bU.a(6, new cft.c<>(this, cmx.class, 8.0F, 2.0, 2.0));
      this.bU.a(6, new cft.c<>(this, ckd.class, 4.0F, 2.0, 2.0));
      this.bU.a(7, new cft.k());
      this.bU.a(8, new cft.f(this));
      this.bU.a(8, new cft.l(this));
      this.cB = new cft.g(this, cmx.class, 6.0F);
      this.bU.a(9, this.cB);
      this.bU.a(10, new cbh(this));
      this.bU.a(12, new cft.j(this));
      this.bU.a(13, new cal(this, 1.25));
      this.bU.a(14, new cbz(this, 1.0));
      this.bV.a(1, new cft.e(this).a(new Class[0]));
   }

   public static buv.a gw() {
      return btp.C().a(buw.v, 0.15F).a(buw.c, 6.0);
   }

   public cft.a gx() {
      return cft.a.a(this.go(), this.gp());
   }

   public boolean gy() {
      return this.gx() == cft.a.b;
   }

   public boolean gz() {
      return this.gx() == cft.a.c;
   }

   public boolean gA() {
      return this.gx() == cft.a.d;
   }

   public boolean gB() {
      return this.gx() == cft.a.e;
   }

   public boolean gC() {
      return this.gx() == cft.a.f;
   }

   @Override
   public boolean gc() {
      return this.gx() == cft.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean D(bsr $$0) {
      if (!this.gc()) {
         this.cs = true;
      }

      return super.D($$0);
   }

   @Override
   public void ge() {
      this.a(avp.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gz()) {
         if (this.dP().ac() && !this.bf()) {
            this.w(true);
            this.y(false);
         } else if (!this.gm()) {
            this.w(false);
         }
      }

      btn $$0 = this.p();
      if ($$0 == null) {
         this.cr = false;
         this.cs = false;
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
         this.u(this.gn() + 1);
         if (this.gn() > 20) {
            this.z(false);
            this.gN();
         } else if (this.gn() == 1) {
            this.a(avp.su, 1.0F, 1.0F);
         }
      }

      if (this.gv()) {
         this.gM();
      } else {
         this.cb = 0;
      }

      if (this.x()) {
         this.u(0.0F);
      }

      this.gJ();
      this.gH();
      this.gK();
      this.gL();
   }

   public boolean gD() {
      return this.gz() && this.dP().ac();
   }

   private void gH() {
      if (!this.gm() && this.x() && !this.gD() && !this.a(bsy.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsy.a).e() || !this.x()) {
         this.y(false);
      }

      if (this.gm()) {
         this.gI();
         if (!this.dP().B && this.gG() > 80 && this.ah.a(20) == 1) {
            if (this.gG() > 100 && this.n(this.a(bsy.a))) {
               if (!this.dP().B) {
                  this.a(bsy.a, cuq.l);
                  this.a(dxz.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gG() + 1);
      }
   }

   private void gI() {
      if (this.gG() % 5 == 0) {
         this.a(avp.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            exa $$1 = new exa(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dH() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dF() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            exa $$3 = new exa(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.du(), this.dy() + 1.0, this.dA());
            this.dP().a(new li(lm.S, this.a(bsy.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gJ() {
      this.cv = this.cu;
      if (this.x()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gK() {
      this.cx = this.cw;
      if (this.gl()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   private void gL() {
      this.cz = this.cy;
      if (this.gv()) {
         this.cy = Math.min(1.0F, this.cy + 0.15F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.19F);
      }
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cx, this.cw);
   }

   public float J(float $$0) {
      return ayo.i($$0, this.cz, this.cy);
   }

   private void gM() {
      this.cb++;
      if (this.cb > 32) {
         this.A(false);
      } else {
         if (!this.dP().B) {
            exa $$0 = this.ds();
            if (this.cb == 1) {
               float $$1 = this.dF() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.ct = new exa($$0.c + (double)(-ayo.a($$1) * $$2), 0.0, $$0.e + (double)(ayo.b($$1) * $$2));
               this.i(this.ct.b(0.0, 0.27, 0.0));
            } else if ((float)this.cb != 7.0F && (float)this.cb != 15.0F && (float)this.cb != 23.0F) {
               this.n(this.ct.c, $$0.d, this.ct.e);
            } else {
               this.n(0.0, this.aF() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gN() {
      exa $$0 = this.ds();
      dcw $$1 = this.dP();
      $$1.a(
         lm.ag,
         this.du() - (double)(this.dk() + 1.0F) * 0.5 * (double)ayo.a(this.aY * (float) (Math.PI / 180.0)),
         this.dy() - 0.1F,
         this.dA() + (double)(this.dk() + 1.0F) * 0.5 * (double)ayo.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avp.sv, 1.0F, 1.0F);

      for (cft $$3 : $$1.a(cft.class, this.cL().g(10.0))) {
         if (!$$3.o_() && $$3.aF() && !$$3.bf() && $$3.gF()) {
            $$3.fg();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dcs.f)) {
         aqu $$4 = (aqu)$$1;
         eru $$5 = $$4.o().be().b(erl.aV);
         ers $$6 = new ers.a($$4).a(eul.f, this.dn()).a(eul.a, this).a(euk.j);

         for (cuq $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cjh $$0) {
      if (this.a(bsy.a).e() && cC.test($$0)) {
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
      if (!this.dP().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.a(cft.a.a($$4));
      this.b(cft.a.a($$4));
      this.gE();
      if ($$3 == null) {
         $$3 = new bsl.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cft $$0, @Nullable cft $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gO());
            this.b(cft.a.a(this.ah));
         } else {
            this.a(cft.a.a(this.ah));
            this.b($$0.gO());
         }
      } else if (this.ah.h()) {
         this.a($$0.gO());
         this.b($$1.gO());
      } else {
         this.a($$1.gO());
         this.b($$0.gO());
      }

      if (this.ah.a(32) == 0) {
         this.a(cft.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cft.a.a(this.ah));
      }
   }

   private cft.a gO() {
      return this.ah.h() ? this.go() : this.gp();
   }

   public void gE() {
      if (this.gC()) {
         this.f(buw.s).a(10.0);
      }

      if (this.gy()) {
         this.f(buw.v).a(0.07F);
      }
   }

   void gP() {
      if (!this.bf()) {
         this.E(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.gD()) {
         return bqr.e;
      } else if (this.gl()) {
         this.x(false);
         return bqr.a(this.dP().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cr = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dP().B && this.g() == 0 && this.gq()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dP().B || this.x() || this.bf()) {
               return bqr.e;
            }

            this.gP();
            this.y(true);
            cuq $$3 = this.a(bsy.a);
            if (!$$3.e() && !$$0.fM()) {
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
      if (this.gc()) {
         return avp.sB;
      } else {
         return this.gz() ? avp.sC : avp.sw;
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

   public boolean gF() {
      return !this.gl() && !this.gD() && !this.gm() && !this.gv() && !this.x();
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ck : super.e($$0);
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
         return this.b.gF() && super.b();
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
         return this.i.gz() && this.i.gF() && super.b();
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
               if (this.d.dc()) {
                  cmx $$0 = this.b.a(cft.cj, this.d);
                  this.d.cB.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jd $$0 = this.d.dp();
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
         if (!this.a.cr && !this.a.cs) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cft && $$0.gc()) {
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
         return this.b < this.a.ai && this.a.gy() && this.a.gF() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bf() && (this.a.gy() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
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
         if (this.b.dS().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cmx.class) {
                  this.c = this.b.dP().a(this.g, this.b, this.b.du(), this.b.dy(), this.b.dA());
               } else {
                  this.c = this.b
                     .dP()
                     .a(
                        this.b.dP().a(this.f, this.b.cL().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.du(),
                        this.b.dy(),
                        this.b.dA()
                     );
               }
            }

            return this.h.gF() && this.c != null;
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
         if (this.l.gF()) {
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
         if ((this.a.o_() || this.a.gA()) && this.a.aF()) {
            if (!this.a.gF()) {
               return false;
            } else {
               float $$0 = this.a.dF() * (float) (Math.PI / 180.0);
               float $$1 = -ayo.a($$0);
               float $$2 = ayo.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayo.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayo.j((double)$$2) : 0;
               if (this.a.dP().a_(this.a.dp().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gA() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
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

   class k extends cam {
      private int b;

      public k() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cft.this.ai && !cft.this.o_() && !cft.this.bf() && cft.this.gF() && cft.this.s() <= 0) {
            List<cjh> $$0 = cft.this.dP().a(cjh.class, cft.this.cL().c(6.0, 6.0, 6.0), cft.cC);
            return !$$0.isEmpty() || !cft.this.a(bsy.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cft.this.bf() && (cft.this.gy() || cft.this.ah.a(b(600)) != 1) ? cft.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cft.this.x() && !cft.this.a(bsy.a).e()) {
            cft.this.gP();
         }
      }

      @Override
      public void d() {
         List<cjh> $$0 = cft.this.dP().a(cjh.class, cft.this.cL().c(8.0, 8.0, 8.0), cft.cC);
         if (!$$0.isEmpty() && cft.this.a(bsy.a).e()) {
            cft.this.N().a($$0.get(0), 1.2F);
         } else if (!cft.this.a(bsy.a).e()) {
            cft.this.gP();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cuq $$0 = cft.this.a(bsy.a);
         if (!$$0.e()) {
            cft.this.b($$0);
            cft.this.a(bsy.a, cuq.l);
            int $$1 = cft.this.gy() ? cft.this.ah.a(50) + 10 : cft.this.ah.a(150) + 10;
            this.b = cft.this.ai + $$1 * 20;
         }

         cft.this.w(false);
      }
   }

   static class l extends cam {
      private final cft a;

      public l(cft $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.o_() && this.a.gF()) {
            return this.a.gC() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
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
