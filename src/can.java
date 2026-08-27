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

public class can extends cam implements bpd, cav {
   public static final float bV = 120.32113F;
   public static final int bW = awm.f(1.4959966F);
   private static final aii<Byte> cf = ail.a(can.class, aik.a);
   private static final aii<Integer> cg = ail.a(can.class, aik.b);
   private static final int ch = 2;
   private static final int ci = 4;
   private static final int cj = 8;
   private static final int ck = 1200;
   private static final int cl = 2400;
   private static final int cm = 3600;
   private static final int cn = 4;
   private static final int co = 10;
   private static final int cp = 10;
   private static final int cq = 18;
   private static final int cr = 32;
   private static final int cs = 2;
   private static final int ct = 16;
   private static final int cu = 20;
   public static final String bY = "CropsGrownSincePollination";
   public static final String bZ = "CannotEnterHiveTicks";
   public static final String ca = "TicksSincePollination";
   public static final String cb = "HasStung";
   public static final String cc = "HasNectar";
   public static final String cd = "FlowerPos";
   public static final String ce = "HivePos";
   private static final blw cv = axl.a(20, 39);
   @Nullable
   private UUID cx;
   private float cy;
   private float cz;
   private int cA;
   int cB;
   private int cC;
   private int cD;
   private static final int cE = 200;
   int cF;
   private static final int cG = 200;
   int cH = awm.a(this.af, 20, 60);
   @Nullable
   ib cI;
   @Nullable
   ib cJ;
   can.k cK;
   can.e cL;
   private can.f cM;
   private int cN;

   public can(bol<? extends can> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buu(this, 20, true);
      this.bL = new can.j(this);
      this.a(eic.n, -1.0F);
      this.a(eic.j, -1.0F);
      this.a(eic.k, 16.0F);
      this.a(eic.x, -1.0F);
      this.a(eic.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cf, (byte)0);
      this.am.a(cg, 0);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bP.a(0, new can.b(this, 1.4F, true));
      this.bP.a(1, new can.d());
      this.bP.a(2, new bvg(this, 1.0));
      this.bP.a(3, new bxc(this, 1.25, csp.a(aum.S), false));
      this.cK = new can.k();
      this.bP.a(4, this.cK);
      this.bP.a(5, new bvt(this, 1.25));
      this.bP.a(5, new can.i());
      this.cL = new can.e();
      this.bP.a(5, this.cL);
      this.cM = new can.f();
      this.bP.a(6, this.cM);
      this.bP.a(7, new can.g());
      this.bP.a(8, new can.l());
      this.bP.a(9, new bvo(this));
      this.bQ.a(1, new can.h(this).a(new Class[0]));
      this.bQ.a(2, new can.c(this));
      this.bQ.a(3, new bxt<>(this, true));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("HivePos", tn.a(this.gt()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", tn.a(this.u()));
      }

      $$0.a("HasNectar", this.gv());
      $$0.a("HasStung", this.gw());
      $$0.a("TicksSincePollination", this.cB);
      $$0.a("CannotEnterHiveTicks", this.cC);
      $$0.a("CropsGrownSincePollination", this.cD);
      this.c($$0);
   }

   @Override
   public void a(sy $$0) {
      this.cJ = null;
      if ($$0.e("HivePos")) {
         this.cJ = tn.b($$0.p("HivePos"));
      }

      this.cI = null;
      if ($$0.e("FlowerPos")) {
         this.cI = tn.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cB = $$0.h("TicksSincePollination");
      this.cC = $$0.h("CannotEnterHiveTicks");
      this.cD = $$0.h("CropsGrownSincePollination");
      this.a(this.dJ(), $$0);
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = $$0.a(this.dK().a((box)this), (float)((int)this.g(bqe.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof box) {
            ((box)$$0).r(((box)$$0).eO() + 1);
            int $$2 = 0;
            if (this.dJ().aj() == bmi.c) {
               $$2 = 10;
            } else if (this.dJ().aj() == bmi.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((box)$$0).b(new bns(bnu.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(atp.bQ, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gv() && this.gE() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dJ(), this.do() - 0.3F, this.do() + 0.3F, this.du() - 0.3F, this.du() + 0.3F, this.e(0.5), kb.av);
         }
      }

      this.gC();
   }

   private void a(cwe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jz $$6) {
      $$0.a($$6, awm.d($$0.z.j(), $$1, $$2), $$5, awm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ib $$0) {
      eov $$1 = eov.c($$0);
      int $$2 = 0;
      ib $$3 = this.dj();
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

      eov $$8 = bzq.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bO.a(0.5F);
         this.bO.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ib u() {
      return this.cI;
   }

   public boolean w() {
      return this.cI != null;
   }

   public void i(ib $$0) {
      this.cI = $$0;
   }

   @axp
   public int A() {
      return Math.max(this.cL.d, this.cM.d);
   }

   @axp
   public List<ib> gl() {
      return this.cL.f;
   }

   private boolean gA() {
      return this.cB > 3600;
   }

   boolean gB() {
      if (this.cC <= 0 && !this.cK.l() && !this.gw() && this.q() == null) {
         boolean $$0 = this.gA() || this.dJ().ab() || this.dJ().Q() || this.gv();
         return $$0 && !this.gD();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cC = $$0;
   }

   public float E(float $$0) {
      return awm.i($$0, this.cz, this.cy);
   }

   private void gC() {
      this.cz = this.cy;
      if (this.gI()) {
         this.cy = Math.min(1.0F, this.cy + 0.2F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.24F);
      }
   }

   @Override
   protected void aa() {
      boolean $$0 = this.gw();
      if (this.bc()) {
         this.cN++;
      } else {
         this.cN = 0;
      }

      if (this.cN > 20) {
         this.a(this.dK().h(), 1.0F);
      }

      if ($$0) {
         this.cA++;
         if (this.cA % 5 == 0 && this.af.a(awm.a(1200 - this.cA, 1, 1200)) == 0) {
            this.a(this.dK().n(), this.eu());
         }
      }

      if (!this.gv()) {
         this.cB++;
      }

      if (!this.dJ().B) {
         this.a((apa)this.dJ(), false);
      }
   }

   public void gr() {
      this.cB = 0;
   }

   private boolean gD() {
      if (this.cJ == null) {
         return false;
      } else {
         djl $$0 = this.dJ().c_(this.cJ);
         return $$0 instanceof dji && ((dji)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.am.b(cg);
   }

   @Override
   public void a(int $$0) {
      this.am.b(cg, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cx;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cx = $$0;
   }

   @Override
   public void c() {
      this.a(cv.a(this.af));
   }

   private boolean k(ib $$0) {
      djl $$1 = this.dJ().c_($$0);
      return $$1 instanceof dji ? !((dji)$$1).d() : false;
   }

   @axp
   public boolean gs() {
      return this.cJ != null;
   }

   @Nullable
   @axp
   public ib gt() {
      return this.cJ;
   }

   @axp
   public bvv gu() {
      return this.bP;
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   int gE() {
      return this.cD;
   }

   private void gF() {
      this.cD = 0;
   }

   void gG() {
      this.cD++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B) {
         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cF > 0) {
            this.cF--;
         }

         if (this.cH > 0) {
            this.cH--;
         }

         boolean $$0 = this.aa_() && !this.gw() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ag % 20 == 0 && !this.gH()) {
            this.cJ = null;
         }
      }
   }

   boolean gH() {
      if (!this.gs()) {
         return false;
      } else if (this.l(this.cJ)) {
         return false;
      } else {
         djl $$0 = this.dJ().c_(this.cJ);
         return $$0 != null && $$0.r() == djn.H;
      }
   }

   public boolean gv() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gr();
      }

      this.d(8, $$0);
   }

   public boolean gw() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gI() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(ib $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.b(cf, (byte)(this.am.b(cf) | $$0));
      } else {
         this.am.b(cf, (byte)(this.am.b(cf) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.am.b(cf) & $$0) != 0;
   }

   public static bqd.a gx() {
      return boz.C().a(bqe.n, 10.0).a(bqe.h, 0.6F).a(bqe.o, 0.3F).a(bqe.c, 2.0).a(bqe.i, 48.0);
   }

   @Override
   protected byi b(cwe $$0) {
      byg $$1 = new byg(this, $$0) {
         @Override
         public boolean a(ib $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!can.this.cK.l()) {
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
   public boolean o(cpq $$0) {
      return $$0.a(aum.S);
   }

   boolean m(ib $$0) {
      return this.dJ().p($$0) && this.dJ().a_($$0).a(aue.U);
   }

   @Override
   protected void b(ib $$0, dme $$1) {
   }

   @Override
   protected ato y() {
      return null;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.bN;
   }

   @Override
   protected ato n_() {
      return atp.bM;
   }

   @Override
   protected float eY() {
      return 0.4F;
   }

   @Nullable
   public can b(apa $$0, boa $$1) {
      return bol.i.a((cwe)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   public boolean aT() {
      return this.gy() && this.ag % bW == 0;
   }

   @Override
   public boolean gy() {
      return !this.aC();
   }

   public void gz() {
      this.w(false);
      this.gF();
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dJ().B) {
            this.cK.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(aut<ehq> $$0) {
      this.g(this.dm().b(0.0, 0.01, 0.0));
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.5F * this.cF()), (double)(this.dd() * 0.2F));
   }

   boolean b(ib $$0, int $$1) {
      return $$0.a(this.dj(), (double)$$1);
   }

   abstract class a extends bvu {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !can.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !can.this.aa_();
      }
   }

   class b extends bwe {
      b(bpf $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && can.this.aa_() && !can.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && can.this.aa_() && !can.this.gw();
      }
   }

   static class c extends bxn<cia> {
      c(can $$0) {
         super($$0, cia.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.q() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         can $$0 = (can)this.e;
         return $$0.aa_() && !$$0.gw();
      }
   }

   class d extends can.a {
      @Override
      public boolean h() {
         if (can.this.gs() && can.this.gB() && can.this.cJ.a(can.this.dh(), 2.0) && can.this.dJ().c_(can.this.cJ) instanceof dji $$1) {
            if (!$$1.d()) {
               return true;
            }

            can.this.cJ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (can.this.dJ().c_(can.this.cJ) instanceof dji $$1) {
            $$1.a(can.this, can.this.gv());
         }
      }
   }

   @axp
   public class e extends can.a {
      public static final int b = 600;
      int d = can.this.dJ().z.a(10);
      private static final int e = 3;
      final List<ib> f = Lists.newArrayList();
      @Nullable
      private eig g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean h() {
         return can.this.cJ != null && !can.this.fX() && can.this.gB() && !this.d(can.this.cJ) && can.this.dJ().a_(can.this.cJ).a(aue.aF);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         this.i = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         can.this.bO.n();
         can.this.bO.g();
      }

      @Override
      public void e() {
         if (can.this.cJ != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!can.this.bO.m()) {
               if (!can.this.b(can.this.cJ, 16)) {
                  if (can.this.l(can.this.cJ)) {
                     this.m();
                  } else {
                     can.this.j(can.this.cJ);
                  }
               } else {
                  boolean $$0 = this.a(can.this.cJ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && can.this.bO.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = can.this.bO.j();
                  }
               }
            }
         }
      }

      private boolean a(ib $$0) {
         can.this.bO.a(10.0F);
         can.this.bO.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return can.this.bO.j() != null && can.this.bO.j().j();
      }

      boolean b(ib $$0) {
         return this.f.contains($$0);
      }

      private void c(ib $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (can.this.cJ != null) {
            this.c(can.this.cJ);
         }

         this.m();
      }

      private void m() {
         can.this.cJ = null;
         can.this.cF = 200;
      }

      private boolean d(ib $$0) {
         if (can.this.b($$0, 2)) {
            return true;
         } else {
            eig $$1 = can.this.bO.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends can.a {
      private static final int c = 600;
      int d = can.this.dJ().z.a(10);

      f() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean h() {
         return can.this.cI != null && !can.this.fX() && this.k() && can.this.m(can.this.cI) && !can.this.b(can.this.cI, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         can.this.bO.n();
         can.this.bO.g();
      }

      @Override
      public void e() {
         if (can.this.cI != null) {
            this.d++;
            if (this.d > this.a(600)) {
               can.this.cI = null;
            } else if (!can.this.bO.m()) {
               if (can.this.l(can.this.cI)) {
                  can.this.cI = null;
               } else {
                  can.this.j(can.this.cI);
               }
            }
         }
      }

      private boolean k() {
         return can.this.cB > 2400;
      }
   }

   class g extends can.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (can.this.gE() >= 10) {
            return false;
         } else {
            return can.this.af.i() < 0.3F ? false : can.this.gv() && can.this.gH();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (can.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ib $$1 = can.this.dj().c($$0);
               dme $$2 = can.this.dJ().a_($$1);
               czf $$3 = $$2.b();
               dme $$4 = null;
               if ($$2.a(aue.aH)) {
                  if ($$3 instanceof dba) {
                     dba $$5 = (dba)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dha) {
                     int $$6 = $$2.c(dha.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dha.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(czh.oi)) {
                     int $$7 = $$2.c(dhh.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dhh.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(czh.sv) || $$2.a(czh.sw)) {
                     ((czi)$$2.b()).a((apa)can.this.dJ(), can.this.af, $$1, $$2);
                  }

                  if ($$4 != null) {
                     can.this.dJ().c(2011, $$1, 15);
                     can.this.dJ().b($$1, $$4);
                     can.this.gG();
                  }
               }
            }
         }
      }
   }

   class h extends bxm {
      h(can $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return can.this.aa_() && super.b();
      }

      @Override
      protected void a(boz $$0, box $$1) {
         if ($$0 instanceof can && this.e.D($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends can.a {
      @Override
      public boolean h() {
         return can.this.cF == 0 && !can.this.gs() && can.this.gB();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         can.this.cF = 200;
         List<ib> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ib $$1 : $$0) {
               if (!can.this.cL.b($$1)) {
                  can.this.cJ = $$1;
                  return;
               }
            }

            can.this.cL.k();
            can.this.cJ = $$0.get(0);
         }
      }

      private List<ib> k() {
         ib $$0 = can.this.dj();
         caa $$1 = ((apa)can.this.dJ()).y();
         Stream<cab> $$2 = $$1.c($$0x -> $$0x.a(auo.c), $$0, 20, caa.b.c);
         return $$2.map(cab::f).filter(can.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends buw {
      j(boz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!can.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !can.this.cK.l();
      }
   }

   class k extends can.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dme> f = $$0 -> {
         if ($$0.b(dmu.C) && $$0.c(dmu.C)) {
            return false;
         } else if ($$0.a(aue.U)) {
            return $$0.a(czh.iD) ? $$0.c(dbn.b) == dna.a : true;
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
      private eov o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean h() {
         if (can.this.cH > 0) {
            return false;
         } else if (can.this.gv()) {
            return false;
         } else if (can.this.dJ().ab()) {
            return false;
         } else {
            Optional<ib> $$0 = this.p();
            if ($$0.isPresent()) {
               can.this.cI = $$0.get();
               can.this.bO.a((double)can.this.cI.u() + 0.5, (double)can.this.cI.v() + 0.5, (double)can.this.cI.w() + 0.5, 1.2F);
               return true;
            } else {
               can.this.cH = awm.a(can.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!can.this.w()) {
            return false;
         } else if (can.this.dJ().ab()) {
            return false;
         } else if (this.k()) {
            return can.this.af.i() < 0.2F;
         } else if (can.this.ag % 20 == 0 && !can.this.m(can.this.cI)) {
            can.this.cI = null;
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
      public void c() {
         this.l = 0;
         this.p = 0;
         this.m = 0;
         this.n = true;
         can.this.gr();
      }

      @Override
      public void d() {
         if (this.k()) {
            can.this.w(true);
         }

         this.n = false;
         can.this.bO.n();
         can.this.cH = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            can.this.cI = null;
         } else {
            eov $$0 = eov.c(can.this.cI).b(0.0, 0.6F, 0.0);
            if ($$0.f(can.this.dh()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = can.this.dh().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  can.this.cI = null;
               } else {
                  if ($$1) {
                     boolean $$3 = can.this.af.a(25) == 0;
                     if ($$3) {
                        this.o = new eov($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        can.this.bO.n();
                     } else {
                        $$2 = false;
                     }

                     can.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (can.this.af.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     can.this.a(atp.bR, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         can.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (can.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ib> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ib> a(Predicate<dme> $$0, double $$1) {
         ib $$2 = can.this.dj();
         ib.a $$3 = new ib.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(can.this.dJ().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bvu {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         return can.this.bO.l() && can.this.af.a(10) == 0;
      }

      @Override
      public boolean b() {
         return can.this.bO.m();
      }

      @Override
      public void c() {
         eov $$0 = this.h();
         if ($$0 != null) {
            can.this.bO.a(can.this.bO.a(ib.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private eov h() {
         eov $$1;
         if (can.this.gH() && !can.this.b(can.this.cJ, 22)) {
            eov $$0 = eov.b(can.this.cJ);
            $$1 = $$0.d(can.this.dh()).d();
         } else {
            $$1 = can.this.f(0.0F);
         }

         int $$3 = 8;
         eov $$4 = bzt.a(can.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bzp.a(can.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
