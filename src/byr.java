import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byr extends byc {
   private static final agn<Integer> bX = agq.a(byr.class, agp.b);
   private static final agn<Integer> bY = agq.a(byr.class, agp.b);
   private static final agn<Integer> bZ = agq.a(byr.class, agp.b);
   private static final agn<Byte> ca = agq.a(byr.class, agp.a);
   private static final agn<Byte> cb = agq.a(byr.class, agp.a);
   private static final agn<Byte> cc = agq.a(byr.class, agp.a);
   static final bxd cd = bxd.b().a(8.0);
   private static final blz ce = bmc.au.n().a(0.5F).a(bly.a().a(blx.a, 0.0F, 0.40625F, 0.0F));
   private static final int cf = 2;
   private static final int cg = 4;
   private static final int ch = 8;
   private static final int ci = 16;
   private static final int cj = 5;
   public static final int bU = 32;
   private static final int ck = 32;
   boolean cl;
   boolean cm;
   public int bV;
   private emc cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   byr.g cu;
   static final Predicate<ccb> cv = $$0 -> {
      cng $$1 = $$0.q();
      return ($$1.a(cxa.mZ.j()) || $$1.a(cxa.eg.j())) && $$0.bx() && !$$0.z();
   };

   public byr(bmc<? extends byr> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new byr.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cng $$0) {
      bmd $$1 = bmq.h($$0);
      return !this.c($$1).b() ? false : $$1 == bmd.a && super.f($$0);
   }

   public int u() {
      return this.an.b(bX);
   }

   public void t(int $$0) {
      this.an.b(bX, $$0);
   }

   public boolean w() {
      return this.w(2);
   }

   public boolean A() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gf() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gl() {
      return this.an.b(bZ) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bZ, $$0 ? 1 : 0);
   }

   private int gA() {
      return this.an.b(bZ);
   }

   private void v(int $$0) {
      this.an.b(bZ, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gm() {
      return this.an.b(bY);
   }

   public void u(int $$0) {
      this.an.b(bY, $$0);
   }

   public byr.a gn() {
      return byr.a.a(this.an.b(ca));
   }

   public void a(byr.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byr.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public byr.a go() {
      return byr.a.a(this.an.b(cb));
   }

   public void b(byr.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byr.a.a(this.ag);
      }

      this.an.b(cb, (byte)$$0.a());
   }

   public boolean gp() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
      this.an.a(bY, 0);
      this.an.a(ca, (byte)0);
      this.an.a(cb, (byte)0);
      this.an.a(cc, (byte)0);
      this.an.a(bZ, 0);
   }

   private boolean w(int $$0) {
      return (this.an.b(cc) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cc);
      if ($$1) {
         this.an.b(cc, (byte)($$2 | $$0));
      } else {
         this.an.b(cc, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gn().c());
      $$0.a("HiddenGene", this.go().c());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(byr.a.a($$0.l("MainGene")));
      this.b(byr.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      byr $$2 = bmc.au.a((ctx)$$0);
      if ($$2 != null) {
         if ($$1 instanceof byr $$3) {
            $$2.a(this, $$3);
         }

         $$2.gy();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(2, new byr.i(this, 2.0));
      this.bP.a(2, new byr.d(this, 1.0));
      this.bP.a(3, new byr.b(this, 1.2F, true));
      this.bP.a(4, new bus(this, 1.0, cqh.a(cxa.mZ.j()), false));
      this.bP.a(6, new byr.c<>(this, cfq.class, 8.0F, 2.0, 2.0));
      this.bP.a(6, new byr.c<>(this, ccw.class, 4.0F, 2.0, 2.0));
      this.bP.a(7, new byr.k());
      this.bP.a(8, new byr.f(this));
      this.bP.a(8, new byr.l(this));
      this.cu = new byr.g(this, cfq.class, 6.0F);
      this.bP.a(9, this.cu);
      this.bP.a(10, new buf(this));
      this.bP.a(12, new byr.j(this));
      this.bP.a(13, new btj(this, 1.25));
      this.bP.a(14, new bux(this, 1.0));
      this.bQ.a(1, new byr.e(this).a(new Class[0]));
   }

   public static bnt.a gq() {
      return bmq.C().a(bnu.o, 0.15F).a(bnu.c, 6.0);
   }

   public byr.a gr() {
      return byr.a.a(this.gn(), this.go());
   }

   public boolean gs() {
      return this.gr() == byr.a.b;
   }

   public boolean gt() {
      return this.gr() == byr.a.c;
   }

   public boolean gu() {
      return this.gr() == byr.a.d;
   }

   public boolean gv() {
      return this.gr() == byr.a.e;
   }

   public boolean gw() {
      return this.gr() == byr.a.f;
   }

   @Override
   public boolean fX() {
      return this.gr() == byr.a.g;
   }

   @Override
   public boolean a(cfq $$0) {
      return false;
   }

   @Override
   public boolean B(blw $$0) {
      this.a(art.rX, 1.0F, 1.0F);
      if (!this.fX()) {
         this.cm = true;
      }

      return super.B($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gt()) {
         if (this.dL().aa() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gl()) {
            this.w(false);
         }
      }

      bmo $$0 = this.q();
      if ($$0 == null) {
         this.cl = false;
         this.cm = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(art.rT, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gm() + 1);
         if (this.gm() > 20) {
            this.z(false);
            this.gH();
         } else if (this.gm() == 1) {
            this.a(art.rN, 1.0F, 1.0F);
         }
      }

      if (this.gp()) {
         this.gG();
      } else {
         this.bV = 0;
      }

      if (this.A()) {
         this.s(0.0F);
      }

      this.gD();
      this.gB();
      this.gE();
      this.gF();
   }

   public boolean gx() {
      return this.gt() && this.dL().aa();
   }

   private void gB() {
      if (!this.gl() && this.A() && !this.gx() && !this.c(bmd.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bmd.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gl()) {
         this.gC();
         if (!this.dL().B && this.gA() > 80 && this.ag.a(20) == 1) {
            if (this.gA() > 100 && this.l(this.c(bmd.a))) {
               if (!this.dL().B) {
                  this.a(bmd.a, cng.f);
                  this.b(dnz.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gA() + 1);
      }
   }

   private void gC() {
      if (this.gA() % 5 == 0) {
         this.a(art.rR, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            emc $$1 = new emc(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dD() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dB() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            emc $$3 = new emc(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dq(), this.du() + 1.0, this.dw());
            this.dL().a(new jt(jx.Q, this.c(bmd.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gD() {
      this.cp = this.co;
      if (this.A()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gE() {
      this.cr = this.cq;
      if (this.gf()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   private void gF() {
      this.ct = this.cs;
      if (this.gp()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   public float D(float $$0) {
      return aup.i($$0, this.cp, this.co);
   }

   public float E(float $$0) {
      return aup.i($$0, this.cr, this.cq);
   }

   public float F(float $$0) {
      return aup.i($$0, this.ct, this.cs);
   }

   private void gG() {
      this.bV++;
      if (this.bV > 32) {
         this.A(false);
      } else {
         if (!this.dL().B) {
            emc $$0 = this.do();
            if (this.bV == 1) {
               float $$1 = this.dB() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cn = new emc($$0.c + (double)(-aup.a($$1) * $$2), 0.0, $$0.e + (double)(aup.b($$1) * $$2));
               this.g(this.cn.b(0.0, 0.27, 0.0));
            } else if ((float)this.bV != 7.0F && (float)this.bV != 15.0F && (float)this.bV != 23.0F) {
               this.o(this.cn.c, $$0.d, this.cn.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gH() {
      emc $$0 = this.do();
      this.dL()
         .a(
            jx.ad,
            this.dq() - (double)(this.dg() + 1.0F) * 0.5 * (double)aup.a(this.aU * (float) (Math.PI / 180.0)),
            this.du() - 0.1F,
            this.dw() + (double)(this.dg() + 1.0F) * 0.5 * (double)aup.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(art.rO, 1.0F, 1.0F);

      for (byr $$2 : this.dL().a(byr.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gz()) {
            $$2.fb();
         }
      }

      if (!this.dL().y_() && this.ag.a(700) == 0 && this.dL().Z().b(ctt.f)) {
         this.a(cnj.qP);
      }
   }

   @Override
   protected void b(ccb $$0) {
      if (this.c(bmd.a).b() && cv.test($$0)) {
         this.a($$0);
         cng $$1 = $$0.q();
         this.a(bmd.a, $$1);
         this.e(bmd.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (!this.dL().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      this.a(byr.a.a($$5));
      this.b(byr.a.a($$5));
      this.gy();
      if ($$3 == null) {
         $$3 = new blr.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(byr $$0, @Nullable byr $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gI());
            this.b(byr.a.a(this.ag));
         } else {
            this.a(byr.a.a(this.ag));
            this.b($$0.gI());
         }
      } else if (this.ag.h()) {
         this.a($$0.gI());
         this.b($$1.gI());
      } else {
         this.a($$1.gI());
         this.b($$0.gI());
      }

      if (this.ag.a(32) == 0) {
         this.a(byr.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(byr.a.a(this.ag));
      }
   }

   private byr.a gI() {
      return this.ag.h() ? this.gn() : this.go();
   }

   public void gy() {
      if (this.gw()) {
         this.f(bnu.n).a(10.0);
      }

      if (this.gs()) {
         this.f(bnu.o).a(0.07F);
      }
   }

   void gJ() {
      if (!this.aZ()) {
         this.z(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (this.gx()) {
         return bkc.d;
      } else if (this.gf()) {
         this.x(false);
         return bkc.a(this.dL().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cl = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dL().B && this.h() == 0 && this.gg()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dL().B || this.A() || this.aZ()) {
               return bkc.d;
            }

            this.gJ();
            this.y(true);
            cng $$3 = this.c(bmd.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(bmd.a, new cng($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bkc.a;
      } else {
         return bkc.d;
      }
   }

   @Nullable
   @Override
   protected ars y() {
      if (this.fX()) {
         return art.rU;
      } else {
         return this.gt() ? art.rV : art.rP;
      }
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.rS, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(cxa.mZ.j());
   }

   private boolean l(cng $$0) {
      return this.m($$0) || $$0.a(cxa.eg.j());
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.rQ;
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.rW;
   }

   public boolean gz() {
      return !this.gf() && !this.gx() && !this.gl() && !this.gp() && !this.A();
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   public static enum a implements avl {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final avl.a<byr.a> h = avl.a(byr.a::values);
      private static final IntFunction<byr.a> i = ath.a(byr.a::a, values(), ath.a.a);
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

      static byr.a a(byr.a $$0, byr.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static byr.a a(int $$0) {
         return i.apply($$0);
      }

      public static byr.a a(String $$0) {
         return h.a($$0, a);
      }

      public static byr.a a(auw $$0) {
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

   static class b extends btu {
      private final byr b;

      public b(byr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gz() && super.a();
      }
   }

   static class c<T extends bmo> extends bsr<T> {
      private final byr i;

      public c(byr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bmb.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gt() && this.i.gz() && super.a();
      }
   }

   static class d extends bsw {
      private final byr d;
      private int e;

      public d(byr $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.u() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.t(32);
               this.e = this.d.ah + 600;
               if (this.d.cY()) {
                  cfq $$0 = this.b.a(byr.cd, this.d);
                  this.d.cu.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         hx $$0 = this.d.dl();
         hx.a $$1 = new hx.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cxa.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bvc {
      private final byr a;

      public e(byr $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cl && !this.a.cm) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bmq $$0, bmo $$1) {
         if ($$0 instanceof byr && $$0.fX()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends btk {
      private final byr a;
      private int b;

      public f(byr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gs() && this.a.gz() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aZ() && (this.a.gs() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ah + 200;
      }
   }

   static class g extends bts {
      private final byr h;

      public g(byr $$0, Class<? extends bmo> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bmo $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.eg().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cfq.class) {
                  this.c = this.b.dL().a(this.g, this.b, this.b.dq(), this.b.du(), this.b.dw());
               } else {
                  this.c = this.b
                     .dL()
                     .a(
                        this.b.dL().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dq(),
                        this.b.du(),
                        this.b.dw()
                     );
               }
            }

            return this.h.gz() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bsn {
      private final byr l;

      public h(byr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gz()) {
            super.a();
         }
      }
   }

   static class i extends bud {
      private final byr h;

      public i(byr $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bN();
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

   static class j extends btk {
      private final byr a;

      public j(byr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.a, btk.a.b, btk.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gu()) && this.a.aC()) {
            if (!this.a.gz()) {
               return false;
            } else {
               float $$0 = this.a.dB() * (float) (Math.PI / 180.0);
               float $$1 = -aup.a($$0);
               float $$2 = aup.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aup.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aup.j((double)$$2) : 0;
               if (this.a.dL().a_(this.a.dl().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gu() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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

   class k extends btk {
      private int b;

      public k() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= byr.this.ah && !byr.this.o_() && !byr.this.aZ() && byr.this.gz() && byr.this.u() <= 0) {
            List<ccb> $$0 = byr.this.dL().a(ccb.class, byr.this.cH().c(6.0, 6.0, 6.0), byr.cv);
            return !$$0.isEmpty() || !byr.this.c(bmd.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !byr.this.aZ() && (byr.this.gs() || byr.this.ag.a(b(600)) != 1) ? byr.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!byr.this.A() && !byr.this.c(bmd.a).b()) {
            byr.this.gJ();
         }
      }

      @Override
      public void c() {
         List<ccb> $$0 = byr.this.dL().a(ccb.class, byr.this.cH().c(8.0, 8.0, 8.0), byr.cv);
         if (!$$0.isEmpty() && byr.this.c(bmd.a).b()) {
            byr.this.N().a($$0.get(0), 1.2F);
         } else if (!byr.this.c(bmd.a).b()) {
            byr.this.gJ();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cng $$0 = byr.this.c(bmd.a);
         if (!$$0.b()) {
            byr.this.b($$0);
            byr.this.a(bmd.a, cng.f);
            int $$1 = byr.this.gs() ? byr.this.ag.a(50) + 10 : byr.this.ag.a(150) + 10;
            this.b = byr.this.ah + $$1 * 20;
         }

         byr.this.w(false);
      }
   }

   static class l extends btk {
      private final byr a;

      public l(byr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gz()) {
            return this.a.gw() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
