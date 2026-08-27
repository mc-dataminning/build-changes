import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxx extends bxi {
   private static final afz<Integer> bW = agc.a(bxx.class, agb.b);
   private static final afz<Integer> bX = agc.a(bxx.class, agb.b);
   private static final afz<Integer> bY = agc.a(bxx.class, agb.b);
   private static final afz<Byte> bZ = agc.a(bxx.class, agb.a);
   private static final afz<Byte> ca = agc.a(bxx.class, agb.a);
   private static final afz<Byte> cb = agc.a(bxx.class, agb.a);
   static final bwj cc = bwj.b().a(8.0);
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
   private elb cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bxx.g cs;
   static final Predicate<cbe> ct = $$0 -> {
      cmh $$1 = $$0.q();
      return ($$1.a(cwb.mZ.k()) || $$1.a(cwb.eg.k())) && $$0.bx() && !$$0.z();
   };

   public bxx(blj<? extends bxx> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new bxx.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cmh $$0) {
      blk $$1 = blx.h($$0);
      return !this.c($$1).b() ? false : $$1 == blk.a && super.f($$0);
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

   public bxx.a gm() {
      return bxx.a.a(this.an.b(bZ));
   }

   public void a(bxx.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxx.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bxx.a gn() {
      return bxx.a.a(this.an.b(ca));
   }

   public void b(bxx.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxx.a.a(this.ag);
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
   protected void c_() {
      super.c_();
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gm().c());
      $$0.a("HiddenGene", this.gn().c());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(bxx.a.a($$0.l("MainGene")));
      this.b(bxx.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      bxx $$2 = blj.at.a((csy)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bxx $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(2, new bxx.i(this, 2.0));
      this.bO.a(2, new bxx.d(this, 1.0));
      this.bO.a(3, new bxx.b(this, 1.2F, true));
      this.bO.a(4, new btz(this, 1.0, cpi.a(cwb.mZ.k()), false));
      this.bO.a(6, new bxx.c<>(this, cer.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bxx.c<>(this, cbz.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bxx.k());
      this.bO.a(8, new bxx.f(this));
      this.bO.a(8, new bxx.l(this));
      this.cs = new bxx.g(this, cer.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new btm(this));
      this.bO.a(12, new bxx.j(this));
      this.bO.a(13, new bsq(this, 1.25));
      this.bO.a(14, new bue(this, 1.0));
      this.bP.a(1, new bxx.e(this).a(new Class[0]));
   }

   public static bna.a gp() {
      return blx.C().a(bnb.m, 0.15F).a(bnb.c, 6.0);
   }

   public bxx.a gq() {
      return bxx.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == bxx.a.b;
   }

   public boolean gs() {
      return this.gq() == bxx.a.c;
   }

   public boolean gt() {
      return this.gq() == bxx.a.d;
   }

   public boolean gu() {
      return this.gq() == bxx.a.e;
   }

   public boolean gv() {
      return this.gq() == bxx.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == bxx.a.g;
   }

   @Override
   public boolean a(cer $$0) {
      return false;
   }

   @Override
   public boolean C(blf $$0) {
      this.a(arc.rI, 1.0F, 1.0F);
      if (!this.fW()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gs()) {
         if (this.dM().Z() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gk()) {
            this.w(false);
         }
      }

      blv $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(arc.rE, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(arc.ry, 1.0F, 1.0F);
         }
      }

      if (this.go()) {
         this.gF();
      } else {
         this.bU = 0;
      }

      if (this.A()) {
         this.s(0.0F);
      }

      this.gC();
      this.gA();
      this.gD();
      this.gE();
   }

   public boolean gw() {
      return this.gs() && this.dM().Z();
   }

   private void gA() {
      if (!this.gk() && this.A() && !this.gw() && !this.c(blk.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(blk.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dM().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(blk.a))) {
               if (!this.dM().B) {
                  this.a(blk.a, cmh.f);
                  this.a(dmz.m);
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
         this.a(arc.rC, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            elb $$1 = new elb(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            elb $$3 = new elb(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jr(jv.Q, this.c(blk.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gC() {
      this.cn = this.cm;
      if (this.A()) {
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
      return aty.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return aty.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return aty.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            elb $$0 = this.dp();
            if (this.bU == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cl = new elb($$0.c + (double)(-aty.a($$1) * $$2), 0.0, $$0.e + (double)(aty.b($$1) * $$2));
               this.g(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gG() {
      elb $$0 = this.dp();
      this.dM()
         .a(
            jv.ad,
            this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)aty.a(this.aU * (float) (Math.PI / 180.0)),
            this.dv() - 0.1F,
            this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)aty.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(arc.rz, 1.0F, 1.0F);

      for (bxx $$2 : this.dM().a(bxx.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gy()) {
            $$2.fb();
         }
      }

      if (!this.dM().y_() && this.ag.a(700) == 0 && this.dM().Y().b(csu.f)) {
         this.a(cmk.qN);
      }
   }

   @Override
   protected void b(cbe $$0) {
      if (this.c(blk.a).b() && ct.test($$0)) {
         this.a($$0);
         cmh $$1 = $$0.q();
         this.a(blk.a, $$1);
         this.e(blk.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      this.a(bxx.a.a($$5));
      this.b(bxx.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new bla.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bxx $$0, @Nullable bxx $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(bxx.a.a(this.ag));
         } else {
            this.a(bxx.a.a(this.ag));
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
         this.a(bxx.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bxx.a.a(this.ag));
      }
   }

   private bxx.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(bnb.l).a(10.0);
      }

      if (this.gr()) {
         this.a(bnb.m).a(0.07F);
      }
   }

   void gI() {
      if (!this.aZ()) {
         this.A(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (this.gw()) {
         return bjl.d;
      } else if (this.ge()) {
         this.x(false);
         return bjl.a(this.dM().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cj = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dM().B && this.h() == 0 && this.gf()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dM().B || this.A() || this.aZ()) {
               return bjl.d;
            }

            this.gI();
            this.y(true);
            cmh $$3 = this.c(blk.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(blk.a, new cmh($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bjl.a;
      } else {
         return bjl.d;
      }
   }

   @Nullable
   @Override
   protected arb y() {
      if (this.fW()) {
         return arc.rF;
      } else {
         return this.gs() ? arc.rG : arc.rA;
      }
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.rD, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cmh $$0) {
      return $$0.a(cwb.mZ.k());
   }

   private boolean l(cmh $$0) {
      return this.m($$0) || $$0.a(cwb.eg.k());
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.rB;
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.rH;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.A();
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements aut {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final aut.a<bxx.a> h = aut.a(bxx.a::values);
      private static final IntFunction<bxx.a> i = asq.a(bxx.a::a, values(), asq.a.a);
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

      static bxx.a a(bxx.a $$0, bxx.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bxx.a a(int $$0) {
         return i.apply($$0);
      }

      public static bxx.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bxx.a a(auf $$0) {
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

   static class b extends btb {
      private final bxx b;

      public b(bxx $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends blv> extends bry<T> {
      private final bxx i;

      public c(bxx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bli.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends bsd {
      private final bxx d;
      private int e;

      public d(bxx $$0, double $$1) {
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
                  cer $$0 = this.b.a(bxx.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         hv $$0 = this.d.dm();
         hv.a $$1 = new hv.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cwb.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends buj {
      private final bxx a;

      public e(bxx $$0, Class<?>... $$1) {
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
      protected void a(blx $$0, blv $$1) {
         if ($$0 instanceof bxx && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bsr {
      private final bxx a;
      private int b;

      public f(bxx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gr() && this.a.gy() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aZ() && (this.a.gr() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bsz {
      private final bxx h;

      public g(bxx $$0, Class<? extends blv> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(blv $$0) {
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
               if (this.f == cer.class) {
                  this.c = this.b.dM().a(this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
               } else {
                  this.c = this.b
                     .dM()
                     .a(
                        this.b.dM().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dr(),
                        this.b.dv(),
                        this.b.dx()
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

   static class h extends bru {
      private final bxx l;

      public h(bxx $$0) {
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

   static class i extends btk {
      private final bxx h;

      public i(bxx $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
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

   static class j extends bsr {
      private final bxx a;

      public j(bxx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.a, bsr.a.b, bsr.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gt()) && this.a.aC()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -aty.a($$0);
               float $$2 = aty.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aty.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aty.j((double)$$2) : 0;
               if (this.a.dM().a_(this.a.dm().b($$3, -1, $$4)).i()) {
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
      public boolean S_() {
         return false;
      }
   }

   class k extends bsr {
      private int b;

      public k() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bxx.this.ah && !bxx.this.o_() && !bxx.this.aZ() && bxx.this.gy() && bxx.this.u() <= 0) {
            List<cbe> $$0 = bxx.this.dM().a(cbe.class, bxx.this.cH().c(6.0, 6.0, 6.0), bxx.ct);
            return !$$0.isEmpty() || !bxx.this.c(blk.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bxx.this.aZ() && (bxx.this.gr() || bxx.this.ag.a(b(600)) != 1) ? bxx.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bxx.this.A() && !bxx.this.c(blk.a).b()) {
            bxx.this.gI();
         }
      }

      @Override
      public void c() {
         List<cbe> $$0 = bxx.this.dM().a(cbe.class, bxx.this.cH().c(8.0, 8.0, 8.0), bxx.ct);
         if (!$$0.isEmpty() && bxx.this.c(blk.a).b()) {
            bxx.this.N().a($$0.get(0), 1.2F);
         } else if (!bxx.this.c(blk.a).b()) {
            bxx.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmh $$0 = bxx.this.c(blk.a);
         if (!$$0.b()) {
            bxx.this.b($$0);
            bxx.this.a(blk.a, cmh.f);
            int $$1 = bxx.this.gr() ? bxx.this.ag.a(50) + 10 : bxx.this.ag.a(150) + 10;
            this.b = bxx.this.ah + $$1 * 20;
         }

         bxx.this.w(false);
      }
   }

   static class l extends bsr {
      private final bxx a;

      public l(bxx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gy()) {
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
