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

public class byd extends byc implements bmv, byl {
   public static final float bU = 120.32113F;
   public static final int bV = aup.f(1.4959966F);
   private static final agn<Byte> ce = agq.a(byd.class, agp.a);
   private static final agn<Integer> cf = agq.a(byd.class, agp.b);
   private static final int cg = 2;
   private static final int ch = 4;
   private static final int ci = 8;
   private static final int cj = 1200;
   private static final int ck = 2400;
   private static final int cl = 3600;
   private static final int cm = 4;
   private static final int cn = 10;
   private static final int co = 10;
   private static final int cp = 18;
   private static final int cq = 32;
   private static final int cr = 2;
   private static final int cs = 16;
   private static final int ct = 20;
   public static final String bX = "CropsGrownSincePollination";
   public static final String bY = "CannotEnterHiveTicks";
   public static final String bZ = "TicksSincePollination";
   public static final String ca = "HasStung";
   public static final String cb = "HasNectar";
   public static final String cc = "FlowerPos";
   public static final String cd = "HivePos";
   private static final bjn cu = avq.a(20, 39);
   @Nullable
   private UUID cv;
   private float cx;
   private float cy;
   private int cz;
   int cA;
   private int cB;
   private int cC;
   private static final int cD = 200;
   int cE;
   private static final int cF = 200;
   int cG = aup.a(this.ag, 20, 60);
   @Nullable
   hx cH;
   @Nullable
   hx cI;
   byd.k cJ;
   byd.e cK;
   private byd.f cL;
   private int cM;

   public byd(bmc<? extends byd> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsk(this, 20, true);
      this.bL = new byd.j(this);
      this.a(efk.n, -1.0F);
      this.a(efk.j, -1.0F);
      this.a(efk.k, 16.0F);
      this.a(efk.x, -1.0F);
      this.a(efk.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ce, (byte)0);
      this.an.a(cf, 0);
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bP.a(0, new byd.b(this, 1.4F, true));
      this.bP.a(1, new byd.d());
      this.bP.a(2, new bsw(this, 1.0));
      this.bP.a(3, new bus(this, 1.25, cqh.a(asq.S), false));
      this.cJ = new byd.k();
      this.bP.a(4, this.cJ);
      this.bP.a(5, new btj(this, 1.25));
      this.bP.a(5, new byd.i());
      this.cK = new byd.e();
      this.bP.a(5, this.cK);
      this.cL = new byd.f();
      this.bP.a(6, this.cL);
      this.bP.a(7, new byd.g());
      this.bP.a(8, new byd.l());
      this.bP.a(9, new bte(this));
      this.bQ.a(1, new byd.h(this).a(new Class[0]));
      this.bQ.a(2, new byd.c(this));
      this.bQ.a(3, new bvj<>(this, true));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("HivePos", td.a(this.gn()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", td.a(this.u()));
      }

      $$0.a("HasNectar", this.gp());
      $$0.a("HasStung", this.gq());
      $$0.a("TicksSincePollination", this.cA);
      $$0.a("CannotEnterHiveTicks", this.cB);
      $$0.a("CropsGrownSincePollination", this.cC);
      this.c($$0);
   }

   @Override
   public void a(so $$0) {
      this.cI = null;
      if ($$0.e("HivePos")) {
         this.cI = td.b($$0.p("HivePos"));
      }

      this.cH = null;
      if ($$0.e("FlowerPos")) {
         this.cH = td.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cA = $$0.h("TicksSincePollination");
      this.cB = $$0.h("CannotEnterHiveTicks");
      this.cC = $$0.h("CropsGrownSincePollination");
      this.a(this.dL(), $$0);
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = $$0.a(this.dM().a((bmo)this), (float)((int)this.g(bnu.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bmo) {
            ((bmo)$$0).q(((bmo)$$0).eP() + 1);
            int $$2 = 0;
            if (this.dL().ak() == bjz.c) {
               $$2 = 10;
            } else if (this.dL().ak() == bjz.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bmo)$$0).b(new blj(bll.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(art.bP, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gp() && this.gy() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dL(), this.dq() - 0.3F, this.dq() + 0.3F, this.dw() - 0.3F, this.dw() + 0.3F, this.e(0.5), jx.av);
         }
      }

      this.gw();
   }

   private void a(ctx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jv $$6) {
      $$0.a($$6, aup.d($$0.z.j(), $$1, $$2), $$5, aup.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hx $$0) {
      emc $$1 = emc.c($$0);
      int $$2 = 0;
      hx $$3 = this.dl();
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

      emc $$8 = bxg.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bO.a(0.5F);
         this.bO.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public hx u() {
      return this.cH;
   }

   public boolean w() {
      return this.cH != null;
   }

   public void i(hx $$0) {
      this.cH = $$0;
   }

   @avu
   public int A() {
      return Math.max(this.cK.d, this.cL.d);
   }

   @avu
   public List<hx> gf() {
      return this.cK.f;
   }

   private boolean gu() {
      return this.cA > 3600;
   }

   boolean gv() {
      if (this.cB <= 0 && !this.cJ.l() && !this.gq() && this.q() == null) {
         boolean $$0 = this.gu() || this.dL().ab() || this.dL().Q() || this.gp();
         return $$0 && !this.gx();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cB = $$0;
   }

   public float D(float $$0) {
      return aup.i($$0, this.cy, this.cx);
   }

   private void gw() {
      this.cy = this.cx;
      if (this.gC()) {
         this.cx = Math.min(1.0F, this.cx + 0.2F);
      } else {
         this.cx = Math.max(0.0F, this.cx - 0.24F);
      }
   }

   @Override
   protected void aa() {
      boolean $$0 = this.gq();
      if (this.bc()) {
         this.cM++;
      } else {
         this.cM = 0;
      }

      if (this.cM > 20) {
         this.a(this.dM().h(), 1.0F);
      }

      if ($$0) {
         this.cz++;
         if (this.cz % 5 == 0 && this.ag.a(aup.a(1200 - this.cz, 1, 1200)) == 0) {
            this.a(this.dM().n(), this.ev());
         }
      }

      if (!this.gp()) {
         this.cA++;
      }

      if (!this.dL().B) {
         this.a((ane)this.dL(), false);
      }
   }

   public void gl() {
      this.cA = 0;
   }

   private boolean gx() {
      if (this.cI == null) {
         return false;
      } else {
         dhd $$0 = this.dL().c_(this.cI);
         return $$0 instanceof dha && ((dha)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.an.b(cf);
   }

   @Override
   public void a(int $$0) {
      this.an.b(cf, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cv;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cv = $$0;
   }

   @Override
   public void c() {
      this.a(cu.a(this.ag));
   }

   private boolean k(hx $$0) {
      dhd $$1 = this.dL().c_($$0);
      return $$1 instanceof dha ? !((dha)$$1).f() : false;
   }

   @avu
   public boolean gm() {
      return this.cI != null;
   }

   @Nullable
   @avu
   public hx gn() {
      return this.cI;
   }

   @avu
   public btl go() {
      return this.bP;
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   int gy() {
      return this.cC;
   }

   private void gz() {
      this.cC = 0;
   }

   void gA() {
      this.cC++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B) {
         if (this.cB > 0) {
            this.cB--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         if (this.cG > 0) {
            this.cG--;
         }

         boolean $$0 = this.aa_() && !this.gq() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gB()) {
            this.cI = null;
         }
      }
   }

   boolean gB() {
      if (!this.gm()) {
         return false;
      } else if (this.l(this.cI)) {
         return false;
      } else {
         dhd $$0 = this.dL().c_(this.cI);
         return $$0 != null && $$0.v() == dhf.H;
      }
   }

   public boolean gp() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gl();
      }

      this.d(8, $$0);
   }

   public boolean gq() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gC() {
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
         this.an.b(ce, (byte)(this.an.b(ce) | $$0));
      } else {
         this.an.b(ce, (byte)(this.an.b(ce) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.b(ce) & $$0) != 0;
   }

   public static bnt.a gr() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.h, 0.6F).a(bnu.o, 0.3F).a(bnu.c, 2.0).a(bnu.i, 48.0);
   }

   @Override
   protected bvy b(ctx $$0) {
      bvw $$1 = new bvw(this, $$0) {
         @Override
         public boolean a(hx $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!byd.this.cJ.l()) {
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
   public boolean m(cng $$0) {
      return $$0.a(asq.S);
   }

   boolean m(hx $$0) {
      return this.dL().p($$0) && this.dL().a_($$0).a(asi.U);
   }

   @Override
   protected void b(hx $$0, djp $$1) {
   }

   @Override
   protected ars y() {
      return null;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.bM;
   }

   @Override
   protected ars n_() {
      return art.bL;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Nullable
   public byd b(ane $$0, blr $$1) {
      return bmc.i.a((ctx)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
   }

   @Override
   public boolean aT() {
      return this.gs() && this.ah % bV == 0;
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   public void gt() {
      this.w(false);
      this.gz();
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.cJ.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bmt eS() {
      return bmt.c;
   }

   @Override
   protected void c(asx<eey> $$0) {
      this.g(this.do().b(0.0, 0.01, 0.0));
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(hx $$0, int $$1) {
      return $$0.a(this.dl(), (double)$$1);
   }

   abstract class a extends btk {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !byd.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !byd.this.aa_();
      }
   }

   class b extends btu {
      b(bmx $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && byd.this.aa_() && !byd.this.gq();
      }

      @Override
      public boolean b() {
         return super.b() && byd.this.aa_() && !byd.this.gq();
      }
   }

   static class c extends bvd<cfq> {
      c(byd $$0) {
         super($$0, cfq.class, 10, true, false, $$0::a_);
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
         byd $$0 = (byd)this.e;
         return $$0.aa_() && !$$0.gq();
      }
   }

   class d extends byd.a {
      @Override
      public boolean h() {
         if (byd.this.gm() && byd.this.gv() && byd.this.cI.a(byd.this.dj(), 2.0) && byd.this.dL().c_(byd.this.cI) instanceof dha $$1) {
            if (!$$1.f()) {
               return true;
            }

            byd.this.cI = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (byd.this.dL().c_(byd.this.cI) instanceof dha $$1) {
            $$1.a(byd.this, byd.this.gp());
         }
      }
   }

   @avu
   public class e extends byd.a {
      public static final int b = 600;
      int d = byd.this.dL().z.a(10);
      private static final int e = 3;
      final List<hx> f = Lists.newArrayList();
      @Nullable
      private efo g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean h() {
         return byd.this.cI != null && !byd.this.fR() && byd.this.gv() && !this.d(byd.this.cI) && byd.this.dL().a_(byd.this.cI).a(asi.aF);
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
         byd.this.bO.n();
         byd.this.bO.g();
      }

      @Override
      public void e() {
         if (byd.this.cI != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!byd.this.bO.m()) {
               if (!byd.this.b(byd.this.cI, 16)) {
                  if (byd.this.l(byd.this.cI)) {
                     this.m();
                  } else {
                     byd.this.j(byd.this.cI);
                  }
               } else {
                  boolean $$0 = this.a(byd.this.cI);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && byd.this.bO.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = byd.this.bO.j();
                  }
               }
            }
         }
      }

      private boolean a(hx $$0) {
         byd.this.bO.a(10.0F);
         byd.this.bO.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return byd.this.bO.j() != null && byd.this.bO.j().j();
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
         if (byd.this.cI != null) {
            this.c(byd.this.cI);
         }

         this.m();
      }

      private void m() {
         byd.this.cI = null;
         byd.this.cE = 200;
      }

      private boolean d(hx $$0) {
         if (byd.this.b($$0, 2)) {
            return true;
         } else {
            efo $$1 = byd.this.bO.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends byd.a {
      private static final int c = 600;
      int d = byd.this.dL().z.a(10);

      f() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean h() {
         return byd.this.cH != null && !byd.this.fR() && this.k() && byd.this.m(byd.this.cH) && !byd.this.b(byd.this.cH, 2);
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
         byd.this.bO.n();
         byd.this.bO.g();
      }

      @Override
      public void e() {
         if (byd.this.cH != null) {
            this.d++;
            if (this.d > this.a(600)) {
               byd.this.cH = null;
            } else if (!byd.this.bO.m()) {
               if (byd.this.l(byd.this.cH)) {
                  byd.this.cH = null;
               } else {
                  byd.this.j(byd.this.cH);
               }
            }
         }
      }

      private boolean k() {
         return byd.this.cA > 2400;
      }
   }

   class g extends byd.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (byd.this.gy() >= 10) {
            return false;
         } else {
            return byd.this.ag.i() < 0.3F ? false : byd.this.gp() && byd.this.gB();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (byd.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hx $$1 = byd.this.dl().c($$0);
               djp $$2 = byd.this.dL().a_($$1);
               cwy $$3 = $$2.b();
               djp $$4 = null;
               if ($$2.a(asi.aH)) {
                  if ($$3 instanceof cyt) {
                     cyt $$5 = (cyt)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof det) {
                     int $$6 = $$2.c(det.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(det.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cxa.oi)) {
                     int $$7 = $$2.c(dfa.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dfa.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cxa.sv) || $$2.a(cxa.sw)) {
                     ((cxb)$$2.b()).a((ane)byd.this.dL(), byd.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     byd.this.dL().c(2011, $$1, 15);
                     byd.this.dL().b($$1, $$4);
                     byd.this.gA();
                  }
               }
            }
         }
      }
   }

   class h extends bvc {
      h(byd $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return byd.this.aa_() && super.b();
      }

      @Override
      protected void a(bmq $$0, bmo $$1) {
         if ($$0 instanceof byd && this.e.D($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends byd.a {
      @Override
      public boolean h() {
         return byd.this.cE == 0 && !byd.this.gm() && byd.this.gv();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         byd.this.cE = 200;
         List<hx> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hx $$1 : $$0) {
               if (!byd.this.cK.b($$1)) {
                  byd.this.cI = $$1;
                  return;
               }
            }

            byd.this.cK.k();
            byd.this.cI = $$0.get(0);
         }
      }

      private List<hx> k() {
         hx $$0 = byd.this.dl();
         bxq $$1 = ((ane)byd.this.dL()).y();
         Stream<bxr> $$2 = $$1.c($$0x -> $$0x.a(ass.c), $$0, 20, bxq.b.c);
         return $$2.map(bxr::f).filter(byd.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bsm {
      j(bmq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!byd.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !byd.this.cJ.l();
      }
   }

   class k extends byd.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<djp> f = $$0 -> {
         if ($$0.b(dkf.C) && $$0.c(dkf.C)) {
            return false;
         } else if ($$0.a(asi.U)) {
            return $$0.a(cxa.iD) ? $$0.c(czg.b) == dkl.a : true;
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
      private emc o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean h() {
         if (byd.this.cG > 0) {
            return false;
         } else if (byd.this.gp()) {
            return false;
         } else if (byd.this.dL().ab()) {
            return false;
         } else {
            Optional<hx> $$0 = this.p();
            if ($$0.isPresent()) {
               byd.this.cH = $$0.get();
               byd.this.bO.a((double)byd.this.cH.u() + 0.5, (double)byd.this.cH.v() + 0.5, (double)byd.this.cH.w() + 0.5, 1.2F);
               return true;
            } else {
               byd.this.cG = aup.a(byd.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!byd.this.w()) {
            return false;
         } else if (byd.this.dL().ab()) {
            return false;
         } else if (this.k()) {
            return byd.this.ag.i() < 0.2F;
         } else if (byd.this.ah % 20 == 0 && !byd.this.m(byd.this.cH)) {
            byd.this.cH = null;
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
         byd.this.gl();
      }

      @Override
      public void d() {
         if (this.k()) {
            byd.this.w(true);
         }

         this.n = false;
         byd.this.bO.n();
         byd.this.cG = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            byd.this.cH = null;
         } else {
            emc $$0 = emc.c(byd.this.cH).b(0.0, 0.6F, 0.0);
            if ($$0.f(byd.this.dj()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = byd.this.dj().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  byd.this.cH = null;
               } else {
                  if ($$1) {
                     boolean $$3 = byd.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new emc($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        byd.this.bO.n();
                     } else {
                        $$2 = false;
                     }

                     byd.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (byd.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     byd.this.a(art.bQ, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         byd.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (byd.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hx> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hx> a(Predicate<djp> $$0, double $$1) {
         hx $$2 = byd.this.dl();
         hx.a $$3 = new hx.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(byd.this.dL().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends btk {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         return byd.this.bO.l() && byd.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return byd.this.bO.m();
      }

      @Override
      public void c() {
         emc $$0 = this.h();
         if ($$0 != null) {
            byd.this.bO.a(byd.this.bO.a(hx.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private emc h() {
         emc $$1;
         if (byd.this.gB() && !byd.this.b(byd.this.cI, 22)) {
            emc $$0 = emc.b(byd.this.cI);
            $$1 = $$0.d(byd.this.dj()).d();
         } else {
            $$1 = byd.this.f(0.0F);
         }

         int $$3 = 8;
         emc $$4 = bxj.a(byd.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bxf.a(byd.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
