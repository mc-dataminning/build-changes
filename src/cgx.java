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

public class cgx extends cgw implements bvk, chf {
   public static final float bY = 120.32113F;
   public static final int bZ = ayy.f(1.4959966F);
   private static final ajx<Byte> ci = akb.a(cgx.class, ajz.a);
   private static final ajx<Integer> cj = akb.a(cgx.class, ajz.b);
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
   private static final brt cC = baa.a(20, 39);
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
   int cP = ayy.a(this.ae, 20, 60);
   @Nullable
   ji cQ;
   @Nullable
   ji cR;
   cgx.k cS;
   cgx.e cT;
   private cgx.f cU;
   private int cV;

   public cgx(buq<? extends cgx> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cbd(this, 20, true);
      this.bO = new cgx.j(this);
      this.a(eto.n, -1.0F);
      this.a(eto.j, -1.0F);
      this.a(eto.k, 16.0F);
      this.a(eto.x, -1.0F);
      this.a(eto.h, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cgx.b(this, 1.4F, true));
      this.bS.a(1, new cgx.d());
      this.bS.a(2, new cbp(this, 1.0));
      this.bS.a(3, new cdl(this, 1.25, $$0 -> $$0.a(awx.am), false));
      this.bS.a(3, new cgx.n());
      this.bS.a(3, new cgx.m());
      this.cS = new cgx.k();
      this.bS.a(4, this.cS);
      this.bS.a(5, new ccc(this, 1.25));
      this.bS.a(5, new cgx.i());
      this.cT = new cgx.e();
      this.bS.a(5, this.cT);
      this.cU = new cgx.f();
      this.bS.a(6, this.cU);
      this.bS.a(7, new cgx.g());
      this.bS.a(8, new cgx.l());
      this.bS.a(9, new cbx(this));
      this.bT.a(1, new cgx.h(this).a(new Class[0]));
      this.bT.a(2, new cgx.c(this));
      this.bT.a(3, new cec<>(this, true));
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
   public boolean c(arc $$0, buj $$1) {
      bsz $$2 = this.dX().a((bvf)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bwn.c)));
      if ($$3) {
         dcz.a($$0, $$1, $$2);
         if ($$1 instanceof bvf $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dW().am() == bsf.c) {
               $$5 = 10;
            } else if (this.dW().am() == bsf.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bto(btq.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.ae_();
         this.a(avz.bS, 1.0F, 1.0F);
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

   private void a(dgg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lr $$6) {
      $$0.a($$6, ayy.d($$0.A.j(), $$1, $$2), $$5, ayy.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ji $$0) {
      fay $$1 = fay.c($$0);
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

      fay $$8 = cfz.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @baf
   public int x() {
      return Math.max(this.cT.d, this.cU.d);
   }

   @baf
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
      this.cP = ayy.a(this.ae, 20, 60);
   }

   boolean gJ() {
      if (this.cI <= 0 && !this.cS.l() && !this.gC() && this.O_() == null) {
         boolean $$0 = this.gG() || c(this.dW()) || this.gB();
         return $$0 && !this.gL();
      } else {
         return false;
      }
   }

   public static boolean c(dgg $$0) {
      return $$0.G_().g() && ($$0.W() || $$0.ag());
   }

   public void s(int $$0) {
      this.cI = $$0;
   }

   public float J(float $$0) {
      return ayy.h($$0, this.cF, this.cE);
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
         if (this.cG % 5 == 0 && this.ae.a(ayy.a(1200 - this.cG, 1, 1200)) == 0) {
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
      dtu $$0 = this.gP();
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
      dtx $$1 = this.dW().c_($$0);
      return $$1 instanceof dtu ? !((dtu)$$1).d() : false;
   }

   @baf
   public boolean gr() {
      return this.cR != null;
   }

   @Nullable
   @baf
   public ji gs() {
      return this.cR;
   }

   @baf
   public cce gt() {
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
   dtu gP() {
      if (this.cR == null) {
         return null;
      } else {
         return this.l(this.cR) ? null : this.dW().a(this.cR, dtz.I).orElse(null);
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

   public static bwm.a gD() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.l, 0.6F).a(bwn.v, 0.3F).a(bwn.c, 2.0);
   }

   @Override
   protected cer b(dgg $$0) {
      cep $$1 = new cep(this, $$0) {
         @Override
         public boolean a(ji $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgx.this.cS.l()) {
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
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cut $$3 && $$3.d() instanceof dmn $$4) {
         bto $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dW().C) {
               this.a($$5);
            }

            return bsi.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.am);
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
   }

   @Override
   protected avy u() {
      return null;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.bP;
   }

   @Override
   protected avy o_() {
      return avz.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public cgx b(arc $$0, bua $$1) {
      return buq.l.a($$0, bup.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwv $$2, ji $$3) {
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
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cS.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axe<esw> $$0) {
      this.h(this.dz().b(0.0, 0.01, 0.0));
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.2F));
   }

   boolean b(ji $$0, int $$1) {
      return $$0.a(this.dw(), (double)$$1);
   }

   public void i(ji $$0) {
      this.cR = $$0;
   }

   public static boolean c(dwv $$0) {
      if ($$0.a(awo.W)) {
         if ($$0.a(dxl.J, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(djm.jb) ? $$0.c(dlt.b) == dxq.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends ccd {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgx.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgx.this.ac_();
      }
   }

   class b extends ccn {
      b(final bvn $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgx.this.ac_() && !cgx.this.gC();
      }

      @Override
      public boolean c() {
         return super.c() && cgx.this.ac_() && !cgx.this.gC();
      }
   }

   static class c extends cdw<cov> {
      c(cgx $$0) {
         super($$0, cov.class, 10, true, false, $$0::a);
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
         cgx $$0 = (cgx)this.e;
         return $$0.ac_() && !$$0.gC();
      }
   }

   class d extends cgx.a {
      @Override
      public boolean h() {
         if (cgx.this.cR != null && cgx.this.gJ() && cgx.this.cR.a(cgx.this.du(), 2.0)) {
            dtu $$0 = cgx.this.gP();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cgx.this.cR = null;
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
         dtu $$0 = cgx.this.gP();
         if ($$0 != null) {
            $$0.a(cgx.this);
         }
      }
   }

   @baf
   public class e extends cgx.a {
      public static final int b = 2400;
      int d = cgx.this.dW().A.a(10);
      private static final int e = 3;
      final List<ji> f = Lists.newArrayList();
      @Nullable
      private etl g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean h() {
         return cgx.this.cR != null
            && !cgx.this.l(cgx.this.cR)
            && !cgx.this.gb()
            && cgx.this.gJ()
            && !this.d(cgx.this.cR)
            && cgx.this.dW().a_(cgx.this.cR).a(awo.aJ);
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
         cgx.this.bR.m();
         cgx.this.bR.f();
      }

      @Override
      public void a() {
         if (cgx.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgx.this.bR.l()) {
               if (!cgx.this.b(cgx.this.cR, 16)) {
                  if (cgx.this.l(cgx.this.cR)) {
                     cgx.this.gH();
                  } else {
                     cgx.this.j(cgx.this.cR);
                  }
               } else {
                  boolean $$0 = this.a(cgx.this.cR);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgx.this.bR.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgx.this.gH();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgx.this.bR.i();
                  }
               }
            }
         }
      }

      private boolean a(ji $$0) {
         int $$1 = cgx.this.b($$0, 3) ? 1 : 2;
         cgx.this.bR.b(10.0F);
         cgx.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgx.this.bR.i() != null && cgx.this.bR.i().j();
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
         if (cgx.this.cR != null) {
            this.c(cgx.this.cR);
         }

         cgx.this.gH();
      }

      private boolean d(ji $$0) {
         if (cgx.this.b($$0, 2)) {
            return true;
         } else {
            etl $$1 = cgx.this.bR.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgx.a {
      private static final int c = 2400;
      int d = cgx.this.dW().A.a(10);

      f() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean h() {
         return cgx.this.cQ != null && !cgx.this.gb() && this.k() && !cgx.this.b(cgx.this.cQ, 2);
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
         cgx.this.bR.m();
         cgx.this.bR.f();
      }

      @Override
      public void a() {
         if (cgx.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgx.this.gI();
            } else if (!cgx.this.bR.l()) {
               if (cgx.this.l(cgx.this.cQ)) {
                  cgx.this.gI();
               } else {
                  cgx.this.j(cgx.this.cQ);
               }
            }
         }
      }

      private boolean k() {
         return cgx.this.cH > 600;
      }
   }

   class g extends cgx.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgx.this.gM() >= 10) {
            return false;
         } else {
            return cgx.this.ae.i() < 0.3F ? false : cgx.this.gB() && cgx.this.gQ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgx.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ji $$1 = cgx.this.dw().c($$0);
               dwv $$2 = cgx.this.dW().a_($$1);
               djk $$3 = $$2.b();
               dwv $$4 = null;
               if ($$2.a(awo.aL)) {
                  if ($$3 instanceof dlg) {
                     dlg $$5 = (dlg)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof drl) {
                     int $$6 = $$2.c(drl.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(drl.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(djm.oK)) {
                     int $$7 = $$2.c(drs.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(drs.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(djm.sX) || $$2.a(djm.sY)) {
                     djn $$8 = (djn)$$2.b();
                     if ($$8.a(cgx.this.dW(), $$1, $$2)) {
                        $$8.a((arc)cgx.this.dW(), cgx.this.ae, $$1, $$2);
                        $$4 = cgx.this.dW().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgx.this.dW().c(2011, $$1, 15);
                     cgx.this.dW().b($$1, $$4);
                     cgx.this.gO();
                  }
               }
            }
         }
      }
   }

   class h extends cdv {
      h(final cgx $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgx.this.ac_() && super.c();
      }

      @Override
      protected void a(bvh $$0, bvf $$1) {
         if ($$0 instanceof cgx && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgx.a {
      @Override
      public boolean h() {
         return cgx.this.cL == 0 && !cgx.this.gr() && cgx.this.gJ();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgx.this.cL = 200;
         List<ji> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ji $$1 : $$0) {
               if (!cgx.this.cT.b($$1)) {
                  cgx.this.cR = $$1;
                  return;
               }
            }

            cgx.this.cT.k();
            cgx.this.cR = $$0.get(0);
         }
      }

      private List<ji> k() {
         ji $$0 = cgx.this.dw();
         cgj $$1 = ((arc)cgx.this.dW()).A();
         Stream<cgk> $$2 = $$1.c($$0x -> $$0x.a(awz.c), $$0, 20, cgj.b.c);
         return $$2.map(cgk::g).filter(cgx.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbf {
      j(final bvh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgx.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgx.this.cS.l();
      }
   }

   class k extends cgx.a {
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
      private fay m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean h() {
         if (cgx.this.cP > 0) {
            return false;
         } else if (cgx.this.gB()) {
            return false;
         } else if (cgx.this.dW().ag()) {
            return false;
         } else {
            Optional<ji> $$0 = this.p();
            if ($$0.isPresent()) {
               cgx.this.cQ = $$0.get();
               cgx.this.bR.a((double)cgx.this.cQ.u() + 0.5, (double)cgx.this.cQ.v() + 0.5, (double)cgx.this.cQ.w() + 0.5, 1.2F);
               return true;
            } else {
               cgx.this.cP = ayy.a(cgx.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cgx.this.t()) {
            return false;
         } else if (cgx.this.dW().ag()) {
            return false;
         } else {
            return this.k() ? cgx.this.ae.i() < 0.2F : true;
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
         cgx.this.gq();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgx.this.x(true);
         }

         this.l = false;
         cgx.this.bR.m();
         cgx.this.cP = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgx.this.t()) {
            this.n++;
            if (this.n > 600) {
               cgx.this.gI();
               this.l = false;
               cgx.this.cP = 200;
            } else {
               fay $$0 = fay.c(cgx.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgx.this.du()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cgx.this.du().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cgx.this.gI();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgx.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fay($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgx.this.bR.m();
                        } else {
                           $$2 = false;
                        }

                        cgx.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cgx.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cgx.this.a(avz.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgx.this.I().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cgx.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ji> p() {
         Iterable<ji> $$0 = ji.a(cgx.this.dw(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (ji $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgx.this.dW().ad() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cgx.c(cgx.this.dW().a_($$2))) {
               etl $$4 = cgx.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgx.this.dW().ad() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends ccd {
      l() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         return cgx.this.bR.k() && cgx.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgx.this.bR.l();
      }

      @Override
      public void d() {
         fay $$0 = this.h();
         if ($$0 != null) {
            cgx.this.bR.a(cgx.this.bR.a(ji.a((kb)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fay h() {
         fay $$1;
         if (cgx.this.gQ() && !cgx.this.b(cgx.this.cR, this.i())) {
            fay $$0 = fay.b(cgx.this.cR);
            $$1 = $$0.d(cgx.this.du()).d();
         } else {
            $$1 = cgx.this.g(0.0F);
         }

         int $$3 = 8;
         fay $$4 = cgc.a(cgx.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfy.a(cgx.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgx.this.gr() && !cgx.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgx.a {
      private final int c = ayy.a(cgx.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgx.this.cQ != null && cgx.this.dW().p(cgx.this.cQ) && !this.a(cgx.this.cQ)) {
            cgx.this.gI();
         }

         this.d = cgx.this.dW().ad();
      }

      @Override
      public boolean h() {
         return cgx.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(ji $$0) {
         return cgx.c(cgx.this.dW().a_($$0));
      }
   }

   class n extends cgx.a {
      private final int c = ayy.a(cgx.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgx.this.cR != null && cgx.this.dW().p(cgx.this.cR) && !cgx.this.gQ()) {
            cgx.this.gH();
         }

         this.d = cgx.this.dW().ad();
      }

      @Override
      public boolean h() {
         return cgx.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
