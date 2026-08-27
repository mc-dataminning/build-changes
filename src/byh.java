import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byh extends bxs {
   private static final agj<Integer> bW = agm.a(byh.class, agl.b);
   private static final agj<Integer> bX = agm.a(byh.class, agl.b);
   private static final agj<Integer> bY = agm.a(byh.class, agl.b);
   private static final agj<Byte> bZ = agm.a(byh.class, agl.a);
   private static final agj<Byte> ca = agm.a(byh.class, agl.a);
   private static final agj<Byte> cb = agm.a(byh.class, agl.a);
   static final bwt cc = bwt.b().a(8.0);
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
   private elm cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   byh.g cs;
   static final Predicate<cbo> ct = $$0 -> {
      cmr $$1 = $$0.q();
      return ($$1.a(cwl.mZ.k()) || $$1.a(cwl.eg.k())) && $$0.bx() && !$$0.z();
   };

   public byh(blt<? extends byh> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new byh.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cmr $$0) {
      blu $$1 = bmh.h($$0);
      return !this.c($$1).b() ? false : $$1 == blu.a && super.f($$0);
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

   public byh.a gm() {
      return byh.a.a(this.an.b(bZ));
   }

   public void a(byh.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byh.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public byh.a gn() {
      return byh.a.a(this.an.b(ca));
   }

   public void b(byh.a $$0) {
      if ($$0.a() > 6) {
         $$0 = byh.a.a(this.ag);
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
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gm().c());
      $$0.a("HiddenGene", this.gn().c());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(byh.a.a($$0.l("MainGene")));
      this.b(byh.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      byh $$2 = blt.at.a((cti)$$0);
      if ($$2 != null) {
         if ($$1 instanceof byh $$3) {
            $$2.a(this, $$3);
         }

         $$2.gx();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(2, new byh.i(this, 2.0));
      this.bO.a(2, new byh.d(this, 1.0));
      this.bO.a(3, new byh.b(this, 1.2F, true));
      this.bO.a(4, new buj(this, 1.0, cps.a(cwl.mZ.k()), false));
      this.bO.a(6, new byh.c<>(this, cfb.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new byh.c<>(this, ccj.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new byh.k());
      this.bO.a(8, new byh.f(this));
      this.bO.a(8, new byh.l(this));
      this.cs = new byh.g(this, cfb.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new btw(this));
      this.bO.a(12, new byh.j(this));
      this.bO.a(13, new bta(this, 1.25));
      this.bO.a(14, new buo(this, 1.0));
      this.bP.a(1, new byh.e(this).a(new Class[0]));
   }

   public static bnk.a gp() {
      return bmh.C().a(bnl.m, 0.15F).a(bnl.c, 6.0);
   }

   public byh.a gq() {
      return byh.a.a(this.gm(), this.gn());
   }

   public boolean gr() {
      return this.gq() == byh.a.b;
   }

   public boolean gs() {
      return this.gq() == byh.a.c;
   }

   public boolean gt() {
      return this.gq() == byh.a.d;
   }

   public boolean gu() {
      return this.gq() == byh.a.e;
   }

   public boolean gv() {
      return this.gq() == byh.a.f;
   }

   @Override
   public boolean fW() {
      return this.gq() == byh.a.g;
   }

   @Override
   public boolean a(cfb $$0) {
      return false;
   }

   @Override
   public boolean C(blp $$0) {
      this.a(arm.rI, 1.0F, 1.0F);
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

      bmf $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(arm.rE, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gl() + 1);
         if (this.gl() > 20) {
            this.z(false);
            this.gG();
         } else if (this.gl() == 1) {
            this.a(arm.ry, 1.0F, 1.0F);
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
      if (!this.gk() && this.A() && !this.gw() && !this.c(blu.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(blu.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gk()) {
         this.gB();
         if (!this.dM().B && this.gz() > 80 && this.ag.a(20) == 1) {
            if (this.gz() > 100 && this.l(this.c(blu.a))) {
               if (!this.dM().B) {
                  this.a(blu.a, cmr.f);
                  this.a(dnk.m);
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
         this.a(arm.rC, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            elm $$1 = new elm(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            elm $$3 = new elm(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jt(jx.Q, this.c(blu.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return aui.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return aui.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return aui.i($$0, this.cr, this.cq);
   }

   private void gF() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            elm $$0 = this.dp();
            if (this.bU == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cl = new elm($$0.c + (double)(-aui.a($$1) * $$2), 0.0, $$0.e + (double)(aui.b($$1) * $$2));
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
      elm $$0 = this.dp();
      this.dM()
         .a(
            jx.ad,
            this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)aui.a(this.aU * (float) (Math.PI / 180.0)),
            this.dv() - 0.1F,
            this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)aui.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(arm.rz, 1.0F, 1.0F);

      for (byh $$2 : this.dM().a(byh.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gy()) {
            $$2.fb();
         }
      }

      if (!this.dM().y_() && this.ag.a(700) == 0 && this.dM().Z().b(cte.f)) {
         this.a(cmu.qN);
      }
   }

   @Override
   protected void b(cbo $$0) {
      if (this.c(blu.a).b() && ct.test($$0)) {
         this.a($$0);
         cmr $$1 = $$0.q();
         this.a(blu.a, $$1);
         this.e(blu.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      this.a(byh.a.a($$5));
      this.b(byh.a.a($$5));
      this.gx();
      if ($$3 == null) {
         $$3 = new blk.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(byh $$0, @Nullable byh $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gH());
            this.b(byh.a.a(this.ag));
         } else {
            this.a(byh.a.a(this.ag));
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
         this.a(byh.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(byh.a.a(this.ag));
      }
   }

   private byh.a gH() {
      return this.ag.h() ? this.gm() : this.gn();
   }

   public void gx() {
      if (this.gv()) {
         this.a(bnl.l).a(10.0);
      }

      if (this.gr()) {
         this.a(bnl.m).a(0.07F);
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
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if (this.gw()) {
         return bjv.d;
      } else if (this.ge()) {
         this.x(false);
         return bjv.a(this.dM().B);
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
               return bjv.d;
            }

            this.gI();
            this.y(true);
            cmr $$3 = this.c(blu.a);
            if (!$$3.b() && !$$0.fT().d) {
               this.b($$3);
            }

            this.a(blu.a, new cmr($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bjv.a;
      } else {
         return bjv.d;
      }
   }

   @Nullable
   @Override
   protected arl y() {
      if (this.fW()) {
         return arm.rF;
      } else {
         return this.gs() ? arm.rG : arm.rA;
      }
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.rD, 0.15F, 1.0F);
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(cwl.mZ.k());
   }

   private boolean l(cmr $$0) {
      return this.m($$0) || $$0.a(cwl.eg.k());
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.rB;
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return arm.rH;
   }

   public boolean gy() {
      return !this.ge() && !this.gw() && !this.gk() && !this.go() && !this.A();
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements ave {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ave.a<byh.a> h = ave.a(byh.a::values);
      private static final IntFunction<byh.a> i = ata.a(byh.a::a, values(), ata.a.a);
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

      static byh.a a(byh.a $$0, byh.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static byh.a a(int $$0) {
         return i.apply($$0);
      }

      public static byh.a a(String $$0) {
         return h.a($$0, a);
      }

      public static byh.a a(aup $$0) {
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

   static class b extends btl {
      private final byh b;

      public b(byh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gy() && super.a();
      }
   }

   static class c<T extends bmf> extends bsi<T> {
      private final byh i;

      public c(byh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bls.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gs() && this.i.gy() && super.a();
      }
   }

   static class d extends bsn {
      private final byh d;
      private int e;

      public d(byh $$0, double $$1) {
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
                  cfb $$0 = this.b.a(byh.cc, this.d);
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
                     if (this.b.a_($$1).a(cwl.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends but {
      private final byh a;

      public e(byh $$0, Class<?>... $$1) {
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
      protected void a(bmh $$0, bmf $$1) {
         if ($$0 instanceof byh && $$0.fW()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends btb {
      private final byh a;
      private int b;

      public f(byh $$0) {
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

   static class g extends btj {
      private final byh h;

      public g(byh $$0, Class<? extends bmf> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bmf $$0) {
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
               if (this.f == cfb.class) {
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

   static class h extends bse {
      private final byh l;

      public h(byh $$0) {
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

   static class i extends btu {
      private final byh h;

      public i(byh $$0, double $$1) {
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

   static class j extends btb {
      private final byh a;

      public j(byh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btb.a.a, btb.a.b, btb.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gt()) && this.a.aC()) {
            if (!this.a.gy()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -aui.a($$0);
               float $$2 = aui.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aui.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aui.j((double)$$2) : 0;
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

   class k extends btb {
      private int b;

      public k() {
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= byh.this.ah && !byh.this.o_() && !byh.this.aZ() && byh.this.gy() && byh.this.u() <= 0) {
            List<cbo> $$0 = byh.this.dM().a(cbo.class, byh.this.cH().c(6.0, 6.0, 6.0), byh.ct);
            return !$$0.isEmpty() || !byh.this.c(blu.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !byh.this.aZ() && (byh.this.gr() || byh.this.ag.a(b(600)) != 1) ? byh.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!byh.this.A() && !byh.this.c(blu.a).b()) {
            byh.this.gI();
         }
      }

      @Override
      public void c() {
         List<cbo> $$0 = byh.this.dM().a(cbo.class, byh.this.cH().c(8.0, 8.0, 8.0), byh.ct);
         if (!$$0.isEmpty() && byh.this.c(blu.a).b()) {
            byh.this.N().a($$0.get(0), 1.2F);
         } else if (!byh.this.c(blu.a).b()) {
            byh.this.gI();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmr $$0 = byh.this.c(blu.a);
         if (!$$0.b()) {
            byh.this.b($$0);
            byh.this.a(blu.a, cmr.f);
            int $$1 = byh.this.gr() ? byh.this.ag.a(50) + 10 : byh.this.ag.a(150) + 10;
            this.b = byh.this.ah + $$1 * 20;
         }

         byh.this.w(false);
      }
   }

   static class l extends btb {
      private final byh a;

      public l(byh $$0) {
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
