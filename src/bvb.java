import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvb extends bum {
   private static final aec<Integer> bW = aef.a(bvb.class, aee.b);
   private static final aec<Integer> bX = aef.a(bvb.class, aee.b);
   private static final aec<Integer> bY = aef.a(bvb.class, aee.b);
   private static final aec<Byte> bZ = aef.a(bvb.class, aee.a);
   private static final aec<Byte> ca = aef.a(bvb.class, aee.a);
   private static final aec<Byte> cb = aef.a(bvb.class, aee.a);
   static final btn cc = btn.b().a(8.0);
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
   private ehi cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bvb.g cs;
   static final Predicate<byi> ct = $$0 -> {
      cja $$1 = $$0.j();
      return ($$1.a(csr.mZ.k()) || $$1.a(csr.eh.k())) && $$0.bv() && !$$0.r();
   };

   public bvb(bip<? extends bvb> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bvb.h(this);
      if (!this.i_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cja $$0) {
      biq $$1 = bjd.h($$0);
      return !this.c($$1).b() ? false : $$1 == biq.a && super.f($$0);
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

   public bvb.a gi() {
      return bvb.a.a(this.an.b(bZ));
   }

   public void a(bvb.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bvb.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bvb.a gj() {
      return bvb.a.a(this.an.b(ca));
   }

   public void b(bvb.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bvb.a.a(this.ag);
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gi().c());
      $$0.a("HiddenGene", this.gj().c());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(bvb.a.a($$0.l("MainGene")));
      this.b(bvb.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      bvb $$2 = bip.as.a((cpq)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bvb $$3) {
            $$2.a(this, $$3);
         }

         $$2.gt();
      }

      return $$2;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(2, new bvb.i(this, 2.0));
      this.bO.a(2, new bvb.d(this, 1.0));
      this.bO.a(3, new bvb.b(this, 1.2F, true));
      this.bO.a(4, new bre(this, 1.0, cmb.a(csr.mZ.k()), false));
      this.bO.a(6, new bvb.c<>(this, cbp.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bvb.c<>(this, bzd.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bvb.k());
      this.bO.a(8, new bvb.f(this));
      this.bO.a(8, new bvb.l(this));
      this.cs = new bvb.g(this, cbp.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bqr(this));
      this.bO.a(12, new bvb.j(this));
      this.bO.a(13, new bpv(this, 1.25));
      this.bO.a(14, new brj(this, 1.0));
      this.bP.a(1, new bvb.e(this).a(new Class[0]));
   }

   public static bkg.a gl() {
      return bjd.x().a(bkh.d, 0.15F).a(bkh.f, 6.0);
   }

   public bvb.a gm() {
      return bvb.a.a(this.gi(), this.gj());
   }

   public boolean gn() {
      return this.gm() == bvb.a.b;
   }

   public boolean go() {
      return this.gm() == bvb.a.c;
   }

   public boolean gp() {
      return this.gm() == bvb.a.d;
   }

   public boolean gq() {
      return this.gm() == bvb.a.e;
   }

   public boolean gr() {
      return this.gm() == bvb.a.f;
   }

   @Override
   public boolean fS() {
      return this.gm() == bvb.a.g;
   }

   @Override
   public boolean a(cbp $$0) {
      return false;
   }

   @Override
   public boolean C(bil $$0) {
      this.a(aoz.qU, 1.0F, 1.0F);
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

      bjb $$0 = this.j();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(aoz.qQ, 1.0F, 1.0F);
         }

         this.t(this.p() - 1);
      }

      if (this.q()) {
         this.u(this.gh() + 1);
         if (this.gh() > 20) {
            this.z(false);
            this.gC();
         } else if (this.gh() == 1) {
            this.a(aoz.qK, 1.0F, 1.0F);
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
      if (!this.gg() && this.t() && !this.gs() && !this.c(biq.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(biq.a).b() || !this.t()) {
         this.y(false);
      }

      if (this.gg()) {
         this.gx();
         if (!this.dK().B && this.gv() > 80 && this.ag.a(20) == 1) {
            if (this.gv() > 100 && this.l(this.c(biq.a))) {
               if (!this.dK().B) {
                  this.a(biq.a, cja.b);
                  this.a(djo.m);
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
         this.a(aoz.qO, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ehi $$1 = new ehi(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dC() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dA() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ehi $$3 = new ehi(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dp(), this.dt() + 1.0, this.dv());
            this.dK().a(new it(ix.O, this.c(biq.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return ars.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return ars.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return ars.i($$0, this.cr, this.cq);
   }

   private void gB() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dK().B) {
            ehi $$0 = this.dn();
            if (this.bU == 1) {
               float $$1 = this.dA() * (float) (Math.PI / 180.0);
               float $$2 = this.i_() ? 0.1F : 0.2F;
               this.cl = new ehi($$0.c + (double)(-ars.a($$1) * $$2), 0.0, $$0.e + (double)(ars.b($$1) * $$2));
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
      ehi $$0 = this.dn();
      this.dK()
         .a(
            ix.aa,
            this.dp() - (double)(this.df() + 1.0F) * 0.5 * (double)ars.a(this.aU * (float) (Math.PI / 180.0)),
            this.dt() - 0.1F,
            this.dv() + (double)(this.df() + 1.0F) * 0.5 * (double)ars.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aoz.qL, 1.0F, 1.0F);

      for (bvb $$2 : this.dK().a(bvb.class, this.cG().g(10.0))) {
         if (!$$2.i_() && $$2.aA() && !$$2.aX() && $$2.gu()) {
            $$2.eZ();
         }
      }

      if (!this.dK().r_() && this.ag.a(700) == 0 && this.dK().X().b(cpm.f)) {
         this.a(cjd.qc);
      }
   }

   @Override
   protected void b(byi $$0) {
      if (this.c(biq.a).b() && ct.test($$0)) {
         this.a($$0);
         cja $$1 = $$0.j();
         this.a(biq.a, $$1);
         this.e(biq.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (!this.dK().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      this.a(bvb.a.a($$5));
      this.b(bvb.a.a($$5));
      this.gt();
      if ($$3 == null) {
         $$3 = new big.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bvb $$0, @Nullable bvb $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gD());
            this.b(bvb.a.a(this.ag));
         } else {
            this.a(bvb.a.a(this.ag));
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
         this.a(bvb.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bvb.a.a(this.ag));
      }
   }

   private bvb.a gD() {
      return this.ag.h() ? this.gi() : this.gj();
   }

   public void gt() {
      if (this.gr()) {
         this.a(bkh.a).a(10.0);
      }

      if (this.gn()) {
         this.a(bkh.d).a(0.07F);
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
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (this.gs()) {
         return bgt.d;
      } else if (this.ga()) {
         this.x(false);
         return bgt.a(this.dK().B);
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
               return bgt.d;
            }

            this.gE();
            this.y(true);
            cja $$3 = this.c(biq.a);
            if (!$$3.b() && !$$0.fR().d) {
               this.b($$3);
            }

            this.a(biq.a, new cja($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bgt.a;
      } else {
         return bgt.d;
      }
   }

   @Nullable
   @Override
   protected aoy r() {
      if (this.fS()) {
         return aoz.qR;
      } else {
         return this.go() ? aoz.qS : aoz.qM;
      }
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.qP, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(csr.mZ.k());
   }

   private boolean l(cja $$0) {
      return this.m($$0) || $$0.a(csr.eh.k());
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.qN;
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.qT;
   }

   public boolean gu() {
      return !this.ga() && !this.gs() && !this.gg() && !this.gk() && !this.t();
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements ask {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ask.a<bvb.a> h = ask.a(bvb.a::values);
      private static final IntFunction<bvb.a> i = aqn.a(bvb.a::a, values(), aqn.a.a);
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

      static bvb.a a(bvb.a $$0, bvb.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bvb.a a(int $$0) {
         return i.apply($$0);
      }

      public static bvb.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bvb.a a(arx $$0) {
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

   static class b extends bqg {
      private final bvb b;

      public b(bvb $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gu() && super.a();
      }
   }

   static class c<T extends bjb> extends bpd<T> {
      private final bvb i;

      public c(bvb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bio.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.go() && this.i.gu() && super.a();
      }
   }

   static class d extends bpi {
      private final bvb d;
      private int e;

      public d(bvb $$0, double $$1) {
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
                  cbp $$0 = this.b.a(bvb.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gw $$0 = this.d.dk();
         gw.a $$1 = new gw.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(csr.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bro {
      private final bvb a;

      public e(bvb $$0, Class<?>... $$1) {
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
      protected void a(bjd $$0, bjb $$1) {
         if ($$0 instanceof bvb && $$0.fS()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bpw {
      private final bvb a;
      private int b;

      public f(bvb $$0) {
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

   static class g extends bqe {
      private final bvb h;

      public g(bvb $$0, Class<? extends bjb> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bjb $$0) {
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
               if (this.f == cbp.class) {
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

   static class h extends boz {
      private final bvb l;

      public h(bvb $$0) {
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

   static class i extends bqp {
      private final bvb h;

      public i(bvb $$0, double $$1) {
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

   static class j extends bpw {
      private final bvb a;

      public j(bvb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpw.a.a, bpw.a.b, bpw.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.i_() || this.a.gp()) && this.a.aA()) {
            if (!this.a.gu()) {
               return false;
            } else {
               float $$0 = this.a.dA() * (float) (Math.PI / 180.0);
               float $$1 = -ars.a($$0);
               float $$2 = ars.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ars.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ars.j((double)$$2) : 0;
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

   class k extends bpw {
      private int b;

      public k() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bvb.this.ah && !bvb.this.i_() && !bvb.this.aX() && bvb.this.gu() && bvb.this.p() <= 0) {
            List<byi> $$0 = bvb.this.dK().a(byi.class, bvb.this.cG().c(6.0, 6.0, 6.0), bvb.ct);
            return !$$0.isEmpty() || !bvb.this.c(biq.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bvb.this.aX() && (bvb.this.gn() || bvb.this.ag.a(b(600)) != 1) ? bvb.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bvb.this.t() && !bvb.this.c(biq.a).b()) {
            bvb.this.gE();
         }
      }

      @Override
      public void c() {
         List<byi> $$0 = bvb.this.dK().a(byi.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.ct);
         if (!$$0.isEmpty() && bvb.this.c(biq.a).b()) {
            bvb.this.H().a($$0.get(0), 1.2F);
         } else if (!bvb.this.c(biq.a).b()) {
            bvb.this.gE();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cja $$0 = bvb.this.c(biq.a);
         if (!$$0.b()) {
            bvb.this.b($$0);
            bvb.this.a(biq.a, cja.b);
            int $$1 = bvb.this.gn() ? bvb.this.ag.a(50) + 10 : bvb.this.ag.a(150) + 10;
            this.b = bvb.this.ah + $$1 * 20;
         }

         bvb.this.w(false);
      }
   }

   static class l extends bpw {
      private final bvb a;

      public l(bvb $$0) {
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
