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

public class cjl extends cjk implements bxz, cjy {
   public static final float bI = 120.32113F;
   public static final int bJ = azo.f(1.4959966F);
   private static final akl<Byte> bT = akp.a(cjl.class, akn.a);
   private static final akl<Integer> bU = akp.a(cjl.class, akn.b);
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
   private static final buc cr = bas.a(20, 39);
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
   int cE = azo.a(this.ae, 20, 60);
   @Nullable
   iv cF;
   @Nullable
   iv cG;
   cjl.k cH;
   cjl.e cI;
   private cjl.f cJ;
   private int cK;

   public cjl(bxc<? extends cjl> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cdq(this, 20, true);
      this.bB = new cjl.j(this);
      this.a(eyf.n, -1.0F);
      this.a(eyf.j, -1.0F);
      this.a(eyf.k, 16.0F);
      this.a(eyf.x, -1.0F);
      this.a(eyf.h, -1.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, 0);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cjl.b(this, 1.4F, true));
      this.bF.a(1, new cjl.d());
      this.bF.a(2, new cec(this, 1.0));
      this.bF.a(3, new cfy(this, 1.25, $$0 -> $$0.a(axm.an), false));
      this.bF.a(3, new cjl.n());
      this.bF.a(3, new cjl.m());
      this.cH = new cjl.k();
      this.bF.a(4, this.cH);
      this.bF.a(5, new cep(this, 1.25));
      this.bF.a(5, new cjl.i());
      this.cI = new cjl.e();
      this.bF.a(5, this.cI);
      this.cJ = new cjl.f();
      this.bF.a(6, this.cJ);
      this.bF.a(7, new cjl.g());
      this.bF.a(8, new cjl.l());
      this.bF.a(9, new cek(this));
      this.bG.a(1, new cjl.h(this).a(new Class[0]));
      this.bG.a(2, new cjl.c(this));
      this.bG.a(3, new cgp<>(this, true));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("hive_pos", iv.a, this.cG);
      $$0.b("flower_pos", iv.a, this.cF);
      $$0.a("HasNectar", this.gG());
      $$0.a("HasStung", this.gH());
      $$0.a("TicksSincePollination", this.cw);
      $$0.a("CannotEnterHiveTicks", this.cx);
      $$0.a("CropsGrownSincePollination", this.cy);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("HasNectar", false));
      this.x($$0.b("HasStung", false));
      this.cw = $$0.b("TicksSincePollination", 0);
      this.cx = $$0.b("CannotEnterHiveTicks", 0);
      this.cy = $$0.b("CropsGrownSincePollination", 0);
      this.cG = $$0.<iv>a("hive_pos", iv.a).orElse(null);
      this.cF = $$0.<iv>a("flower_pos", iv.a).orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      bvi $$2 = this.dW().a((bxu)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bza.c)));
      if ($$3) {
         dgn.a($$0, $$1, $$2);
         if ($$1 instanceof bxu $$4) {
            $$4.p($$4.eX() + 1);
            int $$5 = 0;
            if (this.dV().an() == buo.c) {
               $$5 = 10;
            } else if (this.dV().an() == buo.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bvx(bvz.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.aa_();
         this.a(awp.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gG() && this.gR() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), ly.aB);
         }
      }

      this.gP();
   }

   private void a(djx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lw $$6) {
      $$0.a($$6, azo.d($$0.A.j(), $$1, $$2), $$5, azo.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   void j(iv $$0) {
      ffq $$1 = ffq.c($$0);
      int $$2 = 0;
      iv $$3 = this.dv();
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

      ffq $$8 = cim.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bE.b(0.5F);
         this.bE.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public iv q() {
      return this.cF;
   }

   public boolean t() {
      return this.cF != null;
   }

   public void h(iv $$0) {
      this.cF = $$0;
   }

   @bax
   public int x() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @bax
   public List<iv> gu() {
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
      this.cE = azo.a(this.ae, 20, 60);
   }

   boolean gO() {
      if (this.cx <= 0 && !this.cH.l() && !this.gH() && this.f() == null) {
         boolean $$0 = this.gL() || c(this.dV()) || this.gG();
         return $$0 && !this.gQ();
      } else {
         return false;
      }
   }

   public static boolean c(djx $$0) {
      return $$0.F_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cx = $$0;
   }

   public float J(float $$0) {
      return azo.h($$0, this.cu, this.ct);
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
   protected void a(ars $$0) {
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
         if (this.cv % 5 == 0 && this.ae.a(azo.a(1200 - this.cv, 1, 1200)) == 0) {
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
      dxz $$0 = this.gU();
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

   private boolean k(iv $$0) {
      dyc $$1 = this.dV().c_($$0);
      return $$1 instanceof dxz ? !((dxz)$$1).d() : false;
   }

   @bax
   public boolean gw() {
      return this.cG != null;
   }

   @Nullable
   @bax
   public iv gx() {
      return this.cG;
   }

   @bax
   public cer gy() {
      return this.bF;
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
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
   dxz gU() {
      if (this.cG == null) {
         return null;
      } else {
         return this.l(this.cG) ? null : this.dV().a(this.cG, dye.I).orElse(null);
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

   boolean l(iv $$0) {
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

   public static byz.a gI() {
      return cjk.gz().a(bza.s, 10.0).a(bza.l, 0.6F).a(bza.v, 0.3F).a(bza.c, 2.0);
   }

   @Override
   protected che b(djx $$0) {
      chc $$1 = new chc(this, $$0) {
         @Override
         public boolean a(iv $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cjl.this.cH.l()) {
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
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof cyg $$3 && $$3.c() instanceof dqi $$4) {
         bvx $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bur.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.an);
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
   }

   @Override
   protected awo u() {
      return null;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.bP;
   }

   @Override
   protected awo l_() {
      return awp.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cjl b(ars $$0, bwj $$1) {
      return bxc.m.a($$0, bxb.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
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
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cH.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axt<exn> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iv $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iv $$0) {
      this.cG = $$0;
   }

   public static boolean c(ebe $$0) {
      if ($$0.a(axe.W)) {
         if ($$0.a(ebu.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dne.jf) ? $$0.c(dpl.b) == eca.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends ceq {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cjl.this.ae_();
      }

      @Override
      public boolean c() {
         return this.i() && !cjl.this.ae_();
      }
   }

   class b extends cfa {
      b(final byc $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cjl.this.ae_() && !cjl.this.gH();
      }

      @Override
      public boolean c() {
         return super.c() && cjl.this.ae_() && !cjl.this.gH();
      }
   }

   static class c extends cgj<crx> {
      c(cjl $$0) {
         super($$0, crx.class, 10, true, false, $$0::a);
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
         cjl $$0 = (cjl)this.e;
         return $$0.ae_() && !$$0.gH();
      }
   }

   class d extends cjl.a {
      @Override
      public boolean h() {
         if (cjl.this.cG != null && cjl.this.gO() && cjl.this.cG.a(cjl.this.dt(), 2.0)) {
            dxz $$0 = cjl.this.gU();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cjl.this.cG = null;
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
         dxz $$0 = cjl.this.gU();
         if ($$0 != null) {
            $$0.a(cjl.this);
         }
      }
   }

   @bax
   public class e extends cjl.a {
      public static final int b = 2400;
      int d = cjl.this.dV().A.a(10);
      private static final int e = 3;
      final List<iv> f = Lists.newArrayList();
      @Nullable
      private eyc g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean h() {
         return cjl.this.cG != null
            && !cjl.this.l(cjl.this.cG)
            && !cjl.this.gi()
            && cjl.this.gO()
            && !this.d(cjl.this.cG)
            && cjl.this.dV().a_(cjl.this.cG).a(axe.aJ);
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
         cjl.this.bE.m();
         cjl.this.bE.f();
      }

      @Override
      public void a() {
         if (cjl.this.cG != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cjl.this.bE.l()) {
               if (!cjl.this.b(cjl.this.cG, 16)) {
                  if (cjl.this.l(cjl.this.cG)) {
                     cjl.this.gM();
                  } else {
                     cjl.this.j(cjl.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(cjl.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cjl.this.bE.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cjl.this.gM();
                        this.i = 0;
                     }
                  } else {
                     this.g = cjl.this.bE.i();
                  }
               }
            }
         }
      }

      private boolean a(iv $$0) {
         int $$1 = cjl.this.b($$0, 3) ? 1 : 2;
         cjl.this.bE.b(10.0F);
         cjl.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cjl.this.bE.i() != null && cjl.this.bE.i().j();
      }

      boolean b(iv $$0) {
         return this.f.contains($$0);
      }

      private void c(iv $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cjl.this.cG != null) {
            this.c(cjl.this.cG);
         }

         cjl.this.gM();
      }

      private boolean d(iv $$0) {
         if (cjl.this.b($$0, 2)) {
            return true;
         } else {
            eyc $$1 = cjl.this.bE.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cjl.a {
      private static final int c = 2400;
      int d = cjl.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean h() {
         return cjl.this.cF != null && !cjl.this.gi() && this.k() && !cjl.this.b(cjl.this.cF, 2);
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
         cjl.this.bE.m();
         cjl.this.bE.f();
      }

      @Override
      public void a() {
         if (cjl.this.cF != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cjl.this.gN();
            } else if (!cjl.this.bE.l()) {
               if (cjl.this.l(cjl.this.cF)) {
                  cjl.this.gN();
               } else {
                  cjl.this.j(cjl.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return cjl.this.cw > 600;
      }
   }

   class g extends cjl.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cjl.this.gR() >= 10) {
            return false;
         } else {
            return cjl.this.ae.i() < 0.3F ? false : cjl.this.gG() && cjl.this.gV();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cjl.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iv $$1 = cjl.this.dv().c($$0);
               ebe $$2 = cjl.this.dV().a_($$1);
               dnc $$3 = $$2.b();
               ebe $$4 = null;
               if ($$2.a(axe.aL)) {
                  if ($$3 instanceof doz) {
                     doz $$5 = (doz)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dvi) {
                     int $$6 = $$2.c(dvi.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dvi.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dne.oO)) {
                     int $$7 = $$2.c(dvp.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dvp.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dne.td) || $$2.a(dne.te)) {
                     dnf $$8 = (dnf)$$2.b();
                     if ($$8.a((dka)cjl.this.dV(), $$1, $$2)) {
                        $$8.a((ars)cjl.this.dV(), cjl.this.ae, $$1, $$2);
                        $$4 = cjl.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cjl.this.dV().c(2011, $$1, 15);
                     cjl.this.dV().b($$1, $$4);
                     cjl.this.gT();
                  }
               }
            }
         }
      }
   }

   class h extends cgi {
      h(final cjl $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cjl.this.ae_() && super.c();
      }

      @Override
      protected void a(bxw $$0, bxu $$1) {
         if ($$0 instanceof cjl && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cjl.a {
      @Override
      public boolean h() {
         return cjl.this.cA == 0 && !cjl.this.gw() && cjl.this.gO();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cjl.this.cA = 200;
         List<iv> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iv $$1 : $$0) {
               if (!cjl.this.cI.b($$1)) {
                  cjl.this.cG = $$1;
                  return;
               }
            }

            cjl.this.cI.k();
            cjl.this.cG = $$0.get(0);
         }
      }

      private List<iv> k() {
         iv $$0 = cjl.this.dv();
         ciw $$1 = ((ars)cjl.this.dV()).A();
         Stream<cix> $$2 = $$1.c($$0x -> $$0x.a(axo.c), $$0, 20, ciw.b.c);
         return $$2.map(cix::g).filter(cjl.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cds {
      j(final bxw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cjl.this.ae_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjl.this.cH.l();
      }
   }

   class k extends cjl.a {
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
      private ffq m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean h() {
         if (cjl.this.cE > 0) {
            return false;
         } else if (cjl.this.gG()) {
            return false;
         } else if (cjl.this.dV().ah()) {
            return false;
         } else {
            Optional<iv> $$0 = this.p();
            if ($$0.isPresent()) {
               cjl.this.cF = $$0.get();
               cjl.this.bE.a((double)cjl.this.cF.u() + 0.5, (double)cjl.this.cF.v() + 0.5, (double)cjl.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               cjl.this.cE = azo.a(cjl.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cjl.this.t()) {
            return false;
         } else if (cjl.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cjl.this.ae.i() < 0.2F : true;
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
         cjl.this.gv();
      }

      @Override
      public void e() {
         if (this.k()) {
            cjl.this.w(true);
         }

         this.l = false;
         cjl.this.bE.m();
         cjl.this.cE = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cjl.this.t()) {
            this.n++;
            if (this.n > 600) {
               cjl.this.gN();
               this.l = false;
               cjl.this.cE = 200;
            } else {
               ffq $$0 = ffq.c(cjl.this.cF).b(0.0, 0.6F, 0.0);
               if ($$0.f(cjl.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cjl.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cjl.this.gN();
                  } else {
                     if ($$1) {
                        boolean $$3 = cjl.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new ffq($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cjl.this.bE.m();
                        } else {
                           $$2 = false;
                        }

                        cjl.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cjl.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cjl.this.a(awp.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cjl.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cjl.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iv> p() {
         Iterable<iv> $$0 = iv.a(cjl.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iv $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cjl.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cjl.c(cjl.this.dV().a_($$2))) {
               eyc $$4 = cjl.this.bE.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cjl.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends ceq {
      l() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         return cjl.this.bE.k() && cjl.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cjl.this.bE.l();
      }

      @Override
      public void d() {
         ffq $$0 = this.h();
         if ($$0 != null) {
            cjl.this.bE.a(cjl.this.bE.a(iv.a((jp)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ffq h() {
         ffq $$1;
         if (cjl.this.gV() && !cjl.this.b(cjl.this.cG, this.i())) {
            ffq $$0 = ffq.b(cjl.this.cG);
            $$1 = $$0.d(cjl.this.dt()).d();
         } else {
            $$1 = cjl.this.h(0.0F);
         }

         int $$3 = 8;
         ffq $$4 = cip.a(cjl.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cil.a(cjl.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cjl.this.gw() && !cjl.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cjl.a {
      private final int c = azo.a(cjl.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjl.this.cF != null && cjl.this.dV().p(cjl.this.cF) && !this.a(cjl.this.cF)) {
            cjl.this.gN();
         }

         this.d = cjl.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjl.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iv $$0) {
         return cjl.c(cjl.this.dV().a_($$0));
      }
   }

   class n extends cjl.a {
      private final int c = azo.a(cjl.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cjl.this.cG != null && cjl.this.dV().p(cjl.this.cG) && !cjl.this.gV()) {
            cjl.this.gM();
         }

         this.d = cjl.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cjl.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
