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

public class cjw extends cjv implements byk, ckj {
   public static final float bI = 120.32113F;
   public static final int bJ = azz.f(1.4959966F);
   private static final aku<Byte> bT = aky.a(cjw.class, akw.a);
   private static final aku<Integer> bU = aky.a(cjw.class, akw.b);
   private static final int bV = 2;
   private static final int bW = 4;
   private static final int bX = 8;
   private static final int bY = 1200;
   private static final int bZ = 600;
   private static final int ca = 3600;
   private static final int cb = 4;
   private static final int cc = 10;
   private static final int cd = 10;
   private static final int ce = 18;
   private static final int cf = 48;
   private static final int cg = 2;
   private static final int ch = 24;
   private static final int ci = 16;
   private static final int cj = 16;
   private static final int ck = 20;
   public static final String bK = "CropsGrownSincePollination";
   public static final String bM = "CannotEnterHiveTicks";
   public static final String bN = "TicksSincePollination";
   public static final String bO = "HasStung";
   public static final String bP = "HasNectar";
   public static final String bQ = "flower_pos";
   public static final String bR = "hive_pos";
   public static final boolean bS = false;
   private static final boolean cl = false;
   private static final int cm = 0;
   private static final int cn = 0;
   private static final int cq = 0;
   private static final bun cr = bbd.a(20, 39);
   @Nullable
   private UUID cs;
   private float ct;
   private float cu;
   private int cv;
   int cw = 0;
   private int cx = 0;
   private int cy = 0;
   private static final int cz = 200;
   int cA;
   private static final int cB = 200;
   private static final int cC = 20;
   private static final int cD = 60;
   int cE = azz.a(this.ae, 20, 60);
   @Nullable
   iw cF;
   @Nullable
   iw cG;
   cjw.k cH;
   cjw.e cI;
   private cjw.f cJ;
   private int cK;

   public cjw(bxn<? extends cjw> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceb(this, 20, true);
      this.bB = new cjw.j(this);
      this.a(eyr.n, -1.0F);
      this.a(eyr.j, -1.0F);
      this.a(eyr.k, 16.0F);
      this.a(eyr.x, -1.0F);
      this.a(eyr.h, -1.0F);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, 0);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cjw.b(this, 1.4F, true));
      this.bF.a(1, new cjw.d());
      this.bF.a(2, new cen(this, 1.0));
      this.bF.a(3, new cgj(this, 1.25, $$0 -> $$0.a(axv.ao), false));
      this.bF.a(3, new cjw.n());
      this.bF.a(3, new cjw.m());
      this.cH = new cjw.k();
      this.bF.a(4, this.cH);
      this.bF.a(5, new cfa(this, 1.25));
      this.bF.a(5, new cjw.i());
      this.cI = new cjw.e();
      this.bF.a(5, this.cI);
      this.cJ = new cjw.f();
      this.bF.a(6, this.cJ);
      this.bF.a(7, new cjw.g());
      this.bF.a(8, new cjw.l());
      this.bF.a(9, new cev(this));
      this.bG.a(1, new cjw.h(this).a(new Class[0]));
      this.bG.a(2, new cjw.c(this));
      this.bG.a(3, new cha<>(this, true));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("hive_pos", iw.a, this.cG);
      $$0.b("flower_pos", iw.a, this.cF);
      $$0.a("HasNectar", this.gG());
      $$0.a("HasStung", this.gH());
      $$0.a("TicksSincePollination", this.cw);
      $$0.a("CannotEnterHiveTicks", this.cx);
      $$0.a("CropsGrownSincePollination", this.cy);
      this.a_($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("HasNectar", false));
      this.x($$0.b("HasStung", false));
      this.cw = $$0.b("TicksSincePollination", 0);
      this.cx = $$0.b("CannotEnterHiveTicks", 0);
      this.cy = $$0.b("CropsGrownSincePollination", 0);
      this.cG = $$0.<iw>a("hive_pos", iw.a).orElse(null);
      this.cF = $$0.<iw>a("flower_pos", iw.a).orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      bvt $$2 = this.dW().a((byf)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bzl.c)));
      if ($$3) {
         dgz.a($$0, $$1, $$2);
         if ($$1 instanceof byf $$4) {
            $$4.p($$4.eX() + 1);
            int $$5 = 0;
            if (this.dV().an() == buz.c) {
               $$5 = 10;
            } else if (this.dV().an() == buz.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bwi(bwk.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.ab_();
         this.a(awy.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gG() && this.gR() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), lz.aB);
         }
      }

      this.gP();
   }

   private void a(dkj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lx $$6) {
      $$0.a($$6, azz.d($$0.A.j(), $$1, $$2), $$5, azz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   void j(iw $$0) {
      fgc $$1 = fgc.c($$0);
      int $$2 = 0;
      iw $$3 = this.dv();
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

      fgc $$8 = cix.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bE.b(0.5F);
         this.bE.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public iw q() {
      return this.cF;
   }

   public boolean t() {
      return this.cF != null;
   }

   public void h(iw $$0) {
      this.cF = $$0;
   }

   @bbi
   public int x() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @bbi
   public List<iw> gu() {
      return this.cI.f;
   }

   private boolean gL() {
      return this.cw > 3600;
   }

   void gM() {
      this.cG = null;
      this.cA = 200;
   }

   void gN() {
      this.cF = null;
      this.cE = azz.a(this.ae, 20, 60);
   }

   boolean gO() {
      if (this.cx <= 0 && !this.cH.l() && !this.gH() && this.f() == null) {
         boolean $$0 = this.gL() || c(this.dV()) || this.gG();
         return $$0 && !this.gQ();
      } else {
         return false;
      }
   }

   public static boolean c(dkj $$0) {
      return $$0.F_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cx = $$0;
   }

   public float J(float $$0) {
      return azz.h($$0, this.cu, this.ct);
   }

   private void gP() {
      this.cu = this.ct;
      if (this.gW()) {
         this.ct = Math.min(1.0F, this.ct + 0.2F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.24F);
      }
   }

   @Override
   protected void a(asb $$0) {
      boolean $$1 = this.gH();
      if (this.bi()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cv++;
         if (this.cv % 5 == 0 && this.ae.a(azz.a(1200 - this.cv, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eG());
         }
      }

      if (!this.gG()) {
         this.cw++;
      }

      this.a($$0, false);
   }

   public void gv() {
      this.cw = 0;
   }

   private boolean gQ() {
      dyl $$0 = this.gU();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.al.a(bU);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bU, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   @Override
   public void c() {
      this.a(cr.a(this.ae));
   }

   private boolean k(iw $$0) {
      dyo $$1 = this.dV().c_($$0);
      return $$1 instanceof dyl ? !((dyl)$$1).d() : false;
   }

   @bbi
   public boolean gw() {
      return this.cG != null;
   }

   @Nullable
   @bbi
   public iw gx() {
      return this.cG;
   }

   @bbi
   public cfc gy() {
      return this.bF;
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   int gR() {
      return this.cy;
   }

   private void gS() {
      this.cy = 0;
   }

   void gT() {
      this.cy++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         if (this.cx > 0) {
            this.cx--;
         }

         if (this.cA > 0) {
            this.cA--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.af_() && !this.gH() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gV()) {
            this.cG = null;
         }
      }
   }

   @Nullable
   dyl gU() {
      if (this.cG == null) {
         return null;
      } else {
         return this.l(this.cG) ? null : this.dV().a(this.cG, dyq.I).orElse(null);
      }
   }

   boolean gV() {
      return this.gU() != null;
   }

   public boolean gG() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gv();
      }

      this.d(8, $$0);
   }

   public boolean gH() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gW() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(iw $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bT, (byte)(this.al.a(bT) | $$0));
      } else {
         this.al.a(bT, (byte)(this.al.a(bT) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bT) & $$0) != 0;
   }

   public static bzk.a gI() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.l, 0.6F).a(bzl.v, 0.3F).a(bzl.c, 2.0);
   }

   @Override
   protected chp b(dkj $$0) {
      chn $$1 = new chn(this, $$0) {
         @Override
         public boolean a(iw $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cjw.this.cH.l()) {
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
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof cys $$3 && $$3.c() instanceof dqu $$4) {
         bwi $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bvc.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ao);
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
   }

   @Override
   protected awx u() {
      return null;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.bP;
   }

   @Override
   protected awx l_() {
      return awy.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cjw b(asb $$0, bwu $$1) {
      return bxn.m.a($$0, bxm.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
   }

   @Override
   public boolean aZ() {
      return this.gJ() && this.af % bJ == 0;
   }

   @Override
   public boolean gJ() {
      return !this.aH();
   }

   public void gK() {
      this.w(false);
      this.gS();
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cH.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(ayc<exz> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iw $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iw $$0) {
      this.cG = $$0;
   }

   public static boolean c(ebq $$0) {
      if ($$0.a(axn.W)) {
         if ($$0.a(ecg.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dnq.jf) ? $$0.c(dpx.b) == ecm.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cfb {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cjw.this.af_();
      }

      @Override
      public boolean c() {
         return this.i() && !cjw.this.af_();
      }
   }

   class b extends cfl {
      b(final byn $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cjw.this.af_() && !cjw.this.gH();
      }

      @Override
      public boolean c() {
         return super.c() && cjw.this.af_() && !cjw.this.gH();
      }
   }

   static class c extends cgu<csi> {
      c(cjw $$0) {
         super($$0, csi.class, 10, true, false, $$0::a);
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
         cjw $$0 = (cjw)this.e;
         return $$0.af_() && !$$0.gH();
      }
   }

   class d extends cjw.a {
      @Override
      public boolean h() {
         if (cjw.this.cG != null && cjw.this.gO() && cjw.this.cG.a(cjw.this.dt(), 2.0)) {
            dyl $$0 = cjw.this.gU();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cjw.this.cG = null;
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
         dyl $$0 = cjw.this.gU();
         if ($$0 != null) {
            $$0.a(cjw.this);
         }
      }
   }

   @bbi
   public class e extends cjw.a {
      public static final int b = 2400;
      int d = cjw.this.dV().A.a(10);
      private static final int e = 3;
      final List<iw> f = Lists.newArrayList();
      @Nullable
      private eyo g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean h() {
         return cjw.this.cG != null
            && !cjw.this.l(cjw.this.cG)
            && !cjw.this.gi()
            && cjw.this.gO()
            && !this.d(cjw.this.cG)
            && cjw.this.dV().a_(cjw.this.cG).a(axn.aJ);
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
         cjw.this.bE.m();
         cjw.this.bE.f();
      }

      @Override
      public void a() {
         if (cjw.this.cG != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cjw.this.bE.l()) {
               if (!cjw.this.b(cjw.this.cG, 16)) {
                  if (cjw.this.l(cjw.this.cG)) {
                     cjw.this.gM();
                  } else {
                     cjw.this.j(cjw.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(cjw.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cjw.this.bE.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cjw.this.gM();
                        this.i = 0;
                     }
                  } else {
                     this.g = cjw.this.bE.i();
                  }
               }
            }
         }
      }

      private boolean a(iw $$0) {
         int $$1 = cjw.this.b($$0, 3) ? 1 : 2;
         cjw.this.bE.b(10.0F);
         cjw.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cjw.this.bE.i() != null && cjw.this.bE.i().j();
      }

      boolean b(iw $$0) {
         return this.f.contains($$0);
      }

      private void c(iw $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cjw.this.cG != null) {
            this.c(cjw.this.cG);
         }

         cjw.this.gM();
      }

      private boolean d(iw $$0) {
         if (cjw.this.b($$0, 2)) {
            return true;
         } else {
            eyo $$1 = cjw.this.bE.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cjw.a {
      private static final int c = 2400;
      int d = cjw.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean h() {
         return cjw.this.cF != null && !cjw.this.gi() && this.k() && !cjw.this.b(cjw.this.cF, 2);
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
         cjw.this.bE.m();
         cjw.this.bE.f();
      }

      @Override
      public void a() {
         if (cjw.this.cF != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cjw.this.gN();
            } else if (!cjw.this.bE.l()) {
               if (cjw.this.l(cjw.this.cF)) {
                  cjw.this.gN();
               } else {
                  cjw.this.j(cjw.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return cjw.this.cw > 600;
      }
   }

   class g extends cjw.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cjw.this.gR() >= 10) {
            return false;
         } else {
            return cjw.this.ae.i() < 0.3F ? false : cjw.this.gG() && cjw.this.gV();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cjw.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iw $$1 = cjw.this.dv().c($$0);
               ebq $$2 = cjw.this.dV().a_($$1);
               dno $$3 = $$2.b();
               ebq $$4 = null;
               if ($$2.a(axn.aL)) {
                  if ($$3 instanceof dpl) {
                     dpl $$5 = (dpl)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dvu) {
                     int $$6 = $$2.c(dvu.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dvu.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dnq.oO)) {
                     int $$7 = $$2.c(dwb.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dwb.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dnq.td) || $$2.a(dnq.te)) {
                     dnr $$8 = (dnr)$$2.b();
                     if ($$8.a((dkm)cjw.this.dV(), $$1, $$2)) {
                        $$8.a((asb)cjw.this.dV(), cjw.this.ae, $$1, $$2);
                        $$4 = cjw.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cjw.this.dV().c(2011, $$1, 15);
                     cjw.this.dV().b($$1, $$4);
                     cjw.this.gT();
                  }
               }
            }
         }
      }
   }

   class h extends cgt {
      h(final cjw $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cjw.this.af_() && super.c();
      }

      @Override
      protected void a(byh $$0, byf $$1) {
         if ($$0 instanceof cjw && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cjw.a {
      @Override
      public boolean h() {
         return cjw.this.cA == 0 && !cjw.this.gw() && cjw.this.gO();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cjw.this.cA = 200;
         List<iw> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iw $$1 : $$0) {
               if (!cjw.this.cI.b($$1)) {
                  cjw.this.cG = $$1;
                  return;
               }
            }

            cjw.this.cI.k();
            cjw.this.cG = $$0.get(0);
         }
      }

      private List<iw> k() {
         iw $$0 = cjw.this.dv();
         cjh $$1 = ((asb)cjw.this.dV()).A();
         Stream<cji> $$2 = $$1.c($$0x -> $$0x.a(axx.c), $$0, 20, cjh.b.c);
         return $$2.map(cji::g).filter(cjw.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ced {
      j(final byh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjw.this.af_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjw.this.cH.l();
      }
   }

   class k extends cjw.a {
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
      private fgc m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean h() {
         if (cjw.this.cE > 0) {
            return false;
         } else if (cjw.this.gG()) {
            return false;
         } else if (cjw.this.dV().ah()) {
            return false;
         } else {
            Optional<iw> $$0 = this.p();
            if ($$0.isPresent()) {
               cjw.this.cF = $$0.get();
               cjw.this.bE.a((double)cjw.this.cF.u() + 0.5, (double)cjw.this.cF.v() + 0.5, (double)cjw.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               cjw.this.cE = azz.a(cjw.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cjw.this.t()) {
            return false;
         } else if (cjw.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cjw.this.ae.i() < 0.2F : true;
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
         cjw.this.gv();
      }

      @Override
      public void e() {
         if (this.k()) {
            cjw.this.w(true);
         }

         this.l = false;
         cjw.this.bE.m();
         cjw.this.cE = 200;
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         if (cjw.this.t()) {
            this.n++;
            if (this.n > 600) {
               cjw.this.gN();
               this.l = false;
               cjw.this.cE = 200;
            } else {
               fgc $$0 = fgc.c(cjw.this.cF).b(0.0, 0.6F, 0.0);
               if ($$0.f(cjw.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cjw.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cjw.this.gN();
                  } else {
                     if ($$1) {
                        boolean $$3 = cjw.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fgc($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cjw.this.bE.m();
                        } else {
                           $$2 = false;
                        }

                        cjw.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cjw.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cjw.this.a(awy.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cjw.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cjw.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iw> p() {
         Iterable<iw> $$0 = iw.a(cjw.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iw $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cjw.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cjw.c(cjw.this.dV().a_($$2))) {
               eyo $$4 = cjw.this.bE.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cjw.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cfb {
      l() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         return cjw.this.bE.k() && cjw.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cjw.this.bE.l();
      }

      @Override
      public void d() {
         fgc $$0 = this.h();
         if ($$0 != null) {
            cjw.this.bE.a(cjw.this.bE.a(iw.a((jq)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fgc h() {
         fgc $$1;
         if (cjw.this.gV() && !cjw.this.b(cjw.this.cG, this.i())) {
            fgc $$0 = fgc.b(cjw.this.cG);
            $$1 = $$0.d(cjw.this.dt()).d();
         } else {
            $$1 = cjw.this.h(0.0F);
         }

         int $$3 = 8;
         fgc $$4 = cja.a(cjw.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : ciw.a(cjw.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cjw.this.gw() && !cjw.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cjw.a {
      private final int c = azz.a(cjw.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjw.this.cF != null && cjw.this.dV().p(cjw.this.cF) && !this.a(cjw.this.cF)) {
            cjw.this.gN();
         }

         this.d = cjw.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjw.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iw $$0) {
         return cjw.c(cjw.this.dV().a_($$0));
      }
   }

   class n extends cjw.a {
      private final int c = azz.a(cjw.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjw.this.cG != null && cjw.this.dV().p(cjw.this.cG) && !cjw.this.gV()) {
            cjw.this.gM();
         }

         this.d = cjw.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjw.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
