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

public class buj extends bui implements bjd, bur {
   public static final float bT = 120.32113F;
   public static final int bU = aro.f(1.4959966F);
   private static final adx<Byte> cd = aea.a(buj.class, adz.a);
   private static final adx<Integer> ce = aea.a(buj.class, adz.b);
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
   private static final bfz ct = ask.a(20, 39);
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
   int cE = aro.a(this.ag, 20, 60);
   @Nullable
   gv cF;
   @Nullable
   gv cG;
   buj.k cH;
   buj.e cI;
   private buj.f cJ;
   private int cK;

   public buj(bik<? extends buj> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bos(this, 20, true);
      this.bK = new buj.j(this);
      this.a(eam.n, -1.0F);
      this.a(eam.j, -1.0F);
      this.a(eam.k, 16.0F);
      this.a(eam.x, -1.0F);
      this.a(eam.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void w() {
      this.bO.a(0, new buj.b(this, 1.4F, true));
      this.bO.a(1, new buj.d());
      this.bO.a(2, new bpe(this, 1.0));
      this.bO.a(3, new bra(this, 1.25, clw.a(apr.S), false));
      this.cH = new buj.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bpr(this, 1.25));
      this.bO.a(5, new buj.i());
      this.cI = new buj.e();
      this.bO.a(5, this.cI);
      this.cJ = new buj.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new buj.g());
      this.bO.a(8, new buj.l());
      this.bO.a(9, new bpm(this));
      this.bP.a(1, new buj.h(this).a(new Class[0]));
      this.bP.a(2, new buj.c(this));
      this.bP.a(3, new brr<>(this, true));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.gg()) {
         $$0.a("HivePos", re.a(this.gh()));
      }

      if (this.q()) {
         $$0.a("FlowerPos", re.a(this.p()));
      }

      $$0.a("HasNectar", this.gj());
      $$0.a("HasStung", this.gk());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(qs $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = re.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = re.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cy = $$0.h("TicksSincePollination");
      this.cz = $$0.h("CannotEnterHiveTicks");
      this.cA = $$0.h("CropsGrownSincePollination");
      this.a(this.dK(), $$0);
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = $$0.a(this.dL().a((biw)this), (float)((int)this.b(bkd.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof biw) {
            ((biw)$$0).q(((biw)$$0).eN() + 1);
            int $$2 = 0;
            if (this.dK().ai() == bgl.c) {
               $$2 = 10;
            } else if (this.dK().ai() == bgl.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((biw)$$0).b(new bht(bhv.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.O_();
         this.a(aou.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gj() && this.gs() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dK(), this.dp() - 0.3F, this.dp() + 0.3F, this.dv() - 0.3F, this.dv() + 0.3F, this.e(0.5), iw.as);
         }
      }

      this.gq();
   }

   private void a(cpk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, iu $$6) {
      $$0.a($$6, aro.d($$0.z.j(), $$1, $$2), $$5, aro.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gv $$0) {
      ehf $$1 = ehf.c($$0);
      int $$2 = 0;
      gv $$3 = this.dk();
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

      ehf $$8 = btm.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gv p() {
      return this.cF;
   }

   public boolean q() {
      return this.cF != null;
   }

   public void i(gv $$0) {
      this.cF = $$0;
   }

   @aso
   public int t() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @aso
   public List<gv> fZ() {
      return this.cI.f;
   }

   private boolean go() {
      return this.cy > 3600;
   }

   boolean gp() {
      if (this.cz <= 0 && !this.cH.l() && !this.gk() && this.j() == null) {
         boolean $$0 = this.go() || this.dK().Z() || this.dK().O() || this.gj();
         return $$0 && !this.gr();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return aro.i($$0, this.cw, this.cv);
   }

   private void gq() {
      this.cw = this.cv;
      if (this.gw()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void V() {
      boolean $$0 = this.gk();
      if (this.ba()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dL().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.ag.a(aro.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dL().n(), this.et());
         }
      }

      if (!this.gj()) {
         this.cy++;
      }

      if (!this.dK().B) {
         this.a((aki)this.dK(), false);
      }
   }

   public void gf() {
      this.cy = 0;
   }

   private boolean gr() {
      if (this.cG == null) {
         return false;
      } else {
         dck $$0 = this.dK().c_(this.cG);
         return $$0 instanceof dch && ((dch)$$0).c();
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

   private boolean k(gv $$0) {
      dck $$1 = this.dK().c_($$0);
      return $$1 instanceof dch ? !((dch)$$1).f() : false;
   }

   @aso
   public boolean gg() {
      return this.cG != null;
   }

   @Nullable
   @aso
   public gv gh() {
      return this.cG;
   }

   @aso
   public bpt gi() {
      return this.bO;
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   int gs() {
      return this.cA;
   }

   private void gt() {
      this.cA = 0;
   }

   void gu() {
      this.cA++;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.S_() && !this.gk() && this.j() != null && this.j().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gv()) {
            this.cG = null;
         }
      }
   }

   boolean gv() {
      if (!this.gg()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dck $$0 = this.dK().c_(this.cG);
         return $$0 != null && $$0.u() == dcm.H;
      }
   }

   public boolean gj() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gf();
      }

      this.d(8, $$0);
   }

   public boolean gk() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gw() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(gv $$0) {
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

   public static bkc.a gl() {
      return biy.x().a(bkd.a, 10.0).a(bkd.e, 0.6F).a(bkd.d, 0.3F).a(bkd.f, 2.0).a(bkd.b, 48.0);
   }

   @Override
   protected bsg b(cpk $$0) {
      bse $$1 = new bse(this, $$0) {
         @Override
         public boolean a(gv $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!buj.this.cH.l()) {
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
   public boolean m(ciw $$0) {
      return $$0.a(apr.S);
   }

   boolean m(gv $$0) {
      return this.dK().o($$0) && this.dK().a_($$0).a(apj.U);
   }

   @Override
   protected void b(gv $$0, dey $$1) {
   }

   @Override
   protected aot r() {
      return null;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.bA;
   }

   @Override
   protected aot h_() {
      return aou.bz;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Nullable
   public buj b(aki $$0, bib $$1) {
      return bik.h.a((cpk)$$0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
   }

   @Override
   public boolean aR() {
      return this.gm() && this.ah % bU == 0;
   }

   @Override
   public boolean gm() {
      return !this.aA();
   }

   public void gn() {
      this.w(false);
      this.gt();
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bjb eQ() {
      return bjb.c;
   }

   @Override
   protected void c(apy<eaa> $$0) {
      this.f(this.dn().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gv $$0, int $$1) {
      return $$0.a(this.dk(), (double)$$1);
   }

   abstract class a extends bps {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !buj.this.S_();
      }

      @Override
      public boolean b() {
         return this.i() && !buj.this.S_();
      }
   }

   class b extends bqc {
      b(bjf $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && buj.this.S_() && !buj.this.gk();
      }

      @Override
      public boolean b() {
         return super.b() && buj.this.S_() && !buj.this.gk();
      }
   }

   static class c extends brl<cbl> {
      c(buj $$0) {
         super($$0, cbl.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.j() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         buj $$0 = (buj)this.e;
         return $$0.S_() && !$$0.gk();
      }
   }

   class d extends buj.a {
      @Override
      public boolean h() {
         if (buj.this.gg() && buj.this.gp() && buj.this.cG.a(buj.this.di(), 2.0) && buj.this.dK().c_(buj.this.cG) instanceof dch $$1) {
            if (!$$1.f()) {
               return true;
            }

            buj.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (buj.this.dK().c_(buj.this.cG) instanceof dch $$1) {
            $$1.a(buj.this, buj.this.gj());
         }
      }
   }

   @aso
   public class e extends buj.a {
      public static final int b = 600;
      int d = buj.this.dK().z.a(10);
      private static final int e = 3;
      final List<gv> f = Lists.newArrayList();
      @Nullable
      private eaq g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean h() {
         return buj.this.cG != null && !buj.this.fM() && buj.this.gp() && !this.d(buj.this.cG) && buj.this.dK().a_(buj.this.cG).a(apj.aF);
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
         buj.this.bN.n();
         buj.this.bN.g();
      }

      @Override
      public void e() {
         if (buj.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!buj.this.bN.m()) {
               if (!buj.this.b(buj.this.cG, 16)) {
                  if (buj.this.l(buj.this.cG)) {
                     this.m();
                  } else {
                     buj.this.j(buj.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(buj.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && buj.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = buj.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gv $$0) {
         buj.this.bN.a(10.0F);
         buj.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return buj.this.bN.j() != null && buj.this.bN.j().j();
      }

      boolean b(gv $$0) {
         return this.f.contains($$0);
      }

      private void c(gv $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (buj.this.cG != null) {
            this.c(buj.this.cG);
         }

         this.m();
      }

      private void m() {
         buj.this.cG = null;
         buj.this.cC = 200;
      }

      private boolean d(gv $$0) {
         if (buj.this.b($$0, 2)) {
            return true;
         } else {
            eaq $$1 = buj.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends buj.a {
      private static final int c = 600;
      int d = buj.this.dK().z.a(10);

      f() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean h() {
         return buj.this.cF != null && !buj.this.fM() && this.k() && buj.this.m(buj.this.cF) && !buj.this.b(buj.this.cF, 2);
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
         buj.this.bN.n();
         buj.this.bN.g();
      }

      @Override
      public void e() {
         if (buj.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               buj.this.cF = null;
            } else if (!buj.this.bN.m()) {
               if (buj.this.l(buj.this.cF)) {
                  buj.this.cF = null;
               } else {
                  buj.this.j(buj.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return buj.this.cy > 2400;
      }
   }

   class g extends buj.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (buj.this.gs() >= 10) {
            return false;
         } else {
            return buj.this.ag.i() < 0.3F ? false : buj.this.gj() && buj.this.gv();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (buj.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gv $$1 = buj.this.dk().c($$0);
               dey $$2 = buj.this.dK().a_($$1);
               csk $$3 = $$2.b();
               dey $$4 = null;
               if ($$2.a(apj.aH)) {
                  if ($$3 instanceof cub) {
                     cub $$5 = (cub)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dag) {
                     int $$6 = $$2.c(dag.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dag.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(csl.oi)) {
                     int $$7 = $$2.c(dao.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dao.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(csl.ru) || $$2.a(csl.rv)) {
                     ((csm)$$2.b()).a((aki)buj.this.dK(), buj.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     buj.this.dK().c(2005, $$1, 0);
                     buj.this.dK().b($$1, $$4);
                     buj.this.gu();
                  }
               }
            }
         }
      }
   }

   class h extends brk {
      h(buj $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return buj.this.S_() && super.b();
      }

      @Override
      protected void a(biy $$0, biw $$1) {
         if ($$0 instanceof buj && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends buj.a {
      @Override
      public boolean h() {
         return buj.this.cC == 0 && !buj.this.gg() && buj.this.gp();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         buj.this.cC = 200;
         List<gv> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gv $$1 : $$0) {
               if (!buj.this.cI.b($$1)) {
                  buj.this.cG = $$1;
                  return;
               }
            }

            buj.this.cI.k();
            buj.this.cG = $$0.get(0);
         }
      }

      private List<gv> k() {
         gv $$0 = buj.this.dk();
         btw $$1 = ((aki)buj.this.dK()).w();
         Stream<btx> $$2 = $$1.c($$0x -> $$0x.a(apt.c), $$0, 20, btw.b.c);
         return $$2.map(btx::f).filter(buj.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bou {
      j(biy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!buj.this.S_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buj.this.cH.l();
      }
   }

   class k extends buj.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dey> f = $$0 -> {
         if ($$0.b(dfo.C) && $$0.c(dfo.C)) {
            return false;
         } else if ($$0.a(apj.U)) {
            return $$0.a(csl.iD) ? $$0.c(cuo.a) == dfu.a : true;
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
      private ehf o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean h() {
         if (buj.this.cE > 0) {
            return false;
         } else if (buj.this.gj()) {
            return false;
         } else if (buj.this.dK().Z()) {
            return false;
         } else {
            Optional<gv> $$0 = this.p();
            if ($$0.isPresent()) {
               buj.this.cF = $$0.get();
               buj.this.bN.a((double)buj.this.cF.u() + 0.5, (double)buj.this.cF.v() + 0.5, (double)buj.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               buj.this.cE = aro.a(buj.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!buj.this.q()) {
            return false;
         } else if (buj.this.dK().Z()) {
            return false;
         } else if (this.k()) {
            return buj.this.ag.i() < 0.2F;
         } else if (buj.this.ah % 20 == 0 && !buj.this.m(buj.this.cF)) {
            buj.this.cF = null;
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
         buj.this.gf();
      }

      @Override
      public void d() {
         if (this.k()) {
            buj.this.w(true);
         }

         this.n = false;
         buj.this.bN.n();
         buj.this.cE = 200;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            buj.this.cF = null;
         } else {
            ehf $$0 = ehf.c(buj.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(buj.this.di()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = buj.this.di().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  buj.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = buj.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehf($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        buj.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     buj.this.D().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (buj.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     buj.this.a(aou.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         buj.this.E().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (buj.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gv> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gv> a(Predicate<dey> $$0, double $$1) {
         gv $$2 = buj.this.dk();
         gv.a $$3 = new gv.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(buj.this.dK().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bps {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         return buj.this.bN.l() && buj.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return buj.this.bN.m();
      }

      @Override
      public void c() {
         ehf $$0 = this.h();
         if ($$0 != null) {
            buj.this.bN.a(buj.this.bN.a(gv.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehf h() {
         ehf $$1;
         if (buj.this.gv() && !buj.this.b(buj.this.cG, 22)) {
            ehf $$0 = ehf.b(buj.this.cG);
            $$1 = $$0.d(buj.this.di()).d();
         } else {
            $$1 = buj.this.f(0.0F);
         }

         int $$3 = 8;
         ehf $$4 = btp.a(buj.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : btl.a(buj.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
