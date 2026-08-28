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

public class cgy extends cgx implements bvl, chg {
   public static final float bY = 120.32113F;
   public static final int bZ = ayz.f(1.4959966F);
   private static final ajy<Byte> ci = akc.a(cgy.class, aka.a);
   private static final ajy<Integer> cj = akc.a(cgy.class, aka.b);
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
   private static final int cz = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final bru cC = bab.a(20, 39);
   @Nullable
   private UUID cD;
   private float cE;
   private float cF;
   private int cG;
   int cH;
   private int cI;
   private int cJ;
   private static final int cK = 200;
   int cL;
   private static final int cM = 200;
   private static final int cN = 20;
   private static final int cO = 60;
   int cP = ayz.a(this.ae, 20, 60);
   @Nullable
   ji cQ;
   @Nullable
   ji cR;
   cgy.k cS;
   cgy.e cT;
   private cgy.f cU;
   private int cV;

   public cgy(bur<? extends cgy> $$0, dgh $$1) {
      super($$0, $$1);
      this.bP = new cbe(this, 20, true);
      this.bO = new cgy.j(this);
      this.a(etp.n, -1.0F);
      this.a(etp.j, -1.0F);
      this.a(etp.k, 16.0F);
      this.a(etp.x, -1.0F);
      this.a(etp.h, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(ji $$0, dgk $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void E() {
      this.bS.a(0, new cgy.b(this, 1.4F, true));
      this.bS.a(1, new cgy.d());
      this.bS.a(2, new cbq(this, 1.0));
      this.bS.a(3, new cdm(this, 1.25, $$0 -> $$0.a(awy.am), false));
      this.bS.a(3, new cgy.n());
      this.bS.a(3, new cgy.m());
      this.cS = new cgy.k();
      this.bS.a(4, this.cS);
      this.bS.a(5, new ccd(this, 1.25));
      this.bS.a(5, new cgy.i());
      this.cT = new cgy.e();
      this.bS.a(5, this.cT);
      this.cU = new cgy.f();
      this.bS.a(6, this.cU);
      this.bS.a(7, new cgy.g());
      this.bS.a(8, new cgy.l());
      this.bS.a(9, new cby(this));
      this.bT.a(1, new cgy.h(this).a(new Class[0]));
      this.bT.a(2, new cgy.c(this));
      this.bT.a(3, new ced<>(this, true));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", uf.a(this.gv()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uf.a(this.p()));
      }

      $$0.a("HasNectar", this.gE());
      $$0.a("HasStung", this.gF());
      $$0.a("TicksSincePollination", this.cH);
      $$0.a("CannotEnterHiveTicks", this.cI);
      $$0.a("CropsGrownSincePollination", this.cJ);
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cH = $$0.h("TicksSincePollination");
      this.cI = $$0.h("CannotEnterHiveTicks");
      this.cJ = $$0.h("CropsGrownSincePollination");
      this.cR = uf.a($$0, "hive_pos").orElse(null);
      this.cQ = uf.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(ard $$0, buk $$1) {
      bta $$2 = this.dW().a((bvg)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bwo.c)));
      if ($$3) {
         dda.a($$0, $$1, $$2);
         if ($$1 instanceof bvg $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dV().am() == bsg.c) {
               $$5 = 10;
            } else if (this.dV().am() == bsg.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new btp(btr.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.ae_();
         this.a(awa.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gE() && this.gP() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), lt.aA);
         }
      }

      this.gN();
   }

   private void a(dgh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lr $$6) {
      $$0.a($$6, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ji $$0) {
      faz $$1 = faz.c($$0);
      int $$2 = 0;
      ji $$3 = this.dv();
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

      faz $$8 = cga.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public ji p() {
      return this.cQ;
   }

   public boolean t() {
      return this.cQ != null;
   }

   public void h(ji $$0) {
      this.cQ = $$0;
   }

   @bag
   public int x() {
      return Math.max(this.cT.d, this.cU.d);
   }

   @bag
   public List<ji> gs() {
      return this.cT.f;
   }

   private boolean gJ() {
      return this.cH > 3600;
   }

   void gK() {
      this.cR = null;
      this.cL = 200;
   }

   void gL() {
      this.cQ = null;
      this.cP = ayz.a(this.ae, 20, 60);
   }

   boolean gM() {
      if (this.cI <= 0 && !this.cS.l() && !this.gF() && this.O_() == null) {
         boolean $$0 = this.gJ() || c(this.dV()) || this.gE();
         return $$0 && !this.gO();
      } else {
         return false;
      }
   }

   public static boolean c(dgh $$0) {
      return $$0.G_().g() && ($$0.W() || $$0.ag());
   }

   public void s(int $$0) {
      this.cI = $$0;
   }

   public float J(float $$0) {
      return ayz.h($$0, this.cF, this.cE);
   }

   private void gN() {
      this.cF = this.cE;
      if (this.gU()) {
         this.cE = Math.min(1.0F, this.cE + 0.2F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.24F);
      }
   }

   @Override
   protected void a(ard $$0) {
      boolean $$1 = this.gF();
      if (this.bm()) {
         this.cV++;
      } else {
         this.cV = 0;
      }

      if (this.cV > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cG++;
         if (this.cG % 5 == 0 && this.ae.a(ayz.a(1200 - this.cG, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eD());
         }
      }

      if (!this.gE()) {
         this.cH++;
      }

      this.a($$0, false);
   }

   public void gt() {
      this.cH = 0;
   }

   private boolean gO() {
      dtv $$0 = this.gS();
      return $$0 != null && $$0.b();
   }

   @Override
   public int a() {
      return this.al.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.al.a(cj, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cD;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cD = $$0;
   }

   @Override
   public void c() {
      this.a(cC.a(this.ae));
   }

   private boolean k(ji $$0) {
      dty $$1 = this.dV().c_($$0);
      return $$1 instanceof dtv ? !((dtv)$$1).d() : false;
   }

   @bag
   public boolean gu() {
      return this.cR != null;
   }

   @Nullable
   @bag
   public ji gv() {
      return this.cR;
   }

   @bag
   public ccf gw() {
      return this.bS;
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   int gP() {
      return this.cJ;
   }

   private void gQ() {
      this.cJ = 0;
   }

   void gR() {
      this.cJ++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         if (this.cI > 0) {
            this.cI--;
         }

         if (this.cL > 0) {
            this.cL--;
         }

         if (this.cP > 0) {
            this.cP--;
         }

         boolean $$0 = this.ac_() && !this.gF() && this.O_() != null && this.O_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gT()) {
            this.cR = null;
         }
      }
   }

   @Nullable
   dtv gS() {
      if (this.cR == null) {
         return null;
      } else {
         return this.l(this.cR) ? null : this.dV().a(this.cR, dua.I).orElse(null);
      }
   }

   boolean gT() {
      return this.gS() != null;
   }

   public boolean gE() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gF() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gU() {
      return this.t(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(ji $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(ci, (byte)(this.al.a(ci) | $$0));
      } else {
         this.al.a(ci, (byte)(this.al.a(ci) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(ci) & $$0) != 0;
   }

   public static bwn.a gG() {
      return cgx.gx().a(bwo.s, 10.0).a(bwo.l, 0.6F).a(bwo.v, 0.3F).a(bwo.c, 2.0);
   }

   @Override
   protected ces b(dgh $$0) {
      ceq $$1 = new ceq(this, $$0) {
         @Override
         public boolean a(ji $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgy.this.cS.l()) {
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
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cuu $$3 && $$3.d() instanceof dmo $$4) {
         btp $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bsj.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.am);
   }

   @Override
   protected void b(ji $$0, dww $$1) {
   }

   @Override
   protected avz u() {
      return null;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.bP;
   }

   @Override
   protected avz o_() {
      return awa.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public cgy b(ard $$0, bub $$1) {
      return bur.l.a($$0, buq.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dww $$2, ji $$3) {
   }

   @Override
   public boolean ba() {
      return this.gH() && this.af % bZ == 0;
   }

   @Override
   public boolean gH() {
      return !this.aJ();
   }

   public void gI() {
      this.x(false);
      this.gQ();
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cS.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axf<esx> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public faz cT() {
      return new faz(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(ji $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(ji $$0) {
      this.cR = $$0;
   }

   public static boolean c(dww $$0) {
      if ($$0.a(awp.W)) {
         if ($$0.a(dxm.J, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(djn.jb) ? $$0.c(dlu.b) == dxr.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cce {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgy.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgy.this.ac_();
      }
   }

   class b extends cco {
      b(final bvo $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgy.this.ac_() && !cgy.this.gF();
      }

      @Override
      public boolean c() {
         return super.c() && cgy.this.ac_() && !cgy.this.gF();
      }
   }

   static class c extends cdx<cow> {
      c(cgy $$0) {
         super($$0, cow.class, 10, true, false, $$0::a);
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
         cgy $$0 = (cgy)this.e;
         return $$0.ac_() && !$$0.gF();
      }
   }

   class d extends cgy.a {
      @Override
      public boolean h() {
         if (cgy.this.cR != null && cgy.this.gM() && cgy.this.cR.a(cgy.this.dt(), 2.0)) {
            dtv $$0 = cgy.this.gS();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cgy.this.cR = null;
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
         dtv $$0 = cgy.this.gS();
         if ($$0 != null) {
            $$0.a(cgy.this);
         }
      }
   }

   @bag
   public class e extends cgy.a {
      public static final int b = 2400;
      int d = cgy.this.dV().A.a(10);
      private static final int e = 3;
      final List<ji> f = Lists.newArrayList();
      @Nullable
      private etm g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean h() {
         return cgy.this.cR != null
            && !cgy.this.l(cgy.this.cR)
            && !cgy.this.ge()
            && cgy.this.gM()
            && !this.d(cgy.this.cR)
            && cgy.this.dV().a_(cgy.this.cR).a(awp.aJ);
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
         cgy.this.bR.m();
         cgy.this.bR.f();
      }

      @Override
      public void a() {
         if (cgy.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgy.this.bR.l()) {
               if (!cgy.this.b(cgy.this.cR, 16)) {
                  if (cgy.this.l(cgy.this.cR)) {
                     cgy.this.gK();
                  } else {
                     cgy.this.j(cgy.this.cR);
                  }
               } else {
                  boolean $$0 = this.a(cgy.this.cR);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgy.this.bR.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgy.this.gK();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgy.this.bR.i();
                  }
               }
            }
         }
      }

      private boolean a(ji $$0) {
         int $$1 = cgy.this.b($$0, 3) ? 1 : 2;
         cgy.this.bR.b(10.0F);
         cgy.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgy.this.bR.i() != null && cgy.this.bR.i().j();
      }

      boolean b(ji $$0) {
         return this.f.contains($$0);
      }

      private void c(ji $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cgy.this.cR != null) {
            this.c(cgy.this.cR);
         }

         cgy.this.gK();
      }

      private boolean d(ji $$0) {
         if (cgy.this.b($$0, 2)) {
            return true;
         } else {
            etm $$1 = cgy.this.bR.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgy.a {
      private static final int c = 2400;
      int d = cgy.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean h() {
         return cgy.this.cQ != null && !cgy.this.ge() && this.k() && !cgy.this.b(cgy.this.cQ, 2);
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
         cgy.this.bR.m();
         cgy.this.bR.f();
      }

      @Override
      public void a() {
         if (cgy.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgy.this.gL();
            } else if (!cgy.this.bR.l()) {
               if (cgy.this.l(cgy.this.cQ)) {
                  cgy.this.gL();
               } else {
                  cgy.this.j(cgy.this.cQ);
               }
            }
         }
      }

      private boolean k() {
         return cgy.this.cH > 600;
      }
   }

   class g extends cgy.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgy.this.gP() >= 10) {
            return false;
         } else {
            return cgy.this.ae.i() < 0.3F ? false : cgy.this.gE() && cgy.this.gT();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgy.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ji $$1 = cgy.this.dv().c($$0);
               dww $$2 = cgy.this.dV().a_($$1);
               djl $$3 = $$2.b();
               dww $$4 = null;
               if ($$2.a(awp.aL)) {
                  if ($$3 instanceof dlh) {
                     dlh $$5 = (dlh)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof drm) {
                     int $$6 = $$2.c(drm.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(drm.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(djn.oK)) {
                     int $$7 = $$2.c(drt.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(drt.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(djn.sX) || $$2.a(djn.sY)) {
                     djo $$8 = (djo)$$2.b();
                     if ($$8.a(cgy.this.dV(), $$1, $$2)) {
                        $$8.a((ard)cgy.this.dV(), cgy.this.ae, $$1, $$2);
                        $$4 = cgy.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgy.this.dV().c(2011, $$1, 15);
                     cgy.this.dV().b($$1, $$4);
                     cgy.this.gR();
                  }
               }
            }
         }
      }
   }

   class h extends cdw {
      h(final cgy $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgy.this.ac_() && super.c();
      }

      @Override
      protected void a(bvi $$0, bvg $$1) {
         if ($$0 instanceof cgy && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgy.a {
      @Override
      public boolean h() {
         return cgy.this.cL == 0 && !cgy.this.gu() && cgy.this.gM();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgy.this.cL = 200;
         List<ji> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ji $$1 : $$0) {
               if (!cgy.this.cT.b($$1)) {
                  cgy.this.cR = $$1;
                  return;
               }
            }

            cgy.this.cT.k();
            cgy.this.cR = $$0.get(0);
         }
      }

      private List<ji> k() {
         ji $$0 = cgy.this.dv();
         cgk $$1 = ((ard)cgy.this.dV()).A();
         Stream<cgl> $$2 = $$1.c($$0x -> $$0x.a(axa.c), $$0, 20, cgk.b.c);
         return $$2.map(cgl::g).filter(cgy.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbg {
      j(final bvi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgy.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgy.this.cS.l();
      }
   }

   class k extends cgy.a {
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
      private faz m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean h() {
         if (cgy.this.cP > 0) {
            return false;
         } else if (cgy.this.gE()) {
            return false;
         } else if (cgy.this.dV().ag()) {
            return false;
         } else {
            Optional<ji> $$0 = this.p();
            if ($$0.isPresent()) {
               cgy.this.cQ = $$0.get();
               cgy.this.bR.a((double)cgy.this.cQ.u() + 0.5, (double)cgy.this.cQ.v() + 0.5, (double)cgy.this.cQ.w() + 0.5, 1.2F);
               return true;
            } else {
               cgy.this.cP = ayz.a(cgy.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cgy.this.t()) {
            return false;
         } else if (cgy.this.dV().ag()) {
            return false;
         } else {
            return this.k() ? cgy.this.ae.i() < 0.2F : true;
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
         cgy.this.gt();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgy.this.x(true);
         }

         this.l = false;
         cgy.this.bR.m();
         cgy.this.cP = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgy.this.t()) {
            this.n++;
            if (this.n > 600) {
               cgy.this.gL();
               this.l = false;
               cgy.this.cP = 200;
            } else {
               faz $$0 = faz.c(cgy.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgy.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cgy.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cgy.this.gL();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgy.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new faz($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgy.this.bR.m();
                        } else {
                           $$2 = false;
                        }

                        cgy.this.L().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cgy.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cgy.this.a(awa.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgy.this.N().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cgy.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ji> p() {
         Iterable<ji> $$0 = ji.a(cgy.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (ji $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgy.this.dV().ad() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cgy.c(cgy.this.dV().a_($$2))) {
               etm $$4 = cgy.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgy.this.dV().ad() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cce {
      l() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         return cgy.this.bR.k() && cgy.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgy.this.bR.l();
      }

      @Override
      public void d() {
         faz $$0 = this.h();
         if ($$0 != null) {
            cgy.this.bR.a(cgy.this.bR.a(ji.a((kb)$$0), 1), 1.0);
         }
      }

      @Nullable
      private faz h() {
         faz $$1;
         if (cgy.this.gT() && !cgy.this.b(cgy.this.cR, this.i())) {
            faz $$0 = faz.b(cgy.this.cR);
            $$1 = $$0.d(cgy.this.dt()).d();
         } else {
            $$1 = cgy.this.g(0.0F);
         }

         int $$3 = 8;
         faz $$4 = cgd.a(cgy.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfz.a(cgy.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgy.this.gu() && !cgy.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgy.a {
      private final int c = ayz.a(cgy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgy.this.cQ != null && cgy.this.dV().p(cgy.this.cQ) && !this.a(cgy.this.cQ)) {
            cgy.this.gL();
         }

         this.d = cgy.this.dV().ad();
      }

      @Override
      public boolean h() {
         return cgy.this.dV().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(ji $$0) {
         return cgy.c(cgy.this.dV().a_($$0));
      }
   }

   class n extends cgy.a {
      private final int c = ayz.a(cgy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgy.this.cR != null && cgy.this.dV().p(cgy.this.cR) && !cgy.this.gT()) {
            cgy.this.gK();
         }

         this.d = cgy.this.dV().ad();
      }

      @Override
      public boolean h() {
         return cgy.this.dV().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
