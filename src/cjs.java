import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjs extends cjd implements btm {
   public static final float b = 45.836624F;
   public static final int c = aym.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajy<Byte> d = akc.a(cjs.class, aka.a);
   private static final int e = 1;
   @Nullable
   bsq ch;
   @Nullable
   private ir ci;
   private boolean cj;
   private int ck;

   public cjs(bsb<? extends cjs> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new cjs.c(this);
      this.bW = 3;
   }

   @Override
   public boolean aZ() {
      return this.am % c == 0;
   }

   @Override
   public void a(bst $$0, ewu $$1) {
      super.a($$0, $$1);
      this.aW();
   }

   @Override
   public void l() {
      this.ah = true;
      super.l();
      this.ah = false;
      this.f(true);
      if (this.cj && --this.ck <= 0) {
         this.ck = 20;
         this.a(this.dX().j(), 1.0F);
      }
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(4, new cjs.a());
      this.cb.a(8, new cjs.d());
      this.cb.a(9, new bzt(this, cly.class, 3.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
      this.cc.a(1, new cbd(this, cnn.class).a());
      this.cc.a(2, new cjs.b(this));
      this.cc.a(3, new cbe<>(this, cly.class, true));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 14.0).a(btv.c, 4.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.ci = new ir($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(brv $$0) {
      super.w($$0);
      if ($$0 instanceof cjs $$1) {
         this.ch = $$1.x();
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.ci != null) {
         $$0.a("BoundX", this.ci.u());
         $$0.a("BoundY", this.ci.v());
         $$0.a("BoundZ", this.ci.w());
      }

      if (this.cj) {
         $$0.a("LifeTicks", this.ck);
      }
   }

   @Nullable
   public bsq x() {
      return this.ch;
   }

   @Nullable
   public ir gy() {
      return this.ci;
   }

   public void e(@Nullable ir $$0) {
      this.ci = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.as.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.as.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.as.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gz() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bsq $$0) {
      this.ch = $$0;
   }

   public void b(int $$0) {
      this.cj = true;
      this.ck = $$0;
   }

   @Override
   protected avn u() {
      return avo.Bi;
   }

   @Override
   protected avn n_() {
      return avo.Bk;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Bl;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      this.a(bsc.a, new cuh(cuk.qt));
      this.a(bsc.a, 0.0F);
   }

   class a extends bzl {
      public a() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         bso $$0 = cjs.this.p();
         return $$0 != null && $$0.bI() && !cjs.this.G().b() && cjs.this.al.a(b(7)) == 0 ? cjs.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cjs.this.G().b() && cjs.this.gz() && cjs.this.p() != null && cjs.this.p().bI();
      }

      @Override
      public void c() {
         bso $$0 = cjs.this.p();
         if ($$0 != null) {
            ewu $$1 = $$0.bC();
            cjs.this.bY.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cjs.this.w(true);
         cjs.this.a(avo.Bj, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cjs.this.w(false);
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = cjs.this.p();
         if ($$0 != null) {
            if (cjs.this.cP().c($$0.cP())) {
               cjs.this.C($$0);
               cjs.this.w(false);
            } else {
               double $$1 = cjs.this.g($$0);
               if ($$1 < 9.0) {
                  ewu $$2 = $$0.bC();
                  cjs.this.bY.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cbl {
      private final cde b = cde.b().d().e();

      public b(bsw $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cjs.this.ch != null && cjs.this.ch.p() != null && this.a(cjs.this.ch.p(), this.b);
      }

      @Override
      public void c() {
         cjs.this.h(cjs.this.ch.p());
         super.c();
      }
   }

   class c extends byo {
      public c(cjs $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == byo.a.b) {
            ewu $$0 = new ewu(this.e - cjs.this.dz(), this.f - cjs.this.dB(), this.g - cjs.this.dF());
            double $$1 = $$0.f();
            if ($$1 < cjs.this.cP().a()) {
               this.k = byo.a.a;
               cjs.this.g(cjs.this.dx().a(0.5));
            } else {
               cjs.this.g(cjs.this.dx().e($$0.a(this.h * 0.05 / $$1)));
               if (cjs.this.p() == null) {
                  ewu $$2 = cjs.this.dx();
                  cjs.this.r(-((float)aym.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cjs.this.bj = cjs.this.dK();
               } else {
                  double $$3 = cjs.this.p().dz() - cjs.this.dz();
                  double $$4 = cjs.this.p().dF() - cjs.this.dF();
                  cjs.this.r(-((float)aym.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cjs.this.bj = cjs.this.dK();
               }
            }
         }
      }
   }

   class d extends bzl {
      public d() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         return !cjs.this.G().b() && cjs.this.al.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ir $$0 = cjs.this.gy();
         if ($$0 == null) {
            $$0 = cjs.this.du();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ir $$2 = $$0.b(cjs.this.al.a(15) - 7, cjs.this.al.a(11) - 5, cjs.this.al.a(15) - 7);
            if (cjs.this.dU().u($$2)) {
               cjs.this.bY.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cjs.this.p() == null) {
                  cjs.this.F().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
