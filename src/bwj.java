import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwj extends bvu {
   private static final afc<Integer> bW = aff.a(bwj.class, afe.b);
   private static final afc<Integer> bX = aff.a(bwj.class, afe.b);
   private static final afc<Integer> bY = aff.a(bwj.class, afe.b);
   private static final afc<Byte> bZ = aff.a(bwj.class, afe.a);
   private static final afc<Byte> ca = aff.a(bwj.class, afe.a);
   private static final afc<Byte> cb = aff.a(bwj.class, afe.a);
   static final buv cc = buv.b().a(8.0);
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
   private eif cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bwj.g cs;
   static final Predicate<bzq> ct = $$0 -> {
      ckj $$1 = $$0.q();
      return ($$1.a(cuc.mZ.k()) || $$1.a(cuc.eg.k())) && $$0.bv() && !$$0.y();
   };

   public bwj(bjx<? extends bwj> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bwj.h(this);
      if (!this.n_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      return !this.c($$1).b() ? false : $$1 == bjy.a && super.f($$0);
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

   public bwj.a gm() {
      return bwj.a.a(this.an.b(bZ));
   }

   public void a(bwj.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bwj.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bwj.a gn() {
      return bwj.a.a(this.an.b(ca));
   }

   public void b(bwj.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bwj.a.a(this.ag);
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
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gm().c());
      $$0.a("HiddenGene", this.gn().c());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(bwj.a.a($$0.l("MainGene")));
      this.b(bwj.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      bwj $$2 = bjx.as.a((cqz)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bwj $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqy(this));
      this.bO.a(2, new bwj.i(this, 2.0));
      this.bO.a(2, new bwj.d(this, 1.0));
      this.bO.a(3, new bwj.b(this, 1.2F, true));
      this.bO.a(4, new bsm(this, 1.0, cnk.a(cuc.mZ.k()), false));
      this.bO.a(6, new bwj.c<>(this, ccx.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bwj.c<>(this, cal.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bwj.k());
      this.bO.a(8, new bwj.f(this));
      this.bO.a(8, new bwj.l(this));
      this.cs = new bwj.g(this, ccx.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new brz(this));
      this.bO.a(12, new bwj.j(this));
      this.bO.a(13, new brd(this, 1.25));
      this.bO.a(14, new bsr(this, 1.0));
      this.bP.a(1, new bwj.e(this).a(new Class[0]));
   }

   public static blo.a gp() {
      return bkl.A().a(blp.m, 0.15F).a(blp.c, 6.0);
   }

   public bwj.a gq() {
      return bwj.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == bwj.a.b;
   }

   public boolean gs() {
      return this.gq() == bwj.a.c;
   }

   public boolean gt() {
      return this.gq() == bwj.a.d;
   }

   public boolean gu() {
      return this.gq() == bwj.a.e;
   }

   public boolean gv() {
      return this.gq() == bwj.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == bwj.a.g;
   }

   @Override
   public boolean a(ccx $$0) {
      return false;
   }

   @Override
   public boolean C(bjt $$0) {
      this.a(aqd.qW, 1.0F, 1.0F);
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

      bkj $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(aqd.qS, 1.0F, 1.0F);
         }

         this.t(this.s() - 1);
      }

      if (this.t()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(aqd.qM, 1.0F, 1.0F);
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
      if (!this.gk() && this.y() && !this.gw() && !this.c(bjy.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bjy.a).b() || !this.y()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dL().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(bjy.a))) {
               if (!this.dL().B) {
                  this.a(bjy.a, ckj.b);
                  this.a(dkl.m);
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
         this.a(aqd.qQ, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eif $$1 = new eif(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dD() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dB() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            eif $$3 = new eif(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dq(), this.du() + 1.0, this.dw());
            this.dL().a(new jo(js.O, this.c(bjy.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return asy.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return asy.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return asy.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dL().B) {
            eif $$0 = this.do();
            if (this.bU == 1) {
               float $$1 = this.dB() * (float) (Math.PI / 180.0);
               float $$2 = this.n_() ? 0.1F : 0.2F;
               this.cl = new eif($$0.c + (double)(-asy.a($$1) * $$2), 0.0, $$0.e + (double)(asy.b($$1) * $$2));
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
      eif $$0 = this.do();
      this.dL()
         .a(
            js.aa,
            this.dq() - (double)(this.df() + 1.0F) * 0.5 * (double)asy.a(this.aU * (float) (Math.PI / 180.0)),
            this.du() - 0.1F,
            this.dw() + (double)(this.df() + 1.0F) * 0.5 * (double)asy.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aqd.qN, 1.0F, 1.0F);

      for (bwj $$2 : this.dL().a(bwj.class, this.cG().g(10.0))) {
         if (!$$2.n_() && $$2.aA() && !$$2.aX() && $$2.gy()) {
            $$2.fa();
         }
      }

      if (!this.dL().x_() && this.ag.a(700) == 0 && this.dL().X().b(cqv.f)) {
         this.a(ckm.qc);
      }
   }

   @Override
   protected void b(bzq $$0) {
      if (this.c(bjy.a).b() && ct.test($$0)) {
         this.a($$0);
         ckj $$1 = $$0.q();
         this.a(bjy.a, $$1);
         this.e(bjy.a);
         this.a($$0, $$1.L());
         $$0.ak();
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (!this.dL().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      this.a(bwj.a.a($$5));
      this.b(bwj.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new bjo.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bwj $$0, @Nullable bwj $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(bwj.a.a(this.ag));
         } else {
            this.a(bwj.a.a(this.ag));
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
         this.a(bwj.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bwj.a.a(this.ag));
      }
   }

   private bwj.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(blp.l).a(10.0);
      }

      if (this.gr()) {
         this.a(blp.m).a(0.07F);
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
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (this.gw()) {
         return bib.d;
      } else if (this.ge()) {
         this.x(false);
         return bib.a(this.dL().B);
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
               return bib.d;
            }

            this.gI();
            this.y(true);
            ckj $$3 = this.c(bjy.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(bjy.a, new ckj($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bib.a;
      } else {
         return bib.d;
      }
   }

   @Nullable
   @Override
   protected aqc w() {
      if (this.fW()) {
         return aqd.qT;
      } else {
         return this.gs() ? aqd.qU : aqd.qO;
      }
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.qR, 0.15F, 1.0F);
   }

   @Override
   public boolean m(ckj $$0) {
      return $$0.a(cuc.mZ.k());
   }

   private boolean l(ckj $$0) {
      return this.m($$0) || $$0.a(cuc.eg.k());
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.qP;
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.qV;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.y();
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements atr {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final atr.a<bwj.a> h = atr.a(bwj.a::values);
      private static final IntFunction<bwj.a> i = arr.a(bwj.a::a, values(), arr.a.a);
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

      static bwj.a a(bwj.a $$0, bwj.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bwj.a a(int $$0) {
         return i.apply($$0);
      }

      public static bwj.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bwj.a a(ate $$0) {
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

   static class b extends bro {
      private final bwj b;

      public b(bwj $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends bkj> extends bql<T> {
      private final bwj i;

      public c(bwj $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bjw.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends bqq {
      private final bwj d;
      private int e;

      public d(bwj $$0, double $$1) {
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
                  ccx $$0 = this.b.a(bwj.cc, this.d);
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
                     if (this.b.a_($$1).a(cuc.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bsw {
      private final bwj a;

      public e(bwj $$0, Class<?>... $$1) {
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
      protected void a(bkl $$0, bkj $$1) {
         if ($$0 instanceof bwj && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bre {
      private final bwj a;
      private int b;

      public f(bwj $$0) {
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

   static class g extends brm {
      private final bwj h;

      public g(bwj $$0, Class<? extends bkj> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bkj $$0) {
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
               if (this.f == ccx.class) {
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

   static class h extends bqh {
      private final bwj l;

      public h(bwj $$0) {
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

   static class i extends brx {
      private final bwj h;

      public i(bwj $$0, double $$1) {
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

   static class j extends bre {
      private final bwj a;

      public j(bwj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bre.a.a, bre.a.b, bre.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.n_() || this.a.gt()) && this.a.aA()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dB() * (float) (Math.PI / 180.0);
               float $$1 = -asy.a($$0);
               float $$2 = asy.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? asy.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? asy.j((double)$$2) : 0;
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

   class k extends bre {
      private int b;

      public k() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bwj.this.ah && !bwj.this.n_() && !bwj.this.aX() && bwj.this.gy() && bwj.this.s() <= 0) {
            List<bzq> $$0 = bwj.this.dL().a(bzq.class, bwj.this.cG().c(6.0, 6.0, 6.0), bwj.ct);
            return !$$0.isEmpty() || !bwj.this.c(bjy.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bwj.this.aX() && (bwj.this.gr() || bwj.this.ag.a(b(600)) != 1) ? bwj.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bwj.this.y() && !bwj.this.c(bjy.a).b()) {
            bwj.this.gI();
         }
      }

      @Override
      public void c() {
         List<bzq> $$0 = bwj.this.dL().a(bzq.class, bwj.this.cG().c(8.0, 8.0, 8.0), bwj.ct);
         if (!$$0.isEmpty() && bwj.this.c(bjy.a).b()) {
            bwj.this.L().a($$0.get(0), 1.2F);
         } else if (!bwj.this.c(bjy.a).b()) {
            bwj.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ckj $$0 = bwj.this.c(bjy.a);
         if (!$$0.b()) {
            bwj.this.b($$0);
            bwj.this.a(bjy.a, ckj.b);
            int $$1 = bwj.this.gr() ? bwj.this.ag.a(50) + 10 : bwj.this.ag.a(150) + 10;
            this.b = bwj.this.ah + $$1 * 20;
         }

         bwj.this.w(false);
      }
   }

   static class l extends bre {
      private final bwj a;

      public l(bwj $$0) {
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
