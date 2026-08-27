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

public class bzu extends bzt implements bom, cac {
   public static final float bT = 120.32113F;
   public static final int bU = awh.f(1.4959966F);
   private static final aie<Byte> cd = aih.a(bzu.class, aig.a);
   private static final aie<Integer> ce = aih.a(bzu.class, aig.b);
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
   private static final blf ct = axh.a(20, 39);
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
   int cF = awh.a(this.af, 20, 60);
   @Nullable
   hz cG;
   @Nullable
   hz cH;
   bzu.k cI;
   bzu.e cJ;
   private bzu.f cK;
   private int cL;

   public bzu(bnu<? extends bzu> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new bub(this, 20, true);
      this.bK = new bzu.j(this);
      this.a(eha.n, -1.0F);
      this.a(eha.j, -1.0F);
      this.a(eha.k, 16.0F);
      this.a(eha.x, -1.0F);
      this.a(eha.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, (byte)0);
      this.am.a(ce, 0);
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bzu.b(this, 1.4F, true));
      this.bO.a(1, new bzu.d());
      this.bO.a(2, new bun(this, 1.0));
      this.bO.a(3, new bwj(this, 1.25, cry.a(auh.S), false));
      this.cI = new bzu.k();
      this.bO.a(4, this.cI);
      this.bO.a(5, new bva(this, 1.25));
      this.bO.a(5, new bzu.i());
      this.cJ = new bzu.e();
      this.bO.a(5, this.cJ);
      this.cK = new bzu.f();
      this.bO.a(6, this.cK);
      this.bO.a(7, new bzu.g());
      this.bO.a(8, new bzu.l());
      this.bO.a(9, new buv(this));
      this.bP.a(1, new bzu.h(this).a(new Class[0]));
      this.bP.a(2, new bzu.c(this));
      this.bP.a(3, new bxa<>(this, true));
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
   public boolean B(bno $$0) {
      boolean $$1 = $$0.a(this.dN().a((bog)this), (float)((int)this.g(bpl.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bog) {
            ((bog)$$0).r(((bog)$$0).eQ() + 1);
            int $$2 = 0;
            if (this.dM().ak() == blr.c) {
               $$2 = 10;
            } else if (this.dM().ak() == blr.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bog)$$0).b(new bnb(bnd.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(atk.bP, 1.0F, 1.0F);
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

   private void a(cvn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jx $$6) {
      $$0.a($$6, awh.d($$0.z.j(), $$1, $$2), $$5, awh.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hz $$0) {
      ens $$1 = ens.c($$0);
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

      ens $$8 = byx.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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
      return awh.i($$0, this.cx, this.cw);
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
         if (this.cy % 5 == 0 && this.af.a(awh.a(1200 - this.cy, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ew());
         }
      }

      if (!this.gq()) {
         this.cz++;
      }

      if (!this.dM().B) {
         this.a((aov)this.dM(), false);
      }
   }

   public void gm() {
      this.cz = 0;
   }

   private boolean gy() {
      if (this.cH == null) {
         return false;
      } else {
         dit $$0 = this.dM().c_(this.cH);
         return $$0 instanceof diq && ((diq)$$0).c();
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
      dit $$1 = this.dM().c_($$0);
      return $$1 instanceof diq ? !((diq)$$1).f() : false;
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
   public bvc gp() {
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
         dit $$0 = this.dM().c_(this.cH);
         return $$0 != null && $$0.v() == div.H;
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

   public static bpk.a gs() {
      return boi.C().a(bpl.n, 10.0).a(bpl.h, 0.6F).a(bpl.o, 0.3F).a(bpl.c, 2.0).a(bpl.i, 48.0);
   }

   @Override
   protected bxp b(cvn $$0) {
      bxn $$1 = new bxn(this, $$0) {
         @Override
         public boolean a(hz $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bzu.this.cI.l()) {
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
   public boolean m(coz $$0) {
      return $$0.a(auh.S);
   }

   boolean m(hz $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(atz.U);
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
   }

   @Override
   protected atj y() {
      return null;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.bM;
   }

   @Override
   protected atj n_() {
      return atk.bL;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Nullable
   public bzu b(aov $$0, bnj $$1) {
      return bnu.i.a((cvn)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlf $$2, hz $$3) {
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
   public boolean a(bmn $$0, float $$1) {
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
   protected void c(auo<ego> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(hz $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bvb {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bzu.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !bzu.this.aa_();
      }
   }

   class b extends bvl {
      b(boo $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bzu.this.aa_() && !bzu.this.gr();
      }

      @Override
      public boolean b() {
         return super.b() && bzu.this.aa_() && !bzu.this.gr();
      }
   }

   static class c extends bwu<chh> {
      c(bzu $$0) {
         super($$0, chh.class, 10, true, false, $$0::a_);
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
         bzu $$0 = (bzu)this.e;
         return $$0.aa_() && !$$0.gr();
      }
   }

   class d extends bzu.a {
      @Override
      public boolean h() {
         if (bzu.this.gn() && bzu.this.gw() && bzu.this.cH.a(bzu.this.dk(), 2.0) && bzu.this.dM().c_(bzu.this.cH) instanceof diq $$1) {
            if (!$$1.f()) {
               return true;
            }

            bzu.this.cH = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bzu.this.dM().c_(bzu.this.cH) instanceof diq $$1) {
            $$1.a(bzu.this, bzu.this.gq());
         }
      }
   }

   @axl
   public class e extends bzu.a {
      public static final int b = 600;
      int d = bzu.this.dM().z.a(10);
      private static final int e = 3;
      final List<hz> f = Lists.newArrayList();
      @Nullable
      private ehe g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean h() {
         return bzu.this.cH != null && !bzu.this.fS() && bzu.this.gw() && !this.d(bzu.this.cH) && bzu.this.dM().a_(bzu.this.cH).a(atz.aF);
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
         bzu.this.bN.n();
         bzu.this.bN.g();
      }

      @Override
      public void e() {
         if (bzu.this.cH != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bzu.this.bN.m()) {
               if (!bzu.this.b(bzu.this.cH, 16)) {
                  if (bzu.this.l(bzu.this.cH)) {
                     this.m();
                  } else {
                     bzu.this.j(bzu.this.cH);
                  }
               } else {
                  boolean $$0 = this.a(bzu.this.cH);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bzu.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bzu.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(hz $$0) {
         bzu.this.bN.a(10.0F);
         bzu.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bzu.this.bN.j() != null && bzu.this.bN.j().j();
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
         if (bzu.this.cH != null) {
            this.c(bzu.this.cH);
         }

         this.m();
      }

      private void m() {
         bzu.this.cH = null;
         bzu.this.cD = 200;
      }

      private boolean d(hz $$0) {
         if (bzu.this.b($$0, 2)) {
            return true;
         } else {
            ehe $$1 = bzu.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bzu.a {
      private static final int c = 600;
      int d = bzu.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean h() {
         return bzu.this.cG != null && !bzu.this.fS() && this.k() && bzu.this.m(bzu.this.cG) && !bzu.this.b(bzu.this.cG, 2);
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
         bzu.this.bN.n();
         bzu.this.bN.g();
      }

      @Override
      public void e() {
         if (bzu.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bzu.this.cG = null;
            } else if (!bzu.this.bN.m()) {
               if (bzu.this.l(bzu.this.cG)) {
                  bzu.this.cG = null;
               } else {
                  bzu.this.j(bzu.this.cG);
               }
            }
         }
      }

      private boolean k() {
         return bzu.this.cz > 2400;
      }
   }

   class g extends bzu.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bzu.this.gz() >= 10) {
            return false;
         } else {
            return bzu.this.af.i() < 0.3F ? false : bzu.this.gq() && bzu.this.gC();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bzu.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hz $$1 = bzu.this.dm().c($$0);
               dlf $$2 = bzu.this.dM().a_($$1);
               cyo $$3 = $$2.b();
               dlf $$4 = null;
               if ($$2.a(atz.aH)) {
                  if ($$3 instanceof daj) {
                     daj $$5 = (daj)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dgj) {
                     int $$6 = $$2.c(dgj.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dgj.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cyq.oi)) {
                     int $$7 = $$2.c(dgq.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dgq.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cyq.sv) || $$2.a(cyq.sw)) {
                     ((cyr)$$2.b()).a((aov)bzu.this.dM(), bzu.this.af, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bzu.this.dM().c(2011, $$1, 15);
                     bzu.this.dM().b($$1, $$4);
                     bzu.this.gB();
                  }
               }
            }
         }
      }
   }

   class h extends bwt {
      h(bzu $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bzu.this.aa_() && super.b();
      }

      @Override
      protected void a(boi $$0, bog $$1) {
         if ($$0 instanceof bzu && this.e.D($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bzu.a {
      @Override
      public boolean h() {
         return bzu.this.cD == 0 && !bzu.this.gn() && bzu.this.gw();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bzu.this.cD = 200;
         List<hz> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hz $$1 : $$0) {
               if (!bzu.this.cJ.b($$1)) {
                  bzu.this.cH = $$1;
                  return;
               }
            }

            bzu.this.cJ.k();
            bzu.this.cH = $$0.get(0);
         }
      }

      private List<hz> k() {
         hz $$0 = bzu.this.dm();
         bzh $$1 = ((aov)bzu.this.dM()).y();
         Stream<bzi> $$2 = $$1.c($$0x -> $$0x.a(auj.c), $$0, 20, bzh.b.c);
         return $$2.map(bzi::f).filter(bzu.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bud {
      j(boi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bzu.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bzu.this.cI.l();
      }
   }

   class k extends bzu.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dlf> f = $$0 -> {
         if ($$0.b(dlv.C) && $$0.c(dlv.C)) {
            return false;
         } else if ($$0.a(atz.U)) {
            return $$0.a(cyq.iD) ? $$0.c(daw.b) == dmb.a : true;
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
      private ens o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean h() {
         if (bzu.this.cF > 0) {
            return false;
         } else if (bzu.this.gq()) {
            return false;
         } else if (bzu.this.dM().ab()) {
            return false;
         } else {
            Optional<hz> $$0 = this.p();
            if ($$0.isPresent()) {
               bzu.this.cG = $$0.get();
               bzu.this.bN.a((double)bzu.this.cG.u() + 0.5, (double)bzu.this.cG.v() + 0.5, (double)bzu.this.cG.w() + 0.5, 1.2F);
               return true;
            } else {
               bzu.this.cF = awh.a(bzu.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bzu.this.w()) {
            return false;
         } else if (bzu.this.dM().ab()) {
            return false;
         } else if (this.k()) {
            return bzu.this.af.i() < 0.2F;
         } else if (bzu.this.ag % 20 == 0 && !bzu.this.m(bzu.this.cG)) {
            bzu.this.cG = null;
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
         bzu.this.gm();
      }

      @Override
      public void d() {
         if (this.k()) {
            bzu.this.w(true);
         }

         this.n = false;
         bzu.this.bN.n();
         bzu.this.cF = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bzu.this.cG = null;
         } else {
            ens $$0 = ens.c(bzu.this.cG).b(0.0, 0.6F, 0.0);
            if ($$0.f(bzu.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bzu.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bzu.this.cG = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bzu.this.af.a(25) == 0;
                     if ($$3) {
                        this.o = new ens($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bzu.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bzu.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bzu.this.af.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bzu.this.a(atk.bQ, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bzu.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bzu.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hz> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hz> a(Predicate<dlf> $$0, double $$1) {
         hz $$2 = bzu.this.dm();
         hz.a $$3 = new hz.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bzu.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bvb {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         return bzu.this.bN.l() && bzu.this.af.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bzu.this.bN.m();
      }

      @Override
      public void c() {
         ens $$0 = this.h();
         if ($$0 != null) {
            bzu.this.bN.a(bzu.this.bN.a(hz.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ens h() {
         ens $$1;
         if (bzu.this.gC() && !bzu.this.b(bzu.this.cH, 22)) {
            ens $$0 = ens.b(bzu.this.cH);
            $$1 = $$0.d(bzu.this.dk()).d();
         } else {
            $$1 = bzu.this.f(0.0F);
         }

         int $$3 = 8;
         ens $$4 = bza.a(bzu.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : byw.a(bzu.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
