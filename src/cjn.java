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

public class cjn extends cjm implements byb, cka {
   public static final float bI = 120.32113F;
   public static final int bJ = azq.f(1.4959966F);
   private static final akn<Byte> bT = akr.a(cjn.class, akp.a);
   private static final akn<Integer> bU = akr.a(cjn.class, akp.b);
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
   private static final bue cr = bau.a(20, 39);
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
   int cE = azq.a(this.ae, 20, 60);
   @Nullable
   iw cF;
   @Nullable
   iw cG;
   cjn.k cH;
   cjn.e cI;
   private cjn.f cJ;
   private int cK;

   public cjn(bxe<? extends cjn> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cds(this, 20, true);
      this.bB = new cjn.j(this);
      this.a(eyh.n, -1.0F);
      this.a(eyh.j, -1.0F);
      this.a(eyh.k, 16.0F);
      this.a(eyh.x, -1.0F);
      this.a(eyh.h, -1.0F);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, 0);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cjn.b(this, 1.4F, true));
      this.bF.a(1, new cjn.d());
      this.bF.a(2, new cee(this, 1.0));
      this.bF.a(3, new cga(this, 1.25, $$0 -> $$0.a(axo.ao), false));
      this.bF.a(3, new cjn.n());
      this.bF.a(3, new cjn.m());
      this.cH = new cjn.k();
      this.bF.a(4, this.cH);
      this.bF.a(5, new cer(this, 1.25));
      this.bF.a(5, new cjn.i());
      this.cI = new cjn.e();
      this.bF.a(5, this.cI);
      this.cJ = new cjn.f();
      this.bF.a(6, this.cJ);
      this.bF.a(7, new cjn.g());
      this.bF.a(8, new cjn.l());
      this.bF.a(9, new cem(this));
      this.bG.a(1, new cjn.h(this).a(new Class[0]));
      this.bG.a(2, new cjn.c(this));
      this.bG.a(3, new cgr<>(this, true));
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
   public boolean c(aru $$0, bwv $$1) {
      bvk $$2 = this.dW().a((bxw)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bzc.c)));
      if ($$3) {
         dgp.a($$0, $$1, $$2);
         if ($$1 instanceof bxw $$4) {
            $$4.p($$4.eX() + 1);
            int $$5 = 0;
            if (this.dV().an() == buq.c) {
               $$5 = 10;
            } else if (this.dV().an() == buq.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bvz(bwb.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.aa_();
         this.a(awr.bS, 1.0F, 1.0F);
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

   private void a(djz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lx $$6) {
      $$0.a($$6, azq.d($$0.A.j(), $$1, $$2), $$5, azq.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   void j(iw $$0) {
      ffs $$1 = ffs.c($$0);
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

      ffs $$8 = cio.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @baz
   public int x() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @baz
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
      this.cE = azq.a(this.ae, 20, 60);
   }

   boolean gO() {
      if (this.cx <= 0 && !this.cH.l() && !this.gH() && this.f() == null) {
         boolean $$0 = this.gL() || c(this.dV()) || this.gG();
         return $$0 && !this.gQ();
      } else {
         return false;
      }
   }

   public static boolean c(djz $$0) {
      return $$0.F_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cx = $$0;
   }

   public float J(float $$0) {
      return azq.h($$0, this.cu, this.ct);
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
   protected void a(aru $$0) {
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
         if (this.cv % 5 == 0 && this.ae.a(azq.a(1200 - this.cv, 1, 1200)) == 0) {
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
      dyb $$0 = this.gU();
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
      dye $$1 = this.dV().c_($$0);
      return $$1 instanceof dyb ? !((dyb)$$1).d() : false;
   }

   @baz
   public boolean gw() {
      return this.cG != null;
   }

   @Nullable
   @baz
   public iw gx() {
      return this.cG;
   }

   @baz
   public cet gy() {
      return this.bF;
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
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

         boolean $$0 = this.ae_() && !this.gH() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gV()) {
            this.cG = null;
         }
      }
   }

   @Nullable
   dyb gU() {
      if (this.cG == null) {
         return null;
      } else {
         return this.l(this.cG) ? null : this.dV().a(this.cG, dyg.I).orElse(null);
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

   public static bzb.a gI() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.l, 0.6F).a(bzc.v, 0.3F).a(bzc.c, 2.0);
   }

   @Override
   protected chg b(djz $$0) {
      che $$1 = new che(this, $$0) {
         @Override
         public boolean a(iw $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cjn.this.cH.l()) {
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
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof cyi $$3 && $$3.c() instanceof dqk $$4) {
         bvz $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return but.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ao);
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
   }

   @Override
   protected awq u() {
      return null;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.bP;
   }

   @Override
   protected awq l_() {
      return awr.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cjn b(aru $$0, bwl $$1) {
      return bxe.m.a($$0, bxd.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
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
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cH.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axv<exp> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iw $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iw $$0) {
      this.cG = $$0;
   }

   public static boolean c(ebg $$0) {
      if ($$0.a(axg.W)) {
         if ($$0.a(ebw.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dng.jf) ? $$0.c(dpn.b) == ecc.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends ces {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cjn.this.ae_();
      }

      @Override
      public boolean c() {
         return this.i() && !cjn.this.ae_();
      }
   }

   class b extends cfc {
      b(final bye $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cjn.this.ae_() && !cjn.this.gH();
      }

      @Override
      public boolean c() {
         return super.c() && cjn.this.ae_() && !cjn.this.gH();
      }
   }

   static class c extends cgl<crz> {
      c(cjn $$0) {
         super($$0, crz.class, 10, true, false, $$0::a);
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
         cjn $$0 = (cjn)this.e;
         return $$0.ae_() && !$$0.gH();
      }
   }

   class d extends cjn.a {
      @Override
      public boolean h() {
         if (cjn.this.cG != null && cjn.this.gO() && cjn.this.cG.a(cjn.this.dt(), 2.0)) {
            dyb $$0 = cjn.this.gU();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cjn.this.cG = null;
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
         dyb $$0 = cjn.this.gU();
         if ($$0 != null) {
            $$0.a(cjn.this);
         }
      }
   }

   @baz
   public class e extends cjn.a {
      public static final int b = 2400;
      int d = cjn.this.dV().A.a(10);
      private static final int e = 3;
      final List<iw> f = Lists.newArrayList();
      @Nullable
      private eye g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean h() {
         return cjn.this.cG != null
            && !cjn.this.l(cjn.this.cG)
            && !cjn.this.gi()
            && cjn.this.gO()
            && !this.d(cjn.this.cG)
            && cjn.this.dV().a_(cjn.this.cG).a(axg.aJ);
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
         cjn.this.bE.m();
         cjn.this.bE.f();
      }

      @Override
      public void a() {
         if (cjn.this.cG != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cjn.this.bE.l()) {
               if (!cjn.this.b(cjn.this.cG, 16)) {
                  if (cjn.this.l(cjn.this.cG)) {
                     cjn.this.gM();
                  } else {
                     cjn.this.j(cjn.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(cjn.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cjn.this.bE.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cjn.this.gM();
                        this.i = 0;
                     }
                  } else {
                     this.g = cjn.this.bE.i();
                  }
               }
            }
         }
      }

      private boolean a(iw $$0) {
         int $$1 = cjn.this.b($$0, 3) ? 1 : 2;
         cjn.this.bE.b(10.0F);
         cjn.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cjn.this.bE.i() != null && cjn.this.bE.i().j();
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
         if (cjn.this.cG != null) {
            this.c(cjn.this.cG);
         }

         cjn.this.gM();
      }

      private boolean d(iw $$0) {
         if (cjn.this.b($$0, 2)) {
            return true;
         } else {
            eye $$1 = cjn.this.bE.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cjn.a {
      private static final int c = 2400;
      int d = cjn.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean h() {
         return cjn.this.cF != null && !cjn.this.gi() && this.k() && !cjn.this.b(cjn.this.cF, 2);
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
         cjn.this.bE.m();
         cjn.this.bE.f();
      }

      @Override
      public void a() {
         if (cjn.this.cF != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cjn.this.gN();
            } else if (!cjn.this.bE.l()) {
               if (cjn.this.l(cjn.this.cF)) {
                  cjn.this.gN();
               } else {
                  cjn.this.j(cjn.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return cjn.this.cw > 600;
      }
   }

   class g extends cjn.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cjn.this.gR() >= 10) {
            return false;
         } else {
            return cjn.this.ae.i() < 0.3F ? false : cjn.this.gG() && cjn.this.gV();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cjn.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iw $$1 = cjn.this.dv().c($$0);
               ebg $$2 = cjn.this.dV().a_($$1);
               dne $$3 = $$2.b();
               ebg $$4 = null;
               if ($$2.a(axg.aL)) {
                  if ($$3 instanceof dpb) {
                     dpb $$5 = (dpb)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dvk) {
                     int $$6 = $$2.c(dvk.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dvk.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dng.oO)) {
                     int $$7 = $$2.c(dvr.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dvr.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dng.td) || $$2.a(dng.te)) {
                     dnh $$8 = (dnh)$$2.b();
                     if ($$8.a((dkc)cjn.this.dV(), $$1, $$2)) {
                        $$8.a((aru)cjn.this.dV(), cjn.this.ae, $$1, $$2);
                        $$4 = cjn.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cjn.this.dV().c(2011, $$1, 15);
                     cjn.this.dV().b($$1, $$4);
                     cjn.this.gT();
                  }
               }
            }
         }
      }
   }

   class h extends cgk {
      h(final cjn $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cjn.this.ae_() && super.c();
      }

      @Override
      protected void a(bxy $$0, bxw $$1) {
         if ($$0 instanceof cjn && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cjn.a {
      @Override
      public boolean h() {
         return cjn.this.cA == 0 && !cjn.this.gw() && cjn.this.gO();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cjn.this.cA = 200;
         List<iw> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iw $$1 : $$0) {
               if (!cjn.this.cI.b($$1)) {
                  cjn.this.cG = $$1;
                  return;
               }
            }

            cjn.this.cI.k();
            cjn.this.cG = $$0.get(0);
         }
      }

      private List<iw> k() {
         iw $$0 = cjn.this.dv();
         ciy $$1 = ((aru)cjn.this.dV()).A();
         Stream<ciz> $$2 = $$1.c($$0x -> $$0x.a(axq.c), $$0, 20, ciy.b.c);
         return $$2.map(ciz::g).filter(cjn.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cdu {
      j(final bxy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjn.this.ae_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjn.this.cH.l();
      }
   }

   class k extends cjn.a {
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
      private ffs m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean h() {
         if (cjn.this.cE > 0) {
            return false;
         } else if (cjn.this.gG()) {
            return false;
         } else if (cjn.this.dV().ah()) {
            return false;
         } else {
            Optional<iw> $$0 = this.p();
            if ($$0.isPresent()) {
               cjn.this.cF = $$0.get();
               cjn.this.bE.a((double)cjn.this.cF.u() + 0.5, (double)cjn.this.cF.v() + 0.5, (double)cjn.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               cjn.this.cE = azq.a(cjn.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cjn.this.t()) {
            return false;
         } else if (cjn.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cjn.this.ae.i() < 0.2F : true;
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
         cjn.this.gv();
      }

      @Override
      public void e() {
         if (this.k()) {
            cjn.this.w(true);
         }

         this.l = false;
         cjn.this.bE.m();
         cjn.this.cE = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cjn.this.t()) {
            this.n++;
            if (this.n > 600) {
               cjn.this.gN();
               this.l = false;
               cjn.this.cE = 200;
            } else {
               ffs $$0 = ffs.c(cjn.this.cF).b(0.0, 0.6F, 0.0);
               if ($$0.f(cjn.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cjn.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cjn.this.gN();
                  } else {
                     if ($$1) {
                        boolean $$3 = cjn.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new ffs($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cjn.this.bE.m();
                        } else {
                           $$2 = false;
                        }

                        cjn.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cjn.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cjn.this.a(awr.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cjn.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cjn.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iw> p() {
         Iterable<iw> $$0 = iw.a(cjn.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iw $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cjn.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cjn.c(cjn.this.dV().a_($$2))) {
               eye $$4 = cjn.this.bE.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cjn.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends ces {
      l() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         return cjn.this.bE.k() && cjn.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cjn.this.bE.l();
      }

      @Override
      public void d() {
         ffs $$0 = this.h();
         if ($$0 != null) {
            cjn.this.bE.a(cjn.this.bE.a(iw.a((jq)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ffs h() {
         ffs $$1;
         if (cjn.this.gV() && !cjn.this.b(cjn.this.cG, this.i())) {
            ffs $$0 = ffs.b(cjn.this.cG);
            $$1 = $$0.d(cjn.this.dt()).d();
         } else {
            $$1 = cjn.this.h(0.0F);
         }

         int $$3 = 8;
         ffs $$4 = cir.a(cjn.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cin.a(cjn.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cjn.this.gw() && !cjn.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cjn.a {
      private final int c = azq.a(cjn.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjn.this.cF != null && cjn.this.dV().p(cjn.this.cF) && !this.a(cjn.this.cF)) {
            cjn.this.gN();
         }

         this.d = cjn.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjn.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iw $$0) {
         return cjn.c(cjn.this.dV().a_($$0));
      }
   }

   class n extends cjn.a {
      private final int c = azq.a(cjn.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjn.this.cG != null && cjn.this.dV().p(cjn.this.cG) && !cjn.this.gV()) {
            cjn.this.gM();
         }

         this.d = cjn.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjn.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
