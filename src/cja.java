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

public class cja extends ciz implements bxo, cjn {
   public static final float bG = 120.32113F;
   public static final int bH = azm.f(1.4959966F);
   private static final akj<Byte> bQ = akn.a(cja.class, akl.a);
   private static final akj<Integer> bR = akn.a(cja.class, akl.b);
   private static final int bS = 2;
   private static final int bT = 4;
   private static final int bU = 8;
   private static final int bV = 1200;
   private static final int bW = 600;
   private static final int bX = 3600;
   private static final int bY = 4;
   private static final int bZ = 10;
   private static final int ca = 10;
   private static final int cb = 18;
   private static final int cc = 48;
   private static final int cd = 2;
   private static final int ce = 24;
   private static final int cf = 16;
   private static final int cg = 16;
   private static final int ch = 20;
   public static final String bI = "CropsGrownSincePollination";
   public static final String bK = "CannotEnterHiveTicks";
   public static final String bL = "TicksSincePollination";
   public static final String bM = "HasStung";
   public static final String bN = "HasNectar";
   public static final String bO = "flower_pos";
   public static final String bP = "hive_pos";
   private static final btr ci = baq.a(20, 39);
   @Nullable
   private UUID cj;
   private float ck;
   private float cl;
   private int cm;
   int cn;
   private int cq;
   private int cr;
   private static final int cs = 200;
   int ct;
   private static final int cu = 200;
   private static final int cv = 20;
   private static final int cw = 60;
   int cx = azm.a(this.ae, 20, 60);
   @Nullable
   iv cy;
   @Nullable
   iv cz;
   cja.k cA;
   cja.e cB;
   private cja.f cC;
   private int cD;

   public cja(bwr<? extends cja> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new cdf(this, 20, true);
      this.bz = new cja.j(this);
      this.a(exm.n, -1.0F);
      this.a(exm.j, -1.0F);
      this.a(exm.k, 16.0F);
      this.a(exm.x, -1.0F);
      this.a(exm.h, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, (byte)0);
      $$0.a(bR, 0);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bD.a(0, new cja.b(this, 1.4F, true));
      this.bD.a(1, new cja.d());
      this.bD.a(2, new cdr(this, 1.0));
      this.bD.a(3, new cfn(this, 1.25, $$0 -> $$0.a(axk.an), false));
      this.bD.a(3, new cja.n());
      this.bD.a(3, new cja.m());
      this.cA = new cja.k();
      this.bD.a(4, this.cA);
      this.bD.a(5, new cee(this, 1.25));
      this.bD.a(5, new cja.i());
      this.cB = new cja.e();
      this.bD.a(5, this.cB);
      this.cC = new cja.f();
      this.bD.a(6, this.cC);
      this.bD.a(7, new cja.g());
      this.bD.a(8, new cja.l());
      this.bD.a(9, new cdz(this));
      this.bE.a(1, new cja.h(this).a(new Class[0]));
      this.bE.a(2, new cja.c(this));
      this.bE.a(3, new cge<>(this, true));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("hive_pos", iv.a, this.cz);
      $$0.b("flower_pos", iv.a, this.cy);
      $$0.a("HasNectar", this.gF());
      $$0.a("HasStung", this.gG());
      $$0.a("TicksSincePollination", this.cn);
      $$0.a("CannotEnterHiveTicks", this.cq);
      $$0.a("CropsGrownSincePollination", this.cr);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("HasNectar"));
      this.x($$0.o("HasStung"));
      this.cn = $$0.f("TicksSincePollination");
      this.cq = $$0.f("CannotEnterHiveTicks");
      this.cr = $$0.f("CropsGrownSincePollination");
      this.cz = $$0.<iv>a("hive_pos", iv.a).orElse(null);
      this.cy = $$0.<iv>a("flower_pos", iv.a).orElse(null);
      this.a(this.dU(), $$0);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      bux $$2 = this.dV().a((bxj)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(byp.c)));
      if ($$3) {
         dfz.a($$0, $$1, $$2);
         if ($$1 instanceof bxj $$4) {
            $$4.p($$4.eW() + 1);
            int $$5 = 0;
            if (this.dU().an() == bud.c) {
               $$5 = 10;
            } else if (this.dU().an() == bud.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bvm(bvo.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.W_();
         this.a(awn.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gF() && this.gQ() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dU(), this.dz() - 0.3F, this.dz() + 0.3F, this.dF() - 0.3F, this.dF() + 0.3F, this.e(0.5), ly.aB);
         }
      }

      this.gO();
   }

   private void a(djh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lw $$6) {
      $$0.a($$6, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   void j(iv $$0) {
      fex $$1 = fex.c($$0);
      int $$2 = 0;
      iv $$3 = this.du();
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

      fex $$8 = cib.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bC.b(0.5F);
         this.bC.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public iv q() {
      return this.cy;
   }

   public boolean t() {
      return this.cy != null;
   }

   public void h(iv $$0) {
      this.cy = $$0;
   }

   @bav
   public int x() {
      return Math.max(this.cB.d, this.cC.d);
   }

   @bav
   public List<iv> gt() {
      return this.cB.f;
   }

   private boolean gK() {
      return this.cn > 3600;
   }

   void gL() {
      this.cz = null;
      this.ct = 200;
   }

   void gM() {
      this.cy = null;
      this.cx = azm.a(this.ae, 20, 60);
   }

   boolean gN() {
      if (this.cq <= 0 && !this.cA.l() && !this.gG() && this.f() == null) {
         boolean $$0 = this.gK() || c(this.dU()) || this.gF();
         return $$0 && !this.gP();
      } else {
         return false;
      }
   }

   public static boolean c(djh $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cq = $$0;
   }

   public float J(float $$0) {
      return azm.h($$0, this.cl, this.ck);
   }

   private void gO() {
      this.cl = this.ck;
      if (this.gV()) {
         this.ck = Math.min(1.0F, this.ck + 0.2F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.24F);
      }
   }

   @Override
   protected void a(arq $$0) {
      boolean $$1 = this.gG();
      if (this.bh()) {
         this.cD++;
      } else {
         this.cD = 0;
      }

      if (this.cD > 20) {
         this.a($$0, this.dV().i(), 1.0F);
      }

      if ($$1) {
         this.cm++;
         if (this.cm % 5 == 0 && this.ae.a(azm.a(1200 - this.cm, 1, 1200)) == 0) {
            this.a($$0, this.dV().p(), this.eF());
         }
      }

      if (!this.gF()) {
         this.cn++;
      }

      this.a($$0, false);
   }

   public void gu() {
      this.cn = 0;
   }

   private boolean gP() {
      dxj $$0 = this.gT();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.al.a(bR);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bR, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cj = $$0;
   }

   @Override
   public void c() {
      this.a(ci.a(this.ae));
   }

   private boolean k(iv $$0) {
      dxm $$1 = this.dU().c_($$0);
      return $$1 instanceof dxj ? !((dxj)$$1).d() : false;
   }

   @bav
   public boolean gv() {
      return this.cz != null;
   }

   @Nullable
   @bav
   public iv gw() {
      return this.cz;
   }

   @bav
   public ceg gx() {
      return this.bD;
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   int gQ() {
      return this.cr;
   }

   private void gR() {
      this.cr = 0;
   }

   void gS() {
      this.cr++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         if (this.cq > 0) {
            this.cq--;
         }

         if (this.ct > 0) {
            this.ct--;
         }

         if (this.cx > 0) {
            this.cx--;
         }

         boolean $$0 = this.X_() && !this.gG() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gU()) {
            this.cz = null;
         }
      }
   }

   @Nullable
   dxj gT() {
      if (this.cz == null) {
         return null;
      } else {
         return this.l(this.cz) ? null : this.dU().a(this.cz, dxo.I).orElse(null);
      }
   }

   boolean gU() {
      return this.gT() != null;
   }

   public boolean gF() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gu();
      }

      this.d(8, $$0);
   }

   public boolean gG() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gV() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(iv $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bQ, (byte)(this.al.a(bQ) | $$0));
      } else {
         this.al.a(bQ, (byte)(this.al.a(bQ) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bQ) & $$0) != 0;
   }

   public static byo.a gH() {
      return ciz.gy().a(byp.s, 10.0).a(byp.l, 0.6F).a(byp.v, 0.3F).a(byp.c, 2.0);
   }

   @Override
   protected cgt b(djh $$0) {
      cgr $$1 = new cgr(this, $$0) {
         @Override
         public boolean a(iv $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cja.this.cA.l()) {
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
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof cxs $$3 && $$3.c() instanceof dps $$4) {
         bvm $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dU().C) {
               this.a($$5);
            }

            return bug.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.an);
   }

   @Override
   protected void b(iv $$0, eao $$1) {
   }

   @Override
   protected awm u() {
      return null;
   }

   @Override
   protected awm e(bux $$0) {
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
   public cja b(arq $$0, bvy $$1) {
      return bwr.l.a($$0, bwq.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, eao $$2, iv $$3) {
   }

   @Override
   public boolean aY() {
      return this.gI() && this.af % bH == 0;
   }

   @Override
   public boolean gI() {
      return !this.aH();
   }

   public void gJ() {
      this.w(false);
      this.gR();
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cA.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axr<ewu> $$0) {
      this.i(this.dx().b(0.0, 0.01, 0.0));
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.2F));
   }

   boolean b(iv $$0, int $$1) {
      return $$0.a(this.du(), (double)$$1);
   }

   public void i(iv $$0) {
      this.cz = $$0;
   }

   public static boolean c(eao $$0) {
      if ($$0.a(axc.W)) {
         if ($$0.a(ebe.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dmo.jf) ? $$0.c(dov.b) == ebk.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cef {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cja.this.X_();
      }

      @Override
      public boolean c() {
         return this.i() && !cja.this.X_();
      }
   }

   class b extends cep {
      b(final bxr $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cja.this.X_() && !cja.this.gG();
      }

      @Override
      public boolean c() {
         return super.c() && cja.this.X_() && !cja.this.gG();
      }
   }

   static class c extends cfy<crj> {
      c(cja $$0) {
         super($$0, crj.class, 10, true, false, $$0::a);
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
         cja $$0 = (cja)this.e;
         return $$0.X_() && !$$0.gG();
      }
   }

   class d extends cja.a {
      @Override
      public boolean h() {
         if (cja.this.cz != null && cja.this.gN() && cja.this.cz.a(cja.this.ds(), 2.0)) {
            dxj $$0 = cja.this.gT();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cja.this.cz = null;
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
         dxj $$0 = cja.this.gT();
         if ($$0 != null) {
            $$0.a(cja.this);
         }
      }
   }

   @bav
   public class e extends cja.a {
      public static final int b = 2400;
      int d = cja.this.dU().A.a(10);
      private static final int e = 3;
      final List<iv> f = Lists.newArrayList();
      @Nullable
      private exj g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean h() {
         return cja.this.cz != null
            && !cja.this.l(cja.this.cz)
            && !cja.this.gh()
            && cja.this.gN()
            && !this.d(cja.this.cz)
            && cja.this.dU().a_(cja.this.cz).a(axc.aJ);
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
         cja.this.bC.m();
         cja.this.bC.f();
      }

      @Override
      public void a() {
         if (cja.this.cz != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cja.this.bC.l()) {
               if (!cja.this.b(cja.this.cz, 16)) {
                  if (cja.this.l(cja.this.cz)) {
                     cja.this.gL();
                  } else {
                     cja.this.j(cja.this.cz);
                  }
               } else {
                  boolean $$0 = this.a(cja.this.cz);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cja.this.bC.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cja.this.gL();
                        this.i = 0;
                     }
                  } else {
                     this.g = cja.this.bC.i();
                  }
               }
            }
         }
      }

      private boolean a(iv $$0) {
         int $$1 = cja.this.b($$0, 3) ? 1 : 2;
         cja.this.bC.b(10.0F);
         cja.this.bC.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cja.this.bC.i() != null && cja.this.bC.i().j();
      }

      boolean b(iv $$0) {
         return this.f.contains($$0);
      }

      private void c(iv $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cja.this.cz != null) {
            this.c(cja.this.cz);
         }

         cja.this.gL();
      }

      private boolean d(iv $$0) {
         if (cja.this.b($$0, 2)) {
            return true;
         } else {
            exj $$1 = cja.this.bC.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cja.a {
      private static final int c = 2400;
      int d = cja.this.dU().A.a(10);

      f() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean h() {
         return cja.this.cy != null && !cja.this.gh() && this.k() && !cja.this.b(cja.this.cy, 2);
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
         cja.this.bC.m();
         cja.this.bC.f();
      }

      @Override
      public void a() {
         if (cja.this.cy != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cja.this.gM();
            } else if (!cja.this.bC.l()) {
               if (cja.this.l(cja.this.cy)) {
                  cja.this.gM();
               } else {
                  cja.this.j(cja.this.cy);
               }
            }
         }
      }

      private boolean k() {
         return cja.this.cn > 600;
      }
   }

   class g extends cja.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cja.this.gQ() >= 10) {
            return false;
         } else {
            return cja.this.ae.i() < 0.3F ? false : cja.this.gF() && cja.this.gU();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cja.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iv $$1 = cja.this.du().c($$0);
               eao $$2 = cja.this.dU().a_($$1);
               dmm $$3 = $$2.b();
               eao $$4 = null;
               if ($$2.a(axc.aL)) {
                  if ($$3 instanceof doj) {
                     doj $$5 = (doj)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dus) {
                     int $$6 = $$2.c(dus.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dus.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dmo.oO)) {
                     int $$7 = $$2.c(duz.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(duz.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dmo.td) || $$2.a(dmo.te)) {
                     dmp $$8 = (dmp)$$2.b();
                     if ($$8.a((djk)cja.this.dU(), $$1, $$2)) {
                        $$8.a((arq)cja.this.dU(), cja.this.ae, $$1, $$2);
                        $$4 = cja.this.dU().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cja.this.dU().c(2011, $$1, 15);
                     cja.this.dU().b($$1, $$4);
                     cja.this.gS();
                  }
               }
            }
         }
      }
   }

   class h extends cfx {
      h(final cja $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cja.this.X_() && super.c();
      }

      @Override
      protected void a(bxl $$0, bxj $$1) {
         if ($$0 instanceof cja && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cja.a {
      @Override
      public boolean h() {
         return cja.this.ct == 0 && !cja.this.gv() && cja.this.gN();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cja.this.ct = 200;
         List<iv> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iv $$1 : $$0) {
               if (!cja.this.cB.b($$1)) {
                  cja.this.cz = $$1;
                  return;
               }
            }

            cja.this.cB.k();
            cja.this.cz = $$0.get(0);
         }
      }

      private List<iv> k() {
         iv $$0 = cja.this.du();
         cil $$1 = ((arq)cja.this.dU()).A();
         Stream<cim> $$2 = $$1.c($$0x -> $$0x.a(axm.c), $$0, 20, cil.b.c);
         return $$2.map(cim::g).filter(cja.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cdh {
      j(final bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cja.this.X_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cja.this.cA.l();
      }
   }

   class k extends cja.a {
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
      private fex m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean h() {
         if (cja.this.cx > 0) {
            return false;
         } else if (cja.this.gF()) {
            return false;
         } else if (cja.this.dU().ah()) {
            return false;
         } else {
            Optional<iv> $$0 = this.p();
            if ($$0.isPresent()) {
               cja.this.cy = $$0.get();
               cja.this.bC.a((double)cja.this.cy.u() + 0.5, (double)cja.this.cy.v() + 0.5, (double)cja.this.cy.w() + 0.5, 1.2F);
               return true;
            } else {
               cja.this.cx = azm.a(cja.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cja.this.t()) {
            return false;
         } else if (cja.this.dU().ah()) {
            return false;
         } else {
            return this.k() ? cja.this.ae.i() < 0.2F : true;
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
         cja.this.gu();
      }

      @Override
      public void e() {
         if (this.k()) {
            cja.this.w(true);
         }

         this.l = false;
         cja.this.bC.m();
         cja.this.cx = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (cja.this.t()) {
            this.n++;
            if (this.n > 600) {
               cja.this.gM();
               this.l = false;
               cja.this.cx = 200;
            } else {
               fex $$0 = fex.c(cja.this.cy).b(0.0, 0.6F, 0.0);
               if ($$0.f(cja.this.ds()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cja.this.ds().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cja.this.gM();
                  } else {
                     if ($$1) {
                        boolean $$3 = cja.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fex($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cja.this.bC.m();
                        } else {
                           $$2 = false;
                        }

                        cja.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cja.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cja.this.a(awn.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cja.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cja.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iv> p() {
         Iterable<iv> $$0 = iv.a(cja.this.du(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iv $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cja.this.dU().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cja.c(cja.this.dU().a_($$2))) {
               exj $$4 = cja.this.bC.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cja.this.dU().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cef {
      l() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         return cja.this.bC.k() && cja.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cja.this.bC.l();
      }

      @Override
      public void d() {
         fex $$0 = this.h();
         if ($$0 != null) {
            cja.this.bC.a(cja.this.bC.a(iv.a((jp)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fex h() {
         fex $$1;
         if (cja.this.gU() && !cja.this.b(cja.this.cz, this.i())) {
            fex $$0 = fex.b(cja.this.cz);
            $$1 = $$0.d(cja.this.ds()).d();
         } else {
            $$1 = cja.this.h(0.0F);
         }

         int $$3 = 8;
         fex $$4 = cie.a(cja.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cia.a(cja.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cja.this.gv() && !cja.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cja.a {
      private final int c = azm.a(cja.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cja.this.cy != null && cja.this.dU().p(cja.this.cy) && !this.a(cja.this.cy)) {
            cja.this.gM();
         }

         this.d = cja.this.dU().ae();
      }

      @Override
      public boolean h() {
         return cja.this.dU().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iv $$0) {
         return cja.c(cja.this.dU().a_($$0));
      }
   }

   class n extends cja.a {
      private final int c = azm.a(cja.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cja.this.cz != null && cja.this.dU().p(cja.this.cz) && !cja.this.gU()) {
            cja.this.gL();
         }

         this.d = cja.this.dU().ae();
      }

      @Override
      public boolean h() {
         return cja.this.dU().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
