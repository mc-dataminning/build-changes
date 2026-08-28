import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends ces {
   private static final ajp<Integer> cd = ajt.a(cfh.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cfh.class, ajr.b);
   private static final ajp<Integer> cf = ajt.a(cfh.class, ajr.b);
   private static final ajp<Byte> cg = ajt.a(cfh.class, ajr.a);
   private static final ajp<Byte> ch = ajt.a(cfh.class, ajr.a);
   private static final ajp<Byte> ci = ajt.a(cfh.class, ajr.a);
   static final cdt cj = cdt.b().a(8.0);
   private static final bsk ck = bsn.aw.n().a(0.5F).a(bsj.a().a(bsi.a, 0.0F, 0.40625F, 0.0F));
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
   private ewh ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   cfh.g cA;
   static final Predicate<civ> cC = $$0 -> {
      cud $$1 = $$0.p();
      return ($$1.a(dfk.mZ.r()) || $$1.a(dfk.eg.r())) && $$0.bF() && !$$0.y();
   };

   public cfh(bsn<? extends cfh> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new cfh.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bso.a && super.f($$0);
   }

   public int s() {
      return this.ao.a(cd);
   }

   public void t(int $$0) {
      this.ao.a(cd, $$0);
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

   public boolean gn() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.ao.a(cf) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cf, $$0 ? 1 : 0);
   }

   private int gI() {
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

   public int gu() {
      return this.ao.a(ce);
   }

   public void u(int $$0) {
      this.ao.a(ce, $$0);
   }

   public cfh.a gv() {
      return cfh.a.a(this.ao.a(cg));
   }

   public void a(cfh.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfh.a.a(this.ah);
      }

      this.ao.a(cg, (byte)$$0.a());
   }

   public cfh.a gw() {
      return cfh.a.a(this.ao.a(ch));
   }

   public void b(cfh.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfh.a.a(this.ah);
      }

      this.ao.a(ch, (byte)$$0.a());
   }

   public boolean gx() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gv().c());
      $$0.a("HiddenGene", this.gw().c());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfh.a.a($$0.l("MainGene")));
      this.b(cfh.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      cfh $$2 = bsn.aw.a((dcg)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfh $$3) {
            $$2.a(this, $$3);
         }

         $$2.gG();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(2, new cfh.i(this, 2.0));
      this.bU.a(2, new cfh.d(this, 1.0));
      this.bU.a(3, new cfh.b(this, 1.2F, true));
      this.bU.a(4, new cbi(this, 1.0, $$0 -> $$0.a(awf.aq), false));
      this.bU.a(6, new cfh.c<>(this, cml.class, 8.0F, 2.0, 2.0));
      this.bU.a(6, new cfh.c<>(this, cjr.class, 4.0F, 2.0, 2.0));
      this.bU.a(7, new cfh.k());
      this.bU.a(8, new cfh.f(this));
      this.bU.a(8, new cfh.l(this));
      this.cA = new cfh.g(this, cml.class, 6.0F);
      this.bU.a(9, this.cA);
      this.bU.a(10, new cav(this));
      this.bU.a(12, new cfh.j(this));
      this.bU.a(13, new bzz(this, 1.25));
      this.bU.a(14, new cbn(this, 1.0));
      this.bV.a(1, new cfh.e(this).a(new Class[0]));
   }

   public static buj.a gy() {
      return bte.A().a(buk.v, 0.15F).a(buk.c, 6.0);
   }

   public cfh.a gz() {
      return cfh.a.a(this.gv(), this.gw());
   }

   public boolean gA() {
      return this.gz() == cfh.a.b;
   }

   public boolean gB() {
      return this.gz() == cfh.a.c;
   }

   public boolean gC() {
      return this.gz() == cfh.a.d;
   }

   public boolean gD() {
      return this.gz() == cfh.a.e;
   }

   public boolean gE() {
      return this.gz() == cfh.a.f;
   }

   @Override
   public boolean ge() {
      return this.gz() == cfh.a.g;
   }

   @Override
   public boolean a(cml $$0) {
      return false;
   }

   @Override
   public boolean D(bsh $$0) {
      if (!this.ge()) {
         this.cs = true;
      }

      return super.D($$0);
   }

   @Override
   public void gg() {
      this.a(avh.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gB()) {
         if (this.dR().ac() && !this.bg()) {
            this.w(true);
            this.y(false);
         } else if (!this.gt()) {
            this.w(false);
         }
      }

      btc $$0 = this.p();
      if ($$0 == null) {
         this.cr = false;
         this.cs = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avh.sA, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.gu() + 1);
         if (this.gu() > 20) {
            this.z(false);
            this.gP();
         } else if (this.gu() == 1) {
            this.a(avh.su, 1.0F, 1.0F);
         }
      }

      if (this.gx()) {
         this.gO();
      } else {
         this.cb = 0;
      }

      if (this.x()) {
         this.t(0.0F);
      }

      this.gL();
      this.gJ();
      this.gM();
      this.gN();
   }

   public boolean gF() {
      return this.gB() && this.dR().ac();
   }

   private void gJ() {
      if (!this.gt() && this.x() && !this.gF() && !this.a(bso.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bso.a).e() || !this.x()) {
         this.y(false);
      }

      if (this.gt()) {
         this.gK();
         if (!this.dR().B && this.gI() > 80 && this.ah.a(20) == 1) {
            if (this.gI() > 100 && this.n(this.a(bso.a))) {
               if (!this.dR().B) {
                  this.a(bso.a, cud.l);
                  this.a(dxh.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gI() + 1);
      }
   }

   private void gK() {
      if (this.gI() % 5 == 0) {
         this.a(avh.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ewh $$1 = new ewh(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dJ() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dH() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            ewh $$3 = new ewh(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aZ * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dw(), this.dA() + 1.0, this.dC());
            this.dR().a(new lf(lj.S, this.a(bso.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gL() {
      this.cv = this.cu;
      if (this.x()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gM() {
      this.cx = this.cw;
      if (this.gn()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   private void gN() {
      this.cz = this.cy;
      if (this.gx()) {
         this.cy = Math.min(1.0F, this.cy + 0.15F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.19F);
      }
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cx, this.cw);
   }

   public float J(float $$0) {
      return ayg.i($$0, this.cz, this.cy);
   }

   private void gO() {
      this.cb++;
      if (this.cb > 32) {
         this.A(false);
      } else {
         if (!this.dR().B) {
            ewh $$0 = this.du();
            if (this.cb == 1) {
               float $$1 = this.dH() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.ct = new ewh($$0.c + (double)(-ayg.a($$1) * $$2), 0.0, $$0.e + (double)(ayg.b($$1) * $$2));
               this.j(this.ct.b(0.0, 0.27, 0.0));
            } else if ((float)this.cb != 7.0F && (float)this.cb != 15.0F && (float)this.cb != 23.0F) {
               this.o(this.ct.c, $$0.d, this.ct.e);
            } else {
               this.o(0.0, this.aG() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gP() {
      ewh $$0 = this.du();
      dcg $$1 = this.dR();
      $$1.a(
         lj.ag,
         this.dw() - (double)(this.dl() + 1.0F) * 0.5 * (double)ayg.a(this.aZ * (float) (Math.PI / 180.0)),
         this.dA() - 0.1F,
         this.dC() + (double)(this.dl() + 1.0F) * 0.5 * (double)ayg.b(this.aZ * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avh.sv, 1.0F, 1.0F);

      for (cfh $$3 : $$1.a(cfh.class, this.cM().g(10.0))) {
         if (!$$3.o_() && $$3.aG() && !$$3.bg() && $$3.gH()) {
            $$3.fh();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dcc.f)) {
         aqm $$4 = (aqm)$$1;
         erb $$5 = $$4.o().bf().b(eqs.aV);
         eqz $$6 = new eqz.a($$4).a(ets.f, this.dp()).a(ets.a, this).a(etr.j);

         for (cud $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(civ $$0) {
      if (this.a(bso.a).e() && cC.test($$0)) {
         this.a($$0);
         cud $$1 = $$0.p();
         this.a(bso.a, $$1);
         this.e(bso.a);
         this.a($$0, $$1.H());
         $$0.aq();
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (!this.dR().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      this.a(cfh.a.a($$4));
      this.b(cfh.a.a($$4));
      this.gG();
      if ($$3 == null) {
         $$3 = new bsb.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfh $$0, @Nullable cfh $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gQ());
            this.b(cfh.a.a(this.ah));
         } else {
            this.a(cfh.a.a(this.ah));
            this.b($$0.gQ());
         }
      } else if (this.ah.h()) {
         this.a($$0.gQ());
         this.b($$1.gQ());
      } else {
         this.a($$1.gQ());
         this.b($$0.gQ());
      }

      if (this.ah.a(32) == 0) {
         this.a(cfh.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfh.a.a(this.ah));
      }
   }

   private cfh.a gQ() {
      return this.ah.h() ? this.gv() : this.gw();
   }

   public void gG() {
      if (this.gE()) {
         this.f(buk.s).a(10.0);
      }

      if (this.gA()) {
         this.f(buk.v).a(0.07F);
      }
   }

   void gR() {
      if (!this.bg()) {
         this.D(0.0F);
         this.J().n();
         this.w(true);
      }
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (this.gF()) {
         return bqh.e;
      } else if (this.gn()) {
         this.x(false);
         return bqh.a(this.dR().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cr = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dR().B && this.g() == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dR().B || this.x() || this.bg()) {
               return bqh.e;
            }

            this.gR();
            this.y(true);
            cud $$3 = this.a(bso.a);
            if (!$$3.e() && !$$0.fN()) {
               this.b($$3);
            }

            this.a(bso.a, new cud($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqh.a;
      } else {
         return bqh.e;
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.ge()) {
         return avh.sB;
      } else {
         return this.gB() ? avh.sC : avh.sw;
      }
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.sz, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.aq);
   }

   private boolean n(cud $$0) {
      return this.o($$0) || $$0.a(dfk.eg.r());
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.sx;
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.sD;
   }

   public boolean gH() {
      return !this.gn() && !this.gF() && !this.gt() && !this.gx() && !this.x();
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   public static enum a implements azc {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azc.a<cfh.a> h = azc.a(cfh.a::values);
      private static final IntFunction<cfh.a> i = aww.a(cfh.a::a, values(), aww.a.a);
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

      static cfh.a a(cfh.a $$0, cfh.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfh.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfh.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfh.a a(ayo $$0) {
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

   static class b extends cak {
      private final cfh b;

      public b(cfh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gH() && super.a();
      }
   }

   static class c<T extends btc> extends bzh<T> {
      private final cfh i;

      public c(cfh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsm.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gB() && this.i.gH() && super.a();
      }
   }

   static class d extends bzm {
      private final cfh d;
      private int e;

      public d(cfh $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.s() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ai) {
               this.d.t(32);
               this.e = this.d.ai + 600;
               if (this.d.dd()) {
                  cml $$0 = this.b.a(cfh.cj, this.d);
                  this.d.cA.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ja $$0 = this.d.dr();
         ja.a $$1 = new ja.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dfk.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cbs {
      private final cfh a;

      public e(cfh $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cr && !this.a.cs) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bte $$0, btc $$1) {
         if ($$0 instanceof cfh && $$0.ge()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends caa {
      private final cfh a;
      private int b;

      public f(cfh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gA() && this.a.gH() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bg() && (this.a.gA() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ai + 200;
      }
   }

   static class g extends cai {
      private final cfh h;

      public g(cfh $$0, Class<? extends btc> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btc $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.dU().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cml.class) {
                  this.c = this.b.dR().a(this.g, this.b, this.b.dw(), this.b.dA(), this.b.dC());
               } else {
                  this.c = this.b
                     .dR()
                     .a(
                        this.b.dR().a(this.f, this.b.cM().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dw(),
                        this.b.dA(),
                        this.b.dC()
                     );
               }
            }

            return this.h.gH() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bzd {
      private final cfh l;

      public h(cfh $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gH()) {
            super.a();
         }
      }
   }

   static class i extends cat {
      private final cfh h;

      public i(cfh $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dG() || this.b.bS();
      }

      @Override
      public boolean b() {
         if (this.h.x()) {
            this.h.J().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends caa {
      private final cfh a;

      public j(cfh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.a, caa.a.b, caa.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gC()) && this.a.aG()) {
            if (!this.a.gH()) {
               return false;
            } else {
               float $$0 = this.a.dH() * (float) (Math.PI / 180.0);
               float $$1 = -ayg.a($$0);
               float $$2 = ayg.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayg.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayg.j((double)$$2) : 0;
               if (this.a.dR().a_(this.a.dr().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gC() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.A(true);
      }

      @Override
      public boolean Q_() {
         return false;
      }
   }

   class k extends caa {
      private int b;

      public k() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cfh.this.ai && !cfh.this.o_() && !cfh.this.bg() && cfh.this.gH() && cfh.this.s() <= 0) {
            List<civ> $$0 = cfh.this.dR().a(civ.class, cfh.this.cM().c(6.0, 6.0, 6.0), cfh.cC);
            return !$$0.isEmpty() || !cfh.this.a(bso.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cfh.this.bg() && (cfh.this.gA() || cfh.this.ah.a(b(600)) != 1) ? cfh.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cfh.this.x() && !cfh.this.a(bso.a).e()) {
            cfh.this.gR();
         }
      }

      @Override
      public void c() {
         List<civ> $$0 = cfh.this.dR().a(civ.class, cfh.this.cM().c(8.0, 8.0, 8.0), cfh.cC);
         if (!$$0.isEmpty() && cfh.this.a(bso.a).e()) {
            cfh.this.J().a($$0.get(0), 1.2F);
         } else if (!cfh.this.a(bso.a).e()) {
            cfh.this.gR();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cud $$0 = cfh.this.a(bso.a);
         if (!$$0.e()) {
            cfh.this.b($$0);
            cfh.this.a(bso.a, cud.l);
            int $$1 = cfh.this.gA() ? cfh.this.ah.a(50) + 10 : cfh.this.ah.a(150) + 10;
            this.b = cfh.this.ai + $$1 * 20;
         }

         cfh.this.w(false);
      }
   }

   static class l extends caa {
      private final cfh a;

      public l(cfh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gH()) {
            return this.a.gE() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.z(true);
      }
   }
}
