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

public class bvv extends bvu implements bkq, bwd {
   public static final float bT = 120.32113F;
   public static final int bU = asy.f(1.4959966F);
   private static final afc<Byte> cd = aff.a(bvv.class, afe.a);
   private static final afc<Integer> ce = aff.a(bvv.class, afe.b);
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
   private static final bhm ct = atw.a(20, 39);
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
   int cE = asy.a(this.ag, 20, 60);
   @Nullable
   ht cF;
   @Nullable
   ht cG;
   bvv.k cH;
   bvv.e cI;
   private bvv.f cJ;
   private int cK;

   public bvv(bjx<? extends bvv> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqe(this, 20, true);
      this.bK = new bvv.j(this);
      this.a(ebp.n, -1.0F);
      this.a(ebp.j, -1.0F);
      this.a(ebp.k, 16.0F);
      this.a(ebp.x, -1.0F);
      this.a(ebp.h, -1.0F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bvv.b(this, 1.4F, true));
      this.bO.a(1, new bvv.d());
      this.bO.a(2, new bqq(this, 1.0));
      this.bO.a(3, new bsm(this, 1.25, cnk.a(ara.S), false));
      this.cH = new bvv.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new brd(this, 1.25));
      this.bO.a(5, new bvv.i());
      this.cI = new bvv.e();
      this.bO.a(5, this.cI);
      this.cJ = new bvv.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bvv.g());
      this.bO.a(8, new bvv.l());
      this.bO.a(9, new bqy(this));
      this.bP.a(1, new bvv.h(this).a(new Class[0]));
      this.bP.a(2, new bvv.c(this));
      this.bP.a(3, new btd<>(this, true));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("HivePos", sg.a(this.gm()));
      }

      if (this.t()) {
         $$0.a("FlowerPos", sg.a(this.s()));
      }

      $$0.a("HasNectar", this.go());
      $$0.a("HasStung", this.gp());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(rt $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = sg.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = sg.b($$0.p("FlowerPos"));
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
   public boolean C(bjt $$0) {
      boolean $$1 = $$0.a(this.dM().a((bkj)this), (float)((int)this.b(blp.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bkj) {
            ((bkj)$$0).q(((bkj)$$0).eO() + 1);
            int $$2 = 0;
            if (this.dL().ai() == bhy.c) {
               $$2 = 10;
            } else if (this.dL().ai() == bhy.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bkj)$$0).b(new bjg(bji.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(aqd.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.go() && this.gx() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dL(), this.dq() - 0.3F, this.dq() + 0.3F, this.dw() - 0.3F, this.dw() + 0.3F, this.e(0.5), js.as);
         }
      }

      this.gv();
   }

   private void a(cqz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jq $$6) {
      $$0.a($$6, asy.d($$0.z.j(), $$1, $$2), $$5, asy.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ht $$0) {
      eif $$1 = eif.c($$0);
      int $$2 = 0;
      ht $$3 = this.dl();
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

      eif $$8 = buy.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ht s() {
      return this.cF;
   }

   public boolean t() {
      return this.cF != null;
   }

   public void i(ht $$0) {
      this.cF = $$0;
   }

   @aua
   public int y() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @aua
   public List<ht> ge() {
      return this.cI.f;
   }

   private boolean gt() {
      return this.cy > 3600;
   }

   boolean gu() {
      if (this.cz <= 0 && !this.cH.l() && !this.gp() && this.q() == null) {
         boolean $$0 = this.gt() || this.dL().Z() || this.dL().O() || this.go();
         return $$0 && !this.gw();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return asy.i($$0, this.cw, this.cv);
   }

   private void gv() {
      this.cw = this.cv;
      if (this.gB()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void X() {
      boolean $$0 = this.gp();
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
         if (this.cx % 5 == 0 && this.ag.a(asy.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dM().n(), this.eu());
         }
      }

      if (!this.go()) {
         this.cy++;
      }

      if (!this.dL().B) {
         this.a((alq)this.dL(), false);
      }
   }

   public void gk() {
      this.cy = 0;
   }

   private boolean gw() {
      if (this.cG == null) {
         return false;
      } else {
         ddx $$0 = this.dL().c_(this.cG);
         return $$0 instanceof ddu && ((ddu)$$0).c();
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

   private boolean k(ht $$0) {
      ddx $$1 = this.dL().c_($$0);
      return $$1 instanceof ddu ? !((ddu)$$1).f() : false;
   }

   @aua
   public boolean gl() {
      return this.cG != null;
   }

   @Nullable
   @aua
   public ht gm() {
      return this.cG;
   }

   @aua
   public brf gn() {
      return this.bO;
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   int gx() {
      return this.cA;
   }

   private void gy() {
      this.cA = 0;
   }

   void gz() {
      this.cA++;
   }

   @Override
   public void c_() {
      super.c_();
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

         boolean $$0 = this.Y_() && !this.gp() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gA()) {
            this.cG = null;
         }
      }
   }

   boolean gA() {
      if (!this.gl()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         ddx $$0 = this.dL().c_(this.cG);
         return $$0 != null && $$0.u() == ddz.H;
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

   boolean l(ht $$0) {
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

   public static blo.a gq() {
      return bkl.A().a(blp.l, 10.0).a(blp.f, 0.6F).a(blp.m, 0.3F).a(blp.c, 2.0).a(blp.g, 48.0);
   }

   @Override
   protected bts b(cqz $$0) {
      btq $$1 = new btq(this, $$0) {
         @Override
         public boolean a(ht $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bvv.this.cH.l()) {
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
   public boolean m(ckj $$0) {
      return $$0.a(ara.S);
   }

   boolean m(ht $$0) {
      return this.dL().o($$0) && this.dL().a_($$0).a(aqs.U);
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
   }

   @Override
   protected aqc w() {
      return null;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.bA;
   }

   @Override
   protected aqc m_() {
      return aqd.bz;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Nullable
   public bvv b(alq $$0, bjo $$1) {
      return bjx.h.a((cqz)$$0);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
   }

   @Override
   public boolean aR() {
      return this.gr() && this.ah % bU == 0;
   }

   @Override
   public boolean gr() {
      return !this.aA();
   }

   public void gs() {
      this.w(false);
      this.gy();
   }

   @Override
   public boolean a(bir $$0, float $$1) {
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
   public bko eR() {
      return bko.c;
   }

   @Override
   protected void c(arh<ebd> $$0) {
      this.f(this.do().b(0.0, 0.01, 0.0));
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.2F));
   }

   boolean b(ht $$0, int $$1) {
      return $$0.a(this.dl(), (double)$$1);
   }

   abstract class a extends bre {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bvv.this.Y_();
      }

      @Override
      public boolean b() {
         return this.i() && !bvv.this.Y_();
      }
   }

   class b extends bro {
      b(bks $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bvv.this.Y_() && !bvv.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && bvv.this.Y_() && !bvv.this.gp();
      }
   }

   static class c extends bsx<ccx> {
      c(bvv $$0) {
         super($$0, ccx.class, 10, true, false, $$0::a_);
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
         bvv $$0 = (bvv)this.e;
         return $$0.Y_() && !$$0.gp();
      }
   }

   class d extends bvv.a {
      @Override
      public boolean h() {
         if (bvv.this.gl() && bvv.this.gu() && bvv.this.cG.a(bvv.this.dj(), 2.0) && bvv.this.dL().c_(bvv.this.cG) instanceof ddu $$1) {
            if (!$$1.f()) {
               return true;
            }

            bvv.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bvv.this.dL().c_(bvv.this.cG) instanceof ddu $$1) {
            $$1.a(bvv.this, bvv.this.go());
         }
      }
   }

   @aua
   public class e extends bvv.a {
      public static final int b = 600;
      int d = bvv.this.dL().z.a(10);
      private static final int e = 3;
      final List<ht> f = Lists.newArrayList();
      @Nullable
      private ebt g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean h() {
         return bvv.this.cG != null && !bvv.this.fQ() && bvv.this.gu() && !this.d(bvv.this.cG) && bvv.this.dL().a_(bvv.this.cG).a(aqs.aF);
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
         bvv.this.bN.n();
         bvv.this.bN.g();
      }

      @Override
      public void e() {
         if (bvv.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bvv.this.bN.m()) {
               if (!bvv.this.b(bvv.this.cG, 16)) {
                  if (bvv.this.l(bvv.this.cG)) {
                     this.m();
                  } else {
                     bvv.this.j(bvv.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bvv.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bvv.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bvv.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(ht $$0) {
         bvv.this.bN.a(10.0F);
         bvv.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bvv.this.bN.j() != null && bvv.this.bN.j().j();
      }

      boolean b(ht $$0) {
         return this.f.contains($$0);
      }

      private void c(ht $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bvv.this.cG != null) {
            this.c(bvv.this.cG);
         }

         this.m();
      }

      private void m() {
         bvv.this.cG = null;
         bvv.this.cC = 200;
      }

      private boolean d(ht $$0) {
         if (bvv.this.b($$0, 2)) {
            return true;
         } else {
            ebt $$1 = bvv.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bvv.a {
      private static final int c = 600;
      int d = bvv.this.dL().z.a(10);

      f() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean h() {
         return bvv.this.cF != null && !bvv.this.fQ() && this.k() && bvv.this.m(bvv.this.cF) && !bvv.this.b(bvv.this.cF, 2);
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
         bvv.this.bN.n();
         bvv.this.bN.g();
      }

      @Override
      public void e() {
         if (bvv.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bvv.this.cF = null;
            } else if (!bvv.this.bN.m()) {
               if (bvv.this.l(bvv.this.cF)) {
                  bvv.this.cF = null;
               } else {
                  bvv.this.j(bvv.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bvv.this.cy > 2400;
      }
   }

   class g extends bvv.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bvv.this.gx() >= 10) {
            return false;
         } else {
            return bvv.this.ag.i() < 0.3F ? false : bvv.this.go() && bvv.this.gA();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bvv.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ht $$1 = bvv.this.dl().c($$0);
               dgb $$2 = bvv.this.dL().a_($$1);
               cua $$3 = $$2.b();
               dgb $$4 = null;
               if ($$2.a(aqs.aH)) {
                  if ($$3 instanceof cvt) {
                     cvt $$5 = (cvt)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dbu) {
                     int $$6 = $$2.c(dbu.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dbu.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cuc.oi)) {
                     int $$7 = $$2.c(dcb.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dcb.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cuc.ru) || $$2.a(cuc.rv)) {
                     ((cud)$$2.b()).a((alq)bvv.this.dL(), bvv.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bvv.this.dL().c(2005, $$1, 0);
                     bvv.this.dL().b($$1, $$4);
                     bvv.this.gz();
                  }
               }
            }
         }
      }
   }

   class h extends bsw {
      h(bvv $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bvv.this.Y_() && super.b();
      }

      @Override
      protected void a(bkl $$0, bkj $$1) {
         if ($$0 instanceof bvv && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bvv.a {
      @Override
      public boolean h() {
         return bvv.this.cC == 0 && !bvv.this.gl() && bvv.this.gu();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bvv.this.cC = 200;
         List<ht> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ht $$1 : $$0) {
               if (!bvv.this.cI.b($$1)) {
                  bvv.this.cG = $$1;
                  return;
               }
            }

            bvv.this.cI.k();
            bvv.this.cG = $$0.get(0);
         }
      }

      private List<ht> k() {
         ht $$0 = bvv.this.dl();
         bvi $$1 = ((alq)bvv.this.dL()).w();
         Stream<bvj> $$2 = $$1.c($$0x -> $$0x.a(arc.c), $$0, 20, bvi.b.c);
         return $$2.map(bvj::f).filter(bvv.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bqg {
      j(bkl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bvv.this.Y_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bvv.this.cH.l();
      }
   }

   class k extends bvv.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dgb> f = $$0 -> {
         if ($$0.b(dgr.C) && $$0.c(dgr.C)) {
            return false;
         } else if ($$0.a(aqs.U)) {
            return $$0.a(cuc.iD) ? $$0.c(cwg.b) == dgx.a : true;
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
      private eif o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean h() {
         if (bvv.this.cE > 0) {
            return false;
         } else if (bvv.this.go()) {
            return false;
         } else if (bvv.this.dL().Z()) {
            return false;
         } else {
            Optional<ht> $$0 = this.p();
            if ($$0.isPresent()) {
               bvv.this.cF = $$0.get();
               bvv.this.bN.a((double)bvv.this.cF.u() + 0.5, (double)bvv.this.cF.v() + 0.5, (double)bvv.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bvv.this.cE = asy.a(bvv.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bvv.this.t()) {
            return false;
         } else if (bvv.this.dL().Z()) {
            return false;
         } else if (this.k()) {
            return bvv.this.ag.i() < 0.2F;
         } else if (bvv.this.ah % 20 == 0 && !bvv.this.m(bvv.this.cF)) {
            bvv.this.cF = null;
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
         bvv.this.gk();
      }

      @Override
      public void d() {
         if (this.k()) {
            bvv.this.w(true);
         }

         this.n = false;
         bvv.this.bN.n();
         bvv.this.cE = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bvv.this.cF = null;
         } else {
            eif $$0 = eif.c(bvv.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bvv.this.dj()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bvv.this.dj().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bvv.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bvv.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new eif($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bvv.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bvv.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bvv.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bvv.this.a(aqd.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bvv.this.I().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bvv.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ht> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ht> a(Predicate<dgb> $$0, double $$1) {
         ht $$2 = bvv.this.dl();
         ht.a $$3 = new ht.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bvv.this.dL().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bre {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         return bvv.this.bN.l() && bvv.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bvv.this.bN.m();
      }

      @Override
      public void c() {
         eif $$0 = this.h();
         if ($$0 != null) {
            bvv.this.bN.a(bvv.this.bN.a(ht.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private eif h() {
         eif $$1;
         if (bvv.this.gA() && !bvv.this.b(bvv.this.cG, 22)) {
            eif $$0 = eif.b(bvv.this.cG);
            $$1 = $$0.d(bvv.this.dj()).d();
         } else {
            $$1 = bvv.this.f(0.0F);
         }

         int $$3 = 8;
         eif $$4 = bvb.a(bvv.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bux.a(bvv.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
