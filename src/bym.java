import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bym extends bxx {
   private static final agm<Integer> bW = agp.a(bym.class, ago.b);
   private static final agm<Integer> bX = agp.a(bym.class, ago.b);
   private static final agm<Integer> bY = agp.a(bym.class, ago.b);
   private static final agm<Byte> bZ = agp.a(bym.class, ago.a);
   private static final agm<Byte> ca = agp.a(bym.class, ago.a);
   private static final agm<Byte> cb = agp.a(bym.class, ago.a);
   static final bwy cc = bwy.b().a(8.0);
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
   private els cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bym.g cs;
   static final Predicate<cbt> ct = $$0 -> {
      cmx $$1 = $$0.q();
      return ($$1.a(cwr.mZ.k()) || $$1.a(cwr.eg.k())) && $$0.bx() && !$$0.z();
   };

   public bym(bly<? extends bym> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bym.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cmx $$0) {
      blz $$1 = bmm.h($$0);
      return !this.c($$1).b() ? false : $$1 == blz.a && super.f($$0);
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

   public bym.a gm() {
      return bym.a.a(this.an.b(bZ));
   }

   public void a(bym.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bym.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bym.a gn() {
      return bym.a.a(this.an.b(ca));
   }

   public void b(bym.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bym.a.a(this.ag);
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
      this.a(bym.a.a($$0.l("MainGene")));
      this.b(bym.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      bym $$2 = bly.at.a((cto)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bym $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bta(this));
      this.bO.a(2, new bym.i(this, 2.0));
      this.bO.a(2, new bym.d(this, 1.0));
      this.bO.a(3, new bym.b(this, 1.2F, true));
      this.bO.a(4, new buo(this, 1.0, cpy.a(cwr.mZ.k()), false));
      this.bO.a(6, new bym.c<>(this, cfh.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bym.c<>(this, cco.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bym.k());
      this.bO.a(8, new bym.f(this));
      this.bO.a(8, new bym.l(this));
      this.cs = new bym.g(this, cfh.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new bub(this));
      this.bO.a(12, new bym.j(this));
      this.bO.a(13, new btf(this, 1.25));
      this.bO.a(14, new but(this, 1.0));
      this.bP.a(1, new bym.e(this).a(new Class[0]));
   }

   public static bnp.a gp() {
      return bmm.C().a(bnq.m, 0.15F).a(bnq.c, 6.0);
   }

   public bym.a gq() {
      return bym.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == bym.a.b;
   }

   public boolean gs() {
      return this.gq() == bym.a.c;
   }

   public boolean gt() {
      return this.gq() == bym.a.d;
   }

   public boolean gu() {
      return this.gq() == bym.a.e;
   }

   public boolean gv() {
      return this.gq() == bym.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == bym.a.g;
   }

   @Override
   public boolean a(cfh $$0) {
      return false;
   }

   @Override
   public boolean C(blu $$0) {
      this.a(arr.rI, 1.0F, 1.0F);
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

      bmk $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(arr.rE, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(arr.ry, 1.0F, 1.0F);
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
      if (!this.gk() && this.A() && !this.gw() && !this.c(blz.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(blz.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dM().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(blz.a))) {
               if (!this.dM().B) {
                  this.a(blz.a, cmx.f);
                  this.a(dnq.m);
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
         this.a(arr.rC, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            els $$1 = new els(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            els $$3 = new els(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jt(jx.Q, this.c(blz.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return aun.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return aun.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return aun.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            els $$0 = this.dp();
            if (this.bU == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cl = new els($$0.c + (double)(-aun.a($$1) * $$2), 0.0, $$0.e + (double)(aun.b($$1) * $$2));
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
      els $$0 = this.dp();
      this.dM()
         .a(
            jx.ad,
            this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)aun.a(this.aU * (float) (Math.PI / 180.0)),
            this.dv() - 0.1F,
            this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)aun.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(arr.rz, 1.0F, 1.0F);

      for (bym $$2 : this.dM().a(bym.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gy()) {
            $$2.fb();
         }
      }

      if (!this.dM().y_() && this.ag.a(700) == 0 && this.dM().Z().b(ctk.f)) {
         this.a(cna.qN);
      }
   }

   @Override
   protected void b(cbt $$0) {
      if (this.c(blz.a).b() && ct.test($$0)) {
         this.a($$0);
         cmx $$1 = $$0.q();
         this.a(blz.a, $$1);
         this.e(blz.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      this.a(bym.a.a($$5));
      this.b(bym.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new blp.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bym $$0, @Nullable bym $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(bym.a.a(this.ag));
         } else {
            this.a(bym.a.a(this.ag));
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
         this.a(bym.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bym.a.a(this.ag));
      }
   }

   private bym.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(bnq.l).a(10.0);
      }

      if (this.gr()) {
         this.a(bnq.m).a(0.07F);
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
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (this.gw()) {
         return bka.d;
      } else if (this.ge()) {
         this.x(false);
         return bka.a(this.dM().B);
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
               return bka.d;
            }

            this.gI();
            this.y(true);
            cmx $$3 = this.c(blz.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(blz.a, new cmx($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bka.a;
      } else {
         return bka.d;
      }
   }

   @Nullable
   @Override
   protected arq y() {
      if (this.fW()) {
         return arr.rF;
      } else {
         return this.gs() ? arr.rG : arr.rA;
      }
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.rD, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cmx $$0) {
      return $$0.a(cwr.mZ.k());
   }

   private boolean l(cmx $$0) {
      return this.m($$0) || $$0.a(cwr.eg.k());
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.rB;
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return arr.rH;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.A();
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements avj {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final avj.a<bym.a> h = avj.a(bym.a::values);
      private static final IntFunction<bym.a> i = atf.a(bym.a::a, values(), atf.a.a);
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

      static bym.a a(bym.a $$0, bym.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bym.a a(int $$0) {
         return i.apply($$0);
      }

      public static bym.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bym.a a(auu $$0) {
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

   static class b extends btq {
      private final bym b;

      public b(bym $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends bmk> extends bsn<T> {
      private final bym i;

      public c(bym $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, blx.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends bss {
      private final bym d;
      private int e;

      public d(bym $$0, double $$1) {
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
                  cfh $$0 = this.b.a(bym.cc, this.d);
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
                     if (this.b.a_($$1).a(cwr.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends buy {
      private final bym a;

      public e(bym $$0, Class<?>... $$1) {
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
      protected void a(bmm $$0, bmk $$1) {
         if ($$0 instanceof bym && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends btg {
      private final bym a;
      private int b;

      public f(bym $$0) {
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

   static class g extends bto {
      private final bym h;

      public g(bym $$0, Class<? extends bmk> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bmk $$0) {
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
               if (this.f == cfh.class) {
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

   static class h extends bsj {
      private final bym l;

      public h(bym $$0) {
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

   static class i extends btz {
      private final bym h;

      public i(bym $$0, double $$1) {
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

   static class j extends btg {
      private final bym a;

      public j(bym $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.a, btg.a.b, btg.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gt()) && this.a.aC()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -aun.a($$0);
               float $$2 = aun.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aun.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aun.j((double)$$2) : 0;
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

   class k extends btg {
      private int b;

      public k() {
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bym.this.ah && !bym.this.o_() && !bym.this.aZ() && bym.this.gy() && bym.this.u() <= 0) {
            List<cbt> $$0 = bym.this.dM().a(cbt.class, bym.this.cH().c(6.0, 6.0, 6.0), bym.ct);
            return !$$0.isEmpty() || !bym.this.c(blz.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bym.this.aZ() && (bym.this.gr() || bym.this.ag.a(b(600)) != 1) ? bym.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bym.this.A() && !bym.this.c(blz.a).b()) {
            bym.this.gI();
         }
      }

      @Override
      public void c() {
         List<cbt> $$0 = bym.this.dM().a(cbt.class, bym.this.cH().c(8.0, 8.0, 8.0), bym.ct);
         if (!$$0.isEmpty() && bym.this.c(blz.a).b()) {
            bym.this.N().a($$0.get(0), 1.2F);
         } else if (!bym.this.c(blz.a).b()) {
            bym.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmx $$0 = bym.this.c(blz.a);
         if (!$$0.b()) {
            bym.this.b($$0);
            bym.this.a(blz.a, cmx.f);
            int $$1 = bym.this.gr() ? bym.this.ag.a(50) + 10 : bym.this.ag.a(150) + 10;
            this.b = bym.this.ah + $$1 * 20;
         }

         bym.this.w(false);
      }
   }

   static class l extends btg {
      private final bym a;

      public l(bym $$0) {
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
