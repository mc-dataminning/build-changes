import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnn extends cot implements cod {
   public static final float a = 0.03F;
   boolean bI;
   protected final cgo b;
   protected final cgl c;

   public cnn(bwm<? extends cnn> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new cnn.d(this);
      this.a(ewx.j, 0.0F);
      this.b = new cgo(this, $$1);
      this.c = new cgl(this, $$1);
   }

   public static byh.a j() {
      return cot.gr().a(byi.B, 1.0);
   }

   @Override
   protected void m() {
      this.bC.a(1, new cnn.c(this, 1.0));
      this.bC.a(2, new cnn.f(this, 1.0, 40, 10.0F));
      this.bC.a(2, new cnn.a(this, 1.0, false));
      this.bC.a(5, new cnn.b(this, 1.0));
      this.bC.a(6, new cnn.e(this, 1.0, this.dV().P()));
      this.bC.a(7, new cev(this, 1.0));
      this.bD.a(1, new cfq(this, cnn.class).a(cov.class));
      this.bD.a(2, new cfr<>(this, cqy.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bD.a(3, new cfr<>(this, cqf.class, false));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
      this.bD.a(3, new cfr<>(this, ckj.class, true, false));
      this.bD.a(5, new cfr<>(this, cjy.class, 10, true, false, cjy.bF));
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bwn.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bwn.b, new cyy(czc.wZ));
         this.g(bwn.b);
      }

      return $$3;
   }

   public static boolean a(bwm<cnn> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      if (!$$1.b_($$3.e()).a(axh.a) && !bwl.a($$2)) {
         return false;
      } else {
         je<djy> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != bty.a && (bwl.b($$2) || a($$1, $$3, $$4)) && (bwl.a($$2) || $$1.b_($$3).a(axh.a));
         if (!$$6 || !bwl.a($$2) && $$2 != bwl.j) {
            return $$5.a(axb.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(diw $$0, iu $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awm u() {
      return this.bj() ? awn.ia : awn.hZ;
   }

   @Override
   protected awm e(bus $$0) {
      return this.bj() ? awn.ie : awn.id;
   }

   @Override
   protected awm l_() {
      return this.bj() ? awn.ic : awn.ib;
   }

   @Override
   protected awm n() {
      return awn.ig;
   }

   @Override
   protected awm aV() {
      return awn.ih;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected cyy t() {
      return cyy.k;
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bwn.a, new cyy(czc.wY));
         } else {
            this.a(bwn.a, new cyy(czc.rY));
         }
      }
   }

   @Override
   protected boolean a(cyy $$0, cyy $$1, bwn $$2) {
      return $$1.a(czc.wZ) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(diy $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bxc $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gx() {
      if (this.bI) {
         return true;
      } else {
         bxc $$0 = this.f();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fei $$0) {
      if (this.bn() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dV().C) {
         if (this.dj() && this.bn() && this.gx()) {
            this.bB = this.b;
            this.i(true);
         } else {
            this.bB = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gq() {
      ewu $$0 = this.O().i();
      if ($$0 != null) {
         iu $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bxc $$0, float $$1) {
      cyy $$2 = this.fa();
      cyy $$3 = $$2.a(czc.wY) ? $$2 : new cyy(czc.wY);
      csg $$4 = new csg(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crs.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awn.if, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axr<cyu> Y() {
      return axk.bT;
   }

   public void w(boolean $$0) {
      this.bI = $$0;
   }

   static class a extends cfn {
      private final cnn b;

      public a(cnn $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.f());
      }
   }

   static class b extends cel {
      private final cnn g;

      public b(cnn $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().V() && this.g.bj() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(diy $$0, iu $$1) {
         iu $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bB = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cdy {
      private final bxk a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final div f;

      public c(bxk $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fei $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k();
      }

      @Override
      public void d() {
         this.a.O().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fei h() {
         azv $$0 = this.a.dY();
         iu $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dmc.J)) {
               return fei.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cdb {
      private final cnn l;

      public d(cnn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bxc $$0 = this.l.f();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bI) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cdb.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(byi.v));
            float $$7 = azm.h(0.125F, this.l.fn(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cdy {
      private final cnn a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cnn $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().V() && this.a.bj() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.O().k() || this.a.gq())) {
            fei $$0 = chv.a(this.a, 4, 8, new fei(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.O().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cex {
      private final cnn a;

      public f(cod $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cnn)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fa().a(czc.wY);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bua.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fE();
         this.a.v(false);
      }
   }
}
