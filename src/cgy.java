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
   private static final ajx<Byte> ci = akb.a(cgy.class, ajz.a);
   private static final ajx<Integer> cj = akb.a(cgy.class, ajz.b);
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

   public cgy(bur<? extends cgy> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbe(this, 20, true);
      this.bO = new cgy.j(this);
      this.a(etq.n, -1.0F);
      this.a(etq.j, -1.0F);
      this.a(etq.k, 16.0F);
      this.a(etq.x, -1.0F);
      this.a(etq.h, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
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
      if (this.gr()) {
         $$0.a("hive_pos", uf.a(this.gs()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uf.a(this.p()));
      }

      $$0.a("HasNectar", this.gB());
      $$0.a("HasStung", this.gC());
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
      this.a(this.dW(), $$0);
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      bta $$2 = this.dX().a((bvg)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bwo.c)));
      if ($$3) {
         ddb.a($$0, $$1, $$2);
         if ($$1 instanceof bvg $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dW().am() == bsg.c) {
               $$5 = 10;
            } else if (this.dW().am() == bsg.d) {
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
      if (this.gB() && this.gM() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dW(), this.dB() - 0.3F, this.dB() + 0.3F, this.dH() - 0.3F, this.dH() + 0.3F, this.e(0.5), lt.aA);
         }
      }

      this.gK();
   }

   private void a(dgi $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lr $$6) {
      $$0.a($$6, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ji $$0) {
      fba $$1 = fba.c($$0);
      int $$2 = 0;
      ji $$3 = this.dw();
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

      fba $$8 = cga.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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
   public List<ji> gp() {
      return this.cT.f;
   }

   private boolean gG() {
      return this.cH > 3600;
   }

   void gH() {
      this.cR = null;
      this.cL = 200;
   }

   void gI() {
      this.cQ = null;
      this.cP = ayz.a(this.ae, 20, 60);
   }

   boolean gJ() {
      if (this.cI <= 0 && !this.cS.l() && !this.gC() && this.O_() == null) {
         boolean $$0 = this.gG() || c(this.dW()) || this.gB();
         return $$0 && !this.gL();
      } else {
         return false;
      }
   }

   public static boolean c(dgi $$0) {
      return $$0.G_().g() && ($$0.W() || $$0.ag());
   }

   public void s(int $$0) {
      this.cI = $$0;
   }

   public float J(float $$0) {
      return ayz.h($$0, this.cF, this.cE);
   }

   private void gK() {
      this.cF = this.cE;
      if (this.gR()) {
         this.cE = Math.min(1.0F, this.cE + 0.2F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.24F);
      }
   }

   @Override
   protected void a(arc $$0) {
      boolean $$1 = this.gC();
      if (this.bm()) {
         this.cV++;
      } else {
         this.cV = 0;
      }

      if (this.cV > 20) {
         this.a($$0, this.dX().i(), 1.0F);
      }

      if ($$1) {
         this.cG++;
         if (this.cG % 5 == 0 && this.ae.a(ayz.a(1200 - this.cG, 1, 1200)) == 0) {
            this.a($$0, this.dX().p(), this.eE());
         }
      }

      if (!this.gB()) {
         this.cH++;
      }

      this.a($$0, false);
   }

   public void gq() {
      this.cH = 0;
   }

   private boolean gL() {
      dtw $$0 = this.gP();
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
      dtz $$1 = this.dW().c_($$0);
      return $$1 instanceof dtw ? !((dtw)$$1).d() : false;
   }

   @bag
   public boolean gr() {
      return this.cR != null;
   }

   @Nullable
   @bag
   public ji gs() {
      return this.cR;
   }

   @bag
   public ccf gt() {
      return this.bS;
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   int gM() {
      return this.cJ;
   }

   private void gN() {
      this.cJ = 0;
   }

   void gO() {
      this.cJ++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         if (this.cI > 0) {
            this.cI--;
         }

         if (this.cL > 0) {
            this.cL--;
         }

         if (this.cP > 0) {
            this.cP--;
         }

         boolean $$0 = this.ac_() && !this.gC() && this.O_() != null && this.O_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gQ()) {
            this.cR = null;
         }
      }
   }

   @Nullable
   dtw gP() {
      if (this.cR == null) {
         return null;
      } else {
         return this.l(this.cR) ? null : this.dW().a(this.cR, dub.I).orElse(null);
      }
   }

   boolean gQ() {
      return this.gP() != null;
   }

   public boolean gB() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gq();
      }

      this.d(8, $$0);
   }

   public boolean gC() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gR() {
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

   public static bwn.a gD() {
      return cgx.gu().a(bwo.s, 10.0).a(bwo.l, 0.6F).a(bwo.v, 0.3F).a(bwo.c, 2.0);
   }

   @Override
   protected ces b(dgi $$0) {
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
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cuv $$3 && $$3.d() instanceof dmp $$4) {
         btp $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dW().C) {
               this.a($$5);
            }

            return bsj.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.am);
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
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
   public cgy b(arc $$0, bub $$1) {
      return bur.l.a($$0, buq.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
   }

   @Override
   public boolean ba() {
      return this.gE() && this.af % bZ == 0;
   }

   @Override
   public boolean gE() {
      return !this.aJ();
   }

   public void gF() {
      this.x(false);
      this.gN();
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cS.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axf<esy> $$0) {
      this.h(this.dz().b(0.0, 0.01, 0.0));
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.2F));
   }

   boolean b(ji $$0, int $$1) {
      return $$0.a(this.dw(), (double)$$1);
   }

   public void i(ji $$0) {
      this.cR = $$0;
   }

   static boolean c(dwx $$0) {
      if ($$0.a(awp.W)) {
         if ($$0.a(dxn.J, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(djo.jb) ? $$0.c(dlv.b) == dxs.a : true;
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
         return super.b() && cgy.this.ac_() && !cgy.this.gC();
      }

      @Override
      public boolean c() {
         return super.c() && cgy.this.ac_() && !cgy.this.gC();
      }
   }

   static class c extends cdx<cox> {
      c(cgy $$0) {
         super($$0, cox.class, 10, true, false, $$0::a);
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
         return $$0.ac_() && !$$0.gC();
      }
   }

   class d extends cgy.a {
      @Override
      public boolean h() {
         if (cgy.this.cR != null && cgy.this.gJ() && cgy.this.cR.a(cgy.this.du(), 2.0)) {
            dtw $$0 = cgy.this.gP();
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
         dtw $$0 = cgy.this.gP();
         if ($$0 != null) {
            $$0.a(cgy.this);
         }
      }
   }

   @bag
   public class e extends cgy.a {
      public static final int b = 2400;
      int d = cgy.this.dW().A.a(10);
      private static final int e = 3;
      final List<ji> f = Lists.newArrayList();
      @Nullable
      private etn g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean h() {
         return cgy.this.cR != null
            && !cgy.this.l(cgy.this.cR)
            && !cgy.this.gb()
            && cgy.this.gJ()
            && !this.d(cgy.this.cR)
            && cgy.this.dW().a_(cgy.this.cR).a(awp.aJ);
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
                     cgy.this.gH();
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
                        cgy.this.gH();
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

         cgy.this.gH();
      }

      private boolean d(ji $$0) {
         if (cgy.this.b($$0, 2)) {
            return true;
         } else {
            etn $$1 = cgy.this.bR.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgy.a {
      private static final int c = 2400;
      int d = cgy.this.dW().A.a(10);

      f() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean h() {
         return cgy.this.cQ != null && !cgy.this.gb() && this.k() && !cgy.this.b(cgy.this.cQ, 2);
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
               cgy.this.gI();
            } else if (!cgy.this.bR.l()) {
               if (cgy.this.l(cgy.this.cQ)) {
                  cgy.this.gI();
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
         if (cgy.this.gM() >= 10) {
            return false;
         } else {
            return cgy.this.ae.i() < 0.3F ? false : cgy.this.gB() && cgy.this.gQ();
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
               ji $$1 = cgy.this.dw().c($$0);
               dwx $$2 = cgy.this.dW().a_($$1);
               djm $$3 = $$2.b();
               dwx $$4 = null;
               if ($$2.a(awp.aL)) {
                  if ($$3 instanceof dli) {
                     dli $$5 = (dli)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof drn) {
                     int $$6 = $$2.c(drn.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(drn.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(djo.oK)) {
                     int $$7 = $$2.c(dru.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dru.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(djo.sX) || $$2.a(djo.sY)) {
                     djp $$8 = (djp)$$2.b();
                     if ($$8.a(cgy.this.dW(), $$1, $$2)) {
                        $$8.a((arc)cgy.this.dW(), cgy.this.ae, $$1, $$2);
                        $$4 = cgy.this.dW().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgy.this.dW().c(2011, $$1, 15);
                     cgy.this.dW().b($$1, $$4);
                     cgy.this.gO();
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
         return cgy.this.cL == 0 && !cgy.this.gr() && cgy.this.gJ();
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
         ji $$0 = cgy.this.dw();
         cgk $$1 = ((arc)cgy.this.dW()).A();
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
      private fba m;
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
         } else if (cgy.this.gB()) {
            return false;
         } else if (cgy.this.dW().ag()) {
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
         } else if (cgy.this.dW().ag()) {
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
         cgy.this.gq();
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
               cgy.this.gI();
               this.l = false;
               cgy.this.cP = 200;
            } else {
               fba $$0 = fba.c(cgy.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgy.this.du()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cgy.this.du().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cgy.this.gI();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgy.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fba($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgy.this.bR.m();
                        } else {
                           $$2 = false;
                        }

                        cgy.this.H().a($$0.a(), $$0.b(), $$0.c());
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
         cgy.this.I().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cgy.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ji> p() {
         Iterable<ji> $$0 = ji.a(cgy.this.dw(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (ji $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgy.this.dW().ad() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cgy.c(cgy.this.dW().a_($$2))) {
               etn $$4 = cgy.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgy.this.dW().ad() + 600L);
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
         fba $$0 = this.h();
         if ($$0 != null) {
            cgy.this.bR.a(cgy.this.bR.a(ji.a((kb)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fba h() {
         fba $$1;
         if (cgy.this.gQ() && !cgy.this.b(cgy.this.cR, this.i())) {
            fba $$0 = fba.b(cgy.this.cR);
            $$1 = $$0.d(cgy.this.du()).d();
         } else {
            $$1 = cgy.this.g(0.0F);
         }

         int $$3 = 8;
         fba $$4 = cgd.a(cgy.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfz.a(cgy.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgy.this.gr() && !cgy.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgy.a {
      private final int c = ayz.a(cgy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgy.this.cQ != null && cgy.this.dW().p(cgy.this.cQ) && !this.a(cgy.this.cQ)) {
            cgy.this.gI();
         }

         this.d = cgy.this.dW().ad();
      }

      @Override
      public boolean h() {
         return cgy.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(ji $$0) {
         return cgy.c(cgy.this.dW().a_($$0));
      }
   }

   class n extends cgy.a {
      private final int c = ayz.a(cgy.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgy.this.cR != null && cgy.this.dW().p(cgy.this.cR) && !cgy.this.gQ()) {
            cgy.this.gH();
         }

         this.d = cgy.this.dW().ad();
      }

      @Override
      public boolean h() {
         return cgy.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
