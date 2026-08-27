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

public class bzy extends bzx implements boo, cag {
   public static final float bT = 120.32113F;
   public static final int bU = awi.f(1.4959966F);
   private static final aie<Byte> cd = aih.a(bzy.class, aig.a);
   private static final aie<Integer> ce = aih.a(bzy.class, aig.b);
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
   private static final blh ct = axh.a(20, 39);
   @Nullable
   private UUID cu;
   private float cw;
   private float cx;
   private int cy;
   int cz;
   private int cA;
   private int cB;
   private static final int cC = 200;
   int cD;
   private static final int cE = 200;
   int cF = awi.a(this.af, 20, 60);
   @Nullable
   hz cG;
   @Nullable
   hz cH;
   bzy.k cI;
   bzy.e cJ;
   private bzy.f cK;
   private int cL;

   public bzy(bnw<? extends bzy> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buf(this, 20, true);
      this.bK = new bzy.j(this);
      this.a(ehh.n, -1.0F);
      this.a(ehh.j, -1.0F);
      this.a(ehh.k, 16.0F);
      this.a(ehh.x, -1.0F);
      this.a(ehh.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, (byte)0);
      this.am.a(ce, 0);
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bzy.b(this, 1.4F, true));
      this.bO.a(1, new bzy.d());
      this.bO.a(2, new bur(this, 1.0));
      this.bO.a(3, new bwn(this, 1.25, csc.a(aui.S), false));
      this.cI = new bzy.k();
      this.bO.a(4, this.cI);
      this.bO.a(5, new bve(this, 1.25));
      this.bO.a(5, new bzy.i());
      this.cJ = new bzy.e();
      this.bO.a(5, this.cJ);
      this.cK = new bzy.f();
      this.bO.a(6, this.cK);
      this.bO.a(7, new bzy.g());
      this.bO.a(8, new bzy.l());
      this.bO.a(9, new buz(this));
      this.bP.a(1, new bzy.h(this).a(new Class[0]));
      this.bP.a(2, new bzy.c(this));
      this.bP.a(3, new bxe<>(this, true));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.gn()) {
         $$0.a("HivePos", tl.a(this.go()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", tl.a(this.u()));
      }

      $$0.a("HasNectar", this.gq());
      $$0.a("HasStung", this.gr());
      $$0.a("TicksSincePollination", this.cz);
      $$0.a("CannotEnterHiveTicks", this.cA);
      $$0.a("CropsGrownSincePollination", this.cB);
      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      this.cH = null;
      if ($$0.e("HivePos")) {
         this.cH = tl.b($$0.p("HivePos"));
      }

      this.cG = null;
      if ($$0.e("FlowerPos")) {
         this.cG = tl.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cz = $$0.h("TicksSincePollination");
      this.cA = $$0.h("CannotEnterHiveTicks");
      this.cB = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean B(bnq $$0) {
      boolean $$1 = $$0.a(this.dN().a((boi)this), (float)((int)this.g(bpp.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof boi) {
            ((boi)$$0).r(((boi)$$0).eQ() + 1);
            int $$2 = 0;
            if (this.dM().aj() == blt.c) {
               $$2 = 10;
            } else if (this.dM().aj() == blt.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((boi)$$0).b(new bnd(bnf.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(atl.bQ, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gq() && this.gz() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), jz.av);
         }
      }

      this.gx();
   }

   private void a(cvr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jx $$6) {
      $$0.a($$6, awi.d($$0.z.j(), $$1, $$2), $$5, awi.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hz $$0) {
      enz $$1 = enz.c($$0);
      int $$2 = 0;
      hz $$3 = this.dm();
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

      enz $$8 = bzb.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public hz u() {
      return this.cG;
   }

   public boolean w() {
      return this.cG != null;
   }

   public void i(hz $$0) {
      this.cG = $$0;
   }

   @axl
   public int A() {
      return Math.max(this.cJ.d, this.cK.d);
   }

   @axl
   public List<hz> gg() {
      return this.cJ.f;
   }

   private boolean gv() {
      return this.cz > 3600;
   }

   boolean gw() {
      if (this.cA <= 0 && !this.cI.l() && !this.gr() && this.q() == null) {
         boolean $$0 = this.gv() || this.dM().ab() || this.dM().Q() || this.gq();
         return $$0 && !this.gy();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cA = $$0;
   }

   public float E(float $$0) {
      return awi.i($$0, this.cx, this.cw);
   }

   private void gx() {
      this.cx = this.cw;
      if (this.gD()) {
         this.cw = Math.min(1.0F, this.cw + 0.2F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.24F);
      }
   }

   @Override
   protected void aa() {
      boolean $$0 = this.gr();
      if (this.bc()) {
         this.cL++;
      } else {
         this.cL = 0;
      }

      if (this.cL > 20) {
         this.a(this.dN().h(), 1.0F);
      }

      if ($$0) {
         this.cy++;
         if (this.cy % 5 == 0 && this.af.a(awi.a(1200 - this.cy, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ew());
         }
      }

      if (!this.gq()) {
         this.cz++;
      }

      if (!this.dM().B) {
         this.a((aow)this.dM(), false);
      }
   }

   public void gm() {
      this.cz = 0;
   }

   private boolean gy() {
      if (this.cH == null) {
         return false;
      } else {
         dix $$0 = this.dM().c_(this.cH);
         return $$0 instanceof diu && ((diu)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.am.b(ce);
   }

   @Override
   public void a(int $$0) {
      this.am.b(ce, $$0);
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
      this.a(ct.a(this.af));
   }

   private boolean k(hz $$0) {
      dix $$1 = this.dM().c_($$0);
      return $$1 instanceof diu ? !((diu)$$1).f() : false;
   }

   @axl
   public boolean gn() {
      return this.cH != null;
   }

   @Nullable
   @axl
   public hz go() {
      return this.cH;
   }

   @axl
   public bvg gp() {
      return this.bO;
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   int gz() {
      return this.cB;
   }

   private void gA() {
      this.cB = 0;
   }

   void gB() {
      this.cB++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         if (this.cA > 0) {
            this.cA--;
         }

         if (this.cD > 0) {
            this.cD--;
         }

         if (this.cF > 0) {
            this.cF--;
         }

         boolean $$0 = this.aa_() && !this.gr() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ag % 20 == 0 && !this.gC()) {
            this.cH = null;
         }
      }
   }

   boolean gC() {
      if (!this.gn()) {
         return false;
      } else if (this.l(this.cH)) {
         return false;
      } else {
         dix $$0 = this.dM().c_(this.cH);
         return $$0 != null && $$0.v() == diz.H;
      }
   }

   public boolean gq() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gm();
      }

      this.d(8, $$0);
   }

   public boolean gr() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gD() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(hz $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.b(cd, (byte)(this.am.b(cd) | $$0));
      } else {
         this.am.b(cd, (byte)(this.am.b(cd) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.am.b(cd) & $$0) != 0;
   }

   public static bpo.a gs() {
      return bok.C().a(bpp.n, 10.0).a(bpp.h, 0.6F).a(bpp.o, 0.3F).a(bpp.c, 2.0).a(bpp.i, 48.0);
   }

   @Override
   protected bxt b(cvr $$0) {
      bxr $$1 = new bxr(this, $$0) {
         @Override
         public boolean a(hz $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bzy.this.cI.l()) {
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
   public boolean m(cpd $$0) {
      return $$0.a(aui.S);
   }

   boolean m(hz $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(aua.U);
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
   }

   @Override
   protected atk y() {
      return null;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.bN;
   }

   @Override
   protected atk n_() {
      return atl.bM;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Nullable
   public bzy b(aow $$0, bnl $$1) {
      return bnw.i.a((cvr)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
   }

   @Override
   public boolean aT() {
      return this.gt() && this.ag % bU == 0;
   }

   @Override
   public boolean gt() {
      return !this.aC();
   }

   public void gu() {
      this.w(false);
      this.gA();
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.cI.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(aup<egv> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(hz $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bvf {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bzy.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !bzy.this.aa_();
      }
   }

   class b extends bvp {
      b(boq $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bzy.this.aa_() && !bzy.this.gr();
      }

      @Override
      public boolean b() {
         return super.b() && bzy.this.aa_() && !bzy.this.gr();
      }
   }

   static class c extends bwy<chl> {
      c(bzy $$0) {
         super($$0, chl.class, 10, true, false, $$0::a_);
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
         bzy $$0 = (bzy)this.e;
         return $$0.aa_() && !$$0.gr();
      }
   }

   class d extends bzy.a {
      @Override
      public boolean h() {
         if (bzy.this.gn() && bzy.this.gw() && bzy.this.cH.a(bzy.this.dk(), 2.0) && bzy.this.dM().c_(bzy.this.cH) instanceof diu $$1) {
            if (!$$1.f()) {
               return true;
            }

            bzy.this.cH = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bzy.this.dM().c_(bzy.this.cH) instanceof diu $$1) {
            $$1.a(bzy.this, bzy.this.gq());
         }
      }
   }

   @axl
   public class e extends bzy.a {
      public static final int b = 600;
      int d = bzy.this.dM().z.a(10);
      private static final int e = 3;
      final List<hz> f = Lists.newArrayList();
      @Nullable
      private ehl g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean h() {
         return bzy.this.cH != null && !bzy.this.fS() && bzy.this.gw() && !this.d(bzy.this.cH) && bzy.this.dM().a_(bzy.this.cH).a(aua.aF);
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
         bzy.this.bN.n();
         bzy.this.bN.g();
      }

      @Override
      public void e() {
         if (bzy.this.cH != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bzy.this.bN.m()) {
               if (!bzy.this.b(bzy.this.cH, 16)) {
                  if (bzy.this.l(bzy.this.cH)) {
                     this.m();
                  } else {
                     bzy.this.j(bzy.this.cH);
                  }
               } else {
                  boolean $$0 = this.a(bzy.this.cH);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bzy.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bzy.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(hz $$0) {
         bzy.this.bN.a(10.0F);
         bzy.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bzy.this.bN.j() != null && bzy.this.bN.j().j();
      }

      boolean b(hz $$0) {
         return this.f.contains($$0);
      }

      private void c(hz $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bzy.this.cH != null) {
            this.c(bzy.this.cH);
         }

         this.m();
      }

      private void m() {
         bzy.this.cH = null;
         bzy.this.cD = 200;
      }

      private boolean d(hz $$0) {
         if (bzy.this.b($$0, 2)) {
            return true;
         } else {
            ehl $$1 = bzy.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bzy.a {
      private static final int c = 600;
      int d = bzy.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean h() {
         return bzy.this.cG != null && !bzy.this.fS() && this.k() && bzy.this.m(bzy.this.cG) && !bzy.this.b(bzy.this.cG, 2);
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
         bzy.this.bN.n();
         bzy.this.bN.g();
      }

      @Override
      public void e() {
         if (bzy.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bzy.this.cG = null;
            } else if (!bzy.this.bN.m()) {
               if (bzy.this.l(bzy.this.cG)) {
                  bzy.this.cG = null;
               } else {
                  bzy.this.j(bzy.this.cG);
               }
            }
         }
      }

      private boolean k() {
         return bzy.this.cz > 2400;
      }
   }

   class g extends bzy.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bzy.this.gz() >= 10) {
            return false;
         } else {
            return bzy.this.af.i() < 0.3F ? false : bzy.this.gq() && bzy.this.gC();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bzy.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hz $$1 = bzy.this.dm().c($$0);
               dlj $$2 = bzy.this.dM().a_($$1);
               cys $$3 = $$2.b();
               dlj $$4 = null;
               if ($$2.a(aua.aH)) {
                  if ($$3 instanceof dan) {
                     dan $$5 = (dan)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dgn) {
                     int $$6 = $$2.c(dgn.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dgn.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cyu.oi)) {
                     int $$7 = $$2.c(dgu.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dgu.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cyu.sv) || $$2.a(cyu.sw)) {
                     ((cyv)$$2.b()).a((aow)bzy.this.dM(), bzy.this.af, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bzy.this.dM().c(2011, $$1, 15);
                     bzy.this.dM().b($$1, $$4);
                     bzy.this.gB();
                  }
               }
            }
         }
      }
   }

   class h extends bwx {
      h(bzy $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bzy.this.aa_() && super.b();
      }

      @Override
      protected void a(bok $$0, boi $$1) {
         if ($$0 instanceof bzy && this.e.D($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bzy.a {
      @Override
      public boolean h() {
         return bzy.this.cD == 0 && !bzy.this.gn() && bzy.this.gw();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bzy.this.cD = 200;
         List<hz> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hz $$1 : $$0) {
               if (!bzy.this.cJ.b($$1)) {
                  bzy.this.cH = $$1;
                  return;
               }
            }

            bzy.this.cJ.k();
            bzy.this.cH = $$0.get(0);
         }
      }

      private List<hz> k() {
         hz $$0 = bzy.this.dm();
         bzl $$1 = ((aow)bzy.this.dM()).y();
         Stream<bzm> $$2 = $$1.c($$0x -> $$0x.a(auk.c), $$0, 20, bzl.b.c);
         return $$2.map(bzm::f).filter(bzy.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends buh {
      j(bok $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bzy.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bzy.this.cI.l();
      }
   }

   class k extends bzy.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dlj> f = $$0 -> {
         if ($$0.b(dlz.C) && $$0.c(dlz.C)) {
            return false;
         } else if ($$0.a(aua.U)) {
            return $$0.a(cyu.iD) ? $$0.c(dba.b) == dmf.a : true;
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
      private enz o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean h() {
         if (bzy.this.cF > 0) {
            return false;
         } else if (bzy.this.gq()) {
            return false;
         } else if (bzy.this.dM().ab()) {
            return false;
         } else {
            Optional<hz> $$0 = this.p();
            if ($$0.isPresent()) {
               bzy.this.cG = $$0.get();
               bzy.this.bN.a((double)bzy.this.cG.u() + 0.5, (double)bzy.this.cG.v() + 0.5, (double)bzy.this.cG.w() + 0.5, 1.2F);
               return true;
            } else {
               bzy.this.cF = awi.a(bzy.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bzy.this.w()) {
            return false;
         } else if (bzy.this.dM().ab()) {
            return false;
         } else if (this.k()) {
            return bzy.this.af.i() < 0.2F;
         } else if (bzy.this.ag % 20 == 0 && !bzy.this.m(bzy.this.cG)) {
            bzy.this.cG = null;
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
         bzy.this.gm();
      }

      @Override
      public void d() {
         if (this.k()) {
            bzy.this.w(true);
         }

         this.n = false;
         bzy.this.bN.n();
         bzy.this.cF = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bzy.this.cG = null;
         } else {
            enz $$0 = enz.c(bzy.this.cG).b(0.0, 0.6F, 0.0);
            if ($$0.f(bzy.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bzy.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bzy.this.cG = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bzy.this.af.a(25) == 0;
                     if ($$3) {
                        this.o = new enz($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bzy.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bzy.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bzy.this.af.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bzy.this.a(atl.bR, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bzy.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bzy.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hz> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hz> a(Predicate<dlj> $$0, double $$1) {
         hz $$2 = bzy.this.dm();
         hz.a $$3 = new hz.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bzy.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bvf {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         return bzy.this.bN.l() && bzy.this.af.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bzy.this.bN.m();
      }

      @Override
      public void c() {
         enz $$0 = this.h();
         if ($$0 != null) {
            bzy.this.bN.a(bzy.this.bN.a(hz.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private enz h() {
         enz $$1;
         if (bzy.this.gC() && !bzy.this.b(bzy.this.cH, 22)) {
            enz $$0 = enz.b(bzy.this.cH);
            $$1 = $$0.d(bzy.this.dk()).d();
         } else {
            $$1 = bzy.this.f(0.0F);
         }

         int $$3 = 8;
         enz $$4 = bze.a(bzy.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bza.a(bzy.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
