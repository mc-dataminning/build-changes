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

public class bws extends bwr implements bln, bxa {
   public static final float bT = 120.32113F;
   public static final int bU = atm.f(1.4959966F);
   private static final afo<Byte> cd = afr.a(bws.class, afq.a);
   private static final afo<Integer> ce = afr.a(bws.class, afq.b);
   private static final int cf = 2;
   private static final int cg = 4;
   private static final int ch = 8;
   private static final int ci = 1200;
   private static final int cj = 2400;
   private static final int ck = 3600;
   private static final int cl = 4;
   private static final int cm = 10;
   private static final int cn = 10;
   private static final int co = 18;
   private static final int cp = 32;
   private static final int cq = 2;
   private static final int cr = 16;
   private static final int cs = 20;
   public static final String bW = "CropsGrownSincePollination";
   public static final String bX = "CannotEnterHiveTicks";
   public static final String bY = "TicksSincePollination";
   public static final String bZ = "HasStung";
   public static final String ca = "HasNectar";
   public static final String cb = "FlowerPos";
   public static final String cc = "HivePos";
   private static final bii ct = aul.a(20, 39);
   @Nullable
   private UUID cu;
   private float cv;
   private float cw;
   private int cx;
   int cy;
   private int cz;
   private int cA;
   private static final int cB = 200;
   int cC;
   private static final int cD = 200;
   int cE = atm.a(this.ag, 20, 60);
   @Nullable
   ht cF;
   @Nullable
   ht cG;
   bws.k cH;
   bws.e cI;
   private bws.f cJ;
   private int cK;

   public bws(bku<? extends bws> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brb(this, 20, true);
      this.bK = new bws.j(this);
      this.a(edd.n, -1.0F);
      this.a(edd.j, -1.0F);
      this.a(edd.k, 16.0F);
      this.a(edd.x, -1.0F);
      this.a(edd.h, -1.0F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bws.b(this, 1.4F, true));
      this.bO.a(1, new bws.d());
      this.bO.a(2, new brn(this, 1.0));
      this.bO.a(3, new btj(this, 1.25, cok.a(aro.S), false));
      this.cH = new bws.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bsa(this, 1.25));
      this.bO.a(5, new bws.i());
      this.cI = new bws.e();
      this.bO.a(5, this.cI);
      this.cJ = new bws.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bws.g());
      this.bO.a(8, new bws.l());
      this.bO.a(9, new brv(this));
      this.bP.a(1, new bws.h(this).a(new Class[0]));
      this.bP.a(2, new bws.c(this));
      this.bP.a(3, new bua<>(this, true));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("HivePos", so.a(this.gn()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", so.a(this.u()));
      }

      $$0.a("HasNectar", this.gp());
      $$0.a("HasStung", this.gq());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = so.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = so.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cy = $$0.h("TicksSincePollination");
      this.cz = $$0.h("CannotEnterHiveTicks");
      this.cA = $$0.h("CropsGrownSincePollination");
      this.a(this.dN(), $$0);
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = $$0.a(this.dO().a((blg)this), (float)((int)this.b(bmm.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof blg) {
            ((blg)$$0).q(((blg)$$0).eQ() + 1);
            int $$2 = 0;
            if (this.dN().aj() == biu.c) {
               $$2 = 10;
            } else if (this.dN().aj() == biu.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((blg)$$0).b(new bkd(bkf.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.W_();
         this.a(aqr.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gp() && this.gy() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dN(), this.ds() - 0.3F, this.ds() + 0.3F, this.dy() - 0.3F, this.dy() + 0.3F, this.e(0.5), js.at);
         }
      }

      this.gw();
   }

   private void a(csa $$0, double $$1, double $$2, double $$3, double $$4, double $$5, jq $$6) {
      $$0.a($$6, atm.d($$0.z.j(), $$1, $$2), $$5, atm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ht $$0) {
      eju $$1 = eju.c($$0);
      int $$2 = 0;
      ht $$3 = this.dn();
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

      eju $$8 = bvv.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ht u() {
      return this.cF;
   }

   public boolean w() {
      return this.cF != null;
   }

   public void i(ht $$0) {
      this.cF = $$0;
   }

   @aup
   public int A() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @aup
   public List<ht> gf() {
      return this.cI.f;
   }

   private boolean gu() {
      return this.cy > 3600;
   }

   boolean gv() {
      if (this.cz <= 0 && !this.cH.l() && !this.gq() && this.q() == null) {
         boolean $$0 = this.gu() || this.dN().aa() || this.dN().P() || this.gp();
         return $$0 && !this.gx();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return atm.i($$0, this.cw, this.cv);
   }

   private void gw() {
      this.cw = this.cv;
      if (this.gC()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gq();
      if (this.bc()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dO().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.ag.a(atm.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dO().n(), this.ew());
         }
      }

      if (!this.gp()) {
         this.cy++;
      }

      if (!this.dN().B) {
         this.a((ame)this.dN(), false);
      }
   }

   public void gl() {
      this.cy = 0;
   }

   private boolean gx() {
      if (this.cG == null) {
         return false;
      } else {
         dfd $$0 = this.dN().c_(this.cG);
         return $$0 instanceof dfa && ((dfa)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.an.b(ce);
   }

   @Override
   public void a(int $$0) {
      this.an.b(ce, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cu;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cu = $$0;
   }

   @Override
   public void c() {
      this.a(ct.a(this.ag));
   }

   private boolean k(ht $$0) {
      dfd $$1 = this.dN().c_($$0);
      return $$1 instanceof dfa ? !((dfa)$$1).f() : false;
   }

   @aup
   public boolean gm() {
      return this.cG != null;
   }

   @Nullable
   @aup
   public ht gn() {
      return this.cG;
   }

   @aup
   public bsc go() {
      return this.bO;
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   int gy() {
      return this.cA;
   }

   private void gz() {
      this.cA = 0;
   }

   void gA() {
      this.cA++;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.Z_() && !this.gq() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gB()) {
            this.cG = null;
         }
      }
   }

   boolean gB() {
      if (!this.gm()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dfd $$0 = this.dN().c_(this.cG);
         return $$0 != null && $$0.u() == dff.H;
      }
   }

   public boolean gp() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gl();
      }

      this.d(8, $$0);
   }

   public boolean gq() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gC() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(ht $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.b(cd, (byte)(this.an.b(cd) | $$0));
      } else {
         this.an.b(cd, (byte)(this.an.b(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.b(cd) & $$0) != 0;
   }

   public static bml.a gr() {
      return bli.C().a(bmm.l, 10.0).a(bmm.f, 0.6F).a(bmm.m, 0.3F).a(bmm.c, 2.0).a(bmm.g, 48.0);
   }

   @Override
   protected bup b(csa $$0) {
      bun $$1 = new bun(this, $$0) {
         @Override
         public boolean a(ht $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bws.this.cH.l()) {
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
   public boolean m(clj $$0) {
      return $$0.a(aro.S);
   }

   boolean m(ht $$0) {
      return this.dN().o($$0) && this.dN().a_($$0).a(arg.U);
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
   }

   @Override
   protected aqq y() {
      return null;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.bA;
   }

   @Override
   protected aqq m_() {
      return aqr.bz;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Nullable
   public bws b(ame $$0, bkl $$1) {
      return bku.h.a((csa)$$0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
   }

   @Override
   public boolean aT() {
      return this.gs() && this.ah % bU == 0;
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   public void gt() {
      this.w(false);
      this.gz();
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bll eT() {
      return bll.c;
   }

   @Override
   protected void c(arv<ecr> $$0) {
      this.g(this.dq().b(0.0, 0.01, 0.0));
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.2F));
   }

   boolean b(ht $$0, int $$1) {
      return $$0.a(this.dn(), (double)$$1);
   }

   abstract class a extends bsb {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bws.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !bws.this.Z_();
      }
   }

   class b extends bsl {
      b(blp $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bws.this.Z_() && !bws.this.gq();
      }

      @Override
      public boolean b() {
         return super.b() && bws.this.Z_() && !bws.this.gq();
      }
   }

   static class c extends btu<cdu> {
      c(bws $$0) {
         super($$0, cdu.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.q() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         bws $$0 = (bws)this.e;
         return $$0.Z_() && !$$0.gq();
      }
   }

   class d extends bws.a {
      @Override
      public boolean h() {
         if (bws.this.gm() && bws.this.gv() && bws.this.cG.a(bws.this.dl(), 2.0) && bws.this.dN().c_(bws.this.cG) instanceof dfa $$1) {
            if (!$$1.f()) {
               return true;
            }

            bws.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bws.this.dN().c_(bws.this.cG) instanceof dfa $$1) {
            $$1.a(bws.this, bws.this.gp());
         }
      }
   }

   @aup
   public class e extends bws.a {
      public static final int b = 600;
      int d = bws.this.dN().z.a(10);
      private static final int e = 3;
      final List<ht> f = Lists.newArrayList();
      @Nullable
      private edh g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean h() {
         return bws.this.cG != null && !bws.this.fR() && bws.this.gv() && !this.d(bws.this.cG) && bws.this.dN().a_(bws.this.cG).a(arg.aF);
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
         bws.this.bN.n();
         bws.this.bN.g();
      }

      @Override
      public void e() {
         if (bws.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bws.this.bN.m()) {
               if (!bws.this.b(bws.this.cG, 16)) {
                  if (bws.this.l(bws.this.cG)) {
                     this.m();
                  } else {
                     bws.this.j(bws.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bws.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bws.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bws.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(ht $$0) {
         bws.this.bN.a(10.0F);
         bws.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bws.this.bN.j() != null && bws.this.bN.j().j();
      }

      boolean b(ht $$0) {
         return this.f.contains($$0);
      }

      private void c(ht $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bws.this.cG != null) {
            this.c(bws.this.cG);
         }

         this.m();
      }

      private void m() {
         bws.this.cG = null;
         bws.this.cC = 200;
      }

      private boolean d(ht $$0) {
         if (bws.this.b($$0, 2)) {
            return true;
         } else {
            edh $$1 = bws.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bws.a {
      private static final int c = 600;
      int d = bws.this.dN().z.a(10);

      f() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean h() {
         return bws.this.cF != null && !bws.this.fR() && this.k() && bws.this.m(bws.this.cF) && !bws.this.b(bws.this.cF, 2);
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
         bws.this.bN.n();
         bws.this.bN.g();
      }

      @Override
      public void e() {
         if (bws.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bws.this.cF = null;
            } else if (!bws.this.bN.m()) {
               if (bws.this.l(bws.this.cF)) {
                  bws.this.cF = null;
               } else {
                  bws.this.j(bws.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bws.this.cy > 2400;
      }
   }

   class g extends bws.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bws.this.gy() >= 10) {
            return false;
         } else {
            return bws.this.ag.i() < 0.3F ? false : bws.this.gp() && bws.this.gB();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bws.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ht $$1 = bws.this.dn().c($$0);
               dhi $$2 = bws.this.dN().a_($$1);
               cva $$3 = $$2.b();
               dhi $$4 = null;
               if ($$2.a(arg.aH)) {
                  if ($$3 instanceof cwv) {
                     cwv $$5 = (cwv)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dcv) {
                     int $$6 = $$2.c(dcv.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dcv.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cvc.oi)) {
                     int $$7 = $$2.c(ddc.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(ddc.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cvc.sv) || $$2.a(cvc.sw)) {
                     ((cvd)$$2.b()).a((ame)bws.this.dN(), bws.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bws.this.dN().c(2005, $$1, 0);
                     bws.this.dN().b($$1, $$4);
                     bws.this.gA();
                  }
               }
            }
         }
      }
   }

   class h extends btt {
      h(bws $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bws.this.Z_() && super.b();
      }

      @Override
      protected void a(bli $$0, blg $$1) {
         if ($$0 instanceof bws && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bws.a {
      @Override
      public boolean h() {
         return bws.this.cC == 0 && !bws.this.gm() && bws.this.gv();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bws.this.cC = 200;
         List<ht> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ht $$1 : $$0) {
               if (!bws.this.cI.b($$1)) {
                  bws.this.cG = $$1;
                  return;
               }
            }

            bws.this.cI.k();
            bws.this.cG = $$0.get(0);
         }
      }

      private List<ht> k() {
         ht $$0 = bws.this.dn();
         bwf $$1 = ((ame)bws.this.dN()).x();
         Stream<bwg> $$2 = $$1.c($$0x -> $$0x.a(arq.c), $$0, 20, bwf.b.c);
         return $$2.map(bwg::f).filter(bws.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends brd {
      j(bli $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bws.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bws.this.cH.l();
      }
   }

   class k extends bws.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dhi> f = $$0 -> {
         if ($$0.b(dhy.C) && $$0.c(dhy.C)) {
            return false;
         } else if ($$0.a(arg.U)) {
            return $$0.a(cvc.iD) ? $$0.c(cxi.b) == die.a : true;
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
      private eju o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean h() {
         if (bws.this.cE > 0) {
            return false;
         } else if (bws.this.gp()) {
            return false;
         } else if (bws.this.dN().aa()) {
            return false;
         } else {
            Optional<ht> $$0 = this.p();
            if ($$0.isPresent()) {
               bws.this.cF = $$0.get();
               bws.this.bN.a((double)bws.this.cF.u() + 0.5, (double)bws.this.cF.v() + 0.5, (double)bws.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bws.this.cE = atm.a(bws.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bws.this.w()) {
            return false;
         } else if (bws.this.dN().aa()) {
            return false;
         } else if (this.k()) {
            return bws.this.ag.i() < 0.2F;
         } else if (bws.this.ah % 20 == 0 && !bws.this.m(bws.this.cF)) {
            bws.this.cF = null;
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
         bws.this.gl();
      }

      @Override
      public void d() {
         if (this.k()) {
            bws.this.w(true);
         }

         this.n = false;
         bws.this.bN.n();
         bws.this.cE = 200;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bws.this.cF = null;
         } else {
            eju $$0 = eju.c(bws.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bws.this.dl()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bws.this.dl().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bws.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bws.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new eju($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bws.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bws.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bws.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bws.this.a(aqr.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bws.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bws.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ht> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ht> a(Predicate<dhi> $$0, double $$1) {
         ht $$2 = bws.this.dn();
         ht.a $$3 = new ht.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bws.this.dN().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bsb {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         return bws.this.bN.l() && bws.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bws.this.bN.m();
      }

      @Override
      public void c() {
         eju $$0 = this.h();
         if ($$0 != null) {
            bws.this.bN.a(bws.this.bN.a(ht.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private eju h() {
         eju $$1;
         if (bws.this.gB() && !bws.this.b(bws.this.cG, 22)) {
            eju $$0 = eju.b(bws.this.cG);
            $$1 = $$0.d(bws.this.dl()).d();
         } else {
            $$1 = bws.this.f(0.0F);
         }

         int $$3 = 8;
         eju $$4 = bvy.a(bws.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bvu.a(bws.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
