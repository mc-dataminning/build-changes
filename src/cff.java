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

public class cff extends cfe implements btt, cfn {
   public static final float cc = 120.32113F;
   public static final int cd = ayo.f(1.4959966F);
   private static final ajw<Byte> cm = aka.a(cff.class, ajy.a);
   private static final ajw<Integer> cn = aka.a(cff.class, ajy.b);
   private static final int co = 2;
   private static final int cp = 4;
   private static final int cq = 8;
   private static final int cr = 1200;
   private static final int cs = 2400;
   private static final int ct = 3600;
   private static final int cu = 4;
   private static final int cv = 10;
   private static final int cw = 10;
   private static final int cx = 18;
   private static final int cy = 32;
   private static final int cz = 2;
   private static final int cA = 16;
   private static final int cB = 20;
   public static final String ce = "CropsGrownSincePollination";
   public static final String cg = "CannotEnterHiveTicks";
   public static final String ch = "TicksSincePollination";
   public static final String ci = "HasStung";
   public static final String cj = "HasNectar";
   public static final String ck = "flower_pos";
   public static final String cl = "hive_pos";
   private static final bqc cD = azp.a(20, 39);
   @Nullable
   private UUID cE;
   private float cF;
   private float cG;
   private int cH;
   int cI;
   private int cJ;
   private int cK;
   private static final int cL = 200;
   int cM;
   private static final int cN = 200;
   int cO = ayo.a(this.ah, 20, 60);
   @Nullable
   jd cP;
   @Nullable
   jd cQ;
   cff.k cR;
   cff.e cS;
   private cff.f cT;
   private int cU;

   public cff(bsx<? extends cff> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new bzm(this, 20, true);
      this.bS = new cff.j(this);
      this.a(epv.n, -1.0F);
      this.a(epv.j, -1.0F);
      this.a(epv.k, 16.0F);
      this.a(epv.x, -1.0F);
      this.a(epv.h, -1.0F);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cm, (byte)0);
      $$0.a(cn, 0);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bW.a(0, new cff.b(this, 1.4F, true));
      this.bW.a(1, new cff.d());
      this.bW.a(2, new bzy(this, 1.0));
      this.bW.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awn.aj), false));
      this.cR = new cff.k();
      this.bW.a(4, this.cR);
      this.bW.a(5, new cal(this, 1.25));
      this.bW.a(5, new cff.i());
      this.cS = new cff.e();
      this.bW.a(5, this.cS);
      this.cT = new cff.f();
      this.bW.a(6, this.cT);
      this.bW.a(7, new cff.g());
      this.bW.a(8, new cff.l());
      this.bW.a(9, new cag(this));
      this.bX.a(1, new cff.h(this).a(new Class[0]));
      this.bX.a(2, new cff.c(this));
      this.bX.a(3, new ccl<>(this, true));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("hive_pos", uq.a(this.gn()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uq.a(this.s()));
      }

      $$0.a("HasNectar", this.gu());
      $$0.a("HasStung", this.gv());
      $$0.a("TicksSincePollination", this.cI);
      $$0.a("CannotEnterHiveTicks", this.cJ);
      $$0.a("CropsGrownSincePollination", this.cK);
      this.a_($$0);
   }

   @Override
   public void a(ub $$0) {
      this.cQ = uq.a($$0, "hive_pos").orElse(null);
      this.cP = uq.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cI = $$0.h("TicksSincePollination");
      this.cJ = $$0.h("CannotEnterHiveTicks");
      this.cK = $$0.h("CropsGrownSincePollination");
      this.a(this.dO(), $$0);
   }

   @Override
   public boolean D(bsr $$0) {
      brk $$1 = this.dP().a((btn)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.g(buw.c)));
      if ($$2) {
         if (this.dO() instanceof aqu $$3) {
            dae.a($$3, $$0, $$1);
         }

         if ($$0 instanceof btn $$4) {
            $$4.q($$4.eQ() + 1);
            int $$5 = 0;
            if (this.dO().al() == bqo.c) {
               $$5 = 10;
            } else if (this.dO().al() == bqo.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new brz(bsb.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.Z_();
         this.a(avp.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gu() && this.gD() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dO(), this.dt() - 0.3F, this.dt() + 0.3F, this.dz() - 0.3F, this.dz() + 0.3F, this.e(0.5), lm.ay);
         }
      }

      this.gB();
   }

   private void a(dcw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lk $$6) {
      $$0.a($$6, ayo.d($$0.z.j(), $$1, $$2), $$5, ayo.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jd $$0) {
      exc $$1 = exc.c($$0);
      int $$2 = 0;
      jd $$3 = this.do();
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

      exc $$8 = cei.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bV.a(0.5F);
         this.bV.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public jd s() {
      return this.cP;
   }

   public boolean t() {
      return this.cP != null;
   }

   public void h(jd $$0) {
      this.cP = $$0;
   }

   @azt
   public int x() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @azt
   public List<jd> gk() {
      return this.cS.f;
   }

   private boolean gz() {
      return this.cI > 3600;
   }

   boolean gA() {
      if (this.cJ <= 0 && !this.cR.l() && !this.gv() && this.p() == null) {
         boolean $$0 = this.gz() || this.dO().ad() || this.dO().S() || this.gu();
         return $$0 && !this.gC();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cJ = $$0;
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cG, this.cF);
   }

   private void gB() {
      this.cG = this.cF;
      if (this.gH()) {
         this.cF = Math.min(1.0F, this.cF + 0.2F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.24F);
      }
   }

   @Override
   protected void ab() {
      boolean $$0 = this.gv();
      if (this.bi()) {
         this.cU++;
      } else {
         this.cU = 0;
      }

      if (this.cU > 20) {
         this.a(this.dP().i(), 1.0F);
      }

      if ($$0) {
         this.cH++;
         if (this.cH % 5 == 0 && this.ah.a(ayo.a(1200 - this.cH, 1, 1200)) == 0) {
            this.a(this.dP().o(), this.ew());
         }
      }

      if (!this.gu()) {
         this.cI++;
      }

      if (!this.dO().B) {
         this.a((aqu)this.dO(), false);
      }
   }

   public void gl() {
      this.cI = 0;
   }

   private boolean gC() {
      if (this.cQ == null) {
         return false;
      } else {
         dqh $$0 = this.dO().c_(this.cQ);
         return $$0 instanceof dqe && ((dqe)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.ao.a(cn);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cn, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cE;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cE = $$0;
   }

   @Override
   public void c() {
      this.a(cD.a(this.ah));
   }

   private boolean k(jd $$0) {
      dqh $$1 = this.dO().c_($$0);
      return $$1 instanceof dqe ? !((dqe)$$1).d() : false;
   }

   @azt
   public boolean gm() {
      return this.cQ != null;
   }

   @Nullable
   @azt
   public jd gn() {
      return this.cQ;
   }

   @azt
   public can go() {
      return this.bW;
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   int gD() {
      return this.cK;
   }

   private void gE() {
      this.cK = 0;
   }

   void gF() {
      this.cK++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B) {
         if (this.cJ > 0) {
            this.cJ--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         if (this.cO > 0) {
            this.cO--;
         }

         boolean $$0 = this.ad_() && !this.gv() && this.p() != null && this.p().g(this) < 4.0;
         this.z($$0);
         if (this.ai % 20 == 0 && !this.gG()) {
            this.cQ = null;
         }
      }
   }

   boolean gG() {
      if (!this.gm()) {
         return false;
      } else if (this.l(this.cQ)) {
         return false;
      } else {
         dqh $$0 = this.dO().c_(this.cQ);
         return $$0 != null && $$0.r() == dqj.H;
      }
   }

   public boolean gu() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gl();
      }

      this.d(8, $$0);
   }

   public boolean gv() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gH() {
      return this.u(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jd $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cm, (byte)(this.ao.a(cm) | $$0));
      } else {
         this.ao.a(cm, (byte)(this.ao.a(cm) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(cm) & $$0) != 0;
   }

   public static buv.a gw() {
      return btp.C().a(buw.s, 10.0).a(buw.l, 0.6F).a(buw.v, 0.3F).a(buw.c, 2.0).a(buw.m, 48.0);
   }

   @Override
   protected cda b(dcw $$0) {
      ccy $$1 = new ccy(this, $$0) {
         @Override
         public boolean a(jd $$0) {
            return !this.b.a_($$0.e()).i();
         }

         @Override
         public void c() {
            if (!cff.this.cR.l()) {
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
   public boolean o(cuq $$0) {
      return $$0.a(awn.aj);
   }

   boolean m(jd $$0) {
      return this.dO().p($$0) && this.dO().a_($$0).a(awe.V);
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
   }

   @Override
   protected avo v() {
      return null;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.bP;
   }

   @Override
   protected avo n_() {
      return avp.bO;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Nullable
   public cff b(aqu $$0, bsl $$1) {
      return bsx.h.a((dcw)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   public boolean aW() {
      return this.gx() && this.ai % cd == 0;
   }

   @Override
   public boolean gx() {
      return !this.aF();
   }

   public void gy() {
      this.x(false);
      this.gE();
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dO().B) {
            this.cR.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awu<epd> $$0) {
      this.i(this.dr().b(0.0, 0.01, 0.0));
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.2F));
   }

   boolean b(jd $$0, int $$1) {
      return $$0.a(this.do(), (double)$$1);
   }

   public void i(jd $$0) {
      this.cQ = $$0;
   }

   abstract class a extends cam {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cff.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !cff.this.ad_();
      }
   }

   class b extends caw {
      b(final btw $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cff.this.ad_() && !cff.this.gv();
      }

      @Override
      public boolean c() {
         return super.c() && cff.this.ad_() && !cff.this.gv();
      }
   }

   static class c extends ccf<cmx> {
      c(cff $$0) {
         super($$0, cmx.class, 10, true, false, $$0::a_);
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
         cff $$0 = (cff)this.e;
         return $$0.ad_() && !$$0.gv();
      }
   }

   class d extends cff.a {
      @Override
      public boolean h() {
         if (cff.this.gm() && cff.this.gA() && cff.this.cQ.a(cff.this.dm(), 2.0) && cff.this.dO().c_(cff.this.cQ) instanceof dqe $$1) {
            if (!$$1.d()) {
               return true;
            }

            cff.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cff.this.dO().c_(cff.this.cQ) instanceof dqe $$1) {
            $$1.a(cff.this);
         }
      }
   }

   @azt
   public class e extends cff.a {
      public static final int b = 600;
      int d = cff.this.dO().z.a(10);
      private static final int e = 3;
      final List<jd> f = Lists.newArrayList();
      @Nullable
      private eps g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean h() {
         return cff.this.cQ != null && !cff.this.fY() && cff.this.gA() && !this.d(cff.this.cQ) && cff.this.dO().a_(cff.this.cQ).a(awe.aH);
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
         cff.this.bV.n();
         cff.this.bV.g();
      }

      @Override
      public void a() {
         if (cff.this.cQ != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cff.this.bV.m()) {
               if (!cff.this.b(cff.this.cQ, 16)) {
                  if (cff.this.l(cff.this.cQ)) {
                     this.m();
                  } else {
                     cff.this.j(cff.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cff.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cff.this.bV.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cff.this.bV.j();
                  }
               }
            }
         }
      }

      private boolean a(jd $$0) {
         cff.this.bV.a(10.0F);
         cff.this.bV.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cff.this.bV.j() != null && cff.this.bV.j().j();
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
         if (cff.this.cQ != null) {
            this.c(cff.this.cQ);
         }

         this.m();
      }

      private void m() {
         cff.this.cQ = null;
         cff.this.cM = 200;
      }

      private boolean d(jd $$0) {
         if (cff.this.b($$0, 2)) {
            return true;
         } else {
            eps $$1 = cff.this.bV.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cff.a {
      private static final int c = 600;
      int d = cff.this.dO().z.a(10);

      f() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean h() {
         return cff.this.cP != null && !cff.this.fY() && this.k() && cff.this.m(cff.this.cP) && !cff.this.b(cff.this.cP, 2);
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
         cff.this.bV.n();
         cff.this.bV.g();
      }

      @Override
      public void a() {
         if (cff.this.cP != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cff.this.cP = null;
            } else if (!cff.this.bV.m()) {
               if (cff.this.l(cff.this.cP)) {
                  cff.this.cP = null;
               } else {
                  cff.this.j(cff.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cff.this.cI > 2400;
      }
   }

   class g extends cff.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cff.this.gD() >= 10) {
            return false;
         } else {
            return cff.this.ah.i() < 0.3F ? false : cff.this.gu() && cff.this.gG();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cff.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jd $$1 = cff.this.do().c($$0);
               dtc $$2 = cff.this.dO().a_($$1);
               dfy $$3 = $$2.b();
               dtc $$4 = null;
               if ($$2.a(awe.aJ)) {
                  if ($$3 instanceof dht) {
                     dht $$5 = (dht)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dnv) {
                     int $$6 = $$2.c(dnv.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dnv.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dga.oi)) {
                     int $$7 = $$2.c(doc.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(doc.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dga.sv) || $$2.a(dga.sw)) {
                     ((dgb)$$2.b()).a((aqu)cff.this.dO(), cff.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cff.this.dO().c(2011, $$1, 15);
                     cff.this.dO().b($$1, $$4);
                     cff.this.gF();
                  }
               }
            }
         }
      }
   }

   class h extends cce {
      h(final cff $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cff.this.ad_() && super.c();
      }

      @Override
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cff && this.e.F($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cff.a {
      @Override
      public boolean h() {
         return cff.this.cM == 0 && !cff.this.gm() && cff.this.gA();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cff.this.cM = 200;
         List<jd> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jd $$1 : $$0) {
               if (!cff.this.cS.b($$1)) {
                  cff.this.cQ = $$1;
                  return;
               }
            }

            cff.this.cS.k();
            cff.this.cQ = $$0.get(0);
         }
      }

      private List<jd> k() {
         jd $$0 = cff.this.do();
         ces $$1 = ((aqu)cff.this.dO()).y();
         Stream<cet> $$2 = $$1.c($$0x -> $$0x.a(awp.c), $$0, 20, ces.b.c);
         return $$2.map(cet::f).filter(cff.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bzo {
      j(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cff.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cff.this.cR.l();
      }
   }

   class k extends cff.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dtc> f = $$0 -> {
         if ($$0.b(dts.C) && $$0.c(dts.C)) {
            return false;
         } else if ($$0.a(awe.V)) {
            return $$0.a(dga.iD) ? $$0.c(dig.b) == dty.a : true;
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
      private exc o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean h() {
         if (cff.this.cO > 0) {
            return false;
         } else if (cff.this.gu()) {
            return false;
         } else if (cff.this.dO().ad()) {
            return false;
         } else {
            Optional<jd> $$0 = this.p();
            if ($$0.isPresent()) {
               cff.this.cP = $$0.get();
               cff.this.bV.a((double)cff.this.cP.u() + 0.5, (double)cff.this.cP.v() + 0.5, (double)cff.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cff.this.cO = ayo.a(cff.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cff.this.t()) {
            return false;
         } else if (cff.this.dO().ad()) {
            return false;
         } else if (this.k()) {
            return cff.this.ah.i() < 0.2F;
         } else if (cff.this.ai % 20 == 0 && !cff.this.m(cff.this.cP)) {
            cff.this.cP = null;
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
         cff.this.gl();
      }

      @Override
      public void e() {
         if (this.k()) {
            cff.this.x(true);
         }

         this.n = false;
         cff.this.bV.n();
         cff.this.cO = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.p++;
         if (this.p > 600) {
            cff.this.cP = null;
         } else {
            exc $$0 = exc.c(cff.this.cP).b(0.0, 0.6F, 0.0);
            if ($$0.f(cff.this.dm()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cff.this.dm().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cff.this.cP = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cff.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new exc($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cff.this.bV.n();
                     } else {
                        $$2 = false;
                     }

                     cff.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cff.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cff.this.a(avp.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cff.this.J().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cff.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jd> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<jd> a(Predicate<dtc> $$0, double $$1) {
         jd $$2 = cff.this.do();
         jd.a $$3 = new jd.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cff.this.dO().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends cam {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         return cff.this.bV.l() && cff.this.ah.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cff.this.bV.m();
      }

      @Override
      public void d() {
         exc $$0 = this.h();
         if ($$0 != null) {
            cff.this.bV.a(cff.this.bV.a(jd.a((jw)$$0), 1), 1.0);
         }
      }

      @Nullable
      private exc h() {
         exc $$1;
         if (cff.this.gG() && !cff.this.b(cff.this.cQ, 22)) {
            exc $$0 = exc.b(cff.this.cQ);
            $$1 = $$0.d(cff.this.dm()).d();
         } else {
            $$1 = cff.this.g(0.0F);
         }

         int $$3 = 8;
         exc $$4 = cel.a(cff.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : ceh.a(cff.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
