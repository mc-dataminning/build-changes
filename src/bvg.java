import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvg extends bur {
   private static final aee<Integer> bW = aeh.a(bvg.class, aeg.b);
   private static final aee<Integer> bX = aeh.a(bvg.class, aeg.b);
   private static final aee<Integer> bY = aeh.a(bvg.class, aeg.b);
   private static final aee<Byte> bZ = aeh.a(bvg.class, aeg.a);
   private static final aee<Byte> ca = aeh.a(bvg.class, aeg.a);
   private static final aee<Byte> cb = aeh.a(bvg.class, aeg.a);
   static final bts cc = bts.b().a(8.0);
   private static final int cd = 2;
   private static final int ce = 4;
   private static final int cf = 8;
   private static final int cg = 16;
   private static final int ch = 5;
   public static final int bT = 32;
   private static final int ci = 32;
   boolean cj;
   boolean ck;
   public int bU;
   private ehn cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bvg.g cs;
   static final Predicate<byn> ct = $$0 -> {
      cjf $$1 = $$0.q();
      return ($$1.a(csw.mZ.k()) || $$1.a(csw.eh.k())) && $$0.bv() && !$$0.y();
   };

   public bvg(biu<? extends bvg> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bvg.h(this);
      if (!this.m_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cjf $$0) {
      biv $$1 = bji.h($$0);
      return !this.c($$1).b() ? false : $$1 == biv.a && super.f($$0);
   }

   public int s() {
      return this.an.b(bW);
   }

   public void t(int $$0) {
      this.an.b(bW, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean y() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gd() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gj() {
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gy() {
      return this.an.b(bY);
   }

   private void v(int $$0) {
      this.an.b(bY, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gk() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public bvg.a gl() {
      return bvg.a.a(this.an.b(bZ));
   }

   public void a(bvg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bvg.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bvg.a gm() {
      return bvg.a.a(this.an.b(ca));
   }

   public void b(bvg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bvg.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean gn() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, 0);
      this.an.a(bX, 0);
      this.an.a(bZ, (byte)0);
      this.an.a(ca, (byte)0);
      this.an.a(cb, (byte)0);
      this.an.a(bY, 0);
   }

   private boolean w(int $$0) {
      return (this.an.b(cb) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cb);
      if ($$1) {
         this.an.b(cb, (byte)($$2 | $$0));
      } else {
         this.an.b(cb, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gl().c());
      $$0.a("HiddenGene", this.gm().c());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bvg.a.a($$0.l("MainGene")));
      this.b(bvg.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bil a(akq $$0, bil $$1) {
      bvg $$2 = biu.as.a((cpv)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bvg $$3) {
            $$2.a(this, $$3);
         }

         $$2.gw();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(2, new bvg.i(this, 2.0));
      this.bO.a(2, new bvg.d(this, 1.0));
      this.bO.a(3, new bvg.b(this, 1.2F, true));
      this.bO.a(4, new brj(this, 1.0, cmg.a(csw.mZ.k()), false));
      this.bO.a(6, new bvg.c<>(this, cbu.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bvg.c<>(this, bzi.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bvg.k());
      this.bO.a(8, new bvg.f(this));
      this.bO.a(8, new bvg.l(this));
      this.cs = new bvg.g(this, cbu.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bqw(this));
      this.bO.a(12, new bvg.j(this));
      this.bO.a(13, new bqa(this, 1.25));
      this.bO.a(14, new bro(this, 1.0));
      this.bP.a(1, new bvg.e(this).a(new Class[0]));
   }

   public static bkl.a go() {
      return bji.A().a(bkm.d, 0.15F).a(bkm.f, 6.0);
   }

   public bvg.a gp() {
      return bvg.a.a(this.gl(), this.gm());
   }

   public boolean gq() {
      return this.gp() == bvg.a.b;
   }

   public boolean gr() {
      return this.gp() == bvg.a.c;
   }

   public boolean gs() {
      return this.gp() == bvg.a.d;
   }

   public boolean gt() {
      return this.gp() == bvg.a.e;
   }

   public boolean gu() {
      return this.gp() == bvg.a.f;
   }

   @Override
   public boolean fV() {
      return this.gp() == bvg.a.g;
   }

   @Override
   public boolean a(cbu $$0) {
      return false;
   }

   @Override
   public boolean C(biq $$0) {
      this.a(apd.qU, 1.0F, 1.0F);
      if (!this.fV()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gr()) {
         if (this.dL().Y() && !this.aX()) {
            this.w(true);
            this.y(false);
         } else if (!this.gj()) {
            this.w(false);
         }
      }

      bjg $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(apd.qQ, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.gk() + 1);
         if (this.gk() > 20) {
            this.z(false);
            this.gF();
         } else if (this.gk() == 1) {
            this.a(apd.qK, 1.0F, 1.0F);
         }
      }

      if (this.gn()) {
         this.gE();
      } else {
         this.bU = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gB();
      this.gz();
      this.gC();
      this.gD();
   }

   public boolean gv() {
      return this.gr() && this.dL().Y();
   }

   private void gz() {
      if (!this.gj() && this.y() && !this.gv() && !this.c(biv.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(biv.a).b() || !this.y()) {
         this.y(false);
      }

      if (this.gj()) {
         this.gA();
         if (!this.dL().B && this.gy() > 80 && this.ag.a(20) == 1) {
            if (this.gy() > 100 && this.l(this.c(biv.a))) {
               if (!this.dL().B) {
                  this.a(biv.a, cjf.b);
                  this.a(djt.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gy() + 1);
      }
   }

   private void gA() {
      if (this.gy() % 5 == 0) {
         this.a(apd.qO, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ehn $$1 = new ehn(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dD() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dB() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ehn $$3 = new ehn(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dq(), this.du() + 1.0, this.dw());
            this.dL().a(new ir(iv.O, this.c(biv.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gB() {
      this.cn = this.cm;
      if (this.y()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gC() {
      this.cp = this.co;
      if (this.gd()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gD() {
      this.cr = this.cq;
      if (this.gn()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return arw.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return arw.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return arw.i($$0, this.cr, this.cq);
   }

   private void gE() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dL().B) {
            ehn $$0 = this.do();
            if (this.bU == 1) {
               float $$1 = this.dB() * (float) (Math.PI / 180.0);
               float $$2 = this.m_() ? 0.1F : 0.2F;
               this.cl = new ehn($$0.c + (double)(-arw.a($$1) * $$2), 0.0, $$0.e + (double)(arw.b($$1) * $$2));
               this.f(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aA() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gF() {
      ehn $$0 = this.do();
      this.dL()
         .a(
            iv.aa,
            this.dq() - (double)(this.df() + 1.0F) * 0.5 * (double)arw.a(this.aU * (float) (Math.PI / 180.0)),
            this.du() - 0.1F,
            this.dw() + (double)(this.df() + 1.0F) * 0.5 * (double)arw.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(apd.qL, 1.0F, 1.0F);

      for (bvg $$2 : this.dL().a(bvg.class, this.cG().g(10.0))) {
         if (!$$2.m_() && $$2.aA() && !$$2.aX() && $$2.gx()) {
            $$2.fa();
         }
      }

      if (!this.dL().w_() && this.ag.a(700) == 0 && this.dL().X().b(cpr.f)) {
         this.a(cji.qc);
      }
   }

   @Override
   protected void b(byn $$0) {
      if (this.c(biv.a).b() && ct.test($$0)) {
         this.a($$0);
         cjf $$1 = $$0.q();
         this.a(biv.a, $$1);
         this.e(biv.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (!this.dL().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      asc $$5 = $$0.D_();
      this.a(bvg.a.a($$5));
      this.b(bvg.a.a($$5));
      this.gw();
      if ($$3 == null) {
         $$3 = new bil.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bvg $$0, @Nullable bvg $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gG());
            this.b(bvg.a.a(this.ag));
         } else {
            this.a(bvg.a.a(this.ag));
            this.b($$0.gG());
         }
      } else if (this.ag.h()) {
         this.a($$0.gG());
         this.b($$1.gG());
      } else {
         this.a($$1.gG());
         this.b($$0.gG());
      }

      if (this.ag.a(32) == 0) {
         this.a(bvg.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bvg.a.a(this.ag));
      }
   }

   private bvg.a gG() {
      return this.ag.h() ? this.gl() : this.gm();
   }

   public void gw() {
      if (this.gu()) {
         this.a(bkm.a).a(10.0);
      }

      if (this.gq()) {
         this.a(bkm.d).a(0.07F);
      }
   }

   void gH() {
      if (!this.aX()) {
         this.A(0.0F);
         this.L().n();
         this.w(true);
      }
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (this.gv()) {
         return bgy.d;
      } else if (this.gd()) {
         this.x(false);
         return bgy.a(this.dL().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cj = true;
         }

         if (this.m_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dL().B && this.h() == 0 && this.ge()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dL().B || this.y() || this.aX()) {
               return bgy.d;
            }

            this.gH();
            this.y(true);
            cjf $$3 = this.c(biv.a);
            if (!$$3.b() && !$$0.fS().d) {
               this.b($$3);
            }

            this.a(biv.a, new cjf($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bgy.a;
      } else {
         return bgy.d;
      }
   }

   @Nullable
   @Override
   protected apc w() {
      if (this.fV()) {
         return apd.qR;
      } else {
         return this.gr() ? apd.qS : apd.qM;
      }
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cjf $$0) {
      return $$0.a(csw.mZ.k());
   }

   private boolean l(cjf $$0) {
      return this.m($$0) || $$0.a(csw.eh.k());
   }

   @Nullable
   @Override
   protected apc l_() {
      return apd.qN;
   }

   @Nullable
   @Override
   protected apc d(bho $$0) {
      return apd.qT;
   }

   public boolean gx() {
      return !this.gd() && !this.gv() && !this.gj() && !this.gn() && !this.y();
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.m_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements asp {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final asp.a<bvg.a> h = asp.a(bvg.a::values);
      private static final IntFunction<bvg.a> i = aqr.a(bvg.a::a, values(), aqr.a.a);
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

      static bvg.a a(bvg.a $$0, bvg.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bvg.a a(int $$0) {
         return i.apply($$0);
      }

      public static bvg.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bvg.a a(asc $$0) {
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

   static class b extends bql {
      private final bvg b;

      public b(bvg $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gx() && super.a();
      }
   }

   static class c<T extends bjg> extends bpi<T> {
      private final bvg i;

      public c(bvg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bit.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gr() && this.i.gx() && super.a();
      }
   }

   static class d extends bpn {
      private final bvg d;
      private int e;

      public d(bvg $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.s() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.t(32);
               this.e = this.d.ah + 600;
               if (this.d.cX()) {
                  cbu $$0 = this.b.a(bvg.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gw $$0 = this.d.dl();
         gw.a $$1 = new gw.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(csw.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends brt {
      private final bvg a;

      public e(bvg $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cj && !this.a.ck) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bji $$0, bjg $$1) {
         if ($$0 instanceof bvg && $$0.fV()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bqb {
      private final bvg a;
      private int b;

      public f(bvg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gq() && this.a.gx() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aX() && (this.a.gq() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bqj {
      private final bvg h;

      public g(bvg $$0, Class<? extends bjg> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bjg $$0) {
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
               if (this.f == cbu.class) {
                  this.c = this.b.dL().a(this.g, this.b, this.b.dq(), this.b.du(), this.b.dw());
               } else {
                  this.c = this.b
                     .dL()
                     .a(
                        this.b.dL().a(this.f, this.b.cG().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dq(),
                        this.b.du(),
                        this.b.dw()
                     );
               }
            }

            return this.h.gx() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bpe {
      private final bvg l;

      public h(bvg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gx()) {
            super.a();
         }
      }
   }

   static class i extends bqu {
      private final bvg h;

      public i(bvg $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }

      @Override
      public boolean b() {
         if (this.h.y()) {
            this.h.L().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bqb {
      private final bvg a;

      public j(bvg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.a, bqb.a.b, bqb.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.m_() || this.a.gs()) && this.a.aA()) {
            if (!this.a.gx()) {
               return false;
            } else {
               float $$0 = this.a.dB() * (float) (Math.PI / 180.0);
               float $$1 = -arw.a($$0);
               float $$2 = arw.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? arw.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? arw.j((double)$$2) : 0;
               if (this.a.dL().a_(this.a.dl().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gs() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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
      public boolean P_() {
         return false;
      }
   }

   class k extends bqb {
      private int b;

      public k() {
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bvg.this.ah && !bvg.this.m_() && !bvg.this.aX() && bvg.this.gx() && bvg.this.s() <= 0) {
            List<byn> $$0 = bvg.this.dL().a(byn.class, bvg.this.cG().c(6.0, 6.0, 6.0), bvg.ct);
            return !$$0.isEmpty() || !bvg.this.c(biv.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bvg.this.aX() && (bvg.this.gq() || bvg.this.ag.a(b(600)) != 1) ? bvg.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bvg.this.y() && !bvg.this.c(biv.a).b()) {
            bvg.this.gH();
         }
      }

      @Override
      public void c() {
         List<byn> $$0 = bvg.this.dL().a(byn.class, bvg.this.cG().c(8.0, 8.0, 8.0), bvg.ct);
         if (!$$0.isEmpty() && bvg.this.c(biv.a).b()) {
            bvg.this.L().a($$0.get(0), 1.2F);
         } else if (!bvg.this.c(biv.a).b()) {
            bvg.this.gH();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cjf $$0 = bvg.this.c(biv.a);
         if (!$$0.b()) {
            bvg.this.b($$0);
            bvg.this.a(biv.a, cjf.b);
            int $$1 = bvg.this.gq() ? bvg.this.ag.a(50) + 10 : bvg.this.ag.a(150) + 10;
            this.b = bvg.this.ah + $$1 * 20;
         }

         bvg.this.w(false);
      }
   }

   static class l extends bqb {
      private final bvg a;

      public l(bvg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.m_() && this.a.gx()) {
            return this.a.gu() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
