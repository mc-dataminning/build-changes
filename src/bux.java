import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bux extends bui {
   private static final adx<Integer> bW = aea.a(bux.class, adz.b);
   private static final adx<Integer> bX = aea.a(bux.class, adz.b);
   private static final adx<Integer> bY = aea.a(bux.class, adz.b);
   private static final adx<Byte> bZ = aea.a(bux.class, adz.a);
   private static final adx<Byte> ca = aea.a(bux.class, adz.a);
   private static final adx<Byte> cb = aea.a(bux.class, adz.a);
   static final btj cc = btj.b().a(8.0);
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
   private ehf cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bux.g cs;
   static final Predicate<bye> ct = $$0 -> {
      ciw $$1 = $$0.j();
      return ($$1.a(csl.mZ.k()) || $$1.a(csl.eh.k())) && $$0.bv() && !$$0.r();
   };

   public bux(bik<? extends bux> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bux.h(this);
      if (!this.i_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(ciw $$0) {
      bil $$1 = biy.h($$0);
      return !this.c($$1).b() ? false : $$1 == bil.a && super.f($$0);
   }

   public int p() {
      return this.an.b(bW);
   }

   public void t(int $$0) {
      this.an.b(bW, $$0);
   }

   public boolean q() {
      return this.w(2);
   }

   public boolean t() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean fZ() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gf() {
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gu() {
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

   public int gg() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public bux.a gh() {
      return bux.a.a(this.an.b(bZ));
   }

   public void a(bux.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bux.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bux.a gi() {
      return bux.a.a(this.an.b(ca));
   }

   public void b(bux.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bux.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean gj() {
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
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gh().c());
      $$0.a("HiddenGene", this.gi().c());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(bux.a.a($$0.l("MainGene")));
      this.b(bux.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      bux $$2 = bik.as.a((cpk)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bux $$3) {
            $$2.a(this, $$3);
         }

         $$2.gs();
      }

      return $$2;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(2, new bux.i(this, 2.0));
      this.bO.a(2, new bux.d(this, 1.0));
      this.bO.a(3, new bux.b(this, 1.2F, true));
      this.bO.a(4, new bra(this, 1.0, clw.a(csl.mZ.k()), false));
      this.bO.a(6, new bux.c<>(this, cbl.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bux.c<>(this, byz.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bux.k());
      this.bO.a(8, new bux.f(this));
      this.bO.a(8, new bux.l(this));
      this.cs = new bux.g(this, cbl.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bqn(this));
      this.bO.a(12, new bux.j(this));
      this.bO.a(13, new bpr(this, 1.25));
      this.bO.a(14, new brf(this, 1.0));
      this.bP.a(1, new bux.e(this).a(new Class[0]));
   }

   public static bkc.a gk() {
      return biy.x().a(bkd.d, 0.15F).a(bkd.f, 6.0);
   }

   public bux.a gl() {
      return bux.a.a(this.gh(), this.gi());
   }

   public boolean gm() {
      return this.gl() == bux.a.b;
   }

   public boolean gn() {
      return this.gl() == bux.a.c;
   }

   public boolean go() {
      return this.gl() == bux.a.d;
   }

   public boolean gp() {
      return this.gl() == bux.a.e;
   }

   public boolean gq() {
      return this.gl() == bux.a.f;
   }

   @Override
   public boolean fS() {
      return this.gl() == bux.a.g;
   }

   @Override
   public boolean a(cbl $$0) {
      return false;
   }

   @Override
   public boolean C(big $$0) {
      this.a(aou.qU, 1.0F, 1.0F);
      if (!this.fS()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gn()) {
         if (this.dK().Y() && !this.aX()) {
            this.w(true);
            this.y(false);
         } else if (!this.gf()) {
            this.w(false);
         }
      }

      biw $$0 = this.j();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(aou.qQ, 1.0F, 1.0F);
         }

         this.t(this.p() - 1);
      }

      if (this.q()) {
         this.u(this.gg() + 1);
         if (this.gg() > 20) {
            this.z(false);
            this.gB();
         } else if (this.gg() == 1) {
            this.a(aou.qK, 1.0F, 1.0F);
         }
      }

      if (this.gj()) {
         this.gA();
      } else {
         this.bU = 0;
      }

      if (this.t()) {
         this.s(0.0F);
      }

      this.gx();
      this.gv();
      this.gy();
      this.gz();
   }

   public boolean gr() {
      return this.gn() && this.dK().Y();
   }

   private void gv() {
      if (!this.gf() && this.t() && !this.gr() && !this.c(bil.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bil.a).b() || !this.t()) {
         this.y(false);
      }

      if (this.gf()) {
         this.gw();
         if (!this.dK().B && this.gu() > 80 && this.ag.a(20) == 1) {
            if (this.gu() > 100 && this.l(this.c(bil.a))) {
               if (!this.dK().B) {
                  this.a(bil.a, ciw.b);
                  this.a(dji.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gu() + 1);
      }
   }

   private void gw() {
      if (this.gu() % 5 == 0) {
         this.a(aou.qO, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ehf $$1 = new ehf(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dC() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dA() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ehf $$3 = new ehf(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dp(), this.dt() + 1.0, this.dv());
            this.dK().a(new is(iw.O, this.c(bil.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gx() {
      this.cn = this.cm;
      if (this.t()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gy() {
      this.cp = this.co;
      if (this.fZ()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gz() {
      this.cr = this.cq;
      if (this.gj()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return aro.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return aro.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return aro.i($$0, this.cr, this.cq);
   }

   private void gA() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dK().B) {
            ehf $$0 = this.dn();
            if (this.bU == 1) {
               float $$1 = this.dA() * (float) (Math.PI / 180.0);
               float $$2 = this.i_() ? 0.1F : 0.2F;
               this.cl = new ehf($$0.c + (double)(-aro.a($$1) * $$2), 0.0, $$0.e + (double)(aro.b($$1) * $$2));
               this.f(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aA() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gB() {
      ehf $$0 = this.dn();
      this.dK()
         .a(
            iw.aa,
            this.dp() - (double)(this.df() + 1.0F) * 0.5 * (double)aro.a(this.aU * (float) (Math.PI / 180.0)),
            this.dt() - 0.1F,
            this.dv() + (double)(this.df() + 1.0F) * 0.5 * (double)aro.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aou.qL, 1.0F, 1.0F);

      for (bux $$2 : this.dK().a(bux.class, this.cG().g(10.0))) {
         if (!$$2.i_() && $$2.aA() && !$$2.aX() && $$2.gt()) {
            $$2.eZ();
         }
      }

      if (!this.dK().r_() && this.ag.a(700) == 0 && this.dK().X().b(cpg.f)) {
         this.a(ciz.qc);
      }
   }

   @Override
   protected void b(bye $$0) {
      if (this.c(bil.a).b() && ct.test($$0)) {
         this.a($$0);
         ciw $$1 = $$0.j();
         this.a(bil.a, $$1);
         this.e(bil.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (!this.dK().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      this.a(bux.a.a($$5));
      this.b(bux.a.a($$5));
      this.gs();
      if ($$3 == null) {
         $$3 = new bib.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bux $$0, @Nullable bux $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gC());
            this.b(bux.a.a(this.ag));
         } else {
            this.a(bux.a.a(this.ag));
            this.b($$0.gC());
         }
      } else if (this.ag.h()) {
         this.a($$0.gC());
         this.b($$1.gC());
      } else {
         this.a($$1.gC());
         this.b($$0.gC());
      }

      if (this.ag.a(32) == 0) {
         this.a(bux.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bux.a.a(this.ag));
      }
   }

   private bux.a gC() {
      return this.ag.h() ? this.gh() : this.gi();
   }

   public void gs() {
      if (this.gq()) {
         this.a(bkd.a).a(10.0);
      }

      if (this.gm()) {
         this.a(bkd.d).a(0.07F);
      }
   }

   void gD() {
      if (!this.aX()) {
         this.A(0.0F);
         this.H().n();
         this.w(true);
      }
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (this.gr()) {
         return bgo.d;
      } else if (this.fZ()) {
         this.x(false);
         return bgo.a(this.dK().B);
      } else if (this.m($$2)) {
         if (this.j() != null) {
            this.cj = true;
         }

         if (this.i_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dK().B && this.h() == 0 && this.ga()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dK().B || this.t() || this.aX()) {
               return bgo.d;
            }

            this.gD();
            this.y(true);
            ciw $$3 = this.c(bil.a);
            if (!$$3.b() && !$$0.fR().d) {
               this.b($$3);
            }

            this.a(bil.a, new ciw($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bgo.a;
      } else {
         return bgo.d;
      }
   }

   @Nullable
   @Override
   protected aot r() {
      if (this.fS()) {
         return aou.qR;
      } else {
         return this.gn() ? aou.qS : aou.qM;
      }
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(csl.mZ.k());
   }

   private boolean l(ciw $$0) {
      return this.m($$0) || $$0.a(csl.eh.k());
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.qN;
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.qT;
   }

   public boolean gt() {
      return !this.fZ() && !this.gr() && !this.gf() && !this.gj() && !this.t();
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements asf {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final asf.a<bux.a> h = asf.a(bux.a::values);
      private static final IntFunction<bux.a> i = aqi.a(bux.a::a, values(), aqi.a.a);
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

      static bux.a a(bux.a $$0, bux.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bux.a a(int $$0) {
         return i.apply($$0);
      }

      public static bux.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bux.a a(art $$0) {
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

   static class b extends bqc {
      private final bux b;

      public b(bux $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gt() && super.a();
      }
   }

   static class c<T extends biw> extends boz<T> {
      private final bux i;

      public c(bux $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bij.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && this.i.gt() && super.a();
      }
   }

   static class d extends bpe {
      private final bux d;
      private int e;

      public d(bux $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.p() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.t(32);
               this.e = this.d.ah + 600;
               if (this.d.cX()) {
                  cbl $$0 = this.b.a(bux.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gv $$0 = this.d.dk();
         gv.a $$1 = new gv.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(csl.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends brk {
      private final bux a;

      public e(bux $$0, Class<?>... $$1) {
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
      protected void a(biy $$0, biw $$1) {
         if ($$0 instanceof bux && $$0.fS()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bps {
      private final bux a;
      private int b;

      public f(bux $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gm() && this.a.gt() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aX() && (this.a.gm() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bqa {
      private final bux h;

      public g(bux $$0, Class<? extends biw> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(biw $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ee().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cbl.class) {
                  this.c = this.b.dK().a(this.g, this.b, this.b.dp(), this.b.dt(), this.b.dv());
               } else {
                  this.c = this.b
                     .dK()
                     .a(
                        this.b.dK().a(this.f, this.b.cG().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dp(),
                        this.b.dt(),
                        this.b.dv()
                     );
               }
            }

            return this.h.gt() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bov {
      private final bux l;

      public h(bux $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gt()) {
            super.a();
         }
      }
   }

   static class i extends bql {
      private final bux h;

      public i(bux $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dz() || this.b.bM();
      }

      @Override
      public boolean b() {
         if (this.h.t()) {
            this.h.H().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bps {
      private final bux a;

      public j(bux $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.a, bps.a.b, bps.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.i_() || this.a.go()) && this.a.aA()) {
            if (!this.a.gt()) {
               return false;
            } else {
               float $$0 = this.a.dA() * (float) (Math.PI / 180.0);
               float $$1 = -aro.a($$0);
               float $$2 = aro.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aro.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aro.j((double)$$2) : 0;
               if (this.a.dK().a_(this.a.dk().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.go() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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
      public boolean J_() {
         return false;
      }
   }

   class k extends bps {
      private int b;

      public k() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bux.this.ah && !bux.this.i_() && !bux.this.aX() && bux.this.gt() && bux.this.p() <= 0) {
            List<bye> $$0 = bux.this.dK().a(bye.class, bux.this.cG().c(6.0, 6.0, 6.0), bux.ct);
            return !$$0.isEmpty() || !bux.this.c(bil.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bux.this.aX() && (bux.this.gm() || bux.this.ag.a(b(600)) != 1) ? bux.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bux.this.t() && !bux.this.c(bil.a).b()) {
            bux.this.gD();
         }
      }

      @Override
      public void c() {
         List<bye> $$0 = bux.this.dK().a(bye.class, bux.this.cG().c(8.0, 8.0, 8.0), bux.ct);
         if (!$$0.isEmpty() && bux.this.c(bil.a).b()) {
            bux.this.H().a($$0.get(0), 1.2F);
         } else if (!bux.this.c(bil.a).b()) {
            bux.this.gD();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ciw $$0 = bux.this.c(bil.a);
         if (!$$0.b()) {
            bux.this.b($$0);
            bux.this.a(bil.a, ciw.b);
            int $$1 = bux.this.gm() ? bux.this.ag.a(50) + 10 : bux.this.ag.a(150) + 10;
            this.b = bux.this.ah + $$1 * 20;
         }

         bux.this.w(false);
      }
   }

   static class l extends bps {
      private final bux a;

      public l(bux $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.i_() && this.a.gt()) {
            return this.a.gq() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
