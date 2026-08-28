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

public class cip extends cio implements bxe, ciy {
   public static final float bF = 120.32113F;
   public static final int bG = azk.f(1.4959966F);
   private static final akh<Byte> bP = akl.a(cip.class, akj.a);
   private static final akh<Integer> bQ = akl.a(cip.class, akj.b);
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
   private static final btj ch = bao.a(20, 39);
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
   int cw = azk.a(this.ae, 20, 60);
   @Nullable
   iu cx;
   @Nullable
   iu cy;
   cip.k cz;
   cip.e cA;
   private cip.f cB;
   private int cC;

   public cip(bwj<? extends cip> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new ccv(this, 20, true);
      this.by = new cip.j(this);
      this.a(ewm.n, -1.0F);
      this.a(ewm.j, -1.0F);
      this.a(ewm.k, 16.0F);
      this.a(ewm.x, -1.0F);
      this.a(ewm.h, -1.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bP, (byte)0);
      $$0.a(bQ, 0);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bC.a(0, new cip.b(this, 1.4F, true));
      this.bC.a(1, new cip.d());
      this.bC.a(2, new cdh(this, 1.0));
      this.bC.a(3, new cfd(this, 1.25, $$0 -> $$0.a(axi.am), false));
      this.bC.a(3, new cip.n());
      this.bC.a(3, new cip.m());
      this.cz = new cip.k();
      this.bC.a(4, this.cz);
      this.bC.a(5, new cdu(this, 1.25));
      this.bC.a(5, new cip.i());
      this.cA = new cip.e();
      this.bC.a(5, this.cA);
      this.cB = new cip.f();
      this.bC.a(6, this.cB);
      this.bC.a(7, new cip.g());
      this.bC.a(8, new cip.l());
      this.bC.a(9, new cdp(this));
      this.bD.a(1, new cip.h(this).a(new Class[0]));
      this.bD.a(2, new cip.c(this));
      this.bD.a(3, new cfu<>(this, true));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("hive_pos", um.a(this.gt()));
      }

      if (this.t()) {
         $$0.a("flower_pos", um.a(this.q()));
      }

      $$0.a("HasNectar", this.gC());
      $$0.a("HasStung", this.gD());
      $$0.a("TicksSincePollination", this.cm);
      $$0.a("CannotEnterHiveTicks", this.cp);
      $$0.a("CropsGrownSincePollination", this.cq);
      this.a_($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cm = $$0.h("TicksSincePollination");
      this.cp = $$0.h("CannotEnterHiveTicks");
      this.cq = $$0.h("CropsGrownSincePollination");
      this.cy = um.a($$0, "hive_pos").orElse(null);
      this.cx = um.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      bup $$2 = this.dW().a((bwz)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(byf.c)));
      if ($$3) {
         dfh.a($$0, $$1, $$2);
         if ($$1 instanceof bwz $$4) {
            $$4.p($$4.eW() + 1);
            int $$5 = 0;
            if (this.dV().an() == btv.c) {
               $$5 = 10;
            } else if (this.dV().an() == btv.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bve(bvg.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(awl.bS, 1.0F, 1.0F);
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

   private void a(dip $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lv $$6) {
      $$0.a($$6, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(iu $$0) {
      fdw $$1 = fdw.c($$0);
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

      fdw $$8 = chr.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @bat
   public int x() {
      return Math.max(this.cA.d, this.cB.d);
   }

   @bat
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
      this.cw = azk.a(this.ae, 20, 60);
   }

   boolean gK() {
      if (this.cp <= 0 && !this.cz.l() && !this.gD() && this.f() == null) {
         boolean $$0 = this.gH() || c(this.dV()) || this.gC();
         return $$0 && !this.gM();
      } else {
         return false;
      }
   }

   public static boolean c(dip $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cp = $$0;
   }

   public float J(float $$0) {
      return azk.h($$0, this.ck, this.cj);
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
   protected void a(aro $$0) {
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
         if (this.cl % 5 == 0 && this.ae.a(azk.a(1200 - this.cl, 1, 1200)) == 0) {
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
      dwk $$0 = this.gQ();
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
      dwn $$1 = this.dV().c_($$0);
      return $$1 instanceof dwk ? !((dwk)$$1).d() : false;
   }

   @bat
   public boolean gs() {
      return this.cy != null;
   }

   @Nullable
   @bat
   public iu gt() {
      return this.cy;
   }

   @bat
   public cdw gu() {
      return this.bC;
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
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
   dwk gQ() {
      if (this.cy == null) {
         return null;
      } else {
         return this.l(this.cy) ? null : this.dV().a(this.cy, dwp.I).orElse(null);
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

   public static bye.a gE() {
      return cio.gv().a(byf.s, 10.0).a(byf.l, 0.6F).a(byf.v, 0.3F).a(byf.c, 2.0);
   }

   @Override
   protected cgj b(dip $$0) {
      cgh $$1 = new cgh(this, $$0) {
         @Override
         public boolean a(iu $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cip.this.cz.l()) {
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
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (this.k($$2) && $$2.h() instanceof cxa $$3 && $$3.c() instanceof doy $$4) {
         bve $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bty.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.am);
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
   }

   @Override
   protected awk u() {
      return null;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.bP;
   }

   @Override
   protected awk l_() {
      return awl.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cip b(aro $$0, bvq $$1) {
      return bwj.l.a($$0, bwi.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
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
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cz.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axp<evu> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iu $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iu $$0) {
      this.cy = $$0;
   }

   public static boolean c(dzo $$0) {
      if ($$0.a(axa.W)) {
         if ($$0.a(eae.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dlw.jb) ? $$0.c(dod.b) == eak.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cdv {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cip.this.W_();
      }

      @Override
      public boolean c() {
         return this.i() && !cip.this.W_();
      }
   }

   class b extends cef {
      b(final bxh $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cip.this.W_() && !cip.this.gD();
      }

      @Override
      public boolean c() {
         return super.c() && cip.this.W_() && !cip.this.gD();
      }
   }

   static class c extends cfo<cqs> {
      c(cip $$0) {
         super($$0, cqs.class, 10, true, false, $$0::a);
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
         cip $$0 = (cip)this.e;
         return $$0.W_() && !$$0.gD();
      }
   }

   class d extends cip.a {
      @Override
      public boolean h() {
         if (cip.this.cy != null && cip.this.gK() && cip.this.cy.a(cip.this.dt(), 2.0)) {
            dwk $$0 = cip.this.gQ();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cip.this.cy = null;
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
         dwk $$0 = cip.this.gQ();
         if ($$0 != null) {
            $$0.a(cip.this);
         }
      }
   }

   @bat
   public class e extends cip.a {
      public static final int b = 2400;
      int d = cip.this.dV().A.a(10);
      private static final int e = 3;
      final List<iu> f = Lists.newArrayList();
      @Nullable
      private ewj g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean h() {
         return cip.this.cy != null
            && !cip.this.l(cip.this.cy)
            && !cip.this.ge()
            && cip.this.gK()
            && !this.d(cip.this.cy)
            && cip.this.dV().a_(cip.this.cy).a(axa.aJ);
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
         cip.this.bB.m();
         cip.this.bB.f();
      }

      @Override
      public void a() {
         if (cip.this.cy != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cip.this.bB.l()) {
               if (!cip.this.b(cip.this.cy, 16)) {
                  if (cip.this.l(cip.this.cy)) {
                     cip.this.gI();
                  } else {
                     cip.this.j(cip.this.cy);
                  }
               } else {
                  boolean $$0 = this.a(cip.this.cy);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cip.this.bB.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cip.this.gI();
                        this.i = 0;
                     }
                  } else {
                     this.g = cip.this.bB.i();
                  }
               }
            }
         }
      }

      private boolean a(iu $$0) {
         int $$1 = cip.this.b($$0, 3) ? 1 : 2;
         cip.this.bB.b(10.0F);
         cip.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cip.this.bB.i() != null && cip.this.bB.i().j();
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
         if (cip.this.cy != null) {
            this.c(cip.this.cy);
         }

         cip.this.gI();
      }

      private boolean d(iu $$0) {
         if (cip.this.b($$0, 2)) {
            return true;
         } else {
            ewj $$1 = cip.this.bB.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cip.a {
      private static final int c = 2400;
      int d = cip.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean h() {
         return cip.this.cx != null && !cip.this.ge() && this.k() && !cip.this.b(cip.this.cx, 2);
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
         cip.this.bB.m();
         cip.this.bB.f();
      }

      @Override
      public void a() {
         if (cip.this.cx != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cip.this.gJ();
            } else if (!cip.this.bB.l()) {
               if (cip.this.l(cip.this.cx)) {
                  cip.this.gJ();
               } else {
                  cip.this.j(cip.this.cx);
               }
            }
         }
      }

      private boolean k() {
         return cip.this.cm > 600;
      }
   }

   class g extends cip.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cip.this.gN() >= 10) {
            return false;
         } else {
            return cip.this.ae.i() < 0.3F ? false : cip.this.gC() && cip.this.gR();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cip.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iu $$1 = cip.this.dv().c($$0);
               dzo $$2 = cip.this.dV().a_($$1);
               dlu $$3 = $$2.b();
               dzo $$4 = null;
               if ($$2.a(axa.aL)) {
                  if ($$3 instanceof dnq) {
                     dnq $$5 = (dnq)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dtw) {
                     int $$6 = $$2.c(dtw.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dtw.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dlw.oK)) {
                     int $$7 = $$2.c(dud.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dud.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dlw.sZ) || $$2.a(dlw.ta)) {
                     dlx $$8 = (dlx)$$2.b();
                     if ($$8.a(cip.this.dV(), $$1, $$2)) {
                        $$8.a((aro)cip.this.dV(), cip.this.ae, $$1, $$2);
                        $$4 = cip.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cip.this.dV().c(2011, $$1, 15);
                     cip.this.dV().b($$1, $$4);
                     cip.this.gP();
                  }
               }
            }
         }
      }
   }

   class h extends cfn {
      h(final cip $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cip.this.W_() && super.c();
      }

      @Override
      protected void a(bxb $$0, bwz $$1) {
         if ($$0 instanceof cip && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cip.a {
      @Override
      public boolean h() {
         return cip.this.cs == 0 && !cip.this.gs() && cip.this.gK();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cip.this.cs = 200;
         List<iu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iu $$1 : $$0) {
               if (!cip.this.cA.b($$1)) {
                  cip.this.cy = $$1;
                  return;
               }
            }

            cip.this.cA.k();
            cip.this.cy = $$0.get(0);
         }
      }

      private List<iu> k() {
         iu $$0 = cip.this.dv();
         cib $$1 = ((aro)cip.this.dV()).A();
         Stream<cic> $$2 = $$1.c($$0x -> $$0x.a(axk.c), $$0, 20, cib.b.c);
         return $$2.map(cic::g).filter(cip.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ccx {
      j(final bxb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cip.this.W_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cip.this.cz.l();
      }
   }

   class k extends cip.a {
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
      private fdw m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean h() {
         if (cip.this.cw > 0) {
            return false;
         } else if (cip.this.gC()) {
            return false;
         } else if (cip.this.dV().ah()) {
            return false;
         } else {
            Optional<iu> $$0 = this.p();
            if ($$0.isPresent()) {
               cip.this.cx = $$0.get();
               cip.this.bB.a((double)cip.this.cx.u() + 0.5, (double)cip.this.cx.v() + 0.5, (double)cip.this.cx.w() + 0.5, 1.2F);
               return true;
            } else {
               cip.this.cw = azk.a(cip.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cip.this.t()) {
            return false;
         } else if (cip.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cip.this.ae.i() < 0.2F : true;
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
         cip.this.gr();
      }

      @Override
      public void e() {
         if (this.k()) {
            cip.this.w(true);
         }

         this.l = false;
         cip.this.bB.m();
         cip.this.cw = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cip.this.t()) {
            this.n++;
            if (this.n > 600) {
               cip.this.gJ();
               this.l = false;
               cip.this.cw = 200;
            } else {
               fdw $$0 = fdw.c(cip.this.cx).b(0.0, 0.6F, 0.0);
               if ($$0.f(cip.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cip.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cip.this.gJ();
                  } else {
                     if ($$1) {
                        boolean $$3 = cip.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fdw($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cip.this.bB.m();
                        } else {
                           $$2 = false;
                        }

                        cip.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cip.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cip.this.a(awl.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cip.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cip.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iu> p() {
         Iterable<iu> $$0 = iu.a(cip.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iu $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cip.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cip.c(cip.this.dV().a_($$2))) {
               ewj $$4 = cip.this.bB.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cip.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cdv {
      l() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         return cip.this.bB.k() && cip.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cip.this.bB.l();
      }

      @Override
      public void d() {
         fdw $$0 = this.h();
         if ($$0 != null) {
            cip.this.bB.a(cip.this.bB.a(iu.a((jo)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fdw h() {
         fdw $$1;
         if (cip.this.gR() && !cip.this.b(cip.this.cy, this.i())) {
            fdw $$0 = fdw.b(cip.this.cy);
            $$1 = $$0.d(cip.this.dt()).d();
         } else {
            $$1 = cip.this.h(0.0F);
         }

         int $$3 = 8;
         fdw $$4 = chu.a(cip.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : chq.a(cip.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cip.this.gs() && !cip.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cip.a {
      private final int c = azk.a(cip.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cip.this.cx != null && cip.this.dV().p(cip.this.cx) && !this.a(cip.this.cx)) {
            cip.this.gJ();
         }

         this.d = cip.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cip.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iu $$0) {
         return cip.c(cip.this.dV().a_($$0));
      }
   }

   class n extends cip.a {
      private final int c = azk.a(cip.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cip.this.cy != null && cip.this.dV().p(cip.this.cy) && !cip.this.gR()) {
            cip.this.gI();
         }

         this.d = cip.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cip.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
