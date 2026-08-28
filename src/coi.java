import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class coi extends bxe implements cnr {
   private static final akj<Integer> bG = akn.a(coi.class, akl.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bE;
   public float bF;
   private boolean bH;

   public coi(bwm<? extends coi> $$0, div $$1) {
      super($$0, $$1);
      this.cN();
      this.bz = new coi.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new coi.b(this));
      this.bC.a(2, new coi.a(this));
      this.bC.a(3, new coi.e(this));
      this.bC.a(5, new coi.c(this));
      this.bD.a(1, new cfr<>(this, cqy.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azm.a($$0, 1, 127);
      this.al.a(bG, $$2);
      this.ay();
      this.i_();
      this.g(byi.s).a((double)($$2 * $$2));
      this.g(byi.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(byi.c).a((double)$$2);
      if ($$1) {
         this.d(this.eT());
      }

      this.bx = $$2;
   }

   public int go() {
      return this.al.a(bG);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.bH);
   }

   @Override
   public void a(tz $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bH = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lv m() {
      return lx.X;
   }

   @Override
   protected boolean aa() {
      return this.go() > 0;
   }

   @Override
   public void h() {
      this.bF = this.bE;
      this.bE = this.bE + (this.d - this.bE) * 0.5F;
      super.h();
      if (this.aJ() && !this.bH) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azm.a($$3) * $$1 * $$4;
            float $$6 = azm.b($$3) * $$1 * $$4;
            this.dV().a(this.m(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.bH) {
         this.d = 1.0F;
      }

      this.bH = this.aJ();
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
   public void a(akj<?> $$0) {
      if (bG.equals($$0)) {
         this.i_();
         this.w(this.aX);
         this.aV = this.aX;
         if (this.bj() && this.ae.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bwm<? extends coi> aq() {
      return (bwm<? extends coi>)super.aq();
   }

   @Override
   public void a(bwd.e $$0) {
      int $$1 = this.go();
      if (!this.dV().C && $$1 > 1 && this.eG()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         ffi $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bvx(bvy.b, false, false, $$6), bwl.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwd $$0) {
      super.h($$0);
      if ($$0 instanceof cjg && this.t()) {
         this.i((bxc)$$0);
      }
   }

   @Override
   public void a_(cqy $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bxc $$0) {
      if (this.dV() instanceof arq $$1 && this.bK() && this.h($$0) && this.E($$0)) {
         bus $$2 = this.dW().b((bxc)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awn.yc, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dfn.a($$1, (bwd)$$0, $$2);
         }
      }
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      return new fei(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gp() && this.dj();
   }

   protected float x() {
      return (float)this.h(byi.c);
   }

   @Override
   protected awm e(bus $$0) {
      return this.gp() ? awn.zh : awn.ye;
   }

   @Override
   protected awm l_() {
      return this.gp() ? awn.zg : awn.yd;
   }

   protected awm gm() {
      return this.gp() ? awn.zj : awn.yg;
   }

   public static boolean c(bwm<coi> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      if ($$1.an() != bty.a) {
         if (bwl.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(axb.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dju)) {
            return false;
         }

         dic $$5 = new dic($$3);
         boolean $$6 = egx.a($$5.h, $$5.i, ((dju)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fd() {
      return 0.4F * (float)this.go();
   }

   @Override
   public int ac() {
      return 0;
   }

   protected boolean gq() {
      return this.go() > 0;
   }

   @Override
   public void s() {
      fei $$0 = this.dy();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float j() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awm gn() {
      return this.gp() ? awn.zi : awn.yf;
   }

   @Override
   public bwg e(bxo $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends cdy {
      private final coi a;
      private int b;

      public a(coi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.b));
      }

      @Override
      public boolean b() {
         bxc $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof coi.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bxc $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bxc $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof coi.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends cdy {
      private final coi a;

      public b(coi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.c, cdy.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bw()) && this.a.L() instanceof coi.d;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof coi.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cdy {
      private final coi a;

      public c(coi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.c, cdy.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof coi.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cdb {
      private float l;
      private int m;
      private final coi n;
      private boolean o;

      public d(coi $$0) {
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
         this.k = cdb.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aX = this.d.dL();
         this.d.aV = this.d.dL();
         if (this.k != cdb.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cdb.a.a;
            if (this.d.aJ()) {
               this.d.B((float)(this.h * this.d.h(byi.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fd(), this.n.j());
                  }
               } else {
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.h(byi.v)));
            }
         }
      }
   }

   static class e extends cdy {
      private final coi a;
      private float b;
      private int c;

      public e(coi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aJ() || this.a.bj() || this.a.bw() || this.a.b(bvj.y)) && this.a.L() instanceof coi.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof coi.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
