import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfg extends cer {
   private static final ajp<Integer> cd = ajt.a(cfg.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cfg.class, ajr.b);
   private static final ajp<Integer> cf = ajt.a(cfg.class, ajr.b);
   private static final ajp<Byte> cg = ajt.a(cfg.class, ajr.a);
   private static final ajp<Byte> ch = ajt.a(cfg.class, ajr.a);
   private static final ajp<Byte> ci = ajt.a(cfg.class, ajr.a);
   static final cds cj = cds.b().a(8.0);
   private static final bsj ck = bsm.aw.n().a(0.5F).a(bsi.a().a(bsh.a, 0.0F, 0.40625F, 0.0F));
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
   private ewf ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   cfg.g cB;
   static final Predicate<ciu> cC = $$0 -> {
      cuc $$1 = $$0.p();
      return ($$1.a(dfj.mZ.r()) || $$1.a(dfj.eg.r())) && $$0.bE() && !$$0.y();
   };

   public cfg(bsm<? extends cfg> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new cfg.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cuc $$0) {
      bsn $$1 = btd.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsn.a && super.f($$0);
   }

   public int s() {
      return this.ao.a(cd);
   }

   public void t(int $$0) {
      this.ao.a(cd, $$0);
   }

   public boolean u() {
      return this.w(2);
   }

   public boolean y() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean go() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.ao.a(cf) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cf, $$0 ? 1 : 0);
   }

   private int gJ() {
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

   public int gv() {
      return this.ao.a(ce);
   }

   public void u(int $$0) {
      this.ao.a(ce, $$0);
   }

   public cfg.a gw() {
      return cfg.a.a(this.ao.a(cg));
   }

   public void a(cfg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfg.a.a(this.ah);
      }

      this.ao.a(cg, (byte)$$0.a());
   }

   public cfg.a gx() {
      return cfg.a.a(this.ao.a(ch));
   }

   public void b(cfg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfg.a.a(this.ah);
      }

      this.ao.a(ch, (byte)$$0.a());
   }

   public boolean gy() {
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
      $$0.a("MainGene", this.gw().c());
      $$0.a("HiddenGene", this.gx().c());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfg.a.a($$0.l("MainGene")));
      this.b(cfg.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      cfg $$2 = bsm.aw.a((dcf)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfg $$3) {
            $$2.a(this, $$3);
         }

         $$2.gH();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(2, new cfg.i(this, 2.0));
      this.bU.a(2, new cfg.d(this, 1.0));
      this.bU.a(3, new cfg.b(this, 1.2F, true));
      this.bU.a(4, new cbh(this, 1.0, $$0 -> $$0.a(awf.aq), false));
      this.bU.a(6, new cfg.c<>(this, cmk.class, 8.0F, 2.0, 2.0));
      this.bU.a(6, new cfg.c<>(this, cjq.class, 4.0F, 2.0, 2.0));
      this.bU.a(7, new cfg.k());
      this.bU.a(8, new cfg.f(this));
      this.bU.a(8, new cfg.l(this));
      this.cB = new cfg.g(this, cmk.class, 6.0F);
      this.bU.a(9, this.cB);
      this.bU.a(10, new cau(this));
      this.bU.a(12, new cfg.j(this));
      this.bU.a(13, new bzy(this, 1.25));
      this.bU.a(14, new cbm(this, 1.0));
      this.bV.a(1, new cfg.e(this).a(new Class[0]));
   }

   public static bui.a gz() {
      return btd.A().a(buj.v, 0.15F).a(buj.c, 6.0);
   }

   public cfg.a gA() {
      return cfg.a.a(this.gw(), this.gx());
   }

   public boolean gB() {
      return this.gA() == cfg.a.b;
   }

   public boolean gC() {
      return this.gA() == cfg.a.c;
   }

   public boolean gD() {
      return this.gA() == cfg.a.d;
   }

   public boolean gE() {
      return this.gA() == cfg.a.e;
   }

   public boolean gF() {
      return this.gA() == cfg.a.f;
   }

   @Override
   public boolean gf() {
      return this.gA() == cfg.a.g;
   }

   @Override
   public boolean a(cmk $$0) {
      return false;
   }

   @Override
   public boolean D(bsg $$0) {
      if (!this.gf()) {
         this.cs = true;
      }

      return super.D($$0);
   }

   @Override
   public void gh() {
      this.a(avh.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gC()) {
         if (this.dQ().ac() && !this.bf()) {
            this.w(true);
            this.y(false);
         } else if (!this.gu()) {
            this.w(false);
         }
      }

      btb $$0 = this.p();
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

      if (this.u()) {
         this.u(this.gv() + 1);
         if (this.gv() > 20) {
            this.z(false);
            this.gQ();
         } else if (this.gv() == 1) {
            this.a(avh.su, 1.0F, 1.0F);
         }
      }

      if (this.gy()) {
         this.gP();
      } else {
         this.cb = 0;
      }

      if (this.y()) {
         this.t(0.0F);
      }

      this.gM();
      this.gK();
      this.gN();
      this.gO();
   }

   public boolean gG() {
      return this.gC() && this.dQ().ac();
   }

   private void gK() {
      if (!this.gu() && this.y() && !this.gG() && !this.a(bsn.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsn.a).e() || !this.y()) {
         this.y(false);
      }

      if (this.gu()) {
         this.gL();
         if (!this.dQ().B && this.gJ() > 80 && this.ah.a(20) == 1) {
            if (this.gJ() > 100 && this.n(this.a(bsn.a))) {
               if (!this.dQ().B) {
                  this.a(bsn.a, cuc.l);
                  this.a(dxg.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gJ() + 1);
      }
   }

   private void gL() {
      if (this.gJ() % 5 == 0) {
         this.a(avh.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ewf $$1 = new ewf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dI() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dG() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            ewf $$3 = new ewf(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dv(), this.dz() + 1.0, this.dB());
            this.dQ().a(new lf(lj.S, this.a(bsn.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gM() {
      this.cv = this.cu;
      if (this.y()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gN() {
      this.cx = this.cw;
      if (this.go()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   private void gO() {
      this.cz = this.cy;
      if (this.gy()) {
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

   private void gP() {
      this.cb++;
      if (this.cb > 32) {
         this.A(false);
      } else {
         if (!this.dQ().B) {
            ewf $$0 = this.dt();
            if (this.cb == 1) {
               float $$1 = this.dG() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.ct = new ewf($$0.c + (double)(-ayg.a($$1) * $$2), 0.0, $$0.e + (double)(ayg.b($$1) * $$2));
               this.i(this.ct.b(0.0, 0.27, 0.0));
            } else if ((float)this.cb != 7.0F && (float)this.cb != 15.0F && (float)this.cb != 23.0F) {
               this.o(this.ct.c, $$0.d, this.ct.e);
            } else {
               this.o(0.0, this.aF() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gQ() {
      ewf $$0 = this.dt();
      dcf $$1 = this.dQ();
      $$1.a(
         lj.ag,
         this.dv() - (double)(this.dk() + 1.0F) * 0.5 * (double)ayg.a(this.aY * (float) (Math.PI / 180.0)),
         this.dz() - 0.1F,
         this.dB() + (double)(this.dk() + 1.0F) * 0.5 * (double)ayg.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avh.sv, 1.0F, 1.0F);

      for (cfg $$3 : $$1.a(cfg.class, this.cL().g(10.0))) {
         if (!$$3.p_() && $$3.aF() && !$$3.bf() && $$3.gI()) {
            $$3.fg();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dcb.f)) {
         aqm $$4 = (aqm)$$1;
         eqz $$5 = $$4.o().bf().b(eqq.aV);
         eqx $$6 = new eqx.a($$4).a(etq.f, this.do()).a(etq.a, this).a(etp.j);

         for (cuc $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(ciu $$0) {
      if (this.a(bsn.a).e() && cC.test($$0)) {
         this.a($$0);
         cuc $$1 = $$0.p();
         this.a(bsn.a, $$1);
         this.f(bsn.a);
         this.a($$0, $$1.H());
         $$0.ap();
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (!this.dQ().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      this.a(cfg.a.a($$4));
      this.b(cfg.a.a($$4));
      this.gH();
      if ($$3 == null) {
         $$3 = new bsa.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfg $$0, @Nullable cfg $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gR());
            this.b(cfg.a.a(this.ah));
         } else {
            this.a(cfg.a.a(this.ah));
            this.b($$0.gR());
         }
      } else if (this.ah.h()) {
         this.a($$0.gR());
         this.b($$1.gR());
      } else {
         this.a($$1.gR());
         this.b($$0.gR());
      }

      if (this.ah.a(32) == 0) {
         this.a(cfg.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfg.a.a(this.ah));
      }
   }

   private cfg.a gR() {
      return this.ah.h() ? this.gw() : this.gx();
   }

   public void gH() {
      if (this.gF()) {
         this.f(buj.s).a(10.0);
      }

      if (this.gB()) {
         this.f(buj.v).a(0.07F);
      }
   }

   void gS() {
      if (!this.bf()) {
         this.D(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (this.gG()) {
         return bqg.e;
      } else if (this.go()) {
         this.x(false);
         return bqg.a(this.dQ().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cr = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dQ().B && this.g() == 0 && this.gp()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dQ().B || this.y() || this.bf()) {
               return bqg.e;
            }

            this.gS();
            this.y(true);
            cuc $$3 = this.a(bsn.a);
            if (!$$3.e() && !$$0.fM()) {
               this.b($$3);
            }

            this.a(bsn.a, new cuc($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqg.a;
      } else {
         return bqg.e;
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.gf()) {
         return avh.sB;
      } else {
         return this.gC() ? avh.sC : avh.sw;
      }
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.sz, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.aq);
   }

   private boolean n(cuc $$0) {
      return this.o($$0) || $$0.a(dfj.eg.r());
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.sx;
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return avh.sD;
   }

   public boolean gI() {
      return !this.go() && !this.gG() && !this.gu() && !this.gy() && !this.y();
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   public static enum a implements azc {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azc.a<cfg.a> h = azc.a(cfg.a::values);
      private static final IntFunction<cfg.a> i = aww.a(cfg.a::a, values(), aww.a.a);
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

      static cfg.a a(cfg.a $$0, cfg.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfg.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfg.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfg.a a(ayo $$0) {
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

   static class b extends caj {
      private final cfg b;

      public b(cfg $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gI() && super.a();
      }
   }

   static class c<T extends btb> extends bzg<T> {
      private final cfg i;

      public c(cfg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsl.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gC() && this.i.gI() && super.a();
      }
   }

   static class d extends bzl {
      private final cfg d;
      private int e;

      public d(cfg $$0, double $$1) {
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
               if (this.d.dc()) {
                  cmk $$0 = this.b.a(cfg.cj, this.d);
                  this.d.cB.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ja $$0 = this.d.dq();
         ja.a $$1 = new ja.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dfj.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cbr {
      private final cfg a;

      public e(cfg $$0, Class<?>... $$1) {
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
      protected void a(btd $$0, btb $$1) {
         if ($$0 instanceof cfg && $$0.gf()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bzz {
      private final cfg a;
      private int b;

      public f(cfg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gB() && this.a.gI() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bf() && (this.a.gB() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
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

   static class g extends cah {
      private final cfg h;

      public g(cfg $$0, Class<? extends btb> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btb $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.dT().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cmk.class) {
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

            return this.h.gI() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bzc {
      private final cfg l;

      public h(cfg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gI()) {
            super.a();
         }
      }
   }

   static class i extends cas {
      private final cfg h;

      public i(cfg $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dF() || this.b.bR();
      }

      @Override
      public boolean b() {
         if (this.h.y()) {
            this.h.K().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bzz {
      private final cfg a;

      public j(cfg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b, bzz.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gD()) && this.a.aF()) {
            if (!this.a.gI()) {
               return false;
            } else {
               float $$0 = this.a.dG() * (float) (Math.PI / 180.0);
               float $$1 = -ayg.a($$0);
               float $$2 = ayg.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayg.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayg.j((double)$$2) : 0;
               if (this.a.dQ().a_(this.a.dq().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gD() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
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

   class k extends bzz {
      private int b;

      public k() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cfg.this.ai && !cfg.this.p_() && !cfg.this.bf() && cfg.this.gI() && cfg.this.s() <= 0) {
            List<ciu> $$0 = cfg.this.dQ().a(ciu.class, cfg.this.cL().c(6.0, 6.0, 6.0), cfg.cC);
            return !$$0.isEmpty() || !cfg.this.a(bsn.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cfg.this.bf() && (cfg.this.gB() || cfg.this.ah.a(b(600)) != 1) ? cfg.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cfg.this.y() && !cfg.this.a(bsn.a).e()) {
            cfg.this.gS();
         }
      }

      @Override
      public void c() {
         List<ciu> $$0 = cfg.this.dQ().a(ciu.class, cfg.this.cL().c(8.0, 8.0, 8.0), cfg.cC);
         if (!$$0.isEmpty() && cfg.this.a(bsn.a).e()) {
            cfg.this.K().a($$0.get(0), 1.2F);
         } else if (!cfg.this.a(bsn.a).e()) {
            cfg.this.gS();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuc $$0 = cfg.this.a(bsn.a);
         if (!$$0.e()) {
            cfg.this.b($$0);
            cfg.this.a(bsn.a, cuc.l);
            int $$1 = cfg.this.gB() ? cfg.this.ah.a(50) + 10 : cfg.this.ah.a(150) + 10;
            this.b = cfg.this.ai + $$1 * 20;
         }

         cfg.this.w(false);
      }
   }

   static class l extends bzz {
      private final cfg a;

      public l(cfg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.p_() && this.a.gI()) {
            return this.a.gF() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
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
