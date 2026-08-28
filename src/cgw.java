import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cgw extends cgv implements bvj, che {
   public static final float bY = 120.32113F;
   public static final int bZ = azn.f(1.4959966F);
   private static final ako<Byte> ci = aks.a(cgw.class, akq.a);
   private static final ako<Integer> cj = aks.a(cgw.class, akq.b);
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
   private static final int cA = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final brs cB = bap.a(20, 39);
   @Nullable
   private UUID cC;
   private float cD;
   private float cE;
   private int cF;
   int cG;
   private int cH;
   private int cI;
   private static final int cJ = 200;
   int cK;
   private static final int cL = 200;
   private static final int cM = 20;
   private static final int cN = 60;
   int cO = azn.a(this.af, 20, 60);
   @Nullable
   jh cP;
   @Nullable
   jh cQ;
   cgw.k cR;
   cgw.e cS;
   private cgw.f cT;
   private int cU;

   public cgw(bup<? extends cgw> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbc(this, 20, true);
      this.bO = new cgw.j(this);
      this.a(esf.n, -1.0F);
      this.a(esf.j, -1.0F);
      this.a(esf.k, 16.0F);
      this.a(esf.x, -1.0F);
      this.a(esf.h, -1.0F);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cgw.b(this, 1.4F, true));
      this.bS.a(1, new cgw.d());
      this.bS.a(2, new cbo(this, 1.0));
      this.bS.a(3, new cdk(this, 1.25, $$0 -> $$0.a(axm.an), false));
      this.bS.a(3, new cgw.n());
      this.bS.a(3, new cgw.m());
      this.cR = new cgw.k();
      this.bS.a(4, this.cR);
      this.bS.a(5, new ccb(this, 1.25));
      this.bS.a(5, new cgw.i());
      this.cS = new cgw.e();
      this.bS.a(5, this.cS);
      this.cT = new cgw.f();
      this.bS.a(6, this.cT);
      this.bS.a(7, new cgw.g());
      this.bS.a(8, new cgw.l());
      this.bS.a(9, new cbw(this));
      this.bT.a(1, new cgw.h(this).a(new Class[0]));
      this.bT.a(2, new cgw.c(this));
      this.bT.a(3, new ceb<>(this, true));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("hive_pos", vc.a(this.gy()));
      }

      if (this.t()) {
         $$0.a("flower_pos", vc.a(this.q()));
      }

      $$0.a("HasNectar", this.gH());
      $$0.a("HasStung", this.gI());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.a_($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.cQ = vc.a($$0, "hive_pos").orElse(null);
      this.cP = vc.a($$0, "flower_pos").orElse(null);
      this.a(this.dY(), $$0);
   }

   @Override
   public boolean E(bui $$0) {
      bsy $$1 = this.dZ().a((bve)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bwm.c)));
      if ($$2) {
         if (this.dY() instanceof arq $$3) {
            dby.a($$3, $$0, $$1);
         }

         if ($$0 instanceof bve $$4) {
            $$4.q($$4.eZ() + 1);
            int $$5 = 0;
            if (this.dY().ak() == bse.c) {
               $$5 = 10;
            } else if (this.dY().ak() == bse.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new btn(btp.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.aa_();
         this.a(awo.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gH() && this.gS() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dY(), this.dD() - 0.3F, this.dD() + 0.3F, this.dJ() - 0.3F, this.dJ() + 0.3F, this.e(0.5), ls.ay);
         }
      }

      this.gQ();
   }

   private void a(dff $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, azn.d($$0.A.j(), $$1, $$2), $$5, azn.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      ezr $$1 = ezr.c($$0);
      int $$2 = 0;
      jh $$3 = this.dy();
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

      ezr $$8 = cfy.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jh q() {
      return this.cP;
   }

   public boolean t() {
      return this.cP != null;
   }

   public void h(jh $$0) {
      this.cP = $$0;
   }

   @bau
   public int y() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @bau
   public List<jh> gv() {
      return this.cS.f;
   }

   private boolean gM() {
      return this.cG > 3600;
   }

   void gN() {
      this.cQ = null;
      this.cK = 200;
   }

   void gO() {
      this.cP = null;
      this.cO = azn.a(this.af, 20, 60);
   }

   boolean gP() {
      if (this.cH <= 0 && !this.cR.l() && !this.gI() && this.m() == null) {
         boolean $$0 = this.gM() || c(this.dY()) || this.gH();
         return $$0 && !this.gR();
      } else {
         return false;
      }
   }

   public static boolean c(dff $$0) {
      return $$0.D_().g() && ($$0.T() || $$0.ae());
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float J(float $$0) {
      return azn.h($$0, this.cE, this.cD);
   }

   private void gQ() {
      this.cE = this.cD;
      if (this.gW()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void ac() {
      boolean $$0 = this.gI();
      if (this.bo()) {
         this.cU++;
      } else {
         this.cU = 0;
      }

      if (this.cU > 20) {
         this.a(this.dZ().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.af.a(azn.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dZ().p(), this.eH());
         }
      }

      if (!this.gH()) {
         this.cG++;
      }

      if (!this.dY().C) {
         this.a((arq)this.dY(), false);
      }
   }

   public void gw() {
      this.cG = 0;
   }

   private boolean gR() {
      if (this.cQ == null) {
         return false;
      } else {
         dsr $$0 = this.dY().c_(this.cQ);
         return $$0 instanceof dso && ((dso)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.am.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.am.a(cj, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cC;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cC = $$0;
   }

   @Override
   public void c() {
      this.a(cB.a(this.af));
   }

   private boolean k(jh $$0) {
      dsr $$1 = this.dY().c_($$0);
      return $$1 instanceof dso ? !((dso)$$1).d() : false;
   }

   @bau
   public boolean gx() {
      return this.cQ != null;
   }

   @Nullable
   @bau
   public jh gy() {
      return this.cQ;
   }

   @bau
   public ccd gz() {
      return this.bS;
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   int gS() {
      return this.cI;
   }

   private void gT() {
      this.cI = 0;
   }

   void gU() {
      this.cI++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cO > 0) {
            this.cO--;
         }

         boolean $$0 = this.ae_() && !this.gI() && this.m() != null && this.m().g(this) < 4.0;
         this.z($$0);
         if (this.ag % 20 == 0 && !this.gV()) {
            this.cQ = null;
         }
      }
   }

   boolean gV() {
      if (!this.gx()) {
         return false;
      } else if (this.l(this.cQ)) {
         return false;
      } else {
         dsr $$0 = this.dY().c_(this.cQ);
         return $$0 != null && $$0.q() == dst.H;
      }
   }

   public boolean gH() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gw();
      }

      this.d(8, $$0);
   }

   public boolean gI() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gW() {
      return this.u(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jh $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(ci, (byte)(this.am.a(ci) | $$0));
      } else {
         this.am.a(ci, (byte)(this.am.a(ci) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.a(ci) & $$0) != 0;
   }

   public static bwl.a gJ() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.l, 0.6F).a(bwm.v, 0.3F).a(bwm.c, 2.0);
   }

   @Override
   protected ceq b(dff $$0) {
      ceo $$1 = new ceo(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgw.this.cR.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.an);
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
   }

   @Override
   protected awn w() {
      return null;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.bP;
   }

   @Override
   protected awn o_() {
      return awo.bO;
   }

   @Override
   protected float fj() {
      return 0.4F;
   }

   @Nullable
   public cgw b(arq $$0, btz $$1) {
      return bup.h.a($$0, buo.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   public boolean bc() {
      return this.gK() && this.ag % bZ == 0;
   }

   @Override
   public boolean gK() {
      return !this.aL();
   }

   public void gL() {
      this.x(false);
      this.gT();
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dY().C) {
            this.cR.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axt<ern> $$0) {
      this.h(this.dB().b(0.0, 0.01, 0.0));
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.5F * this.cU()), (double)(this.dt() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dy(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cQ = $$0;
   }

   abstract class a extends ccc {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgw.this.ae_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgw.this.ae_();
      }
   }

   class b extends ccm {
      b(final bvm $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgw.this.ae_() && !cgw.this.gI();
      }

      @Override
      public boolean c() {
         return super.c() && cgw.this.ae_() && !cgw.this.gI();
      }
   }

   static class c extends cdv<cor> {
      c(cgw $$0) {
         super($$0, cor.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.m() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cgw $$0 = (cgw)this.e;
         return $$0.ae_() && !$$0.gI();
      }
   }

   class d extends cgw.a {
      @Override
      public boolean h() {
         if (cgw.this.gx() && cgw.this.gP() && cgw.this.cQ.a(cgw.this.dw(), 2.0) && cgw.this.dY().c_(cgw.this.cQ) instanceof dso $$1) {
            if (!$$1.d()) {
               return true;
            }

            cgw.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cgw.this.dY().c_(cgw.this.cQ) instanceof dso $$1) {
            $$1.a(cgw.this);
         }
      }
   }

   @bau
   public class e extends cgw.a {
      public static final int b = 2400;
      int d = cgw.this.dY().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private esc g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean h() {
         return cgw.this.cQ != null && !cgw.this.gh() && cgw.this.gP() && !this.d(cgw.this.cQ) && cgw.this.dY().a_(cgw.this.cQ).a(axd.aI);
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
         cgw.this.bR.o();
         cgw.this.bR.h();
      }

      @Override
      public void a() {
         if (cgw.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgw.this.bR.n()) {
               if (!cgw.this.b(cgw.this.cQ, 16)) {
                  if (cgw.this.l(cgw.this.cQ)) {
                     cgw.this.gN();
                  } else {
                     cgw.this.j(cgw.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cgw.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgw.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgw.this.gN();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgw.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = cgw.this.b(cgw.this.cQ, 3) ? 1 : 2;
         cgw.this.bR.b(10.0F);
         cgw.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgw.this.bR.k() != null && cgw.this.bR.k().j();
      }

      boolean b(jh $$0) {
         return this.f.contains($$0);
      }

      private void c(jh $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cgw.this.cQ != null) {
            this.c(cgw.this.cQ);
         }

         cgw.this.gN();
      }

      private boolean d(jh $$0) {
         if (cgw.this.b($$0, 2)) {
            return true;
         } else {
            esc $$1 = cgw.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgw.a {
      private static final int c = 2400;
      int d = cgw.this.dY().A.a(10);

      f() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean h() {
         return cgw.this.cP != null && !cgw.this.gh() && this.k() && !cgw.this.b(cgw.this.cP, 2);
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
         cgw.this.bR.o();
         cgw.this.bR.h();
      }

      @Override
      public void a() {
         if (cgw.this.cP != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgw.this.gO();
            } else if (!cgw.this.bR.n()) {
               if (cgw.this.l(cgw.this.cP)) {
                  cgw.this.gO();
               } else {
                  cgw.this.j(cgw.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cgw.this.cG > 600;
      }
   }

   class g extends cgw.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgw.this.gS() >= 10) {
            return false;
         } else {
            return cgw.this.af.i() < 0.3F ? false : cgw.this.gH() && cgw.this.gV();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgw.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = cgw.this.dy().c($$0);
               dvo $$2 = cgw.this.dY().a_($$1);
               dij $$3 = $$2.b();
               dvo $$4 = null;
               if ($$2.a(axd.aK)) {
                  if ($$3 instanceof dke) {
                     dke $$5 = (dke)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dqf) {
                     int $$6 = $$2.c(dqf.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dqf.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dil.oi)) {
                     int $$7 = $$2.c(dqm.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dqm.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dil.sv) || $$2.a(dil.sw)) {
                     dim $$8 = (dim)$$2.b();
                     if ($$8.b(cgw.this.dY(), $$1, $$2)) {
                        $$8.a((arq)cgw.this.dY(), cgw.this.af, $$1, $$2);
                        $$4 = cgw.this.dY().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgw.this.dY().c(2011, $$1, 15);
                     cgw.this.dY().b($$1, $$4);
                     cgw.this.gU();
                  }
               }
            }
         }
      }
   }

   class h extends cdu {
      h(final cgw $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgw.this.ae_() && super.c();
      }

      @Override
      protected void a(bvg $$0, bve $$1) {
         if ($$0 instanceof cgw && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgw.a {
      @Override
      public boolean h() {
         return cgw.this.cK == 0 && !cgw.this.gx() && cgw.this.gP();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgw.this.cK = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!cgw.this.cS.b($$1)) {
                  cgw.this.cQ = $$1;
                  return;
               }
            }

            cgw.this.cS.k();
            cgw.this.cQ = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = cgw.this.dy();
         cgi $$1 = ((arq)cgw.this.dY()).y();
         Stream<cgj> $$2 = $$1.c($$0x -> $$0x.a(axo.c), $$0, 20, cgi.b.c);
         return $$2.map(cgj::g).filter(cgw.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbe {
      j(final bvg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgw.this.ae_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgw.this.cR.l();
      }
   }

   class k extends cgw.a {
      private static final int c = 400;
      private final Predicate<dvo> d = $$0 -> {
         if ($$0.b(dwe.C) && $$0.c(dwe.C)) {
            return false;
         } else if ($$0.a(axd.V)) {
            return $$0.a(dil.iD) ? $$0.c(dkr.b) == dwj.a : true;
         } else {
            return false;
         }
      };
      private static final double e = 0.1;
      private static final int f = 25;
      private static final float g = 0.35F;
      private static final float h = 0.6F;
      private static final float i = 0.33333334F;
      private static final int j = 5;
      private int k;
      private int l;
      private boolean m;
      @Nullable
      private ezr n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean h() {
         if (cgw.this.cO > 0) {
            return false;
         } else if (cgw.this.gH()) {
            return false;
         } else if (cgw.this.dY().ae()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               cgw.this.cP = $$0.get();
               cgw.this.bR.a((double)cgw.this.cP.u() + 0.5, (double)cgw.this.cP.v() + 0.5, (double)cgw.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cgw.this.cO = azn.a(cgw.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cgw.this.t()) {
            return false;
         } else if (cgw.this.dY().ae()) {
            return false;
         } else {
            return this.k() ? cgw.this.af.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.k > 400;
      }

      boolean l() {
         return this.m;
      }

      void m() {
         this.m = false;
      }

      @Override
      public void d() {
         this.k = 0;
         this.o = 0;
         this.l = 0;
         this.m = true;
         cgw.this.gw();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgw.this.x(true);
         }

         this.m = false;
         cgw.this.bR.o();
         cgw.this.cO = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgw.this.t()) {
            this.o++;
            if (this.o > 600) {
               cgw.this.gO();
               this.m = false;
               cgw.this.cO = 200;
            } else {
               ezr $$0 = ezr.c(cgw.this.cP).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgw.this.dw()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cgw.this.dw().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cgw.this.gO();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgw.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new ezr($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgw.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cgw.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cgw.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cgw.this.a(awo.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgw.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cgw.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(cgw.this.dy(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgw.this.dY().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cgw.this.dY().a_($$2))) {
               esc $$4 = cgw.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgw.this.dY().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends ccc {
      l() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         return cgw.this.bR.m() && cgw.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgw.this.bR.n();
      }

      @Override
      public void d() {
         ezr $$0 = this.h();
         if ($$0 != null) {
            cgw.this.bR.a(cgw.this.bR.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ezr h() {
         ezr $$1;
         if (cgw.this.gV() && !cgw.this.b(cgw.this.cQ, this.i())) {
            ezr $$0 = ezr.b(cgw.this.cQ);
            $$1 = $$0.d(cgw.this.dw()).d();
         } else {
            $$1 = cgw.this.g(0.0F);
         }

         int $$3 = 8;
         ezr $$4 = cgb.a(cgw.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfx.a(cgw.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgw.this.gx() && !cgw.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgw.a {
      private final int c = azn.a(cgw.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgw.this.cP != null && cgw.this.dY().p(cgw.this.cP) && !this.a(cgw.this.cP)) {
            cgw.this.gO();
         }

         this.d = cgw.this.dY().aa();
      }

      @Override
      public boolean h() {
         return cgw.this.dY().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return cgw.this.dY().a_($$0).a(axd.V);
      }
   }

   class n extends cgw.a {
      private final int c = azn.a(cgw.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgw.this.cQ != null && cgw.this.dY().p(cgw.this.cQ) && !cgw.this.gV()) {
            cgw.this.gN();
         }

         this.d = cgw.this.dY().aa();
      }

      @Override
      public boolean h() {
         return cgw.this.dY().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
