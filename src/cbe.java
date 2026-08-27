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

public class cbe extends cbd implements bpu, cbm {
   public static final float bX = 120.32113F;
   public static final int bY = aww.f(1.4959966F);
   private static final aim<Byte> ch = aiq.a(cbe.class, aio.a);
   private static final aim<Integer> ci = aiq.a(cbe.class, aio.b);
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
   private static final bmn cx = axv.a(20, 39);
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
   int cJ = aww.a(this.ag, 20, 60);
   @Nullable
   ib cK;
   @Nullable
   ib cL;
   cbe.k cM;
   cbe.e cN;
   private cbe.f cO;
   private int cP;

   public cbe(bpc<? extends cbe> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new bvl(this, 20, true);
      this.bN = new cbe.j(this);
      this.a(eiy.n, -1.0F);
      this.a(eiy.j, -1.0F);
      this.a(eiy.k, 16.0F);
      this.a(eiy.x, -1.0F);
      this.a(eiy.h, -1.0F);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, 0);
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bR.a(0, new cbe.b(this, 1.4F, true));
      this.bR.a(1, new cbe.d());
      this.bR.a(2, new bvx(this, 1.0));
      this.bR.a(3, new bxt(this, 1.25, ctk.a(auv.S), false));
      this.cM = new cbe.k();
      this.bR.a(4, this.cM);
      this.bR.a(5, new bwk(this, 1.25));
      this.bR.a(5, new cbe.i());
      this.cN = new cbe.e();
      this.bR.a(5, this.cN);
      this.cO = new cbe.f();
      this.bR.a(6, this.cO);
      this.bR.a(7, new cbe.g());
      this.bR.a(8, new cbe.l());
      this.bR.a(9, new bwf(this));
      this.bS.a(1, new cbe.h(this).a(new Class[0]));
      this.bS.a(2, new cbe.c(this));
      this.bS.a(3, new byk<>(this, true));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", tp.a(this.gv()));
      }

      if (this.s()) {
         $$0.a("flower_pos", tp.a(this.r()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cD);
      $$0.a("CannotEnterHiveTicks", this.cE);
      $$0.a("CropsGrownSincePollination", this.cF);
      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      this.cL = tp.a($$0, "hive_pos").orElse(null);
      this.cK = tp.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cD = $$0.h("TicksSincePollination");
      this.cE = $$0.h("CannotEnterHiveTicks");
      this.cF = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = $$0.a(this.dN().a((bpo)this), (float)((int)this.g(bqv.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bpo) {
            ((bpo)$$0).r(((bpo)$$0).eR() + 1);
            int $$2 = 0;
            if (this.dM().aj() == bmz.c) {
               $$2 = 10;
            } else if (this.dM().aj() == bmz.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bpo)$$0).b(new boj(bol.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(aty.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), kc.aw);
         }
      }

      this.gE();
   }

   private void a(cwz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ka $$6) {
      $$0.a($$6, aww.d($$0.z.j(), $$1, $$2), $$5, aww.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ib $$0) {
      epr $$1 = epr.c($$0);
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

      epr $$8 = cah.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bQ.a(0.5F);
         this.bQ.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ib r() {
      return this.cK;
   }

   public boolean s() {
      return this.cK != null;
   }

   public void i(ib $$0) {
      this.cK = $$0;
   }

   @axz
   public int y() {
      return Math.max(this.cN.d, this.cO.d);
   }

   @axz
   public List<ib> gn() {
      return this.cN.f;
   }

   private boolean gC() {
      return this.cD > 3600;
   }

   boolean gD() {
      if (this.cE <= 0 && !this.cM.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dM().ab() || this.dM().Q() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cE = $$0;
   }

   public float G(float $$0) {
      return aww.i($$0, this.cB, this.cA);
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
         if (this.cC % 5 == 0 && this.ag.a(aww.a(1200 - this.cC, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ex());
         }
      }

      if (!this.gx()) {
         this.cD++;
      }

      if (!this.dM().B) {
         this.a((apf)this.dM(), false);
      }
   }

   public void gt() {
      this.cD = 0;
   }

   private boolean gF() {
      if (this.cL == null) {
         return false;
      } else {
         dkg $$0 = this.dM().c_(this.cL);
         return $$0 instanceof dkd && ((dkd)$$0).b();
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

   private boolean k(ib $$0) {
      dkg $$1 = this.dM().c_($$0);
      return $$1 instanceof dkd ? !((dkd)$$1).d() : false;
   }

   @axz
   public boolean gu() {
      return this.cL != null;
   }

   @Nullable
   @axz
   public ib gv() {
      return this.cL;
   }

   @axz
   public bwm gw() {
      return this.bR;
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
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
   public void m_() {
      super.m_();
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
      } else if (this.l(this.cL)) {
         return false;
      } else {
         dkg $$0 = this.dM().c_(this.cL);
         return $$0 != null && $$0.r() == dki.H;
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

   boolean l(ib $$0) {
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

   public static bqu.a gz() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.j, 0.6F).a(bqv.r, 0.3F).a(bqv.c, 2.0).a(bqv.k, 48.0);
   }

   @Override
   protected byz b(cwz $$0) {
      byx $$1 = new byx(this, $$0) {
         @Override
         public boolean a(ib $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cbe.this.cM.l()) {
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
   public boolean o(cqk $$0) {
      return $$0.a(auv.S);
   }

   boolean m(ib $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(aun.U);
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
   }

   @Override
   protected atx v() {
      return null;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.bP;
   }

   @Override
   protected atx n_() {
      return aty.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public cbe b(apf $$0, bor $$1) {
      return bpc.i.a((cwz)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dmz $$2, ib $$3) {
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
   public boolean a(bnv $$0, float $$1) {
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
   protected void c(avd<eim> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(ib $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bwl {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cbe.this.Y_();
      }

      @Override
      public boolean b() {
         return this.i() && !cbe.this.Y_();
      }
   }

   class b extends bwv {
      b(bpw $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cbe.this.Y_() && !cbe.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && cbe.this.Y_() && !cbe.this.gy();
      }
   }

   static class c extends bye<cis> {
      c(cbe $$0) {
         super($$0, cis.class, 10, true, false, $$0::a_);
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
         cbe $$0 = (cbe)this.e;
         return $$0.Y_() && !$$0.gy();
      }
   }

   class d extends cbe.a {
      @Override
      public boolean h() {
         if (cbe.this.gu() && cbe.this.gD() && cbe.this.cL.a(cbe.this.dk(), 2.0) && cbe.this.dM().c_(cbe.this.cL) instanceof dkd $$1) {
            if (!$$1.d()) {
               return true;
            }

            cbe.this.cL = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cbe.this.dM().c_(cbe.this.cL) instanceof dkd $$1) {
            $$1.a(cbe.this, cbe.this.gx());
         }
      }
   }

   @axz
   public class e extends cbe.a {
      public static final int b = 600;
      int d = cbe.this.dM().z.a(10);
      private static final int e = 3;
      final List<ib> f = Lists.newArrayList();
      @Nullable
      private ejc g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean h() {
         return cbe.this.cL != null && !cbe.this.fZ() && cbe.this.gD() && !this.d(cbe.this.cL) && cbe.this.dM().a_(cbe.this.cL).a(aun.aG);
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
         cbe.this.bQ.n();
         cbe.this.bQ.g();
      }

      @Override
      public void e() {
         if (cbe.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cbe.this.bQ.m()) {
               if (!cbe.this.b(cbe.this.cL, 16)) {
                  if (cbe.this.l(cbe.this.cL)) {
                     this.m();
                  } else {
                     cbe.this.j(cbe.this.cL);
                  }
               } else {
                  boolean $$0 = this.a(cbe.this.cL);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cbe.this.bQ.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cbe.this.bQ.j();
                  }
               }
            }
         }
      }

      private boolean a(ib $$0) {
         cbe.this.bQ.a(10.0F);
         cbe.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return cbe.this.bQ.j() != null && cbe.this.bQ.j().j();
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
         if (cbe.this.cL != null) {
            this.c(cbe.this.cL);
         }

         this.m();
      }

      private void m() {
         cbe.this.cL = null;
         cbe.this.cH = 200;
      }

      private boolean d(ib $$0) {
         if (cbe.this.b($$0, 2)) {
            return true;
         } else {
            ejc $$1 = cbe.this.bQ.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cbe.a {
      private static final int c = 600;
      int d = cbe.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean h() {
         return cbe.this.cK != null && !cbe.this.fZ() && this.k() && cbe.this.m(cbe.this.cK) && !cbe.this.b(cbe.this.cK, 2);
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
         cbe.this.bQ.n();
         cbe.this.bQ.g();
      }

      @Override
      public void e() {
         if (cbe.this.cK != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cbe.this.cK = null;
            } else if (!cbe.this.bQ.m()) {
               if (cbe.this.l(cbe.this.cK)) {
                  cbe.this.cK = null;
               } else {
                  cbe.this.j(cbe.this.cK);
               }
            }
         }
      }

      private boolean k() {
         return cbe.this.cD > 2400;
      }
   }

   class g extends cbe.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cbe.this.gG() >= 10) {
            return false;
         } else {
            return cbe.this.ag.i() < 0.3F ? false : cbe.this.gx() && cbe.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cbe.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ib $$1 = cbe.this.dm().c($$0);
               dmz $$2 = cbe.this.dM().a_($$1);
               daa $$3 = $$2.b();
               dmz $$4 = null;
               if ($$2.a(aun.aI)) {
                  if ($$3 instanceof dbv) {
                     dbv $$5 = (dbv)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dhv) {
                     int $$6 = $$2.c(dhv.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dhv.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dac.oi)) {
                     int $$7 = $$2.c(dic.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dic.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dac.sv) || $$2.a(dac.sw)) {
                     ((dad)$$2.b()).a((apf)cbe.this.dM(), cbe.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cbe.this.dM().c(2011, $$1, 15);
                     cbe.this.dM().b($$1, $$4);
                     cbe.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends byd {
      h(cbe $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cbe.this.Y_() && super.b();
      }

      @Override
      protected void a(bpq $$0, bpo $$1) {
         if ($$0 instanceof cbe && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cbe.a {
      @Override
      public boolean h() {
         return cbe.this.cH == 0 && !cbe.this.gu() && cbe.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cbe.this.cH = 200;
         List<ib> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ib $$1 : $$0) {
               if (!cbe.this.cN.b($$1)) {
                  cbe.this.cL = $$1;
                  return;
               }
            }

            cbe.this.cN.k();
            cbe.this.cL = $$0.get(0);
         }
      }

      private List<ib> k() {
         ib $$0 = cbe.this.dm();
         car $$1 = ((apf)cbe.this.dM()).y();
         Stream<cas> $$2 = $$1.c($$0x -> $$0x.a(auy.c), $$0, 20, car.b.c);
         return $$2.map(cas::f).filter(cbe.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bvn {
      j(bpq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cbe.this.Y_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cbe.this.cM.l();
      }
   }

   class k extends cbe.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dmz> f = $$0 -> {
         if ($$0.b(dnp.C) && $$0.c(dnp.C)) {
            return false;
         } else if ($$0.a(aun.U)) {
            return $$0.a(dac.iD) ? $$0.c(dci.b) == dnv.a : true;
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
      private epr o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean h() {
         if (cbe.this.cJ > 0) {
            return false;
         } else if (cbe.this.gx()) {
            return false;
         } else if (cbe.this.dM().ab()) {
            return false;
         } else {
            Optional<ib> $$0 = this.p();
            if ($$0.isPresent()) {
               cbe.this.cK = $$0.get();
               cbe.this.bQ.a((double)cbe.this.cK.u() + 0.5, (double)cbe.this.cK.v() + 0.5, (double)cbe.this.cK.w() + 0.5, 1.2F);
               return true;
            } else {
               cbe.this.cJ = aww.a(cbe.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cbe.this.s()) {
            return false;
         } else if (cbe.this.dM().ab()) {
            return false;
         } else if (this.k()) {
            return cbe.this.ag.i() < 0.2F;
         } else if (cbe.this.ah % 20 == 0 && !cbe.this.m(cbe.this.cK)) {
            cbe.this.cK = null;
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
         cbe.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            cbe.this.w(true);
         }

         this.n = false;
         cbe.this.bQ.n();
         cbe.this.cJ = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cbe.this.cK = null;
         } else {
            epr $$0 = epr.c(cbe.this.cK).b(0.0, 0.6F, 0.0);
            if ($$0.f(cbe.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cbe.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cbe.this.cK = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cbe.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new epr($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cbe.this.bQ.n();
                     } else {
                        $$2 = false;
                     }

                     cbe.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cbe.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cbe.this.a(aty.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cbe.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cbe.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ib> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ib> a(Predicate<dmz> $$0, double $$1) {
         ib $$2 = cbe.this.dm();
         ib.a $$3 = new ib.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cbe.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bwl {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         return cbe.this.bQ.l() && cbe.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cbe.this.bQ.m();
      }

      @Override
      public void c() {
         epr $$0 = this.h();
         if ($$0 != null) {
            cbe.this.bQ.a(cbe.this.bQ.a(ib.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private epr h() {
         epr $$1;
         if (cbe.this.gJ() && !cbe.this.b(cbe.this.cL, 22)) {
            epr $$0 = epr.b(cbe.this.cL);
            $$1 = $$0.d(cbe.this.dk()).d();
         } else {
            $$1 = cbe.this.f(0.0F);
         }

         int $$3 = 8;
         epr $$4 = cak.a(cbe.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cag.a(cbe.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
