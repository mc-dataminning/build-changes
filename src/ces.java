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

public class ces extends cer implements bth, cfa {
   public static final float ca = 120.32113F;
   public static final int cb = ayg.f(1.4959966F);
   private static final ajp<Byte> ck = ajt.a(ces.class, ajr.a);
   private static final ajp<Integer> cl = ajt.a(ces.class, ajr.b);
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
   private static final bpr cB = azh.a(20, 39);
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
   ces.k cP;
   ces.e cQ;
   private ces.f cR;
   private int cS;

   public ces(bsm<? extends ces> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new byz(this, 20, true);
      this.bQ = new ces.j(this);
      this.a(eoy.n, -1.0F);
      this.a(eoy.j, -1.0F);
      this.a(eoy.k, 16.0F);
      this.a(eoy.x, -1.0F);
      this.a(eoy.h, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, (byte)0);
      $$0.a(cl, 0);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new ces.b(this, 1.4F, true));
      this.bU.a(1, new ces.d());
      this.bU.a(2, new bzl(this, 1.0));
      this.bU.a(3, new cbh(this, 1.25, $$0 -> $$0.a(awf.aj), false));
      this.cP = new ces.k();
      this.bU.a(4, this.cP);
      this.bU.a(5, new bzy(this, 1.25));
      this.bU.a(5, new ces.i());
      this.cQ = new ces.e();
      this.bU.a(5, this.cQ);
      this.cR = new ces.f();
      this.bU.a(6, this.cR);
      this.bU.a(7, new ces.g());
      this.bU.a(8, new ces.l());
      this.bU.a(9, new bzt(this));
      this.bV.a(1, new ces.h(this).a(new Class[0]));
      this.bV.a(2, new ces.c(this));
      this.bV.a(3, new cby<>(this, true));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.gv()) {
         $$0.a("hive_pos", um.a(this.gw()));
      }

      if (this.u()) {
         $$0.a("flower_pos", um.a(this.s()));
      }

      $$0.a("HasNectar", this.gy());
      $$0.a("HasStung", this.gz());
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
      this.a(this.dQ(), $$0);
   }

   @Override
   public boolean D(bsg $$0) {
      bqz $$1 = this.dR().a((btb)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.g(buj.c)));
      if ($$2) {
         if (this.dQ() instanceof aqm $$3) {
            czn.a($$3, $$0, $$1);
         }

         if ($$0 instanceof btb $$4) {
            $$4.q($$4.eR() + 1);
            int $$5 = 0;
            if (this.dQ().al() == bqd.c) {
               $$5 = 10;
            } else if (this.dQ().al() == bqd.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bro(brq.s, $$5 * 20, 0), this);
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
      if (this.gy() && this.gH() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dQ(), this.dv() - 0.3F, this.dv() + 0.3F, this.dB() - 0.3F, this.dB() + 0.3F, this.e(0.5), lj.ay);
         }
      }

      this.gF();
   }

   private void a(dcf $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lh $$6) {
      $$0.a($$6, ayg.d($$0.z.j(), $$1, $$2), $$5, ayg.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ja $$0) {
      ewf $$1 = ewf.c($$0);
      int $$2 = 0;
      ja $$3 = this.dq();
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

      ewf $$8 = cdv.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bT.a(0.5F);
         this.bT.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ja s() {
      return this.cN;
   }

   public boolean u() {
      return this.cN != null;
   }

   public void h(ja $$0) {
      this.cN = $$0;
   }

   @azl
   public int y() {
      return Math.max(this.cQ.d, this.cR.d);
   }

   @azl
   public List<ja> go() {
      return this.cQ.f;
   }

   private boolean gD() {
      return this.cG > 3600;
   }

   boolean gE() {
      if (this.cH <= 0 && !this.cP.l() && !this.gz() && this.p() == null) {
         boolean $$0 = this.gD() || this.dQ().ad() || this.dQ().S() || this.gy();
         return $$0 && !this.gG();
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

   private void gF() {
      this.cE = this.cD;
      if (this.gL()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gz();
      if (this.bi()) {
         this.cS++;
      } else {
         this.cS = 0;
      }

      if (this.cS > 20) {
         this.a(this.dR().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.ah.a(ayg.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dR().o(), this.ex());
         }
      }

      if (!this.gy()) {
         this.cG++;
      }

      if (!this.dQ().B) {
         this.a((aqm)this.dQ(), false);
      }
   }

   public void gu() {
      this.cG = 0;
   }

   private boolean gG() {
      if (this.cO == null) {
         return false;
      } else {
         dpp $$0 = this.dQ().c_(this.cO);
         return $$0 instanceof dpm && ((dpm)$$0).b();
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
      this.a(cB.a(this.ah));
   }

   private boolean k(ja $$0) {
      dpp $$1 = this.dQ().c_($$0);
      return $$1 instanceof dpm ? !((dpm)$$1).d() : false;
   }

   @azl
   public boolean gv() {
      return this.cO != null;
   }

   @Nullable
   @azl
   public ja gw() {
      return this.cO;
   }

   @azl
   public caa gx() {
      return this.bU;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   int gH() {
      return this.cI;
   }

   private void gI() {
      this.cI = 0;
   }

   void gJ() {
      this.cI++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         boolean $$0 = this.Z_() && !this.gz() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gK()) {
            this.cO = null;
         }
      }
   }

   boolean gK() {
      if (!this.gv()) {
         return false;
      } else if (this.l(this.cO)) {
         return false;
      } else {
         dpp $$0 = this.dQ().c_(this.cO);
         return $$0 != null && $$0.r() == dpr.H;
      }
   }

   public boolean gy() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gu();
      }

      this.d(8, $$0);
   }

   public boolean gz() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gL() {
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

   public static bui.a gA() {
      return btd.A().a(buj.s, 10.0).a(buj.l, 0.6F).a(buj.v, 0.3F).a(buj.c, 2.0).a(buj.m, 48.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      ccl $$1 = new ccl(this, $$0) {
         @Override
         public boolean a(ja $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!ces.this.cP.l()) {
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
   public boolean o(cuc $$0) {
      return $$0.a(awf.aj);
   }

   boolean m(ja $$0) {
      return this.dQ().p($$0) && this.dQ().a_($$0).a(avw.U);
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
   }

   @Override
   protected avg v() {
      return null;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.bP;
   }

   @Override
   protected avg o_() {
      return avh.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public ces b(aqm $$0, bsa $$1) {
      return bsm.h.a((dcf)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
   }

   @Override
   public boolean aW() {
      return this.gB() && this.ai % cb == 0;
   }

   @Override
   public boolean gB() {
      return !this.aF();
   }

   public void gC() {
      this.w(false);
      this.gI();
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.cP.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awm<eog> $$0) {
      this.i(this.dt().b(0.0, 0.01, 0.0));
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.2F));
   }

   boolean b(ja $$0, int $$1) {
      return $$0.a(this.dq(), (double)$$1);
   }

   public void i(ja $$0) {
      this.cO = $$0;
   }

   abstract class a extends bzz {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !ces.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !ces.this.Z_();
      }
   }

   class b extends caj {
      b(final btk $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && ces.this.Z_() && !ces.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && ces.this.Z_() && !ces.this.gz();
      }
   }

   static class c extends cbs<cmk> {
      c(ces $$0) {
         super($$0, cmk.class, 10, true, false, $$0::a_);
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
         ces $$0 = (ces)this.e;
         return $$0.Z_() && !$$0.gz();
      }
   }

   class d extends ces.a {
      @Override
      public boolean h() {
         if (ces.this.gv() && ces.this.gE() && ces.this.cO.a(ces.this.do(), 2.0) && ces.this.dQ().c_(ces.this.cO) instanceof dpm $$1) {
            if (!$$1.d()) {
               return true;
            }

            ces.this.cO = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (ces.this.dQ().c_(ces.this.cO) instanceof dpm $$1) {
            $$1.a(ces.this);
         }
      }
   }

   @azl
   public class e extends ces.a {
      public static final int b = 600;
      int d = ces.this.dQ().z.a(10);
      private static final int e = 3;
      final List<ja> f = Lists.newArrayList();
      @Nullable
      private eov g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean h() {
         return ces.this.cO != null && !ces.this.fY() && ces.this.gE() && !this.d(ces.this.cO) && ces.this.dQ().a_(ces.this.cO).a(avw.aG);
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
         ces.this.bT.n();
         ces.this.bT.g();
      }

      @Override
      public void e() {
         if (ces.this.cO != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!ces.this.bT.m()) {
               if (!ces.this.b(ces.this.cO, 16)) {
                  if (ces.this.l(ces.this.cO)) {
                     this.m();
                  } else {
                     ces.this.j(ces.this.cO);
                  }
               } else {
                  boolean $$0 = this.a(ces.this.cO);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && ces.this.bT.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = ces.this.bT.j();
                  }
               }
            }
         }
      }

      private boolean a(ja $$0) {
         ces.this.bT.a(10.0F);
         ces.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return ces.this.bT.j() != null && ces.this.bT.j().j();
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
         if (ces.this.cO != null) {
            this.c(ces.this.cO);
         }

         this.m();
      }

      private void m() {
         ces.this.cO = null;
         ces.this.cK = 200;
      }

      private boolean d(ja $$0) {
         if (ces.this.b($$0, 2)) {
            return true;
         } else {
            eov $$1 = ces.this.bT.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends ces.a {
      private static final int c = 600;
      int d = ces.this.dQ().z.a(10);

      f() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean h() {
         return ces.this.cN != null && !ces.this.fY() && this.k() && ces.this.m(ces.this.cN) && !ces.this.b(ces.this.cN, 2);
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
         ces.this.bT.n();
         ces.this.bT.g();
      }

      @Override
      public void e() {
         if (ces.this.cN != null) {
            this.d++;
            if (this.d > this.a(600)) {
               ces.this.cN = null;
            } else if (!ces.this.bT.m()) {
               if (ces.this.l(ces.this.cN)) {
                  ces.this.cN = null;
               } else {
                  ces.this.j(ces.this.cN);
               }
            }
         }
      }

      private boolean k() {
         return ces.this.cG > 2400;
      }
   }

   class g extends ces.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (ces.this.gH() >= 10) {
            return false;
         } else {
            return ces.this.ah.i() < 0.3F ? false : ces.this.gy() && ces.this.gK();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (ces.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ja $$1 = ces.this.dq().c($$0);
               dsk $$2 = ces.this.dQ().a_($$1);
               dfh $$3 = $$2.b();
               dsk $$4 = null;
               if ($$2.a(avw.aI)) {
                  if ($$3 instanceof dhc) {
                     dhc $$5 = (dhc)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dnd) {
                     int $$6 = $$2.c(dnd.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dnd.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfj.oi)) {
                     int $$7 = $$2.c(dnk.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dnk.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfj.sv) || $$2.a(dfj.sw)) {
                     ((dfk)$$2.b()).a((aqm)ces.this.dQ(), ces.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     ces.this.dQ().c(2011, $$1, 15);
                     ces.this.dQ().b($$1, $$4);
                     ces.this.gJ();
                  }
               }
            }
         }
      }
   }

   class h extends cbr {
      h(final ces $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return ces.this.Z_() && super.b();
      }

      @Override
      protected void a(btd $$0, btb $$1) {
         if ($$0 instanceof ces && this.e.F($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends ces.a {
      @Override
      public boolean h() {
         return ces.this.cK == 0 && !ces.this.gv() && ces.this.gE();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         ces.this.cK = 200;
         List<ja> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ja $$1 : $$0) {
               if (!ces.this.cQ.b($$1)) {
                  ces.this.cO = $$1;
                  return;
               }
            }

            ces.this.cQ.k();
            ces.this.cO = $$0.get(0);
         }
      }

      private List<ja> k() {
         ja $$0 = ces.this.dq();
         cef $$1 = ((aqm)ces.this.dQ()).y();
         Stream<ceg> $$2 = $$1.c($$0x -> $$0x.a(awh.c), $$0, 20, cef.b.c);
         return $$2.map(ceg::f).filter(ces.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bzb {
      j(final btd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!ces.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ces.this.cP.l();
      }
   }

   class k extends ces.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dsk> f = $$0 -> {
         if ($$0.b(dta.C) && $$0.c(dta.C)) {
            return false;
         } else if ($$0.a(avw.U)) {
            return $$0.a(dfj.iD) ? $$0.c(dhp.b) == dtg.a : true;
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
      private ewf o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean h() {
         if (ces.this.cM > 0) {
            return false;
         } else if (ces.this.gy()) {
            return false;
         } else if (ces.this.dQ().ad()) {
            return false;
         } else {
            Optional<ja> $$0 = this.p();
            if ($$0.isPresent()) {
               ces.this.cN = $$0.get();
               ces.this.bT.a((double)ces.this.cN.u() + 0.5, (double)ces.this.cN.v() + 0.5, (double)ces.this.cN.w() + 0.5, 1.2F);
               return true;
            } else {
               ces.this.cM = ayg.a(ces.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!ces.this.u()) {
            return false;
         } else if (ces.this.dQ().ad()) {
            return false;
         } else if (this.k()) {
            return ces.this.ah.i() < 0.2F;
         } else if (ces.this.ai % 20 == 0 && !ces.this.m(ces.this.cN)) {
            ces.this.cN = null;
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
         ces.this.gu();
      }

      @Override
      public void d() {
         if (this.k()) {
            ces.this.w(true);
         }

         this.n = false;
         ces.this.bT.n();
         ces.this.cM = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            ces.this.cN = null;
         } else {
            ewf $$0 = ewf.c(ces.this.cN).b(0.0, 0.6F, 0.0);
            if ($$0.f(ces.this.do()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = ces.this.do().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  ces.this.cN = null;
               } else {
                  if ($$1) {
                     boolean $$3 = ces.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new ewf($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        ces.this.bT.n();
                     } else {
                        $$2 = false;
                     }

                     ces.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (ces.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     ces.this.a(avh.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         ces.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (ces.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ja> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ja> a(Predicate<dsk> $$0, double $$1) {
         ja $$2 = ces.this.dq();
         ja.a $$3 = new ja.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(ces.this.dQ().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bzz {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         return ces.this.bT.l() && ces.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return ces.this.bT.m();
      }

      @Override
      public void c() {
         ewf $$0 = this.h();
         if ($$0 != null) {
            ces.this.bT.a(ces.this.bT.a(ja.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ewf h() {
         ewf $$1;
         if (ces.this.gK() && !ces.this.b(ces.this.cO, 22)) {
            ewf $$0 = ewf.b(ces.this.cO);
            $$1 = $$0.d(ces.this.do()).d();
         } else {
            $$1 = ces.this.g(0.0F);
         }

         int $$3 = 8;
         ewf $$4 = cdy.a(ces.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cdu.a(ces.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
