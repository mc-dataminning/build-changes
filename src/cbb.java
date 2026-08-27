import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbb extends cam {
   private static final aii<Integer> bY = ail.a(cbb.class, aik.b);
   private static final aii<Integer> bZ = ail.a(cbb.class, aik.b);
   private static final aii<Integer> ca = ail.a(cbb.class, aik.b);
   private static final aii<Byte> cb = ail.a(cbb.class, aik.a);
   private static final aii<Byte> cc = ail.a(cbb.class, aik.a);
   private static final aii<Byte> cd = ail.a(cbb.class, aik.a);
   static final bzn ce = bzn.b().a(8.0);
   private static final boi cf = bol.au.n().a(0.5F).a(boh.a().a(bog.a, 0.0F, 0.40625F, 0.0F));
   private static final int cg = 2;
   private static final int ch = 4;
   private static final int ci = 8;
   private static final int cj = 16;
   private static final int ck = 5;
   public static final int bV = 32;
   private static final int cl = 32;
   boolean cm;
   boolean cn;
   public int bW;
   private eov co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   cbb.g cv;
   static final Predicate<cel> cx = $$0 -> {
      cpq $$1 = $$0.q();
      return ($$1.a(czh.mZ.l()) || $$1.a(czh.eg.l())) && $$0.bx() && !$$0.z();
   };

   public cbb(bol<? extends cbb> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new cbb.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = boz.h($$0);
      return !this.c($$1).b() ? false : $$1 == bom.a && super.f($$0);
   }

   public int u() {
      return this.am.b(bY);
   }

   public void u(int $$0) {
      this.am.b(bY, $$0);
   }

   public boolean w() {
      return this.x(2);
   }

   public boolean A() {
      return this.x(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gl() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gr() {
      return this.am.b(ca) > 0;
   }

   public void y(boolean $$0) {
      this.am.b(ca, $$0 ? 1 : 0);
   }

   private int gG() {
      return this.am.b(ca);
   }

   private void w(int $$0) {
      this.am.b(ca, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.v(0);
      }
   }

   public int gs() {
      return this.am.b(bZ);
   }

   public void v(int $$0) {
      this.am.b(bZ, $$0);
   }

   public cbb.a gt() {
      return cbb.a.a(this.am.b(cb));
   }

   public void a(cbb.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cbb.a.a(this.af);
      }

      this.am.b(cb, (byte)$$0.a());
   }

   public cbb.a gu() {
      return cbb.a.a(this.am.b(cc));
   }

   public void b(cbb.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cbb.a.a(this.af);
      }

      this.am.b(cc, (byte)$$0.a());
   }

   public boolean gv() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, 0);
      this.am.a(bZ, 0);
      this.am.a(cb, (byte)0);
      this.am.a(cc, (byte)0);
      this.am.a(cd, (byte)0);
      this.am.a(ca, 0);
   }

   private boolean x(int $$0) {
      return (this.am.b(cd) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.b(cd);
      if ($$1) {
         this.am.b(cd, (byte)($$2 | $$0));
      } else {
         this.am.b(cd, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gt().c());
      $$0.a("HiddenGene", this.gu().c());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(cbb.a.a($$0.l("MainGene")));
      this.b(cbb.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      cbb $$2 = bol.au.a((cwe)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cbb $$3) {
            $$2.a(this, $$3);
         }

         $$2.gE();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(2, new cbb.i(this, 2.0));
      this.bP.a(2, new cbb.d(this, 1.0));
      this.bP.a(3, new cbb.b(this, 1.2F, true));
      this.bP.a(4, new bxc(this, 1.0, csp.a(czh.mZ.l()), false));
      this.bP.a(6, new cbb.c<>(this, cia.class, 8.0F, 2.0, 2.0));
      this.bP.a(6, new cbb.c<>(this, cfg.class, 4.0F, 2.0, 2.0));
      this.bP.a(7, new cbb.k());
      this.bP.a(8, new cbb.f(this));
      this.bP.a(8, new cbb.l(this));
      this.cv = new cbb.g(this, cia.class, 6.0F);
      this.bP.a(9, this.cv);
      this.bP.a(10, new bwp(this));
      this.bP.a(12, new cbb.j(this));
      this.bP.a(13, new bvt(this, 1.25));
      this.bP.a(14, new bxh(this, 1.0));
      this.bQ.a(1, new cbb.e(this).a(new Class[0]));
   }

   public static bqd.a gw() {
      return boz.C().a(bqe.o, 0.15F).a(bqe.c, 6.0);
   }

   public cbb.a gx() {
      return cbb.a.a(this.gt(), this.gu());
   }

   public boolean gy() {
      return this.gx() == cbb.a.b;
   }

   public boolean gz() {
      return this.gx() == cbb.a.c;
   }

   public boolean gA() {
      return this.gx() == cbb.a.d;
   }

   public boolean gB() {
      return this.gx() == cbb.a.e;
   }

   public boolean gC() {
      return this.gx() == cbb.a.f;
   }

   @Override
   public boolean gd() {
      return this.gx() == cbb.a.g;
   }

   @Override
   public boolean a(cia $$0) {
      return false;
   }

   @Override
   public boolean B(bof $$0) {
      this.a(atp.rY, 1.0F, 1.0F);
      if (!this.gd()) {
         this.cn = true;
      }

      return super.B($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gz()) {
         if (this.dJ().aa() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gr()) {
            this.w(false);
         }
      }

      box $$0 = this.q();
      if ($$0 == null) {
         this.cm = false;
         this.cn = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(atp.rU, 1.0F, 1.0F);
         }

         this.u(this.u() - 1);
      }

      if (this.w()) {
         this.v(this.gs() + 1);
         if (this.gs() > 20) {
            this.z(false);
            this.gN();
         } else if (this.gs() == 1) {
            this.a(atp.rO, 1.0F, 1.0F);
         }
      }

      if (this.gv()) {
         this.gM();
      } else {
         this.bW = 0;
      }

      if (this.A()) {
         this.s(0.0F);
      }

      this.gJ();
      this.gH();
      this.gK();
      this.gL();
   }

   public boolean gD() {
      return this.gz() && this.dJ().aa();
   }

   private void gH() {
      if (!this.gr() && this.A() && !this.gD() && !this.c(bom.a).b() && this.af.a(80) == 1) {
         this.y(true);
      } else if (this.c(bom.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gr()) {
         this.gI();
         if (!this.dJ().B && this.gG() > 80 && this.af.a(20) == 1) {
            if (this.gG() > 100 && this.n(this.c(bom.a))) {
               if (!this.dJ().B) {
                  this.a(bom.a, cpq.h);
                  this.b(dqr.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gG() + 1);
      }
   }

   private void gI() {
      if (this.gG() % 5 == 0) {
         this.a(atp.rS, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eov $$1 = new eov(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dB() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dz() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            eov $$3 = new eov(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.do(), this.ds() + 1.0, this.du());
            this.dJ().a(new jx(kb.Q, this.c(bom.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gJ() {
      this.cq = this.cp;
      if (this.A()) {
         this.cp = Math.min(1.0F, this.cp + 0.15F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.19F);
      }
   }

   private void gK() {
      this.cs = this.cr;
      if (this.gl()) {
         this.cr = Math.min(1.0F, this.cr + 0.15F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.19F);
      }
   }

   private void gL() {
      this.cu = this.ct;
      if (this.gv()) {
         this.ct = Math.min(1.0F, this.ct + 0.15F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.19F);
      }
   }

   public float E(float $$0) {
      return awm.i($$0, this.cq, this.cp);
   }

   public float F(float $$0) {
      return awm.i($$0, this.cs, this.cr);
   }

   public float G(float $$0) {
      return awm.i($$0, this.cu, this.ct);
   }

   private void gM() {
      this.bW++;
      if (this.bW > 32) {
         this.A(false);
      } else {
         if (!this.dJ().B) {
            eov $$0 = this.dm();
            if (this.bW == 1) {
               float $$1 = this.dz() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.co = new eov($$0.c + (double)(-awm.a($$1) * $$2), 0.0, $$0.e + (double)(awm.b($$1) * $$2));
               this.g(this.co.b(0.0, 0.27, 0.0));
            } else if ((float)this.bW != 7.0F && (float)this.bW != 15.0F && (float)this.bW != 23.0F) {
               this.o(this.co.c, $$0.d, this.co.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gN() {
      eov $$0 = this.dm();
      this.dJ()
         .a(
            kb.ad,
            this.do() - (double)(this.dd() + 1.0F) * 0.5 * (double)awm.a(this.aV * (float) (Math.PI / 180.0)),
            this.ds() - 0.1F,
            this.du() + (double)(this.dd() + 1.0F) * 0.5 * (double)awm.b(this.aV * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(atp.rP, 1.0F, 1.0F);

      for (cbb $$2 : this.dJ().a(cbb.class, this.cE().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gF()) {
            $$2.fd();
         }
      }

      if (!this.dJ().y_() && this.af.a(700) == 0 && this.dJ().Z().b(cwa.f)) {
         this.a(cpt.qP);
      }
   }

   @Override
   protected void b(cel $$0) {
      if (this.c(bom.a).b() && cx.test($$0)) {
         this.a($$0);
         cpq $$1 = $$0.q();
         this.a(bom.a, $$1);
         this.e(bom.a);
         this.a($$0, $$1.M());
         $$0.am();
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (!this.dJ().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      this.a(cbb.a.a($$4));
      this.b(cbb.a.a($$4));
      this.gE();
      if ($$3 == null) {
         $$3 = new boa.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cbb $$0, @Nullable cbb $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gO());
            this.b(cbb.a.a(this.af));
         } else {
            this.a(cbb.a.a(this.af));
            this.b($$0.gO());
         }
      } else if (this.af.h()) {
         this.a($$0.gO());
         this.b($$1.gO());
      } else {
         this.a($$1.gO());
         this.b($$0.gO());
      }

      if (this.af.a(32) == 0) {
         this.a(cbb.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(cbb.a.a(this.af));
      }
   }

   private cbb.a gO() {
      return this.af.h() ? this.gt() : this.gu();
   }

   public void gE() {
      if (this.gC()) {
         this.f(bqe.n).a(10.0);
      }

      if (this.gy()) {
         this.f(bqe.o).a(0.07F);
      }
   }

   void gP() {
      if (!this.aZ()) {
         this.A(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (this.gD()) {
         return bml.d;
      } else if (this.gl()) {
         this.x(false);
         return bml.a(this.dJ().B);
      } else if (this.o($$2)) {
         if (this.q() != null) {
            this.cm = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dJ().B && this.h() == 0 && this.gm()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dJ().B || this.A() || this.aZ()) {
               return bml.d;
            }

            this.gP();
            this.y(true);
            cpq $$3 = this.c(bom.a);
            if (!$$3.b() && !$$0.fW().d) {
               this.b($$3);
            }

            this.a(bom.a, new cpq($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bml.a;
      } else {
         return bml.d;
      }
   }

   @Nullable
   @Override
   protected ato y() {
      if (this.gd()) {
         return atp.rV;
      } else {
         return this.gz() ? atp.rW : atp.rQ;
      }
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.rT, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(czh.mZ.l());
   }

   private boolean n(cpq $$0) {
      return this.o($$0) || $$0.a(czh.eg.l());
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.rR;
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.rX;
   }

   public boolean gF() {
      return !this.gl() && !this.gD() && !this.gr() && !this.gv() && !this.A();
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? cf : super.e($$0);
   }

   public static enum a implements axg {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final axg.a<cbb.a> h = axg.a(cbb.a::values);
      private static final IntFunction<cbb.a> i = ave.a(cbb.a::a, values(), ave.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(int $$0, String $$1, boolean $$2) {
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

      static cbb.a a(cbb.a $$0, cbb.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cbb.a a(int $$0) {
         return i.apply($$0);
      }

      public static cbb.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cbb.a a(awt $$0) {
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

   static class b extends bwe {
      private final cbb b;

      public b(cbb $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gF() && super.a();
      }
   }

   static class c<T extends box> extends bvb<T> {
      private final cbb i;

      public c(cbb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bok.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gz() && this.i.gF() && super.a();
      }
   }

   static class d extends bvg {
      private final cbb d;
      private int e;

      public d(cbb $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.u() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ag) {
               this.d.u(32);
               this.e = this.d.ag + 600;
               if (this.d.cV()) {
                  cia $$0 = this.b.a(cbb.ce, this.d);
                  this.d.cv.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ib $$0 = this.d.dj();
         ib.a $$1 = new ib.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(czh.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bxm {
      private final cbb a;

      public e(cbb $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cm && !this.a.cn) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(boz $$0, box $$1) {
         if ($$0 instanceof cbb && $$0.gd()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bvu {
      private final cbb a;
      private int b;

      public f(cbb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ag && this.a.gy() && this.a.gF() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aZ() && (this.a.gy() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ag + 200;
      }
   }

   static class g extends bwc {
      private final cbb h;

      public g(cbb $$0, Class<? extends box> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(box $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ef().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cia.class) {
                  this.c = this.b.dJ().a(this.g, this.b, this.b.do(), this.b.ds(), this.b.du());
               } else {
                  this.c = this.b
                     .dJ()
                     .a(
                        this.b.dJ().a(this.f, this.b.cE().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.do(),
                        this.b.ds(),
                        this.b.du()
                     );
               }
            }

            return this.h.gF() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bux {
      private final cbb l;

      public h(cbb $$0) {
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

   static class i extends bwn {
      private final cbb h;

      public i(cbb $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dy() || this.b.bK();
      }

      @Override
      public boolean b() {
         if (this.h.A()) {
            this.h.N().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bvu {
      private final cbb a;

      public j(cbb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b, bvu.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gA()) && this.a.aC()) {
            if (!this.a.gF()) {
               return false;
            } else {
               float $$0 = this.a.dz() * (float) (Math.PI / 180.0);
               float $$1 = -awm.a($$0);
               float $$2 = awm.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? awm.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? awm.j((double)$$2) : 0;
               if (this.a.dJ().a_(this.a.dj().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gA() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
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
      public boolean S_() {
         return false;
      }
   }

   class k extends bvu {
      private int b;

      public k() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cbb.this.ag && !cbb.this.o_() && !cbb.this.aZ() && cbb.this.gF() && cbb.this.u() <= 0) {
            List<cel> $$0 = cbb.this.dJ().a(cel.class, cbb.this.cE().c(6.0, 6.0, 6.0), cbb.cx);
            return !$$0.isEmpty() || !cbb.this.c(bom.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cbb.this.aZ() && (cbb.this.gy() || cbb.this.af.a(b(600)) != 1) ? cbb.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cbb.this.A() && !cbb.this.c(bom.a).b()) {
            cbb.this.gP();
         }
      }

      @Override
      public void c() {
         List<cel> $$0 = cbb.this.dJ().a(cel.class, cbb.this.cE().c(8.0, 8.0, 8.0), cbb.cx);
         if (!$$0.isEmpty() && cbb.this.c(bom.a).b()) {
            cbb.this.N().a($$0.get(0), 1.2F);
         } else if (!cbb.this.c(bom.a).b()) {
            cbb.this.gP();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cpq $$0 = cbb.this.c(bom.a);
         if (!$$0.b()) {
            cbb.this.b($$0);
            cbb.this.a(bom.a, cpq.h);
            int $$1 = cbb.this.gy() ? cbb.this.af.a(50) + 10 : cbb.this.af.a(150) + 10;
            this.b = cbb.this.ag + $$1 * 20;
         }

         cbb.this.w(false);
      }
   }

   static class l extends bvu {
      private final cbb a;

      public l(cbb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gF()) {
            return this.a.gC() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
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
