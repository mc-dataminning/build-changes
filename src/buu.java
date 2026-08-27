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

public class buu extends but implements bjp, bvc {
   public static final float bT = 120.32113F;
   public static final int bU = ary.f(1.4959966F);
   private static final aeg<Byte> cd = aej.a(buu.class, aei.a);
   private static final aeg<Integer> ce = aej.a(buu.class, aei.b);
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
   private static final bgl ct = asw.a(20, 39);
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
   int cE = ary.a(this.ag, 20, 60);
   @Nullable
   gw cF;
   @Nullable
   gw cG;
   buu.k cH;
   buu.e cI;
   private buu.f cJ;
   private int cK;

   public buu(biw<? extends buu> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bpd(this, 20, true);
      this.bK = new buu.j(this);
      this.a(eaz.n, -1.0F);
      this.a(eaz.j, -1.0F);
      this.a(eaz.k, 16.0F);
      this.a(eaz.x, -1.0F);
      this.a(eaz.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bO.a(0, new buu.b(this, 1.4F, true));
      this.bO.a(1, new buu.d());
      this.bO.a(2, new bpp(this, 1.0));
      this.bO.a(3, new brl(this, 1.25, cmi.a(aqc.S), false));
      this.cH = new buu.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bqc(this, 1.25));
      this.bO.a(5, new buu.i());
      this.cI = new buu.e();
      this.bO.a(5, this.cI);
      this.cJ = new buu.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new buu.g());
      this.bO.a(8, new buu.l());
      this.bO.a(9, new bpx(this));
      this.bP.a(1, new buu.h(this).a(new Class[0]));
      this.bP.a(2, new buu.c(this));
      this.bP.a(3, new bsc<>(this, true));
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.gk()) {
         $$0.a("HivePos", rl.a(this.gl()));
      }

      if (this.t()) {
         $$0.a("FlowerPos", rl.a(this.s()));
      }

      $$0.a("HasNectar", this.gn());
      $$0.a("HasStung", this.go());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(qy $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = rl.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = rl.b($$0.p("FlowerPos"));
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
   public boolean C(bis $$0) {
      boolean $$1 = $$0.a(this.dM().a((bji)this), (float)((int)this.b(bko.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bji) {
            ((bji)$$0).q(((bji)$$0).eO() + 1);
            int $$2 = 0;
            if (this.dL().ai() == bgx.c) {
               $$2 = 10;
            } else if (this.dL().ai() == bgx.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bji)$$0).b(new bif(bih.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.U_();
         this.a(apf.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gn() && this.gw() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dL(), this.dq() - 0.3F, this.dq() + 0.3F, this.dw() - 0.3F, this.dw() + 0.3F, this.e(0.5), ix.as);
         }
      }

      this.gu();
   }

   private void a(cpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, iv $$6) {
      $$0.a($$6, ary.d($$0.z.j(), $$1, $$2), $$5, ary.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gw $$0) {
      ehp $$1 = ehp.c($$0);
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

      ehp $$8 = btx.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @ata
   public int y() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @ata
   public List<gw> gd() {
      return this.cI.f;
   }

   private boolean gs() {
      return this.cy > 3600;
   }

   boolean gt() {
      if (this.cz <= 0 && !this.cH.l() && !this.go() && this.q() == null) {
         boolean $$0 = this.gs() || this.dL().Z() || this.dL().O() || this.gn();
         return $$0 && !this.gv();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return ary.i($$0, this.cw, this.cv);
   }

   private void gu() {
      this.cw = this.cv;
      if (this.gA()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void X() {
      boolean $$0 = this.go();
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
         if (this.cx % 5 == 0 && this.ag.a(ary.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dM().n(), this.eu());
         }
      }

      if (!this.gn()) {
         this.cy++;
      }

      if (!this.dL().B) {
         this.a((aks)this.dL(), false);
      }
   }

   public void gj() {
      this.cy = 0;
   }

   private boolean gv() {
      if (this.cG == null) {
         return false;
      } else {
         dcx $$0 = this.dL().c_(this.cG);
         return $$0 instanceof dcu && ((dcu)$$0).c();
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
      dcx $$1 = this.dL().c_($$0);
      return $$1 instanceof dcu ? !((dcu)$$1).f() : false;
   }

   @ata
   public boolean gk() {
      return this.cG != null;
   }

   @Nullable
   @ata
   public gw gl() {
      return this.cG;
   }

   @ata
   public bqe gm() {
      return this.bO;
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   int gw() {
      return this.cA;
   }

   private void gx() {
      this.cA = 0;
   }

   void gy() {
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

         boolean $$0 = this.X_() && !this.go() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gz()) {
            this.cG = null;
         }
      }
   }

   boolean gz() {
      if (!this.gk()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dcx $$0 = this.dL().c_(this.cG);
         return $$0 != null && $$0.u() == dcz.H;
      }
   }

   public boolean gn() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gj();
      }

      this.d(8, $$0);
   }

   public boolean go() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gA() {
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

   public static bkn.a gp() {
      return bjk.A().a(bko.a, 10.0).a(bko.e, 0.6F).a(bko.d, 0.3F).a(bko.f, 2.0).a(bko.b, 48.0);
   }

   @Override
   protected bsr b(cpx $$0) {
      bsp $$1 = new bsp(this, $$0) {
         @Override
         public boolean a(gw $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!buu.this.cH.l()) {
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
   public boolean m(cjh $$0) {
      return $$0.a(aqc.S);
   }

   boolean m(gw $$0) {
      return this.dL().o($$0) && this.dL().a_($$0).a(apu.U);
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
   }

   @Override
   protected ape w() {
      return null;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.bA;
   }

   @Override
   protected ape l_() {
      return apf.bz;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Nullable
   public buu b(aks $$0, bin $$1) {
      return biw.h.a((cpx)$$0);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dfl $$2, gw $$3) {
   }

   @Override
   public boolean aR() {
      return this.gq() && this.ah % bU == 0;
   }

   @Override
   public boolean gq() {
      return !this.aA();
   }

   public void gr() {
      this.w(false);
      this.gx();
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
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
   public bjn eR() {
      return bjn.c;
   }

   @Override
   protected void c(aqj<ean> $$0) {
      this.f(this.do().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gw $$0, int $$1) {
      return $$0.a(this.dl(), (double)$$1);
   }

   abstract class a extends bqd {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !buu.this.X_();
      }

      @Override
      public boolean b() {
         return this.i() && !buu.this.X_();
      }
   }

   class b extends bqn {
      b(bjr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && buu.this.X_() && !buu.this.go();
      }

      @Override
      public boolean b() {
         return super.b() && buu.this.X_() && !buu.this.go();
      }
   }

   static class c extends brw<cbw> {
      c(buu $$0) {
         super($$0, cbw.class, 10, true, false, $$0::a_);
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
         buu $$0 = (buu)this.e;
         return $$0.X_() && !$$0.go();
      }
   }

   class d extends buu.a {
      @Override
      public boolean h() {
         if (buu.this.gk() && buu.this.gt() && buu.this.cG.a(buu.this.dj(), 2.0) && buu.this.dL().c_(buu.this.cG) instanceof dcu $$1) {
            if (!$$1.f()) {
               return true;
            }

            buu.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (buu.this.dL().c_(buu.this.cG) instanceof dcu $$1) {
            $$1.a(buu.this, buu.this.gn());
         }
      }
   }

   @ata
   public class e extends buu.a {
      public static final int b = 600;
      int d = buu.this.dL().z.a(10);
      private static final int e = 3;
      final List<gw> f = Lists.newArrayList();
      @Nullable
      private ebd g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean h() {
         return buu.this.cG != null && !buu.this.fP() && buu.this.gt() && !this.d(buu.this.cG) && buu.this.dL().a_(buu.this.cG).a(apu.aF);
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
         buu.this.bN.n();
         buu.this.bN.g();
      }

      @Override
      public void e() {
         if (buu.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!buu.this.bN.m()) {
               if (!buu.this.b(buu.this.cG, 16)) {
                  if (buu.this.l(buu.this.cG)) {
                     this.m();
                  } else {
                     buu.this.j(buu.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(buu.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && buu.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = buu.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gw $$0) {
         buu.this.bN.a(10.0F);
         buu.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return buu.this.bN.j() != null && buu.this.bN.j().j();
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
         if (buu.this.cG != null) {
            this.c(buu.this.cG);
         }

         this.m();
      }

      private void m() {
         buu.this.cG = null;
         buu.this.cC = 200;
      }

      private boolean d(gw $$0) {
         if (buu.this.b($$0, 2)) {
            return true;
         } else {
            ebd $$1 = buu.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends buu.a {
      private static final int c = 600;
      int d = buu.this.dL().z.a(10);

      f() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean h() {
         return buu.this.cF != null && !buu.this.fP() && this.k() && buu.this.m(buu.this.cF) && !buu.this.b(buu.this.cF, 2);
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
         buu.this.bN.n();
         buu.this.bN.g();
      }

      @Override
      public void e() {
         if (buu.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               buu.this.cF = null;
            } else if (!buu.this.bN.m()) {
               if (buu.this.l(buu.this.cF)) {
                  buu.this.cF = null;
               } else {
                  buu.this.j(buu.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return buu.this.cy > 2400;
      }
   }

   class g extends buu.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (buu.this.gw() >= 10) {
            return false;
         } else {
            return buu.this.ag.i() < 0.3F ? false : buu.this.gn() && buu.this.gz();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (buu.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gw $$1 = buu.this.dl().c($$0);
               dfl $$2 = buu.this.dL().a_($$1);
               csx $$3 = $$2.b();
               dfl $$4 = null;
               if ($$2.a(apu.aH)) {
                  if ($$3 instanceof cuo) {
                     cuo $$5 = (cuo)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dat) {
                     int $$6 = $$2.c(dat.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dat.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(csy.oi)) {
                     int $$7 = $$2.c(dbb.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dbb.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(csy.ru) || $$2.a(csy.rv)) {
                     ((csz)$$2.b()).a((aks)buu.this.dL(), buu.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     buu.this.dL().c(2005, $$1, 0);
                     buu.this.dL().b($$1, $$4);
                     buu.this.gy();
                  }
               }
            }
         }
      }
   }

   class h extends brv {
      h(buu $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return buu.this.X_() && super.b();
      }

      @Override
      protected void a(bjk $$0, bji $$1) {
         if ($$0 instanceof buu && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends buu.a {
      @Override
      public boolean h() {
         return buu.this.cC == 0 && !buu.this.gk() && buu.this.gt();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         buu.this.cC = 200;
         List<gw> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gw $$1 : $$0) {
               if (!buu.this.cI.b($$1)) {
                  buu.this.cG = $$1;
                  return;
               }
            }

            buu.this.cI.k();
            buu.this.cG = $$0.get(0);
         }
      }

      private List<gw> k() {
         gw $$0 = buu.this.dl();
         buh $$1 = ((aks)buu.this.dL()).w();
         Stream<bui> $$2 = $$1.c($$0x -> $$0x.a(aqe.c), $$0, 20, buh.b.c);
         return $$2.map(bui::f).filter(buu.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bpf {
      j(bjk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!buu.this.X_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buu.this.cH.l();
      }
   }

   class k extends buu.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dfl> f = $$0 -> {
         if ($$0.b(dgb.C) && $$0.c(dgb.C)) {
            return false;
         } else if ($$0.a(apu.U)) {
            return $$0.a(csy.iD) ? $$0.c(cvb.a) == dgh.a : true;
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
      private ehp o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean h() {
         if (buu.this.cE > 0) {
            return false;
         } else if (buu.this.gn()) {
            return false;
         } else if (buu.this.dL().Z()) {
            return false;
         } else {
            Optional<gw> $$0 = this.p();
            if ($$0.isPresent()) {
               buu.this.cF = $$0.get();
               buu.this.bN.a((double)buu.this.cF.u() + 0.5, (double)buu.this.cF.v() + 0.5, (double)buu.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               buu.this.cE = ary.a(buu.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!buu.this.t()) {
            return false;
         } else if (buu.this.dL().Z()) {
            return false;
         } else if (this.k()) {
            return buu.this.ag.i() < 0.2F;
         } else if (buu.this.ah % 20 == 0 && !buu.this.m(buu.this.cF)) {
            buu.this.cF = null;
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
         buu.this.gj();
      }

      @Override
      public void d() {
         if (this.k()) {
            buu.this.w(true);
         }

         this.n = false;
         buu.this.bN.n();
         buu.this.cE = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            buu.this.cF = null;
         } else {
            ehp $$0 = ehp.c(buu.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(buu.this.dj()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = buu.this.dj().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  buu.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = buu.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehp($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        buu.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     buu.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (buu.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     buu.this.a(apf.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         buu.this.I().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (buu.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gw> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gw> a(Predicate<dfl> $$0, double $$1) {
         gw $$2 = buu.this.dl();
         gw.a $$3 = new gw.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(buu.this.dL().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bqd {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         return buu.this.bN.l() && buu.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return buu.this.bN.m();
      }

      @Override
      public void c() {
         ehp $$0 = this.h();
         if ($$0 != null) {
            buu.this.bN.a(buu.this.bN.a(gw.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehp h() {
         ehp $$1;
         if (buu.this.gz() && !buu.this.b(buu.this.cG, 22)) {
            ehp $$0 = ehp.b(buu.this.cG);
            $$1 = $$0.d(buu.this.dj()).d();
         } else {
            $$1 = buu.this.f(0.0F);
         }

         int $$3 = 8;
         ehp $$4 = bua.a(buu.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : btw.a(buu.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
