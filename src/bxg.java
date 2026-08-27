import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxg extends bwr {
   private static final afo<Integer> bW = afr.a(bxg.class, afq.b);
   private static final afo<Integer> bX = afr.a(bxg.class, afq.b);
   private static final afo<Integer> bY = afr.a(bxg.class, afq.b);
   private static final afo<Byte> bZ = afr.a(bxg.class, afq.a);
   private static final afo<Byte> ca = afr.a(bxg.class, afq.a);
   private static final afo<Byte> cb = afr.a(bxg.class, afq.a);
   static final bvs cc = bvs.b().a(8.0);
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
   private eju cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bxg.g cs;
   static final Predicate<can> ct = $$0 -> {
      clj $$1 = $$0.q();
      return ($$1.a(cvc.mZ.k()) || $$1.a(cvc.eg.k())) && $$0.bx() && !$$0.z();
   };

   public bxg(bku<? extends bxg> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new bxg.h(this);
      if (!this.n_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(clj $$0) {
      bkv $$1 = bli.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkv.a && super.f($$0);
   }

   public int u() {
      return this.an.b(bW);
   }

   public void t(int $$0) {
      this.an.b(bW, $$0);
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
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gA() {
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

   public int gm() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public bxg.a gn() {
      return bxg.a.a(this.an.b(bZ));
   }

   public void a(bxg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxg.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bxg.a go() {
      return bxg.a.a(this.an.b(ca));
   }

   public void b(bxg.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxg.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean gp() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gn().c());
      $$0.a("HiddenGene", this.go().c());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxg.a.a($$0.l("MainGene")));
      this.b(bxg.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      bxg $$2 = bku.as.a((csa)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bxg $$3) {
            $$2.a(this, $$3);
         }

         $$2.gy();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(2, new bxg.i(this, 2.0));
      this.bO.a(2, new bxg.d(this, 1.0));
      this.bO.a(3, new bxg.b(this, 1.2F, true));
      this.bO.a(4, new btj(this, 1.0, cok.a(cvc.mZ.k()), false));
      this.bO.a(6, new bxg.c<>(this, cdu.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bxg.c<>(this, cbi.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bxg.k());
      this.bO.a(8, new bxg.f(this));
      this.bO.a(8, new bxg.l(this));
      this.cs = new bxg.g(this, cdu.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bsw(this));
      this.bO.a(12, new bxg.j(this));
      this.bO.a(13, new bsa(this, 1.25));
      this.bO.a(14, new bto(this, 1.0));
      this.bP.a(1, new bxg.e(this).a(new Class[0]));
   }

   public static bml.a gq() {
      return bli.C().a(bmm.m, 0.15F).a(bmm.c, 6.0);
   }

   public bxg.a gr() {
      return bxg.a.a(this.gn(), this.go());
   }

   public boolean gs() {
      return this.gr() == bxg.a.b;
   }

   public boolean gt() {
      return this.gr() == bxg.a.c;
   }

   public boolean gu() {
      return this.gr() == bxg.a.d;
   }

   public boolean gv() {
      return this.gr() == bxg.a.e;
   }

   public boolean gw() {
      return this.gr() == bxg.a.f;
   }

   @Override
   public boolean fX() {
      return this.gr() == bxg.a.g;
   }

   @Override
   public boolean a(cdu $$0) {
      return false;
   }

   @Override
   public boolean C(bkq $$0) {
      this.a(aqr.ro, 1.0F, 1.0F);
      if (!this.fX()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gt()) {
         if (this.dN().Z() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gl()) {
            this.w(false);
         }
      }

      blg $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(aqr.rk, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gm() + 1);
         if (this.gm() > 20) {
            this.z(false);
            this.gH();
         } else if (this.gm() == 1) {
            this.a(aqr.re, 1.0F, 1.0F);
         }
      }

      if (this.gp()) {
         this.gG();
      } else {
         this.bU = 0;
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
      return this.gt() && this.dN().Z();
   }

   private void gB() {
      if (!this.gl() && this.A() && !this.gx() && !this.c(bkv.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bkv.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gl()) {
         this.gC();
         if (!this.dN().B && this.gA() > 80 && this.ag.a(20) == 1) {
            if (this.gA() > 100 && this.l(this.c(bkv.a))) {
               if (!this.dN().B) {
                  this.a(bkv.a, clj.b);
                  this.a(dls.m);
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
         this.a(aqr.ri, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eju $$1 = new eju(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dF() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dD() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            eju $$3 = new eju(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.ds(), this.dw() + 1.0, this.dy());
            this.dN().a(new jo(js.O, this.c(bkv.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gD() {
      this.cn = this.cm;
      if (this.A()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gE() {
      this.cp = this.co;
      if (this.gf()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gF() {
      this.cr = this.cq;
      if (this.gp()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return atm.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return atm.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return atm.i($$0, this.cr, this.cq);
   }

   private void gG() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dN().B) {
            eju $$0 = this.dq();
            if (this.bU == 1) {
               float $$1 = this.dD() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.cl = new eju($$0.c + (double)(-atm.a($$1) * $$2), 0.0, $$0.e + (double)(atm.b($$1) * $$2));
               this.g(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gH() {
      eju $$0 = this.dq();
      this.dN()
         .a(
            js.ab,
            this.ds() - (double)(this.dh() + 1.0F) * 0.5 * (double)atm.a(this.aU * (float) (Math.PI / 180.0)),
            this.dw() - 0.1F,
            this.dy() + (double)(this.dh() + 1.0F) * 0.5 * (double)atm.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aqr.rf, 1.0F, 1.0F);

      for (bxg $$2 : this.dN().a(bxg.class, this.cH().g(10.0))) {
         if (!$$2.n_() && $$2.aC() && !$$2.aZ() && $$2.gz()) {
            $$2.fc();
         }
      }

      if (!this.dN().x_() && this.ag.a(700) == 0 && this.dN().Y().b(crw.f)) {
         this.a(clm.qN);
      }
   }

   @Override
   protected void b(can $$0) {
      if (this.c(bkv.a).b() && ct.test($$0)) {
         this.a($$0);
         clj $$1 = $$0.q();
         this.a(bkv.a, $$1);
         this.e(bkv.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (!this.dN().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      this.a(bxg.a.a($$5));
      this.b(bxg.a.a($$5));
      this.gy();
      if ($$3 == null) {
         $$3 = new bkl.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bxg $$0, @Nullable bxg $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gI());
            this.b(bxg.a.a(this.ag));
         } else {
            this.a(bxg.a.a(this.ag));
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
         this.a(bxg.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bxg.a.a(this.ag));
      }
   }

   private bxg.a gI() {
      return this.ag.h() ? this.gn() : this.go();
   }

   public void gy() {
      if (this.gw()) {
         this.a(bmm.l).a(10.0);
      }

      if (this.gs()) {
         this.a(bmm.m).a(0.07F);
      }
   }

   void gJ() {
      if (!this.aZ()) {
         this.A(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (this.gx()) {
         return bix.d;
      } else if (this.gf()) {
         this.x(false);
         return bix.a(this.dN().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cj = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dN().B && this.h() == 0 && this.gg()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dN().B || this.A() || this.aZ()) {
               return bix.d;
            }

            this.gJ();
            this.y(true);
            clj $$3 = this.c(bkv.a);
            if (!$$3.b() && !$$0.fU().d) {
               this.b($$3);
            }

            this.a(bkv.a, new clj($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bix.a;
      } else {
         return bix.d;
      }
   }

   @Nullable
   @Override
   protected aqq y() {
      if (this.fX()) {
         return aqr.rl;
      } else {
         return this.gt() ? aqr.rm : aqr.rg;
      }
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.rj, 0.15F, 1.0F);
   }

   @Override
   public boolean m(clj $$0) {
      return $$0.a(cvc.mZ.k());
   }

   private boolean l(clj $$0) {
      return this.m($$0) || $$0.a(cvc.eg.k());
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.rh;
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.rn;
   }

   public boolean gz() {
      return !this.gf() && !this.gx() && !this.gl() && !this.gp() && !this.A();
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements aug {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final aug.a<bxg.a> h = aug.a(bxg.a::values);
      private static final IntFunction<bxg.a> i = asf.a(bxg.a::a, values(), asf.a.a);
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

      static bxg.a a(bxg.a $$0, bxg.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bxg.a a(int $$0) {
         return i.apply($$0);
      }

      public static bxg.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bxg.a a(ats $$0) {
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

   static class b extends bsl {
      private final bxg b;

      public b(bxg $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gz() && super.a();
      }
   }

   static class c<T extends blg> extends bri<T> {
      private final bxg i;

      public c(bxg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bkt.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gt() && this.i.gz() && super.a();
      }
   }

   static class d extends brn {
      private final bxg d;
      private int e;

      public d(bxg $$0, double $$1) {
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
               if (this.d.cZ()) {
                  cdu $$0 = this.b.a(bxg.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ht $$0 = this.d.dn();
         ht.a $$1 = new ht.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cvc.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends btt {
      private final bxg a;

      public e(bxg $$0, Class<?>... $$1) {
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
      protected void a(bli $$0, blg $$1) {
         if ($$0 instanceof bxg && $$0.fX()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bsb {
      private final bxg a;
      private int b;

      public f(bxg $$0) {
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

   static class g extends bsj {
      private final bxg h;

      public g(bxg $$0, Class<? extends blg> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(blg $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.eh().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cdu.class) {
                  this.c = this.b.dN().a(this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
               } else {
                  this.c = this.b
                     .dN()
                     .a(
                        this.b.dN().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.ds(),
                        this.b.dw(),
                        this.b.dy()
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

   static class h extends bre {
      private final bxg l;

      public h(bxg $$0) {
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

   static class i extends bsu {
      private final bxg h;

      public i(bxg $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bN();
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

   static class j extends bsb {
      private final bxg a;

      public j(bxg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b, bsb.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.n_() || this.a.gu()) && this.a.aC()) {
            if (!this.a.gz()) {
               return false;
            } else {
               float $$0 = this.a.dD() * (float) (Math.PI / 180.0);
               float $$1 = -atm.a($$0);
               float $$2 = atm.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? atm.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? atm.j((double)$$2) : 0;
               if (this.a.dN().a_(this.a.dn().b($$3, -1, $$4)).i()) {
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
      public boolean R_() {
         return false;
      }
   }

   class k extends bsb {
      private int b;

      public k() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bxg.this.ah && !bxg.this.n_() && !bxg.this.aZ() && bxg.this.gz() && bxg.this.u() <= 0) {
            List<can> $$0 = bxg.this.dN().a(can.class, bxg.this.cH().c(6.0, 6.0, 6.0), bxg.ct);
            return !$$0.isEmpty() || !bxg.this.c(bkv.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bxg.this.aZ() && (bxg.this.gs() || bxg.this.ag.a(b(600)) != 1) ? bxg.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bxg.this.A() && !bxg.this.c(bkv.a).b()) {
            bxg.this.gJ();
         }
      }

      @Override
      public void c() {
         List<can> $$0 = bxg.this.dN().a(can.class, bxg.this.cH().c(8.0, 8.0, 8.0), bxg.ct);
         if (!$$0.isEmpty() && bxg.this.c(bkv.a).b()) {
            bxg.this.N().a($$0.get(0), 1.2F);
         } else if (!bxg.this.c(bkv.a).b()) {
            bxg.this.gJ();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clj $$0 = bxg.this.c(bkv.a);
         if (!$$0.b()) {
            bxg.this.b($$0);
            bxg.this.a(bkv.a, clj.b);
            int $$1 = bxg.this.gs() ? bxg.this.ag.a(50) + 10 : bxg.this.ag.a(150) + 10;
            this.b = bxg.this.ah + $$1 * 20;
         }

         bxg.this.w(false);
      }
   }

   static class l extends bsb {
      private final bxg a;

      public l(bxg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.n_() && this.a.gz()) {
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
