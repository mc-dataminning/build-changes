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

public class bwk extends bwj implements blf, bws {
   public static final float bT = 120.32113F;
   public static final int bU = ati.f(1.4959966F);
   private static final afm<Byte> cd = afp.a(bwk.class, afo.a);
   private static final afm<Integer> ce = afp.a(bwk.class, afo.b);
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
   private static final bib ct = aug.a(20, 39);
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
   int cE = ati.a(this.ag, 20, 60);
   @Nullable
   ht cF;
   @Nullable
   ht cG;
   bwk.k cH;
   bwk.e cI;
   private bwk.f cJ;
   private int cK;

   public bwk(bkm<? extends bwk> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bqt(this, 20, true);
      this.bK = new bwk.j(this);
      this.a(ecr.n, -1.0F);
      this.a(ecr.j, -1.0F);
      this.a(ecr.k, 16.0F);
      this.a(ecr.x, -1.0F);
      this.a(ecr.h, -1.0F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bwk.b(this, 1.4F, true));
      this.bO.a(1, new bwk.d());
      this.bO.a(2, new brf(this, 1.0));
      this.bO.a(3, new btb(this, 1.25, coc.a(ark.S), false));
      this.cH = new bwk.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new brs(this, 1.25));
      this.bO.a(5, new bwk.i());
      this.cI = new bwk.e();
      this.bO.a(5, this.cI);
      this.cJ = new bwk.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bwk.g());
      this.bO.a(8, new bwk.l());
      this.bO.a(9, new brn(this));
      this.bP.a(1, new bwk.h(this).a(new Class[0]));
      this.bP.a(2, new bwk.c(this));
      this.bP.a(3, new bts<>(this, true));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("HivePos", so.a(this.gm()));
      }

      if (this.t()) {
         $$0.a("FlowerPos", so.a(this.s()));
      }

      $$0.a("HasNectar", this.go());
      $$0.a("HasStung", this.gp());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = so.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = so.b($$0.p("FlowerPos"));
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
   public boolean C(bki $$0) {
      boolean $$1 = $$0.a(this.dM().a((bky)this), (float)((int)this.b(bme.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bky) {
            ((bky)$$0).q(((bky)$$0).eO() + 1);
            int $$2 = 0;
            if (this.dL().ai() == bin.c) {
               $$2 = 10;
            } else if (this.dL().ai() == bin.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bky)$$0).b(new bjv(bjx.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(aqn.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.go() && this.gx() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dL(), this.dq() - 0.3F, this.dq() + 0.3F, this.dw() - 0.3F, this.dw() + 0.3F, this.e(0.5), js.at);
         }
      }

      this.gv();
   }

   private void a(crs $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jq $$6) {
      $$0.a($$6, ati.d($$0.z.j(), $$1, $$2), $$5, ati.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ht $$0) {
      eji $$1 = eji.c($$0);
      int $$2 = 0;
      ht $$3 = this.dl();
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

      eji $$8 = bvn.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ht s() {
      return this.cF;
   }

   public boolean t() {
      return this.cF != null;
   }

   public void i(ht $$0) {
      this.cF = $$0;
   }

   @auk
   public int y() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @auk
   public List<ht> ge() {
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
      return ati.i($$0, this.cw, this.cv);
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
         if (this.cx % 5 == 0 && this.ag.a(ati.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dM().n(), this.eu());
         }
      }

      if (!this.go()) {
         this.cy++;
      }

      if (!this.dL().B) {
         this.a((ama)this.dL(), false);
      }
   }

   public void gk() {
      this.cy = 0;
   }

   private boolean gw() {
      if (this.cG == null) {
         return false;
      } else {
         der $$0 = this.dL().c_(this.cG);
         return $$0 instanceof deo && ((deo)$$0).c();
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

   private boolean k(ht $$0) {
      der $$1 = this.dL().c_($$0);
      return $$1 instanceof deo ? !((deo)$$1).f() : false;
   }

   @auk
   public boolean gl() {
      return this.cG != null;
   }

   @Nullable
   @auk
   public ht gm() {
      return this.cG;
   }

   @auk
   public bru gn() {
      return this.bO;
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
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
   public void c_() {
      super.c_();
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

         boolean $$0 = this.Y_() && !this.gp() && this.q() != null && this.q().f(this) < 4.0;
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
         der $$0 = this.dL().c_(this.cG);
         return $$0 != null && $$0.u() == det.H;
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

   boolean l(ht $$0) {
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

   public static bmd.a gq() {
      return bla.A().a(bme.l, 10.0).a(bme.f, 0.6F).a(bme.m, 0.3F).a(bme.c, 2.0).a(bme.g, 48.0);
   }

   @Override
   protected buh b(crs $$0) {
      buf $$1 = new buf(this, $$0) {
         @Override
         public boolean a(ht $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bwk.this.cH.l()) {
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
   public boolean m(clb $$0) {
      return $$0.a(ark.S);
   }

   boolean m(ht $$0) {
      return this.dL().o($$0) && this.dL().a_($$0).a(arc.U);
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
   }

   @Override
   protected aqm w() {
      return null;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.bA;
   }

   @Override
   protected aqm m_() {
      return aqn.bz;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Nullable
   public bwk b(ama $$0, bkd $$1) {
      return bkm.h.a((crs)$$0);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
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
   public boolean a(bjg $$0, float $$1) {
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
   public bld eR() {
      return bld.c;
   }

   @Override
   protected void c(arr<ecf> $$0) {
      this.f(this.do().b(0.0, 0.01, 0.0));
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(ht $$0, int $$1) {
      return $$0.a(this.dl(), (double)$$1);
   }

   abstract class a extends brt {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bwk.this.Y_();
      }

      @Override
      public boolean b() {
         return this.i() && !bwk.this.Y_();
      }
   }

   class b extends bsd {
      b(blh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bwk.this.Y_() && !bwk.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && bwk.this.Y_() && !bwk.this.gp();
      }
   }

   static class c extends btm<cdm> {
      c(bwk $$0) {
         super($$0, cdm.class, 10, true, false, $$0::a_);
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
         bwk $$0 = (bwk)this.e;
         return $$0.Y_() && !$$0.gp();
      }
   }

   class d extends bwk.a {
      @Override
      public boolean h() {
         if (bwk.this.gl() && bwk.this.gu() && bwk.this.cG.a(bwk.this.dj(), 2.0) && bwk.this.dL().c_(bwk.this.cG) instanceof deo $$1) {
            if (!$$1.f()) {
               return true;
            }

            bwk.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bwk.this.dL().c_(bwk.this.cG) instanceof deo $$1) {
            $$1.a(bwk.this, bwk.this.go());
         }
      }
   }

   @auk
   public class e extends bwk.a {
      public static final int b = 600;
      int d = bwk.this.dL().z.a(10);
      private static final int e = 3;
      final List<ht> f = Lists.newArrayList();
      @Nullable
      private ecv g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean h() {
         return bwk.this.cG != null && !bwk.this.fQ() && bwk.this.gu() && !this.d(bwk.this.cG) && bwk.this.dL().a_(bwk.this.cG).a(arc.aF);
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
         bwk.this.bN.n();
         bwk.this.bN.g();
      }

      @Override
      public void e() {
         if (bwk.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bwk.this.bN.m()) {
               if (!bwk.this.b(bwk.this.cG, 16)) {
                  if (bwk.this.l(bwk.this.cG)) {
                     this.m();
                  } else {
                     bwk.this.j(bwk.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bwk.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bwk.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bwk.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(ht $$0) {
         bwk.this.bN.a(10.0F);
         bwk.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bwk.this.bN.j() != null && bwk.this.bN.j().j();
      }

      boolean b(ht $$0) {
         return this.f.contains($$0);
      }

      private void c(ht $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bwk.this.cG != null) {
            this.c(bwk.this.cG);
         }

         this.m();
      }

      private void m() {
         bwk.this.cG = null;
         bwk.this.cC = 200;
      }

      private boolean d(ht $$0) {
         if (bwk.this.b($$0, 2)) {
            return true;
         } else {
            ecv $$1 = bwk.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bwk.a {
      private static final int c = 600;
      int d = bwk.this.dL().z.a(10);

      f() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean h() {
         return bwk.this.cF != null && !bwk.this.fQ() && this.k() && bwk.this.m(bwk.this.cF) && !bwk.this.b(bwk.this.cF, 2);
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
         bwk.this.bN.n();
         bwk.this.bN.g();
      }

      @Override
      public void e() {
         if (bwk.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bwk.this.cF = null;
            } else if (!bwk.this.bN.m()) {
               if (bwk.this.l(bwk.this.cF)) {
                  bwk.this.cF = null;
               } else {
                  bwk.this.j(bwk.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bwk.this.cy > 2400;
      }
   }

   class g extends bwk.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bwk.this.gx() >= 10) {
            return false;
         } else {
            return bwk.this.ag.i() < 0.3F ? false : bwk.this.go() && bwk.this.gA();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bwk.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ht $$1 = bwk.this.dl().c($$0);
               dgw $$2 = bwk.this.dL().a_($$1);
               cut $$3 = $$2.b();
               dgw $$4 = null;
               if ($$2.a(arc.aH)) {
                  if ($$3 instanceof cwn) {
                     cwn $$5 = (cwn)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dco) {
                     int $$6 = $$2.c(dco.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dco.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cuv.oi)) {
                     int $$7 = $$2.c(dcv.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dcv.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cuv.ru) || $$2.a(cuv.rv)) {
                     ((cuw)$$2.b()).a((ama)bwk.this.dL(), bwk.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bwk.this.dL().c(2005, $$1, 0);
                     bwk.this.dL().b($$1, $$4);
                     bwk.this.gz();
                  }
               }
            }
         }
      }
   }

   class h extends btl {
      h(bwk $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bwk.this.Y_() && super.b();
      }

      @Override
      protected void a(bla $$0, bky $$1) {
         if ($$0 instanceof bwk && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bwk.a {
      @Override
      public boolean h() {
         return bwk.this.cC == 0 && !bwk.this.gl() && bwk.this.gu();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bwk.this.cC = 200;
         List<ht> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ht $$1 : $$0) {
               if (!bwk.this.cI.b($$1)) {
                  bwk.this.cG = $$1;
                  return;
               }
            }

            bwk.this.cI.k();
            bwk.this.cG = $$0.get(0);
         }
      }

      private List<ht> k() {
         ht $$0 = bwk.this.dl();
         bvx $$1 = ((ama)bwk.this.dL()).w();
         Stream<bvy> $$2 = $$1.c($$0x -> $$0x.a(arm.c), $$0, 20, bvx.b.c);
         return $$2.map(bvy::f).filter(bwk.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bqv {
      j(bla $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bwk.this.Y_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bwk.this.cH.l();
      }
   }

   class k extends bwk.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dgw> f = $$0 -> {
         if ($$0.b(dhm.C) && $$0.c(dhm.C)) {
            return false;
         } else if ($$0.a(arc.U)) {
            return $$0.a(cuv.iD) ? $$0.c(cxa.b) == dhs.a : true;
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
      private eji o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean h() {
         if (bwk.this.cE > 0) {
            return false;
         } else if (bwk.this.go()) {
            return false;
         } else if (bwk.this.dL().Z()) {
            return false;
         } else {
            Optional<ht> $$0 = this.p();
            if ($$0.isPresent()) {
               bwk.this.cF = $$0.get();
               bwk.this.bN.a((double)bwk.this.cF.u() + 0.5, (double)bwk.this.cF.v() + 0.5, (double)bwk.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bwk.this.cE = ati.a(bwk.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bwk.this.t()) {
            return false;
         } else if (bwk.this.dL().Z()) {
            return false;
         } else if (this.k()) {
            return bwk.this.ag.i() < 0.2F;
         } else if (bwk.this.ah % 20 == 0 && !bwk.this.m(bwk.this.cF)) {
            bwk.this.cF = null;
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
         bwk.this.gk();
      }

      @Override
      public void d() {
         if (this.k()) {
            bwk.this.w(true);
         }

         this.n = false;
         bwk.this.bN.n();
         bwk.this.cE = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bwk.this.cF = null;
         } else {
            eji $$0 = eji.c(bwk.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bwk.this.dj()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bwk.this.dj().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bwk.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bwk.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new eji($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bwk.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bwk.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bwk.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bwk.this.a(aqn.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bwk.this.I().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bwk.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ht> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ht> a(Predicate<dgw> $$0, double $$1) {
         ht $$2 = bwk.this.dl();
         ht.a $$3 = new ht.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bwk.this.dL().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends brt {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         return bwk.this.bN.l() && bwk.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bwk.this.bN.m();
      }

      @Override
      public void c() {
         eji $$0 = this.h();
         if ($$0 != null) {
            bwk.this.bN.a(bwk.this.bN.a(ht.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private eji h() {
         eji $$1;
         if (bwk.this.gA() && !bwk.this.b(bwk.this.cG, 22)) {
            eji $$0 = eji.b(bwk.this.cG);
            $$1 = $$0.d(bwk.this.dj()).d();
         } else {
            $$1 = bwk.this.f(0.0F);
         }

         int $$3 = 8;
         eji $$4 = bvq.a(bwk.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bvm.a(bwk.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
