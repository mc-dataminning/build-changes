import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwy extends bwj {
   private static final afm<Integer> bW = afp.a(bwy.class, afo.b);
   private static final afm<Integer> bX = afp.a(bwy.class, afo.b);
   private static final afm<Integer> bY = afp.a(bwy.class, afo.b);
   private static final afm<Byte> bZ = afp.a(bwy.class, afo.a);
   private static final afm<Byte> ca = afp.a(bwy.class, afo.a);
   private static final afm<Byte> cb = afp.a(bwy.class, afo.a);
   static final bvk cc = bvk.b().a(8.0);
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
   private eji cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bwy.g cs;
   static final Predicate<caf> ct = $$0 -> {
      clb $$1 = $$0.q();
      return ($$1.a(cuv.mZ.k()) || $$1.a(cuv.eg.k())) && $$0.bv() && !$$0.y();
   };

   public bwy(bkm<? extends bwy> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bwy.h(this);
      if (!this.n_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(clb $$0) {
      bkn $$1 = bla.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkn.a && super.f($$0);
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

   public boolean ge() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gk() {
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gz() {
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

   public int gl() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public bwy.a gm() {
      return bwy.a.a(this.an.b(bZ));
   }

   public void a(bwy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bwy.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bwy.a gn() {
      return bwy.a.a(this.an.b(ca));
   }

   public void b(bwy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bwy.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean go() {
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
      $$0.a("MainGene", this.gm().c());
      $$0.a("HiddenGene", this.gn().c());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bwy.a.a($$0.l("MainGene")));
      this.b(bwy.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      bwy $$2 = bkm.as.a((crs)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bwy $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(2, new bwy.i(this, 2.0));
      this.bO.a(2, new bwy.d(this, 1.0));
      this.bO.a(3, new bwy.b(this, 1.2F, true));
      this.bO.a(4, new btb(this, 1.0, coc.a(cuv.mZ.k()), false));
      this.bO.a(6, new bwy.c<>(this, cdm.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bwy.c<>(this, cba.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bwy.k());
      this.bO.a(8, new bwy.f(this));
      this.bO.a(8, new bwy.l(this));
      this.cs = new bwy.g(this, cdm.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bso(this));
      this.bO.a(12, new bwy.j(this));
      this.bO.a(13, new brs(this, 1.25));
      this.bO.a(14, new btg(this, 1.0));
      this.bP.a(1, new bwy.e(this).a(new Class[0]));
   }

   public static bmd.a gp() {
      return bla.A().a(bme.m, 0.15F).a(bme.c, 6.0);
   }

   public bwy.a gq() {
      return bwy.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == bwy.a.b;
   }

   public boolean gs() {
      return this.gq() == bwy.a.c;
   }

   public boolean gt() {
      return this.gq() == bwy.a.d;
   }

   public boolean gu() {
      return this.gq() == bwy.a.e;
   }

   public boolean gv() {
      return this.gq() == bwy.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == bwy.a.g;
   }

   @Override
   public boolean a(cdm $$0) {
      return false;
   }

   @Override
   public boolean C(bki $$0) {
      this.a(aqn.qY, 1.0F, 1.0F);
      if (!this.fW()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gs()) {
         if (this.dL().Y() && !this.aX()) {
            this.w(true);
            this.y(false);
         } else if (!this.gk()) {
            this.w(false);
         }
      }

      bky $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(aqn.qU, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(aqn.qO, 1.0F, 1.0F);
         }
      }

      if (this.go()) {
         this.gF();
      } else {
         this.bU = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gC();
      this.gA();
      this.gD();
      this.gE();
   }

   public boolean gw() {
      return this.gs() && this.dL().Y();
   }

   private void gA() {
      if (!this.gk() && this.y() && !this.gw() && !this.c(bkn.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bkn.a).b() || !this.y()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dL().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(bkn.a))) {
               if (!this.dL().B) {
                  this.a(bkn.a, clb.b);
                  this.a(dlg.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gz() + 1);
      }
   }

   private void gB() {
      if (this.gz() % 5 == 0) {
         this.a(aqn.qS, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eji $$1 = new eji(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dD() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dB() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            eji $$3 = new eji(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dq(), this.du() + 1.0, this.dw());
            this.dL().a(new jo(js.O, this.c(bkn.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gC() {
      this.cn = this.cm;
      if (this.y()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gD() {
      this.cp = this.co;
      if (this.ge()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gE() {
      this.cr = this.cq;
      if (this.go()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return ati.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return ati.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return ati.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dL().B) {
            eji $$0 = this.do();
            if (this.bU == 1) {
               float $$1 = this.dB() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.cl = new eji($$0.c + (double)(-ati.a($$1) * $$2), 0.0, $$0.e + (double)(ati.b($$1) * $$2));
               this.f(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aA() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gG() {
      eji $$0 = this.do();
      this.dL()
         .a(
            js.ab,
            this.dq() - (double)(this.df() + 1.0F) * 0.5 * (double)ati.a(this.aU * (float) (Math.PI / 180.0)),
            this.du() - 0.1F,
            this.dw() + (double)(this.df() + 1.0F) * 0.5 * (double)ati.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aqn.qP, 1.0F, 1.0F);

      for (bwy $$2 : this.dL().a(bwy.class, this.cG().g(10.0))) {
         if (!$$2.n_() && $$2.aA() && !$$2.aX() && $$2.gy()) {
            $$2.fa();
         }
      }

      if (!this.dL().x_() && this.ag.a(700) == 0 && this.dL().X().b(cro.f)) {
         this.a(cle.qc);
      }
   }

   @Override
   protected void b(caf $$0) {
      if (this.c(bkn.a).b() && ct.test($$0)) {
         this.a($$0);
         clb $$1 = $$0.q();
         this.a(bkn.a, $$1);
         this.e(bkn.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (!this.dL().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      this.a(bwy.a.a($$5));
      this.b(bwy.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new bkd.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bwy $$0, @Nullable bwy $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(bwy.a.a(this.ag));
         } else {
            this.a(bwy.a.a(this.ag));
            this.b($$0.gH());
         }
      } else if (this.ag.h()) {
         this.a($$0.gH());
         this.b($$1.gH());
      } else {
         this.a($$1.gH());
         this.b($$0.gH());
      }

      if (this.ag.a(32) == 0) {
         this.a(bwy.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bwy.a.a(this.ag));
      }
   }

   private bwy.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(bme.l).a(10.0);
      }

      if (this.gr()) {
         this.a(bme.m).a(0.07F);
      }
   }

   void gI() {
      if (!this.aX()) {
         this.A(0.0F);
         this.L().n();
         this.w(true);
      }
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (this.gw()) {
         return biq.d;
      } else if (this.ge()) {
         this.x(false);
         return biq.a(this.dL().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cj = true;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dL().B && this.h() == 0 && this.gf()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dL().B || this.y() || this.aX()) {
               return biq.d;
            }

            this.gI();
            this.y(true);
            clb $$3 = this.c(bkn.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(bkn.a, new clb($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return biq.a;
      } else {
         return biq.d;
      }
   }

   @Nullable
   @Override
   protected aqm w() {
      if (this.fW()) {
         return aqn.qV;
      } else {
         return this.gs() ? aqn.qW : aqn.qQ;
      }
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.qT, 0.15F, 1.0F);
   }

   @Override
   public boolean m(clb $$0) {
      return $$0.a(cuv.mZ.k());
   }

   private boolean l(clb $$0) {
      return this.m($$0) || $$0.a(cuv.eg.k());
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.qR;
   }

   @Nullable
   @Override
   protected aqm d(bjg $$0) {
      return aqn.qX;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.y();
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements aub {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final aub.a<bwy.a> h = aub.a(bwy.a::values);
      private static final IntFunction<bwy.a> i = asb.a(bwy.a::a, values(), asb.a.a);
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

      static bwy.a a(bwy.a $$0, bwy.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bwy.a a(int $$0) {
         return i.apply($$0);
      }

      public static bwy.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bwy.a a(ato $$0) {
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

   static class b extends bsd {
      private final bwy b;

      public b(bwy $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends bky> extends bra<T> {
      private final bwy i;

      public c(bwy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bkl.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends brf {
      private final bwy d;
      private int e;

      public d(bwy $$0, double $$1) {
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
                  cdm $$0 = this.b.a(bwy.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ht $$0 = this.d.dl();
         ht.a $$1 = new ht.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cuv.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends btl {
      private final bwy a;

      public e(bwy $$0, Class<?>... $$1) {
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
      protected void a(bla $$0, bky $$1) {
         if ($$0 instanceof bwy && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends brt {
      private final bwy a;
      private int b;

      public f(bwy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gr() && this.a.gy() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aX() && (this.a.gr() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bsb {
      private final bwy h;

      public g(bwy $$0, Class<? extends bky> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bky $$0) {
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
               if (this.f == cdm.class) {
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

            return this.h.gy() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bqw {
      private final bwy l;

      public h(bwy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gy()) {
            super.a();
         }
      }
   }

   static class i extends bsm {
      private final bwy h;

      public i(bwy $$0, double $$1) {
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

   static class j extends brt {
      private final bwy a;

      public j(bwy $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.a, brt.a.b, brt.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.n_() || this.a.gt()) && this.a.aA()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dB() * (float) (Math.PI / 180.0);
               float $$1 = -ati.a($$0);
               float $$2 = ati.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ati.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ati.j((double)$$2) : 0;
               if (this.a.dL().a_(this.a.dl().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gt() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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

   class k extends brt {
      private int b;

      public k() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bwy.this.ah && !bwy.this.n_() && !bwy.this.aX() && bwy.this.gy() && bwy.this.s() <= 0) {
            List<caf> $$0 = bwy.this.dL().a(caf.class, bwy.this.cG().c(6.0, 6.0, 6.0), bwy.ct);
            return !$$0.isEmpty() || !bwy.this.c(bkn.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bwy.this.aX() && (bwy.this.gr() || bwy.this.ag.a(b(600)) != 1) ? bwy.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bwy.this.y() && !bwy.this.c(bkn.a).b()) {
            bwy.this.gI();
         }
      }

      @Override
      public void c() {
         List<caf> $$0 = bwy.this.dL().a(caf.class, bwy.this.cG().c(8.0, 8.0, 8.0), bwy.ct);
         if (!$$0.isEmpty() && bwy.this.c(bkn.a).b()) {
            bwy.this.L().a($$0.get(0), 1.2F);
         } else if (!bwy.this.c(bkn.a).b()) {
            bwy.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clb $$0 = bwy.this.c(bkn.a);
         if (!$$0.b()) {
            bwy.this.b($$0);
            bwy.this.a(bkn.a, clb.b);
            int $$1 = bwy.this.gr() ? bwy.this.ag.a(50) + 10 : bwy.this.ag.a(150) + 10;
            this.b = bwy.this.ah + $$1 * 20;
         }

         bwy.this.w(false);
      }
   }

   static class l extends brt {
      private final bwy a;

      public l(bwy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.n_() && this.a.gy()) {
            return this.a.gv() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
