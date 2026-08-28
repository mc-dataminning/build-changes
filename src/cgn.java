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

public class cgn extends cgm implements bva, cgv {
   public static final float bY = 120.32113F;
   public static final int bZ = azj.f(1.4959966F);
   private static final akk<Byte> ci = ako.a(cgn.class, akm.a);
   private static final akk<Integer> cj = ako.a(cgn.class, akm.b);
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
   private static final brj cB = bak.a(20, 39);
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
   int cO = azj.a(this.af, 20, 60);
   @Nullable
   jg cP;
   @Nullable
   jg cQ;
   cgn.k cR;
   cgn.e cS;
   private cgn.f cT;
   private int cU;

   public cgn(bug<? extends cgn> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cat(this, 20, true);
      this.bO = new cgn.j(this);
      this.a(erv.n, -1.0F);
      this.a(erv.j, -1.0F);
      this.a(erv.k, 16.0F);
      this.a(erv.x, -1.0F);
      this.a(erv.h, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cgn.b(this, 1.4F, true));
      this.bS.a(1, new cgn.d());
      this.bS.a(2, new cbf(this, 1.0));
      this.bS.a(3, new cdb(this, 1.25, $$0 -> $$0.a(axi.ak), false));
      this.bS.a(3, new cgn.n());
      this.bS.a(3, new cgn.m());
      this.cR = new cgn.k();
      this.bS.a(4, this.cR);
      this.bS.a(5, new cbs(this, 1.25));
      this.bS.a(5, new cgn.i());
      this.cS = new cgn.e();
      this.bS.a(5, this.cS);
      this.cT = new cgn.f();
      this.bS.a(6, this.cT);
      this.bS.a(7, new cgn.g());
      this.bS.a(8, new cgn.l());
      this.bS.a(9, new cbn(this));
      this.bT.a(1, new cgn.h(this).a(new Class[0]));
      this.bT.a(2, new cgn.c(this));
      this.bT.a(3, new cds<>(this, true));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("hive_pos", uy.a(this.gy()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uy.a(this.q()));
      }

      $$0.a("HasNectar", this.gH());
      $$0.a("HasStung", this.gI());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.a_($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.cQ = uy.a($$0, "hive_pos").orElse(null);
      this.cP = uy.a($$0, "flower_pos").orElse(null);
      this.a(this.dX(), $$0);
   }

   @Override
   public boolean E(btz $$0) {
      bsp $$1 = this.dY().a((buv)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bwd.c)));
      if ($$2) {
         if (this.dX() instanceof arm $$3) {
            dbo.a($$3, $$0, $$1);
         }

         if ($$0 instanceof buv $$4) {
            $$4.q($$4.eY() + 1);
            int $$5 = 0;
            if (this.dX().am() == brv.c) {
               $$5 = 10;
            } else if (this.dX().am() == brv.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bte(btg.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.aa_();
         this.a(awk.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gH() && this.gS() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dX(), this.dC() - 0.3F, this.dC() + 0.3F, this.dI() - 0.3F, this.dI() + 0.3F, this.e(0.5), lq.ay);
         }
      }

      this.gQ();
   }

   private void a(dev $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lo $$6) {
      $$0.a($$6, azj.d($$0.A.j(), $$1, $$2), $$5, azj.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jg $$0) {
      ezh $$1 = ezh.c($$0);
      int $$2 = 0;
      jg $$3 = this.dx();
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

      ezh $$8 = cfp.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jg q() {
      return this.cP;
   }

   public boolean t() {
      return this.cP != null;
   }

   public void h(jg $$0) {
      this.cP = $$0;
   }

   @bap
   public int y() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @bap
   public List<jg> gv() {
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
      this.cO = azj.a(this.af, 20, 60);
   }

   boolean gP() {
      if (this.cH <= 0 && !this.cR.l() && !this.gI() && this.m() == null) {
         boolean $$0 = this.gM() || c(this.dX()) || this.gH();
         return $$0 && !this.gR();
      } else {
         return false;
      }
   }

   public static boolean c(dev $$0) {
      return $$0.D_().g() && ($$0.T() || $$0.ae());
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float J(float $$0) {
      return azj.h($$0, this.cE, this.cD);
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
      if (this.bn()) {
         this.cU++;
      } else {
         this.cU = 0;
      }

      if (this.cU > 20) {
         this.a(this.dY().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.af.a(azj.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dY().p(), this.eG());
         }
      }

      if (!this.gH()) {
         this.cG++;
      }

      if (!this.dX().C) {
         this.a((arm)this.dX(), false);
      }
   }

   public void gw() {
      this.cG = 0;
   }

   private boolean gR() {
      if (this.cQ == null) {
         return false;
      } else {
         dsg $$0 = this.dX().c_(this.cQ);
         return $$0 instanceof dsd && ((dsd)$$0).b();
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

   private boolean k(jg $$0) {
      dsg $$1 = this.dX().c_($$0);
      return $$1 instanceof dsd ? !((dsd)$$1).d() : false;
   }

   @bap
   public boolean gx() {
      return this.cQ != null;
   }

   @Nullable
   @bap
   public jg gy() {
      return this.cQ;
   }

   @bap
   public cbu gz() {
      return this.bS;
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
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
      if (!this.dX().C) {
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
         dsg $$0 = this.dX().c_(this.cQ);
         return $$0 != null && $$0.q() == dsi.H;
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

   boolean l(jg $$0) {
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

   public static bwc.a gJ() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.l, 0.6F).a(bwd.v, 0.3F).a(bwd.c, 2.0);
   }

   @Override
   protected ceh b(dev $$0) {
      cef $$1 = new cef(this, $$0) {
         @Override
         public boolean a(jg $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgn.this.cR.l()) {
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
   public boolean l(cvx $$0) {
      return $$0.a(axi.ak);
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
   }

   @Override
   protected awj w() {
      return null;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.bP;
   }

   @Override
   protected awj o_() {
      return awk.bO;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Nullable
   public cgn b(arm $$0, btq $$1) {
      return bug.h.a($$0, buf.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   public boolean bb() {
      return this.gK() && this.ag % bZ == 0;
   }

   @Override
   public boolean gK() {
      return !this.aJ();
   }

   public void gL() {
      this.x(false);
      this.gT();
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dX().C) {
            this.cR.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axp<erd> $$0) {
      this.h(this.dA().b(0.0, 0.01, 0.0));
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.2F));
   }

   boolean b(jg $$0, int $$1) {
      return $$0.a(this.dx(), (double)$$1);
   }

   public void i(jg $$0) {
      this.cQ = $$0;
   }

   abstract class a extends cbt {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgn.this.ae_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgn.this.ae_();
      }
   }

   class b extends ccd {
      b(final bvd $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgn.this.ae_() && !cgn.this.gI();
      }

      @Override
      public boolean c() {
         return super.c() && cgn.this.ae_() && !cgn.this.gI();
      }
   }

   static class c extends cdm<coh> {
      c(cgn $$0) {
         super($$0, coh.class, 10, true, false, $$0::a_);
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
         cgn $$0 = (cgn)this.e;
         return $$0.ae_() && !$$0.gI();
      }
   }

   class d extends cgn.a {
      @Override
      public boolean h() {
         if (cgn.this.gx() && cgn.this.gP() && cgn.this.cQ.a(cgn.this.dv(), 2.0) && cgn.this.dX().c_(cgn.this.cQ) instanceof dsd $$1) {
            if (!$$1.d()) {
               return true;
            }

            cgn.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cgn.this.dX().c_(cgn.this.cQ) instanceof dsd $$1) {
            $$1.a(cgn.this);
         }
      }
   }

   @bap
   public class e extends cgn.a {
      public static final int b = 2400;
      int d = cgn.this.dX().A.a(10);
      private static final int e = 3;
      final List<jg> f = Lists.newArrayList();
      @Nullable
      private ers g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean h() {
         return cgn.this.cQ != null && !cgn.this.gh() && cgn.this.gP() && !this.d(cgn.this.cQ) && cgn.this.dX().a_(cgn.this.cQ).a(awz.aH);
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
         cgn.this.bR.o();
         cgn.this.bR.h();
      }

      @Override
      public void a() {
         if (cgn.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgn.this.bR.n()) {
               if (!cgn.this.b(cgn.this.cQ, 16)) {
                  if (cgn.this.l(cgn.this.cQ)) {
                     cgn.this.gN();
                  } else {
                     cgn.this.j(cgn.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cgn.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgn.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgn.this.gN();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgn.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(jg $$0) {
         int $$1 = cgn.this.b(cgn.this.cQ, 3) ? 1 : 2;
         cgn.this.bR.b(10.0F);
         cgn.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgn.this.bR.k() != null && cgn.this.bR.k().j();
      }

      boolean b(jg $$0) {
         return this.f.contains($$0);
      }

      private void c(jg $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cgn.this.cQ != null) {
            this.c(cgn.this.cQ);
         }

         cgn.this.gN();
      }

      private boolean d(jg $$0) {
         if (cgn.this.b($$0, 2)) {
            return true;
         } else {
            ers $$1 = cgn.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgn.a {
      private static final int c = 2400;
      int d = cgn.this.dX().A.a(10);

      f() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean h() {
         return cgn.this.cP != null && !cgn.this.gh() && this.k() && !cgn.this.b(cgn.this.cP, 2);
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
         cgn.this.bR.o();
         cgn.this.bR.h();
      }

      @Override
      public void a() {
         if (cgn.this.cP != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgn.this.gO();
            } else if (!cgn.this.bR.n()) {
               if (cgn.this.l(cgn.this.cP)) {
                  cgn.this.gO();
               } else {
                  cgn.this.j(cgn.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cgn.this.cG > 600;
      }
   }

   class g extends cgn.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgn.this.gS() >= 10) {
            return false;
         } else {
            return cgn.this.af.i() < 0.3F ? false : cgn.this.gH() && cgn.this.gV();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgn.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jg $$1 = cgn.this.dx().c($$0);
               dvd $$2 = cgn.this.dX().a_($$1);
               dhy $$3 = $$2.b();
               dvd $$4 = null;
               if ($$2.a(awz.aJ)) {
                  if ($$3 instanceof djt) {
                     djt $$5 = (djt)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dpu) {
                     int $$6 = $$2.c(dpu.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dpu.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dia.oi)) {
                     int $$7 = $$2.c(dqb.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dqb.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dia.sv) || $$2.a(dia.sw)) {
                     dib $$8 = (dib)$$2.b();
                     if ($$8.b(cgn.this.dX(), $$1, $$2)) {
                        $$8.a((arm)cgn.this.dX(), cgn.this.af, $$1, $$2);
                        $$4 = cgn.this.dX().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgn.this.dX().c(2011, $$1, 15);
                     cgn.this.dX().b($$1, $$4);
                     cgn.this.gU();
                  }
               }
            }
         }
      }
   }

   class h extends cdl {
      h(final cgn $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgn.this.ae_() && super.c();
      }

      @Override
      protected void a(bux $$0, buv $$1) {
         if ($$0 instanceof cgn && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgn.a {
      @Override
      public boolean h() {
         return cgn.this.cK == 0 && !cgn.this.gx() && cgn.this.gP();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgn.this.cK = 200;
         List<jg> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jg $$1 : $$0) {
               if (!cgn.this.cS.b($$1)) {
                  cgn.this.cQ = $$1;
                  return;
               }
            }

            cgn.this.cS.k();
            cgn.this.cQ = $$0.get(0);
         }
      }

      private List<jg> k() {
         jg $$0 = cgn.this.dx();
         cfz $$1 = ((arm)cgn.this.dX()).y();
         Stream<cga> $$2 = $$1.c($$0x -> $$0x.a(axk.c), $$0, 20, cfz.b.c);
         return $$2.map(cga::g).filter(cgn.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cav {
      j(final bux $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgn.this.ae_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgn.this.cR.l();
      }
   }

   class k extends cgn.a {
      private static final int c = 400;
      private final Predicate<dvd> d = $$0 -> {
         if ($$0.b(dvt.C) && $$0.c(dvt.C)) {
            return false;
         } else if ($$0.a(awz.V)) {
            return $$0.a(dia.iD) ? $$0.c(dkg.b) == dvz.a : true;
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
      private ezh n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean h() {
         if (cgn.this.cO > 0) {
            return false;
         } else if (cgn.this.gH()) {
            return false;
         } else if (cgn.this.dX().ae()) {
            return false;
         } else {
            Optional<jg> $$0 = this.p();
            if ($$0.isPresent()) {
               cgn.this.cP = $$0.get();
               cgn.this.bR.a((double)cgn.this.cP.u() + 0.5, (double)cgn.this.cP.v() + 0.5, (double)cgn.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cgn.this.cO = azj.a(cgn.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cgn.this.t()) {
            return false;
         } else if (cgn.this.dX().ae()) {
            return false;
         } else {
            return this.k() ? cgn.this.af.i() < 0.2F : true;
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
         cgn.this.gw();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgn.this.x(true);
         }

         this.m = false;
         cgn.this.bR.o();
         cgn.this.cO = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgn.this.t()) {
            this.o++;
            if (this.o > 600) {
               cgn.this.gO();
               this.m = false;
               cgn.this.cO = 200;
            } else {
               ezh $$0 = ezh.c(cgn.this.cP).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgn.this.dv()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cgn.this.dv().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cgn.this.gO();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgn.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new ezh($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgn.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cgn.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cgn.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cgn.this.a(awk.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgn.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cgn.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jg> p() {
         Iterable<jg> $$0 = jg.a(cgn.this.dx(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jg $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgn.this.dX().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cgn.this.dX().a_($$2))) {
               ers $$4 = cgn.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgn.this.dX().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cbt {
      l() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         return cgn.this.bR.m() && cgn.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgn.this.bR.n();
      }

      @Override
      public void d() {
         ezh $$0 = this.h();
         if ($$0 != null) {
            cgn.this.bR.a(cgn.this.bR.a(jg.a((jz)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ezh h() {
         ezh $$1;
         if (cgn.this.gV() && !cgn.this.b(cgn.this.cQ, this.i())) {
            ezh $$0 = ezh.b(cgn.this.cQ);
            $$1 = $$0.d(cgn.this.dv()).d();
         } else {
            $$1 = cgn.this.g(0.0F);
         }

         int $$3 = 8;
         ezh $$4 = cfs.a(cgn.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfo.a(cgn.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgn.this.gx() && !cgn.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgn.a {
      private final int c = azj.a(cgn.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgn.this.cP != null && cgn.this.dX().p(cgn.this.cP) && !this.a(cgn.this.cP)) {
            cgn.this.gO();
         }

         this.d = cgn.this.dX().aa();
      }

      @Override
      public boolean h() {
         return cgn.this.dX().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jg $$0) {
         return cgn.this.dX().a_($$0).a(awz.V);
      }
   }

   class n extends cgn.a {
      private final int c = azj.a(cgn.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgn.this.cQ != null && cgn.this.dX().p(cgn.this.cQ) && !cgn.this.gV()) {
            cgn.this.gN();
         }

         this.d = cgn.this.dX().aa();
      }

      @Override
      public boolean h() {
         return cgn.this.dX().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
