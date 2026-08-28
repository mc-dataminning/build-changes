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

public class cit extends cis implements bxh, cje {
   public static final float bF = 120.32113F;
   public static final int bG = azm.f(1.4959966F);
   private static final akj<Byte> bP = akn.a(cit.class, akl.a);
   private static final akj<Integer> bQ = akn.a(cit.class, akl.b);
   private static final int bR = 2;
   private static final int bS = 4;
   private static final int bT = 8;
   private static final int bU = 1200;
   private static final int bV = 600;
   private static final int bW = 3600;
   private static final int bX = 4;
   private static final int bY = 10;
   private static final int bZ = 10;
   private static final int ca = 18;
   private static final int cb = 48;
   private static final int cc = 2;
   private static final int cd = 24;
   private static final int ce = 16;
   private static final int cf = 16;
   private static final int cg = 20;
   public static final String bH = "CropsGrownSincePollination";
   public static final String bJ = "CannotEnterHiveTicks";
   public static final String bK = "TicksSincePollination";
   public static final String bL = "HasStung";
   public static final String bM = "HasNectar";
   public static final String bN = "flower_pos";
   public static final String bO = "hive_pos";
   private static final btm ch = baq.a(20, 39);
   @Nullable
   private UUID ci;
   private float cj;
   private float ck;
   private int cl;
   int cm;
   private int cp;
   private int cq;
   private static final int cr = 200;
   int cs;
   private static final int ct = 200;
   private static final int cu = 20;
   private static final int cv = 60;
   int cw = azm.a(this.ae, 20, 60);
   @Nullable
   iu cx;
   @Nullable
   iu cy;
   cit.k cz;
   cit.e cA;
   private cit.f cB;
   private int cC;

   public cit(bwm<? extends cit> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new ccy(this, 20, true);
      this.by = new cit.j(this);
      this.a(ewx.n, -1.0F);
      this.a(ewx.j, -1.0F);
      this.a(ewx.k, 16.0F);
      this.a(ewx.x, -1.0F);
      this.a(ewx.h, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, (byte)0);
      $$0.a(bQ, 0);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bC.a(0, new cit.b(this, 1.4F, true));
      this.bC.a(1, new cit.d());
      this.bC.a(2, new cdk(this, 1.0));
      this.bC.a(3, new cfg(this, 1.25, $$0 -> $$0.a(axk.am), false));
      this.bC.a(3, new cit.n());
      this.bC.a(3, new cit.m());
      this.cz = new cit.k();
      this.bC.a(4, this.cz);
      this.bC.a(5, new cdx(this, 1.25));
      this.bC.a(5, new cit.i());
      this.cA = new cit.e();
      this.bC.a(5, this.cA);
      this.cB = new cit.f();
      this.bC.a(6, this.cB);
      this.bC.a(7, new cit.g());
      this.bC.a(8, new cit.l());
      this.bC.a(9, new cds(this));
      this.bD.a(1, new cit.h(this).a(new Class[0]));
      this.bD.a(2, new cit.c(this));
      this.bD.a(3, new cfx<>(this, true));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("hive_pos", uo.a(this.gt()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uo.a(this.q()));
      }

      $$0.a("HasNectar", this.gC());
      $$0.a("HasStung", this.gD());
      $$0.a("TicksSincePollination", this.cm);
      $$0.a("CannotEnterHiveTicks", this.cp);
      $$0.a("CropsGrownSincePollination", this.cq);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cm = $$0.h("TicksSincePollination");
      this.cp = $$0.h("CannotEnterHiveTicks");
      this.cq = $$0.h("CropsGrownSincePollination");
      this.cy = uo.a($$0, "hive_pos").orElse(null);
      this.cx = uo.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      bus $$2 = this.dW().a((bxc)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(byi.c)));
      if ($$3) {
         dfn.a($$0, $$1, $$2);
         if ($$1 instanceof bxc $$4) {
            $$4.p($$4.eW() + 1);
            int $$5 = 0;
            if (this.dV().an() == bty.c) {
               $$5 = 10;
            } else if (this.dV().an() == bty.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bvh(bvj.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(awn.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gC() && this.gN() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), lx.aB);
         }
      }

      this.gL();
   }

   private void a(div $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lv $$6) {
      $$0.a($$6, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(iu $$0) {
      fei $$1 = fei.c($$0);
      int $$2 = 0;
      iu $$3 = this.dv();
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

      fei $$8 = chu.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bB.b(0.5F);
         this.bB.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public iu q() {
      return this.cx;
   }

   public boolean t() {
      return this.cx != null;
   }

   public void h(iu $$0) {
      this.cx = $$0;
   }

   @bav
   public int x() {
      return Math.max(this.cA.d, this.cB.d);
   }

   @bav
   public List<iu> gq() {
      return this.cA.f;
   }

   private boolean gH() {
      return this.cm > 3600;
   }

   void gI() {
      this.cy = null;
      this.cs = 200;
   }

   void gJ() {
      this.cx = null;
      this.cw = azm.a(this.ae, 20, 60);
   }

   boolean gK() {
      if (this.cp <= 0 && !this.cz.l() && !this.gD() && this.f() == null) {
         boolean $$0 = this.gH() || c(this.dV()) || this.gC();
         return $$0 && !this.gM();
      } else {
         return false;
      }
   }

   public static boolean c(div $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cp = $$0;
   }

   public float J(float $$0) {
      return azm.h($$0, this.ck, this.cj);
   }

   private void gL() {
      this.ck = this.cj;
      if (this.gS()) {
         this.cj = Math.min(1.0F, this.cj + 0.2F);
      } else {
         this.cj = Math.max(0.0F, this.cj - 0.24F);
      }
   }

   @Override
   protected void a(arq $$0) {
      boolean $$1 = this.gD();
      if (this.bj()) {
         this.cC++;
      } else {
         this.cC = 0;
      }

      if (this.cC > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cl++;
         if (this.cl % 5 == 0 && this.ae.a(azm.a(1200 - this.cl, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eF());
         }
      }

      if (!this.gC()) {
         this.cm++;
      }

      this.a($$0, false);
   }

   public void gr() {
      this.cm = 0;
   }

   private boolean gM() {
      dwu $$0 = this.gQ();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.al.a(bQ);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bQ, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   public void c() {
      this.a(ch.a(this.ae));
   }

   private boolean k(iu $$0) {
      dwx $$1 = this.dV().c_($$0);
      return $$1 instanceof dwu ? !((dwu)$$1).d() : false;
   }

   @bav
   public boolean gs() {
      return this.cy != null;
   }

   @Nullable
   @bav
   public iu gt() {
      return this.cy;
   }

   @bav
   public cdz gu() {
      return this.bC;
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   int gN() {
      return this.cq;
   }

   private void gO() {
      this.cq = 0;
   }

   void gP() {
      this.cq++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         if (this.cp > 0) {
            this.cp--;
         }

         if (this.cs > 0) {
            this.cs--;
         }

         if (this.cw > 0) {
            this.cw--;
         }

         boolean $$0 = this.W_() && !this.gD() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gR()) {
            this.cy = null;
         }
      }
   }

   @Nullable
   dwu gQ() {
      if (this.cy == null) {
         return null;
      } else {
         return this.l(this.cy) ? null : this.dV().a(this.cy, dwz.I).orElse(null);
      }
   }

   boolean gR() {
      return this.gQ() != null;
   }

   public boolean gC() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gr();
      }

      this.d(8, $$0);
   }

   public boolean gD() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gS() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(iu $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bP, (byte)(this.al.a(bP) | $$0));
      } else {
         this.al.a(bP, (byte)(this.al.a(bP) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bP) & $$0) != 0;
   }

   public static byh.a gE() {
      return cis.gv().a(byi.s, 10.0).a(byi.l, 0.6F).a(byi.v, 0.3F).a(byi.c, 2.0);
   }

   @Override
   protected cgm b(div $$0) {
      cgk $$1 = new cgk(this, $$0) {
         @Override
         public boolean a(iu $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cit.this.cz.l()) {
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
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (this.j($$2) && $$2.h() instanceof cxg $$3 && $$3.c() instanceof dpf $$4) {
         bvh $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bub.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.am);
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
   }

   @Override
   protected awm u() {
      return null;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.bP;
   }

   @Override
   protected awm l_() {
      return awn.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cit b(arq $$0, bvt $$1) {
      return bwm.l.a($$0, bwl.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
   }

   @Override
   public boolean ba() {
      return this.gF() && this.af % bG == 0;
   }

   @Override
   public boolean gF() {
      return !this.aJ();
   }

   public void gG() {
      this.w(false);
      this.gO();
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cz.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axr<ewf> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iu $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iu $$0) {
      this.cy = $$0;
   }

   public static boolean c(dzz $$0) {
      if ($$0.a(axc.W)) {
         if ($$0.a(eap.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dmc.jc) ? $$0.c(doj.b) == eav.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cdy {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cit.this.W_();
      }

      @Override
      public boolean c() {
         return this.i() && !cit.this.W_();
      }
   }

   class b extends cei {
      b(final bxk $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cit.this.W_() && !cit.this.gD();
      }

      @Override
      public boolean c() {
         return super.c() && cit.this.W_() && !cit.this.gD();
      }
   }

   static class c extends cfr<cqy> {
      c(cit $$0) {
         super($$0, cqy.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.f() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cit $$0 = (cit)this.e;
         return $$0.W_() && !$$0.gD();
      }
   }

   class d extends cit.a {
      @Override
      public boolean h() {
         if (cit.this.cy != null && cit.this.gK() && cit.this.cy.a(cit.this.dt(), 2.0)) {
            dwu $$0 = cit.this.gQ();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cit.this.cy = null;
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
         dwu $$0 = cit.this.gQ();
         if ($$0 != null) {
            $$0.a(cit.this);
         }
      }
   }

   @bav
   public class e extends cit.a {
      public static final int b = 2400;
      int d = cit.this.dV().A.a(10);
      private static final int e = 3;
      final List<iu> f = Lists.newArrayList();
      @Nullable
      private ewu g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean h() {
         return cit.this.cy != null
            && !cit.this.l(cit.this.cy)
            && !cit.this.ge()
            && cit.this.gK()
            && !this.d(cit.this.cy)
            && cit.this.dV().a_(cit.this.cy).a(axc.aJ);
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
         cit.this.bB.m();
         cit.this.bB.f();
      }

      @Override
      public void a() {
         if (cit.this.cy != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cit.this.bB.l()) {
               if (!cit.this.b(cit.this.cy, 16)) {
                  if (cit.this.l(cit.this.cy)) {
                     cit.this.gI();
                  } else {
                     cit.this.j(cit.this.cy);
                  }
               } else {
                  boolean $$0 = this.a(cit.this.cy);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cit.this.bB.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cit.this.gI();
                        this.i = 0;
                     }
                  } else {
                     this.g = cit.this.bB.i();
                  }
               }
            }
         }
      }

      private boolean a(iu $$0) {
         int $$1 = cit.this.b($$0, 3) ? 1 : 2;
         cit.this.bB.b(10.0F);
         cit.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cit.this.bB.i() != null && cit.this.bB.i().j();
      }

      boolean b(iu $$0) {
         return this.f.contains($$0);
      }

      private void c(iu $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cit.this.cy != null) {
            this.c(cit.this.cy);
         }

         cit.this.gI();
      }

      private boolean d(iu $$0) {
         if (cit.this.b($$0, 2)) {
            return true;
         } else {
            ewu $$1 = cit.this.bB.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cit.a {
      private static final int c = 2400;
      int d = cit.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean h() {
         return cit.this.cx != null && !cit.this.ge() && this.k() && !cit.this.b(cit.this.cx, 2);
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
         cit.this.bB.m();
         cit.this.bB.f();
      }

      @Override
      public void a() {
         if (cit.this.cx != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cit.this.gJ();
            } else if (!cit.this.bB.l()) {
               if (cit.this.l(cit.this.cx)) {
                  cit.this.gJ();
               } else {
                  cit.this.j(cit.this.cx);
               }
            }
         }
      }

      private boolean k() {
         return cit.this.cm > 600;
      }
   }

   class g extends cit.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cit.this.gN() >= 10) {
            return false;
         } else {
            return cit.this.ae.i() < 0.3F ? false : cit.this.gC() && cit.this.gR();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cit.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iu $$1 = cit.this.dv().c($$0);
               dzz $$2 = cit.this.dV().a_($$1);
               dma $$3 = $$2.b();
               dzz $$4 = null;
               if ($$2.a(axc.aL)) {
                  if ($$3 instanceof dnw) {
                     dnw $$5 = (dnw)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof due) {
                     int $$6 = $$2.c(due.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(due.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dmc.oL)) {
                     int $$7 = $$2.c(dul.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dul.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dmc.ta) || $$2.a(dmc.tb)) {
                     dmd $$8 = (dmd)$$2.b();
                     if ($$8.a(cit.this.dV(), $$1, $$2)) {
                        $$8.a((arq)cit.this.dV(), cit.this.ae, $$1, $$2);
                        $$4 = cit.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cit.this.dV().c(2011, $$1, 15);
                     cit.this.dV().b($$1, $$4);
                     cit.this.gP();
                  }
               }
            }
         }
      }
   }

   class h extends cfq {
      h(final cit $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cit.this.W_() && super.c();
      }

      @Override
      protected void a(bxe $$0, bxc $$1) {
         if ($$0 instanceof cit && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cit.a {
      @Override
      public boolean h() {
         return cit.this.cs == 0 && !cit.this.gs() && cit.this.gK();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cit.this.cs = 200;
         List<iu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iu $$1 : $$0) {
               if (!cit.this.cA.b($$1)) {
                  cit.this.cy = $$1;
                  return;
               }
            }

            cit.this.cA.k();
            cit.this.cy = $$0.get(0);
         }
      }

      private List<iu> k() {
         iu $$0 = cit.this.dv();
         cie $$1 = ((arq)cit.this.dV()).A();
         Stream<cif> $$2 = $$1.c($$0x -> $$0x.a(axm.c), $$0, 20, cie.b.c);
         return $$2.map(cif::g).filter(cit.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cda {
      j(final bxe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cit.this.W_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cit.this.cz.l();
      }
   }

   class k extends cit.a {
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
      private fei m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean h() {
         if (cit.this.cw > 0) {
            return false;
         } else if (cit.this.gC()) {
            return false;
         } else if (cit.this.dV().ah()) {
            return false;
         } else {
            Optional<iu> $$0 = this.p();
            if ($$0.isPresent()) {
               cit.this.cx = $$0.get();
               cit.this.bB.a((double)cit.this.cx.u() + 0.5, (double)cit.this.cx.v() + 0.5, (double)cit.this.cx.w() + 0.5, 1.2F);
               return true;
            } else {
               cit.this.cw = azm.a(cit.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cit.this.t()) {
            return false;
         } else if (cit.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cit.this.ae.i() < 0.2F : true;
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
         cit.this.gr();
      }

      @Override
      public void e() {
         if (this.k()) {
            cit.this.w(true);
         }

         this.l = false;
         cit.this.bB.m();
         cit.this.cw = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cit.this.t()) {
            this.n++;
            if (this.n > 600) {
               cit.this.gJ();
               this.l = false;
               cit.this.cw = 200;
            } else {
               fei $$0 = fei.c(cit.this.cx).b(0.0, 0.6F, 0.0);
               if ($$0.f(cit.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cit.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cit.this.gJ();
                  } else {
                     if ($$1) {
                        boolean $$3 = cit.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fei($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cit.this.bB.m();
                        } else {
                           $$2 = false;
                        }

                        cit.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cit.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cit.this.a(awn.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cit.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cit.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iu> p() {
         Iterable<iu> $$0 = iu.a(cit.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iu $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cit.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cit.c(cit.this.dV().a_($$2))) {
               ewu $$4 = cit.this.bB.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cit.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cdy {
      l() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         return cit.this.bB.k() && cit.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cit.this.bB.l();
      }

      @Override
      public void d() {
         fei $$0 = this.h();
         if ($$0 != null) {
            cit.this.bB.a(cit.this.bB.a(iu.a((jo)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fei h() {
         fei $$1;
         if (cit.this.gR() && !cit.this.b(cit.this.cy, this.i())) {
            fei $$0 = fei.b(cit.this.cy);
            $$1 = $$0.d(cit.this.dt()).d();
         } else {
            $$1 = cit.this.h(0.0F);
         }

         int $$3 = 8;
         fei $$4 = chx.a(cit.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cht.a(cit.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cit.this.gs() && !cit.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cit.a {
      private final int c = azm.a(cit.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cit.this.cx != null && cit.this.dV().p(cit.this.cx) && !this.a(cit.this.cx)) {
            cit.this.gJ();
         }

         this.d = cit.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cit.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iu $$0) {
         return cit.c(cit.this.dV().a_($$0));
      }
   }

   class n extends cit.a {
      private final int c = azm.a(cit.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cit.this.cy != null && cit.this.dV().p(cit.this.cy) && !cit.this.gR()) {
            cit.this.gI();
         }

         this.d = cit.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cit.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
