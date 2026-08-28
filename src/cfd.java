import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfd extends ceo {
   private static final ajp<Integer> cd = ajt.a(cfd.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cfd.class, ajr.b);
   private static final ajp<Integer> cf = ajt.a(cfd.class, ajr.b);
   private static final ajp<Byte> cg = ajt.a(cfd.class, ajr.a);
   private static final ajp<Byte> ch = ajt.a(cfd.class, ajr.a);
   private static final ajp<Byte> ci = ajt.a(cfd.class, ajr.a);
   static final cdp cj = cdp.b().a(8.0);
   private static final bsg ck = bsj.aw.n().a(0.5F).a(bsf.a().a(bse.a, 0.0F, 0.40625F, 0.0F));
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
   private evz ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;
   cfd.g cB;
   static final Predicate<cir> cC = $$0 -> {
      cua $$1 = $$0.p();
      return ($$1.a(dfh.mZ.r()) || $$1.a(dfh.eg.r())) && $$0.bD() && !$$0.y();
   };

   public cfd(bsj<? extends cfd> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new cfd.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cua $$0) {
      bsk $$1 = bta.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsk.a && super.f($$0);
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

   public cfd.a gv() {
      return cfd.a.a(this.ao.a(cg));
   }

   public void a(cfd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfd.a.a(this.ah);
      }

      this.ao.a(cg, (byte)$$0.a());
   }

   public cfd.a gw() {
      return cfd.a.a(this.ao.a(ch));
   }

   public void b(cfd.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfd.a.a(this.ah);
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
      this.a(cfd.a.a($$0.l("MainGene")));
      this.b(cfd.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      cfd $$2 = bsj.aw.a((dcd)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfd $$3) {
            $$2.a(this, $$3);
         }

         $$2.gG();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(2, new cfd.i(this, 2.0));
      this.bU.a(2, new cfd.d(this, 1.0));
      this.bU.a(3, new cfd.b(this, 1.2F, true));
      this.bU.a(4, new cbe(this, 1.0, $$0 -> $$0.a(awd.aq), false));
      this.bU.a(6, new cfd.c<>(this, cmh.class, 8.0F, 2.0, 2.0));
      this.bU.a(6, new cfd.c<>(this, cjn.class, 4.0F, 2.0, 2.0));
      this.bU.a(7, new cfd.k());
      this.bU.a(8, new cfd.f(this));
      this.bU.a(8, new cfd.l(this));
      this.cB = new cfd.g(this, cmh.class, 6.0F);
      this.bU.a(9, this.cB);
      this.bU.a(10, new car(this));
      this.bU.a(12, new cfd.j(this));
      this.bU.a(13, new bzv(this, 1.25));
      this.bU.a(14, new cbj(this, 1.0));
      this.bV.a(1, new cfd.e(this).a(new Class[0]));
   }

   public static buf.a gy() {
      return bta.A().a(bug.v, 0.15F).a(bug.c, 6.0);
   }

   public cfd.a gz() {
      return cfd.a.a(this.gv(), this.gw());
   }

   public boolean gA() {
      return this.gz() == cfd.a.b;
   }

   public boolean gB() {
      return this.gz() == cfd.a.c;
   }

   public boolean gC() {
      return this.gz() == cfd.a.d;
   }

   public boolean gD() {
      return this.gz() == cfd.a.e;
   }

   public boolean gE() {
      return this.gz() == cfd.a.f;
   }

   @Override
   public boolean ge() {
      return this.gz() == cfd.a.g;
   }

   @Override
   public boolean a(cmh $$0) {
      return false;
   }

   @Override
   public boolean D(bsd $$0) {
      if (!this.ge()) {
         this.cs = true;
      }

      return super.D($$0);
   }

   @Override
   public void gg() {
      this.a(avf.sE, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gB()) {
         if (this.dP().ac() && !this.be()) {
            this.w(true);
            this.y(false);
         } else if (!this.gt()) {
            this.w(false);
         }
      }

      bsy $$0 = this.p();
      if ($$0 == null) {
         this.cr = false;
         this.cs = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avf.sA, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.u()) {
         this.u(this.gu() + 1);
         if (this.gu() > 20) {
            this.z(false);
            this.gP();
         } else if (this.gu() == 1) {
            this.a(avf.su, 1.0F, 1.0F);
         }
      }

      if (this.gx()) {
         this.gO();
      } else {
         this.cb = 0;
      }

      if (this.y()) {
         this.t(0.0F);
      }

      this.gL();
      this.gJ();
      this.gM();
      this.gN();
   }

   public boolean gF() {
      return this.gB() && this.dP().ac();
   }

   private void gJ() {
      if (!this.gt() && this.y() && !this.gF() && !this.a(bsk.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsk.a).e() || !this.y()) {
         this.y(false);
      }

      if (this.gt()) {
         this.gK();
         if (!this.dP().B && this.gI() > 80 && this.ah.a(20) == 1) {
            if (this.gI() > 100 && this.n(this.a(bsk.a))) {
               if (!this.dP().B) {
                  this.a(bsk.a, cua.l);
                  this.a(dxa.m);
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
         this.a(avf.sy, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            evz $$1 = new evz(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dH() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dF() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            evz $$3 = new evz(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.du(), this.dy() + 1.0, this.dA());
            this.dP().a(new lf(lj.S, this.a(bsk.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gL() {
      this.cv = this.cu;
      if (this.y()) {
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
      return aye.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return aye.i($$0, this.cx, this.cw);
   }

   public float J(float $$0) {
      return aye.i($$0, this.cz, this.cy);
   }

   private void gO() {
      this.cb++;
      if (this.cb > 32) {
         this.A(false);
      } else {
         if (!this.dP().B) {
            evz $$0 = this.ds();
            if (this.cb == 1) {
               float $$1 = this.dF() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.ct = new evz($$0.c + (double)(-aye.a($$1) * $$2), 0.0, $$0.e + (double)(aye.b($$1) * $$2));
               this.h(this.ct.b(0.0, 0.27, 0.0));
            } else if ((float)this.cb != 7.0F && (float)this.cb != 15.0F && (float)this.cb != 23.0F) {
               this.o(this.ct.c, $$0.d, this.ct.e);
            } else {
               this.o(0.0, this.aE() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gP() {
      evz $$0 = this.ds();
      dcd $$1 = this.dP();
      $$1.a(
         lj.ag,
         this.du() - (double)(this.dj() + 1.0F) * 0.5 * (double)aye.a(this.aY * (float) (Math.PI / 180.0)),
         this.dy() - 0.1F,
         this.dA() + (double)(this.dj() + 1.0F) * 0.5 * (double)aye.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avf.sv, 1.0F, 1.0F);

      for (cfd $$3 : $$1.a(cfd.class, this.cK().g(10.0))) {
         if (!$$3.p_() && $$3.aE() && !$$3.be() && $$3.gH()) {
            $$3.ff();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dbz.f)) {
         aqk $$4 = (aqk)$$1;
         eqt $$5 = $$4.o().be().b(eqk.aV);
         eqr $$6 = new eqr.a($$4).a(etk.f, this.dn()).a(etk.a, this).a(etj.j);

         for (cua $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cir $$0) {
      if (this.a(bsk.a).e() && cC.test($$0)) {
         this.a($$0);
         cua $$1 = $$0.p();
         this.a(bsk.a, $$1);
         this.f(bsk.a);
         this.a($$0, $$1.H());
         $$0.ao();
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (!this.dP().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      this.a(cfd.a.a($$4));
      this.b(cfd.a.a($$4));
      this.gG();
      if ($$3 == null) {
         $$3 = new brx.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfd $$0, @Nullable cfd $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gQ());
            this.b(cfd.a.a(this.ah));
         } else {
            this.a(cfd.a.a(this.ah));
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
         this.a(cfd.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfd.a.a(this.ah));
      }
   }

   private cfd.a gQ() {
      return this.ah.h() ? this.gv() : this.gw();
   }

   public void gG() {
      if (this.gE()) {
         this.f(bug.s).a(10.0);
      }

      if (this.gA()) {
         this.f(bug.v).a(0.07F);
      }
   }

   void gR() {
      if (!this.be()) {
         this.D(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (this.gF()) {
         return bqd.e;
      } else if (this.gn()) {
         this.x(false);
         return bqd.a(this.dP().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cr = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dP().B && this.g() == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dP().B || this.y() || this.be()) {
               return bqd.e;
            }

            this.gR();
            this.y(true);
            cua $$3 = this.a(bsk.a);
            if (!$$3.e() && !$$0.fL()) {
               this.b($$3);
            }

            this.a(bsk.a, new cua($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqd.a;
      } else {
         return bqd.e;
      }
   }

   @Nullable
   @Override
   protected ave v() {
      if (this.ge()) {
         return avf.sB;
      } else {
         return this.gB() ? avf.sC : avf.sw;
      }
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.sz, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.aq);
   }

   private boolean n(cua $$0) {
      return this.o($$0) || $$0.a(dfh.eg.r());
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.sx;
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.sD;
   }

   public boolean gH() {
      return !this.gn() && !this.gF() && !this.gt() && !this.gx() && !this.y();
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   public static enum a implements ayz {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ayz.a<cfd.a> h = ayz.a(cfd.a::values);
      private static final IntFunction<cfd.a> i = awu.a(cfd.a::a, values(), awu.a.a);
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

      static cfd.a a(cfd.a $$0, cfd.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfd.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfd.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfd.a a(aym $$0) {
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

   static class b extends cag {
      private final cfd b;

      public b(cfd $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gH() && super.a();
      }
   }

   static class c<T extends bsy> extends bzd<T> {
      private final cfd i;

      public c(cfd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsi.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gB() && this.i.gH() && super.a();
      }
   }

   static class d extends bzi {
      private final cfd d;
      private int e;

      public d(cfd $$0, double $$1) {
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
               if (this.d.db()) {
                  cmh $$0 = this.b.a(cfd.cj, this.d);
                  this.d.cB.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ja $$0 = this.d.dp();
         ja.a $$1 = new ja.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dfh.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cbo {
      private final cfd a;

      public e(cfd $$0, Class<?>... $$1) {
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
      protected void a(bta $$0, bsy $$1) {
         if ($$0 instanceof cfd && $$0.ge()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bzw {
      private final cfd a;
      private int b;

      public f(cfd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gA() && this.a.gH() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.be() && (this.a.gA() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
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

   static class g extends cae {
      private final cfd h;

      public g(cfd $$0, Class<? extends bsy> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bsy $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.dS().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cmh.class) {
                  this.c = this.b.dP().a(this.g, this.b, this.b.du(), this.b.dy(), this.b.dA());
               } else {
                  this.c = this.b
                     .dP()
                     .a(
                        this.b.dP().a(this.f, this.b.cK().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.du(),
                        this.b.dy(),
                        this.b.dA()
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

   static class h extends byz {
      private final cfd l;

      public h(cfd $$0) {
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

   static class i extends cap {
      private final cfd h;

      public i(cfd $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
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

   static class j extends bzw {
      private final cfd a;

      public j(cfd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.a, bzw.a.b, bzw.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gC()) && this.a.aE()) {
            if (!this.a.gH()) {
               return false;
            } else {
               float $$0 = this.a.dF() * (float) (Math.PI / 180.0);
               float $$1 = -aye.a($$0);
               float $$2 = aye.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aye.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aye.j((double)$$2) : 0;
               if (this.a.dP().a_(this.a.dp().b($$3, -1, $$4)).i()) {
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

   class k extends bzw {
      private int b;

      public k() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cfd.this.ai && !cfd.this.p_() && !cfd.this.be() && cfd.this.gH() && cfd.this.s() <= 0) {
            List<cir> $$0 = cfd.this.dP().a(cir.class, cfd.this.cK().c(6.0, 6.0, 6.0), cfd.cC);
            return !$$0.isEmpty() || !cfd.this.a(bsk.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cfd.this.be() && (cfd.this.gA() || cfd.this.ah.a(b(600)) != 1) ? cfd.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cfd.this.y() && !cfd.this.a(bsk.a).e()) {
            cfd.this.gR();
         }
      }

      @Override
      public void c() {
         List<cir> $$0 = cfd.this.dP().a(cir.class, cfd.this.cK().c(8.0, 8.0, 8.0), cfd.cC);
         if (!$$0.isEmpty() && cfd.this.a(bsk.a).e()) {
            cfd.this.K().a($$0.get(0), 1.2F);
         } else if (!cfd.this.a(bsk.a).e()) {
            cfd.this.gR();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cua $$0 = cfd.this.a(bsk.a);
         if (!$$0.e()) {
            cfd.this.b($$0);
            cfd.this.a(bsk.a, cua.l);
            int $$1 = cfd.this.gA() ? cfd.this.ah.a(50) + 10 : cfd.this.ah.a(150) + 10;
            this.b = cfd.this.ai + $$1 * 20;
         }

         cfd.this.w(false);
      }
   }

   static class l extends bzw {
      private final cfd a;

      public l(cfd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.p_() && this.a.gH()) {
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
