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

public class cet extends ces implements bti, cfb {
   public static final float ca = 120.32113F;
   public static final int cb = ayg.f(1.4959966F);
   private static final ajp<Byte> ck = ajt.a(cet.class, ajr.a);
   private static final ajp<Integer> cl = ajt.a(cet.class, ajr.b);
   private static final int cm = 2;
   private static final int cn = 4;
   private static final int co = 8;
   private static final int cp = 1200;
   private static final int cq = 2400;
   private static final int cr = 3600;
   private static final int cs = 4;
   private static final int ct = 10;
   private static final int cu = 10;
   private static final int cv = 18;
   private static final int cw = 32;
   private static final int cx = 2;
   private static final int cy = 16;
   private static final int cz = 20;
   public static final String cd = "CropsGrownSincePollination";
   public static final String ce = "CannotEnterHiveTicks";
   public static final String cf = "TicksSincePollination";
   public static final String cg = "HasStung";
   public static final String ch = "HasNectar";
   public static final String ci = "flower_pos";
   public static final String cj = "hive_pos";
   private static final bps cA = azh.a(20, 39);
   @Nullable
   private UUID cC;
   private float cD;
   private float cE;
   private int cF;
   int cG;
   private int cH;
   private int cI;
   private static final int cJ = 200;
   int cK;
   private static final int cL = 200;
   int cM = ayg.a(this.ah, 20, 60);
   @Nullable
   ja cN;
   @Nullable
   ja cO;
   cet.k cP;
   cet.e cQ;
   private cet.f cR;
   private int cS;

   public cet(bsn<? extends cet> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bza(this, 20, true);
      this.bQ = new cet.j(this);
      this.a(epa.n, -1.0F);
      this.a(epa.j, -1.0F);
      this.a(epa.k, 16.0F);
      this.a(epa.x, -1.0F);
      this.a(epa.h, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, (byte)0);
      $$0.a(cl, 0);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cet.b(this, 1.4F, true));
      this.bU.a(1, new cet.d());
      this.bU.a(2, new bzm(this, 1.0));
      this.bU.a(3, new cbi(this, 1.25, $$0 -> $$0.a(awf.aj), false));
      this.cP = new cet.k();
      this.bU.a(4, this.cP);
      this.bU.a(5, new bzz(this, 1.25));
      this.bU.a(5, new cet.i());
      this.cQ = new cet.e();
      this.bU.a(5, this.cQ);
      this.cR = new cet.f();
      this.bU.a(6, this.cR);
      this.bU.a(7, new cet.g());
      this.bU.a(8, new cet.l());
      this.bU.a(9, new bzu(this));
      this.bV.a(1, new cet.h(this).a(new Class[0]));
      this.bV.a(2, new cet.c(this));
      this.bV.a(3, new cbz<>(this, true));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", um.a(this.gv()));
      }

      if (this.t()) {
         $$0.a("flower_pos", um.a(this.s()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      this.cO = um.a($$0, "hive_pos").orElse(null);
      this.cN = um.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.a(this.dR(), $$0);
   }

   @Override
   public boolean D(bsh $$0) {
      bra $$1 = this.dS().a((btc)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.g(buk.c)));
      if ($$2) {
         if (this.dR() instanceof aqm $$3) {
            czo.a($$3, $$0, $$1);
         }

         if ($$0 instanceof btc $$4) {
            $$4.q($$4.eS() + 1);
            int $$5 = 0;
            if (this.dR().al() == bqe.c) {
               $$5 = 10;
            } else if (this.dR().al() == bqe.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new brp(brr.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(avh.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dR(), this.dw() - 0.3F, this.dw() + 0.3F, this.dC() - 0.3F, this.dC() + 0.3F, this.e(0.5), lj.ay);
         }
      }

      this.gE();
   }

   private void a(dcg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lh $$6) {
      $$0.a($$6, ayg.d($$0.z.j(), $$1, $$2), $$5, ayg.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ja $$0) {
      ewh $$1 = ewh.c($$0);
      int $$2 = 0;
      ja $$3 = this.dr();
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

      ewh $$8 = cdw.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bT.a(0.5F);
         this.bT.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ja s() {
      return this.cN;
   }

   public boolean t() {
      return this.cN != null;
   }

   public void h(ja $$0) {
      this.cN = $$0;
   }

   @azl
   public int x() {
      return Math.max(this.cQ.d, this.cR.d);
   }

   @azl
   public List<ja> gn() {
      return this.cQ.f;
   }

   private boolean gC() {
      return this.cG > 3600;
   }

   boolean gD() {
      if (this.cH <= 0 && !this.cP.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dR().ad() || this.dR().S() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cE, this.cD);
   }

   private void gE() {
      this.cE = this.cD;
      if (this.gK()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gy();
      if (this.bj()) {
         this.cS++;
      } else {
         this.cS = 0;
      }

      if (this.cS > 20) {
         this.a(this.dS().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.ah.a(ayg.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dS().o(), this.ey());
         }
      }

      if (!this.gx()) {
         this.cG++;
      }

      if (!this.dR().B) {
         this.a((aqm)this.dR(), false);
      }
   }

   public void gt() {
      this.cG = 0;
   }

   private boolean gF() {
      if (this.cO == null) {
         return false;
      } else {
         dpq $$0 = this.dR().c_(this.cO);
         return $$0 instanceof dpn && ((dpn)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.ao.a(cl);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cl, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cC;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cC = $$0;
   }

   @Override
   public void c() {
      this.a(cA.a(this.ah));
   }

   private boolean k(ja $$0) {
      dpq $$1 = this.dR().c_($$0);
      return $$1 instanceof dpn ? !((dpn)$$1).d() : false;
   }

   @azl
   public boolean gu() {
      return this.cO != null;
   }

   @Nullable
   @azl
   public ja gv() {
      return this.cO;
   }

   @azl
   public cab gw() {
      return this.bU;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   int gG() {
      return this.cI;
   }

   private void gH() {
      this.cI = 0;
   }

   void gI() {
      this.cI++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         boolean $$0 = this.Z_() && !this.gy() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gJ()) {
            this.cO = null;
         }
      }
   }

   boolean gJ() {
      if (!this.gu()) {
         return false;
      } else if (this.l(this.cO)) {
         return false;
      } else {
         dpq $$0 = this.dR().c_(this.cO);
         return $$0 != null && $$0.r() == dps.H;
      }
   }

   public boolean gx() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gy() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gK() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(ja $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(ck, (byte)(this.ao.a(ck) | $$0));
      } else {
         this.ao.a(ck, (byte)(this.ao.a(ck) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(ck) & $$0) != 0;
   }

   public static buj.a gz() {
      return bte.A().a(buk.s, 10.0).a(buk.l, 0.6F).a(buk.v, 0.3F).a(buk.c, 2.0).a(buk.m, 48.0);
   }

   @Override
   protected cco b(dcg $$0) {
      ccm $$1 = new ccm(this, $$0) {
         @Override
         public boolean a(ja $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cet.this.cP.l()) {
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
   public boolean o(cud $$0) {
      return $$0.a(awf.aj);
   }

   boolean m(ja $$0) {
      return this.dR().p($$0) && this.dR().a_($$0).a(avw.U);
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
   }

   @Override
   protected avg v() {
      return null;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.bP;
   }

   @Override
   protected avg n_() {
      return avh.bO;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Nullable
   public cet b(aqm $$0, bsb $$1) {
      return bsn.h.a((dcg)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   public boolean aX() {
      return this.gA() && this.ai % cb == 0;
   }

   @Override
   public boolean gA() {
      return !this.aG();
   }

   public void gB() {
      this.w(false);
      this.gH();
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dR().B) {
            this.cP.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awm<eoi> $$0) {
      this.j(this.du().b(0.0, 0.01, 0.0));
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.5F * this.cN()), (double)(this.dl() * 0.2F));
   }

   boolean b(ja $$0, int $$1) {
      return $$0.a(this.dr(), (double)$$1);
   }

   public void i(ja $$0) {
      this.cO = $$0;
   }

   abstract class a extends caa {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cet.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !cet.this.Z_();
      }
   }

   class b extends cak {
      b(final btl $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cet.this.Z_() && !cet.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && cet.this.Z_() && !cet.this.gy();
      }
   }

   static class c extends cbt<cml> {
      c(cet $$0) {
         super($$0, cml.class, 10, true, false, $$0::a_);
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
         cet $$0 = (cet)this.e;
         return $$0.Z_() && !$$0.gy();
      }
   }

   class d extends cet.a {
      @Override
      public boolean h() {
         if (cet.this.gu() && cet.this.gD() && cet.this.cO.a(cet.this.dp(), 2.0) && cet.this.dR().c_(cet.this.cO) instanceof dpn $$1) {
            if (!$$1.d()) {
               return true;
            }

            cet.this.cO = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cet.this.dR().c_(cet.this.cO) instanceof dpn $$1) {
            $$1.a(cet.this);
         }
      }
   }

   @azl
   public class e extends cet.a {
      public static final int b = 600;
      int d = cet.this.dR().z.a(10);
      private static final int e = 3;
      final List<ja> f = Lists.newArrayList();
      @Nullable
      private eox g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean h() {
         return cet.this.cO != null && !cet.this.fX() && cet.this.gD() && !this.d(cet.this.cO) && cet.this.dR().a_(cet.this.cO).a(avw.aG);
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
         cet.this.bT.n();
         cet.this.bT.g();
      }

      @Override
      public void e() {
         if (cet.this.cO != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cet.this.bT.m()) {
               if (!cet.this.b(cet.this.cO, 16)) {
                  if (cet.this.l(cet.this.cO)) {
                     this.m();
                  } else {
                     cet.this.j(cet.this.cO);
                  }
               } else {
                  boolean $$0 = this.a(cet.this.cO);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cet.this.bT.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cet.this.bT.j();
                  }
               }
            }
         }
      }

      private boolean a(ja $$0) {
         cet.this.bT.a(10.0F);
         cet.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cet.this.bT.j() != null && cet.this.bT.j().j();
      }

      boolean b(ja $$0) {
         return this.f.contains($$0);
      }

      private void c(ja $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cet.this.cO != null) {
            this.c(cet.this.cO);
         }

         this.m();
      }

      private void m() {
         cet.this.cO = null;
         cet.this.cK = 200;
      }

      private boolean d(ja $$0) {
         if (cet.this.b($$0, 2)) {
            return true;
         } else {
            eox $$1 = cet.this.bT.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cet.a {
      private static final int c = 600;
      int d = cet.this.dR().z.a(10);

      f() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean h() {
         return cet.this.cN != null && !cet.this.fX() && this.k() && cet.this.m(cet.this.cN) && !cet.this.b(cet.this.cN, 2);
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
         cet.this.bT.n();
         cet.this.bT.g();
      }

      @Override
      public void e() {
         if (cet.this.cN != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cet.this.cN = null;
            } else if (!cet.this.bT.m()) {
               if (cet.this.l(cet.this.cN)) {
                  cet.this.cN = null;
               } else {
                  cet.this.j(cet.this.cN);
               }
            }
         }
      }

      private boolean k() {
         return cet.this.cG > 2400;
      }
   }

   class g extends cet.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cet.this.gG() >= 10) {
            return false;
         } else {
            return cet.this.ah.i() < 0.3F ? false : cet.this.gx() && cet.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cet.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ja $$1 = cet.this.dr().c($$0);
               dsl $$2 = cet.this.dR().a_($$1);
               dfi $$3 = $$2.b();
               dsl $$4 = null;
               if ($$2.a(avw.aI)) {
                  if ($$3 instanceof dhd) {
                     dhd $$5 = (dhd)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dne) {
                     int $$6 = $$2.c(dne.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dne.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfk.oi)) {
                     int $$7 = $$2.c(dnl.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dnl.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfk.sv) || $$2.a(dfk.sw)) {
                     ((dfl)$$2.b()).a((aqm)cet.this.dR(), cet.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cet.this.dR().c(2011, $$1, 15);
                     cet.this.dR().b($$1, $$4);
                     cet.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends cbs {
      h(final cet $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cet.this.Z_() && super.b();
      }

      @Override
      protected void a(bte $$0, btc $$1) {
         if ($$0 instanceof cet && this.e.F($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cet.a {
      @Override
      public boolean h() {
         return cet.this.cK == 0 && !cet.this.gu() && cet.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cet.this.cK = 200;
         List<ja> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ja $$1 : $$0) {
               if (!cet.this.cQ.b($$1)) {
                  cet.this.cO = $$1;
                  return;
               }
            }

            cet.this.cQ.k();
            cet.this.cO = $$0.get(0);
         }
      }

      private List<ja> k() {
         ja $$0 = cet.this.dr();
         ceg $$1 = ((aqm)cet.this.dR()).y();
         Stream<ceh> $$2 = $$1.c($$0x -> $$0x.a(awh.c), $$0, 20, ceg.b.c);
         return $$2.map(ceh::f).filter(cet.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bzc {
      j(final bte $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cet.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cet.this.cP.l();
      }
   }

   class k extends cet.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dsl> f = $$0 -> {
         if ($$0.b(dtb.C) && $$0.c(dtb.C)) {
            return false;
         } else if ($$0.a(avw.U)) {
            return $$0.a(dfk.iD) ? $$0.c(dhq.b) == dth.a : true;
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
      private ewh o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean h() {
         if (cet.this.cM > 0) {
            return false;
         } else if (cet.this.gx()) {
            return false;
         } else if (cet.this.dR().ad()) {
            return false;
         } else {
            Optional<ja> $$0 = this.p();
            if ($$0.isPresent()) {
               cet.this.cN = $$0.get();
               cet.this.bT.a((double)cet.this.cN.u() + 0.5, (double)cet.this.cN.v() + 0.5, (double)cet.this.cN.w() + 0.5, 1.2F);
               return true;
            } else {
               cet.this.cM = ayg.a(cet.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cet.this.t()) {
            return false;
         } else if (cet.this.dR().ad()) {
            return false;
         } else if (this.k()) {
            return cet.this.ah.i() < 0.2F;
         } else if (cet.this.ai % 20 == 0 && !cet.this.m(cet.this.cN)) {
            cet.this.cN = null;
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
         cet.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            cet.this.w(true);
         }

         this.n = false;
         cet.this.bT.n();
         cet.this.cM = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cet.this.cN = null;
         } else {
            ewh $$0 = ewh.c(cet.this.cN).b(0.0, 0.6F, 0.0);
            if ($$0.f(cet.this.dp()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cet.this.dp().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cet.this.cN = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cet.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new ewh($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cet.this.bT.n();
                     } else {
                        $$2 = false;
                     }

                     cet.this.F().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cet.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cet.this.a(avh.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cet.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cet.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ja> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ja> a(Predicate<dsl> $$0, double $$1) {
         ja $$2 = cet.this.dr();
         ja.a $$3 = new ja.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cet.this.dR().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends caa {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         return cet.this.bT.l() && cet.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cet.this.bT.m();
      }

      @Override
      public void c() {
         ewh $$0 = this.h();
         if ($$0 != null) {
            cet.this.bT.a(cet.this.bT.a(ja.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ewh h() {
         ewh $$1;
         if (cet.this.gJ() && !cet.this.b(cet.this.cO, 22)) {
            ewh $$0 = ewh.b(cet.this.cO);
            $$1 = $$0.d(cet.this.dp()).d();
         } else {
            $$1 = cet.this.g(0.0F);
         }

         int $$3 = 8;
         ewh $$4 = cdz.a(cet.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cdv.a(cet.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
