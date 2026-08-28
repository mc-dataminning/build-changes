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

public class cgz extends cgy implements bvm, chh {
   public static final float bY = 120.32113F;
   public static final int bZ = ayz.f(1.4959966F);
   private static final ajy<Byte> ci = akc.a(cgz.class, aka.a);
   private static final ajy<Integer> cj = akc.a(cgz.class, aka.b);
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
   private static final brv cC = bab.a(20, 39);
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
   cgz.k cS;
   cgz.e cT;
   private cgz.f cU;
   private int cV;

   public cgz(bus<? extends cgz> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbf(this, 20, true);
      this.bO = new cgz.j(this);
      this.a(etq.n, -1.0F);
      this.a(etq.j, -1.0F);
      this.a(etq.k, 16.0F);
      this.a(etq.x, -1.0F);
      this.a(etq.h, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void E() {
      this.bS.a(0, new cgz.b(this, 1.4F, true));
      this.bS.a(1, new cgz.d());
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.25, $$0 -> $$0.a(awy.am), false));
      this.bS.a(3, new cgz.n());
      this.bS.a(3, new cgz.m());
      this.cS = new cgz.k();
      this.bS.a(4, this.cS);
      this.bS.a(5, new cce(this, 1.25));
      this.bS.a(5, new cgz.i());
      this.cT = new cgz.e();
      this.bS.a(5, this.cT);
      this.cU = new cgz.f();
      this.bS.a(6, this.cU);
      this.bS.a(7, new cgz.g());
      this.bS.a(8, new cgz.l());
      this.bS.a(9, new cbz(this));
      this.bT.a(1, new cgz.h(this).a(new Class[0]));
      this.bT.a(2, new cgz.c(this));
      this.bT.a(3, new cee<>(this, true));
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
   public boolean c(ard $$0, bul $$1) {
      btb $$2 = this.dW().a((bvh)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bwp.c)));
      if ($$3) {
         ddb.a($$0, $$1, $$2);
         if ($$1 instanceof bvh $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dV().am() == bsh.c) {
               $$5 = 10;
            } else if (this.dV().am() == bsh.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new btq(bts.s, $$5 * 20, 0), this);
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

   private void a(dgi $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lr $$6) {
      $$0.a($$6, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ji $$0) {
      fba $$1 = fba.c($$0);
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

      fba $$8 = cgb.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   public static boolean c(dgi $$0) {
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
      dtw $$0 = this.gS();
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
      dtz $$1 = this.dV().c_($$0);
      return $$1 instanceof dtw ? !((dtw)$$1).d() : false;
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
   public ccg gw() {
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
   dtw gS() {
      if (this.cR == null) {
         return null;
      } else {
         return this.l(this.cR) ? null : this.dV().a(this.cR, dub.I).orElse(null);
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

   public static bwo.a gG() {
      return cgy.gx().a(bwp.s, 10.0).a(bwp.l, 0.6F).a(bwp.v, 0.3F).a(bwp.c, 2.0);
   }

   @Override
   protected cet b(dgi $$0) {
      cer $$1 = new cer(this, $$0) {
         @Override
         public boolean a(ji $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgz.this.cS.l()) {
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
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cuv $$3 && $$3.d() instanceof dmp $$4) {
         btq $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bsk.a;
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
   protected avz e(btb $$0) {
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
   public cgz b(ard $$0, buc $$1) {
      return bus.l.a($$0, bur.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
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
   public boolean a(ard $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cS.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axf<esy> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(ji $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(ji $$0) {
      this.cR = $$0;
   }

   public static boolean c(dwx $$0) {
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

   abstract class a extends ccf {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgz.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgz.this.ac_();
      }
   }

   class b extends ccp {
      b(final bvp $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgz.this.ac_() && !cgz.this.gF();
      }

      @Override
      public boolean c() {
         return super.c() && cgz.this.ac_() && !cgz.this.gF();
      }
   }

   static class c extends cdy<cox> {
      c(cgz $$0) {
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
         cgz $$0 = (cgz)this.e;
         return $$0.ac_() && !$$0.gF();
      }
   }

   class d extends cgz.a {
      @Override
      public boolean h() {
         if (cgz.this.cR != null && cgz.this.gM() && cgz.this.cR.a(cgz.this.dt(), 2.0)) {
            dtw $$0 = cgz.this.gS();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cgz.this.cR = null;
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
         dtw $$0 = cgz.this.gS();
         if ($$0 != null) {
            $$0.a(cgz.this);
         }
      }
   }

   @bag
   public class e extends cgz.a {
      public static final int b = 2400;
      int d = cgz.this.dV().A.a(10);
      private static final int e = 3;
      final List<ji> f = Lists.newArrayList();
      @Nullable
      private etn g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         return cgz.this.cR != null
            && !cgz.this.l(cgz.this.cR)
            && !cgz.this.ge()
            && cgz.this.gM()
            && !this.d(cgz.this.cR)
            && cgz.this.dV().a_(cgz.this.cR).a(awp.aJ);
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
         cgz.this.bR.m();
         cgz.this.bR.f();
      }

      @Override
      public void a() {
         if (cgz.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgz.this.bR.l()) {
               if (!cgz.this.b(cgz.this.cR, 16)) {
                  if (cgz.this.l(cgz.this.cR)) {
                     cgz.this.gK();
                  } else {
                     cgz.this.j(cgz.this.cR);
                  }
               } else {
                  boolean $$0 = this.a(cgz.this.cR);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgz.this.bR.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgz.this.gK();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgz.this.bR.i();
                  }
               }
            }
         }
      }

      private boolean a(ji $$0) {
         int $$1 = cgz.this.b($$0, 3) ? 1 : 2;
         cgz.this.bR.b(10.0F);
         cgz.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgz.this.bR.i() != null && cgz.this.bR.i().j();
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
         if (cgz.this.cR != null) {
            this.c(cgz.this.cR);
         }

         cgz.this.gK();
      }

      private boolean d(ji $$0) {
         if (cgz.this.b($$0, 2)) {
            return true;
         } else {
            etn $$1 = cgz.this.bR.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgz.a {
      private static final int c = 2400;
      int d = cgz.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         return cgz.this.cQ != null && !cgz.this.ge() && this.k() && !cgz.this.b(cgz.this.cQ, 2);
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
         cgz.this.bR.m();
         cgz.this.bR.f();
      }

      @Override
      public void a() {
         if (cgz.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgz.this.gL();
            } else if (!cgz.this.bR.l()) {
               if (cgz.this.l(cgz.this.cQ)) {
                  cgz.this.gL();
               } else {
                  cgz.this.j(cgz.this.cQ);
               }
            }
         }
      }

      private boolean k() {
         return cgz.this.cH > 600;
      }
   }

   class g extends cgz.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgz.this.gP() >= 10) {
            return false;
         } else {
            return cgz.this.ae.i() < 0.3F ? false : cgz.this.gE() && cgz.this.gT();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgz.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ji $$1 = cgz.this.dv().c($$0);
               dwx $$2 = cgz.this.dV().a_($$1);
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
                     if ($$8.a(cgz.this.dV(), $$1, $$2)) {
                        $$8.a((ard)cgz.this.dV(), cgz.this.ae, $$1, $$2);
                        $$4 = cgz.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgz.this.dV().c(2011, $$1, 15);
                     cgz.this.dV().b($$1, $$4);
                     cgz.this.gR();
                  }
               }
            }
         }
      }
   }

   class h extends cdx {
      h(final cgz $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgz.this.ac_() && super.c();
      }

      @Override
      protected void a(bvj $$0, bvh $$1) {
         if ($$0 instanceof cgz && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgz.a {
      @Override
      public boolean h() {
         return cgz.this.cL == 0 && !cgz.this.gu() && cgz.this.gM();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgz.this.cL = 200;
         List<ji> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ji $$1 : $$0) {
               if (!cgz.this.cT.b($$1)) {
                  cgz.this.cR = $$1;
                  return;
               }
            }

            cgz.this.cT.k();
            cgz.this.cR = $$0.get(0);
         }
      }

      private List<ji> k() {
         ji $$0 = cgz.this.dv();
         cgl $$1 = ((ard)cgz.this.dV()).A();
         Stream<cgm> $$2 = $$1.c($$0x -> $$0x.a(axa.c), $$0, 20, cgl.b.c);
         return $$2.map(cgm::g).filter(cgz.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbh {
      j(final bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgz.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgz.this.cS.l();
      }
   }

   class k extends cgz.a {
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
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         if (cgz.this.cP > 0) {
            return false;
         } else if (cgz.this.gE()) {
            return false;
         } else if (cgz.this.dV().ag()) {
            return false;
         } else {
            Optional<ji> $$0 = this.p();
            if ($$0.isPresent()) {
               cgz.this.cQ = $$0.get();
               cgz.this.bR.a((double)cgz.this.cQ.u() + 0.5, (double)cgz.this.cQ.v() + 0.5, (double)cgz.this.cQ.w() + 0.5, 1.2F);
               return true;
            } else {
               cgz.this.cP = ayz.a(cgz.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cgz.this.t()) {
            return false;
         } else if (cgz.this.dV().ag()) {
            return false;
         } else {
            return this.k() ? cgz.this.ae.i() < 0.2F : true;
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
         cgz.this.gt();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgz.this.x(true);
         }

         this.l = false;
         cgz.this.bR.m();
         cgz.this.cP = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgz.this.t()) {
            this.n++;
            if (this.n > 600) {
               cgz.this.gL();
               this.l = false;
               cgz.this.cP = 200;
            } else {
               fba $$0 = fba.c(cgz.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgz.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cgz.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cgz.this.gL();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgz.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fba($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgz.this.bR.m();
                        } else {
                           $$2 = false;
                        }

                        cgz.this.L().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cgz.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cgz.this.a(awa.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgz.this.N().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cgz.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ji> p() {
         Iterable<ji> $$0 = ji.a(cgz.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (ji $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgz.this.dV().ad() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cgz.c(cgz.this.dV().a_($$2))) {
               etn $$4 = cgz.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgz.this.dV().ad() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends ccf {
      l() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         return cgz.this.bR.k() && cgz.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgz.this.bR.l();
      }

      @Override
      public void d() {
         fba $$0 = this.h();
         if ($$0 != null) {
            cgz.this.bR.a(cgz.this.bR.a(ji.a((kb)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fba h() {
         fba $$1;
         if (cgz.this.gT() && !cgz.this.b(cgz.this.cR, this.i())) {
            fba $$0 = fba.b(cgz.this.cR);
            $$1 = $$0.d(cgz.this.dt()).d();
         } else {
            $$1 = cgz.this.g(0.0F);
         }

         int $$3 = 8;
         fba $$4 = cge.a(cgz.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cga.a(cgz.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgz.this.gu() && !cgz.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgz.a {
      private final int c = ayz.a(cgz.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgz.this.cQ != null && cgz.this.dV().p(cgz.this.cQ) && !this.a(cgz.this.cQ)) {
            cgz.this.gL();
         }

         this.d = cgz.this.dV().ad();
      }

      @Override
      public boolean h() {
         return cgz.this.dV().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(ji $$0) {
         return cgz.c(cgz.this.dV().a_($$0));
      }
   }

   class n extends cgz.a {
      private final int c = ayz.a(cgz.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgz.this.cR != null && cgz.this.dV().p(cgz.this.cR) && !cgz.this.gT()) {
            cgz.this.gK();
         }

         this.d = cgz.this.dV().ad();
      }

      @Override
      public boolean h() {
         return cgz.this.dV().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
