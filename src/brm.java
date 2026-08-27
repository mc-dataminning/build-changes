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

public class brm extends brl implements bgg, bru {
   public static final float bT = 120.32113F;
   public static final int bU = apa.f(1.4959966F);
   private static final aby<Byte> cd = acb.a(brm.class, aca.a);
   private static final aby<Integer> ce = acb.a(brm.class, aca.b);
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
   private static final bdi ct = apw.a(20, 39);
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
   int cE = apa.a(this.af, 20, 60);
   @Nullable
   gu cF;
   @Nullable
   gu cG;
   brm.k cH;
   brm.e cI;
   private brm.f cJ;
   private int cK;

   public brm(bfn<? extends brm> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new blv(this, 20, true);
      this.bK = new brm.j(this);
      this.a(dxp.n, -1.0F);
      this.a(dxp.j, -1.0F);
      this.a(dxp.k, 16.0F);
      this.a(dxp.x, -1.0F);
      this.a(dxp.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(cd, (byte)0);
      this.am.a(ce, 0);
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void x() {
      this.bO.a(0, new brm.b(this, 1.4F, true));
      this.bO.a(1, new brm.d());
      this.bO.a(2, new bmh(this, 1.0));
      this.bO.a(3, new bod(this, 1.25, ciz.a(ane.S), false));
      this.cH = new brm.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bmu(this, 1.25));
      this.bO.a(5, new brm.i());
      this.cI = new brm.e();
      this.bO.a(5, this.cI);
      this.cJ = new brm.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new brm.g());
      this.bO.a(8, new brm.l());
      this.bO.a(9, new bmp(this));
      this.bP.a(1, new brm.h(this).a(new Class[0]));
      this.bP.a(2, new brm.c(this));
      this.bP.a(3, new bou<>(this, true));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.gf()) {
         $$0.a("HivePos", rd.a(this.gg()));
      }

      if (this.r()) {
         $$0.a("FlowerPos", rd.a(this.q()));
      }

      $$0.a("HasNectar", this.gi());
      $$0.a("HasStung", this.gj());
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
      this.a(this.dI(), $$0);
   }

   @Override
   public boolean z(bfj $$0) {
      boolean $$1 = $$0.a(this.dJ().a((bfz)this), (float)((int)this.b(bhg.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bfz) {
            ((bfz)$$0).q(((bfz)$$0).eK() + 1);
            int $$2 = 0;
            if (this.dI().ai() == bdu.c) {
               $$2 = 10;
            } else if (this.dI().ai() == bdu.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bfz)$$0).b(new bfa(bfc.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.O_();
         this.a(amh.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gi() && this.gr() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dI(), this.dn() - 0.3F, this.dn() + 0.3F, this.dt() - 0.3F, this.dt() + 0.3F, this.e(0.5), iv.as);
         }
      }

      this.gp();
   }

   private void a(cmm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, it $$6) {
      $$0.a($$6, apa.d($$0.z.j(), $$1, $$2), $$5, apa.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gu $$0) {
      eei $$1 = eei.c($$0);
      int $$2 = 0;
      gu $$3 = this.di();
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

      eei $$8 = bqp.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gu q() {
      return this.cF;
   }

   public boolean r() {
      return this.cF != null;
   }

   public void i(gu $$0) {
      this.cF = $$0;
   }

   @aqa
   public int w() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @aqa
   public List<gu> fY() {
      return this.cI.f;
   }

   private boolean gn() {
      return this.cy > 3600;
   }

   boolean go() {
      if (this.cz <= 0 && !this.cH.l() && !this.gj() && this.j() == null) {
         boolean $$0 = this.gn() || this.dI().Z() || this.dI().O() || this.gi();
         return $$0 && !this.gq();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float D(float $$0) {
      return apa.i($$0, this.cw, this.cv);
   }

   private void gp() {
      this.cw = this.cv;
      if (this.gv()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void W() {
      boolean $$0 = this.gj();
      if (this.aY()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dJ().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.af.a(apa.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dJ().n(), this.er());
         }
      }

      if (!this.gi()) {
         this.cy++;
      }

      if (!this.dI().B) {
         this.a((aif)this.dI(), false);
      }
   }

   public void ge() {
      this.cy = 0;
   }

   private boolean gq() {
      if (this.cG == null) {
         return false;
      } else {
         czn $$0 = this.dI().c_(this.cG);
         return $$0 instanceof czk && ((czk)$$0).c();
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

   private boolean k(gu $$0) {
      czn $$1 = this.dI().c_($$0);
      return $$1 instanceof czk ? !((czk)$$1).f() : false;
   }

   @aqa
   public boolean gf() {
      return this.cG != null;
   }

   @Nullable
   @aqa
   public gu gg() {
      return this.cG;
   }

   @aqa
   public bmw gh() {
      return this.bO;
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   int gr() {
      return this.cA;
   }

   private void gs() {
      this.cA = 0;
   }

   void gt() {
      this.cA++;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dI().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.S_() && !this.gj() && this.j() != null && this.j().f(this) < 4.0;
         this.y($$0);
         if (this.ag % 20 == 0 && !this.gu()) {
            this.cG = null;
         }
      }
   }

   boolean gu() {
      if (!this.gf()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         czn $$0 = this.dI().c_(this.cG);
         return $$0 != null && $$0.u() == czp.H;
      }
   }

   public boolean gi() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.ge();
      }

      this.d(8, $$0);
   }

   public boolean gj() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gv() {
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
         this.am.b(cd, (byte)(this.am.b(cd) | $$0));
      } else {
         this.am.b(cd, (byte)(this.am.b(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.b(cd) & $$0) != 0;
   }

   public static bhf.a gk() {
      return bgb.y().a(bhg.a, 10.0).a(bhg.e, 0.6F).a(bhg.d, 0.3F).a(bhg.f, 2.0).a(bhg.b, 48.0);
   }

   @Override
   protected bpj b(cmm $$0) {
      bph $$1 = new bph(this, $$0) {
         @Override
         public boolean a(gu $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!brm.this.cH.l()) {
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
   public boolean m(cfz $$0) {
      return $$0.a(ane.S);
   }

   boolean m(gu $$0) {
      return this.dI().o($$0) && this.dI().a_($$0).a(amw.U);
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
   }

   @Override
   protected amg s() {
      return null;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.bA;
   }

   @Override
   protected amg g_() {
      return amh.bz;
   }

   @Override
   protected float eR() {
      return 0.4F;
   }

   @Nullable
   public brm b(aif $$0, bfe $$1) {
      return bfn.h.a((cmm)$$0);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
   }

   @Override
   public boolean aP() {
      return this.gl() && this.ag % bU == 0;
   }

   @Override
   public boolean gl() {
      return !this.ay();
   }

   public void gm() {
      this.w(false);
      this.gs();
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dI().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bge eN() {
      return bge.c;
   }

   @Override
   protected void c(anl<dxd> $$0) {
      this.f(this.dl().b(0.0, 0.01, 0.0));
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.5F * this.cF()), (double)(this.dd() * 0.2F));
   }

   boolean b(gu $$0, int $$1) {
      return $$0.a(this.di(), (double)$$1);
   }

   abstract class a extends bmv {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !brm.this.S_();
      }

      @Override
      public boolean b() {
         return this.i() && !brm.this.S_();
      }
   }

   class b extends bnf {
      b(bgi $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && brm.this.S_() && !brm.this.gj();
      }

      @Override
      public boolean b() {
         return super.b() && brm.this.S_() && !brm.this.gj();
      }
   }

   static class c extends boo<byo> {
      c(brm $$0) {
         super($$0, byo.class, 10, true, false, $$0::a_);
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
         brm $$0 = (brm)this.e;
         return $$0.S_() && !$$0.gj();
      }
   }

   class d extends brm.a {
      @Override
      public boolean h() {
         if (brm.this.gf() && brm.this.go() && brm.this.cG.a(brm.this.dg(), 2.0) && brm.this.dI().c_(brm.this.cG) instanceof czk $$1) {
            if (!$$1.f()) {
               return true;
            }

            brm.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (brm.this.dI().c_(brm.this.cG) instanceof czk $$1) {
            $$1.a(brm.this, brm.this.gi());
         }
      }
   }

   @aqa
   public class e extends brm.a {
      public static final int b = 600;
      int d = brm.this.dI().z.a(10);
      private static final int e = 3;
      final List<gu> f = Lists.newArrayList();
      @Nullable
      private dxt g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean h() {
         return brm.this.cG != null && !brm.this.fM() && brm.this.go() && !this.d(brm.this.cG) && brm.this.dI().a_(brm.this.cG).a(amw.aE);
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
         brm.this.bN.n();
         brm.this.bN.g();
      }

      @Override
      public void e() {
         if (brm.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!brm.this.bN.m()) {
               if (!brm.this.b(brm.this.cG, 16)) {
                  if (brm.this.l(brm.this.cG)) {
                     this.m();
                  } else {
                     brm.this.j(brm.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(brm.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && brm.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = brm.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gu $$0) {
         brm.this.bN.a(10.0F);
         brm.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return brm.this.bN.j() != null && brm.this.bN.j().j();
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
         if (brm.this.cG != null) {
            this.c(brm.this.cG);
         }

         this.m();
      }

      private void m() {
         brm.this.cG = null;
         brm.this.cC = 200;
      }

      private boolean d(gu $$0) {
         if (brm.this.b($$0, 2)) {
            return true;
         } else {
            dxt $$1 = brm.this.bN.j();
            return $$1 != null && $$1.m().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends brm.a {
      private static final int c = 600;
      int d = brm.this.dI().z.a(10);

      f() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean h() {
         return brm.this.cF != null && !brm.this.fM() && this.k() && brm.this.m(brm.this.cF) && !brm.this.b(brm.this.cF, 2);
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
         brm.this.bN.n();
         brm.this.bN.g();
      }

      @Override
      public void e() {
         if (brm.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               brm.this.cF = null;
            } else if (!brm.this.bN.m()) {
               if (brm.this.l(brm.this.cF)) {
                  brm.this.cF = null;
               } else {
                  brm.this.j(brm.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return brm.this.cy > 2400;
      }
   }

   class g extends brm.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (brm.this.gr() >= 10) {
            return false;
         } else {
            return brm.this.af.i() < 0.3F ? false : brm.this.gi() && brm.this.gu();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (brm.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gu $$1 = brm.this.di().c($$0);
               dcb $$2 = brm.this.dI().a_($$1);
               cpn $$3 = $$2.b();
               dcb $$4 = null;
               if ($$2.a(amw.aG)) {
                  if ($$3 instanceof cre) {
                     cre $$5 = (cre)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof cxj) {
                     int $$6 = $$2.c(cxj.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(cxj.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cpo.oi)) {
                     int $$7 = $$2.c(cxr.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(cxr.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cpo.ru) || $$2.a(cpo.rv)) {
                     ((cpp)$$2.b()).a((aif)brm.this.dI(), brm.this.af, $$1, $$2);
                  }

                  if ($$4 != null) {
                     brm.this.dI().c(2005, $$1, 0);
                     brm.this.dI().b($$1, $$4);
                     brm.this.gt();
                  }
               }
            }
         }
      }
   }

   class h extends bon {
      h(brm $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return brm.this.S_() && super.b();
      }

      @Override
      protected void a(bgb $$0, bfz $$1) {
         if ($$0 instanceof brm && this.e.B($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends brm.a {
      @Override
      public boolean h() {
         return brm.this.cC == 0 && !brm.this.gf() && brm.this.go();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         brm.this.cC = 200;
         List<gu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gu $$1 : $$0) {
               if (!brm.this.cI.b($$1)) {
                  brm.this.cG = $$1;
                  return;
               }
            }

            brm.this.cI.k();
            brm.this.cG = $$0.get(0);
         }
      }

      private List<gu> k() {
         gu $$0 = brm.this.di();
         bqz $$1 = ((aif)brm.this.dI()).w();
         Stream<bra> $$2 = $$1.c($$0x -> $$0x.a(ang.c), $$0, 20, bqz.b.c);
         return $$2.map(bra::f).filter(brm.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends blx {
      j(bgb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!brm.this.S_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !brm.this.cH.l();
      }
   }

   class k extends brm.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dcb> f = $$0 -> {
         if ($$0.b(dcr.C) && $$0.c(dcr.C)) {
            return false;
         } else if ($$0.a(amw.U)) {
            return $$0.a(cpo.iD) ? $$0.c(crr.a) == dcx.a : true;
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
      private eei o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean h() {
         if (brm.this.cE > 0) {
            return false;
         } else if (brm.this.gi()) {
            return false;
         } else if (brm.this.dI().Z()) {
            return false;
         } else {
            Optional<gu> $$0 = this.p();
            if ($$0.isPresent()) {
               brm.this.cF = $$0.get();
               brm.this.bN.a((double)brm.this.cF.u() + 0.5, (double)brm.this.cF.v() + 0.5, (double)brm.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               brm.this.cE = apa.a(brm.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!brm.this.r()) {
            return false;
         } else if (brm.this.dI().Z()) {
            return false;
         } else if (this.k()) {
            return brm.this.af.i() < 0.2F;
         } else if (brm.this.ag % 20 == 0 && !brm.this.m(brm.this.cF)) {
            brm.this.cF = null;
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
         brm.this.ge();
      }

      @Override
      public void d() {
         if (this.k()) {
            brm.this.w(true);
         }

         this.n = false;
         brm.this.bN.n();
         brm.this.cE = 200;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            brm.this.cF = null;
         } else {
            eei $$0 = eei.c(brm.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(brm.this.dg()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = brm.this.dg().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  brm.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = brm.this.af.a(25) == 0;
                     if ($$3) {
                        this.o = new eei($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        brm.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     brm.this.E().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (brm.this.af.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     brm.this.a(amh.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         brm.this.G().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (brm.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gu> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gu> a(Predicate<dcb> $$0, double $$1) {
         gu $$2 = brm.this.di();
         gu.a $$3 = new gu.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(brm.this.dI().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bmv {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         return brm.this.bN.l() && brm.this.af.a(10) == 0;
      }

      @Override
      public boolean b() {
         return brm.this.bN.m();
      }

      @Override
      public void c() {
         eei $$0 = this.h();
         if ($$0 != null) {
            brm.this.bN.a(brm.this.bN.a(gu.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private eei h() {
         eei $$1;
         if (brm.this.gu() && !brm.this.b(brm.this.cG, 22)) {
            eei $$0 = eei.b(brm.this.cG);
            $$1 = $$0.d(brm.this.dg()).d();
         } else {
            $$1 = brm.this.f(0.0F);
         }

         int $$3 = 8;
         eei $$4 = bqs.a(brm.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bqo.a(brm.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
