import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buz extends buk {
   private static final adz<Integer> bW = aec.a(buz.class, aeb.b);
   private static final adz<Integer> bX = aec.a(buz.class, aeb.b);
   private static final adz<Integer> bY = aec.a(buz.class, aeb.b);
   private static final adz<Byte> bZ = aec.a(buz.class, aeb.a);
   private static final adz<Byte> ca = aec.a(buz.class, aeb.a);
   private static final adz<Byte> cb = aec.a(buz.class, aeb.a);
   static final btl cc = btl.b().a(8.0);
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
   private ehe cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   buz.g cs;
   static final Predicate<byg> ct = $$0 -> {
      ciy $$1 = $$0.j();
      return ($$1.a(csn.mZ.k()) || $$1.a(csn.eh.k())) && $$0.bv() && !$$0.r();
   };

   public buz(bim<? extends buz> $$0, cpm $$1) {
      super($$0, $$1);
      this.bL = new buz.h(this);
      if (!this.i_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(ciy $$0) {
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

   public buz.a gh() {
      return buz.a.a(this.an.b(bZ));
   }

   public void a(buz.a $$0) {
      if ($$0.a() > 6) {
         $$0 = buz.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public buz.a gi() {
      return buz.a.a(this.an.b(ca));
   }

   public void b(buz.a $$0) {
      if ($$0.a() > 6) {
         $$0 = buz.a.a(this.ag);
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gh().c());
      $$0.a("HiddenGene", this.gi().c());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(buz.a.a($$0.l("MainGene")));
      this.b(buz.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      buz $$2 = bim.as.a((cpm)$$0);
      if ($$2 != null) {
         if ($$1 instanceof buz $$3) {
            $$2.a(this, $$3);
         }

         $$2.gs();
      }

      return $$2;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpo(this));
      this.bO.a(2, new buz.i(this, 2.0));
      this.bO.a(2, new buz.d(this, 1.0));
      this.bO.a(3, new buz.b(this, 1.2F, true));
      this.bO.a(4, new brc(this, 1.0, cly.a(csn.mZ.k()), false));
      this.bO.a(6, new buz.c<>(this, cbn.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new buz.c<>(this, bzb.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new buz.k());
      this.bO.a(8, new buz.f(this));
      this.bO.a(8, new buz.l(this));
      this.cs = new buz.g(this, cbn.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bqp(this));
      this.bO.a(12, new buz.j(this));
      this.bO.a(13, new bpt(this, 1.25));
      this.bO.a(14, new brh(this, 1.0));
      this.bP.a(1, new buz.e(this).a(new Class[0]));
   }

   public static bke.a gk() {
      return bja.x().a(bkf.d, 0.15F).a(bkf.f, 6.0);
   }

   public buz.a gl() {
      return buz.a.a(this.gh(), this.gi());
   }

   public boolean gm() {
      return this.gl() == buz.a.b;
   }

   public boolean gn() {
      return this.gl() == buz.a.c;
   }

   public boolean go() {
      return this.gl() == buz.a.d;
   }

   public boolean gp() {
      return this.gl() == buz.a.e;
   }

   public boolean gq() {
      return this.gl() == buz.a.f;
   }

   @Override
   public boolean fS() {
      return this.gl() == buz.a.g;
   }

   @Override
   public boolean a(cbn $$0) {
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
      if (this.gn()) {
         if (this.dK().Y() && !this.aX()) {
            this.w(true);
            this.y(false);
         } else if (!this.gf()) {
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
         this.u(this.gg() + 1);
         if (this.gg() > 20) {
            this.z(false);
            this.gB();
         } else if (this.gg() == 1) {
            this.a(aow.qK, 1.0F, 1.0F);
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
      if (!this.gf() && this.t() && !this.gr() && !this.c(bin.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bin.a).b() || !this.t()) {
         this.y(false);
      }

      if (this.gf()) {
         this.gw();
         if (!this.dK().B && this.gu() > 80 && this.ag.a(20) == 1) {
            if (this.gu() > 100 && this.l(this.c(bin.a))) {
               if (!this.dK().B) {
                  this.a(bin.a, ciy.b);
                  this.a(djk.m);
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
         this.a(aow.qO, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ehe $$1 = new ehe(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dC() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dA() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ehe $$3 = new ehe(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dp(), this.dt() + 1.0, this.dv());
            this.dK().a(new ir(iv.O, this.c(bin.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return arp.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return arp.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return arp.i($$0, this.cr, this.cq);
   }

   private void gA() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dK().B) {
            ehe $$0 = this.dn();
            if (this.bU == 1) {
               float $$1 = this.dA() * (float) (Math.PI / 180.0);
               float $$2 = this.i_() ? 0.1F : 0.2F;
               this.cl = new ehe($$0.c + (double)(-arp.a($$1) * $$2), 0.0, $$0.e + (double)(arp.b($$1) * $$2));
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
      ehe $$0 = this.dn();
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

      for (buz $$2 : this.dK().a(buz.class, this.cG().g(10.0))) {
         if (!$$2.i_() && $$2.aA() && !$$2.aX() && $$2.gt()) {
            $$2.eZ();
         }
      }

      if (!this.dK().r_() && this.ag.a(700) == 0 && this.dK().X().b(cpi.f)) {
         this.a(cjb.qc);
      }
   }

   @Override
   protected void b(byg $$0) {
      if (this.c(bin.a).b() && ct.test($$0)) {
         this.a($$0);
         ciy $$1 = $$0.j();
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
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a(buz.a.a($$5));
      this.b(buz.a.a($$5));
      this.gs();
      if ($$3 == null) {
         $$3 = new bid.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(buz $$0, @Nullable buz $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gC());
            this.b(buz.a.a(this.ag));
         } else {
            this.a(buz.a.a(this.ag));
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
         this.a(buz.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(buz.a.a(this.ag));
      }
   }

   private buz.a gC() {
      return this.ag.h() ? this.gh() : this.gi();
   }

   public void gs() {
      if (this.gq()) {
         this.a(bkf.a).a(10.0);
      }

      if (this.gm()) {
         this.a(bkf.d).a(0.07F);
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
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if (this.gr()) {
         return bgq.d;
      } else if (this.fZ()) {
         this.x(false);
         return bgq.a(this.dK().B);
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
               return bgq.d;
            }

            this.gD();
            this.y(true);
            ciy $$3 = this.c(bin.a);
            if (!$$3.b() && !$$0.fR().d) {
               this.b($$3);
            }

            this.a(bin.a, new ciy($$2.d(), 1));
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
         return this.gn() ? aow.qS : aow.qM;
      }
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(ciy $$0) {
      return $$0.a(csn.mZ.k());
   }

   private boolean l(ciy $$0) {
      return this.m($$0) || $$0.a(csn.eh.k());
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

   public boolean gt() {
      return !this.fZ() && !this.gr() && !this.gf() && !this.gj() && !this.t();
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

      public static final ash.a<buz.a> h = ash.a(buz.a::values);
      private static final IntFunction<buz.a> i = aqk.a(buz.a::a, values(), aqk.a.a);
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

      static buz.a a(buz.a $$0, buz.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static buz.a a(int $$0) {
         return i.apply($$0);
      }

      public static buz.a a(String $$0) {
         return h.a($$0, a);
      }

      public static buz.a a(aru $$0) {
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

   static class b extends bqe {
      private final buz b;

      public b(buz $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gt() && super.a();
      }
   }

   static class c<T extends biy> extends bpb<T> {
      private final buz i;

      public c(buz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bil.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && this.i.gt() && super.a();
      }
   }

   static class d extends bpg {
      private final buz d;
      private int e;

      public d(buz $$0, double $$1) {
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
                  cbn $$0 = this.b.a(buz.cc, this.d);
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
                     if (this.b.a_($$1).a(csn.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends brm {
      private final buz a;

      public e(buz $$0, Class<?>... $$1) {
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
         if ($$0 instanceof buz && $$0.fS()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bpu {
      private final buz a;
      private int b;

      public f(buz $$0) {
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

   static class g extends bqc {
      private final buz h;

      public g(buz $$0, Class<? extends biy> $$1, float $$2) {
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
               if (this.f == cbn.class) {
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

   static class h extends box {
      private final buz l;

      public h(buz $$0) {
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

   static class i extends bqn {
      private final buz h;

      public i(buz $$0, double $$1) {
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

   static class j extends bpu {
      private final buz a;

      public j(buz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpu.a.a, bpu.a.b, bpu.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.i_() || this.a.go()) && this.a.aA()) {
            if (!this.a.gt()) {
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

   class k extends bpu {
      private int b;

      public k() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= buz.this.ah && !buz.this.i_() && !buz.this.aX() && buz.this.gt() && buz.this.p() <= 0) {
            List<byg> $$0 = buz.this.dK().a(byg.class, buz.this.cG().c(6.0, 6.0, 6.0), buz.ct);
            return !$$0.isEmpty() || !buz.this.c(bin.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !buz.this.aX() && (buz.this.gm() || buz.this.ag.a(b(600)) != 1) ? buz.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!buz.this.t() && !buz.this.c(bin.a).b()) {
            buz.this.gD();
         }
      }

      @Override
      public void c() {
         List<byg> $$0 = buz.this.dK().a(byg.class, buz.this.cG().c(8.0, 8.0, 8.0), buz.ct);
         if (!$$0.isEmpty() && buz.this.c(bin.a).b()) {
            buz.this.H().a($$0.get(0), 1.2F);
         } else if (!buz.this.c(bin.a).b()) {
            buz.this.gD();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ciy $$0 = buz.this.c(bin.a);
         if (!$$0.b()) {
            buz.this.b($$0);
            buz.this.a(bin.a, ciy.b);
            int $$1 = buz.this.gm() ? buz.this.ag.a(50) + 10 : buz.this.ag.a(150) + 10;
            this.b = buz.this.ah + $$1 * 20;
         }

         buz.this.w(false);
      }
   }

   static class l extends bpu {
      private final buz a;

      public l(buz $$0) {
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
