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

public class cgs extends cgr implements bvf, cha {
   public static final float bY = 120.32113F;
   public static final int bZ = azk.f(1.4959966F);
   private static final akl<Byte> ci = akp.a(cgs.class, akn.a);
   private static final akl<Integer> cj = akp.a(cgs.class, akn.b);
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
   private static final bro cB = bal.a(20, 39);
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
   int cO = azk.a(this.af, 20, 60);
   @Nullable
   jh cP;
   @Nullable
   jh cQ;
   cgs.k cR;
   cgs.e cS;
   private cgs.f cT;
   private int cU;

   public cgs(bul<? extends cgs> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 20, true);
      this.bO = new cgs.j(this);
      this.a(esb.n, -1.0F);
      this.a(esb.j, -1.0F);
      this.a(esb.k, 16.0F);
      this.a(esb.x, -1.0F);
      this.a(esb.h, -1.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cgs.b(this, 1.4F, true));
      this.bS.a(1, new cgs.d());
      this.bS.a(2, new cbk(this, 1.0));
      this.bS.a(3, new cdg(this, 1.25, $$0 -> $$0.a(axj.am), false));
      this.bS.a(3, new cgs.n());
      this.bS.a(3, new cgs.m());
      this.cR = new cgs.k();
      this.bS.a(4, this.cR);
      this.bS.a(5, new cbx(this, 1.25));
      this.bS.a(5, new cgs.i());
      this.cS = new cgs.e();
      this.bS.a(5, this.cS);
      this.cT = new cgs.f();
      this.bS.a(6, this.cT);
      this.bS.a(7, new cgs.g());
      this.bS.a(8, new cgs.l());
      this.bS.a(9, new cbs(this));
      this.bT.a(1, new cgs.h(this).a(new Class[0]));
      this.bT.a(2, new cgs.c(this));
      this.bT.a(3, new cdx<>(this, true));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("hive_pos", uz.a(this.gx()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uz.a(this.q()));
      }

      $$0.a("HasNectar", this.gG());
      $$0.a("HasStung", this.gH());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.a_($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.cQ = uz.a($$0, "hive_pos").orElse(null);
      this.cP = uz.a($$0, "flower_pos").orElse(null);
      this.a(this.dX(), $$0);
   }

   @Override
   public boolean E(bue $$0) {
      bsu $$1 = this.dY().a((bva)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bwi.c)));
      if ($$2) {
         if (this.dX() instanceof arn $$3) {
            dbu.a($$3, $$0, $$1);
         }

         if ($$0 instanceof bva $$4) {
            $$4.q($$4.eY() + 1);
            int $$5 = 0;
            if (this.dX().ak() == bsa.c) {
               $$5 = 10;
            } else if (this.dX().ak() == bsa.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new btj(btl.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.aa_();
         this.a(awl.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gG() && this.gR() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dX(), this.dC() - 0.3F, this.dC() + 0.3F, this.dI() - 0.3F, this.dI() + 0.3F, this.e(0.5), lr.ay);
         }
      }

      this.gP();
   }

   private void a(dfb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lp $$6) {
      $$0.a($$6, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      ezn $$1 = ezn.c($$0);
      int $$2 = 0;
      jh $$3 = this.dx();
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

      ezn $$8 = cfu.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @baq
   public int y() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @baq
   public List<jh> gu() {
      return this.cS.f;
   }

   private boolean gL() {
      return this.cG > 3600;
   }

   void gM() {
      this.cQ = null;
      this.cK = 200;
   }

   void gN() {
      this.cP = null;
      this.cO = azk.a(this.af, 20, 60);
   }

   boolean gO() {
      if (this.cH <= 0 && !this.cR.l() && !this.gH() && this.m() == null) {
         boolean $$0 = this.gL() || c(this.dX()) || this.gG();
         return $$0 && !this.gQ();
      } else {
         return false;
      }
   }

   public static boolean c(dfb $$0) {
      return $$0.D_().g() && ($$0.T() || $$0.ae());
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float J(float $$0) {
      return azk.h($$0, this.cE, this.cD);
   }

   private void gP() {
      this.cE = this.cD;
      if (this.gV()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void ac() {
      boolean $$0 = this.gH();
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
         if (this.cF % 5 == 0 && this.af.a(azk.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dY().p(), this.eG());
         }
      }

      if (!this.gG()) {
         this.cG++;
      }

      if (!this.dX().C) {
         this.a((arn)this.dX(), false);
      }
   }

   public void gv() {
      this.cG = 0;
   }

   private boolean gQ() {
      if (this.cQ == null) {
         return false;
      } else {
         dsm $$0 = this.dX().c_(this.cQ);
         return $$0 instanceof dsj && ((dsj)$$0).b();
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
      dsm $$1 = this.dX().c_($$0);
      return $$1 instanceof dsj ? !((dsj)$$1).d() : false;
   }

   @baq
   public boolean gw() {
      return this.cQ != null;
   }

   @Nullable
   @baq
   public jh gx() {
      return this.cQ;
   }

   @baq
   public cbz gy() {
      return this.bS;
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   int gR() {
      return this.cI;
   }

   private void gS() {
      this.cI = 0;
   }

   void gT() {
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

         boolean $$0 = this.ae_() && !this.gH() && this.m() != null && this.m().g(this) < 4.0;
         this.z($$0);
         if (this.ag % 20 == 0 && !this.gU()) {
            this.cQ = null;
         }
      }
   }

   boolean gU() {
      if (!this.gw()) {
         return false;
      } else if (this.l(this.cQ)) {
         return false;
      } else {
         dsm $$0 = this.dX().c_(this.cQ);
         return $$0 != null && $$0.q() == dso.H;
      }
   }

   public boolean gG() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gv();
      }

      this.d(8, $$0);
   }

   public boolean gH() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gV() {
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

   public static bwh.a gI() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.l, 0.6F).a(bwi.v, 0.3F).a(bwi.c, 2.0);
   }

   @Override
   protected cem b(dfb $$0) {
      cek $$1 = new cek(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgs.this.cR.l()) {
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
   public boolean l(cwb $$0) {
      return $$0.a(axj.am);
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
   }

   @Override
   protected awk w() {
      return null;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.bP;
   }

   @Override
   protected awk o_() {
      return awl.bO;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Nullable
   public cgs b(arn $$0, btv $$1) {
      return bul.h.a($$0, buk.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
   }

   @Override
   public boolean bb() {
      return this.gJ() && this.ag % bZ == 0;
   }

   @Override
   public boolean gJ() {
      return !this.aK();
   }

   public void gK() {
      this.x(false);
      this.gS();
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
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
   protected void c(axq<erj> $$0) {
      this.h(this.dA().b(0.0, 0.01, 0.0));
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dx(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cQ = $$0;
   }

   abstract class a extends cby {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgs.this.ae_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgs.this.ae_();
      }
   }

   class b extends cci {
      b(final bvi $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgs.this.ae_() && !cgs.this.gH();
      }

      @Override
      public boolean c() {
         return super.c() && cgs.this.ae_() && !cgs.this.gH();
      }
   }

   static class c extends cdr<com> {
      c(cgs $$0) {
         super($$0, com.class, 10, true, false, $$0::a_);
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
         cgs $$0 = (cgs)this.e;
         return $$0.ae_() && !$$0.gH();
      }
   }

   class d extends cgs.a {
      @Override
      public boolean h() {
         if (cgs.this.gw() && cgs.this.gO() && cgs.this.cQ.a(cgs.this.dv(), 2.0) && cgs.this.dX().c_(cgs.this.cQ) instanceof dsj $$1) {
            if (!$$1.d()) {
               return true;
            }

            cgs.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cgs.this.dX().c_(cgs.this.cQ) instanceof dsj $$1) {
            $$1.a(cgs.this);
         }
      }
   }

   @baq
   public class e extends cgs.a {
      public static final int b = 2400;
      int d = cgs.this.dX().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private ery g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean h() {
         return cgs.this.cQ != null && !cgs.this.gg() && cgs.this.gO() && !this.d(cgs.this.cQ) && cgs.this.dX().a_(cgs.this.cQ).a(axa.aH);
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
         cgs.this.bR.o();
         cgs.this.bR.h();
      }

      @Override
      public void a() {
         if (cgs.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgs.this.bR.n()) {
               if (!cgs.this.b(cgs.this.cQ, 16)) {
                  if (cgs.this.l(cgs.this.cQ)) {
                     cgs.this.gM();
                  } else {
                     cgs.this.j(cgs.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cgs.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgs.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgs.this.gM();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgs.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = cgs.this.b(cgs.this.cQ, 3) ? 1 : 2;
         cgs.this.bR.b(10.0F);
         cgs.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgs.this.bR.k() != null && cgs.this.bR.k().j();
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
         if (cgs.this.cQ != null) {
            this.c(cgs.this.cQ);
         }

         cgs.this.gM();
      }

      private boolean d(jh $$0) {
         if (cgs.this.b($$0, 2)) {
            return true;
         } else {
            ery $$1 = cgs.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgs.a {
      private static final int c = 2400;
      int d = cgs.this.dX().A.a(10);

      f() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean h() {
         return cgs.this.cP != null && !cgs.this.gg() && this.k() && !cgs.this.b(cgs.this.cP, 2);
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
         cgs.this.bR.o();
         cgs.this.bR.h();
      }

      @Override
      public void a() {
         if (cgs.this.cP != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgs.this.gN();
            } else if (!cgs.this.bR.n()) {
               if (cgs.this.l(cgs.this.cP)) {
                  cgs.this.gN();
               } else {
                  cgs.this.j(cgs.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cgs.this.cG > 600;
      }
   }

   class g extends cgs.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgs.this.gR() >= 10) {
            return false;
         } else {
            return cgs.this.af.i() < 0.3F ? false : cgs.this.gG() && cgs.this.gU();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgs.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = cgs.this.dx().c($$0);
               dvj $$2 = cgs.this.dX().a_($$1);
               die $$3 = $$2.b();
               dvj $$4 = null;
               if ($$2.a(axa.aJ)) {
                  if ($$3 instanceof djz) {
                     djz $$5 = (djz)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dqa) {
                     int $$6 = $$2.c(dqa.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dqa.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dig.oi)) {
                     int $$7 = $$2.c(dqh.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dqh.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dig.sv) || $$2.a(dig.sw)) {
                     dih $$8 = (dih)$$2.b();
                     if ($$8.b(cgs.this.dX(), $$1, $$2)) {
                        $$8.a((arn)cgs.this.dX(), cgs.this.af, $$1, $$2);
                        $$4 = cgs.this.dX().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgs.this.dX().c(2011, $$1, 15);
                     cgs.this.dX().b($$1, $$4);
                     cgs.this.gT();
                  }
               }
            }
         }
      }
   }

   class h extends cdq {
      h(final cgs $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgs.this.ae_() && super.c();
      }

      @Override
      protected void a(bvc $$0, bva $$1) {
         if ($$0 instanceof cgs && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgs.a {
      @Override
      public boolean h() {
         return cgs.this.cK == 0 && !cgs.this.gw() && cgs.this.gO();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgs.this.cK = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!cgs.this.cS.b($$1)) {
                  cgs.this.cQ = $$1;
                  return;
               }
            }

            cgs.this.cS.k();
            cgs.this.cQ = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = cgs.this.dx();
         cge $$1 = ((arn)cgs.this.dX()).y();
         Stream<cgf> $$2 = $$1.c($$0x -> $$0x.a(axl.c), $$0, 20, cge.b.c);
         return $$2.map(cgf::g).filter(cgs.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cba {
      j(final bvc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgs.this.ae_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgs.this.cR.l();
      }
   }

   class k extends cgs.a {
      private static final int c = 400;
      private final Predicate<dvj> d = $$0 -> {
         if ($$0.b(dvz.C) && $$0.c(dvz.C)) {
            return false;
         } else if ($$0.a(axa.V)) {
            return $$0.a(dig.iD) ? $$0.c(dkm.b) == dwf.a : true;
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
      private ezn n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean h() {
         if (cgs.this.cO > 0) {
            return false;
         } else if (cgs.this.gG()) {
            return false;
         } else if (cgs.this.dX().ae()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               cgs.this.cP = $$0.get();
               cgs.this.bR.a((double)cgs.this.cP.u() + 0.5, (double)cgs.this.cP.v() + 0.5, (double)cgs.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cgs.this.cO = azk.a(cgs.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cgs.this.t()) {
            return false;
         } else if (cgs.this.dX().ae()) {
            return false;
         } else {
            return this.k() ? cgs.this.af.i() < 0.2F : true;
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
         cgs.this.gv();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgs.this.x(true);
         }

         this.m = false;
         cgs.this.bR.o();
         cgs.this.cO = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cgs.this.t()) {
            this.o++;
            if (this.o > 600) {
               cgs.this.gN();
               this.m = false;
               cgs.this.cO = 200;
            } else {
               ezn $$0 = ezn.c(cgs.this.cP).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgs.this.dv()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cgs.this.dv().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cgs.this.gN();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgs.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new ezn($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgs.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cgs.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cgs.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cgs.this.a(awl.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgs.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cgs.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(cgs.this.dx(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgs.this.dX().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cgs.this.dX().a_($$2))) {
               ery $$4 = cgs.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgs.this.dX().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cby {
      l() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         return cgs.this.bR.m() && cgs.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgs.this.bR.n();
      }

      @Override
      public void d() {
         ezn $$0 = this.h();
         if ($$0 != null) {
            cgs.this.bR.a(cgs.this.bR.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ezn h() {
         ezn $$1;
         if (cgs.this.gU() && !cgs.this.b(cgs.this.cQ, this.i())) {
            ezn $$0 = ezn.b(cgs.this.cQ);
            $$1 = $$0.d(cgs.this.dv()).d();
         } else {
            $$1 = cgs.this.g(0.0F);
         }

         int $$3 = 8;
         ezn $$4 = cfx.a(cgs.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cft.a(cgs.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgs.this.gw() && !cgs.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgs.a {
      private final int c = azk.a(cgs.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgs.this.cP != null && cgs.this.dX().p(cgs.this.cP) && !this.a(cgs.this.cP)) {
            cgs.this.gN();
         }

         this.d = cgs.this.dX().aa();
      }

      @Override
      public boolean h() {
         return cgs.this.dX().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return cgs.this.dX().a_($$0).a(axa.V);
      }
   }

   class n extends cgs.a {
      private final int c = azk.a(cgs.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgs.this.cQ != null && cgs.this.dX().p(cgs.this.cQ) && !cgs.this.gU()) {
            cgs.this.gM();
         }

         this.d = cgs.this.dX().aa();
      }

      @Override
      public boolean h() {
         return cgs.this.dX().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
