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

public class ccu extends cct implements brk, cdc {
   public static final float bY = 120.32113F;
   public static final int bZ = axw.f(1.4959966F);
   private static final ajk<Byte> ci = ajo.a(ccu.class, ajm.a);
   private static final ajk<Integer> cj = ajo.a(ccu.class, ajm.b);
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
   private static final bob cy = ayv.a(20, 39);
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
   int cK = axw.a(this.ah, 20, 60);
   @Nullable
   im cL;
   @Nullable
   im cM;
   ccu.k cN;
   ccu.e cO;
   private ccu.f cP;
   private int cQ;

   public ccu(bqr<? extends ccu> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxb(this, 20, true);
      this.bO = new ccu.j(this);
      this.a(emi.n, -1.0F);
      this.a(emi.j, -1.0F);
      this.a(emi.k, 16.0F);
      this.a(emi.x, -1.0F);
      this.a(emi.h, -1.0F);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(im $$0, czx $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new ccu.b(this, 1.4F, true));
      this.bS.a(1, new ccu.d());
      this.bS.a(2, new bxn(this, 1.0));
      this.bS.a(3, new bzj(this, 1.25, cwd.a(avw.S), false));
      this.cN = new ccu.k();
      this.bS.a(4, this.cN);
      this.bS.a(5, new bya(this, 1.25));
      this.bS.a(5, new ccu.i());
      this.cO = new ccu.e();
      this.bS.a(5, this.cO);
      this.cP = new ccu.f();
      this.bS.a(6, this.cP);
      this.bS.a(7, new ccu.g());
      this.bS.a(8, new ccu.l());
      this.bS.a(9, new bxv(this));
      this.bT.a(1, new ccu.h(this).a(new Class[0]));
      this.bT.a(2, new ccu.c(this));
      this.bT.a(3, new caa<>(this, true));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("hive_pos", un.a(this.gx()));
      }

      if (this.u()) {
         $$0.a("flower_pos", un.a(this.r()));
      }

      $$0.a("HasNectar", this.gz());
      $$0.a("HasStung", this.gA());
      $$0.a("TicksSincePollination", this.cE);
      $$0.a("CannotEnterHiveTicks", this.cF);
      $$0.a("CropsGrownSincePollination", this.cG);
      this.c($$0);
   }

   @Override
   public void a(ty $$0) {
      this.cM = un.a($$0, "hive_pos").orElse(null);
      this.cL = un.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cE = $$0.h("TicksSincePollination");
      this.cF = $$0.h("CannotEnterHiveTicks");
      this.cG = $$0.h("CropsGrownSincePollination");
      this.a(this.dN(), $$0);
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = $$0.a(this.dO().a((bre)this), (float)((int)this.g(bsl.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bre) {
            ((bre)$$0).r(((bre)$$0).eS() + 1);
            int $$2 = 0;
            if (this.dN().ak() == bon.c) {
               $$2 = 10;
            } else if (this.dN().ak() == bon.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bre)$$0).b(new bpx(bpz.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(auz.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gz() && this.gI() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dN(), this.ds() - 0.3F, this.ds() + 0.3F, this.dy() - 0.3F, this.dy() + 0.3F, this.e(0.5), kw.av);
         }
      }

      this.gG();
   }

   private void a(czu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ku $$6) {
      $$0.a($$6, axw.d($$0.z.j(), $$1, $$2), $$5, axw.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(im $$0) {
      etf $$1 = etf.c($$0);
      int $$2 = 0;
      im $$3 = this.dn();
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

      etf $$8 = cbx.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.a(0.5F);
         this.bR.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public im r() {
      return this.cL;
   }

   public boolean u() {
      return this.cL != null;
   }

   public void i(im $$0) {
      this.cL = $$0;
   }

   @ayz
   public int y() {
      return Math.max(this.cO.d, this.cP.d);
   }

   @ayz
   public List<im> gp() {
      return this.cO.f;
   }

   private boolean gE() {
      return this.cE > 3600;
   }

   boolean gF() {
      if (this.cF <= 0 && !this.cN.l() && !this.gA() && this.p() == null) {
         boolean $$0 = this.gE() || this.dN().ac() || this.dN().R() || this.gz();
         return $$0 && !this.gH();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cF = $$0;
   }

   public float G(float $$0) {
      return axw.i($$0, this.cC, this.cB);
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
      if (this.bf()) {
         this.cQ++;
      } else {
         this.cQ = 0;
      }

      if (this.cQ > 20) {
         this.a(this.dO().h(), 1.0F);
      }

      if ($$0) {
         this.cD++;
         if (this.cD % 5 == 0 && this.ah.a(axw.a(1200 - this.cD, 1, 1200)) == 0) {
            this.a(this.dO().n(), this.ey());
         }
      }

      if (!this.gz()) {
         this.cE++;
      }

      if (!this.dN().B) {
         this.a((aqe)this.dN(), false);
      }
   }

   public void gv() {
      this.cE = 0;
   }

   private boolean gH() {
      if (this.cM == null) {
         return false;
      } else {
         dnd $$0 = this.dN().c_(this.cM);
         return $$0 instanceof dna && ((dna)$$0).b();
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

   private boolean l(im $$0) {
      dnd $$1 = this.dN().c_($$0);
      return $$1 instanceof dna ? !((dna)$$1).d() : false;
   }

   @ayz
   public boolean gw() {
      return this.cM != null;
   }

   @Nullable
   @ayz
   public im gx() {
      return this.cM;
   }

   @ayz
   public byc gy() {
      return this.bS;
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
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
      if (!this.dN().B) {
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
         dnd $$0 = this.dN().c_(this.cM);
         return $$0 != null && $$0.r() == dnf.H;
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

   boolean m(im $$0) {
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

   public static bsk.a gB() {
      return brg.A().a(bsl.q, 10.0).a(bsl.j, 0.6F).a(bsl.r, 0.3F).a(bsl.c, 2.0).a(bsl.k, 48.0);
   }

   @Override
   protected cap b(czu $$0) {
      can $$1 = new can(this, $$0) {
         @Override
         public boolean a(im $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!ccu.this.cN.l()) {
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
   public boolean o(csd $$0) {
      return $$0.a(avw.S);
   }

   boolean n(im $$0) {
      return this.dN().p($$0) && this.dN().a_($$0).a(avo.U);
   }

   @Override
   protected void b(im $$0, dpy $$1) {
   }

   @Override
   protected auy v() {
      return null;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.bP;
   }

   @Override
   protected auy o_() {
      return auz.bO;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Nullable
   public ccu b(aqe $$0, bqf $$1) {
      return bqr.h.a((czu)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   public boolean aT() {
      return this.gC() && this.ai % bZ == 0;
   }

   @Override
   public boolean gC() {
      return !this.aC();
   }

   public void gD() {
      this.w(false);
      this.gJ();
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.cN.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awd<elq> $$0) {
      this.g(this.dq().b(0.0, 0.01, 0.0));
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.5F * this.cJ()), (double)(this.dh() * 0.2F));
   }

   boolean b(im $$0, int $$1) {
      return $$0.a(this.dn(), (double)$$1);
   }

   public void j(im $$0) {
      this.cM = $$0;
   }

   abstract class a extends byb {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !ccu.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !ccu.this.Z_();
      }
   }

   class b extends byl {
      b(brm $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && ccu.this.Z_() && !ccu.this.gA();
      }

      @Override
      public boolean b() {
         return super.b() && ccu.this.Z_() && !ccu.this.gA();
      }
   }

   static class c extends bzu<ckl> {
      c(ccu $$0) {
         super($$0, ckl.class, 10, true, false, $$0::a_);
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
         ccu $$0 = (ccu)this.e;
         return $$0.Z_() && !$$0.gA();
      }
   }

   class d extends ccu.a {
      @Override
      public boolean h() {
         if (ccu.this.gw() && ccu.this.gF() && ccu.this.cM.a(ccu.this.dl(), 2.0) && ccu.this.dN().c_(ccu.this.cM) instanceof dna $$1) {
            if (!$$1.d()) {
               return true;
            }

            ccu.this.cM = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (ccu.this.dN().c_(ccu.this.cM) instanceof dna $$1) {
            $$1.a(ccu.this);
         }
      }
   }

   @ayz
   public class e extends ccu.a {
      public static final int b = 600;
      int d = ccu.this.dN().z.a(10);
      private static final int e = 3;
      final List<im> f = Lists.newArrayList();
      @Nullable
      private emf g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean h() {
         return ccu.this.cM != null && !ccu.this.ga() && ccu.this.gF() && !this.d(ccu.this.cM) && ccu.this.dN().a_(ccu.this.cM).a(avo.aG);
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
         ccu.this.bR.n();
         ccu.this.bR.g();
      }

      @Override
      public void e() {
         if (ccu.this.cM != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!ccu.this.bR.m()) {
               if (!ccu.this.b(ccu.this.cM, 16)) {
                  if (ccu.this.m(ccu.this.cM)) {
                     this.m();
                  } else {
                     ccu.this.k(ccu.this.cM);
                  }
               } else {
                  boolean $$0 = this.a(ccu.this.cM);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && ccu.this.bR.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = ccu.this.bR.j();
                  }
               }
            }
         }
      }

      private boolean a(im $$0) {
         ccu.this.bR.a(10.0F);
         ccu.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return ccu.this.bR.j() != null && ccu.this.bR.j().j();
      }

      boolean b(im $$0) {
         return this.f.contains($$0);
      }

      private void c(im $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (ccu.this.cM != null) {
            this.c(ccu.this.cM);
         }

         this.m();
      }

      private void m() {
         ccu.this.cM = null;
         ccu.this.cI = 200;
      }

      private boolean d(im $$0) {
         if (ccu.this.b($$0, 2)) {
            return true;
         } else {
            emf $$1 = ccu.this.bR.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends ccu.a {
      private static final int c = 600;
      int d = ccu.this.dN().z.a(10);

      f() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean h() {
         return ccu.this.cL != null && !ccu.this.ga() && this.k() && ccu.this.n(ccu.this.cL) && !ccu.this.b(ccu.this.cL, 2);
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
         ccu.this.bR.n();
         ccu.this.bR.g();
      }

      @Override
      public void e() {
         if (ccu.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               ccu.this.cL = null;
            } else if (!ccu.this.bR.m()) {
               if (ccu.this.m(ccu.this.cL)) {
                  ccu.this.cL = null;
               } else {
                  ccu.this.k(ccu.this.cL);
               }
            }
         }
      }

      private boolean k() {
         return ccu.this.cE > 2400;
      }
   }

   class g extends ccu.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (ccu.this.gI() >= 10) {
            return false;
         } else {
            return ccu.this.ah.i() < 0.3F ? false : ccu.this.gz() && ccu.this.gL();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (ccu.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               im $$1 = ccu.this.dn().c($$0);
               dpy $$2 = ccu.this.dN().a_($$1);
               dcv $$3 = $$2.b();
               dpy $$4 = null;
               if ($$2.a(avo.aI)) {
                  if ($$3 instanceof deq) {
                     deq $$5 = (deq)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dkr) {
                     int $$6 = $$2.c(dkr.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dkr.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dcx.oi)) {
                     int $$7 = $$2.c(dky.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dky.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dcx.sv) || $$2.a(dcx.sw)) {
                     ((dcy)$$2.b()).a((aqe)ccu.this.dN(), ccu.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     ccu.this.dN().c(2011, $$1, 15);
                     ccu.this.dN().b($$1, $$4);
                     ccu.this.gK();
                  }
               }
            }
         }
      }
   }

   class h extends bzt {
      h(ccu $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return ccu.this.Z_() && super.b();
      }

      @Override
      protected void a(brg $$0, bre $$1) {
         if ($$0 instanceof ccu && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends ccu.a {
      @Override
      public boolean h() {
         return ccu.this.cI == 0 && !ccu.this.gw() && ccu.this.gF();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         ccu.this.cI = 200;
         List<im> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (im $$1 : $$0) {
               if (!ccu.this.cO.b($$1)) {
                  ccu.this.cM = $$1;
                  return;
               }
            }

            ccu.this.cO.k();
            ccu.this.cM = $$0.get(0);
         }
      }

      private List<im> k() {
         im $$0 = ccu.this.dn();
         cch $$1 = ((aqe)ccu.this.dN()).y();
         Stream<cci> $$2 = $$1.c($$0x -> $$0x.a(avy.c), $$0, 20, cch.b.c);
         return $$2.map(cci::f).filter(ccu.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bxd {
      j(brg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!ccu.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ccu.this.cN.l();
      }
   }

   class k extends ccu.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dpy> f = $$0 -> {
         if ($$0.b(dqo.C) && $$0.c(dqo.C)) {
            return false;
         } else if ($$0.a(avo.U)) {
            return $$0.a(dcx.iD) ? $$0.c(dfd.b) == dqu.a : true;
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
      private etf o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean h() {
         if (ccu.this.cK > 0) {
            return false;
         } else if (ccu.this.gz()) {
            return false;
         } else if (ccu.this.dN().ac()) {
            return false;
         } else {
            Optional<im> $$0 = this.p();
            if ($$0.isPresent()) {
               ccu.this.cL = $$0.get();
               ccu.this.bR.a((double)ccu.this.cL.u() + 0.5, (double)ccu.this.cL.v() + 0.5, (double)ccu.this.cL.w() + 0.5, 1.2F);
               return true;
            } else {
               ccu.this.cK = axw.a(ccu.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!ccu.this.u()) {
            return false;
         } else if (ccu.this.dN().ac()) {
            return false;
         } else if (this.k()) {
            return ccu.this.ah.i() < 0.2F;
         } else if (ccu.this.ai % 20 == 0 && !ccu.this.n(ccu.this.cL)) {
            ccu.this.cL = null;
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
         ccu.this.gv();
      }

      @Override
      public void d() {
         if (this.k()) {
            ccu.this.w(true);
         }

         this.n = false;
         ccu.this.bR.n();
         ccu.this.cK = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            ccu.this.cL = null;
         } else {
            etf $$0 = etf.c(ccu.this.cL).b(0.0, 0.6F, 0.0);
            if ($$0.f(ccu.this.dl()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = ccu.this.dl().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  ccu.this.cL = null;
               } else {
                  if ($$1) {
                     boolean $$3 = ccu.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new etf($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        ccu.this.bR.n();
                     } else {
                        $$2 = false;
                     }

                     ccu.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (ccu.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     ccu.this.a(auz.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         ccu.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (ccu.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<im> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<im> a(Predicate<dpy> $$0, double $$1) {
         im $$2 = ccu.this.dn();
         im.a $$3 = new im.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(ccu.this.dN().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends byb {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         return ccu.this.bR.l() && ccu.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return ccu.this.bR.m();
      }

      @Override
      public void c() {
         etf $$0 = this.h();
         if ($$0 != null) {
            ccu.this.bR.a(ccu.this.bR.a(im.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private etf h() {
         etf $$1;
         if (ccu.this.gL() && !ccu.this.b(ccu.this.cM, 22)) {
            etf $$0 = etf.b(ccu.this.cM);
            $$1 = $$0.d(ccu.this.dl()).d();
         } else {
            $$1 = ccu.this.f(0.0F);
         }

         int $$3 = 8;
         etf $$4 = cca.a(ccu.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cbw.a(ccu.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
