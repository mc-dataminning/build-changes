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

public class bun extends bum implements bji, buv {
   public static final float bT = 120.32113F;
   public static final int bU = ars.f(1.4959966F);
   private static final aec<Byte> cd = aef.a(bun.class, aee.a);
   private static final aec<Integer> ce = aef.a(bun.class, aee.b);
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
   private static final bge ct = asp.a(20, 39);
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
   int cE = ars.a(this.ag, 20, 60);
   @Nullable
   gw cF;
   @Nullable
   gw cG;
   bun.k cH;
   bun.e cI;
   private bun.f cJ;
   private int cK;

   public bun(bip<? extends bun> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bow(this, 20, true);
      this.bK = new bun.j(this);
      this.a(eas.n, -1.0F);
      this.a(eas.j, -1.0F);
      this.a(eas.k, 16.0F);
      this.a(eas.x, -1.0F);
      this.a(eas.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bun.b(this, 1.4F, true));
      this.bO.a(1, new bun.d());
      this.bO.a(2, new bpi(this, 1.0));
      this.bO.a(3, new bre(this, 1.25, cmb.a(apw.S), false));
      this.cH = new bun.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bpv(this, 1.25));
      this.bO.a(5, new bun.i());
      this.cI = new bun.e();
      this.bO.a(5, this.cI);
      this.cJ = new bun.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bun.g());
      this.bO.a(8, new bun.l());
      this.bO.a(9, new bpq(this));
      this.bP.a(1, new bun.h(this).a(new Class[0]));
      this.bP.a(2, new bun.c(this));
      this.bP.a(3, new brv<>(this, true));
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      if (this.gh()) {
         $$0.a("HivePos", rg.a(this.gi()));
      }

      if (this.q()) {
         $$0.a("FlowerPos", rg.a(this.p()));
      }

      $$0.a("HasNectar", this.gk());
      $$0.a("HasStung", this.gl());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(qu $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = rg.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = rg.b($$0.p("FlowerPos"));
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
   public boolean C(bil $$0) {
      boolean $$1 = $$0.a(this.dL().a((bjb)this), (float)((int)this.b(bkh.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bjb) {
            ((bjb)$$0).q(((bjb)$$0).eN() + 1);
            int $$2 = 0;
            if (this.dK().ai() == bgq.c) {
               $$2 = 10;
            } else if (this.dK().ai() == bgq.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bjb)$$0).b(new bhy(bia.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.O_();
         this.a(aoz.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gk() && this.gt() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dK(), this.dp() - 0.3F, this.dp() + 0.3F, this.dv() - 0.3F, this.dv() + 0.3F, this.e(0.5), ix.as);
         }
      }

      this.gr();
   }

   private void a(cpq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, iv $$6) {
      $$0.a($$6, ars.d($$0.z.j(), $$1, $$2), $$5, ars.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(gw $$0) {
      ehi $$1 = ehi.c($$0);
      int $$2 = 0;
      gw $$3 = this.dk();
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

      ehi $$8 = btq.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gw p() {
      return this.cF;
   }

   public boolean q() {
      return this.cF != null;
   }

   public void i(gw $$0) {
      this.cF = $$0;
   }

   @ast
   public int t() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @ast
   public List<gw> ga() {
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
      return ars.i($$0, this.cw, this.cv);
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
         if (this.cx % 5 == 0 && this.ag.a(ars.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dL().n(), this.et());
         }
      }

      if (!this.gk()) {
         this.cy++;
      }

      if (!this.dK().B) {
         this.a((akn)this.dK(), false);
      }
   }

   public void gg() {
      this.cy = 0;
   }

   private boolean gs() {
      if (this.cG == null) {
         return false;
      } else {
         dcq $$0 = this.dK().c_(this.cG);
         return $$0 instanceof dcn && ((dcn)$$0).c();
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
      dcq $$1 = this.dK().c_($$0);
      return $$1 instanceof dcn ? !((dcn)$$1).f() : false;
   }

   @ast
   public boolean gh() {
      return this.cG != null;
   }

   @Nullable
   @ast
   public gw gi() {
      return this.cG;
   }

   @ast
   public bpx gj() {
      return this.bO;
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
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
         dcq $$0 = this.dK().c_(this.cG);
         return $$0 != null && $$0.u() == dcs.H;
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

   public static bkg.a gm() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.e, 0.6F).a(bkh.d, 0.3F).a(bkh.f, 2.0).a(bkh.b, 48.0);
   }

   @Override
   protected bsk b(cpq $$0) {
      bsi $$1 = new bsi(this, $$0) {
         @Override
         public boolean a(gw $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bun.this.cH.l()) {
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
   public boolean m(cja $$0) {
      return $$0.a(apw.S);
   }

   boolean m(gw $$0) {
      return this.dK().o($$0) && this.dK().a_($$0).a(apo.U);
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
   }

   @Override
   protected aoy r() {
      return null;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.bA;
   }

   @Override
   protected aoy h_() {
      return aoz.bz;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Nullable
   public bun b(akn $$0, big $$1) {
      return bip.h.a((cpq)$$0);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
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
   public boolean a(bhj $$0, float $$1) {
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
   public bjg eQ() {
      return bjg.c;
   }

   @Override
   protected void c(aqd<eag> $$0) {
      this.f(this.dn().b(0.0, 0.01, 0.0));
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(gw $$0, int $$1) {
      return $$0.a(this.dk(), (double)$$1);
   }

   abstract class a extends bpw {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bun.this.S_();
      }

      @Override
      public boolean b() {
         return this.i() && !bun.this.S_();
      }
   }

   class b extends bqg {
      b(bjk $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bun.this.S_() && !bun.this.gl();
      }

      @Override
      public boolean b() {
         return super.b() && bun.this.S_() && !bun.this.gl();
      }
   }

   static class c extends brp<cbp> {
      c(bun $$0) {
         super($$0, cbp.class, 10, true, false, $$0::a_);
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
         bun $$0 = (bun)this.e;
         return $$0.S_() && !$$0.gl();
      }
   }

   class d extends bun.a {
      @Override
      public boolean h() {
         if (bun.this.gh() && bun.this.gq() && bun.this.cG.a(bun.this.di(), 2.0) && bun.this.dK().c_(bun.this.cG) instanceof dcn $$1) {
            if (!$$1.f()) {
               return true;
            }

            bun.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bun.this.dK().c_(bun.this.cG) instanceof dcn $$1) {
            $$1.a(bun.this, bun.this.gk());
         }
      }
   }

   @ast
   public class e extends bun.a {
      public static final int b = 600;
      int d = bun.this.dK().z.a(10);
      private static final int e = 3;
      final List<gw> f = Lists.newArrayList();
      @Nullable
      private eaw g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean h() {
         return bun.this.cG != null && !bun.this.fM() && bun.this.gq() && !this.d(bun.this.cG) && bun.this.dK().a_(bun.this.cG).a(apo.aF);
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
         bun.this.bN.n();
         bun.this.bN.g();
      }

      @Override
      public void e() {
         if (bun.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bun.this.bN.m()) {
               if (!bun.this.b(bun.this.cG, 16)) {
                  if (bun.this.l(bun.this.cG)) {
                     this.m();
                  } else {
                     bun.this.j(bun.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bun.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bun.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bun.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(gw $$0) {
         bun.this.bN.a(10.0F);
         bun.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bun.this.bN.j() != null && bun.this.bN.j().j();
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
         if (bun.this.cG != null) {
            this.c(bun.this.cG);
         }

         this.m();
      }

      private void m() {
         bun.this.cG = null;
         bun.this.cC = 200;
      }

      private boolean d(gw $$0) {
         if (bun.this.b($$0, 2)) {
            return true;
         } else {
            eaw $$1 = bun.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bun.a {
      private static final int c = 600;
      int d = bun.this.dK().z.a(10);

      f() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean h() {
         return bun.this.cF != null && !bun.this.fM() && this.k() && bun.this.m(bun.this.cF) && !bun.this.b(bun.this.cF, 2);
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
         bun.this.bN.n();
         bun.this.bN.g();
      }

      @Override
      public void e() {
         if (bun.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bun.this.cF = null;
            } else if (!bun.this.bN.m()) {
               if (bun.this.l(bun.this.cF)) {
                  bun.this.cF = null;
               } else {
                  bun.this.j(bun.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bun.this.cy > 2400;
      }
   }

   class g extends bun.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bun.this.gt() >= 10) {
            return false;
         } else {
            return bun.this.ag.i() < 0.3F ? false : bun.this.gk() && bun.this.gw();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bun.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               gw $$1 = bun.this.dk().c($$0);
               dfe $$2 = bun.this.dK().a_($$1);
               csq $$3 = $$2.b();
               dfe $$4 = null;
               if ($$2.a(apo.aH)) {
                  if ($$3 instanceof cuh) {
                     cuh $$5 = (cuh)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dam) {
                     int $$6 = $$2.c(dam.b);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dam.b, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(csr.oi)) {
                     int $$7 = $$2.c(dau.b);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dau.b, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(csr.ru) || $$2.a(csr.rv)) {
                     ((css)$$2.b()).a((akn)bun.this.dK(), bun.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bun.this.dK().c(2005, $$1, 0);
                     bun.this.dK().b($$1, $$4);
                     bun.this.gv();
                  }
               }
            }
         }
      }
   }

   class h extends bro {
      h(bun $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bun.this.S_() && super.b();
      }

      @Override
      protected void a(bjd $$0, bjb $$1) {
         if ($$0 instanceof bun && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bun.a {
      @Override
      public boolean h() {
         return bun.this.cC == 0 && !bun.this.gh() && bun.this.gq();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bun.this.cC = 200;
         List<gw> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (gw $$1 : $$0) {
               if (!bun.this.cI.b($$1)) {
                  bun.this.cG = $$1;
                  return;
               }
            }

            bun.this.cI.k();
            bun.this.cG = $$0.get(0);
         }
      }

      private List<gw> k() {
         gw $$0 = bun.this.dk();
         bua $$1 = ((akn)bun.this.dK()).w();
         Stream<bub> $$2 = $$1.c($$0x -> $$0x.a(apy.c), $$0, 20, bua.b.c);
         return $$2.map(bub::f).filter(bun.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends boy {
      j(bjd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bun.this.S_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bun.this.cH.l();
      }
   }

   class k extends bun.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dfe> f = $$0 -> {
         if ($$0.b(dfu.C) && $$0.c(dfu.C)) {
            return false;
         } else if ($$0.a(apo.U)) {
            return $$0.a(csr.iD) ? $$0.c(cuu.a) == dga.a : true;
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
      private ehi o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean h() {
         if (bun.this.cE > 0) {
            return false;
         } else if (bun.this.gk()) {
            return false;
         } else if (bun.this.dK().Z()) {
            return false;
         } else {
            Optional<gw> $$0 = this.p();
            if ($$0.isPresent()) {
               bun.this.cF = $$0.get();
               bun.this.bN.a((double)bun.this.cF.u() + 0.5, (double)bun.this.cF.v() + 0.5, (double)bun.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bun.this.cE = ars.a(bun.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bun.this.q()) {
            return false;
         } else if (bun.this.dK().Z()) {
            return false;
         } else if (this.k()) {
            return bun.this.ag.i() < 0.2F;
         } else if (bun.this.ah % 20 == 0 && !bun.this.m(bun.this.cF)) {
            bun.this.cF = null;
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
         bun.this.gg();
      }

      @Override
      public void d() {
         if (this.k()) {
            bun.this.w(true);
         }

         this.n = false;
         bun.this.bN.n();
         bun.this.cE = 200;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bun.this.cF = null;
         } else {
            ehi $$0 = ehi.c(bun.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bun.this.di()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bun.this.di().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bun.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bun.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ehi($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bun.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bun.this.D().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bun.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bun.this.a(aoz.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bun.this.E().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bun.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gw> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gw> a(Predicate<dfe> $$0, double $$1) {
         gw $$2 = bun.this.dk();
         gw.a $$3 = new gw.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bun.this.dK().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bpw {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         return bun.this.bN.l() && bun.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bun.this.bN.m();
      }

      @Override
      public void c() {
         ehi $$0 = this.h();
         if ($$0 != null) {
            bun.this.bN.a(bun.this.bN.a(gw.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ehi h() {
         ehi $$1;
         if (bun.this.gw() && !bun.this.b(bun.this.cG, 22)) {
            ehi $$0 = ehi.b(bun.this.cG);
            $$1 = $$0.d(bun.this.di()).d();
         } else {
            $$1 = bun.this.f(0.0F);
         }

         int $$3 = 8;
         ehi $$4 = btt.a(bun.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : btp.a(bun.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
