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

public class buy extends bux implements bjt, bvg {
   public static final float bT = 120.32113F;
   public static final int bU = asb.f(1.4959966F);
   private static final aef<Byte> cd = aei.a(buy.class, aeh.a);
   private static final aef<Integer> ce = aei.a(buy.class, aeh.b);
   private static final int cf = 2;
   private static final int cg = 4;
   private static final int ch = 8;
   private static final int ci = 1200;
   private static final int cj = 2400;
   private static final int ck = 3600;
   private static final int cl = 4;
   private static final int cm = 10;
   private static final int cn = 10;
   private static final int co = 18;
   private static final int cp = 32;
   private static final int cq = 2;
   private static final int cr = 16;
   private static final int cs = 20;
   public static final String bW = "CropsGrownSincePollination";
   public static final String bX = "CannotEnterHiveTicks";
   public static final String bY = "TicksSincePollination";
   public static final String bZ = "HasStung";
   public static final String ca = "HasNectar";
   public static final String cb = "FlowerPos";
   public static final String cc = "HivePos";
   private static final bgp ct = asz.a(20, 39);
   @Nullable
   private UUID cu;
   private float cv;
   private float cw;
   private int cx;
   int cy;
   private int cz;
   private int cA;
   private static final int cB = 200;
   int cC;
   private static final int cD = 200;
   int cE = asb.a(this.ag, 20, 60);
   @Nullable
   gw cF;
   @Nullable
   gw cG;
   buy.k cH;
   buy.e cI;
   private buy.f cJ;
   private int cK;

   public buy(bja<? extends buy> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new bph(this, 20, true);
      this.bK = new buy.j(this);
      this.a(ear.n, -1.0F);
      this.a(ear.j, -1.0F);
      this.a(ear.k, 16.0F);
      this.a(ear.x, -1.0F);
      this.a(ear.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bO.a(0, new buy.b(this, 1.4F, true));
      this.bO.a(1, new buy.d());
      this.bO.a(2, new bpt(this, 1.0));
      this.bO.a(3, new brp(this, 1.25, cmm.a(aqd.S), false));
      this.cH = new buy.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bqg(this, 1.25));
      this.bO.a(5, new buy.i());
      this.cI = new buy.e();
      this.bO.a(5, this.cI);
      this.cJ = new buy.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new buy.g());
      this.bO.a(8, new buy.l());
      this.bO.a(9, new bqb(this));
      this.bP.a(1, new buy.h(this).a(new Class[0]));
      this.bP.a(2, new buy.c(this));
      this.bP.a(3, new bsg<>(this, true));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("HivePos", rj.a(this.gm()));
      }

      if (this.t()) {
         $$0.a("FlowerPos", rj.a(this.s()));
      }

      $$0.a("HasNectar", this.go());
      $$0.a("HasStung", this.gp());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = rj.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = rj.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cy = $$0.h("TicksSincePollination");
      this.cz = $$0.h("CannotEnterHiveTicks");
      this.cA = $$0.h("CropsGrownSincePollination");
      this.a(this.dL(), $$0);
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = $$0.a(this.dM().a((bjm)this), (float)((int)this.b(bks.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bjm) {
            ((bjm)$$0).q(((bjm)$$0).eO() + 1);
            int $$2 = 0;
            if (this.dL().ai() == bhb.c) {
               $$2 = 10;
            } else if (this.dL().ai() == bhb.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bjm)$$0).b(new bij(bil.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.U_();
         this.a(apg.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.go() && this.gx() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dL(), this.dq() - 0.3F, this.dq() + 0.3F, this.dw() - 0.3F, this.dw() + 0.3F, this.e(0.5), iv.as);
         }
      }

      this.gv();
   }

   private void a(cqb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, it $$6) {
      $$0.a($$6, asb.d($$0.z.j(), $$1, $$2), $$5, asb.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gw $$0) {
      ehh $$1 = ehh.c($$0);
      int $$2 = 0;
      gw $$3 = this.dl();
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

      ehh $$8 = bub.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gw s() {
      return this.cF;
   }

   public boolean t() {
      return this.cF != null;
   }

   public void i(gw $$0) {
      this.cF = $$0;
   }

   @atd
   public int y() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @atd
   public List<gw> ge() {
      return this.cI.f;
   }

   private boolean gt() {
      return this.cy > 3600;
   }

   boolean gu() {
      if (this.cz <= 0 && !this.cH.l() && !this.gp() && this.q() == null) {
         boolean $$0 = this.gt() || this.dL().Z() || this.dL().O() || this.go();
         return $$0 && !this.gw();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return asb.i($$0, this.cw, this.cv);
   }

   private void gv() {
      this.cw = this.cv;
      if (this.gB()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void X() {
      boolean $$0 = this.gp();
      if (this.ba()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dM().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.ag.a(asb.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dM().n(), this.eu());
         }
      }

      if (!this.go()) {
         this.cy++;
      }

      if (!this.dL().B) {
         this.a((akt)this.dL(), false);
      }
   }

   public void gk() {
      this.cy = 0;
   }

   private boolean gw() {
      if (this.cG == null) {
         return false;
      } else {
         dcz $$0 = this.dL().c_(this.cG);
         return $$0 instanceof dcw && ((dcw)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.an.b(ce);
   }

   @Override
   public void a(int $$0) {
      this.an.b(ce, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cu;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cu = $$0;
   }

   @Override
   public void c() {
      this.a(ct.a(this.ag));
   }

   private boolean k(gw $$0) {
      dcz $$1 = this.dL().c_($$0);
      return $$1 instanceof dcw ? !((dcw)$$1).f() : false;
   }

   @atd
   public boolean gl() {
      return this.cG != null;
   }

   @Nullable
   @atd
   public gw gm() {
      return this.cG;
   }

   @atd
   public bqi gn() {
      return this.bO;
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   int gx() {
      return this.cA;
   }

   private void gy() {
      this.cA = 0;
   }

   void gz() {
      this.cA++;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.X_() && !this.gp() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gA()) {
            this.cG = null;
         }
      }
   }

   boolean gA() {
      if (!this.gl()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dcz $$0 = this.dL().c_(this.cG);
         return $$0 != null && $$0.u() == ddb.H;
      }
   }

   public boolean go() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gk();
      }

      this.d(8, $$0);
   }

   public boolean gp() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gB() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(gw $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.b(cd, (byte)(this.an.b(cd) | $$0));
      } else {
         this.an.b(cd, (byte)(this.an.b(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.b(cd) & $$0) != 0;
   }

   public static bkr.a gq() {
      return bjo.A().a(bks.l, 10.0).a(bks.f, 0.6F).a(bks.m, 0.3F).a(bks.c, 2.0).a(bks.g, 48.0);
   }

   @Override
   protected bsv b(cqb $$0) {
      bst $$1 = new bst(this, $$0) {
         @Override
         public boolean a(gw $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!buy.this.cH.l()) {
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
   public boolean m(cjl $$0) {
      return $$0.a(aqd.S);
   }

   boolean m(gw $$0) {
      return this.dL().o($$0) && this.dL().a_($$0).a(apv.U);
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
   }

   @Override
   protected apf w() {
      return null;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.bA;
   }

   @Override
   protected apf l_() {
      return apg.bz;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Nullable
   public buy b(akt $$0, bir $$1) {
      return bja.h.a((cqb)$$0);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return this.m_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
   }

   @Override
   public boolean aR() {
      return this.gr() && this.ah % bU == 0;
   }

   @Override
   public boolean gr() {
      return !this.aA();
   }

   public void gs() {
      this.w(false);
      this.gy();
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bjr eR() {
      return bjr.c;
   }

   @Override
   protected void c(aqk<eaf> $$0) {
      this.f(this.do().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gw $$0, int $$1) {
      return $$0.a(this.dl(), (double)$$1);
   }

   abstract class a extends bqh {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !buy.this.X_();
      }

      @Override
      public boolean b() {
         return this.i() && !buy.this.X_();
      }
   }

   class b extends bqr {
      b(bjv $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && buy.this.X_() && !buy.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && buy.this.X_() && !buy.this.gp();
      }
   }

   static class c extends bsa<cca> {
      c(buy $$0) {
         super($$0, cca.class, 10, true, false, $$0::a_);
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
         buy $$0 = (buy)this.e;
         return $$0.X_() && !$$0.gp();
      }
   }

   class d extends buy.a {
      @Override
      public boolean h() {
         if (buy.this.gl() && buy.this.gu() && buy.this.cG.a(buy.this.dj(), 2.0) && buy.this.dL().c_(buy.this.cG) instanceof dcw $$1) {
            if (!$$1.f()) {
               return true;
            }

            buy.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (buy.this.dL().c_(buy.this.cG) instanceof dcw $$1) {
            $$1.a(buy.this, buy.this.go());
         }
      }
   }

   @atd
   public class e extends buy.a {
      public static final int b = 600;
      int d = buy.this.dL().z.a(10);
      private static final int e = 3;
      final List<gw> f = Lists.newArrayList();
      @Nullable
      private eav g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean h() {
         return buy.this.cG != null && !buy.this.fQ() && buy.this.gu() && !this.d(buy.this.cG) && buy.this.dL().a_(buy.this.cG).a(apv.aF);
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
         buy.this.bN.n();
         buy.this.bN.g();
      }

      @Override
      public void e() {
         if (buy.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!buy.this.bN.m()) {
               if (!buy.this.b(buy.this.cG, 16)) {
                  if (buy.this.l(buy.this.cG)) {
                     this.m();
                  } else {
                     buy.this.j(buy.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(buy.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && buy.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = buy.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gw $$0) {
         buy.this.bN.a(10.0F);
         buy.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return buy.this.bN.j() != null && buy.this.bN.j().j();
      }

      boolean b(gw $$0) {
         return this.f.contains($$0);
      }

      private void c(gw $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (buy.this.cG != null) {
            this.c(buy.this.cG);
         }

         this.m();
      }

      private void m() {
         buy.this.cG = null;
         buy.this.cC = 200;
      }

      private boolean d(gw $$0) {
         if (buy.this.b($$0, 2)) {
            return true;
         } else {
            eav $$1 = buy.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends buy.a {
      private static final int c = 600;
      int d = buy.this.dL().z.a(10);

      f() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean h() {
         return buy.this.cF != null && !buy.this.fQ() && this.k() && buy.this.m(buy.this.cF) && !buy.this.b(buy.this.cF, 2);
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
         buy.this.bN.n();
         buy.this.bN.g();
      }

      @Override
      public void e() {
         if (buy.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               buy.this.cF = null;
            } else if (!buy.this.bN.m()) {
               if (buy.this.l(buy.this.cF)) {
                  buy.this.cF = null;
               } else {
                  buy.this.j(buy.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return buy.this.cy > 2400;
      }
   }

   class g extends buy.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (buy.this.gx() >= 10) {
            return false;
         } else {
            return buy.this.ag.i() < 0.3F ? false : buy.this.go() && buy.this.gA();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (buy.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gw $$1 = buy.this.dl().c($$0);
               dfd $$2 = buy.this.dL().a_($$1);
               ctc $$3 = $$2.b();
               dfd $$4 = null;
               if ($$2.a(apv.aH)) {
                  if ($$3 instanceof cuv) {
                     cuv $$5 = (cuv)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof daw) {
                     int $$6 = $$2.c(daw.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(daw.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cte.oi)) {
                     int $$7 = $$2.c(dbd.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dbd.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cte.ru) || $$2.a(cte.rv)) {
                     ((ctf)$$2.b()).a((akt)buy.this.dL(), buy.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     buy.this.dL().c(2005, $$1, 0);
                     buy.this.dL().b($$1, $$4);
                     buy.this.gz();
                  }
               }
            }
         }
      }
   }

   class h extends brz {
      h(buy $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return buy.this.X_() && super.b();
      }

      @Override
      protected void a(bjo $$0, bjm $$1) {
         if ($$0 instanceof buy && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends buy.a {
      @Override
      public boolean h() {
         return buy.this.cC == 0 && !buy.this.gl() && buy.this.gu();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         buy.this.cC = 200;
         List<gw> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gw $$1 : $$0) {
               if (!buy.this.cI.b($$1)) {
                  buy.this.cG = $$1;
                  return;
               }
            }

            buy.this.cI.k();
            buy.this.cG = $$0.get(0);
         }
      }

      private List<gw> k() {
         gw $$0 = buy.this.dl();
         bul $$1 = ((akt)buy.this.dL()).w();
         Stream<bum> $$2 = $$1.c($$0x -> $$0x.a(aqf.c), $$0, 20, bul.b.c);
         return $$2.map(bum::f).filter(buy.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bpj {
      j(bjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!buy.this.X_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buy.this.cH.l();
      }
   }

   class k extends buy.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dfd> f = $$0 -> {
         if ($$0.b(dft.C) && $$0.c(dft.C)) {
            return false;
         } else if ($$0.a(apv.U)) {
            return $$0.a(cte.iD) ? $$0.c(cvi.b) == dfz.a : true;
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
      private ehh o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean h() {
         if (buy.this.cE > 0) {
            return false;
         } else if (buy.this.go()) {
            return false;
         } else if (buy.this.dL().Z()) {
            return false;
         } else {
            Optional<gw> $$0 = this.p();
            if ($$0.isPresent()) {
               buy.this.cF = $$0.get();
               buy.this.bN.a((double)buy.this.cF.u() + 0.5, (double)buy.this.cF.v() + 0.5, (double)buy.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               buy.this.cE = asb.a(buy.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!buy.this.t()) {
            return false;
         } else if (buy.this.dL().Z()) {
            return false;
         } else if (this.k()) {
            return buy.this.ag.i() < 0.2F;
         } else if (buy.this.ah % 20 == 0 && !buy.this.m(buy.this.cF)) {
            buy.this.cF = null;
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
         buy.this.gk();
      }

      @Override
      public void d() {
         if (this.k()) {
            buy.this.w(true);
         }

         this.n = false;
         buy.this.bN.n();
         buy.this.cE = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            buy.this.cF = null;
         } else {
            ehh $$0 = ehh.c(buy.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(buy.this.dj()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = buy.this.dj().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  buy.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = buy.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehh($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        buy.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     buy.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (buy.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     buy.this.a(apg.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         buy.this.I().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (buy.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gw> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gw> a(Predicate<dfd> $$0, double $$1) {
         gw $$2 = buy.this.dl();
         gw.a $$3 = new gw.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(buy.this.dL().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bqh {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean a() {
         return buy.this.bN.l() && buy.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return buy.this.bN.m();
      }

      @Override
      public void c() {
         ehh $$0 = this.h();
         if ($$0 != null) {
            buy.this.bN.a(buy.this.bN.a(gw.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehh h() {
         ehh $$1;
         if (buy.this.gA() && !buy.this.b(buy.this.cG, 22)) {
            ehh $$0 = ehh.b(buy.this.cG);
            $$1 = $$0.d(buy.this.dj()).d();
         } else {
            $$1 = buy.this.f(0.0F);
         }

         int $$3 = 8;
         ehh $$4 = bue.a(buy.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bua.a(buy.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
