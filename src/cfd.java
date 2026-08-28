import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cfd extends cfc implements btr, cfl {
   public static final float ca = 120.32113F;
   public static final int cb = ayn.f(1.4959966F);
   private static final ajv<Byte> ck = ajz.a(cfd.class, ajx.a);
   private static final ajv<Integer> cl = ajz.a(cfd.class, ajx.b);
   private static final int cm = 2;
   private static final int cn = 4;
   private static final int co = 8;
   private static final int cp = 1200;
   private static final int cq = 2400;
   private static final int cr = 3600;
   private static final int cs = 4;
   private static final int ct = 10;
   private static final int cu = 10;
   private static final int cv = 18;
   private static final int cw = 32;
   private static final int cx = 2;
   private static final int cy = 16;
   private static final int cz = 20;
   public static final String cc = "CropsGrownSincePollination";
   public static final String ce = "CannotEnterHiveTicks";
   public static final String cf = "TicksSincePollination";
   public static final String cg = "HasStung";
   public static final String ch = "HasNectar";
   public static final String ci = "flower_pos";
   public static final String cj = "hive_pos";
   private static final bqb cB = azo.a(20, 39);
   @Nullable
   private UUID cC;
   private float cD;
   private float cE;
   private int cF;
   int cG;
   private int cH;
   private int cI;
   private static final int cJ = 200;
   int cK;
   private static final int cL = 200;
   int cM = ayn.a(this.ah, 20, 60);
   @Nullable
   jd cN;
   @Nullable
   jd cO;
   cfd.k cP;
   cfd.e cQ;
   private cfd.f cR;
   private int cS;

   public cfd(bsw<? extends cfd> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new bzk(this, 20, true);
      this.bQ = new cfd.j(this);
      this.a(epp.n, -1.0F);
      this.a(epp.j, -1.0F);
      this.a(epp.k, 16.0F);
      this.a(epp.x, -1.0F);
      this.a(epp.h, -1.0F);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ck, (byte)0);
      $$0.a(cl, 0);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfd.b(this, 1.4F, true));
      this.bU.a(1, new cfd.d());
      this.bU.a(2, new bzw(this, 1.0));
      this.bU.a(3, new cbs(this, 1.25, $$0 -> $$0.a(awm.aj), false));
      this.cP = new cfd.k();
      this.bU.a(4, this.cP);
      this.bU.a(5, new caj(this, 1.25));
      this.bU.a(5, new cfd.i());
      this.cQ = new cfd.e();
      this.bU.a(5, this.cQ);
      this.cR = new cfd.f();
      this.bU.a(6, this.cR);
      this.bU.a(7, new cfd.g());
      this.bU.a(8, new cfd.l());
      this.bU.a(9, new cae(this));
      this.bV.a(1, new cfd.h(this).a(new Class[0]));
      this.bV.a(2, new cfd.c(this));
      this.bV.a(3, new ccj<>(this, true));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.go()) {
         $$0.a("hive_pos", up.a(this.gp()));
      }

      if (this.t()) {
         $$0.a("flower_pos", up.a(this.s()));
      }

      $$0.a("HasNectar", this.gw());
      $$0.a("HasStung", this.gx());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      this.cO = up.a($$0, "hive_pos").orElse(null);
      this.cN = up.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.a(this.dQ(), $$0);
   }

   @Override
   public boolean D(bsq $$0) {
      brj $$1 = this.dR().a((btl)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.g(buu.c)));
      if ($$2) {
         if (this.dQ() instanceof aqt $$3) {
            dac.a($$3, $$0, $$1);
         }

         if ($$0 instanceof btl $$4) {
            $$4.q($$4.eR() + 1);
            int $$5 = 0;
            if (this.dQ().al() == bqn.c) {
               $$5 = 10;
            } else if (this.dQ().al() == bqn.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bry(bsa.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(avo.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gw() && this.gF() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dQ(), this.dv() - 0.3F, this.dv() + 0.3F, this.dB() - 0.3F, this.dB() + 0.3F, this.e(0.5), lm.ay);
         }
      }

      this.gD();
   }

   private void a(dcu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lk $$6) {
      $$0.a($$6, ayn.d($$0.z.j(), $$1, $$2), $$5, ayn.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void i(jd $$0) {
      eww $$1 = eww.c($$0);
      int $$2 = 0;
      jd $$3 = this.dq();
      int $$4 = (int)$$1.d - $$3.v();
      if ($$4 > 2) {
         $$2 = 4;
      } else if ($$4 < -2) {
         $$2 = -4;
      }

      int $$5 = 6;
      int $$6 = 8;
      int $$7 = $$3.k($$0);
      if ($$7 < 15) {
         $$5 = $$7 / 2;
         $$6 = $$7 / 2;
      }

      eww $$8 = ceg.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bT.a(0.5F);
         this.bT.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public jd s() {
      return this.cN;
   }

   public boolean t() {
      return this.cN != null;
   }

   public void g(jd $$0) {
      this.cN = $$0;
   }

   @azs
   public int x() {
      return Math.max(this.cQ.d, this.cR.d);
   }

   @azs
   public List<jd> gm() {
      return this.cQ.f;
   }

   private boolean gB() {
      return this.cG > 3600;
   }

   boolean gC() {
      if (this.cH <= 0 && !this.cP.l() && !this.gx() && this.p() == null) {
         boolean $$0 = this.gB() || this.dQ().ad() || this.dQ().S() || this.gw();
         return $$0 && !this.gE();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cE, this.cD);
   }

   private void gD() {
      this.cE = this.cD;
      if (this.gJ()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gx();
      if (this.bi()) {
         this.cS++;
      } else {
         this.cS = 0;
      }

      if (this.cS > 20) {
         this.a(this.dR().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.ah.a(ayn.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dR().o(), this.ex());
         }
      }

      if (!this.gw()) {
         this.cG++;
      }

      if (!this.dQ().B) {
         this.a((aqt)this.dQ(), false);
      }
   }

   public void gn() {
      this.cG = 0;
   }

   private boolean gE() {
      if (this.cO == null) {
         return false;
      } else {
         dqf $$0 = this.dQ().c_(this.cO);
         return $$0 instanceof dqc && ((dqc)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.ao.a(cl);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cl, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cC;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cC = $$0;
   }

   @Override
   public void c() {
      this.a(cB.a(this.ah));
   }

   private boolean j(jd $$0) {
      dqf $$1 = this.dQ().c_($$0);
      return $$1 instanceof dqc ? !((dqc)$$1).d() : false;
   }

   @azs
   public boolean go() {
      return this.cO != null;
   }

   @Nullable
   @azs
   public jd gp() {
      return this.cO;
   }

   @azs
   public cal gq() {
      return this.bU;
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   int gF() {
      return this.cI;
   }

   private void gG() {
      this.cI = 0;
   }

   void gH() {
      this.cI++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         boolean $$0 = this.Z_() && !this.gx() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gI()) {
            this.cO = null;
         }
      }
   }

   boolean gI() {
      if (!this.go()) {
         return false;
      } else if (this.k(this.cO)) {
         return false;
      } else {
         dqf $$0 = this.dQ().c_(this.cO);
         return $$0 != null && $$0.r() == dqh.H;
      }
   }

   public boolean gw() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gn();
      }

      this.d(8, $$0);
   }

   public boolean gx() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gJ() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean k(jd $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(ck, (byte)(this.ao.a(ck) | $$0));
      } else {
         this.ao.a(ck, (byte)(this.ao.a(ck) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(ck) & $$0) != 0;
   }

   public static but.a gy() {
      return btn.A().a(buu.s, 10.0).a(buu.l, 0.6F).a(buu.v, 0.3F).a(buu.c, 2.0).a(buu.m, 48.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      ccw $$1 = new ccw(this, $$0) {
         @Override
         public boolean a(jd $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cfd.this.cP.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      return $$1;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.aj);
   }

   boolean l(jd $$0) {
      return this.dQ().p($$0) && this.dQ().a_($$0).a(awd.U);
   }

   @Override
   protected void b(jd $$0, dta $$1) {
   }

   @Override
   protected avn v() {
      return null;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.bP;
   }

   @Override
   protected avn n_() {
      return avo.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public cfd b(aqt $$0, bsk $$1) {
      return bsw.h.a((dcu)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   public boolean aW() {
      return this.gz() && this.ai % cb == 0;
   }

   @Override
   public boolean gz() {
      return !this.aF();
   }

   public void gA() {
      this.w(false);
      this.gG();
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.cP.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awt<eox> $$0) {
      this.i(this.dt().b(0.0, 0.01, 0.0));
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.2F));
   }

   boolean b(jd $$0, int $$1) {
      return $$0.a(this.dq(), (double)$$1);
   }

   public void h(jd $$0) {
      this.cO = $$0;
   }

   abstract class a extends cak {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cfd.this.Z_();
      }

      @Override
      public boolean c() {
         return this.i() && !cfd.this.Z_();
      }
   }

   class b extends cau {
      b(final btu $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cfd.this.Z_() && !cfd.this.gx();
      }

      @Override
      public boolean c() {
         return super.c() && cfd.this.Z_() && !cfd.this.gx();
      }
   }

   static class c extends ccd<cmv> {
      c(cfd $$0) {
         super($$0, cmv.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.p() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cfd $$0 = (cfd)this.e;
         return $$0.Z_() && !$$0.gx();
      }
   }

   class d extends cfd.a {
      @Override
      public boolean h() {
         if (cfd.this.go() && cfd.this.gC() && cfd.this.cO.a(cfd.this.do(), 2.0) && cfd.this.dQ().c_(cfd.this.cO) instanceof dqc $$1) {
            if (!$$1.d()) {
               return true;
            }

            cfd.this.cO = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cfd.this.dQ().c_(cfd.this.cO) instanceof dqc $$1) {
            $$1.a(cfd.this);
         }
      }
   }

   @azs
   public class e extends cfd.a {
      public static final int b = 600;
      int d = cfd.this.dQ().z.a(10);
      private static final int e = 3;
      final List<jd> f = Lists.newArrayList();
      @Nullable
      private epm g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean h() {
         return cfd.this.cO != null && !cfd.this.fW() && cfd.this.gC() && !this.d(cfd.this.cO) && cfd.this.dQ().a_(cfd.this.cO).a(awd.aG);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         this.i = 0;
         cfd.this.bT.n();
         cfd.this.bT.g();
      }

      @Override
      public void a() {
         if (cfd.this.cO != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cfd.this.bT.m()) {
               if (!cfd.this.b(cfd.this.cO, 16)) {
                  if (cfd.this.k(cfd.this.cO)) {
                     this.m();
                  } else {
                     cfd.this.i(cfd.this.cO);
                  }
               } else {
                  boolean $$0 = this.a(cfd.this.cO);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cfd.this.bT.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cfd.this.bT.j();
                  }
               }
            }
         }
      }

      private boolean a(jd $$0) {
         cfd.this.bT.a(10.0F);
         cfd.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cfd.this.bT.j() != null && cfd.this.bT.j().j();
      }

      boolean b(jd $$0) {
         return this.f.contains($$0);
      }

      private void c(jd $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cfd.this.cO != null) {
            this.c(cfd.this.cO);
         }

         this.m();
      }

      private void m() {
         cfd.this.cO = null;
         cfd.this.cK = 200;
      }

      private boolean d(jd $$0) {
         if (cfd.this.b($$0, 2)) {
            return true;
         } else {
            epm $$1 = cfd.this.bT.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cfd.a {
      private static final int c = 600;
      int d = cfd.this.dQ().z.a(10);

      f() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean h() {
         return cfd.this.cN != null && !cfd.this.fW() && this.k() && cfd.this.l(cfd.this.cN) && !cfd.this.b(cfd.this.cN, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         cfd.this.bT.n();
         cfd.this.bT.g();
      }

      @Override
      public void a() {
         if (cfd.this.cN != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cfd.this.cN = null;
            } else if (!cfd.this.bT.m()) {
               if (cfd.this.k(cfd.this.cN)) {
                  cfd.this.cN = null;
               } else {
                  cfd.this.i(cfd.this.cN);
               }
            }
         }
      }

      private boolean k() {
         return cfd.this.cG > 2400;
      }
   }

   class g extends cfd.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cfd.this.gF() >= 10) {
            return false;
         } else {
            return cfd.this.ah.i() < 0.3F ? false : cfd.this.gw() && cfd.this.gI();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cfd.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jd $$1 = cfd.this.dq().c($$0);
               dta $$2 = cfd.this.dQ().a_($$1);
               dfw $$3 = $$2.b();
               dta $$4 = null;
               if ($$2.a(awd.aI)) {
                  if ($$3 instanceof dhr) {
                     dhr $$5 = (dhr)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dnt) {
                     int $$6 = $$2.c(dnt.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dnt.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfy.oi)) {
                     int $$7 = $$2.c(doa.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(doa.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfy.sv) || $$2.a(dfy.sw)) {
                     ((dfz)$$2.b()).a((aqt)cfd.this.dQ(), cfd.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cfd.this.dQ().c(2011, $$1, 15);
                     cfd.this.dQ().b($$1, $$4);
                     cfd.this.gH();
                  }
               }
            }
         }
      }
   }

   class h extends ccc {
      h(final cfd $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cfd.this.Z_() && super.c();
      }

      @Override
      protected void a(btn $$0, btl $$1) {
         if ($$0 instanceof cfd && this.e.F($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cfd.a {
      @Override
      public boolean h() {
         return cfd.this.cK == 0 && !cfd.this.go() && cfd.this.gC();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cfd.this.cK = 200;
         List<jd> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jd $$1 : $$0) {
               if (!cfd.this.cQ.b($$1)) {
                  cfd.this.cO = $$1;
                  return;
               }
            }

            cfd.this.cQ.k();
            cfd.this.cO = $$0.get(0);
         }
      }

      private List<jd> k() {
         jd $$0 = cfd.this.dq();
         ceq $$1 = ((aqt)cfd.this.dQ()).y();
         Stream<cer> $$2 = $$1.c($$0x -> $$0x.a(awo.c), $$0, 20, ceq.b.c);
         return $$2.map(cer::f).filter(cfd.this::j).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bzm {
      j(final btn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfd.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfd.this.cP.l();
      }
   }

   class k extends cfd.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dta> f = $$0 -> {
         if ($$0.b(dtq.C) && $$0.c(dtq.C)) {
            return false;
         } else if ($$0.a(awd.U)) {
            return $$0.a(dfy.iD) ? $$0.c(die.b) == dtw.a : true;
         } else {
            return false;
         }
      };
      private static final double g = 0.1;
      private static final int h = 25;
      private static final float i = 0.35F;
      private static final float j = 0.6F;
      private static final float k = 0.33333334F;
      private int l;
      private int m;
      private boolean n;
      @Nullable
      private eww o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean h() {
         if (cfd.this.cM > 0) {
            return false;
         } else if (cfd.this.gw()) {
            return false;
         } else if (cfd.this.dQ().ad()) {
            return false;
         } else {
            Optional<jd> $$0 = this.p();
            if ($$0.isPresent()) {
               cfd.this.cN = $$0.get();
               cfd.this.bT.a((double)cfd.this.cN.u() + 0.5, (double)cfd.this.cN.v() + 0.5, (double)cfd.this.cN.w() + 0.5, 1.2F);
               return true;
            } else {
               cfd.this.cM = ayn.a(cfd.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cfd.this.t()) {
            return false;
         } else if (cfd.this.dQ().ad()) {
            return false;
         } else if (this.k()) {
            return cfd.this.ah.i() < 0.2F;
         } else if (cfd.this.ai % 20 == 0 && !cfd.this.l(cfd.this.cN)) {
            cfd.this.cN = null;
            return false;
         } else {
            return true;
         }
      }

      private boolean k() {
         return this.l > 400;
      }

      boolean l() {
         return this.n;
      }

      void m() {
         this.n = false;
      }

      @Override
      public void d() {
         this.l = 0;
         this.p = 0;
         this.m = 0;
         this.n = true;
         cfd.this.gn();
      }

      @Override
      public void e() {
         if (this.k()) {
            cfd.this.w(true);
         }

         this.n = false;
         cfd.this.bT.n();
         cfd.this.cM = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.p++;
         if (this.p > 600) {
            cfd.this.cN = null;
         } else {
            eww $$0 = eww.c(cfd.this.cN).b(0.0, 0.6F, 0.0);
            if ($$0.f(cfd.this.do()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cfd.this.do().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cfd.this.cN = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cfd.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new eww($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cfd.this.bT.n();
                     } else {
                        $$2 = false;
                     }

                     cfd.this.F().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cfd.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cfd.this.a(avo.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cfd.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cfd.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jd> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<jd> a(Predicate<dta> $$0, double $$1) {
         jd $$2 = cfd.this.dq();
         jd.a $$3 = new jd.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cfd.this.dQ().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends cak {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         return cfd.this.bT.l() && cfd.this.ah.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cfd.this.bT.m();
      }

      @Override
      public void d() {
         eww $$0 = this.h();
         if ($$0 != null) {
            cfd.this.bT.a(cfd.this.bT.a(jd.a((jw)$$0), 1), 1.0);
         }
      }

      @Nullable
      private eww h() {
         eww $$1;
         if (cfd.this.gI() && !cfd.this.b(cfd.this.cO, 22)) {
            eww $$0 = eww.b(cfd.this.cO);
            $$1 = $$0.d(cfd.this.do()).d();
         } else {
            $$1 = cfd.this.g(0.0F);
         }

         int $$3 = 8;
         eww $$4 = cej.a(cfd.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cef.a(cfd.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
