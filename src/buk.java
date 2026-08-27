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

public class buk extends buj implements bjf, bus {
   public static final float bT = 120.32113F;
   public static final int bU = arp.f(1.4959966F);
   private static final adz<Byte> cd = aec.a(buk.class, aeb.a);
   private static final adz<Integer> ce = aec.a(buk.class, aeb.b);
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
   private static final bgb ct = asm.a(20, 39);
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
   int cE = arp.a(this.ag, 20, 60);
   @Nullable
   gu cF;
   @Nullable
   gu cG;
   buk.k cH;
   buk.e cI;
   private buk.f cJ;
   private int cK;

   public buk(bim<? extends buk> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new bot(this, 20, true);
      this.bK = new buk.j(this);
      this.a(ean.n, -1.0F);
      this.a(ean.j, -1.0F);
      this.a(ean.k, 16.0F);
      this.a(ean.x, -1.0F);
      this.a(ean.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gu $$0, cpo $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void w() {
      this.bO.a(0, new buk.b(this, 1.4F, true));
      this.bO.a(1, new buk.d());
      this.bO.a(2, new bpf(this, 1.0));
      this.bO.a(3, new brb(this, 1.25, clx.a(apt.S), false));
      this.cH = new buk.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bps(this, 1.25));
      this.bO.a(5, new buk.i());
      this.cI = new buk.e();
      this.bO.a(5, this.cI);
      this.cJ = new buk.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new buk.g());
      this.bO.a(8, new buk.l());
      this.bO.a(9, new bpn(this));
      this.bP.a(1, new buk.h(this).a(new Class[0]));
      this.bP.a(2, new buk.c(this));
      this.bP.a(3, new brs<>(this, true));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.gh()) {
         $$0.a("HivePos", rd.a(this.gi()));
      }

      if (this.q()) {
         $$0.a("FlowerPos", rd.a(this.p()));
      }

      $$0.a("HasNectar", this.gk());
      $$0.a("HasStung", this.gl());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = rd.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = rd.b($$0.p("FlowerPos"));
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
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().a((biy)this), (float)((int)this.b(bke.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof biy) {
            ((biy)$$0).q(((biy)$$0).eN() + 1);
            int $$2 = 0;
            if (this.dK().ai() == bgn.c) {
               $$2 = 10;
            } else if (this.dK().ai() == bgn.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((biy)$$0).b(new bhv(bhx.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.O_();
         this.a(aow.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gk() && this.gt() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dK(), this.dp() - 0.3F, this.dp() + 0.3F, this.dv() - 0.3F, this.dv() + 0.3F, this.e(0.5), iv.as);
         }
      }

      this.gr();
   }

   private void a(cpl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, it $$6) {
      $$0.a($$6, arp.d($$0.z.j(), $$1, $$2), $$5, arp.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gu $$0) {
      ehd $$1 = ehd.c($$0);
      int $$2 = 0;
      gu $$3 = this.dk();
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

      ehd $$8 = btn.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gu p() {
      return this.cF;
   }

   public boolean q() {
      return this.cF != null;
   }

   public void i(gu $$0) {
      this.cF = $$0;
   }

   @asq
   public int t() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @asq
   public List<gu> ga() {
      return this.cI.f;
   }

   private boolean gp() {
      return this.cy > 3600;
   }

   boolean gq() {
      if (this.cz <= 0 && !this.cH.l() && !this.gl() && this.j() == null) {
         boolean $$0 = this.gp() || this.dK().Z() || this.dK().O() || this.gk();
         return $$0 && !this.gs();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return arp.i($$0, this.cw, this.cv);
   }

   private void gr() {
      this.cw = this.cv;
      if (this.gx()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void V() {
      boolean $$0 = this.gl();
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
         if (this.cx % 5 == 0 && this.ag.a(arp.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dL().n(), this.et());
         }
      }

      if (!this.gk()) {
         this.cy++;
      }

      if (!this.dK().B) {
         this.a((akk)this.dK(), false);
      }
   }

   public void gg() {
      this.cy = 0;
   }

   private boolean gs() {
      if (this.cG == null) {
         return false;
      } else {
         dcl $$0 = this.dK().c_(this.cG);
         return $$0 instanceof dci && ((dci)$$0).c();
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

   private boolean k(gu $$0) {
      dcl $$1 = this.dK().c_($$0);
      return $$1 instanceof dci ? !((dci)$$1).f() : false;
   }

   @asq
   public boolean gh() {
      return this.cG != null;
   }

   @Nullable
   @asq
   public gu gi() {
      return this.cG;
   }

   @asq
   public bpu gj() {
      return this.bO;
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   int gt() {
      return this.cA;
   }

   private void gu() {
      this.cA = 0;
   }

   void gv() {
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

         boolean $$0 = this.S_() && !this.gl() && this.j() != null && this.j().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gw()) {
            this.cG = null;
         }
      }
   }

   boolean gw() {
      if (!this.gh()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dcl $$0 = this.dK().c_(this.cG);
         return $$0 != null && $$0.u() == dcn.H;
      }
   }

   public boolean gk() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gg();
      }

      this.d(8, $$0);
   }

   public boolean gl() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gx() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(gu $$0) {
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

   public static bkd.a gm() {
      return bja.x().a(bke.a, 10.0).a(bke.e, 0.6F).a(bke.d, 0.3F).a(bke.f, 2.0).a(bke.b, 48.0);
   }

   @Override
   protected bsh b(cpl $$0) {
      bsf $$1 = new bsf(this, $$0) {
         @Override
         public boolean a(gu $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!buk.this.cH.l()) {
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
   public boolean m(cix $$0) {
      return $$0.a(apt.S);
   }

   boolean m(gu $$0) {
      return this.dK().o($$0) && this.dK().a_($$0).a(apl.U);
   }

   @Override
   protected void b(gu $$0, dez $$1) {
   }

   @Override
   protected aov r() {
      return null;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.bA;
   }

   @Override
   protected aov h_() {
      return aow.bz;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Nullable
   public buk b(akk $$0, bid $$1) {
      return bim.h.a((cpl)$$0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dez $$2, gu $$3) {
   }

   @Override
   public boolean aR() {
      return this.gn() && this.ah % bU == 0;
   }

   @Override
   public boolean gn() {
      return !this.aA();
   }

   public void go() {
      this.w(false);
      this.gu();
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
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
   public bjd eQ() {
      return bjd.c;
   }

   @Override
   protected void c(aqa<eab> $$0) {
      this.f(this.dn().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gu $$0, int $$1) {
      return $$0.a(this.dk(), (double)$$1);
   }

   abstract class a extends bpt {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !buk.this.S_();
      }

      @Override
      public boolean b() {
         return this.i() && !buk.this.S_();
      }
   }

   class b extends bqd {
      b(bjh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && buk.this.S_() && !buk.this.gl();
      }

      @Override
      public boolean b() {
         return super.b() && buk.this.S_() && !buk.this.gl();
      }
   }

   static class c extends brm<cbm> {
      c(buk $$0) {
         super($$0, cbm.class, 10, true, false, $$0::a_);
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
         buk $$0 = (buk)this.e;
         return $$0.S_() && !$$0.gl();
      }
   }

   class d extends buk.a {
      @Override
      public boolean h() {
         if (buk.this.gh() && buk.this.gq() && buk.this.cG.a(buk.this.di(), 2.0) && buk.this.dK().c_(buk.this.cG) instanceof dci $$1) {
            if (!$$1.f()) {
               return true;
            }

            buk.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (buk.this.dK().c_(buk.this.cG) instanceof dci $$1) {
            $$1.a(buk.this, buk.this.gk());
         }
      }
   }

   @asq
   public class e extends buk.a {
      public static final int b = 600;
      int d = buk.this.dK().z.a(10);
      private static final int e = 3;
      final List<gu> f = Lists.newArrayList();
      @Nullable
      private ear g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean h() {
         return buk.this.cG != null && !buk.this.fM() && buk.this.gq() && !this.d(buk.this.cG) && buk.this.dK().a_(buk.this.cG).a(apl.aF);
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
         buk.this.bN.n();
         buk.this.bN.g();
      }

      @Override
      public void e() {
         if (buk.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!buk.this.bN.m()) {
               if (!buk.this.b(buk.this.cG, 16)) {
                  if (buk.this.l(buk.this.cG)) {
                     this.m();
                  } else {
                     buk.this.j(buk.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(buk.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && buk.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = buk.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gu $$0) {
         buk.this.bN.a(10.0F);
         buk.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return buk.this.bN.j() != null && buk.this.bN.j().j();
      }

      boolean b(gu $$0) {
         return this.f.contains($$0);
      }

      private void c(gu $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (buk.this.cG != null) {
            this.c(buk.this.cG);
         }

         this.m();
      }

      private void m() {
         buk.this.cG = null;
         buk.this.cC = 200;
      }

      private boolean d(gu $$0) {
         if (buk.this.b($$0, 2)) {
            return true;
         } else {
            ear $$1 = buk.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends buk.a {
      private static final int c = 600;
      int d = buk.this.dK().z.a(10);

      f() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean h() {
         return buk.this.cF != null && !buk.this.fM() && this.k() && buk.this.m(buk.this.cF) && !buk.this.b(buk.this.cF, 2);
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
         buk.this.bN.n();
         buk.this.bN.g();
      }

      @Override
      public void e() {
         if (buk.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               buk.this.cF = null;
            } else if (!buk.this.bN.m()) {
               if (buk.this.l(buk.this.cF)) {
                  buk.this.cF = null;
               } else {
                  buk.this.j(buk.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return buk.this.cy > 2400;
      }
   }

   class g extends buk.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (buk.this.gt() >= 10) {
            return false;
         } else {
            return buk.this.ag.i() < 0.3F ? false : buk.this.gk() && buk.this.gw();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (buk.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gu $$1 = buk.this.dk().c($$0);
               dez $$2 = buk.this.dK().a_($$1);
               csl $$3 = $$2.b();
               dez $$4 = null;
               if ($$2.a(apl.aH)) {
                  if ($$3 instanceof cuc) {
                     cuc $$5 = (cuc)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dah) {
                     int $$6 = $$2.c(dah.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dah.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(csm.oi)) {
                     int $$7 = $$2.c(dap.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dap.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(csm.ru) || $$2.a(csm.rv)) {
                     ((csn)$$2.b()).a((akk)buk.this.dK(), buk.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     buk.this.dK().c(2005, $$1, 0);
                     buk.this.dK().b($$1, $$4);
                     buk.this.gv();
                  }
               }
            }
         }
      }
   }

   class h extends brl {
      h(buk $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return buk.this.S_() && super.b();
      }

      @Override
      protected void a(bja $$0, biy $$1) {
         if ($$0 instanceof buk && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends buk.a {
      @Override
      public boolean h() {
         return buk.this.cC == 0 && !buk.this.gh() && buk.this.gq();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         buk.this.cC = 200;
         List<gu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gu $$1 : $$0) {
               if (!buk.this.cI.b($$1)) {
                  buk.this.cG = $$1;
                  return;
               }
            }

            buk.this.cI.k();
            buk.this.cG = $$0.get(0);
         }
      }

      private List<gu> k() {
         gu $$0 = buk.this.dk();
         btx $$1 = ((akk)buk.this.dK()).w();
         Stream<bty> $$2 = $$1.c($$0x -> $$0x.a(apv.c), $$0, 20, btx.b.c);
         return $$2.map(bty::f).filter(buk.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bov {
      j(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!buk.this.S_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buk.this.cH.l();
      }
   }

   class k extends buk.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dez> f = $$0 -> {
         if ($$0.b(dfp.C) && $$0.c(dfp.C)) {
            return false;
         } else if ($$0.a(apl.U)) {
            return $$0.a(csm.iD) ? $$0.c(cup.a) == dfv.a : true;
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
      private ehd o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean h() {
         if (buk.this.cE > 0) {
            return false;
         } else if (buk.this.gk()) {
            return false;
         } else if (buk.this.dK().Z()) {
            return false;
         } else {
            Optional<gu> $$0 = this.p();
            if ($$0.isPresent()) {
               buk.this.cF = $$0.get();
               buk.this.bN.a((double)buk.this.cF.u() + 0.5, (double)buk.this.cF.v() + 0.5, (double)buk.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               buk.this.cE = arp.a(buk.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!buk.this.q()) {
            return false;
         } else if (buk.this.dK().Z()) {
            return false;
         } else if (this.k()) {
            return buk.this.ag.i() < 0.2F;
         } else if (buk.this.ah % 20 == 0 && !buk.this.m(buk.this.cF)) {
            buk.this.cF = null;
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
         buk.this.gg();
      }

      @Override
      public void d() {
         if (this.k()) {
            buk.this.w(true);
         }

         this.n = false;
         buk.this.bN.n();
         buk.this.cE = 200;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            buk.this.cF = null;
         } else {
            ehd $$0 = ehd.c(buk.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(buk.this.di()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = buk.this.di().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  buk.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = buk.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehd($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        buk.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     buk.this.D().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (buk.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     buk.this.a(aow.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         buk.this.E().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (buk.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gu> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gu> a(Predicate<dez> $$0, double $$1) {
         gu $$2 = buk.this.dk();
         gu.a $$3 = new gu.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(buk.this.dK().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bpt {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         return buk.this.bN.l() && buk.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return buk.this.bN.m();
      }

      @Override
      public void c() {
         ehd $$0 = this.h();
         if ($$0 != null) {
            buk.this.bN.a(buk.this.bN.a(gu.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehd h() {
         ehd $$1;
         if (buk.this.gw() && !buk.this.b(buk.this.cG, 22)) {
            ehd $$0 = ehd.b(buk.this.cG);
            $$1 = $$0.d(buk.this.di()).d();
         } else {
            $$1 = buk.this.f(0.0F);
         }

         int $$3 = 8;
         ehd $$4 = btq.a(buk.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : btm.a(buk.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
