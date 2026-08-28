import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpi extends bxw implements cor {
   private static final akl<Integer> bH = akp.a(cpi.class, akn.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   private static final boolean bI = false;
   public float d;
   public float e;
   public float f;
   private boolean bJ = false;

   public cpi(bxc<? extends cpi> $$0, djx $$1) {
      super($$0, $$1);
      this.cN();
      this.bC = new cpi.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cpi.b(this));
      this.bF.a(2, new cpi.a(this));
      this.bF.a(3, new cpi.e(this));
      this.bF.a(5, new cpi.c(this));
      this.bG.a(1, new cgj<>(this, crx.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bG.a(3, new cgj<>(this, cka.class, true));
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bH, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azo.a($$0, 1, 127);
      this.al.a(bH, $$2);
      this.av();
      this.i_();
      this.g(bza.s).a((double)($$2 * $$2));
      this.g(bza.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bza.c).a((double)$$2);
      if ($$1) {
         this.d(this.eU());
      }

      this.bA = $$2;
   }

   public int gs() {
      return this.al.a(bH);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Size", this.gs() - 1);
      $$0.a("wasOnGround", this.bJ);
   }

   @Override
   public void a(tz $$0) {
      this.a($$0.b("Size", 0) + 1, false);
      super.a($$0);
      this.bJ = $$0.b("wasOnGround", false);
   }

   public boolean gt() {
      return this.gs() <= 1;
   }

   protected lw m() {
      return ly.X;
   }

   @Override
   protected boolean aa() {
      return this.gs() > 0;
   }

   @Override
   public void h() {
      this.f = this.e;
      this.e = this.e + (this.d - this.e) * 0.5F;
      super.h();
      if (this.aH() && !this.bJ) {
         float $$0 = this.a(this.at()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azo.a($$3) * $$1 * $$4;
            float $$6 = azo.b($$3) * $$1 * $$4;
            this.dV().a(this.m(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gq(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aH() && this.bJ) {
         this.d = 1.0F;
      }

      this.bJ = this.aH();
      this.q();
   }

   @Override
   protected void q() {
      this.d *= 0.6F;
   }

   protected int n() {
      return this.ae.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akl<?> $$0) {
      if (bH.equals($$0)) {
         this.i_();
         this.w(this.aX);
         this.aV = this.aX;
         if (this.bi() && this.ae.a(20) == 0) {
            this.bq();
         }
      }

      super.a($$0);
   }

   @Override
   public bxc<? extends cpi> an() {
      return (bxc<? extends cpi>)super.an();
   }

   @Override
   public void a(bwt.d $$0) {
      int $$1 = this.gs();
      if (!this.dV().C && $$1 > 1 && this.eH()) {
         float $$2 = this.a(this.at()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fgq $$6 = this.cq();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.an(), new bwn(bwo.b, false, false, $$6), bxb.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwt $$0) {
      super.h($$0);
      if ($$0 instanceof cka && this.t()) {
         this.i((bxu)$$0);
      }
   }

   @Override
   public void a_(crx $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bxu $$0) {
      if (this.dV() instanceof ars $$1 && this.bJ() && this.h($$0) && this.E($$0)) {
         bvi $$2 = this.dW().b((bxu)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awp.yf, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dgn.a($$1, (bwt)$$0, $$2);
         }
      }
   }

   @Override
   protected ffq a(bwt $$0, bww $$1, float $$2) {
      return new ffq(0.0, (double)$$1.b() - 0.015625 * (double)this.gs() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gt() && this.dj();
   }

   protected float x() {
      return (float)this.h(bza.c);
   }

   @Override
   protected awo e(bvi $$0) {
      return this.gt() ? awp.zk : awp.yh;
   }

   @Override
   protected awo l_() {
      return this.gt() ? awp.zj : awp.yg;
   }

   protected awo gq() {
      return this.gt() ? awp.zm : awp.yj;
   }

   public static boolean c(bxc<cpi> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      if ($$1.an() != buo.a) {
         if (bxb.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(axd.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dkw)) {
            return false;
         }

         djc $$5 = new djc($$3);
         boolean $$6 = eic.a($$5.h, $$5.i, ((dkw)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fe() {
      return 0.4F * (float)this.gs();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gu() {
      return this.gs() > 0;
   }

   @Override
   public void s() {
      ffq $$0 = this.dy();
      this.n($$0.d, (double)this.fh(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float j() {
      float $$0 = this.gt() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awo gr() {
      return this.gt() ? awp.zl : awp.yi;
   }

   @Override
   public bww e(byg $$0) {
      return super.e($$0).a((float)this.gs());
   }

   static class a extends ceq {
      private final cpi a;
      private int b;

      public a(cpi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.b));
      }

      @Override
      public boolean b() {
         bxu $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof cpi.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bxu $$0 = this.a.f();
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
         bxu $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof cpi.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends ceq {
      private final cpi a;

      public b(cpi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.c, ceq.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bi() || this.a.bv()) && this.a.L() instanceof cpi.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof cpi.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ceq {
      private final cpi a;

      public c(cpi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.c, ceq.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bY();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof cpi.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cdt {
      private float l;
      private int m;
      private final cpi n;
      private boolean o;

      public d(cpi $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dL() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cdt.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aX = this.d.dL();
         this.d.aV = this.d.dL();
         if (this.k != cdt.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cdt.a.a;
            if (this.d.aH()) {
               this.d.B((float)(this.h * this.d.h(bza.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gu()) {
                     this.n.a(this.n.gr(), this.n.fe(), this.n.j());
                  }
               } else {
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.h(bza.v)));
            }
         }
      }
   }

   static class e extends ceq {
      private final cpi a;
      private float b;
      private int c;

      public e(cpi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aH() || this.a.bi() || this.a.bv() || this.a.b(bvz.y)) && this.a.L() instanceof cpi.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof cpi.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
