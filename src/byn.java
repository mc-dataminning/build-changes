import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byn extends bxy {
   private static final agm<Integer> bW = agp.a(byn.class, ago.b);
   private static final agm<Integer> bX = agp.a(byn.class, ago.b);
   private static final agm<Integer> bY = agp.a(byn.class, ago.b);
   private static final agm<Byte> bZ = agp.a(byn.class, ago.a);
   private static final agm<Byte> ca = agp.a(byn.class, ago.a);
   private static final agm<Byte> cb = agp.a(byn.class, ago.a);
   static final bwz cc = bwz.b().a(8.0);
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
   private elt cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   byn.g cs;
   static final Predicate<cbu> ct = $$0 -> {
      cmy $$1 = $$0.q();
      return ($$1.a(cws.mZ.k()) || $$1.a(cws.eg.k())) && $$0.bx() && !$$0.z();
   };

   public byn(blz<? extends byn> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new byn.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cmy $$0) {
      bma $$1 = bmn.h($$0);
      return !this.c($$1).b() ? false : $$1 == bma.a && super.f($$0);
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

   public byn.a gm() {
      return byn.a.a(this.an.b(bZ));
   }

   public void a(byn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byn.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public byn.a gn() {
      return byn.a.a(this.an.b(ca));
   }

   public void b(byn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byn.a.a(this.ag);
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gm().c());
      $$0.a("HiddenGene", this.gn().c());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(byn.a.a($$0.l("MainGene")));
      this.b(byn.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      byn $$2 = blz.at.a((ctp)$$0);
      if ($$2 != null) {
         if ($$1 instanceof byn $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(2, new byn.i(this, 2.0));
      this.bO.a(2, new byn.d(this, 1.0));
      this.bO.a(3, new byn.b(this, 1.2F, true));
      this.bO.a(4, new bup(this, 1.0, cpz.a(cws.mZ.k()), false));
      this.bO.a(6, new byn.c<>(this, cfi.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new byn.c<>(this, ccp.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new byn.k());
      this.bO.a(8, new byn.f(this));
      this.bO.a(8, new byn.l(this));
      this.cs = new byn.g(this, cfi.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new buc(this));
      this.bO.a(12, new byn.j(this));
      this.bO.a(13, new btg(this, 1.25));
      this.bO.a(14, new buu(this, 1.0));
      this.bP.a(1, new byn.e(this).a(new Class[0]));
   }

   public static bnq.a gp() {
      return bmn.C().a(bnr.m, 0.15F).a(bnr.c, 6.0);
   }

   public byn.a gq() {
      return byn.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == byn.a.b;
   }

   public boolean gs() {
      return this.gq() == byn.a.c;
   }

   public boolean gt() {
      return this.gq() == byn.a.d;
   }

   public boolean gu() {
      return this.gq() == byn.a.e;
   }

   public boolean gv() {
      return this.gq() == byn.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == byn.a.g;
   }

   @Override
   public boolean a(cfi $$0) {
      return false;
   }

   @Override
   public boolean C(blv $$0) {
      this.a(ars.rI, 1.0F, 1.0F);
      if (!this.fW()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gs()) {
         if (this.dM().aa() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gk()) {
            this.w(false);
         }
      }

      bml $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(ars.rE, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(ars.ry, 1.0F, 1.0F);
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
      return this.gs() && this.dM().aa();
   }

   private void gA() {
      if (!this.gk() && this.A() && !this.gw() && !this.c(bma.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bma.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dM().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(bma.a))) {
               if (!this.dM().B) {
                  this.a(bma.a, cmy.f);
                  this.a(dnr.m);
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
         this.a(ars.rC, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            elt $$1 = new elt(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            elt $$3 = new elt(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jt(jx.Q, this.c(bma.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return auo.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return auo.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return auo.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            elt $$0 = this.dp();
            if (this.bU == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cl = new elt($$0.c + (double)(-auo.a($$1) * $$2), 0.0, $$0.e + (double)(auo.b($$1) * $$2));
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
      elt $$0 = this.dp();
      this.dM()
         .a(
            jx.ad,
            this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)auo.a(this.aU * (float) (Math.PI / 180.0)),
            this.dv() - 0.1F,
            this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)auo.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(ars.rz, 1.0F, 1.0F);

      for (byn $$2 : this.dM().a(byn.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gy()) {
            $$2.fb();
         }
      }

      if (!this.dM().y_() && this.ag.a(700) == 0 && this.dM().Z().b(ctl.f)) {
         this.a(cnb.qN);
      }
   }

   @Override
   protected void b(cbu $$0) {
      if (this.c(bma.a).b() && ct.test($$0)) {
         this.a($$0);
         cmy $$1 = $$0.q();
         this.a(bma.a, $$1);
         this.e(bma.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      this.a(byn.a.a($$5));
      this.b(byn.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new blq.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(byn $$0, @Nullable byn $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(byn.a.a(this.ag));
         } else {
            this.a(byn.a.a(this.ag));
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
         this.a(byn.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(byn.a.a(this.ag));
      }
   }

   private byn.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(bnr.l).a(10.0);
      }

      if (this.gr()) {
         this.a(bnr.m).a(0.07F);
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
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (this.gw()) {
         return bkb.d;
      } else if (this.ge()) {
         this.x(false);
         return bkb.a(this.dM().B);
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
               return bkb.d;
            }

            this.gI();
            this.y(true);
            cmy $$3 = this.c(bma.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(bma.a, new cmy($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bkb.a;
      } else {
         return bkb.d;
      }
   }

   @Nullable
   @Override
   protected arr y() {
      if (this.fW()) {
         return ars.rF;
      } else {
         return this.gs() ? ars.rG : ars.rA;
      }
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.rD, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cmy $$0) {
      return $$0.a(cws.mZ.k());
   }

   private boolean l(cmy $$0) {
      return this.m($$0) || $$0.a(cws.eg.k());
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.rB;
   }

   @Nullable
   @Override
   protected arr d(bkt $$0) {
      return ars.rH;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.A();
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements avk {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final avk.a<byn.a> h = avk.a(byn.a::values);
      private static final IntFunction<byn.a> i = atg.a(byn.a::a, values(), atg.a.a);
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

      static byn.a a(byn.a $$0, byn.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static byn.a a(int $$0) {
         return i.apply($$0);
      }

      public static byn.a a(String $$0) {
         return h.a($$0, a);
      }

      public static byn.a a(auv $$0) {
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

   static class b extends btr {
      private final byn b;

      public b(byn $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends bml> extends bso<T> {
      private final byn i;

      public c(byn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bly.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends bst {
      private final byn d;
      private int e;

      public d(byn $$0, double $$1) {
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
                  cfi $$0 = this.b.a(byn.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         hx $$0 = this.d.dm();
         hx.a $$1 = new hx.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cws.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends buz {
      private final byn a;

      public e(byn $$0, Class<?>... $$1) {
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
      protected void a(bmn $$0, bml $$1) {
         if ($$0 instanceof byn && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bth {
      private final byn a;
      private int b;

      public f(byn $$0) {
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

   static class g extends btp {
      private final byn h;

      public g(byn $$0, Class<? extends bml> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bml $$0) {
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
               if (this.f == cfi.class) {
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

   static class h extends bsk {
      private final byn l;

      public h(byn $$0) {
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

   static class i extends bua {
      private final byn h;

      public i(byn $$0, double $$1) {
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

   static class j extends bth {
      private final byn a;

      public j(byn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bth.a.a, bth.a.b, bth.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gt()) && this.a.aC()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -auo.a($$0);
               float $$2 = auo.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? auo.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? auo.j((double)$$2) : 0;
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

   class k extends bth {
      private int b;

      public k() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= byn.this.ah && !byn.this.o_() && !byn.this.aZ() && byn.this.gy() && byn.this.u() <= 0) {
            List<cbu> $$0 = byn.this.dM().a(cbu.class, byn.this.cH().c(6.0, 6.0, 6.0), byn.ct);
            return !$$0.isEmpty() || !byn.this.c(bma.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !byn.this.aZ() && (byn.this.gr() || byn.this.ag.a(b(600)) != 1) ? byn.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!byn.this.A() && !byn.this.c(bma.a).b()) {
            byn.this.gI();
         }
      }

      @Override
      public void c() {
         List<cbu> $$0 = byn.this.dM().a(cbu.class, byn.this.cH().c(8.0, 8.0, 8.0), byn.ct);
         if (!$$0.isEmpty() && byn.this.c(bma.a).b()) {
            byn.this.N().a($$0.get(0), 1.2F);
         } else if (!byn.this.c(bma.a).b()) {
            byn.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmy $$0 = byn.this.c(bma.a);
         if (!$$0.b()) {
            byn.this.b($$0);
            byn.this.a(bma.a, cmy.f);
            int $$1 = byn.this.gr() ? byn.this.ag.a(50) + 10 : byn.this.ag.a(150) + 10;
            this.b = byn.this.ah + $$1 * 20;
         }

         byn.this.w(false);
      }
   }

   static class l extends bth {
      private final byn a;

      public l(byn $$0) {
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
