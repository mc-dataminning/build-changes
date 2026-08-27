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

public class cef extends cee implements bsu, cen {
   public static final float ch = 120.32113F;
   public static final int ci = aym.f(1.4959966F);
   private static final ajy<Byte> cr = akc.a(cef.class, aka.a);
   private static final ajy<Integer> cs = akc.a(cef.class, aka.b);
   private static final int ct = 2;
   private static final int cu = 4;
   private static final int cv = 8;
   private static final int cw = 1200;
   private static final int cx = 2400;
   private static final int cy = 3600;
   private static final int cz = 4;
   private static final int cA = 10;
   private static final int cB = 10;
   private static final int cC = 18;
   private static final int cD = 32;
   private static final int cE = 2;
   private static final int cF = 16;
   private static final int cG = 20;
   public static final String ck = "CropsGrownSincePollination";
   public static final String cl = "CannotEnterHiveTicks";
   public static final String cm = "TicksSincePollination";
   public static final String cn = "HasStung";
   public static final String co = "HasNectar";
   public static final String cp = "flower_pos";
   public static final String cq = "hive_pos";
   private static final bpl cH = azl.a(20, 39);
   @Nullable
   private UUID cI;
   private float cJ;
   private float cK;
   private int cL;
   int cM;
   private int cN;
   private int cO;
   private static final int cQ = 200;
   int cR;
   private static final int cS = 200;
   int cT = aym.a(this.al, 20, 60);
   @Nullable
   ir cU;
   @Nullable
   ir cV;
   cef.k cW;
   cef.e cX;
   private cef.f cY;
   private int cZ;

   public cef(bsb<? extends cef> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byl(this, 20, true);
      this.bX = new cef.j(this);
      this.a(epv.n, -1.0F);
      this.a(epv.j, -1.0F);
      this.a(epv.k, 16.0F);
      this.a(epv.x, -1.0F);
      this.a(epv.h, -1.0F);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cr, (byte)0);
      $$0.a(cs, 0);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void y() {
      this.cb.a(0, new cef.b(this, 1.4F, true));
      this.cb.a(1, new cef.d());
      this.cb.a(2, new byx(this, 1.0));
      this.cb.a(3, new cat(this, 1.25, $$0 -> $$0.a(awm.aj), false));
      this.cW = new cef.k();
      this.cb.a(4, this.cW);
      this.cb.a(5, new bzk(this, 1.25));
      this.cb.a(5, new cef.i());
      this.cX = new cef.e();
      this.cb.a(5, this.cX);
      this.cY = new cef.f();
      this.cb.a(6, this.cY);
      this.cb.a(7, new cef.g());
      this.cb.a(8, new cef.l());
      this.cb.a(9, new bzf(this));
      this.cc.a(1, new cef.h(this).a(new Class[0]));
      this.cc.a(2, new cef.c(this));
      this.cc.a(3, new cbk<>(this, true));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.gF()) {
         $$0.a("hive_pos", uz.a(this.gG()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uz.a(this.r()));
      }

      $$0.a("HasNectar", this.gI());
      $$0.a("HasStung", this.gJ());
      $$0.a("TicksSincePollination", this.cM);
      $$0.a("CannotEnterHiveTicks", this.cN);
      $$0.a("CropsGrownSincePollination", this.cO);
      this.c($$0);
   }

   @Override
   public void a(uk $$0) {
      this.cV = uz.a($$0, "hive_pos").orElse(null);
      this.cU = uz.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cM = $$0.h("TicksSincePollination");
      this.cN = $$0.h("CannotEnterHiveTicks");
      this.cO = $$0.h("CropsGrownSincePollination");
      this.a(this.dU(), $$0);
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = $$0.a(this.dX().a((bso)this), (float)((int)this.g(btv.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bso) {
            ((bso)$$0).r(((bso)$$0).fc() + 1);
            int $$2 = 0;
            if (this.dU().al() == bpx.c) {
               $$2 = 10;
            } else if (this.dU().al() == bpx.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bso)$$0).b(new brh(brj.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.W_();
         this.a(avo.bX, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gI() && this.gR() < 10 && this.al.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.al.a(2) + 1; $$0++) {
            if (this.dV()) {
               this.a(this.dU(), this.dz() - 0.3F, this.dz() + 0.3F, this.dF() - 0.3F, this.dF() + 0.3F, this.e(0.5), lb.ax);
            } else {
               this.a(this.dU(), this.dz() - 0.3F, this.dz() + 0.3F, this.dF() - 0.3F, this.dF() + 0.3F, this.e(0.5), lb.aw);
            }
         }
      }

      this.gP();
   }

   private void a(dca $$0, double $$1, double $$2, double $$3, double $$4, double $$5, kz $$6) {
      $$0.a($$6, aym.d($$0.A.j(), $$1, $$2), $$5, aym.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(ir $$0) {
      ewu $$1 = ewu.c($$0);
      int $$2 = 0;
      ir $$3 = this.du();
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

      ewu $$8 = cdh.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.ca.a(0.5F);
         this.ca.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ir r() {
      return this.cU;
   }

   public boolean t() {
      return this.cU != null;
   }

   public void e(ir $$0) {
      this.cU = $$0;
   }

   @azp
   public int x() {
      return Math.max(this.cX.d, this.cY.d);
   }

   @azp
   public List<ir> gy() {
      return this.cX.f;
   }

   private boolean gN() {
      return this.cM > 3600;
   }

   boolean gO() {
      if (this.cN <= 0 && !this.cW.l() && !this.gJ() && this.p() == null) {
         boolean $$0 = this.gN() || this.dU().ad() || this.dU().S() || this.gI();
         return $$0 && !this.gQ();
      } else {
         return false;
      }
   }

   public void v(int $$0) {
      this.cN = $$0;
   }

   public float G(float $$0) {
      return aym.i($$0, this.cK, this.cJ);
   }

   private void gP() {
      this.cK = this.cJ;
      if (this.gV()) {
         this.cJ = Math.min(1.0F, this.cJ + 0.2F);
      } else {
         this.cJ = Math.max(0.0F, this.cJ - 0.24F);
      }
   }

   @Override
   protected void Y() {
      boolean $$0 = this.gJ();
      if (this.bl()) {
         this.cZ++;
      } else {
         this.cZ = 0;
      }

      if (this.cZ > 20) {
         this.a(this.dX().i(), 1.0F);
      }

      if ($$0) {
         this.cL++;
         if (this.cL % 5 == 0 && this.al.a(aym.a(1200 - this.cL, 1, 1200)) == 0) {
            this.a(this.dX().o(), this.eI());
         }
      }

      if (!this.gI()) {
         this.cM++;
      }

      if (!this.dU().C) {
         this.a_((aqt)this.dU(), false);
      }
   }

   public void gE() {
      this.cM = 0;
   }

   private boolean gQ() {
      if (this.cV == null) {
         return false;
      } else {
         dqc $$0 = this.dU().c_(this.cV);
         return $$0 instanceof dpy && ((dpy)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.as.a(cs);
   }

   @Override
   public void a(int $$0) {
      this.as.a(cs, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cI;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cI = $$0;
   }

   @Override
   public void c() {
      this.a(cH.a(this.al));
   }

   private boolean l(ir $$0) {
      dqc $$1 = this.dU().c_($$0);
      return $$1 instanceof dpy ? !((dpy)$$1).d() : false;
   }

   @azp
   public boolean gF() {
      return this.cV != null;
   }

   @Nullable
   @azp
   public ir gG() {
      return this.cV;
   }

   @azp
   public bzm gH() {
      return this.cb;
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   int gR() {
      return this.cO;
   }

   private void gS() {
      this.cO = 0;
   }

   void gT() {
      this.cO++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C) {
         if (this.cN > 0) {
            this.cN--;
         }

         if (this.cR > 0) {
            this.cR--;
         }

         if (this.cT > 0) {
            this.cT--;
         }

         boolean $$0 = this.aa_() && !this.gJ() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.am % 20 == 0 && !this.gU()) {
            this.cV = null;
         }
      }
   }

   boolean gU() {
      if (!this.gF()) {
         return false;
      } else if (this.m(this.cV)) {
         return false;
      } else {
         dqc $$0 = this.dU().c_(this.cV);
         return $$0 != null && $$0.r() == dqe.I;
      }
   }

   public boolean gI() {
      return this.w(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gE();
      }

      this.d(8, $$0);
   }

   public boolean gJ() {
      return this.w(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gV() {
      return this.w(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(ir $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.as.a(cr, (byte)(this.as.a(cr) | $$0));
      } else {
         this.as.a(cr, (byte)(this.as.a(cr) & ~$$0));
      }
   }

   private boolean w(int $$0) {
      return (this.as.a(cr) & $$0) != 0;
   }

   public static btu.a gK() {
      return bsq.A().a(btv.q, 10.0).a(btv.j, 0.6F).a(btv.r, 0.3F).a(btv.c, 2.0).a(btv.k, 48.0);
   }

   @Override
   protected cbz b(dca $$0) {
      cbx $$1 = new cbx(this, $$0) {
         @Override
         public boolean a(ir $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cef.this.cW.l()) {
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
   public boolean o(cuh $$0) {
      return $$0.a(awm.aj);
   }

   boolean n(ir $$0) {
      return this.dU().p($$0) && this.dU().a_($$0).a(awe.U);
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
   }

   @Override
   protected avn u() {
      return null;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.bU;
   }

   @Override
   protected avn n_() {
      return avo.bT;
   }

   @Override
   protected float fn() {
      return 0.4F;
   }

   @Nullable
   public cef b(aqt $$0, brp $$1) {
      return bsb.j.a((dca)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   public boolean aZ() {
      return this.gL() && this.am % ci == 0;
   }

   @Override
   public boolean gL() {
      return !this.aE();
   }

   public void gM() {
      this.w(false);
      this.gS();
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dU().C) {
            this.cW.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awt<epd> $$0) {
      this.g(this.dx().b(0.0, 0.01, 0.0));
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.5F * this.cQ()), (double)(this.do() * 0.2F));
   }

   boolean b(ir $$0, int $$1) {
      return $$0.a(this.du(), (double)$$1);
   }

   public void j(ir $$0) {
      this.cV = $$0;
   }

   abstract class a extends bzl {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cef.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !cef.this.aa_();
      }
   }

   class b extends bzv {
      b(bsw $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cef.this.aa_() && !cef.this.gJ();
      }

      @Override
      public boolean b() {
         return super.b() && cef.this.aa_() && !cef.this.gJ();
      }
   }

   static class c extends cbe<cly> {
      c(cef $$0) {
         super($$0, cly.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.p() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cef $$0 = (cef)this.e;
         return $$0.aa_() && !$$0.gJ();
      }
   }

   class d extends cef.a {
      @Override
      public boolean h() {
         if (cef.this.gF() && cef.this.gO() && cef.this.cV.a(cef.this.ds(), 2.0) && cef.this.dU().c_(cef.this.cV) instanceof dpy $$1) {
            if (!$$1.d()) {
               return true;
            }

            cef.this.cV = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cef.this.dU().c_(cef.this.cV) instanceof dpy $$1) {
            $$1.a(cef.this);
         }
      }
   }

   @azp
   public class e extends cef.a {
      public static final int b = 600;
      int d = cef.this.dU().A.a(10);
      private static final int e = 3;
      final List<ir> f = Lists.newArrayList();
      @Nullable
      private eps g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean h() {
         return cef.this.cV != null && !cef.this.gj() && cef.this.gO() && !this.d(cef.this.cV) && cef.this.dU().a_(cef.this.cV).a(awe.aH);
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
         cef.this.ca.n();
         cef.this.ca.g();
      }

      @Override
      public void e() {
         if (cef.this.cV != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cef.this.ca.m()) {
               if (!cef.this.b(cef.this.cV, 16)) {
                  if (cef.this.m(cef.this.cV)) {
                     this.m();
                  } else {
                     cef.this.k(cef.this.cV);
                  }
               } else {
                  boolean $$0 = this.a(cef.this.cV);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cef.this.ca.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cef.this.ca.j();
                  }
               }
            }
         }
      }

      private boolean a(ir $$0) {
         cef.this.ca.a(10.0F);
         cef.this.ca.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cef.this.ca.j() != null && cef.this.ca.j().j();
      }

      boolean b(ir $$0) {
         return this.f.contains($$0);
      }

      private void c(ir $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cef.this.cV != null) {
            this.c(cef.this.cV);
         }

         this.m();
      }

      private void m() {
         cef.this.cV = null;
         cef.this.cR = 200;
      }

      private boolean d(ir $$0) {
         if (cef.this.b($$0, 2)) {
            return true;
         } else {
            eps $$1 = cef.this.ca.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cef.a {
      private static final int c = 600;
      int d = cef.this.dU().A.a(10);

      f() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean h() {
         return cef.this.cU != null && !cef.this.gj() && this.k() && cef.this.n(cef.this.cU) && !cef.this.b(cef.this.cU, 2);
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
         cef.this.ca.n();
         cef.this.ca.g();
      }

      @Override
      public void e() {
         if (cef.this.cU != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cef.this.cU = null;
            } else if (!cef.this.ca.m()) {
               if (cef.this.m(cef.this.cU)) {
                  cef.this.cU = null;
               } else {
                  cef.this.k(cef.this.cU);
               }
            }
         }
      }

      private boolean k() {
         return cef.this.cM > 2400;
      }
   }

   class g extends cef.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cef.this.gR() >= 10) {
            return false;
         } else {
            return cef.this.al.i() < 0.3F ? false : cef.this.gI() && cef.this.gU();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cef.this.al.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ir $$1 = cef.this.du().c($$0);
               dtc $$2 = cef.this.dU().a_($$1);
               dfc $$3 = $$2.b();
               dtc $$4 = null;
               if ($$2.a(awe.aK)) {
                  if ($$3 instanceof dgy) {
                     dgy $$5 = (dgy)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.a($$5.g($$2) + 1, $$2);
                     }
                  } else if ($$3 instanceof dnm) {
                     int $$6 = $$2.c(dnm.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dnm.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfe.pi)) {
                     int $$7 = $$2.c(dnu.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dnu.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfe.tS) || $$2.a(dfe.tT)) {
                     ((dff)$$2.b()).a((aqt)cef.this.dU(), cef.this.al, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cef.this.dU().c(2011, $$1, 15);
                     cef.this.dU().b($$1, $$4);
                     cef.this.gT();
                  }
               }
            }
         }
      }
   }

   class h extends cbd {
      h(cef $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cef.this.aa_() && super.b();
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cef && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cef.a {
      @Override
      public boolean h() {
         return cef.this.cR == 0 && !cef.this.gF() && cef.this.gO();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cef.this.cR = 200;
         List<ir> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ir $$1 : $$0) {
               if (!cef.this.cX.b($$1)) {
                  cef.this.cV = $$1;
                  return;
               }
            }

            cef.this.cX.k();
            cef.this.cV = $$0.get(0);
         }
      }

      private List<ir> k() {
         ir $$0 = cef.this.du();
         cdr $$1 = ((aqt)cef.this.dU()).y();
         Stream<cds> $$2 = $$1.c($$0x -> $$0x.a(awo.c), $$0, 20, cdr.b.c);
         return $$2.map(cds::f).filter(cef.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends byn {
      j(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cef.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cef.this.cW.l();
      }
   }

   class k extends cef.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dtc> f = $$0 -> {
         if ($$0.b(dts.C) && $$0.c(dts.C)) {
            return false;
         } else if ($$0.a(awe.U)) {
            return $$0.a(dfe.jx) ? $$0.c(dhl.b) == dty.a : true;
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
      private ewu o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean h() {
         if (cef.this.cT > 0) {
            return false;
         } else if (cef.this.gI()) {
            return false;
         } else if (cef.this.dU().ad()) {
            return false;
         } else {
            Optional<ir> $$0 = this.p();
            if ($$0.isPresent()) {
               cef.this.cU = $$0.get();
               cef.this.ca.a((double)cef.this.cU.u() + 0.5, (double)cef.this.cU.v() + 0.5, (double)cef.this.cU.w() + 0.5, 1.2F);
               return true;
            } else {
               cef.this.cT = aym.a(cef.this.al, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cef.this.t()) {
            return false;
         } else if (cef.this.dU().ad()) {
            return false;
         } else if (this.k()) {
            return cef.this.al.i() < 0.2F;
         } else if (cef.this.am % 20 == 0 && !cef.this.n(cef.this.cU)) {
            cef.this.cU = null;
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
         cef.this.gE();
      }

      @Override
      public void d() {
         if (this.k()) {
            cef.this.w(true);
         }

         this.n = false;
         cef.this.ca.n();
         cef.this.cT = 200;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cef.this.cU = null;
         } else {
            ewu $$0 = ewu.c(cef.this.cU).b(0.0, 0.6F, 0.0);
            if ($$0.f(cef.this.ds()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cef.this.ds().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cef.this.cU = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cef.this.al.a(25) == 0;
                     if ($$3) {
                        this.o = new ewu($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cef.this.ca.n();
                     } else {
                        $$2 = false;
                     }

                     cef.this.F().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cef.this.al.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cef.this.a(avo.bY, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cef.this.G().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cef.this.al.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ir> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ir> a(Predicate<dtc> $$0, double $$1) {
         ir $$2 = cef.this.du();
         ir.a $$3 = new ir.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cef.this.dU().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bzl {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         return cef.this.ca.l() && cef.this.al.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cef.this.ca.m();
      }

      @Override
      public void c() {
         ewu $$0 = this.h();
         if ($$0 != null) {
            cef.this.ca.a(cef.this.ca.a(ir.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ewu h() {
         ewu $$1;
         if (cef.this.gU() && !cef.this.b(cef.this.cV, 22)) {
            ewu $$0 = ewu.b(cef.this.cV);
            $$1 = $$0.d(cef.this.ds()).d();
         } else {
            $$1 = cef.this.f(0.0F);
         }

         int $$3 = 8;
         ewu $$4 = cdk.a(cef.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cdg.a(cef.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
