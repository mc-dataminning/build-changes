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

public class cce extends ccd implements bqu, ccm {
   public static final float bX = 120.32113F;
   public static final int bY = axk.f(1.4959966F);
   private static final aiy<Byte> ch = ajc.a(cce.class, aja.a);
   private static final aiy<Integer> ci = ajc.a(cce.class, aja.b);
   private static final int cj = 2;
   private static final int ck = 4;
   private static final int cl = 8;
   private static final int cm = 1200;
   private static final int cn = 2400;
   private static final int co = 3600;
   private static final int cp = 4;
   private static final int cq = 10;
   private static final int cr = 10;
   private static final int cs = 18;
   private static final int ct = 32;
   private static final int cu = 2;
   private static final int cv = 16;
   private static final int cw = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cb = "CannotEnterHiveTicks";
   public static final String cc = "TicksSincePollination";
   public static final String cd = "HasStung";
   public static final String ce = "HasNectar";
   public static final String cf = "flower_pos";
   public static final String cg = "hive_pos";
   private static final bnl cx = ayj.a(20, 39);
   @Nullable
   private UUID cz;
   private float cA;
   private float cB;
   private int cC;
   int cD;
   private int cE;
   private int cF;
   private static final int cG = 200;
   int cH;
   private static final int cI = 200;
   int cJ = axk.a(this.ag, 20, 60);
   @Nullable
   ib cK;
   @Nullable
   ib cL;
   cce.k cM;
   cce.e cN;
   private cce.f cO;
   private int cP;

   public cce(bqb<? extends cce> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new bwl(this, 20, true);
      this.bN = new cce.j(this);
      this.a(elj.n, -1.0F);
      this.a(elj.j, -1.0F);
      this.a(elj.k, 16.0F);
      this.a(elj.x, -1.0F);
      this.a(elj.h, -1.0F);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, 0);
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bR.a(0, new cce.b(this, 1.4F, true));
      this.bR.a(1, new cce.d());
      this.bR.a(2, new bwx(this, 1.0));
      this.bR.a(3, new byt(this, 1.25, cvg.a(avk.S), false));
      this.cM = new cce.k();
      this.bR.a(4, this.cM);
      this.bR.a(5, new bxk(this, 1.25));
      this.bR.a(5, new cce.i());
      this.cN = new cce.e();
      this.bR.a(5, this.cN);
      this.cO = new cce.f();
      this.bR.a(6, this.cO);
      this.bR.a(7, new cce.g());
      this.bR.a(8, new cce.l());
      this.bR.a(9, new bxf(this));
      this.bS.a(1, new cce.h(this).a(new Class[0]));
      this.bS.a(2, new cce.c(this));
      this.bS.a(3, new bzk<>(this, true));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", ub.a(this.gv()));
      }

      if (this.u()) {
         $$0.a("flower_pos", ub.a(this.r()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cD);
      $$0.a("CannotEnterHiveTicks", this.cE);
      $$0.a("CropsGrownSincePollination", this.cF);
      this.c($$0);
   }

   @Override
   public void a(tm $$0) {
      this.cL = ub.a($$0, "hive_pos").orElse(null);
      this.cK = ub.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cD = $$0.h("TicksSincePollination");
      this.cE = $$0.h("CannotEnterHiveTicks");
      this.cF = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = $$0.a(this.dN().a((bqo)this), (float)((int)this.g(brv.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bqo) {
            ((bqo)$$0).r(((bqo)$$0).eR() + 1);
            int $$2 = 0;
            if (this.dM().ak() == bnx.c) {
               $$2 = 10;
            } else if (this.dM().ak() == bnx.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bqo)$$0).b(new bph(bpj.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(aum.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), kl.aw);
         }
      }

      this.gE();
   }

   private void a(cyx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, kj $$6) {
      $$0.a($$6, axk.d($$0.z.j(), $$1, $$2), $$5, axk.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(ib $$0) {
      esa $$1 = esa.c($$0);
      int $$2 = 0;
      ib $$3 = this.dm();
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

      esa $$8 = cbh.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bQ.a(0.5F);
         this.bQ.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ib r() {
      return this.cK;
   }

   public boolean u() {
      return this.cK != null;
   }

   public void i(ib $$0) {
      this.cK = $$0;
   }

   @ayn
   public int y() {
      return Math.max(this.cN.d, this.cO.d);
   }

   @ayn
   public List<ib> gn() {
      return this.cN.f;
   }

   private boolean gC() {
      return this.cD > 3600;
   }

   boolean gD() {
      if (this.cE <= 0 && !this.cM.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dM().ac() || this.dM().R() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cE = $$0;
   }

   public float G(float $$0) {
      return axk.i($$0, this.cB, this.cA);
   }

   private void gE() {
      this.cB = this.cA;
      if (this.gK()) {
         this.cA = Math.min(1.0F, this.cA + 0.2F);
      } else {
         this.cA = Math.max(0.0F, this.cA - 0.24F);
      }
   }

   @Override
   protected void Y() {
      boolean $$0 = this.gy();
      if (this.bf()) {
         this.cP++;
      } else {
         this.cP = 0;
      }

      if (this.cP > 20) {
         this.a(this.dN().h(), 1.0F);
      }

      if ($$0) {
         this.cC++;
         if (this.cC % 5 == 0 && this.ag.a(axk.a(1200 - this.cC, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ex());
         }
      }

      if (!this.gx()) {
         this.cD++;
      }

      if (!this.dM().B) {
         this.a((aps)this.dM(), false);
      }
   }

   public void gt() {
      this.cD = 0;
   }

   private boolean gF() {
      if (this.cL == null) {
         return false;
      } else {
         dmf $$0 = this.dM().c_(this.cL);
         return $$0 instanceof dmc && ((dmc)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.an.a(ci);
   }

   @Override
   public void a(int $$0) {
      this.an.a(ci, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cz;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cz = $$0;
   }

   @Override
   public void c() {
      this.a(cx.a(this.ag));
   }

   private boolean l(ib $$0) {
      dmf $$1 = this.dM().c_($$0);
      return $$1 instanceof dmc ? !((dmc)$$1).d() : false;
   }

   @ayn
   public boolean gu() {
      return this.cL != null;
   }

   @Nullable
   @ayn
   public ib gv() {
      return this.cL;
   }

   @ayn
   public bxm gw() {
      return this.bR;
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   int gG() {
      return this.cF;
   }

   private void gH() {
      this.cF = 0;
   }

   void gI() {
      this.cF++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         if (this.cE > 0) {
            this.cE--;
         }

         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cJ > 0) {
            this.cJ--;
         }

         boolean $$0 = this.Y_() && !this.gy() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gJ()) {
            this.cL = null;
         }
      }
   }

   boolean gJ() {
      if (!this.gu()) {
         return false;
      } else if (this.m(this.cL)) {
         return false;
      } else {
         dmf $$0 = this.dM().c_(this.cL);
         return $$0 != null && $$0.r() == dmh.H;
      }
   }

   public boolean gx() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gy() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gK() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(ib $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.a(ch, (byte)(this.an.a(ch) | $$0));
      } else {
         this.an.a(ch, (byte)(this.an.a(ch) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.an.a(ch) & $$0) != 0;
   }

   public static bru.a gz() {
      return bqq.A().a(brv.q, 10.0).a(brv.j, 0.6F).a(brv.r, 0.3F).a(brv.c, 2.0).a(brv.k, 48.0);
   }

   @Override
   protected bzz b(cyx $$0) {
      bzx $$1 = new bzx(this, $$0) {
         @Override
         public boolean a(ib $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cce.this.cM.l()) {
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
   public boolean o(crj $$0) {
      return $$0.a(avk.S);
   }

   boolean n(ib $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(avc.U);
   }

   @Override
   protected void b(ib $$0, doz $$1) {
   }

   @Override
   protected aul v() {
      return null;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.bP;
   }

   @Override
   protected aul o_() {
      return aum.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public cce b(aps $$0, bpp $$1) {
      return bqb.h.a((cyx)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
   }

   @Override
   public boolean aT() {
      return this.gA() && this.ah % bY == 0;
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   public void gB() {
      this.w(false);
      this.gH();
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.cM.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(avr<ekr> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(ib $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   public void j(ib $$0) {
      this.cL = $$0;
   }

   abstract class a extends bxl {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cce.this.Y_();
      }

      @Override
      public boolean b() {
         return this.i() && !cce.this.Y_();
      }
   }

   class b extends bxv {
      b(bqw $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cce.this.Y_() && !cce.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && cce.this.Y_() && !cce.this.gy();
      }
   }

   static class c extends bze<cjt> {
      c(cce $$0) {
         super($$0, cjt.class, 10, true, false, $$0::a_);
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
         cce $$0 = (cce)this.e;
         return $$0.Y_() && !$$0.gy();
      }
   }

   class d extends cce.a {
      @Override
      public boolean h() {
         if (cce.this.gu() && cce.this.gD() && cce.this.cL.a(cce.this.dk(), 2.0) && cce.this.dM().c_(cce.this.cL) instanceof dmc $$1) {
            if (!$$1.d()) {
               return true;
            }

            cce.this.cL = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cce.this.dM().c_(cce.this.cL) instanceof dmc $$1) {
            $$1.a(cce.this);
         }
      }
   }

   @ayn
   public class e extends cce.a {
      public static final int b = 600;
      int d = cce.this.dM().z.a(10);
      private static final int e = 3;
      final List<ib> f = Lists.newArrayList();
      @Nullable
      private elg g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean h() {
         return cce.this.cL != null && !cce.this.fZ() && cce.this.gD() && !this.d(cce.this.cL) && cce.this.dM().a_(cce.this.cL).a(avc.aG);
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
         cce.this.bQ.n();
         cce.this.bQ.g();
      }

      @Override
      public void e() {
         if (cce.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cce.this.bQ.m()) {
               if (!cce.this.b(cce.this.cL, 16)) {
                  if (cce.this.m(cce.this.cL)) {
                     this.m();
                  } else {
                     cce.this.k(cce.this.cL);
                  }
               } else {
                  boolean $$0 = this.a(cce.this.cL);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cce.this.bQ.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cce.this.bQ.j();
                  }
               }
            }
         }
      }

      private boolean a(ib $$0) {
         cce.this.bQ.a(10.0F);
         cce.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return cce.this.bQ.j() != null && cce.this.bQ.j().j();
      }

      boolean b(ib $$0) {
         return this.f.contains($$0);
      }

      private void c(ib $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cce.this.cL != null) {
            this.c(cce.this.cL);
         }

         this.m();
      }

      private void m() {
         cce.this.cL = null;
         cce.this.cH = 200;
      }

      private boolean d(ib $$0) {
         if (cce.this.b($$0, 2)) {
            return true;
         } else {
            elg $$1 = cce.this.bQ.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cce.a {
      private static final int c = 600;
      int d = cce.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean h() {
         return cce.this.cK != null && !cce.this.fZ() && this.k() && cce.this.n(cce.this.cK) && !cce.this.b(cce.this.cK, 2);
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
         cce.this.bQ.n();
         cce.this.bQ.g();
      }

      @Override
      public void e() {
         if (cce.this.cK != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cce.this.cK = null;
            } else if (!cce.this.bQ.m()) {
               if (cce.this.m(cce.this.cK)) {
                  cce.this.cK = null;
               } else {
                  cce.this.k(cce.this.cK);
               }
            }
         }
      }

      private boolean k() {
         return cce.this.cD > 2400;
      }
   }

   class g extends cce.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cce.this.gG() >= 10) {
            return false;
         } else {
            return cce.this.ag.i() < 0.3F ? false : cce.this.gx() && cce.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cce.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ib $$1 = cce.this.dm().c($$0);
               doz $$2 = cce.this.dM().a_($$1);
               dby $$3 = $$2.b();
               doz $$4 = null;
               if ($$2.a(avc.aI)) {
                  if ($$3 instanceof ddt) {
                     ddt $$5 = (ddt)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof djt) {
                     int $$6 = $$2.c(djt.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(djt.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dca.oi)) {
                     int $$7 = $$2.c(dka.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dka.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dca.sv) || $$2.a(dca.sw)) {
                     ((dcb)$$2.b()).a((aps)cce.this.dM(), cce.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cce.this.dM().c(2011, $$1, 15);
                     cce.this.dM().b($$1, $$4);
                     cce.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends bzd {
      h(cce $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cce.this.Y_() && super.b();
      }

      @Override
      protected void a(bqq $$0, bqo $$1) {
         if ($$0 instanceof cce && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cce.a {
      @Override
      public boolean h() {
         return cce.this.cH == 0 && !cce.this.gu() && cce.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cce.this.cH = 200;
         List<ib> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ib $$1 : $$0) {
               if (!cce.this.cN.b($$1)) {
                  cce.this.cL = $$1;
                  return;
               }
            }

            cce.this.cN.k();
            cce.this.cL = $$0.get(0);
         }
      }

      private List<ib> k() {
         ib $$0 = cce.this.dm();
         cbr $$1 = ((aps)cce.this.dM()).y();
         Stream<cbs> $$2 = $$1.c($$0x -> $$0x.a(avm.c), $$0, 20, cbr.b.c);
         return $$2.map(cbs::f).filter(cce.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bwn {
      j(bqq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cce.this.Y_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cce.this.cM.l();
      }
   }

   class k extends cce.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<doz> f = $$0 -> {
         if ($$0.b(dpp.C) && $$0.c(dpp.C)) {
            return false;
         } else if ($$0.a(avc.U)) {
            return $$0.a(dca.iD) ? $$0.c(deg.b) == dpv.a : true;
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
      private esa o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean h() {
         if (cce.this.cJ > 0) {
            return false;
         } else if (cce.this.gx()) {
            return false;
         } else if (cce.this.dM().ac()) {
            return false;
         } else {
            Optional<ib> $$0 = this.p();
            if ($$0.isPresent()) {
               cce.this.cK = $$0.get();
               cce.this.bQ.a((double)cce.this.cK.u() + 0.5, (double)cce.this.cK.v() + 0.5, (double)cce.this.cK.w() + 0.5, 1.2F);
               return true;
            } else {
               cce.this.cJ = axk.a(cce.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cce.this.u()) {
            return false;
         } else if (cce.this.dM().ac()) {
            return false;
         } else if (this.k()) {
            return cce.this.ag.i() < 0.2F;
         } else if (cce.this.ah % 20 == 0 && !cce.this.n(cce.this.cK)) {
            cce.this.cK = null;
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
         cce.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            cce.this.w(true);
         }

         this.n = false;
         cce.this.bQ.n();
         cce.this.cJ = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cce.this.cK = null;
         } else {
            esa $$0 = esa.c(cce.this.cK).b(0.0, 0.6F, 0.0);
            if ($$0.f(cce.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cce.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cce.this.cK = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cce.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new esa($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cce.this.bQ.n();
                     } else {
                        $$2 = false;
                     }

                     cce.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cce.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cce.this.a(aum.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cce.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cce.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ib> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ib> a(Predicate<doz> $$0, double $$1) {
         ib $$2 = cce.this.dm();
         ib.a $$3 = new ib.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cce.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bxl {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         return cce.this.bQ.l() && cce.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cce.this.bQ.m();
      }

      @Override
      public void c() {
         esa $$0 = this.h();
         if ($$0 != null) {
            cce.this.bQ.a(cce.this.bQ.a(ib.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private esa h() {
         esa $$1;
         if (cce.this.gJ() && !cce.this.b(cce.this.cL, 22)) {
            esa $$0 = esa.b(cce.this.cL);
            $$1 = $$0.d(cce.this.dk()).d();
         } else {
            $$1 = cce.this.f(0.0F);
         }

         int $$3 = 8;
         esa $$4 = cbk.a(cce.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cbg.a(cce.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
