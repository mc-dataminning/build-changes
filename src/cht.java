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

public class cht extends chs implements bwg, cib {
   public static final float bZ = 120.32113F;
   public static final int ca = bae.f(1.4959966F);
   private static final alc<Byte> cj = alg.a(cht.class, ale.a);
   private static final alc<Integer> ck = alg.a(cht.class, ale.b);
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
   private static final bsp cD = bbg.a(20, 39);
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
   cht.k cT;
   cht.e cU;
   private cht.f cV;
   private int cW;

   public cht(bvm<? extends cht> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cbz(this, 20, true);
      this.bP = new cht.j(this);
      this.a(eug.n, -1.0F);
      this.a(eug.j, -1.0F);
      this.a(eug.k, 16.0F);
      this.a(eug.x, -1.0F);
      this.a(eug.h, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, 0);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new cht.b(this, 1.4F, true));
      this.bT.a(1, new cht.d());
      this.bT.a(2, new ccl(this, 1.0));
      this.bT.a(3, new ceh(this, 1.25, $$0 -> $$0.a(ayd.ao), false));
      this.bT.a(3, new cht.n());
      this.bT.a(3, new cht.m());
      this.cT = new cht.k();
      this.bT.a(4, this.cT);
      this.bT.a(5, new ccy(this, 1.25));
      this.bT.a(5, new cht.i());
      this.cU = new cht.e();
      this.bT.a(5, this.cU);
      this.cV = new cht.f();
      this.bT.a(6, this.cV);
      this.bT.a(7, new cht.g());
      this.bT.a(8, new cht.l());
      this.bT.a(9, new cct(this));
      this.bU.a(1, new cht.h(this).a(new Class[0]));
      this.bU.a(2, new cht.c(this));
      this.bU.a(3, new cey<>(this, true));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.go()) {
         $$0.a("hive_pos", vm.a(this.gp()));
      }

      if (this.t()) {
         $$0.a("flower_pos", vm.a(this.p()));
      }

      $$0.a("HasNectar", this.gy());
      $$0.a("HasStung", this.gz());
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
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      btv $$2 = this.dW().a((bwb)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxj.c)));
      if ($$3) {
         ddt.a($$0, $$1, $$2);
         if ($$1 instanceof bwb $$4) {
            $$4.p($$4.eU() + 1);
            int $$5 = 0;
            if (this.dV().al() == btb.c) {
               $$5 = 10;
            } else if (this.dV().al() == btb.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new buk(bum.s, $$5 * 20, 0), this);
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
      if (this.gy() && this.gJ() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), ls.az);
         }
      }

      this.gH();
   }

   private void a(dha $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      fbs $$1 = fbs.c($$0);
      int $$2 = 0;
      jh $$3 = this.dv();
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

      fbs $$8 = cgv.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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
   public List<jh> gm() {
      return this.cU.f;
   }

   private boolean gD() {
      return this.cI > 3600;
   }

   void gE() {
      this.cS = null;
      this.cM = 200;
   }

   void gF() {
      this.cR = null;
      this.cQ = bae.a(this.ae, 20, 60);
   }

   boolean gG() {
      if (this.cJ <= 0 && !this.cT.l() && !this.gz() && this.O_() == null) {
         boolean $$0 = this.gD() || c(this.dV()) || this.gy();
         return $$0 && !this.gI();
      } else {
         return false;
      }
   }

   public static boolean c(dha $$0) {
      return $$0.G_().g() && ($$0.V() || $$0.af());
   }

   public void s(int $$0) {
      this.cJ = $$0;
   }

   public float J(float $$0) {
      return bae.h($$0, this.cG, this.cF);
   }

   private void gH() {
      this.cG = this.cF;
      if (this.gN()) {
         this.cF = Math.min(1.0F, this.cF + 0.2F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.24F);
      }
   }

   @Override
   protected void a(ash $$0) {
      boolean $$1 = this.gz();
      if (this.bm()) {
         this.cW++;
      } else {
         this.cW = 0;
      }

      if (this.cW > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cH++;
         if (this.cH % 5 == 0 && this.ae.a(bae.a(1200 - this.cH, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eD());
         }
      }

      if (!this.gy()) {
         this.cI++;
      }

      this.a($$0, false);
   }

   public void gn() {
      this.cI = 0;
   }

   private boolean gI() {
      if (this.cS == null) {
         return false;
      } else {
         dup $$0 = this.dV().c_(this.cS);
         return $$0 instanceof dum && ((dum)$$0).b();
      }
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
      dup $$1 = this.dV().c_($$0);
      return $$1 instanceof dum ? !((dum)$$1).d() : false;
   }

   @bbl
   public boolean go() {
      return this.cS != null;
   }

   @Nullable
   @bbl
   public jh gp() {
      return this.cS;
   }

   @bbl
   public cda gq() {
      return this.bT;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   int gJ() {
      return this.cK;
   }

   private void gK() {
      this.cK = 0;
   }

   void gL() {
      this.cK++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         if (this.cJ > 0) {
            this.cJ--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         if (this.cQ > 0) {
            this.cQ--;
         }

         boolean $$0 = this.ad_() && !this.gz() && this.O_() != null && this.O_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gM()) {
            this.cS = null;
         }
      }
   }

   boolean gM() {
      if (!this.go()) {
         return false;
      } else if (this.l(this.cS)) {
         return false;
      } else {
         dup $$0 = this.dV().c_(this.cS);
         return $$0 != null && $$0.q() == dur.I;
      }
   }

   public boolean gy() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gn();
      }

      this.d(8, $$0);
   }

   public boolean gz() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gN() {
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

   public static bxi.a gA() {
      return chs.gr().a(bxj.s, 10.0).a(bxj.l, 0.6F).a(bxj.v, 0.3F).a(bxj.c, 2.0);
   }

   @Override
   protected cfn b(dha $$0) {
      cfl $$1 = new cfl(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cht.this.cT.l()) {
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
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ao);
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
   }

   @Override
   protected axe u() {
      return null;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.bP;
   }

   @Override
   protected axe o_() {
      return axf.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cht b(ash $$0, buw $$1) {
      return bvm.l.a($$0, bvl.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxn $$2, jh $$3) {
   }

   @Override
   public boolean ba() {
      return this.gB() && this.af % ca == 0;
   }

   @Override
   public boolean gB() {
      return !this.aJ();
   }

   public void gC() {
      this.x(false);
      this.gK();
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cT.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(ayk<eto> $$0) {
      this.h(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cS = $$0;
   }

   abstract class a extends ccz {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cht.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !cht.this.ad_();
      }
   }

   class b extends cdj {
      b(final bwj $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cht.this.ad_() && !cht.this.gz();
      }

      @Override
      public boolean c() {
         return super.c() && cht.this.ad_() && !cht.this.gz();
      }
   }

   static class c extends ces<cps> {
      c(cht $$0) {
         super($$0, cps.class, 10, true, false, $$0::a);
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
         cht $$0 = (cht)this.e;
         return $$0.ad_() && !$$0.gz();
      }
   }

   class d extends cht.a {
      @Override
      public boolean h() {
         if (cht.this.go() && cht.this.gG() && cht.this.cS.a(cht.this.dt(), 2.0) && cht.this.dV().c_(cht.this.cS) instanceof dum $$1) {
            if (!$$1.d()) {
               return true;
            }

            cht.this.cS = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cht.this.dV().c_(cht.this.cS) instanceof dum $$1) {
            $$1.a(cht.this);
         }
      }
   }

   @bbl
   public class e extends cht.a {
      public static final int b = 2400;
      int d = cht.this.dV().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private eud g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean h() {
         return cht.this.cS != null && !cht.this.fY() && cht.this.gG() && !this.d(cht.this.cS) && cht.this.dV().a_(cht.this.cS).a(axu.aJ);
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
         cht.this.bS.o();
         cht.this.bS.h();
      }

      @Override
      public void a() {
         if (cht.this.cS != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cht.this.bS.n()) {
               if (!cht.this.b(cht.this.cS, 16)) {
                  if (cht.this.l(cht.this.cS)) {
                     cht.this.gE();
                  } else {
                     cht.this.j(cht.this.cS);
                  }
               } else {
                  boolean $$0 = this.a(cht.this.cS);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cht.this.bS.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cht.this.gE();
                        this.i = 0;
                     }
                  } else {
                     this.g = cht.this.bS.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = cht.this.b(cht.this.cS, 3) ? 1 : 2;
         cht.this.bS.b(10.0F);
         cht.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cht.this.bS.k() != null && cht.this.bS.k().j();
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
         if (cht.this.cS != null) {
            this.c(cht.this.cS);
         }

         cht.this.gE();
      }

      private boolean d(jh $$0) {
         if (cht.this.b($$0, 2)) {
            return true;
         } else {
            eud $$1 = cht.this.bS.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cht.a {
      private static final int c = 2400;
      int d = cht.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean h() {
         return cht.this.cR != null && !cht.this.fY() && this.k() && !cht.this.b(cht.this.cR, 2);
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
         cht.this.bS.o();
         cht.this.bS.h();
      }

      @Override
      public void a() {
         if (cht.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cht.this.gF();
            } else if (!cht.this.bS.n()) {
               if (cht.this.l(cht.this.cR)) {
                  cht.this.gF();
               } else {
                  cht.this.j(cht.this.cR);
               }
            }
         }
      }

      private boolean k() {
         return cht.this.cI > 600;
      }
   }

   class g extends cht.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cht.this.gJ() >= 10) {
            return false;
         } else {
            return cht.this.ae.i() < 0.3F ? false : cht.this.gy() && cht.this.gM();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cht.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = cht.this.dv().c($$0);
               dxn $$2 = cht.this.dV().a_($$1);
               dke $$3 = $$2.b();
               dxn $$4 = null;
               if ($$2.a(axu.aL)) {
                  if ($$3 instanceof dmb) {
                     dmb $$5 = (dmb)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dsd) {
                     int $$6 = $$2.c(dsd.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dsd.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dkg.oD)) {
                     int $$7 = $$2.c(dsk.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dsk.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dkg.sQ) || $$2.a(dkg.sR)) {
                     dkh $$8 = (dkh)$$2.b();
                     if ($$8.b(cht.this.dV(), $$1, $$2)) {
                        $$8.a((ash)cht.this.dV(), cht.this.ae, $$1, $$2);
                        $$4 = cht.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cht.this.dV().c(2011, $$1, 15);
                     cht.this.dV().b($$1, $$4);
                     cht.this.gL();
                  }
               }
            }
         }
      }
   }

   class h extends cer {
      h(final cht $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cht.this.ad_() && super.c();
      }

      @Override
      protected void a(bwd $$0, bwb $$1) {
         if ($$0 instanceof cht && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cht.a {
      @Override
      public boolean h() {
         return cht.this.cM == 0 && !cht.this.go() && cht.this.gG();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cht.this.cM = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!cht.this.cU.b($$1)) {
                  cht.this.cS = $$1;
                  return;
               }
            }

            cht.this.cU.k();
            cht.this.cS = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = cht.this.dv();
         chf $$1 = ((ash)cht.this.dV()).z();
         Stream<chg> $$2 = $$1.c($$0x -> $$0x.a(ayf.c), $$0, 20, chf.b.c);
         return $$2.map(chg::g).filter(cht.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ccb {
      j(final bwd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cht.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cht.this.cT.l();
      }
   }

   class k extends cht.a {
      private static final int c = 400;
      private final Predicate<dxn> d = $$0 -> {
         if ($$0.b(dyd.D) && $$0.c(dyd.D)) {
            return false;
         } else if ($$0.a(axu.W)) {
            return $$0.a(dkg.iU) ? $$0.c(dmo.b) == dyi.a : true;
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
      private fbs n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean h() {
         if (cht.this.cQ > 0) {
            return false;
         } else if (cht.this.gy()) {
            return false;
         } else if (cht.this.dV().af()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               cht.this.cR = $$0.get();
               cht.this.bS.a((double)cht.this.cR.u() + 0.5, (double)cht.this.cR.v() + 0.5, (double)cht.this.cR.w() + 0.5, 1.2F);
               return true;
            } else {
               cht.this.cQ = bae.a(cht.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cht.this.t()) {
            return false;
         } else if (cht.this.dV().af()) {
            return false;
         } else {
            return this.k() ? cht.this.ae.i() < 0.2F : true;
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
         cht.this.gn();
      }

      @Override
      public void e() {
         if (this.k()) {
            cht.this.x(true);
         }

         this.m = false;
         cht.this.bS.o();
         cht.this.cQ = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cht.this.t()) {
            this.o++;
            if (this.o > 600) {
               cht.this.gF();
               this.m = false;
               cht.this.cQ = 200;
            } else {
               fbs $$0 = fbs.c(cht.this.cR).b(0.0, 0.6F, 0.0);
               if ($$0.f(cht.this.dt()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cht.this.dt().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cht.this.gF();
                  } else {
                     if ($$1) {
                        boolean $$3 = cht.this.ae.a(25) == 0;
                        if ($$3) {
                           this.n = new fbs($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cht.this.bS.o();
                        } else {
                           $$2 = false;
                        }

                        cht.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cht.this.ae.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cht.this.a(axf.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cht.this.I().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cht.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(cht.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cht.this.dV().ac() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cht.this.dV().a_($$2))) {
               eud $$4 = cht.this.bS.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cht.this.dV().ac() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends ccz {
      l() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         return cht.this.bS.m() && cht.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cht.this.bS.n();
      }

      @Override
      public void d() {
         fbs $$0 = this.h();
         if ($$0 != null) {
            cht.this.bS.a(cht.this.bS.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fbs h() {
         fbs $$1;
         if (cht.this.gM() && !cht.this.b(cht.this.cS, this.i())) {
            fbs $$0 = fbs.b(cht.this.cS);
            $$1 = $$0.d(cht.this.dt()).d();
         } else {
            $$1 = cht.this.g(0.0F);
         }

         int $$3 = 8;
         fbs $$4 = cgy.a(cht.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cgu.a(cht.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cht.this.go() && !cht.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cht.a {
      private final int c = bae.a(cht.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cht.this.cR != null && cht.this.dV().p(cht.this.cR) && !this.a(cht.this.cR)) {
            cht.this.gF();
         }

         this.d = cht.this.dV().ac();
      }

      @Override
      public boolean h() {
         return cht.this.dV().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return cht.this.dV().a_($$0).a(axu.W);
      }
   }

   class n extends cht.a {
      private final int c = bae.a(cht.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cht.this.cS != null && cht.this.dV().p(cht.this.cS) && !cht.this.gM()) {
            cht.this.gE();
         }

         this.d = cht.this.dV().ac();
      }

      @Override
      public boolean h() {
         return cht.this.dV().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
