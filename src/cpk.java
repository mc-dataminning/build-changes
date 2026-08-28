import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpk extends bxy implements cot {
   private static final akn<Integer> bH = akr.a(cpk.class, akp.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   private static final boolean bI = false;
   public float d;
   public float e;
   public float f;
   private boolean bJ = false;

   public cpk(bxe<? extends cpk> $$0, djz $$1) {
      super($$0, $$1);
      this.cN();
      this.bC = new cpk.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cpk.b(this));
      this.bF.a(2, new cpk.a(this));
      this.bF.a(3, new cpk.e(this));
      this.bF.a(5, new cpk.c(this));
      this.bG.a(1, new cgl<>(this, crz.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bH, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azq.a($$0, 1, 127);
      this.al.a(bH, $$2);
      this.av();
      this.i_();
      this.g(bzc.s).a((double)($$2 * $$2));
      this.g(bzc.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bzc.c).a((double)$$2);
      if ($$1) {
         this.d(this.eU());
      }

      this.bA = $$2;
   }

   public int gs() {
      return this.al.a(bH);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Size", this.gs() - 1);
      $$0.a("wasOnGround", this.bJ);
   }

   @Override
   public void a(ua $$0) {
      this.a($$0.b("Size", 0) + 1, false);
      super.a($$0);
      this.bJ = $$0.b("wasOnGround", false);
   }

   public boolean gt() {
      return this.gs() <= 1;
   }

   protected lx m() {
      return lz.X;
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
            float $$5 = azq.a($$3) * $$1 * $$4;
            float $$6 = azq.b($$3) * $$1 * $$4;
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
   public void a(akn<?> $$0) {
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
   public bxe<? extends cpk> an() {
      return (bxe<? extends cpk>)super.an();
   }

   @Override
   public void a(bwv.d $$0) {
      int $$1 = this.gs();
      if (!this.dV().C && $$1 > 1 && this.eH()) {
         float $$2 = this.a(this.at()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fgs $$6 = this.cq();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.an(), new bwp(bwq.b, false, false, $$6), bxd.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwv $$0) {
      super.h($$0);
      if ($$0 instanceof ckc && this.t()) {
         this.i((bxw)$$0);
      }
   }

   @Override
   public void a_(crz $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bxw $$0) {
      if (this.dV() instanceof aru $$1 && this.bJ() && this.h($$0) && this.E($$0)) {
         bvk $$2 = this.dW().b((bxw)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awr.yf, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dgp.a($$1, (bwv)$$0, $$2);
         }
      }
   }

   @Override
   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      return new ffs(0.0, (double)$$1.b() - 0.015625 * (double)this.gs() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gt() && this.dj();
   }

   protected float x() {
      return (float)this.h(bzc.c);
   }

   @Override
   protected awq e(bvk $$0) {
      return this.gt() ? awr.zk : awr.yh;
   }

   @Override
   protected awq l_() {
      return this.gt() ? awr.zj : awr.yg;
   }

   protected awq gq() {
      return this.gt() ? awr.zm : awr.yj;
   }

   public static boolean c(bxe<cpk> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      if ($$1.an() != buq.a) {
         if (bxd.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(axf.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dky)) {
            return false;
         }

         dje $$5 = new dje($$3);
         boolean $$6 = eie.a($$5.h, $$5.i, ((dky)$$1).E(), 987234911L).a(10) == 0;
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
      ffs $$0 = this.dy();
      this.n($$0.d, (double)this.fh(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
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

   protected awq gr() {
      return this.gt() ? awr.zl : awr.yi;
   }

   @Override
   public bwy e(byi $$0) {
      return super.e($$0).a((float)this.gs());
   }

   static class a extends ces {
      private final cpk a;
      private int b;

      public a(cpk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.b));
      }

      @Override
      public boolean b() {
         bxw $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof cpk.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bxw $$0 = this.a.f();
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
         bxw $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof cpk.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends ces {
      private final cpk a;

      public b(cpk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.c, ces.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bi() || this.a.bv()) && this.a.L() instanceof cpk.d;
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

         if (this.a.L() instanceof cpk.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ces {
      private final cpk a;

      public c(cpk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.c, ces.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bY();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof cpk.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cdv {
      private float l;
      private int m;
      private final cpk n;
      private boolean o;

      public d(cpk $$0) {
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
         this.k = cdv.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aX = this.d.dL();
         this.d.aV = this.d.dL();
         if (this.k != cdv.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cdv.a.a;
            if (this.d.aH()) {
               this.d.B((float)(this.h * this.d.h(bzc.v)));
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
               this.d.B((float)(this.h * this.d.h(bzc.v)));
            }
         }
      }
   }

   static class e extends ces {
      private final cpk a;
      private float b;
      private int c;

      public e(cpk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aH() || this.a.bi() || this.a.bv() || this.a.b(bwb.y)) && this.a.L() instanceof cpk.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof cpk.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
