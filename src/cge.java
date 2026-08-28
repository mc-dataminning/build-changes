import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cge extends cgd implements bus, cgm {
   public static final float bY = 120.32113F;
   public static final int bZ = azf.f(1.4959966F);
   private static final akh<Byte> ci = akl.a(cge.class, akj.a);
   private static final akh<Integer> cj = akl.a(cge.class, akj.b);
   private static final int ck = 2;
   private static final int cl = 4;
   private static final int cm = 8;
   private static final int cn = 1200;
   private static final int co = 600;
   private static final int cp = 3600;
   private static final int cq = 4;
   private static final int cr = 10;
   private static final int cs = 10;
   private static final int ct = 18;
   private static final int cu = 48;
   private static final int cv = 2;
   private static final int cw = 24;
   private static final int cx = 16;
   private static final int cy = 16;
   private static final int cA = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final brd cB = bag.a(20, 39);
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
   private static final int cM = 20;
   private static final int cN = 60;
   int cO = azf.a(this.af, 20, 60);
   @Nullable
   jf cP;
   @Nullable
   jf cQ;
   cge.k cR;
   cge.e cS;
   private cge.f cT;
   private int cU;

   public cge(bty<? extends cge> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cak(this, 20, true);
      this.bO = new cge.j(this);
      this.a(erk.n, -1.0F);
      this.a(erk.j, -1.0F);
      this.a(erk.k, 16.0F);
      this.a(erk.x, -1.0F);
      this.a(erk.h, -1.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cge.b(this, 1.4F, true));
      this.bS.a(1, new cge.d());
      this.bS.a(2, new caw(this, 1.0));
      this.bS.a(3, new ccs(this, 1.25, $$0 -> $$0.a(axe.aj), false));
      this.bS.a(3, new cge.n());
      this.bS.a(3, new cge.m());
      this.cR = new cge.k();
      this.bS.a(4, this.cR);
      this.bS.a(5, new cbj(this, 1.25));
      this.bS.a(5, new cge.i());
      this.cS = new cge.e();
      this.bS.a(5, this.cS);
      this.cT = new cge.f();
      this.bS.a(6, this.cT);
      this.bS.a(7, new cge.g());
      this.bS.a(8, new cge.l());
      this.bS.a(9, new cbe(this));
      this.bT.a(1, new cge.h(this).a(new Class[0]));
      this.bT.a(2, new cge.c(this));
      this.bT.a(3, new cdj<>(this, true));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("hive_pos", uv.a(this.gr()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uv.a(this.q()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.a_($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.cQ = uv.a($$0, "hive_pos").orElse(null);
      this.cP = uv.a($$0, "flower_pos").orElse(null);
      this.a(this.dS(), $$0);
   }

   @Override
   public boolean E(btr $$0) {
      bsj $$1 = this.dT().a((bun)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bvu.c)));
      if ($$2) {
         if (this.dS() instanceof arj $$3) {
            dbp.a($$3, $$0, $$1);
         }

         if ($$0 instanceof bun $$4) {
            $$4.q($$4.eT() + 1);
            int $$5 = 0;
            if (this.dS().am() == brp.c) {
               $$5 = 10;
            } else if (this.dS().am() == brp.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bsy(bta.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.Z_();
         this.a(awg.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gA() && this.gL() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dS(), this.dx() - 0.3F, this.dx() + 0.3F, this.dD() - 0.3F, this.dD() + 0.3F, this.e(0.5), lo.ay);
         }
      }

      this.gJ();
   }

   private void a(dej $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lm $$6) {
      $$0.a($$6, azf.d($$0.z.j(), $$1, $$2), $$5, azf.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jf $$0) {
      eyw $$1 = eyw.c($$0);
      int $$2 = 0;
      jf $$3 = this.ds();
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

      eyw $$8 = cfg.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jf q() {
      return this.cP;
   }

   public boolean t() {
      return this.cP != null;
   }

   public void h(jf $$0) {
      this.cP = $$0;
   }

   @bal
   public int y() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @bal
   public List<jf> go() {
      return this.cS.f;
   }

   private boolean gF() {
      return this.cG > 3600;
   }

   void gG() {
      this.cQ = null;
      this.cK = 200;
   }

   void gH() {
      this.cP = null;
      this.cO = azf.a(this.af, 20, 60);
   }

   boolean gI() {
      if (this.cH <= 0 && !this.cR.l() && !this.gB() && this.m() == null) {
         boolean $$0 = this.gF() || c(this.dS()) || this.gA();
         return $$0 && !this.gK();
      } else {
         return false;
      }
   }

   public static boolean c(dej $$0) {
      return $$0.C_().g() && ($$0.T() || $$0.ae());
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float J(float $$0) {
      return azf.h($$0, this.cE, this.cD);
   }

   private void gJ() {
      this.cE = this.cD;
      if (this.gP()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void ac() {
      boolean $$0 = this.gB();
      if (this.bl()) {
         this.cU++;
      } else {
         this.cU = 0;
      }

      if (this.cU > 20) {
         this.a(this.dT().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.af.a(azf.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dT().p(), this.eB());
         }
      }

      if (!this.gA()) {
         this.cG++;
      }

      if (!this.dS().B) {
         this.a((arj)this.dS(), false);
      }
   }

   public void gp() {
      this.cG = 0;
   }

   private boolean gK() {
      if (this.cQ == null) {
         return false;
      } else {
         drv $$0 = this.dS().c_(this.cQ);
         return $$0 instanceof drs && ((drs)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.am.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.am.a(cj, $$0);
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
      this.a(cB.a(this.af));
   }

   private boolean k(jf $$0) {
      drv $$1 = this.dS().c_($$0);
      return $$1 instanceof drs ? !((drs)$$1).d() : false;
   }

   @bal
   public boolean gq() {
      return this.cQ != null;
   }

   @Nullable
   @bal
   public jf gr() {
      return this.cQ;
   }

   @bal
   public cbl gs() {
      return this.bS;
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   int gL() {
      return this.cI;
   }

   private void gM() {
      this.cI = 0;
   }

   void gN() {
      this.cI++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cO > 0) {
            this.cO--;
         }

         boolean $$0 = this.ad_() && !this.gB() && this.m() != null && this.m().g(this) < 4.0;
         this.z($$0);
         if (this.ag % 20 == 0 && !this.gO()) {
            this.cQ = null;
         }
      }
   }

   boolean gO() {
      if (!this.gq()) {
         return false;
      } else if (this.l(this.cQ)) {
         return false;
      } else {
         drv $$0 = this.dS().c_(this.cQ);
         return $$0 != null && $$0.q() == drx.H;
      }
   }

   public boolean gA() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gp();
      }

      this.d(8, $$0);
   }

   public boolean gB() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gP() {
      return this.u(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jf $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(ci, (byte)(this.am.a(ci) | $$0));
      } else {
         this.am.a(ci, (byte)(this.am.a(ci) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.a(ci) & $$0) != 0;
   }

   public static bvt.a gC() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.l, 0.6F).a(bvu.v, 0.3F).a(bvu.c, 2.0);
   }

   @Override
   protected cdy b(dej $$0) {
      cdw $$1 = new cdw(this, $$0) {
         @Override
         public boolean a(jf $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cge.this.cR.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.aj);
   }

   @Override
   protected void b(jf $$0, dus $$1) {
   }

   @Override
   protected awf w() {
      return null;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.bP;
   }

   @Override
   protected awf o_() {
      return awg.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cge b(arj $$0, btk $$1) {
      return bty.h.a($$0, btx.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   public boolean aZ() {
      return this.gD() && this.ag % bZ == 0;
   }

   @Override
   public boolean gD() {
      return !this.aH();
   }

   public void gE() {
      this.x(false);
      this.gM();
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.cR.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axl<eqs> $$0) {
      this.h(this.dv().b(0.0, 0.01, 0.0));
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.2F));
   }

   boolean b(jf $$0, int $$1) {
      return $$0.a(this.ds(), (double)$$1);
   }

   public void i(jf $$0) {
      this.cQ = $$0;
   }

   abstract class a extends cbk {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cge.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !cge.this.ad_();
      }
   }

   class b extends cbu {
      b(final buv $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cge.this.ad_() && !cge.this.gB();
      }

      @Override
      public boolean c() {
         return super.c() && cge.this.ad_() && !cge.this.gB();
      }
   }

   static class c extends cdd<cnx> {
      c(cge $$0) {
         super($$0, cnx.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.m() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cge $$0 = (cge)this.e;
         return $$0.ad_() && !$$0.gB();
      }
   }

   class d extends cge.a {
      @Override
      public boolean h() {
         if (cge.this.gq() && cge.this.gI() && cge.this.cQ.a(cge.this.dq(), 2.0) && cge.this.dS().c_(cge.this.cQ) instanceof drs $$1) {
            if (!$$1.d()) {
               return true;
            }

            cge.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cge.this.dS().c_(cge.this.cQ) instanceof drs $$1) {
            $$1.a(cge.this);
         }
      }
   }

   @bal
   public class e extends cge.a {
      public static final int b = 2400;
      int d = cge.this.dS().z.a(10);
      private static final int e = 3;
      final List<jf> f = Lists.newArrayList();
      @Nullable
      private erh g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean h() {
         return cge.this.cQ != null && !cge.this.gc() && cge.this.gI() && !this.d(cge.this.cQ) && cge.this.dS().a_(cge.this.cQ).a(awv.aH);
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
         cge.this.bR.o();
         cge.this.bR.h();
      }

      @Override
      public void a() {
         if (cge.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cge.this.bR.n()) {
               if (!cge.this.b(cge.this.cQ, 16)) {
                  if (cge.this.l(cge.this.cQ)) {
                     cge.this.gG();
                  } else {
                     cge.this.j(cge.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cge.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cge.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cge.this.gG();
                        this.i = 0;
                     }
                  } else {
                     this.g = cge.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(jf $$0) {
         int $$1 = cge.this.b(cge.this.cQ, 3) ? 1 : 2;
         cge.this.bR.b(10.0F);
         cge.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cge.this.bR.k() != null && cge.this.bR.k().j();
      }

      boolean b(jf $$0) {
         return this.f.contains($$0);
      }

      private void c(jf $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cge.this.cQ != null) {
            this.c(cge.this.cQ);
         }

         cge.this.gG();
      }

      private boolean d(jf $$0) {
         if (cge.this.b($$0, 2)) {
            return true;
         } else {
            erh $$1 = cge.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cge.a {
      private static final int c = 2400;
      int d = cge.this.dS().z.a(10);

      f() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean h() {
         return cge.this.cP != null && !cge.this.gc() && this.k() && !cge.this.b(cge.this.cP, 2);
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
         cge.this.bR.o();
         cge.this.bR.h();
      }

      @Override
      public void a() {
         if (cge.this.cP != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cge.this.gH();
            } else if (!cge.this.bR.n()) {
               if (cge.this.l(cge.this.cP)) {
                  cge.this.gH();
               } else {
                  cge.this.j(cge.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cge.this.cG > 600;
      }
   }

   class g extends cge.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cge.this.gL() >= 10) {
            return false;
         } else {
            return cge.this.af.i() < 0.3F ? false : cge.this.gA() && cge.this.gO();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cge.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jf $$1 = cge.this.ds().c($$0);
               dus $$2 = cge.this.dS().a_($$1);
               dhm $$3 = $$2.b();
               dus $$4 = null;
               if ($$2.a(awv.aJ)) {
                  if ($$3 instanceof djh) {
                     djh $$5 = (djh)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dpj) {
                     int $$6 = $$2.c(dpj.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dpj.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dho.oi)) {
                     int $$7 = $$2.c(dpq.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dpq.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dho.sv) || $$2.a(dho.sw)) {
                     dhp $$8 = (dhp)$$2.b();
                     if ($$8.b(cge.this.dS(), $$1, $$2)) {
                        $$8.a((arj)cge.this.dS(), cge.this.af, $$1, $$2);
                        $$4 = cge.this.dS().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cge.this.dS().c(2011, $$1, 15);
                     cge.this.dS().b($$1, $$4);
                     cge.this.gN();
                  }
               }
            }
         }
      }
   }

   class h extends cdc {
      h(final cge $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cge.this.ad_() && super.c();
      }

      @Override
      protected void a(bup $$0, bun $$1) {
         if ($$0 instanceof cge && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cge.a {
      @Override
      public boolean h() {
         return cge.this.cK == 0 && !cge.this.gq() && cge.this.gI();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cge.this.cK = 200;
         List<jf> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jf $$1 : $$0) {
               if (!cge.this.cS.b($$1)) {
                  cge.this.cQ = $$1;
                  return;
               }
            }

            cge.this.cS.k();
            cge.this.cQ = $$0.get(0);
         }
      }

      private List<jf> k() {
         jf $$0 = cge.this.ds();
         cfq $$1 = ((arj)cge.this.dS()).y();
         Stream<cfr> $$2 = $$1.c($$0x -> $$0x.a(axg.c), $$0, 20, cfq.b.c);
         return $$2.map(cfr::g).filter(cge.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cam {
      j(final bup $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cge.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cge.this.cR.l();
      }
   }

   class k extends cge.a {
      private static final int c = 400;
      private final Predicate<dus> d = $$0 -> {
         if ($$0.b(dvi.C) && $$0.c(dvi.C)) {
            return false;
         } else if ($$0.a(awv.V)) {
            return $$0.a(dho.iD) ? $$0.c(dju.b) == dvo.a : true;
         } else {
            return false;
         }
      };
      private static final double e = 0.1;
      private static final int f = 25;
      private static final float g = 0.35F;
      private static final float h = 0.6F;
      private static final float i = 0.33333334F;
      private static final int j = 5;
      private int k;
      private int l;
      private boolean m;
      @Nullable
      private eyw n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean h() {
         if (cge.this.cO > 0) {
            return false;
         } else if (cge.this.gA()) {
            return false;
         } else if (cge.this.dS().ae()) {
            return false;
         } else {
            Optional<jf> $$0 = this.p();
            if ($$0.isPresent()) {
               cge.this.cP = $$0.get();
               cge.this.bR.a((double)cge.this.cP.u() + 0.5, (double)cge.this.cP.v() + 0.5, (double)cge.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cge.this.cO = azf.a(cge.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cge.this.t()) {
            return false;
         } else if (cge.this.dS().ae()) {
            return false;
         } else {
            return this.k() ? cge.this.af.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.k > 400;
      }

      boolean l() {
         return this.m;
      }

      void m() {
         this.m = false;
      }

      @Override
      public void d() {
         this.k = 0;
         this.o = 0;
         this.l = 0;
         this.m = true;
         cge.this.gp();
      }

      @Override
      public void e() {
         if (this.k()) {
            cge.this.x(true);
         }

         this.m = false;
         cge.this.bR.o();
         cge.this.cO = 200;
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         if (cge.this.t()) {
            this.o++;
            if (this.o > 600) {
               cge.this.gH();
               this.m = false;
               cge.this.cO = 200;
            } else {
               eyw $$0 = eyw.c(cge.this.cP).b(0.0, 0.6F, 0.0);
               if ($$0.f(cge.this.dq()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cge.this.dq().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cge.this.gH();
                  } else {
                     if ($$1) {
                        boolean $$3 = cge.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new eyw($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cge.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cge.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cge.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cge.this.a(awg.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cge.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cge.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jf> p() {
         Iterable<jf> $$0 = jf.a(cge.this.ds(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jf $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cge.this.dS().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cge.this.dS().a_($$2))) {
               erh $$4 = cge.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cge.this.dS().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cbk {
      l() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         return cge.this.bR.m() && cge.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cge.this.bR.n();
      }

      @Override
      public void d() {
         eyw $$0 = this.h();
         if ($$0 != null) {
            cge.this.bR.a(cge.this.bR.a(jf.a((jy)$$0), 1), 1.0);
         }
      }

      @Nullable
      private eyw h() {
         eyw $$1;
         if (cge.this.gO() && !cge.this.b(cge.this.cQ, this.i())) {
            eyw $$0 = eyw.b(cge.this.cQ);
            $$1 = $$0.d(cge.this.dq()).d();
         } else {
            $$1 = cge.this.g(0.0F);
         }

         int $$3 = 8;
         eyw $$4 = cfj.a(cge.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cff.a(cge.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cge.this.gq() && !cge.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cge.a {
      private final int c = azf.a(cge.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cge.this.cP != null && cge.this.dS().p(cge.this.cP) && !this.a(cge.this.cP)) {
            cge.this.gH();
         }

         this.d = cge.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cge.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jf $$0) {
         return cge.this.dS().a_($$0).a(awv.V);
      }
   }

   class n extends cge.a {
      private final int c = azf.a(cge.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cge.this.cQ != null && cge.this.dS().p(cge.this.cQ) && !cge.this.gO()) {
            cge.this.gG();
         }

         this.d = cge.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cge.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
