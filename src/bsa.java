import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsa extends brl {
   private static final aby<Integer> bW = acb.a(bsa.class, aca.b);
   private static final aby<Integer> bX = acb.a(bsa.class, aca.b);
   private static final aby<Integer> bY = acb.a(bsa.class, aca.b);
   private static final aby<Byte> bZ = acb.a(bsa.class, aca.a);
   private static final aby<Byte> ca = acb.a(bsa.class, aca.a);
   private static final aby<Byte> cb = acb.a(bsa.class, aca.a);
   static final bqm cc = bqm.b().a(8.0);
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
   private eei cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bsa.g cs;
   static final Predicate<bvh> ct = $$0 -> {
      cfz $$1 = $$0.j();
      return ($$1.a(cpo.mZ.k()) || $$1.a(cpo.eh.k())) && $$0.bs() && !$$0.r();
   };

   public bsa(bfn<? extends bsa> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new bsa.h(this);
      if (!this.h_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cfz $$0) {
      bfo $$1 = bgb.h($$0);
      return !this.c($$1).b() ? false : $$1 == bfo.a && super.f($$0);
   }

   public int q() {
      return this.am.b(bW);
   }

   public void t(int $$0) {
      this.am.b(bW, $$0);
   }

   public boolean r() {
      return this.w(2);
   }

   public boolean w() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean fY() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean ge() {
      return this.am.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.am.b(bY, $$0 ? 1 : 0);
   }

   private int gt() {
      return this.am.b(bY);
   }

   private void v(int $$0) {
      this.am.b(bY, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gf() {
      return this.am.b(bX);
   }

   public void u(int $$0) {
      this.am.b(bX, $$0);
   }

   public bsa.a gg() {
      return bsa.a.a(this.am.b(bZ));
   }

   public void a(bsa.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bsa.a.a(this.af);
      }

      this.am.b(bZ, (byte)$$0.a());
   }

   public bsa.a gh() {
      return bsa.a.a(this.am.b(ca));
   }

   public void b(bsa.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bsa.a.a(this.af);
      }

      this.am.b(ca, (byte)$$0.a());
   }

   public boolean gi() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bW, 0);
      this.am.a(bX, 0);
      this.am.a(bZ, (byte)0);
      this.am.a(ca, (byte)0);
      this.am.a(cb, (byte)0);
      this.am.a(bY, 0);
   }

   private boolean w(int $$0) {
      return (this.am.b(cb) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.b(cb);
      if ($$1) {
         this.am.b(cb, (byte)($$2 | $$0));
      } else {
         this.am.b(cb, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gg().c());
      $$0.a("HiddenGene", this.gh().c());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bsa.a.a($$0.l("MainGene")));
      this.b(bsa.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      bsa $$2 = bfn.as.a((cmm)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bsa $$3) {
            $$2.a(this, $$3);
         }

         $$2.gr();
      }

      return $$2;
   }

   @Override
   protected void x() {
      this.bO.a(0, new bmp(this));
      this.bO.a(2, new bsa.i(this, 2.0));
      this.bO.a(2, new bsa.d(this, 1.0));
      this.bO.a(3, new bsa.b(this, 1.2F, true));
      this.bO.a(4, new bod(this, 1.0, ciz.a(cpo.mZ.k()), false));
      this.bO.a(6, new bsa.c<>(this, byo.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bsa.c<>(this, bwc.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bsa.k());
      this.bO.a(8, new bsa.f(this));
      this.bO.a(8, new bsa.l(this));
      this.cs = new bsa.g(this, byo.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bnq(this));
      this.bO.a(12, new bsa.j(this));
      this.bO.a(13, new bmu(this, 1.25));
      this.bO.a(14, new boi(this, 1.0));
      this.bP.a(1, new bsa.e(this).a(new Class[0]));
   }

   public static bhf.a gj() {
      return bgb.y().a(bhg.d, 0.15F).a(bhg.f, 6.0);
   }

   public bsa.a gk() {
      return bsa.a.a(this.gg(), this.gh());
   }

   public boolean gl() {
      return this.gk() == bsa.a.b;
   }

   public boolean gm() {
      return this.gk() == bsa.a.c;
   }

   public boolean gn() {
      return this.gk() == bsa.a.d;
   }

   public boolean go() {
      return this.gk() == bsa.a.e;
   }

   public boolean gp() {
      return this.gk() == bsa.a.f;
   }

   @Override
   public boolean fS() {
      return this.gk() == bsa.a.g;
   }

   @Override
   public boolean a(byo $$0) {
      return false;
   }

   @Override
   public boolean z(bfj $$0) {
      this.a(amh.qU, 1.0F, 1.0F);
      if (!this.fS()) {
         this.ck = true;
      }

      return super.z($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gm()) {
         if (this.dI().Y() && !this.aV()) {
            this.w(true);
            this.y(false);
         } else if (!this.ge()) {
            this.w(false);
         }
      }

      bfz $$0 = this.j();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(amh.qQ, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.r()) {
         this.u(this.gf() + 1);
         if (this.gf() > 20) {
            this.z(false);
            this.gA();
         } else if (this.gf() == 1) {
            this.a(amh.qK, 1.0F, 1.0F);
         }
      }

      if (this.gi()) {
         this.gz();
      } else {
         this.bU = 0;
      }

      if (this.w()) {
         this.b_(0.0F);
      }

      this.gw();
      this.gu();
      this.gx();
      this.gy();
   }

   public boolean gq() {
      return this.gm() && this.dI().Y();
   }

   private void gu() {
      if (!this.ge() && this.w() && !this.gq() && !this.c(bfo.a).b() && this.af.a(80) == 1) {
         this.y(true);
      } else if (this.c(bfo.a).b() || !this.w()) {
         this.y(false);
      }

      if (this.ge()) {
         this.gv();
         if (!this.dI().B && this.gt() > 80 && this.af.a(20) == 1) {
            if (this.gt() > 100 && this.l(this.c(bfo.a))) {
               if (!this.dI().B) {
                  this.a(bfo.a, cfz.b);
                  this.a(dgl.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gt() + 1);
      }
   }

   private void gv() {
      if (this.gt() % 5 == 0) {
         this.a(amh.qO, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eei $$1 = new eei(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dA() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dy() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            eei $$3 = new eei(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aV * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dn(), this.dr() + 1.0, this.dt());
            this.dI().a(new ir(iv.O, this.c(bfo.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gw() {
      this.cn = this.cm;
      if (this.w()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gx() {
      this.cp = this.co;
      if (this.fY()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gy() {
      this.cr = this.cq;
      if (this.gi()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float D(float $$0) {
      return apa.i($$0, this.cn, this.cm);
   }

   public float E(float $$0) {
      return apa.i($$0, this.cp, this.co);
   }

   public float F(float $$0) {
      return apa.i($$0, this.cr, this.cq);
   }

   private void gz() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dI().B) {
            eei $$0 = this.dl();
            if (this.bU == 1) {
               float $$1 = this.dy() * (float) (Math.PI / 180.0);
               float $$2 = this.h_() ? 0.1F : 0.2F;
               this.cl = new eei($$0.c + (double)(-apa.a($$1) * $$2), 0.0, $$0.e + (double)(apa.b($$1) * $$2));
               this.f(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.ay() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gA() {
      eei $$0 = this.dl();
      this.dI()
         .a(
            iv.aa,
            this.dn() - (double)(this.dd() + 1.0F) * 0.5 * (double)apa.a(this.aV * (float) (Math.PI / 180.0)),
            this.dr() - 0.1F,
            this.dt() + (double)(this.dd() + 1.0F) * 0.5 * (double)apa.b(this.aV * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(amh.qL, 1.0F, 1.0F);

      for (bsa $$2 : this.dI().a(bsa.class, this.cE().g(10.0))) {
         if (!$$2.h_() && $$2.ay() && !$$2.aV() && $$2.gs()) {
            $$2.eW();
         }
      }

      if (!this.dI().r_() && this.af.a(700) == 0 && this.dI().X().b(cmi.f)) {
         this.a(cgc.qc);
      }
   }

   @Override
   protected void b(bvh $$0) {
      if (this.c(bfo.a).b() && ct.test($$0)) {
         this.a($$0);
         cfz $$1 = $$0.j();
         this.a(bfo.a, $$1);
         this.e(bfo.a);
         this.a($$0, $$1.L());
         $$0.ai();
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (!this.dI().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      this.a(bsa.a.a($$5));
      this.b(bsa.a.a($$5));
      this.gr();
      if ($$3 == null) {
         $$3 = new bfe.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bsa $$0, @Nullable bsa $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gB());
            this.b(bsa.a.a(this.af));
         } else {
            this.a(bsa.a.a(this.af));
            this.b($$0.gB());
         }
      } else if (this.af.h()) {
         this.a($$0.gB());
         this.b($$1.gB());
      } else {
         this.a($$1.gB());
         this.b($$0.gB());
      }

      if (this.af.a(32) == 0) {
         this.a(bsa.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(bsa.a.a(this.af));
      }
   }

   private bsa.a gB() {
      return this.af.h() ? this.gg() : this.gh();
   }

   public void gr() {
      if (this.gp()) {
         this.a(bhg.a).a(10.0);
      }

      if (this.gl()) {
         this.a(bhg.d).a(0.07F);
      }
   }

   void gC() {
      if (!this.aV()) {
         this.z(0.0F);
         this.J().n();
         this.w(true);
      }
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (this.gq()) {
         return bdx.d;
      } else if (this.fY()) {
         this.x(false);
         return bdx.a(this.dI().B);
      } else if (this.m($$2)) {
         if (this.j() != null) {
            this.cj = true;
         }

         if (this.h_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dI().B && this.h() == 0 && this.fZ()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dI().B || this.w() || this.aV()) {
               return bdx.d;
            }

            this.gC();
            this.y(true);
            cfz $$3 = this.c(bfo.a);
            if (!$$3.b() && !$$0.fO().d) {
               this.b($$3);
            }

            this.a(bfo.a, new cfz($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bdx.a;
      } else {
         return bdx.d;
      }
   }

   @Nullable
   @Override
   protected amg s() {
      if (this.fS()) {
         return amh.qR;
      } else {
         return this.gm() ? amh.qS : amh.qM;
      }
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cfz $$0) {
      return $$0.a(cpo.mZ.k());
   }

   private boolean l(cfz $$0) {
      return this.m($$0) || $$0.a(cpo.eh.k());
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.qN;
   }

   @Nullable
   @Override
   protected amg d(ben $$0) {
      return amh.qT;
   }

   public boolean gs() {
      return !this.fY() && !this.gq() && !this.ge() && !this.gi() && !this.w();
   }

   public static enum a implements apr {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final apr.a<bsa.a> h = apr.a(bsa.a::values);
      private static final IntFunction<bsa.a> i = anu.a(bsa.a::a, values(), anu.a.a);
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

      static bsa.a a(bsa.a $$0, bsa.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bsa.a a(int $$0) {
         return i.apply($$0);
      }

      public static bsa.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bsa.a a(apf $$0) {
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

   static class b extends bnf {
      private final bsa b;

      public b(bsa $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gs() && super.a();
      }
   }

   static class c<T extends bfz> extends bmc<T> {
      private final bsa i;

      public c(bsa $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bfm.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gm() && this.i.gs() && super.a();
      }
   }

   static class d extends bmh {
      private final bsa d;
      private int e;

      public d(bsa $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.q() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ag) {
               this.d.t(32);
               this.e = this.d.ag + 600;
               if (this.d.cV()) {
                  byo $$0 = this.b.a(bsa.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gu $$0 = this.d.di();
         gu.a $$1 = new gu.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cpo.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bon {
      private final bsa a;

      public e(bsa $$0, Class<?>... $$1) {
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
      protected void a(bgb $$0, bfz $$1) {
         if ($$0 instanceof bsa && $$0.fS()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bmv {
      private final bsa a;
      private int b;

      public f(bsa $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ag && this.a.gl() && this.a.gs() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aV() && (this.a.gl() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
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

   static class g extends bnd {
      private final bsa h;

      public g(bsa $$0, Class<? extends bfz> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bfz $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ec().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == byo.class) {
                  this.c = this.b.dI().a(this.g, this.b, this.b.dn(), this.b.dr(), this.b.dt());
               } else {
                  this.c = this.b
                     .dI()
                     .a(
                        this.b.dI().a(this.f, this.b.cE().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dn(),
                        this.b.dr(),
                        this.b.dt()
                     );
               }
            }

            return this.h.gs() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bly {
      private final bsa l;

      public h(bsa $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gs()) {
            super.a();
         }
      }
   }

   static class i extends bno {
      private final bsa h;

      public i(bsa $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dx() || this.b.bL();
      }

      @Override
      public boolean b() {
         if (this.h.w()) {
            this.h.J().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bmv {
      private final bsa a;

      public j(bsa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.a, bmv.a.b, bmv.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.h_() || this.a.gn()) && this.a.ay()) {
            if (!this.a.gs()) {
               return false;
            } else {
               float $$0 = this.a.dy() * (float) (Math.PI / 180.0);
               float $$1 = -apa.a($$0);
               float $$2 = apa.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? apa.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? apa.j((double)$$2) : 0;
               if (this.a.dI().a_(this.a.di().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gn() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
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

   class k extends bmv {
      private int b;

      public k() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bsa.this.ag && !bsa.this.h_() && !bsa.this.aV() && bsa.this.gs() && bsa.this.q() <= 0) {
            List<bvh> $$0 = bsa.this.dI().a(bvh.class, bsa.this.cE().c(6.0, 6.0, 6.0), bsa.ct);
            return !$$0.isEmpty() || !bsa.this.c(bfo.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bsa.this.aV() && (bsa.this.gl() || bsa.this.af.a(b(600)) != 1) ? bsa.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bsa.this.w() && !bsa.this.c(bfo.a).b()) {
            bsa.this.gC();
         }
      }

      @Override
      public void c() {
         List<bvh> $$0 = bsa.this.dI().a(bvh.class, bsa.this.cE().c(8.0, 8.0, 8.0), bsa.ct);
         if (!$$0.isEmpty() && bsa.this.c(bfo.a).b()) {
            bsa.this.J().a($$0.get(0), 1.2F);
         } else if (!bsa.this.c(bfo.a).b()) {
            bsa.this.gC();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cfz $$0 = bsa.this.c(bfo.a);
         if (!$$0.b()) {
            bsa.this.b($$0);
            bsa.this.a(bfo.a, cfz.b);
            int $$1 = bsa.this.gl() ? bsa.this.af.a(50) + 10 : bsa.this.af.a(150) + 10;
            this.b = bsa.this.ag + $$1 * 20;
         }

         bsa.this.w(false);
      }
   }

   static class l extends bmv {
      private final bsa a;

      public l(bsa $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.h_() && this.a.gs()) {
            return this.a.gp() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
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
