import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class chq extends chp implements bwd, chy {
   public static final float bF = 120.32113F;
   public static final int bG = ayz.f(1.4959966F);
   private static final ajx<Byte> bP = akb.a(chq.class, ajz.a);
   private static final ajx<Integer> bQ = akb.a(chq.class, ajz.b);
   private static final int bR = 2;
   private static final int bS = 4;
   private static final int bT = 8;
   private static final int bU = 1200;
   private static final int bV = 600;
   private static final int bW = 3600;
   private static final int bX = 4;
   private static final int bY = 10;
   private static final int bZ = 10;
   private static final int ca = 18;
   private static final int cb = 48;
   private static final int cc = 2;
   private static final int cd = 24;
   private static final int ce = 16;
   private static final int cf = 16;
   private static final int cg = 20;
   public static final String bH = "CropsGrownSincePollination";
   public static final String bJ = "CannotEnterHiveTicks";
   public static final String bK = "TicksSincePollination";
   public static final String bL = "HasStung";
   public static final String bM = "HasNectar";
   public static final String bN = "flower_pos";
   public static final String bO = "hive_pos";
   private static final bsj ch = bab.a(20, 39);
   @Nullable
   private UUID ci;
   private float cj;
   private float ck;
   private int cl;
   int cm;
   private int cp;
   private int cq;
   private static final int cr = 200;
   int cs;
   private static final int ct = 200;
   private static final int cu = 20;
   private static final int cv = 60;
   int cw = ayz.a(this.ae, 20, 60);
   @Nullable
   ji cx;
   @Nullable
   ji cy;
   chq.k cz;
   chq.e cA;
   private chq.f cB;
   private int cC;

   public chq(bvi<? extends chq> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cbw(this, 20, true);
      this.by = new chq.j(this);
      this.a(eun.n, -1.0F);
      this.a(eun.j, -1.0F);
      this.a(eun.k, 16.0F);
      this.a(eun.x, -1.0F);
      this.a(eun.h, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bP, (byte)0);
      $$0.a(bQ, 0);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bC.a(0, new chq.b(this, 1.4F, true));
      this.bC.a(1, new chq.d());
      this.bC.a(2, new cci(this, 1.0));
      this.bC.a(3, new cee(this, 1.25, $$0 -> $$0.a(awy.am), false));
      this.bC.a(3, new chq.n());
      this.bC.a(3, new chq.m());
      this.cz = new chq.k();
      this.bC.a(4, this.cz);
      this.bC.a(5, new ccv(this, 1.25));
      this.bC.a(5, new chq.i());
      this.cA = new chq.e();
      this.bC.a(5, this.cA);
      this.cB = new chq.f();
      this.bC.a(6, this.cB);
      this.bC.a(7, new chq.g());
      this.bC.a(8, new chq.l());
      this.bC.a(9, new ccq(this));
      this.bD.a(1, new chq.h(this).a(new Class[0]));
      this.bD.a(2, new chq.c(this));
      this.bD.a(3, new cev<>(this, true));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", uf.a(this.gv()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uf.a(this.q()));
      }

      $$0.a("HasNectar", this.gE());
      $$0.a("HasStung", this.gF());
      $$0.a("TicksSincePollination", this.cm);
      $$0.a("CannotEnterHiveTicks", this.cp);
      $$0.a("CropsGrownSincePollination", this.cq);
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cm = $$0.h("TicksSincePollination");
      this.cp = $$0.h("CannotEnterHiveTicks");
      this.cq = $$0.h("CropsGrownSincePollination");
      this.cy = uf.a($$0, "hive_pos").orElse(null);
      this.cx = uf.a($$0, "flower_pos").orElse(null);
      this.a(this.dU(), $$0);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      btp $$2 = this.dV().a((bvy)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxg.c)));
      if ($$3) {
         ddt.a($$0, $$1, $$2);
         if ($$1 instanceof bvy $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dU().an() == bsv.c) {
               $$5 = 10;
            } else if (this.dU().an() == bsv.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bue(bug.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(awa.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gE() && this.gP() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dU(), this.dz() - 0.3F, this.dz() + 0.3F, this.dF() - 0.3F, this.dF() + 0.3F, this.e(0.5), lt.aB);
         }
      }

      this.gN();
   }

   private void a(dgz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lr $$6) {
      $$0.a($$6, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(ji $$0) {
      fbx $$1 = fbx.c($$0);
      int $$2 = 0;
      ji $$3 = this.du();
      int $$4 = (int)$$1.e - $$3.v();
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

      fbx $$8 = cgs.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bB.b(0.5F);
         this.bB.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public ji q() {
      return this.cx;
   }

   public boolean t() {
      return this.cx != null;
   }

   public void i(ji $$0) {
      this.cx = $$0;
   }

   @bag
   public int x() {
      return Math.max(this.cA.d, this.cB.d);
   }

   @bag
   public List<ji> gs() {
      return this.cA.f;
   }

   private boolean gJ() {
      return this.cm > 3600;
   }

   void gK() {
      this.cy = null;
      this.cs = 200;
   }

   void gL() {
      this.cx = null;
      this.cw = ayz.a(this.ae, 20, 60);
   }

   boolean gM() {
      if (this.cp <= 0 && !this.cz.l() && !this.gF() && this.f() == null) {
         boolean $$0 = this.gJ() || c(this.dU()) || this.gE();
         return $$0 && !this.gO();
      } else {
         return false;
      }
   }

   public static boolean c(dgz $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cp = $$0;
   }

   public float K(float $$0) {
      return ayz.h($$0, this.ck, this.cj);
   }

   private void gN() {
      this.ck = this.cj;
      if (this.gU()) {
         this.cj = Math.min(1.0F, this.cj + 0.2F);
      } else {
         this.cj = Math.max(0.0F, this.cj - 0.24F);
      }
   }

   @Override
   protected void a(ard $$0) {
      boolean $$1 = this.gF();
      if (this.bj()) {
         this.cC++;
      } else {
         this.cC = 0;
      }

      if (this.cC > 20) {
         this.a($$0, this.dV().i(), 1.0F);
      }

      if ($$1) {
         this.cl++;
         if (this.cl % 5 == 0 && this.ae.a(ayz.a(1200 - this.cl, 1, 1200)) == 0) {
            this.a($$0, this.dV().p(), this.eE());
         }
      }

      if (!this.gE()) {
         this.cm++;
      }

      this.a($$0, false);
   }

   public void gt() {
      this.cm = 0;
   }

   private boolean gO() {
      dup $$0 = this.gS();
      return $$0 != null && $$0.b();
   }

   @Override
   public int a() {
      return this.al.a(bQ);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bQ, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   public void c() {
      this.a(ch.a(this.ae));
   }

   private boolean l(ji $$0) {
      dus $$1 = this.dU().c_($$0);
      return $$1 instanceof dup ? !((dup)$$1).d() : false;
   }

   @bag
   public boolean gu() {
      return this.cy != null;
   }

   @Nullable
   @bag
   public ji gv() {
      return this.cy;
   }

   @bag
   public ccx gw() {
      return this.bC;
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   int gP() {
      return this.cq;
   }

   private void gQ() {
      this.cq = 0;
   }

   void gR() {
      this.cq++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         if (this.cp > 0) {
            this.cp--;
         }

         if (this.cs > 0) {
            this.cs--;
         }

         if (this.cw > 0) {
            this.cw--;
         }

         boolean $$0 = this.Z_() && !this.gF() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gT()) {
            this.cy = null;
         }
      }
   }

   @Nullable
   dup gS() {
      if (this.cy == null) {
         return null;
      } else {
         return this.m(this.cy) ? null : this.dU().a(this.cy, duu.I).orElse(null);
      }
   }

   boolean gT() {
      return this.gS() != null;
   }

   public boolean gE() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gF() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gU() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(ji $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bP, (byte)(this.al.a(bP) | $$0));
      } else {
         this.al.a(bP, (byte)(this.al.a(bP) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bP) & $$0) != 0;
   }

   public static bxf.a gG() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.l, 0.6F).a(bxg.v, 0.3F).a(bxg.c, 2.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      cfi $$1 = new cfi(this, $$0) {
         @Override
         public boolean a(ji $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!chq.this.cz.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cvo $$3 && $$3.d() instanceof dni $$4) {
         bue $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dU().C) {
               this.a($$5);
            }

            return bsy.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.am);
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
   }

   @Override
   protected avz u() {
      return null;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.bP;
   }

   @Override
   protected avz l_() {
      return awa.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public chq b(ard $$0, buq $$1) {
      return bvi.l.a($$0, bvh.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
   }

   @Override
   public boolean ba() {
      return this.gH() && this.af % bG == 0;
   }

   @Override
   public boolean gH() {
      return !this.aJ();
   }

   public void gI() {
      this.w(false);
      this.gQ();
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cz.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axf<etv> $$0) {
      this.i(this.dx().b(0.0, 0.01, 0.0));
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.2F));
   }

   boolean b(ji $$0, int $$1) {
      return $$0.a(this.du(), (double)$$1);
   }

   public void j(ji $$0) {
      this.cy = $$0;
   }

   public static boolean c(dxq $$0) {
      if ($$0.a(awp.W)) {
         if ($$0.a(dyg.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dkg.jb) ? $$0.c(dmn.b) == dym.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends ccw {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !chq.this.Z_();
      }

      @Override
      public boolean c() {
         return this.i() && !chq.this.Z_();
      }
   }

   class b extends cdg {
      b(final bwg $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && chq.this.Z_() && !chq.this.gF();
      }

      @Override
      public boolean c() {
         return super.c() && chq.this.Z_() && !chq.this.gF();
      }
   }

   static class c extends cep<cpr> {
      c(chq $$0) {
         super($$0, cpr.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.f() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         chq $$0 = (chq)this.e;
         return $$0.Z_() && !$$0.gF();
      }
   }

   class d extends chq.a {
      @Override
      public boolean h() {
         if (chq.this.cy != null && chq.this.gM() && chq.this.cy.a(chq.this.ds(), 2.0)) {
            dup $$0 = chq.this.gS();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               chq.this.cy = null;
            }
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         dup $$0 = chq.this.gS();
         if ($$0 != null) {
            $$0.a(chq.this);
         }
      }
   }

   @bag
   public class e extends chq.a {
      public static final int b = 2400;
      int d = chq.this.dU().A.a(10);
      private static final int e = 3;
      final List<ji> f = Lists.newArrayList();
      @Nullable
      private euk g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean h() {
         return chq.this.cy != null
            && !chq.this.m(chq.this.cy)
            && !chq.this.gg()
            && chq.this.gM()
            && !this.d(chq.this.cy)
            && chq.this.dU().a_(chq.this.cy).a(awp.aJ);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         this.i = 0;
         chq.this.bB.m();
         chq.this.bB.f();
      }

      @Override
      public void a() {
         if (chq.this.cy != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!chq.this.bB.l()) {
               if (!chq.this.b(chq.this.cy, 16)) {
                  if (chq.this.m(chq.this.cy)) {
                     chq.this.gK();
                  } else {
                     chq.this.k(chq.this.cy);
                  }
               } else {
                  boolean $$0 = this.a(chq.this.cy);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && chq.this.bB.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        chq.this.gK();
                        this.i = 0;
                     }
                  } else {
                     this.g = chq.this.bB.i();
                  }
               }
            }
         }
      }

      private boolean a(ji $$0) {
         int $$1 = chq.this.b($$0, 3) ? 1 : 2;
         chq.this.bB.b(10.0F);
         chq.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return chq.this.bB.i() != null && chq.this.bB.i().j();
      }

      boolean b(ji $$0) {
         return this.f.contains($$0);
      }

      private void c(ji $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (chq.this.cy != null) {
            this.c(chq.this.cy);
         }

         chq.this.gK();
      }

      private boolean d(ji $$0) {
         if (chq.this.b($$0, 2)) {
            return true;
         } else {
            euk $$1 = chq.this.bB.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends chq.a {
      private static final int c = 2400;
      int d = chq.this.dU().A.a(10);

      f() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean h() {
         return chq.this.cx != null && !chq.this.gg() && this.k() && !chq.this.b(chq.this.cx, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         chq.this.bB.m();
         chq.this.bB.f();
      }

      @Override
      public void a() {
         if (chq.this.cx != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               chq.this.gL();
            } else if (!chq.this.bB.l()) {
               if (chq.this.m(chq.this.cx)) {
                  chq.this.gL();
               } else {
                  chq.this.k(chq.this.cx);
               }
            }
         }
      }

      private boolean k() {
         return chq.this.cm > 600;
      }
   }

   class g extends chq.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (chq.this.gP() >= 10) {
            return false;
         } else {
            return chq.this.ae.i() < 0.3F ? false : chq.this.gE() && chq.this.gT();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (chq.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ji $$1 = chq.this.du().c($$0);
               dxq $$2 = chq.this.dU().a_($$1);
               dke $$3 = $$2.b();
               dxq $$4 = null;
               if ($$2.a(awp.aL)) {
                  if ($$3 instanceof dma) {
                     dma $$5 = (dma)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dsg) {
                     int $$6 = $$2.c(dsg.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dsg.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dkg.oK)) {
                     int $$7 = $$2.c(dsn.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dsn.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dkg.sX) || $$2.a(dkg.sY)) {
                     dkh $$8 = (dkh)$$2.b();
                     if ($$8.a(chq.this.dU(), $$1, $$2)) {
                        $$8.a((ard)chq.this.dU(), chq.this.ae, $$1, $$2);
                        $$4 = chq.this.dU().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     chq.this.dU().c(2011, $$1, 15);
                     chq.this.dU().b($$1, $$4);
                     chq.this.gR();
                  }
               }
            }
         }
      }
   }

   class h extends ceo {
      h(final chq $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return chq.this.Z_() && super.c();
      }

      @Override
      protected void a(bwa $$0, bvy $$1) {
         if ($$0 instanceof chq && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends chq.a {
      @Override
      public boolean h() {
         return chq.this.cs == 0 && !chq.this.gu() && chq.this.gM();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         chq.this.cs = 200;
         List<ji> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ji $$1 : $$0) {
               if (!chq.this.cA.b($$1)) {
                  chq.this.cy = $$1;
                  return;
               }
            }

            chq.this.cA.k();
            chq.this.cy = $$0.get(0);
         }
      }

      private List<ji> k() {
         ji $$0 = chq.this.du();
         chc $$1 = ((ard)chq.this.dU()).A();
         Stream<chd> $$2 = $$1.c($$0x -> $$0x.a(axa.c), $$0, 20, chc.b.c);
         return $$2.map(chd::g).filter(chq.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cby {
      j(final bwa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chq.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chq.this.cz.l();
      }
   }

   class k extends chq.a {
      private static final int c = 400;
      private static final double d = 0.1;
      private static final int e = 25;
      private static final float f = 0.35F;
      private static final float g = 0.6F;
      private static final float h = 0.33333334F;
      private static final int i = 5;
      private int j;
      private int k;
      private boolean l;
      @Nullable
      private fbx m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean h() {
         if (chq.this.cw > 0) {
            return false;
         } else if (chq.this.gE()) {
            return false;
         } else if (chq.this.dU().ah()) {
            return false;
         } else {
            Optional<ji> $$0 = this.p();
            if ($$0.isPresent()) {
               chq.this.cx = $$0.get();
               chq.this.bB.a((double)chq.this.cx.u() + 0.5, (double)chq.this.cx.v() + 0.5, (double)chq.this.cx.w() + 0.5, 1.2F);
               return true;
            } else {
               chq.this.cw = ayz.a(chq.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!chq.this.t()) {
            return false;
         } else if (chq.this.dU().ah()) {
            return false;
         } else {
            return this.k() ? chq.this.ae.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.j > 400;
      }

      boolean l() {
         return this.l;
      }

      void m() {
         this.l = false;
      }

      @Override
      public void d() {
         this.j = 0;
         this.n = 0;
         this.k = 0;
         this.l = true;
         chq.this.gt();
      }

      @Override
      public void e() {
         if (this.k()) {
            chq.this.w(true);
         }

         this.l = false;
         chq.this.bB.m();
         chq.this.cw = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (chq.this.t()) {
            this.n++;
            if (this.n > 600) {
               chq.this.gL();
               this.l = false;
               chq.this.cw = 200;
            } else {
               fbx $$0 = fbx.c(chq.this.cx).b(0.0, 0.6F, 0.0);
               if ($$0.f(chq.this.ds()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = chq.this.ds().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     chq.this.gL();
                  } else {
                     if ($$1) {
                        boolean $$3 = chq.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fbx($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           chq.this.bB.m();
                        } else {
                           $$2 = false;
                        }

                        chq.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (chq.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        chq.this.a(awa.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         chq.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (chq.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ji> p() {
         Iterable<ji> $$0 = ji.a(chq.this.du(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (ji $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (chq.this.dU().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (chq.c(chq.this.dU().a_($$2))) {
               euk $$4 = chq.this.bB.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), chq.this.dU().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends ccw {
      l() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         return chq.this.bB.k() && chq.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return chq.this.bB.l();
      }

      @Override
      public void d() {
         fbx $$0 = this.h();
         if ($$0 != null) {
            chq.this.bB.a(chq.this.bB.a(ji.a((kb)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fbx h() {
         fbx $$1;
         if (chq.this.gT() && !chq.this.b(chq.this.cy, this.i())) {
            fbx $$0 = fbx.b(chq.this.cy);
            $$1 = $$0.d(chq.this.ds()).d();
         } else {
            $$1 = chq.this.h(0.0F);
         }

         int $$3 = 8;
         fbx $$4 = cgv.a(chq.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cgr.a(chq.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !chq.this.gu() && !chq.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends chq.a {
      private final int c = ayz.a(chq.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chq.this.cx != null && chq.this.dU().p(chq.this.cx) && !this.a(chq.this.cx)) {
            chq.this.gL();
         }

         this.d = chq.this.dU().ae();
      }

      @Override
      public boolean h() {
         return chq.this.dU().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(ji $$0) {
         return chq.c(chq.this.dU().a_($$0));
      }
   }

   class n extends chq.a {
      private final int c = ayz.a(chq.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chq.this.cy != null && chq.this.dU().p(chq.this.cy) && !chq.this.gT()) {
            chq.this.gK();
         }

         this.d = chq.this.dU().ae();
      }

      @Override
      public boolean h() {
         return chq.this.dU().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
