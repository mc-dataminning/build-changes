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

public class cfi extends cfh implements btx, cfq {
   public static final float bY = 120.32113F;
   public static final int bZ = ayz.f(1.4959966F);
   private static final akk<Byte> ci = ako.a(cfi.class, akm.a);
   private static final akk<Integer> cj = ako.a(cfi.class, akm.b);
   private static final int ck = 2;
   private static final int cl = 4;
   private static final int cm = 8;
   private static final int cn = 1200;
   private static final int co = 2400;
   private static final int cp = 3600;
   private static final int cq = 4;
   private static final int cr = 10;
   private static final int cs = 10;
   private static final int ct = 18;
   private static final int cu = 32;
   private static final int cv = 2;
   private static final int cw = 16;
   private static final int cx = 20;
   public static final String cb = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final bqh cz = azz.a(20, 39);
   @Nullable
   private UUID cA;
   private float cB;
   private float cC;
   private int cD;
   int cE;
   private int cF;
   private int cG;
   private static final int cH = 200;
   int cI;
   private static final int cJ = 200;
   int cK = ayz.a(this.ah, 20, 60);
   @Nullable
   iz cL;
   @Nullable
   iz cM;
   cfi.k cN;
   cfi.e cO;
   private cfi.f cP;
   private int cQ;

   public cfi(btc<? extends cfi> $$0, dca $$1) {
      super($$0, $$1);
      this.bP = new bzp(this, 20, true);
      this.bO = new cfi.j(this);
      this.a(eoo.n, -1.0F);
      this.a(eoo.j, -1.0F);
      this.a(eoo.k, 16.0F);
      this.a(eoo.x, -1.0F);
      this.a(eoo.h, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cfi.b(this, 1.4F, true));
      this.bS.a(1, new cfi.d());
      this.bS.a(2, new cab(this, 1.0));
      this.bS.a(3, new cbx(this, 1.25, $$0 -> $$0.a(awy.aj), false));
      this.cN = new cfi.k();
      this.bS.a(4, this.cN);
      this.bS.a(5, new cao(this, 1.25));
      this.bS.a(5, new cfi.i());
      this.cO = new cfi.e();
      this.bS.a(5, this.cO);
      this.cP = new cfi.f();
      this.bS.a(6, this.cP);
      this.bS.a(7, new cfi.g());
      this.bS.a(8, new cfi.l());
      this.bS.a(9, new caj(this));
      this.bT.a(1, new cfi.h(this).a(new Class[0]));
      this.bT.a(2, new cfi.c(this));
      this.bT.a(3, new cco<>(this, true));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("hive_pos", vh.a(this.gy()));
      }

      if (this.u()) {
         $$0.a("flower_pos", vh.a(this.s()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cE);
      $$0.a("CannotEnterHiveTicks", this.cF);
      $$0.a("CropsGrownSincePollination", this.cG);
      this.c($$0);
   }

   @Override
   public void a(us $$0) {
      this.cM = vh.a($$0, "hive_pos").orElse(null);
      this.cL = vh.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cE = $$0.h("TicksSincePollination");
      this.cF = $$0.h("CannotEnterHiveTicks");
      this.cG = $$0.h("CropsGrownSincePollination");
      this.a(this.dP(), $$0);
   }

   @Override
   public boolean C(bsw $$0) {
      boolean $$1 = $$0.a(this.dQ().a((btr)this), (float)((int)this.g(buz.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof btr) {
            ((btr)$$0).r(((btr)$$0).eU() + 1);
            int $$2 = 0;
            if (this.dP().al() == bqt.c) {
               $$2 = 10;
            } else if (this.dP().al() == bqt.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((btr)$$0).b(new bse(bsg.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(awa.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gA() && this.gJ() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dP(), this.du() - 0.3F, this.du() + 0.3F, this.dA() - 0.3F, this.dA() + 0.3F, this.e(0.5), li.ay);
         }
      }

      this.gH();
   }

   private void a(dca $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lg $$6) {
      $$0.a($$6, ayz.d($$0.z.j(), $$1, $$2), $$5, ayz.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(iz $$0) {
      evt $$1 = evt.c($$0);
      int $$2 = 0;
      iz $$3 = this.dp();
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

      evt $$8 = cel.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.a(0.5F);
         this.bR.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public iz s() {
      return this.cL;
   }

   public boolean u() {
      return this.cL != null;
   }

   public void i(iz $$0) {
      this.cL = $$0;
   }

   @bad
   public int y() {
      return Math.max(this.cO.d, this.cP.d);
   }

   @bad
   public List<iz> gq() {
      return this.cO.f;
   }

   private boolean gF() {
      return this.cE > 3600;
   }

   boolean gG() {
      if (this.cF <= 0 && !this.cN.l() && !this.gB() && this.p() == null) {
         boolean $$0 = this.gF() || this.dP().ad() || this.dP().S() || this.gA();
         return $$0 && !this.gI();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cF = $$0;
   }

   public float G(float $$0) {
      return ayz.i($$0, this.cC, this.cB);
   }

   private void gH() {
      this.cC = this.cB;
      if (this.gN()) {
         this.cB = Math.min(1.0F, this.cB + 0.2F);
      } else {
         this.cB = Math.max(0.0F, this.cB - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gB();
      if (this.bh()) {
         this.cQ++;
      } else {
         this.cQ = 0;
      }

      if (this.cQ > 20) {
         this.a(this.dQ().h(), 1.0F);
      }

      if ($$0) {
         this.cD++;
         if (this.cD % 5 == 0 && this.ah.a(ayz.a(1200 - this.cD, 1, 1200)) == 0) {
            this.a(this.dQ().n(), this.eA());
         }
      }

      if (!this.gA()) {
         this.cE++;
      }

      if (!this.dP().B) {
         this.a((arf)this.dP(), false);
      }
   }

   public void gw() {
      this.cE = 0;
   }

   private boolean gI() {
      if (this.cM == null) {
         return false;
      } else {
         dpj $$0 = this.dP().c_(this.cM);
         return $$0 instanceof dpg && ((dpg)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.ao.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cj, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cA;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cA = $$0;
   }

   @Override
   public void c() {
      this.a(cz.a(this.ah));
   }

   private boolean l(iz $$0) {
      dpj $$1 = this.dP().c_($$0);
      return $$1 instanceof dpg ? !((dpg)$$1).d() : false;
   }

   @bad
   public boolean gx() {
      return this.cM != null;
   }

   @Nullable
   @bad
   public iz gy() {
      return this.cM;
   }

   @bad
   public caq gz() {
      return this.bS;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   int gJ() {
      return this.cG;
   }

   private void gK() {
      this.cG = 0;
   }

   void gL() {
      this.cG++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.cF > 0) {
            this.cF--;
         }

         if (this.cI > 0) {
            this.cI--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         boolean $$0 = this.Z_() && !this.gB() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gM()) {
            this.cM = null;
         }
      }
   }

   boolean gM() {
      if (!this.gx()) {
         return false;
      } else if (this.m(this.cM)) {
         return false;
      } else {
         dpj $$0 = this.dP().c_(this.cM);
         return $$0 != null && $$0.r() == dpl.H;
      }
   }

   public boolean gA() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gw();
      }

      this.d(8, $$0);
   }

   public boolean gB() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gN() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(iz $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(ci, (byte)(this.ao.a(ci) | $$0));
      } else {
         this.ao.a(ci, (byte)(this.ao.a(ci) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.ao.a(ci) & $$0) != 0;
   }

   public static buy.a gC() {
      return btt.A().a(buz.q, 10.0).a(buz.j, 0.6F).a(buz.r, 0.3F).a(buz.c, 2.0).a(buz.k, 48.0);
   }

   @Override
   protected cdd b(dca $$0) {
      cdb $$1 = new cdb(this, $$0) {
         @Override
         public boolean a(iz $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cfi.this.cN.l()) {
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
   public boolean o(cur $$0) {
      return $$0.a(awy.aj);
   }

   boolean n(iz $$0) {
      return this.dP().p($$0) && this.dP().a_($$0).a(awp.U);
   }

   @Override
   protected void b(iz $$0, dse $$1) {
   }

   @Override
   protected avz v() {
      return null;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.bP;
   }

   @Override
   protected avz o_() {
      return awa.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cfi b(arf $$0, bsq $$1) {
      return btc.h.a((dca)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dse $$2, iz $$3) {
   }

   @Override
   public boolean aV() {
      return this.gD() && this.ai % bZ == 0;
   }

   @Override
   public boolean gD() {
      return !this.aE();
   }

   public void gE() {
      this.w(false);
      this.gK();
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.cN.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axf<enw> $$0) {
      this.h(this.ds().b(0.0, 0.01, 0.0));
   }

   @Override
   public evt cM() {
      return new evt(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.2F));
   }

   boolean b(iz $$0, int $$1) {
      return $$0.a(this.dp(), (double)$$1);
   }

   public void j(iz $$0) {
      this.cM = $$0;
   }

   abstract class a extends cap {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cfi.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !cfi.this.Z_();
      }
   }

   class b extends caz {
      b(final bua $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cfi.this.Z_() && !cfi.this.gB();
      }

      @Override
      public boolean b() {
         return super.b() && cfi.this.Z_() && !cfi.this.gB();
      }
   }

   static class c extends cci<cmz> {
      c(cfi $$0) {
         super($$0, cmz.class, 10, true, false, $$0::a_);
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
         cfi $$0 = (cfi)this.e;
         return $$0.Z_() && !$$0.gB();
      }
   }

   class d extends cfi.a {
      @Override
      public boolean h() {
         if (cfi.this.gx() && cfi.this.gG() && cfi.this.cM.a(cfi.this.dn(), 2.0) && cfi.this.dP().c_(cfi.this.cM) instanceof dpg $$1) {
            if (!$$1.d()) {
               return true;
            }

            cfi.this.cM = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cfi.this.dP().c_(cfi.this.cM) instanceof dpg $$1) {
            $$1.a(cfi.this);
         }
      }
   }

   @bad
   public class e extends cfi.a {
      public static final int b = 600;
      int d = cfi.this.dP().z.a(10);
      private static final int e = 3;
      final List<iz> f = Lists.newArrayList();
      @Nullable
      private eol g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean h() {
         return cfi.this.cM != null && !cfi.this.gb() && cfi.this.gG() && !this.d(cfi.this.cM) && cfi.this.dP().a_(cfi.this.cM).a(awp.aG);
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
         cfi.this.bR.n();
         cfi.this.bR.g();
      }

      @Override
      public void e() {
         if (cfi.this.cM != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cfi.this.bR.m()) {
               if (!cfi.this.b(cfi.this.cM, 16)) {
                  if (cfi.this.m(cfi.this.cM)) {
                     this.m();
                  } else {
                     cfi.this.k(cfi.this.cM);
                  }
               } else {
                  boolean $$0 = this.a(cfi.this.cM);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cfi.this.bR.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cfi.this.bR.j();
                  }
               }
            }
         }
      }

      private boolean a(iz $$0) {
         cfi.this.bR.a(10.0F);
         cfi.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cfi.this.bR.j() != null && cfi.this.bR.j().j();
      }

      boolean b(iz $$0) {
         return this.f.contains($$0);
      }

      private void c(iz $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cfi.this.cM != null) {
            this.c(cfi.this.cM);
         }

         this.m();
      }

      private void m() {
         cfi.this.cM = null;
         cfi.this.cI = 200;
      }

      private boolean d(iz $$0) {
         if (cfi.this.b($$0, 2)) {
            return true;
         } else {
            eol $$1 = cfi.this.bR.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cfi.a {
      private static final int c = 600;
      int d = cfi.this.dP().z.a(10);

      f() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean h() {
         return cfi.this.cL != null && !cfi.this.gb() && this.k() && cfi.this.n(cfi.this.cL) && !cfi.this.b(cfi.this.cL, 2);
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
         cfi.this.bR.n();
         cfi.this.bR.g();
      }

      @Override
      public void e() {
         if (cfi.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cfi.this.cL = null;
            } else if (!cfi.this.bR.m()) {
               if (cfi.this.m(cfi.this.cL)) {
                  cfi.this.cL = null;
               } else {
                  cfi.this.k(cfi.this.cL);
               }
            }
         }
      }

      private boolean k() {
         return cfi.this.cE > 2400;
      }
   }

   class g extends cfi.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cfi.this.gJ() >= 10) {
            return false;
         } else {
            return cfi.this.ah.i() < 0.3F ? false : cfi.this.gA() && cfi.this.gM();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cfi.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iz $$1 = cfi.this.dp().c($$0);
               dse $$2 = cfi.this.dP().a_($$1);
               dfb $$3 = $$2.b();
               dse $$4 = null;
               if ($$2.a(awp.aI)) {
                  if ($$3 instanceof dgw) {
                     dgw $$5 = (dgw)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dmx) {
                     int $$6 = $$2.c(dmx.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dmx.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfd.oi)) {
                     int $$7 = $$2.c(dne.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dne.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfd.sv) || $$2.a(dfd.sw)) {
                     ((dfe)$$2.b()).a((arf)cfi.this.dP(), cfi.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cfi.this.dP().c(2011, $$1, 15);
                     cfi.this.dP().b($$1, $$4);
                     cfi.this.gL();
                  }
               }
            }
         }
      }
   }

   class h extends cch {
      h(final cfi $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cfi.this.Z_() && super.b();
      }

      @Override
      protected void a(btt $$0, btr $$1) {
         if ($$0 instanceof cfi && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cfi.a {
      @Override
      public boolean h() {
         return cfi.this.cI == 0 && !cfi.this.gx() && cfi.this.gG();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cfi.this.cI = 200;
         List<iz> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iz $$1 : $$0) {
               if (!cfi.this.cO.b($$1)) {
                  cfi.this.cM = $$1;
                  return;
               }
            }

            cfi.this.cO.k();
            cfi.this.cM = $$0.get(0);
         }
      }

      private List<iz> k() {
         iz $$0 = cfi.this.dp();
         cev $$1 = ((arf)cfi.this.dP()).y();
         Stream<cew> $$2 = $$1.c($$0x -> $$0x.a(axa.c), $$0, 20, cev.b.c);
         return $$2.map(cew::f).filter(cfi.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bzr {
      j(final btt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfi.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfi.this.cN.l();
      }
   }

   class k extends cfi.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dse> f = $$0 -> {
         if ($$0.b(dsu.C) && $$0.c(dsu.C)) {
            return false;
         } else if ($$0.a(awp.U)) {
            return $$0.a(dfd.iD) ? $$0.c(dhj.b) == dta.a : true;
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
      private evt o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean h() {
         if (cfi.this.cK > 0) {
            return false;
         } else if (cfi.this.gA()) {
            return false;
         } else if (cfi.this.dP().ad()) {
            return false;
         } else {
            Optional<iz> $$0 = this.p();
            if ($$0.isPresent()) {
               cfi.this.cL = $$0.get();
               cfi.this.bR.a((double)cfi.this.cL.u() + 0.5, (double)cfi.this.cL.v() + 0.5, (double)cfi.this.cL.w() + 0.5, 1.2F);
               return true;
            } else {
               cfi.this.cK = ayz.a(cfi.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cfi.this.u()) {
            return false;
         } else if (cfi.this.dP().ad()) {
            return false;
         } else if (this.k()) {
            return cfi.this.ah.i() < 0.2F;
         } else if (cfi.this.ai % 20 == 0 && !cfi.this.n(cfi.this.cL)) {
            cfi.this.cL = null;
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
         cfi.this.gw();
      }

      @Override
      public void d() {
         if (this.k()) {
            cfi.this.w(true);
         }

         this.n = false;
         cfi.this.bR.n();
         cfi.this.cK = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cfi.this.cL = null;
         } else {
            evt $$0 = evt.c(cfi.this.cL).b(0.0, 0.6F, 0.0);
            if ($$0.f(cfi.this.dn()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cfi.this.dn().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cfi.this.cL = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cfi.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new evt($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cfi.this.bR.n();
                     } else {
                        $$2 = false;
                     }

                     cfi.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cfi.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cfi.this.a(awa.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cfi.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cfi.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iz> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<iz> a(Predicate<dse> $$0, double $$1) {
         iz $$2 = cfi.this.dp();
         iz.a $$3 = new iz.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cfi.this.dP().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends cap {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         return cfi.this.bR.l() && cfi.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cfi.this.bR.m();
      }

      @Override
      public void c() {
         evt $$0 = this.h();
         if ($$0 != null) {
            cfi.this.bR.a(cfi.this.bR.a(iz.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private evt h() {
         evt $$1;
         if (cfi.this.gM() && !cfi.this.b(cfi.this.cM, 22)) {
            evt $$0 = evt.b(cfi.this.cM);
            $$1 = $$0.d(cfi.this.dn()).d();
         } else {
            $$1 = cfi.this.f(0.0F);
         }

         int $$3 = 8;
         evt $$4 = ceo.a(cfi.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cek.a(cfi.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
