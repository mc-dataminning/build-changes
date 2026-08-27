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

public class cef extends cee implements bsu, cen {
   public static final float bY = 120.32113F;
   public static final int bZ = ayd.f(1.4959966F);
   private static final ajr<Byte> ci = ajv.a(cef.class, ajt.a);
   private static final ajr<Integer> cj = ajv.a(cef.class, ajt.b);
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
   private static final bpf cy = azc.a(20, 39);
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
   int cK = ayd.a(this.ah, 20, 60);
   @Nullable
   io cL;
   @Nullable
   io cM;
   cef.k cN;
   cef.e cO;
   private cef.f cP;
   private int cQ;

   public cef(bsa<? extends cef> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new bym(this, 20, true);
      this.bO = new cef.j(this);
      this.a(enl.n, -1.0F);
      this.a(enl.j, -1.0F);
      this.a(enl.k, 16.0F);
      this.a(enl.x, -1.0F);
      this.a(enl.h, -1.0F);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(io $$0, dba $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cef.b(this, 1.4F, true));
      this.bS.a(1, new cef.d());
      this.bS.a(2, new byy(this, 1.0));
      this.bS.a(3, new cau(this, 1.25, $$0 -> $$0.a(awe.aj), false));
      this.cN = new cef.k();
      this.bS.a(4, this.cN);
      this.bS.a(5, new bzl(this, 1.25));
      this.bS.a(5, new cef.i());
      this.cO = new cef.e();
      this.bS.a(5, this.cO);
      this.cP = new cef.f();
      this.bS.a(6, this.cP);
      this.bS.a(7, new cef.g());
      this.bS.a(8, new cef.l());
      this.bS.a(9, new bzg(this));
      this.bT.a(1, new cef.h(this).a(new Class[0]));
      this.bT.a(2, new cef.c(this));
      this.bT.a(3, new cbl<>(this, true));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("hive_pos", us.a(this.gx()));
      }

      if (this.u()) {
         $$0.a("flower_pos", us.a(this.s()));
      }

      $$0.a("HasNectar", this.gz());
      $$0.a("HasStung", this.gA());
      $$0.a("TicksSincePollination", this.cE);
      $$0.a("CannotEnterHiveTicks", this.cF);
      $$0.a("CropsGrownSincePollination", this.cG);
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      this.cM = us.a($$0, "hive_pos").orElse(null);
      this.cL = us.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cE = $$0.h("TicksSincePollination");
      this.cF = $$0.h("CannotEnterHiveTicks");
      this.cG = $$0.h("CropsGrownSincePollination");
      this.a(this.dP(), $$0);
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = $$0.a(this.dQ().a((bso)this), (float)((int)this.g(btw.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bso) {
            ((bso)$$0).r(((bso)$$0).eU() + 1);
            int $$2 = 0;
            if (this.dP().ak() == bpr.c) {
               $$2 = 10;
            } else if (this.dP().ak() == bpr.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bso)$$0).b(new brc(bre.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(avh.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gz() && this.gI() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dP(), this.du() - 0.3F, this.du() + 0.3F, this.dA() - 0.3F, this.dA() + 0.3F, this.e(0.5), ky.ay);
         }
      }

      this.gG();
   }

   private void a(dax $$0, double $$1, double $$2, double $$3, double $$4, double $$5, kw $$6) {
      $$0.a($$6, ayd.d($$0.z.j(), $$1, $$2), $$5, ayd.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(io $$0) {
      euk $$1 = euk.c($$0);
      int $$2 = 0;
      io $$3 = this.dp();
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

      euk $$8 = cdi.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.a(0.5F);
         this.bR.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public io s() {
      return this.cL;
   }

   public boolean u() {
      return this.cL != null;
   }

   public void i(io $$0) {
      this.cL = $$0;
   }

   @azg
   public int y() {
      return Math.max(this.cO.d, this.cP.d);
   }

   @azg
   public List<io> gp() {
      return this.cO.f;
   }

   private boolean gE() {
      return this.cE > 3600;
   }

   boolean gF() {
      if (this.cF <= 0 && !this.cN.l() && !this.gA() && this.p() == null) {
         boolean $$0 = this.gE() || this.dP().ac() || this.dP().R() || this.gz();
         return $$0 && !this.gH();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cF = $$0;
   }

   public float G(float $$0) {
      return ayd.i($$0, this.cC, this.cB);
   }

   private void gG() {
      this.cC = this.cB;
      if (this.gM()) {
         this.cB = Math.min(1.0F, this.cB + 0.2F);
      } else {
         this.cB = Math.max(0.0F, this.cB - 0.24F);
      }
   }

   @Override
   protected void Y() {
      boolean $$0 = this.gA();
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
         if (this.cD % 5 == 0 && this.ah.a(ayd.a(1200 - this.cD, 1, 1200)) == 0) {
            this.a(this.dQ().n(), this.eA());
         }
      }

      if (!this.gz()) {
         this.cE++;
      }

      if (!this.dP().B) {
         this.a((aqm)this.dP(), false);
      }
   }

   public void gv() {
      this.cE = 0;
   }

   private boolean gH() {
      if (this.cM == null) {
         return false;
      } else {
         dog $$0 = this.dP().c_(this.cM);
         return $$0 instanceof dod && ((dod)$$0).b();
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
      this.a(cy.a(this.ah));
   }

   private boolean l(io $$0) {
      dog $$1 = this.dP().c_($$0);
      return $$1 instanceof dod ? !((dod)$$1).d() : false;
   }

   @azg
   public boolean gw() {
      return this.cM != null;
   }

   @Nullable
   @azg
   public io gx() {
      return this.cM;
   }

   @azg
   public bzn gy() {
      return this.bS;
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   int gI() {
      return this.cG;
   }

   private void gJ() {
      this.cG = 0;
   }

   void gK() {
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

         boolean $$0 = this.Z_() && !this.gA() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gL()) {
            this.cM = null;
         }
      }
   }

   boolean gL() {
      if (!this.gw()) {
         return false;
      } else if (this.m(this.cM)) {
         return false;
      } else {
         dog $$0 = this.dP().c_(this.cM);
         return $$0 != null && $$0.r() == doi.H;
      }
   }

   public boolean gz() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gv();
      }

      this.d(8, $$0);
   }

   public boolean gA() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gM() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(io $$0) {
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

   public static btv.a gB() {
      return bsq.A().a(btw.q, 10.0).a(btw.j, 0.6F).a(btw.r, 0.3F).a(btw.c, 2.0).a(btw.k, 48.0);
   }

   @Override
   protected cca b(dax $$0) {
      cby $$1 = new cby(this, $$0) {
         @Override
         public boolean a(io $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cef.this.cN.l()) {
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
   public boolean o(cto $$0) {
      return $$0.a(awe.aj);
   }

   boolean n(io $$0) {
      return this.dP().p($$0) && this.dP().a_($$0).a(avw.U);
   }

   @Override
   protected void b(io $$0, drb $$1) {
   }

   @Override
   protected avg v() {
      return null;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.bP;
   }

   @Override
   protected avg o_() {
      return avh.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cef b(aqm $$0, bro $$1) {
      return bsa.h.a((dax)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
   }

   @Override
   public boolean aV() {
      return this.gC() && this.ai % bZ == 0;
   }

   @Override
   public boolean gC() {
      return !this.aE();
   }

   public void gD() {
      this.w(false);
      this.gJ();
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
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
   protected void c(awl<emt> $$0) {
      this.g(this.ds().b(0.0, 0.01, 0.0));
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.2F));
   }

   boolean b(io $$0, int $$1) {
      return $$0.a(this.dp(), (double)$$1);
   }

   public void j(io $$0) {
      this.cM = $$0;
   }

   abstract class a extends bzm {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cef.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !cef.this.Z_();
      }
   }

   class b extends bzw {
      b(bsx $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cef.this.Z_() && !cef.this.gA();
      }

      @Override
      public boolean b() {
         return super.b() && cef.this.Z_() && !cef.this.gA();
      }
   }

   static class c extends cbf<clw> {
      c(cef $$0) {
         super($$0, clw.class, 10, true, false, $$0::a_);
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
         cef $$0 = (cef)this.e;
         return $$0.Z_() && !$$0.gA();
      }
   }

   class d extends cef.a {
      @Override
      public boolean h() {
         if (cef.this.gw() && cef.this.gF() && cef.this.cM.a(cef.this.dn(), 2.0) && cef.this.dP().c_(cef.this.cM) instanceof dod $$1) {
            if (!$$1.d()) {
               return true;
            }

            cef.this.cM = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cef.this.dP().c_(cef.this.cM) instanceof dod $$1) {
            $$1.a(cef.this);
         }
      }
   }

   @azg
   public class e extends cef.a {
      public static final int b = 600;
      int d = cef.this.dP().z.a(10);
      private static final int e = 3;
      final List<io> f = Lists.newArrayList();
      @Nullable
      private eni g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean h() {
         return cef.this.cM != null && !cef.this.ga() && cef.this.gF() && !this.d(cef.this.cM) && cef.this.dP().a_(cef.this.cM).a(avw.aG);
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
         cef.this.bR.n();
         cef.this.bR.g();
      }

      @Override
      public void e() {
         if (cef.this.cM != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cef.this.bR.m()) {
               if (!cef.this.b(cef.this.cM, 16)) {
                  if (cef.this.m(cef.this.cM)) {
                     this.m();
                  } else {
                     cef.this.k(cef.this.cM);
                  }
               } else {
                  boolean $$0 = this.a(cef.this.cM);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cef.this.bR.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cef.this.bR.j();
                  }
               }
            }
         }
      }

      private boolean a(io $$0) {
         cef.this.bR.a(10.0F);
         cef.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cef.this.bR.j() != null && cef.this.bR.j().j();
      }

      boolean b(io $$0) {
         return this.f.contains($$0);
      }

      private void c(io $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cef.this.cM != null) {
            this.c(cef.this.cM);
         }

         this.m();
      }

      private void m() {
         cef.this.cM = null;
         cef.this.cI = 200;
      }

      private boolean d(io $$0) {
         if (cef.this.b($$0, 2)) {
            return true;
         } else {
            eni $$1 = cef.this.bR.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cef.a {
      private static final int c = 600;
      int d = cef.this.dP().z.a(10);

      f() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean h() {
         return cef.this.cL != null && !cef.this.ga() && this.k() && cef.this.n(cef.this.cL) && !cef.this.b(cef.this.cL, 2);
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
         cef.this.bR.n();
         cef.this.bR.g();
      }

      @Override
      public void e() {
         if (cef.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cef.this.cL = null;
            } else if (!cef.this.bR.m()) {
               if (cef.this.m(cef.this.cL)) {
                  cef.this.cL = null;
               } else {
                  cef.this.k(cef.this.cL);
               }
            }
         }
      }

      private boolean k() {
         return cef.this.cE > 2400;
      }
   }

   class g extends cef.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cef.this.gI() >= 10) {
            return false;
         } else {
            return cef.this.ah.i() < 0.3F ? false : cef.this.gz() && cef.this.gL();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cef.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               io $$1 = cef.this.dp().c($$0);
               drb $$2 = cef.this.dP().a_($$1);
               ddy $$3 = $$2.b();
               drb $$4 = null;
               if ($$2.a(avw.aI)) {
                  if ($$3 instanceof dft) {
                     dft $$5 = (dft)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dlu) {
                     int $$6 = $$2.c(dlu.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dlu.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dea.oi)) {
                     int $$7 = $$2.c(dmb.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dmb.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dea.sv) || $$2.a(dea.sw)) {
                     ((deb)$$2.b()).a((aqm)cef.this.dP(), cef.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cef.this.dP().c(2011, $$1, 15);
                     cef.this.dP().b($$1, $$4);
                     cef.this.gK();
                  }
               }
            }
         }
      }
   }

   class h extends cbe {
      h(cef $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cef.this.Z_() && super.b();
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cef && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cef.a {
      @Override
      public boolean h() {
         return cef.this.cI == 0 && !cef.this.gw() && cef.this.gF();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cef.this.cI = 200;
         List<io> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (io $$1 : $$0) {
               if (!cef.this.cO.b($$1)) {
                  cef.this.cM = $$1;
                  return;
               }
            }

            cef.this.cO.k();
            cef.this.cM = $$0.get(0);
         }
      }

      private List<io> k() {
         io $$0 = cef.this.dp();
         cds $$1 = ((aqm)cef.this.dP()).y();
         Stream<cdt> $$2 = $$1.c($$0x -> $$0x.a(awg.c), $$0, 20, cds.b.c);
         return $$2.map(cdt::f).filter(cef.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends byo {
      j(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cef.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cef.this.cN.l();
      }
   }

   class k extends cef.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<drb> f = $$0 -> {
         if ($$0.b(drr.C) && $$0.c(drr.C)) {
            return false;
         } else if ($$0.a(avw.U)) {
            return $$0.a(dea.iD) ? $$0.c(dgg.b) == drx.a : true;
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
      private euk o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean h() {
         if (cef.this.cK > 0) {
            return false;
         } else if (cef.this.gz()) {
            return false;
         } else if (cef.this.dP().ac()) {
            return false;
         } else {
            Optional<io> $$0 = this.p();
            if ($$0.isPresent()) {
               cef.this.cL = $$0.get();
               cef.this.bR.a((double)cef.this.cL.u() + 0.5, (double)cef.this.cL.v() + 0.5, (double)cef.this.cL.w() + 0.5, 1.2F);
               return true;
            } else {
               cef.this.cK = ayd.a(cef.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cef.this.u()) {
            return false;
         } else if (cef.this.dP().ac()) {
            return false;
         } else if (this.k()) {
            return cef.this.ah.i() < 0.2F;
         } else if (cef.this.ai % 20 == 0 && !cef.this.n(cef.this.cL)) {
            cef.this.cL = null;
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
         cef.this.gv();
      }

      @Override
      public void d() {
         if (this.k()) {
            cef.this.w(true);
         }

         this.n = false;
         cef.this.bR.n();
         cef.this.cK = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cef.this.cL = null;
         } else {
            euk $$0 = euk.c(cef.this.cL).b(0.0, 0.6F, 0.0);
            if ($$0.f(cef.this.dn()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cef.this.dn().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cef.this.cL = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cef.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new euk($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cef.this.bR.n();
                     } else {
                        $$2 = false;
                     }

                     cef.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cef.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cef.this.a(avh.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cef.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cef.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<io> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<io> a(Predicate<drb> $$0, double $$1) {
         io $$2 = cef.this.dp();
         io.a $$3 = new io.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cef.this.dP().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bzm {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         return cef.this.bR.l() && cef.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cef.this.bR.m();
      }

      @Override
      public void c() {
         euk $$0 = this.h();
         if ($$0 != null) {
            cef.this.bR.a(cef.this.bR.a(io.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private euk h() {
         euk $$1;
         if (cef.this.gL() && !cef.this.b(cef.this.cM, 22)) {
            euk $$0 = euk.b(cef.this.cM);
            $$1 = $$0.d(cef.this.dn()).d();
         } else {
            $$1 = cef.this.f(0.0F);
         }

         int $$3 = 8;
         euk $$4 = cdl.a(cef.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cdh.a(cef.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
