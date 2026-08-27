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

public class bxj extends bxi implements bmc, bxr {
   public static final float bT = 120.32113F;
   public static final int bU = aty.f(1.4959966F);
   private static final afz<Byte> cd = agc.a(bxj.class, agb.a);
   private static final afz<Integer> ce = agc.a(bxj.class, agb.b);
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
   private static final biw ct = auz.a(20, 39);
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
   int cE = aty.a(this.ag, 20, 60);
   @Nullable
   hv cF;
   @Nullable
   hv cG;
   bxj.k cH;
   bxj.e cI;
   private bxj.f cJ;
   private int cK;

   public bxj(blj<? extends bxj> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new brr(this, 20, true);
      this.bK = new bxj.j(this);
      this.a(eek.n, -1.0F);
      this.a(eek.j, -1.0F);
      this.a(eek.k, 16.0F);
      this.a(eek.x, -1.0F);
      this.a(eek.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxj.b(this, 1.4F, true));
      this.bO.a(1, new bxj.d());
      this.bO.a(2, new bsd(this, 1.0));
      this.bO.a(3, new btz(this, 1.25, cpi.a(arz.S), false));
      this.cH = new bxj.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bsq(this, 1.25));
      this.bO.a(5, new bxj.i());
      this.cI = new bxj.e();
      this.bO.a(5, this.cI);
      this.cJ = new bxj.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bxj.g());
      this.bO.a(8, new bxj.l());
      this.bO.a(9, new bsl(this));
      this.bP.a(1, new bxj.h(this).a(new Class[0]));
      this.bP.a(2, new bxj.c(this));
      this.bP.a(3, new buq<>(this, true));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("HivePos", sy.a(this.gm()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", sy.a(this.u()));
      }

      $$0.a("HasNectar", this.go());
      $$0.a("HasStung", this.gp());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(sj $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = sy.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = sy.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cy = $$0.h("TicksSincePollination");
      this.cz = $$0.h("CannotEnterHiveTicks");
      this.cA = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = $$0.a(this.dN().a((blv)this), (float)((int)this.b(bnb.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof blv) {
            ((blv)$$0).q(((blv)$$0).eP() + 1);
            int $$2 = 0;
            if (this.dM().aj() == bji.c) {
               $$2 = 10;
            } else if (this.dM().aj() == bji.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((blv)$$0).b(new bks(bku.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(arc.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.go() && this.gx() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), jv.av);
         }
      }

      this.gv();
   }

   private void a(csy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jt $$6) {
      $$0.a($$6, aty.d($$0.z.j(), $$1, $$2), $$5, aty.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hv $$0) {
      elb $$1 = elb.c($$0);
      int $$2 = 0;
      hv $$3 = this.dm();
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

      elb $$8 = bwm.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public hv u() {
      return this.cF;
   }

   public boolean w() {
      return this.cF != null;
   }

   public void i(hv $$0) {
      this.cF = $$0;
   }

   @avd
   public int A() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @avd
   public List<hv> ge() {
      return this.cI.f;
   }

   private boolean gt() {
      return this.cy > 3600;
   }

   boolean gu() {
      if (this.cz <= 0 && !this.cH.l() && !this.gp() && this.q() == null) {
         boolean $$0 = this.gt() || this.dM().aa() || this.dM().P() || this.go();
         return $$0 && !this.gw();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return aty.i($$0, this.cw, this.cv);
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
   protected void Z() {
      boolean $$0 = this.gp();
      if (this.bc()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dN().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.ag.a(aty.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ev());
         }
      }

      if (!this.go()) {
         this.cy++;
      }

      if (!this.dM().B) {
         this.a((amp)this.dM(), false);
      }
   }

   public void gk() {
      this.cy = 0;
   }

   private boolean gw() {
      if (this.cG == null) {
         return false;
      } else {
         dgd $$0 = this.dM().c_(this.cG);
         return $$0 instanceof dga && ((dga)$$0).c();
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

   private boolean k(hv $$0) {
      dgd $$1 = this.dM().c_($$0);
      return $$1 instanceof dga ? !((dga)$$1).f() : false;
   }

   @avd
   public boolean gl() {
      return this.cG != null;
   }

   @Nullable
   @avd
   public hv gm() {
      return this.cG;
   }

   @avd
   public bss gn() {
      return this.bO;
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
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
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.aa_() && !this.gp() && this.q() != null && this.q().f(this) < 4.0;
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
         dgd $$0 = this.dM().c_(this.cG);
         return $$0 != null && $$0.v() == dgf.H;
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

   boolean l(hv $$0) {
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

   public static bna.a gq() {
      return blx.C().a(bnb.l, 10.0).a(bnb.f, 0.6F).a(bnb.m, 0.3F).a(bnb.c, 2.0).a(bnb.g, 48.0);
   }

   @Override
   protected bvf b(csy $$0) {
      bvd $$1 = new bvd(this, $$0) {
         @Override
         public boolean a(hv $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bxj.this.cH.l()) {
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
   public boolean m(cmh $$0) {
      return $$0.a(arz.S);
   }

   boolean m(hv $$0) {
      return this.dM().o($$0) && this.dM().a_($$0).a(arr.U);
   }

   @Override
   protected void b(hv $$0, dip $$1) {
   }

   @Override
   protected arb y() {
      return null;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.bA;
   }

   @Override
   protected arb n_() {
      return arc.bz;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Nullable
   public bxj b(amp $$0, bla $$1) {
      return blj.h.a((csy)$$0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
   }

   @Override
   public boolean aT() {
      return this.gr() && this.ah % bU == 0;
   }

   @Override
   public boolean gr() {
      return !this.aC();
   }

   public void gs() {
      this.w(false);
      this.gy();
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bma eS() {
      return bma.c;
   }

   @Override
   protected void c(asg<edy> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(hv $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bsr {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bxj.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !bxj.this.aa_();
      }
   }

   class b extends btb {
      b(bme $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bxj.this.aa_() && !bxj.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && bxj.this.aa_() && !bxj.this.gp();
      }
   }

   static class c extends buk<cer> {
      c(bxj $$0) {
         super($$0, cer.class, 10, true, false, $$0::a_);
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
         bxj $$0 = (bxj)this.e;
         return $$0.aa_() && !$$0.gp();
      }
   }

   class d extends bxj.a {
      @Override
      public boolean h() {
         if (bxj.this.gl() && bxj.this.gu() && bxj.this.cG.a(bxj.this.dk(), 2.0) && bxj.this.dM().c_(bxj.this.cG) instanceof dga $$1) {
            if (!$$1.f()) {
               return true;
            }

            bxj.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bxj.this.dM().c_(bxj.this.cG) instanceof dga $$1) {
            $$1.a(bxj.this, bxj.this.go());
         }
      }
   }

   @avd
   public class e extends bxj.a {
      public static final int b = 600;
      int d = bxj.this.dM().z.a(10);
      private static final int e = 3;
      final List<hv> f = Lists.newArrayList();
      @Nullable
      private eeo g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean h() {
         return bxj.this.cG != null && !bxj.this.fQ() && bxj.this.gu() && !this.d(bxj.this.cG) && bxj.this.dM().a_(bxj.this.cG).a(arr.aF);
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
         bxj.this.bN.n();
         bxj.this.bN.g();
      }

      @Override
      public void e() {
         if (bxj.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bxj.this.bN.m()) {
               if (!bxj.this.b(bxj.this.cG, 16)) {
                  if (bxj.this.l(bxj.this.cG)) {
                     this.m();
                  } else {
                     bxj.this.j(bxj.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bxj.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bxj.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bxj.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(hv $$0) {
         bxj.this.bN.a(10.0F);
         bxj.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bxj.this.bN.j() != null && bxj.this.bN.j().j();
      }

      boolean b(hv $$0) {
         return this.f.contains($$0);
      }

      private void c(hv $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bxj.this.cG != null) {
            this.c(bxj.this.cG);
         }

         this.m();
      }

      private void m() {
         bxj.this.cG = null;
         bxj.this.cC = 200;
      }

      private boolean d(hv $$0) {
         if (bxj.this.b($$0, 2)) {
            return true;
         } else {
            eeo $$1 = bxj.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bxj.a {
      private static final int c = 600;
      int d = bxj.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean h() {
         return bxj.this.cF != null && !bxj.this.fQ() && this.k() && bxj.this.m(bxj.this.cF) && !bxj.this.b(bxj.this.cF, 2);
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
         bxj.this.bN.n();
         bxj.this.bN.g();
      }

      @Override
      public void e() {
         if (bxj.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bxj.this.cF = null;
            } else if (!bxj.this.bN.m()) {
               if (bxj.this.l(bxj.this.cF)) {
                  bxj.this.cF = null;
               } else {
                  bxj.this.j(bxj.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bxj.this.cy > 2400;
      }
   }

   class g extends bxj.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bxj.this.gx() >= 10) {
            return false;
         } else {
            return bxj.this.ag.i() < 0.3F ? false : bxj.this.go() && bxj.this.gA();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bxj.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hv $$1 = bxj.this.dm().c($$0);
               dip $$2 = bxj.this.dM().a_($$1);
               cvz $$3 = $$2.b();
               dip $$4 = null;
               if ($$2.a(arr.aH)) {
                  if ($$3 instanceof cxu) {
                     cxu $$5 = (cxu)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof ddu) {
                     int $$6 = $$2.c(ddu.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(ddu.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cwb.oi)) {
                     int $$7 = $$2.c(deb.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(deb.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cwb.sv) || $$2.a(cwb.sw)) {
                     ((cwc)$$2.b()).a((amp)bxj.this.dM(), bxj.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bxj.this.dM().c(2005, $$1, 0);
                     bxj.this.dM().b($$1, $$4);
                     bxj.this.gz();
                  }
               }
            }
         }
      }
   }

   class h extends buj {
      h(bxj $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bxj.this.aa_() && super.b();
      }

      @Override
      protected void a(blx $$0, blv $$1) {
         if ($$0 instanceof bxj && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bxj.a {
      @Override
      public boolean h() {
         return bxj.this.cC == 0 && !bxj.this.gl() && bxj.this.gu();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bxj.this.cC = 200;
         List<hv> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hv $$1 : $$0) {
               if (!bxj.this.cI.b($$1)) {
                  bxj.this.cG = $$1;
                  return;
               }
            }

            bxj.this.cI.k();
            bxj.this.cG = $$0.get(0);
         }
      }

      private List<hv> k() {
         hv $$0 = bxj.this.dm();
         bww $$1 = ((amp)bxj.this.dM()).x();
         Stream<bwx> $$2 = $$1.c($$0x -> $$0x.a(asb.c), $$0, 20, bww.b.c);
         return $$2.map(bwx::f).filter(bxj.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends brt {
      j(blx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bxj.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bxj.this.cH.l();
      }
   }

   class k extends bxj.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dip> f = $$0 -> {
         if ($$0.b(djf.C) && $$0.c(djf.C)) {
            return false;
         } else if ($$0.a(arr.U)) {
            return $$0.a(cwb.iD) ? $$0.c(cyh.b) == djl.a : true;
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
      private elb o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean h() {
         if (bxj.this.cE > 0) {
            return false;
         } else if (bxj.this.go()) {
            return false;
         } else if (bxj.this.dM().aa()) {
            return false;
         } else {
            Optional<hv> $$0 = this.p();
            if ($$0.isPresent()) {
               bxj.this.cF = $$0.get();
               bxj.this.bN.a((double)bxj.this.cF.u() + 0.5, (double)bxj.this.cF.v() + 0.5, (double)bxj.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bxj.this.cE = aty.a(bxj.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bxj.this.w()) {
            return false;
         } else if (bxj.this.dM().aa()) {
            return false;
         } else if (this.k()) {
            return bxj.this.ag.i() < 0.2F;
         } else if (bxj.this.ah % 20 == 0 && !bxj.this.m(bxj.this.cF)) {
            bxj.this.cF = null;
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
         bxj.this.gk();
      }

      @Override
      public void d() {
         if (this.k()) {
            bxj.this.w(true);
         }

         this.n = false;
         bxj.this.bN.n();
         bxj.this.cE = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bxj.this.cF = null;
         } else {
            elb $$0 = elb.c(bxj.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bxj.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bxj.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bxj.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bxj.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new elb($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bxj.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bxj.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bxj.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bxj.this.a(arc.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bxj.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bxj.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hv> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hv> a(Predicate<dip> $$0, double $$1) {
         hv $$2 = bxj.this.dm();
         hv.a $$3 = new hv.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bxj.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bsr {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         return bxj.this.bN.l() && bxj.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bxj.this.bN.m();
      }

      @Override
      public void c() {
         elb $$0 = this.h();
         if ($$0 != null) {
            bxj.this.bN.a(bxj.this.bN.a(hv.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private elb h() {
         elb $$1;
         if (bxj.this.gA() && !bxj.this.b(bxj.this.cG, 22)) {
            elb $$0 = elb.b(bxj.this.cG);
            $$1 = $$0.d(bxj.this.dk()).d();
         } else {
            $$1 = bxj.this.f(0.0F);
         }

         int $$3 = 8;
         elb $$4 = bwp.a(bxj.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bwl.a(bxj.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
