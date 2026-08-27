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

public class bxz extends bxy implements bms, byh {
   public static final float bT = 120.32113F;
   public static final int bU = auo.f(1.4959966F);
   private static final agm<Byte> cd = agp.a(bxz.class, ago.a);
   private static final agm<Integer> ce = agp.a(bxz.class, ago.b);
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
   private static final bjm ct = avp.a(20, 39);
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
   int cF = auo.a(this.ag, 20, 60);
   @Nullable
   hx cG;
   @Nullable
   hx cH;
   bxz.k cI;
   bxz.e cJ;
   private bxz.f cK;
   private int cL;

   public bxz(blz<? extends bxz> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsh(this, 20, true);
      this.bK = new bxz.j(this);
      this.a(efc.n, -1.0F);
      this.a(efc.j, -1.0F);
      this.a(efc.k, 16.0F);
      this.a(efc.x, -1.0F);
      this.a(efc.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxz.b(this, 1.4F, true));
      this.bO.a(1, new bxz.d());
      this.bO.a(2, new bst(this, 1.0));
      this.bO.a(3, new bup(this, 1.25, cpz.a(asp.S), false));
      this.cI = new bxz.k();
      this.bO.a(4, this.cI);
      this.bO.a(5, new btg(this, 1.25));
      this.bO.a(5, new bxz.i());
      this.cJ = new bxz.e();
      this.bO.a(5, this.cJ);
      this.cK = new bxz.f();
      this.bO.a(6, this.cK);
      this.bO.a(7, new bxz.g());
      this.bO.a(8, new bxz.l());
      this.bO.a(9, new btb(this));
      this.bP.a(1, new bxz.h(this).a(new Class[0]));
      this.bP.a(2, new bxz.c(this));
      this.bP.a(3, new bvg<>(this, true));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("HivePos", tc.a(this.gm()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", tc.a(this.u()));
      }

      $$0.a("HasNectar", this.go());
      $$0.a("HasStung", this.gp());
      $$0.a("TicksSincePollination", this.cz);
      $$0.a("CannotEnterHiveTicks", this.cA);
      $$0.a("CropsGrownSincePollination", this.cB);
      this.c($$0);
   }

   @Override
   public void a(sn $$0) {
      this.cH = null;
      if ($$0.e("HivePos")) {
         this.cH = tc.b($$0.p("HivePos"));
      }

      this.cG = null;
      if ($$0.e("FlowerPos")) {
         this.cG = tc.b($$0.p("FlowerPos"));
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
   public boolean C(blv $$0) {
      boolean $$1 = $$0.a(this.dN().a((bml)this), (float)((int)this.b(bnr.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bml) {
            ((bml)$$0).q(((bml)$$0).eP() + 1);
            int $$2 = 0;
            if (this.dM().ak() == bjy.c) {
               $$2 = 10;
            } else if (this.dM().ak() == bjy.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bml)$$0).b(new bli(blk.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(ars.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.go() && this.gx() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), jx.av);
         }
      }

      this.gv();
   }

   private void a(ctp $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jv $$6) {
      $$0.a($$6, auo.d($$0.z.j(), $$1, $$2), $$5, auo.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hx $$0) {
      elt $$1 = elt.c($$0);
      int $$2 = 0;
      hx $$3 = this.dm();
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

      elt $$8 = bxc.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public hx u() {
      return this.cG;
   }

   public boolean w() {
      return this.cG != null;
   }

   public void i(hx $$0) {
      this.cG = $$0;
   }

   @avt
   public int A() {
      return Math.max(this.cJ.d, this.cK.d);
   }

   @avt
   public List<hx> ge() {
      return this.cJ.f;
   }

   private boolean gt() {
      return this.cz > 3600;
   }

   boolean gu() {
      if (this.cA <= 0 && !this.cI.l() && !this.gp() && this.q() == null) {
         boolean $$0 = this.gt() || this.dM().ab() || this.dM().Q() || this.go();
         return $$0 && !this.gw();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cA = $$0;
   }

   public float E(float $$0) {
      return auo.i($$0, this.cx, this.cw);
   }

   private void gv() {
      this.cx = this.cw;
      if (this.gB()) {
         this.cw = Math.min(1.0F, this.cw + 0.2F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gp();
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
         if (this.cy % 5 == 0 && this.ag.a(auo.a(1200 - this.cy, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ev());
         }
      }

      if (!this.go()) {
         this.cz++;
      }

      if (!this.dM().B) {
         this.a((and)this.dM(), false);
      }
   }

   public void gk() {
      this.cz = 0;
   }

   private boolean gw() {
      if (this.cH == null) {
         return false;
      } else {
         dgv $$0 = this.dM().c_(this.cH);
         return $$0 instanceof dgs && ((dgs)$$0).c();
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

   private boolean k(hx $$0) {
      dgv $$1 = this.dM().c_($$0);
      return $$1 instanceof dgs ? !((dgs)$$1).f() : false;
   }

   @avt
   public boolean gl() {
      return this.cH != null;
   }

   @Nullable
   @avt
   public hx gm() {
      return this.cH;
   }

   @avt
   public bti gn() {
      return this.bO;
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   int gx() {
      return this.cB;
   }

   private void gy() {
      this.cB = 0;
   }

   void gz() {
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

         boolean $$0 = this.aa_() && !this.gp() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gA()) {
            this.cH = null;
         }
      }
   }

   boolean gA() {
      if (!this.gl()) {
         return false;
      } else if (this.l(this.cH)) {
         return false;
      } else {
         dgv $$0 = this.dM().c_(this.cH);
         return $$0 != null && $$0.v() == dgx.H;
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

   boolean l(hx $$0) {
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

   public static bnq.a gq() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.f, 0.6F).a(bnr.m, 0.3F).a(bnr.c, 2.0).a(bnr.g, 48.0);
   }

   @Override
   protected bvv b(ctp $$0) {
      bvt $$1 = new bvt(this, $$0) {
         @Override
         public boolean a(hx $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bxz.this.cI.l()) {
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
   public boolean m(cmy $$0) {
      return $$0.a(asp.S);
   }

   boolean m(hx $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(ash.U);
   }

   @Override
   protected void b(hx $$0, djh $$1) {
   }

   @Override
   protected arr y() {
      return null;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.bA;
   }

   @Override
   protected arr n_() {
      return ars.bz;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Nullable
   public bxz b(and $$0, blq $$1) {
      return blz.h.a((ctp)$$0);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
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
   public boolean a(bkt $$0, float $$1) {
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
   public bmq eS() {
      return bmq.c;
   }

   @Override
   protected void c(asw<eeq> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(hx $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bth {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bxz.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !bxz.this.aa_();
      }
   }

   class b extends btr {
      b(bmu $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bxz.this.aa_() && !bxz.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && bxz.this.aa_() && !bxz.this.gp();
      }
   }

   static class c extends bva<cfi> {
      c(bxz $$0) {
         super($$0, cfi.class, 10, true, false, $$0::a_);
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
         bxz $$0 = (bxz)this.e;
         return $$0.aa_() && !$$0.gp();
      }
   }

   class d extends bxz.a {
      @Override
      public boolean h() {
         if (bxz.this.gl() && bxz.this.gu() && bxz.this.cH.a(bxz.this.dk(), 2.0) && bxz.this.dM().c_(bxz.this.cH) instanceof dgs $$1) {
            if (!$$1.f()) {
               return true;
            }

            bxz.this.cH = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bxz.this.dM().c_(bxz.this.cH) instanceof dgs $$1) {
            $$1.a(bxz.this, bxz.this.go());
         }
      }
   }

   @avt
   public class e extends bxz.a {
      public static final int b = 600;
      int d = bxz.this.dM().z.a(10);
      private static final int e = 3;
      final List<hx> f = Lists.newArrayList();
      @Nullable
      private efg g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean h() {
         return bxz.this.cH != null && !bxz.this.fQ() && bxz.this.gu() && !this.d(bxz.this.cH) && bxz.this.dM().a_(bxz.this.cH).a(ash.aF);
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
         bxz.this.bN.n();
         bxz.this.bN.g();
      }

      @Override
      public void e() {
         if (bxz.this.cH != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bxz.this.bN.m()) {
               if (!bxz.this.b(bxz.this.cH, 16)) {
                  if (bxz.this.l(bxz.this.cH)) {
                     this.m();
                  } else {
                     bxz.this.j(bxz.this.cH);
                  }
               } else {
                  boolean $$0 = this.a(bxz.this.cH);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bxz.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bxz.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(hx $$0) {
         bxz.this.bN.a(10.0F);
         bxz.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bxz.this.bN.j() != null && bxz.this.bN.j().j();
      }

      boolean b(hx $$0) {
         return this.f.contains($$0);
      }

      private void c(hx $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bxz.this.cH != null) {
            this.c(bxz.this.cH);
         }

         this.m();
      }

      private void m() {
         bxz.this.cH = null;
         bxz.this.cD = 200;
      }

      private boolean d(hx $$0) {
         if (bxz.this.b($$0, 2)) {
            return true;
         } else {
            efg $$1 = bxz.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bxz.a {
      private static final int c = 600;
      int d = bxz.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean h() {
         return bxz.this.cG != null && !bxz.this.fQ() && this.k() && bxz.this.m(bxz.this.cG) && !bxz.this.b(bxz.this.cG, 2);
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
         bxz.this.bN.n();
         bxz.this.bN.g();
      }

      @Override
      public void e() {
         if (bxz.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bxz.this.cG = null;
            } else if (!bxz.this.bN.m()) {
               if (bxz.this.l(bxz.this.cG)) {
                  bxz.this.cG = null;
               } else {
                  bxz.this.j(bxz.this.cG);
               }
            }
         }
      }

      private boolean k() {
         return bxz.this.cz > 2400;
      }
   }

   class g extends bxz.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bxz.this.gx() >= 10) {
            return false;
         } else {
            return bxz.this.ag.i() < 0.3F ? false : bxz.this.go() && bxz.this.gA();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bxz.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hx $$1 = bxz.this.dm().c($$0);
               djh $$2 = bxz.this.dM().a_($$1);
               cwq $$3 = $$2.b();
               djh $$4 = null;
               if ($$2.a(ash.aH)) {
                  if ($$3 instanceof cyl) {
                     cyl $$5 = (cyl)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof del) {
                     int $$6 = $$2.c(del.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(del.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cws.oi)) {
                     int $$7 = $$2.c(des.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(des.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cws.sv) || $$2.a(cws.sw)) {
                     ((cwt)$$2.b()).a((and)bxz.this.dM(), bxz.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bxz.this.dM().c(2005, $$1, 0);
                     bxz.this.dM().b($$1, $$4);
                     bxz.this.gz();
                  }
               }
            }
         }
      }
   }

   class h extends buz {
      h(bxz $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bxz.this.aa_() && super.b();
      }

      @Override
      protected void a(bmn $$0, bml $$1) {
         if ($$0 instanceof bxz && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bxz.a {
      @Override
      public boolean h() {
         return bxz.this.cD == 0 && !bxz.this.gl() && bxz.this.gu();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bxz.this.cD = 200;
         List<hx> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hx $$1 : $$0) {
               if (!bxz.this.cJ.b($$1)) {
                  bxz.this.cH = $$1;
                  return;
               }
            }

            bxz.this.cJ.k();
            bxz.this.cH = $$0.get(0);
         }
      }

      private List<hx> k() {
         hx $$0 = bxz.this.dm();
         bxm $$1 = ((and)bxz.this.dM()).y();
         Stream<bxn> $$2 = $$1.c($$0x -> $$0x.a(asr.c), $$0, 20, bxm.b.c);
         return $$2.map(bxn::f).filter(bxz.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bsj {
      j(bmn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bxz.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bxz.this.cI.l();
      }
   }

   class k extends bxz.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<djh> f = $$0 -> {
         if ($$0.b(djx.C) && $$0.c(djx.C)) {
            return false;
         } else if ($$0.a(ash.U)) {
            return $$0.a(cws.iD) ? $$0.c(cyy.b) == dkd.a : true;
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
      private elt o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean h() {
         if (bxz.this.cF > 0) {
            return false;
         } else if (bxz.this.go()) {
            return false;
         } else if (bxz.this.dM().ab()) {
            return false;
         } else {
            Optional<hx> $$0 = this.p();
            if ($$0.isPresent()) {
               bxz.this.cG = $$0.get();
               bxz.this.bN.a((double)bxz.this.cG.u() + 0.5, (double)bxz.this.cG.v() + 0.5, (double)bxz.this.cG.w() + 0.5, 1.2F);
               return true;
            } else {
               bxz.this.cF = auo.a(bxz.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bxz.this.w()) {
            return false;
         } else if (bxz.this.dM().ab()) {
            return false;
         } else if (this.k()) {
            return bxz.this.ag.i() < 0.2F;
         } else if (bxz.this.ah % 20 == 0 && !bxz.this.m(bxz.this.cG)) {
            bxz.this.cG = null;
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
         bxz.this.gk();
      }

      @Override
      public void d() {
         if (this.k()) {
            bxz.this.w(true);
         }

         this.n = false;
         bxz.this.bN.n();
         bxz.this.cF = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bxz.this.cG = null;
         } else {
            elt $$0 = elt.c(bxz.this.cG).b(0.0, 0.6F, 0.0);
            if ($$0.f(bxz.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bxz.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bxz.this.cG = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bxz.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new elt($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bxz.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bxz.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bxz.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bxz.this.a(ars.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bxz.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bxz.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hx> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hx> a(Predicate<djh> $$0, double $$1) {
         hx $$2 = bxz.this.dm();
         hx.a $$3 = new hx.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bxz.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bth {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         return bxz.this.bN.l() && bxz.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bxz.this.bN.m();
      }

      @Override
      public void c() {
         elt $$0 = this.h();
         if ($$0 != null) {
            bxz.this.bN.a(bxz.this.bN.a(hx.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private elt h() {
         elt $$1;
         if (bxz.this.gA() && !bxz.this.b(bxz.this.cH, 22)) {
            elt $$0 = elt.b(bxz.this.cH);
            $$1 = $$0.d(bxz.this.dk()).d();
         } else {
            $$1 = bxz.this.f(0.0F);
         }

         int $$3 = 8;
         elt $$4 = bxf.a(bxz.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bxb.a(bxz.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
