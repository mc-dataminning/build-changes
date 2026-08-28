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

public class chy extends chx implements bwl, cig {
   public static final float bZ = 120.32113F;
   public static final int ca = bae.f(1.4959966F);
   private static final alc<Byte> cj = alg.a(chy.class, ale.a);
   private static final alc<Integer> ck = alg.a(chy.class, ale.b);
   private static final int cl = 2;
   private static final int cm = 4;
   private static final int cn = 8;
   private static final int co = 1200;
   private static final int cp = 600;
   private static final int cq = 3600;
   private static final int cr = 4;
   private static final int cs = 10;
   private static final int ct = 10;
   private static final int cu = 18;
   private static final int cv = 48;
   private static final int cw = 2;
   private static final int cx = 24;
   private static final int cy = 16;
   private static final int cz = 16;
   private static final int cC = 20;
   public static final String cb = "CropsGrownSincePollination";
   public static final String cd = "CannotEnterHiveTicks";
   public static final String ce = "TicksSincePollination";
   public static final String cf = "HasStung";
   public static final String cg = "HasNectar";
   public static final String ch = "flower_pos";
   public static final String ci = "hive_pos";
   private static final bsu cD = bbg.a(20, 39);
   @Nullable
   private UUID cE;
   private float cF;
   private float cG;
   private int cH;
   int cI;
   private int cJ;
   private int cK;
   private static final int cL = 200;
   int cM;
   private static final int cN = 200;
   private static final int cO = 20;
   private static final int cP = 60;
   int cQ = bae.a(this.ae, 20, 60);
   @Nullable
   jh cR;
   @Nullable
   jh cS;
   chy.k cT;
   chy.e cU;
   private chy.f cV;
   private int cW;

   public chy(bvr<? extends chy> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cce(this, 20, true);
      this.bP = new chy.j(this);
      this.a(euo.n, -1.0F);
      this.a(euo.j, -1.0F);
      this.a(euo.k, 16.0F);
      this.a(euo.x, -1.0F);
      this.a(euo.h, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, 0);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new chy.b(this, 1.4F, true));
      this.bT.a(1, new chy.d());
      this.bT.a(2, new ccq(this, 1.0));
      this.bT.a(3, new cem(this, 1.25, $$0 -> $$0.a(ayd.ao), false));
      this.bT.a(3, new chy.n());
      this.bT.a(3, new chy.m());
      this.cT = new chy.k();
      this.bT.a(4, this.cT);
      this.bT.a(5, new cdd(this, 1.25));
      this.bT.a(5, new chy.i());
      this.cU = new chy.e();
      this.bT.a(5, this.cU);
      this.cV = new chy.f();
      this.bT.a(6, this.cV);
      this.bT.a(7, new chy.g());
      this.bT.a(8, new chy.l());
      this.bT.a(9, new ccy(this));
      this.bU.a(1, new chy.h(this).a(new Class[0]));
      this.bU.a(2, new chy.c(this));
      this.bU.a(3, new cfd<>(this, true));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("hive_pos", vm.a(this.gr()));
      }

      if (this.t()) {
         $$0.a("flower_pos", vm.a(this.p()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cI);
      $$0.a("CannotEnterHiveTicks", this.cJ);
      $$0.a("CropsGrownSincePollination", this.cK);
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cI = $$0.h("TicksSincePollination");
      this.cJ = $$0.h("CannotEnterHiveTicks");
      this.cK = $$0.h("CropsGrownSincePollination");
      this.cS = vm.a($$0, "hive_pos").orElse(null);
      this.cR = vm.a($$0, "flower_pos").orElse(null);
      this.a(this.dW(), $$0);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      bua $$2 = this.dX().a((bwg)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxo.c)));
      if ($$3) {
         deb.a($$0, $$1, $$2);
         if ($$1 instanceof bwg $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dW().al() == btg.c) {
               $$5 = 10;
            } else if (this.dW().al() == btg.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bup(bur.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.af_();
         this.a(axf.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gA() && this.gL() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dW(), this.dB() - 0.3F, this.dB() + 0.3F, this.dH() - 0.3F, this.dH() + 0.3F, this.e(0.5), ls.az);
         }
      }

      this.gJ();
   }

   private void a(dhi $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      fby $$1 = fby.c($$0);
      int $$2 = 0;
      jh $$3 = this.dw();
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

      fby $$8 = cha.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bS.b(0.5F);
         this.bS.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jh p() {
      return this.cR;
   }

   public boolean t() {
      return this.cR != null;
   }

   public void h(jh $$0) {
      this.cR = $$0;
   }

   @bbl
   public int x() {
      return Math.max(this.cU.d, this.cV.d);
   }

   @bbl
   public List<jh> go() {
      return this.cU.f;
   }

   private boolean gF() {
      return this.cI > 3600;
   }

   void gG() {
      this.cS = null;
      this.cM = 200;
   }

   void gH() {
      this.cR = null;
      this.cQ = bae.a(this.ae, 20, 60);
   }

   boolean gI() {
      if (this.cJ <= 0 && !this.cT.l() && !this.gB() && this.O_() == null) {
         boolean $$0 = this.gF() || c(this.dW()) || this.gA();
         return $$0 && !this.gK();
      } else {
         return false;
      }
   }

   public static boolean c(dhi $$0) {
      return $$0.G_().g() && ($$0.V() || $$0.af());
   }

   public void s(int $$0) {
      this.cJ = $$0;
   }

   public float J(float $$0) {
      return bae.h($$0, this.cG, this.cF);
   }

   private void gJ() {
      this.cG = this.cF;
      if (this.gQ()) {
         this.cF = Math.min(1.0F, this.cF + 0.2F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.24F);
      }
   }

   @Override
   protected void a(ash $$0) {
      boolean $$1 = this.gB();
      if (this.bm()) {
         this.cW++;
      } else {
         this.cW = 0;
      }

      if (this.cW > 20) {
         this.a($$0, this.dX().i(), 1.0F);
      }

      if ($$1) {
         this.cH++;
         if (this.cH % 5 == 0 && this.ae.a(bae.a(1200 - this.cH, 1, 1200)) == 0) {
            this.a($$0, this.dX().p(), this.eE());
         }
      }

      if (!this.gA()) {
         this.cI++;
      }

      this.a($$0, false);
   }

   public void gp() {
      this.cI = 0;
   }

   private boolean gK() {
      duu $$0 = this.gO();
      return $$0 != null && $$0.b();
   }

   @Override
   public int a() {
      return this.al.a(ck);
   }

   @Override
   public void a(int $$0) {
      this.al.a(ck, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cE;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cE = $$0;
   }

   @Override
   public void c() {
      this.a(cD.a(this.ae));
   }

   private boolean k(jh $$0) {
      dux $$1 = this.dW().c_($$0);
      return $$1 instanceof duu ? !((duu)$$1).d() : false;
   }

   @bbl
   public boolean gq() {
      return this.cS != null;
   }

   @Nullable
   @bbl
   public jh gr() {
      return this.cS;
   }

   @bbl
   public cdf gs() {
      return this.bT;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   int gL() {
      return this.cK;
   }

   private void gM() {
      this.cK = 0;
   }

   void gN() {
      this.cK++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         if (this.cJ > 0) {
            this.cJ--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         if (this.cQ > 0) {
            this.cQ--;
         }

         boolean $$0 = this.ad_() && !this.gB() && this.O_() != null && this.O_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gP()) {
            this.cS = null;
         }
      }
   }

   @Nullable
   duu gO() {
      if (this.cS == null) {
         return null;
      } else {
         return this.l(this.cS) ? null : this.dW().a(this.cS, duz.I).orElse(null);
      }
   }

   boolean gP() {
      return this.gO() != null;
   }

   public boolean gA() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gp();
      }

      this.d(8, $$0);
   }

   public boolean gB() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gQ() {
      return this.t(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jh $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(cj, (byte)(this.al.a(cj) | $$0));
      } else {
         this.al.a(cj, (byte)(this.al.a(cj) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(cj) & $$0) != 0;
   }

   public static bxn.a gC() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.l, 0.6F).a(bxo.v, 0.3F).a(bxo.c, 2.0);
   }

   @Override
   protected cfs b(dhi $$0) {
      cfq $$1 = new cfq(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!chy.this.cT.l()) {
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
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ao);
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
   }

   @Override
   protected axe u() {
      return null;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.bP;
   }

   @Override
   protected axe o_() {
      return axf.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public chy b(ash $$0, bvb $$1) {
      return bvr.l.a($$0, bvq.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   public boolean ba() {
      return this.gD() && this.af % ca == 0;
   }

   @Override
   public boolean gD() {
      return !this.aJ();
   }

   public void gE() {
      this.x(false);
      this.gM();
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cT.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(ayk<etw> $$0) {
      this.h(this.dz().b(0.0, 0.01, 0.0));
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dw(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cS = $$0;
   }

   abstract class a extends cde {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !chy.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !chy.this.ad_();
      }
   }

   class b extends cdo {
      b(final bwo $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && chy.this.ad_() && !chy.this.gB();
      }

      @Override
      public boolean c() {
         return super.c() && chy.this.ad_() && !chy.this.gB();
      }
   }

   static class c extends cex<cpx> {
      c(chy $$0) {
         super($$0, cpx.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.O_() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         chy $$0 = (chy)this.e;
         return $$0.ad_() && !$$0.gB();
      }
   }

   class d extends chy.a {
      @Override
      public boolean h() {
         if (chy.this.cS != null && chy.this.gI() && chy.this.cS.a(chy.this.du(), 2.0)) {
            duu $$0 = chy.this.gO();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               chy.this.cS = null;
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
         duu $$0 = chy.this.gO();
         if ($$0 != null) {
            $$0.a(chy.this);
         }
      }
   }

   @bbl
   public class e extends chy.a {
      public static final int b = 2400;
      int d = chy.this.dW().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private eul g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean h() {
         return chy.this.cS != null
            && !chy.this.l(chy.this.cS)
            && !chy.this.ga()
            && chy.this.gI()
            && !this.d(chy.this.cS)
            && chy.this.dW().a_(chy.this.cS).a(axu.aJ);
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
         chy.this.bS.o();
         chy.this.bS.h();
      }

      @Override
      public void a() {
         if (chy.this.cS != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!chy.this.bS.n()) {
               if (!chy.this.b(chy.this.cS, 16)) {
                  if (chy.this.l(chy.this.cS)) {
                     chy.this.gG();
                  } else {
                     chy.this.j(chy.this.cS);
                  }
               } else {
                  boolean $$0 = this.a(chy.this.cS);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && chy.this.bS.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        chy.this.gG();
                        this.i = 0;
                     }
                  } else {
                     this.g = chy.this.bS.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = chy.this.b($$0, 3) ? 1 : 2;
         chy.this.bS.b(10.0F);
         chy.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return chy.this.bS.k() != null && chy.this.bS.k().j();
      }

      boolean b(jh $$0) {
         return this.f.contains($$0);
      }

      private void c(jh $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (chy.this.cS != null) {
            this.c(chy.this.cS);
         }

         chy.this.gG();
      }

      private boolean d(jh $$0) {
         if (chy.this.b($$0, 2)) {
            return true;
         } else {
            eul $$1 = chy.this.bS.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends chy.a {
      private static final int c = 2400;
      int d = chy.this.dW().A.a(10);

      f() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean h() {
         return chy.this.cR != null && !chy.this.ga() && this.k() && !chy.this.b(chy.this.cR, 2);
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
         chy.this.bS.o();
         chy.this.bS.h();
      }

      @Override
      public void a() {
         if (chy.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               chy.this.gH();
            } else if (!chy.this.bS.n()) {
               if (chy.this.l(chy.this.cR)) {
                  chy.this.gH();
               } else {
                  chy.this.j(chy.this.cR);
               }
            }
         }
      }

      private boolean k() {
         return chy.this.cI > 600;
      }
   }

   class g extends chy.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (chy.this.gL() >= 10) {
            return false;
         } else {
            return chy.this.ae.i() < 0.3F ? false : chy.this.gA() && chy.this.gP();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (chy.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = chy.this.dw().c($$0);
               dxv $$2 = chy.this.dW().a_($$1);
               dkm $$3 = $$2.b();
               dxv $$4 = null;
               if ($$2.a(axu.aL)) {
                  if ($$3 instanceof dmj) {
                     dmj $$5 = (dmj)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dsl) {
                     int $$6 = $$2.c(dsl.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dsl.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dko.oD)) {
                     int $$7 = $$2.c(dss.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dss.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dko.sQ) || $$2.a(dko.sR)) {
                     dkp $$8 = (dkp)$$2.b();
                     if ($$8.b(chy.this.dW(), $$1, $$2)) {
                        $$8.a((ash)chy.this.dW(), chy.this.ae, $$1, $$2);
                        $$4 = chy.this.dW().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     chy.this.dW().c(2011, $$1, 15);
                     chy.this.dW().b($$1, $$4);
                     chy.this.gN();
                  }
               }
            }
         }
      }
   }

   class h extends cew {
      h(final chy $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return chy.this.ad_() && super.c();
      }

      @Override
      protected void a(bwi $$0, bwg $$1) {
         if ($$0 instanceof chy && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends chy.a {
      @Override
      public boolean h() {
         return chy.this.cM == 0 && !chy.this.gq() && chy.this.gI();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         chy.this.cM = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!chy.this.cU.b($$1)) {
                  chy.this.cS = $$1;
                  return;
               }
            }

            chy.this.cU.k();
            chy.this.cS = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = chy.this.dw();
         chk $$1 = ((ash)chy.this.dW()).z();
         Stream<chl> $$2 = $$1.c($$0x -> $$0x.a(ayf.c), $$0, 20, chk.b.c);
         return $$2.map(chl::g).filter(chy.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ccg {
      j(final bwi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chy.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chy.this.cT.l();
      }
   }

   class k extends chy.a {
      private static final int c = 400;
      private final Predicate<dxv> d = $$0 -> {
         if ($$0.b(dyl.D) && $$0.c(dyl.D)) {
            return false;
         } else if ($$0.a(axu.W)) {
            return $$0.a(dko.iU) ? $$0.c(dmw.b) == dyq.a : true;
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
      private fby n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean h() {
         if (chy.this.cQ > 0) {
            return false;
         } else if (chy.this.gA()) {
            return false;
         } else if (chy.this.dW().af()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               chy.this.cR = $$0.get();
               chy.this.bS.a((double)chy.this.cR.u() + 0.5, (double)chy.this.cR.v() + 0.5, (double)chy.this.cR.w() + 0.5, 1.2F);
               return true;
            } else {
               chy.this.cQ = bae.a(chy.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!chy.this.t()) {
            return false;
         } else if (chy.this.dW().af()) {
            return false;
         } else {
            return this.k() ? chy.this.ae.i() < 0.2F : true;
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
         chy.this.gp();
      }

      @Override
      public void e() {
         if (this.k()) {
            chy.this.x(true);
         }

         this.m = false;
         chy.this.bS.o();
         chy.this.cQ = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (chy.this.t()) {
            this.o++;
            if (this.o > 600) {
               chy.this.gH();
               this.m = false;
               chy.this.cQ = 200;
            } else {
               fby $$0 = fby.c(chy.this.cR).b(0.0, 0.6F, 0.0);
               if ($$0.f(chy.this.du()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = chy.this.du().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     chy.this.gH();
                  } else {
                     if ($$1) {
                        boolean $$3 = chy.this.ae.a(25) == 0;
                        if ($$3) {
                           this.n = new fby($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           chy.this.bS.o();
                        } else {
                           $$2 = false;
                        }

                        chy.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (chy.this.ae.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        chy.this.a(axf.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         chy.this.I().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (chy.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(chy.this.dw(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (chy.this.dW().ac() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(chy.this.dW().a_($$2))) {
               eul $$4 = chy.this.bS.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), chy.this.dW().ac() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cde {
      l() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         return chy.this.bS.m() && chy.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return chy.this.bS.n();
      }

      @Override
      public void d() {
         fby $$0 = this.h();
         if ($$0 != null) {
            chy.this.bS.a(chy.this.bS.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fby h() {
         fby $$1;
         if (chy.this.gP() && !chy.this.b(chy.this.cS, this.i())) {
            fby $$0 = fby.b(chy.this.cS);
            $$1 = $$0.d(chy.this.du()).d();
         } else {
            $$1 = chy.this.g(0.0F);
         }

         int $$3 = 8;
         fby $$4 = chd.a(chy.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cgz.a(chy.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !chy.this.gq() && !chy.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends chy.a {
      private final int c = bae.a(chy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chy.this.cR != null && chy.this.dW().p(chy.this.cR) && !this.a(chy.this.cR)) {
            chy.this.gH();
         }

         this.d = chy.this.dW().ac();
      }

      @Override
      public boolean h() {
         return chy.this.dW().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return chy.this.dW().a_($$0).a(axu.W);
      }
   }

   class n extends chy.a {
      private final int c = bae.a(chy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chy.this.cS != null && chy.this.dW().p(chy.this.cS) && !chy.this.gP()) {
            chy.this.gG();
         }

         this.d = chy.this.dW().ac();
      }

      @Override
      public boolean h() {
         return chy.this.dW().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
