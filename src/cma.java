import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cma extends bvc implements clj {
   private static final akl<Integer> bZ = akp.a(cma.class, akn.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public cma(bul<? extends cma> $$0, dfb $$1) {
      super($$0, $$1);
      this.cO();
      this.bP = new cma.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cma.b(this));
      this.bS.a(2, new cma.a(this));
      this.bS.a(3, new cma.e(this));
      this.bS.a(5, new cma.c(this));
      this.bT.a(1, new cdr<>(this, com.class, 10, true, false, $$0 -> Math.abs($$0.dE() - this.dE()) <= 4.0));
      this.bT.a(3, new cdr<>(this, chd.class, true));
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azk.a($$0, 1, 127);
      this.am.a(bZ, $$2);
      this.aA();
      this.j_();
      this.g(bwi.s).a((double)($$2 * $$2));
      this.g(bwi.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bwi.c).a((double)$$2);
      if ($$1) {
         this.x(this.eV());
      }

      this.bN = $$2;
   }

   public int gv() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Size", this.gv() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(uk $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gw() {
      return this.gv() <= 1;
   }

   protected lp t() {
      return lr.U;
   }

   @Override
   protected boolean aa() {
      return this.gv() > 0;
   }

   @Override
   public void l() {
      this.bY = this.bX;
      this.bX = this.bX + (this.e - this.bX) * 0.5F;
      super.l();
      if (this.aK() && !this.ca) {
         float $$0 = this.a(this.ay()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = azk.a($$3) * $$1 * $$4;
            float $$6 = azk.b($$3) * $$1 * $$4;
            this.dX().a(this.t(), this.dC() + (double)$$5, this.dE(), this.dI() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gt(), this.fi(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aK() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aK();
      this.gq();
   }

   protected void gq() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.af.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akl<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.v(this.aZ);
         this.aX = this.aZ;
         if (this.bk() && this.af.a(20) == 0) {
            this.bt();
         }
      }

      super.a($$0);
   }

   @Override
   public bul<? extends cma> ar() {
      return (bul<? extends cma>)super.ar();
   }

   @Override
   public void a(bue.c $$0) {
      int $$1 = this.gv();
      if (!this.dX().C && $$1 > 1 && this.eH()) {
         float $$2 = this.a(this.ay()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.af.a(3);
         fan $$6 = this.cs();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.ar(), new btz(bua.b, false, false, $$6), buk.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dC() + (double)$$8, this.dE() + 0.5, this.dI() + (double)$$9, this.af.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bue $$0) {
      super.h($$0);
      if ($$0 instanceof chd && this.gr()) {
         this.j((bva)$$0);
      }
   }

   @Override
   public void b_(com $$0) {
      if (this.gr()) {
         this.j($$0);
      }
   }

   protected void j(bva $$0) {
      if (this.bM() && this.i($$0) && this.G($$0)) {
         bsu $$1 = this.dY().b((bva)this);
         if ($$0.a($$1, this.gs())) {
            this.a(awl.xo, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dX() instanceof arn $$2) {
               dbu.a($$2, (bue)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      return new ezn(0.0, (double)$$1.b() - 0.015625 * (double)this.gv() * (double)$$2, 0.0);
   }

   protected boolean gr() {
      return !this.gw() && this.dk();
   }

   protected float gs() {
      return (float)this.h(bwi.c);
   }

   @Override
   protected awk d(bsu $$0) {
      return this.gw() ? awl.yk : awl.xq;
   }

   @Override
   protected awk o_() {
      return this.gw() ? awl.yj : awl.xp;
   }

   protected awk gt() {
      return this.gw() ? awl.ym : awl.xs;
   }

   public static boolean c(bul<cma> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      if ($$1.ak() != bsa.a) {
         if (buk.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awz.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dfy)) {
            return false;
         }

         deh $$5 = new deh($$3);
         boolean $$6 = ece.a($$5.g, $$5.h, ((dfy)$$1).C(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fi() {
      return 0.4F * (float)this.gv();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gx() {
      return this.gv() > 0;
   }

   @Override
   public void v() {
      ezn $$0 = this.dA();
      this.n($$0.d, (double)this.fl(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float q() {
      float $$0 = this.gw() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awk gu() {
      return this.gw() ? awl.yl : awl.xr;
   }

   @Override
   public buh e(bvm $$0) {
      return super.e($$0).a((float)this.gv());
   }

   static class a extends cby {
      private final cma a;
      private int b;

      public a(cma $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.b));
      }

      @Override
      public boolean b() {
         bva $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof cma.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bva $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bva $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof cma.d $$1) {
            $$1.a(this.a.dN(), this.a.gr());
         }
      }
   }

   static class b extends cby {
      private final cma a;

      public b(cma $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.c, cby.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bk() || this.a.by()) && this.a.M() instanceof cma.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.ea().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.M() instanceof cma.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cby {
      private final cma a;

      public c(cma $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.c, cby.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.ca();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof cma.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cbb {
      private float l;
      private int m;
      private final cma n;
      private boolean o;

      public d(cma $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dN() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cbb.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dN(), this.l, 90.0F));
         this.d.aZ = this.d.dN();
         this.d.aX = this.d.dN();
         if (this.k != cbb.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cbb.a.a;
            if (this.d.aK()) {
               this.d.C((float)(this.h * this.d.h(bwi.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gx()) {
                     this.n.a(this.n.gu(), this.n.fi(), this.n.q());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bwi.v)));
            }
         }
      }
   }

   static class e extends cby {
      private final cma a;
      private float b;
      private int c;

      public e(cma $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aK() || this.a.bk() || this.a.by() || this.a.b(btl.y)) && this.a.M() instanceof cma.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ea().a(60));
            this.b = (float)this.a.ea().a(360);
         }

         if (this.a.M() instanceof cma.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
