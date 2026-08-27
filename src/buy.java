import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buy extends buj {
   private static final adz<Integer> bW = aec.a(buy.class, aeb.b);
   private static final adz<Integer> bX = aec.a(buy.class, aeb.b);
   private static final adz<Integer> bY = aec.a(buy.class, aeb.b);
   private static final adz<Byte> bZ = aec.a(buy.class, aeb.a);
   private static final adz<Byte> ca = aec.a(buy.class, aeb.a);
   private static final adz<Byte> cb = aec.a(buy.class, aeb.a);
   static final btk cc = btk.b().a(8.0);
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
   private ehd cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   buy.g cs;
   static final Predicate<byf> ct = $$0 -> {
      cix $$1 = $$0.j();
      return ($$1.a(csm.mZ.k()) || $$1.a(csm.eh.k())) && $$0.bv() && !$$0.r();
   };

   public buy(bim<? extends buy> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new buy.h(this);
      if (!this.i_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cix $$0) {
      bin $$1 = bja.h($$0);
      return !this.c($$1).b() ? false : $$1 == bin.a && super.f($$0);
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

   public boolean ga() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gg() {
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gv() {
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

   public int gh() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public buy.a gi() {
      return buy.a.a(this.an.b(bZ));
   }

   public void a(buy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = buy.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public buy.a gj() {
      return buy.a.a(this.an.b(ca));
   }

   public void b(buy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = buy.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean gk() {
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gi().c());
      $$0.a("HiddenGene", this.gj().c());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(buy.a.a($$0.l("MainGene")));
      this.b(buy.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      buy $$2 = bim.as.a((cpl)$$0);
      if ($$2 != null) {
         if ($$1 instanceof buy $$3) {
            $$2.a(this, $$3);
         }

         $$2.gt();
      }

      return $$2;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpn(this));
      this.bO.a(2, new buy.i(this, 2.0));
      this.bO.a(2, new buy.d(this, 1.0));
      this.bO.a(3, new buy.b(this, 1.2F, true));
      this.bO.a(4, new brb(this, 1.0, clx.a(csm.mZ.k()), false));
      this.bO.a(6, new buy.c<>(this, cbm.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new buy.c<>(this, bza.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new buy.k());
      this.bO.a(8, new buy.f(this));
      this.bO.a(8, new buy.l(this));
      this.cs = new buy.g(this, cbm.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bqo(this));
      this.bO.a(12, new buy.j(this));
      this.bO.a(13, new bps(this, 1.25));
      this.bO.a(14, new brg(this, 1.0));
      this.bP.a(1, new buy.e(this).a(new Class[0]));
   }

   public static bkd.a gl() {
      return bja.x().a(bke.d, 0.15F).a(bke.f, 6.0);
   }

   public buy.a gm() {
      return buy.a.a(this.gi(), this.gj());
   }

   public boolean gn() {
      return this.gm() == buy.a.b;
   }

   public boolean go() {
      return this.gm() == buy.a.c;
   }

   public boolean gp() {
      return this.gm() == buy.a.d;
   }

   public boolean gq() {
      return this.gm() == buy.a.e;
   }

   public boolean gr() {
      return this.gm() == buy.a.f;
   }

   @Override
   public boolean fS() {
      return this.gm() == buy.a.g;
   }

   @Override
   public boolean a(cbm $$0) {
      return false;
   }

   @Override
   public boolean C(bii $$0) {
      this.a(aow.qU, 1.0F, 1.0F);
      if (!this.fS()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.go()) {
         if (this.dK().Y() && !this.aX()) {
            this.w(true);
            this.y(false);
         } else if (!this.gg()) {
            this.w(false);
         }
      }

      biy $$0 = this.j();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(aow.qQ, 1.0F, 1.0F);
         }

         this.t(this.p() - 1);
      }

      if (this.q()) {
         this.u(this.gh() + 1);
         if (this.gh() > 20) {
            this.z(false);
            this.gC();
         } else if (this.gh() == 1) {
            this.a(aow.qK, 1.0F, 1.0F);
         }
      }

      if (this.gk()) {
         this.gB();
      } else {
         this.bU = 0;
      }

      if (this.t()) {
         this.s(0.0F);
      }

      this.gy();
      this.gw();
      this.gz();
      this.gA();
   }

   public boolean gs() {
      return this.go() && this.dK().Y();
   }

   private void gw() {
      if (!this.gg() && this.t() && !this.gs() && !this.c(bin.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bin.a).b() || !this.t()) {
         this.y(false);
      }

      if (this.gg()) {
         this.gx();
         if (!this.dK().B && this.gv() > 80 && this.ag.a(20) == 1) {
            if (this.gv() > 100 && this.l(this.c(bin.a))) {
               if (!this.dK().B) {
                  this.a(bin.a, cix.b);
                  this.a(djj.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gv() + 1);
      }
   }

   private void gx() {
      if (this.gv() % 5 == 0) {
         this.a(aow.qO, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ehd $$1 = new ehd(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dC() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dA() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ehd $$3 = new ehd(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dp(), this.dt() + 1.0, this.dv());
            this.dK().a(new ir(iv.O, this.c(bin.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gy() {
      this.cn = this.cm;
      if (this.t()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gz() {
      this.cp = this.co;
      if (this.ga()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gA() {
      this.cr = this.cq;
      if (this.gk()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return arp.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return arp.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return arp.i($$0, this.cr, this.cq);
   }

   private void gB() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dK().B) {
            ehd $$0 = this.dn();
            if (this.bU == 1) {
               float $$1 = this.dA() * (float) (Math.PI / 180.0);
               float $$2 = this.i_() ? 0.1F : 0.2F;
               this.cl = new ehd($$0.c + (double)(-arp.a($$1) * $$2), 0.0, $$0.e + (double)(arp.b($$1) * $$2));
               this.f(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aA() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gC() {
      ehd $$0 = this.dn();
      this.dK()
         .a(
            iv.aa,
            this.dp() - (double)(this.df() + 1.0F) * 0.5 * (double)arp.a(this.aU * (float) (Math.PI / 180.0)),
            this.dt() - 0.1F,
            this.dv() + (double)(this.df() + 1.0F) * 0.5 * (double)arp.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aow.qL, 1.0F, 1.0F);

      for (buy $$2 : this.dK().a(buy.class, this.cG().g(10.0))) {
         if (!$$2.i_() && $$2.aA() && !$$2.aX() && $$2.gu()) {
            $$2.eZ();
         }
      }

      if (!this.dK().r_() && this.ag.a(700) == 0 && this.dK().X().b(cph.f)) {
         this.a(cja.qc);
      }
   }

   @Override
   protected void b(byf $$0) {
      if (this.c(bin.a).b() && ct.test($$0)) {
         this.a($$0);
         cix $$1 = $$0.j();
         this.a(bin.a, $$1);
         this.e(bin.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (!this.dK().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a(buy.a.a($$5));
      this.b(buy.a.a($$5));
      this.gt();
      if ($$3 == null) {
         $$3 = new bid.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(buy $$0, @Nullable buy $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gD());
            this.b(buy.a.a(this.ag));
         } else {
            this.a(buy.a.a(this.ag));
            this.b($$0.gD());
         }
      } else if (this.ag.h()) {
         this.a($$0.gD());
         this.b($$1.gD());
      } else {
         this.a($$1.gD());
         this.b($$0.gD());
      }

      if (this.ag.a(32) == 0) {
         this.a(buy.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(buy.a.a(this.ag));
      }
   }

   private buy.a gD() {
      return this.ag.h() ? this.gi() : this.gj();
   }

   public void gt() {
      if (this.gr()) {
         this.a(bke.a).a(10.0);
      }

      if (this.gn()) {
         this.a(bke.d).a(0.07F);
      }
   }

   void gE() {
      if (!this.aX()) {
         this.A(0.0F);
         this.H().n();
         this.w(true);
      }
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if (this.gs()) {
         return bgq.d;
      } else if (this.ga()) {
         this.x(false);
         return bgq.a(this.dK().B);
      } else if (this.m($$2)) {
         if (this.j() != null) {
            this.cj = true;
         }

         if (this.i_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dK().B && this.h() == 0 && this.gb()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dK().B || this.t() || this.aX()) {
               return bgq.d;
            }

            this.gE();
            this.y(true);
            cix $$3 = this.c(bin.a);
            if (!$$3.b() && !$$0.fR().d) {
               this.b($$3);
            }

            this.a(bin.a, new cix($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bgq.a;
      } else {
         return bgq.d;
      }
   }

   @Nullable
   @Override
   protected aov r() {
      if (this.fS()) {
         return aow.qR;
      } else {
         return this.go() ? aow.qS : aow.qM;
      }
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cix $$0) {
      return $$0.a(csm.mZ.k());
   }

   private boolean l(cix $$0) {
      return this.m($$0) || $$0.a(csm.eh.k());
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.qN;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.qT;
   }

   public boolean gu() {
      return !this.ga() && !this.gs() && !this.gg() && !this.gk() && !this.t();
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements ash {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ash.a<buy.a> h = ash.a(buy.a::values);
      private static final IntFunction<buy.a> i = aqk.a(buy.a::a, values(), aqk.a.a);
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

      static buy.a a(buy.a $$0, buy.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static buy.a a(int $$0) {
         return i.apply($$0);
      }

      public static buy.a a(String $$0) {
         return h.a($$0, a);
      }

      public static buy.a a(aru $$0) {
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

   static class b extends bqd {
      private final buy b;

      public b(buy $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gu() && super.a();
      }
   }

   static class c<T extends biy> extends bpa<T> {
      private final buy i;

      public c(buy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bil.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.go() && this.i.gu() && super.a();
      }
   }

   static class d extends bpf {
      private final buy d;
      private int e;

      public d(buy $$0, double $$1) {
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
                  cbm $$0 = this.b.a(buy.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gu $$0 = this.d.dk();
         gu.a $$1 = new gu.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(csm.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends brl {
      private final buy a;

      public e(buy $$0, Class<?>... $$1) {
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
      protected void a(bja $$0, biy $$1) {
         if ($$0 instanceof buy && $$0.fS()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bpt {
      private final buy a;
      private int b;

      public f(buy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gn() && this.a.gu() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aX() && (this.a.gn() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bqb {
      private final buy h;

      public g(buy $$0, Class<? extends biy> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(biy $$0) {
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
               if (this.f == cbm.class) {
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

            return this.h.gu() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bow {
      private final buy l;

      public h(buy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gu()) {
            super.a();
         }
      }
   }

   static class i extends bqm {
      private final buy h;

      public i(buy $$0, double $$1) {
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

   static class j extends bpt {
      private final buy a;

      public j(buy $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.a, bpt.a.b, bpt.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.i_() || this.a.gp()) && this.a.aA()) {
            if (!this.a.gu()) {
               return false;
            } else {
               float $$0 = this.a.dA() * (float) (Math.PI / 180.0);
               float $$1 = -arp.a($$0);
               float $$2 = arp.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? arp.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? arp.j((double)$$2) : 0;
               if (this.a.dK().a_(this.a.dk().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gp() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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

   class k extends bpt {
      private int b;

      public k() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= buy.this.ah && !buy.this.i_() && !buy.this.aX() && buy.this.gu() && buy.this.p() <= 0) {
            List<byf> $$0 = buy.this.dK().a(byf.class, buy.this.cG().c(6.0, 6.0, 6.0), buy.ct);
            return !$$0.isEmpty() || !buy.this.c(bin.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !buy.this.aX() && (buy.this.gn() || buy.this.ag.a(b(600)) != 1) ? buy.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!buy.this.t() && !buy.this.c(bin.a).b()) {
            buy.this.gE();
         }
      }

      @Override
      public void c() {
         List<byf> $$0 = buy.this.dK().a(byf.class, buy.this.cG().c(8.0, 8.0, 8.0), buy.ct);
         if (!$$0.isEmpty() && buy.this.c(bin.a).b()) {
            buy.this.H().a($$0.get(0), 1.2F);
         } else if (!buy.this.c(bin.a).b()) {
            buy.this.gE();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cix $$0 = buy.this.c(bin.a);
         if (!$$0.b()) {
            buy.this.b($$0);
            buy.this.a(bin.a, cix.b);
            int $$1 = buy.this.gn() ? buy.this.ag.a(50) + 10 : buy.this.ag.a(150) + 10;
            this.b = buy.this.ah + $$1 * 20;
         }

         buy.this.w(false);
      }
   }

   static class l extends bpt {
      private final buy a;

      public l(buy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.i_() && this.a.gu()) {
            return this.a.gr() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
