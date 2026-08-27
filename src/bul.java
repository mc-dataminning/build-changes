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

public class bul extends buk implements bjf, but {
   public static final float bT = 120.32113F;
   public static final int bU = arp.f(1.4959966F);
   private static final adz<Byte> cd = aec.a(bul.class, aeb.a);
   private static final adz<Integer> ce = aec.a(bul.class, aeb.b);
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
   bul.k cH;
   bul.e cI;
   private bul.f cJ;
   private int cK;

   public bul(bim<? extends bul> $$0, cpm $$1) {
      super($$0, $$1);
      this.bL = new bou(this, 20, true);
      this.bK = new bul.j(this);
      this.a(eao.n, -1.0F);
      this.a(eao.j, -1.0F);
      this.a(eao.k, 16.0F);
      this.a(eao.x, -1.0F);
      this.a(eao.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bul.b(this, 1.4F, true));
      this.bO.a(1, new bul.d());
      this.bO.a(2, new bpg(this, 1.0));
      this.bO.a(3, new brc(this, 1.25, cly.a(apt.S), false));
      this.cH = new bul.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bpt(this, 1.25));
      this.bO.a(5, new bul.i());
      this.cI = new bul.e();
      this.bO.a(5, this.cI);
      this.cJ = new bul.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bul.g());
      this.bO.a(8, new bul.l());
      this.bO.a(9, new bpo(this));
      this.bP.a(1, new bul.h(this).a(new Class[0]));
      this.bP.a(2, new bul.c(this));
      this.bP.a(3, new brt<>(this, true));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.gg()) {
         $$0.a("HivePos", rd.a(this.gh()));
      }

      if (this.q()) {
         $$0.a("FlowerPos", rd.a(this.p()));
      }

      $$0.a("HasNectar", this.gj());
      $$0.a("HasStung", this.gk());
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
      boolean $$1 = $$0.a(this.dL().a((biy)this), (float)((int)this.b(bkf.f)));
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
      if (this.gj() && this.gs() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dK(), this.dp() - 0.3F, this.dp() + 0.3F, this.dv() - 0.3F, this.dv() + 0.3F, this.e(0.5), iv.as);
         }
      }

      this.gq();
   }

   private void a(cpm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, it $$6) {
      $$0.a($$6, arp.d($$0.z.j(), $$1, $$2), $$5, arp.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gu $$0) {
      ehe $$1 = ehe.c($$0);
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

      ehe $$8 = bto.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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
   public List<gu> fZ() {
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
      return arp.i($$0, this.cw, this.cv);
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
         if (this.cx % 5 == 0 && this.ag.a(arp.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dL().n(), this.et());
         }
      }

      if (!this.gj()) {
         this.cy++;
      }

      if (!this.dK().B) {
         this.a((akk)this.dK(), false);
      }
   }

   public void gf() {
      this.cy = 0;
   }

   private boolean gr() {
      if (this.cG == null) {
         return false;
      } else {
         dcm $$0 = this.dK().c_(this.cG);
         return $$0 instanceof dcj && ((dcj)$$0).c();
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
      dcm $$1 = this.dK().c_($$0);
      return $$1 instanceof dcj ? !((dcj)$$1).f() : false;
   }

   @asq
   public boolean gg() {
      return this.cG != null;
   }

   @Nullable
   @asq
   public gu gh() {
      return this.cG;
   }

   @asq
   public bpv gi() {
      return this.bO;
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
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
         dcm $$0 = this.dK().c_(this.cG);
         return $$0 != null && $$0.u() == dco.H;
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

   public static bke.a gl() {
      return bja.x().a(bkf.a, 10.0).a(bkf.e, 0.6F).a(bkf.d, 0.3F).a(bkf.f, 2.0).a(bkf.b, 48.0);
   }

   @Override
   protected bsi b(cpm $$0) {
      bsg $$1 = new bsg(this, $$0) {
         @Override
         public boolean a(gu $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bul.this.cH.l()) {
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
   public boolean m(ciy $$0) {
      return $$0.a(apt.S);
   }

   boolean m(gu $$0) {
      return this.dK().o($$0) && this.dK().a_($$0).a(apl.U);
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
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
   public bul b(akk $$0, bid $$1) {
      return bim.h.a((cpm)$$0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
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
   protected void c(aqa<eac> $$0) {
      this.f(this.dn().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehe cI() {
      return new ehe(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gu $$0, int $$1) {
      return $$0.a(this.dk(), (double)$$1);
   }

   abstract class a extends bpu {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bul.this.S_();
      }

      @Override
      public boolean b() {
         return this.i() && !bul.this.S_();
      }
   }

   class b extends bqe {
      b(bjh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bul.this.S_() && !bul.this.gk();
      }

      @Override
      public boolean b() {
         return super.b() && bul.this.S_() && !bul.this.gk();
      }
   }

   static class c extends brn<cbn> {
      c(bul $$0) {
         super($$0, cbn.class, 10, true, false, $$0::a_);
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
         bul $$0 = (bul)this.e;
         return $$0.S_() && !$$0.gk();
      }
   }

   class d extends bul.a {
      @Override
      public boolean h() {
         if (bul.this.gg() && bul.this.gp() && bul.this.cG.a(bul.this.di(), 2.0) && bul.this.dK().c_(bul.this.cG) instanceof dcj $$1) {
            if (!$$1.f()) {
               return true;
            }

            bul.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bul.this.dK().c_(bul.this.cG) instanceof dcj $$1) {
            $$1.a(bul.this, bul.this.gj());
         }
      }
   }

   @asq
   public class e extends bul.a {
      public static final int b = 600;
      int d = bul.this.dK().z.a(10);
      private static final int e = 3;
      final List<gu> f = Lists.newArrayList();
      @Nullable
      private eas g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean h() {
         return bul.this.cG != null && !bul.this.fM() && bul.this.gp() && !this.d(bul.this.cG) && bul.this.dK().a_(bul.this.cG).a(apl.aF);
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
         bul.this.bN.n();
         bul.this.bN.g();
      }

      @Override
      public void e() {
         if (bul.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bul.this.bN.m()) {
               if (!bul.this.b(bul.this.cG, 16)) {
                  if (bul.this.l(bul.this.cG)) {
                     this.m();
                  } else {
                     bul.this.j(bul.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bul.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bul.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bul.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gu $$0) {
         bul.this.bN.a(10.0F);
         bul.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bul.this.bN.j() != null && bul.this.bN.j().j();
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
         if (bul.this.cG != null) {
            this.c(bul.this.cG);
         }

         this.m();
      }

      private void m() {
         bul.this.cG = null;
         bul.this.cC = 200;
      }

      private boolean d(gu $$0) {
         if (bul.this.b($$0, 2)) {
            return true;
         } else {
            eas $$1 = bul.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bul.a {
      private static final int c = 600;
      int d = bul.this.dK().z.a(10);

      f() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean h() {
         return bul.this.cF != null && !bul.this.fM() && this.k() && bul.this.m(bul.this.cF) && !bul.this.b(bul.this.cF, 2);
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
         bul.this.bN.n();
         bul.this.bN.g();
      }

      @Override
      public void e() {
         if (bul.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bul.this.cF = null;
            } else if (!bul.this.bN.m()) {
               if (bul.this.l(bul.this.cF)) {
                  bul.this.cF = null;
               } else {
                  bul.this.j(bul.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bul.this.cy > 2400;
      }
   }

   class g extends bul.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bul.this.gs() >= 10) {
            return false;
         } else {
            return bul.this.ag.i() < 0.3F ? false : bul.this.gj() && bul.this.gv();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bul.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gu $$1 = bul.this.dk().c($$0);
               dfa $$2 = bul.this.dK().a_($$1);
               csm $$3 = $$2.b();
               dfa $$4 = null;
               if ($$2.a(apl.aH)) {
                  if ($$3 instanceof cud) {
                     cud $$5 = (cud)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dai) {
                     int $$6 = $$2.c(dai.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dai.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(csn.oi)) {
                     int $$7 = $$2.c(daq.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(daq.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(csn.ru) || $$2.a(csn.rv)) {
                     ((cso)$$2.b()).a((akk)bul.this.dK(), bul.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bul.this.dK().c(2005, $$1, 0);
                     bul.this.dK().b($$1, $$4);
                     bul.this.gu();
                  }
               }
            }
         }
      }
   }

   class h extends brm {
      h(bul $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bul.this.S_() && super.b();
      }

      @Override
      protected void a(bja $$0, biy $$1) {
         if ($$0 instanceof bul && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bul.a {
      @Override
      public boolean h() {
         return bul.this.cC == 0 && !bul.this.gg() && bul.this.gp();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bul.this.cC = 200;
         List<gu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gu $$1 : $$0) {
               if (!bul.this.cI.b($$1)) {
                  bul.this.cG = $$1;
                  return;
               }
            }

            bul.this.cI.k();
            bul.this.cG = $$0.get(0);
         }
      }

      private List<gu> k() {
         gu $$0 = bul.this.dk();
         bty $$1 = ((akk)bul.this.dK()).w();
         Stream<btz> $$2 = $$1.c($$0x -> $$0x.a(apv.c), $$0, 20, bty.b.c);
         return $$2.map(btz::f).filter(bul.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bow {
      j(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bul.this.S_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bul.this.cH.l();
      }
   }

   class k extends bul.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dfa> f = $$0 -> {
         if ($$0.b(dfq.C) && $$0.c(dfq.C)) {
            return false;
         } else if ($$0.a(apl.U)) {
            return $$0.a(csn.iD) ? $$0.c(cuq.a) == dfw.a : true;
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
      private ehe o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean h() {
         if (bul.this.cE > 0) {
            return false;
         } else if (bul.this.gj()) {
            return false;
         } else if (bul.this.dK().Z()) {
            return false;
         } else {
            Optional<gu> $$0 = this.p();
            if ($$0.isPresent()) {
               bul.this.cF = $$0.get();
               bul.this.bN.a((double)bul.this.cF.u() + 0.5, (double)bul.this.cF.v() + 0.5, (double)bul.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bul.this.cE = arp.a(bul.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bul.this.q()) {
            return false;
         } else if (bul.this.dK().Z()) {
            return false;
         } else if (this.k()) {
            return bul.this.ag.i() < 0.2F;
         } else if (bul.this.ah % 20 == 0 && !bul.this.m(bul.this.cF)) {
            bul.this.cF = null;
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
         bul.this.gf();
      }

      @Override
      public void d() {
         if (this.k()) {
            bul.this.w(true);
         }

         this.n = false;
         bul.this.bN.n();
         bul.this.cE = 200;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bul.this.cF = null;
         } else {
            ehe $$0 = ehe.c(bul.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bul.this.di()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bul.this.di().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bul.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bul.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehe($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bul.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bul.this.D().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bul.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bul.this.a(aow.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bul.this.E().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bul.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gu> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gu> a(Predicate<dfa> $$0, double $$1) {
         gu $$2 = bul.this.dk();
         gu.a $$3 = new gu.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bul.this.dK().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bpu {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         return bul.this.bN.l() && bul.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bul.this.bN.m();
      }

      @Override
      public void c() {
         ehe $$0 = this.h();
         if ($$0 != null) {
            bul.this.bN.a(bul.this.bN.a(gu.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehe h() {
         ehe $$1;
         if (bul.this.gv() && !bul.this.b(bul.this.cG, 22)) {
            ehe $$0 = ehe.b(bul.this.cG);
            $$1 = $$0.d(bul.this.di()).d();
         } else {
            $$1 = bul.this.f(0.0F);
         }

         int $$3 = 8;
         ehe $$4 = btr.a(bul.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : btn.a(bul.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
