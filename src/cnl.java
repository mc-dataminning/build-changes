import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnl extends cmx implements bxf {
   public static final float a = 45.836624F;
   public static final int b = bae.f((float) (Math.PI * 5.0 / 4.0));
   protected static final alc<Byte> c = alg.a(cnl.class, ale.a);
   private static final int d = 1;
   @Nullable
   bwi bZ;
   @Nullable
   private jh ca;
   private boolean cb;
   private int cc;

   public cnl(bvr<? extends cnl> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cnl.c(this);
      this.bO = 3;
   }

   @Override
   public boolean ba() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dR();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.cb && --this.cc <= 0) {
         this.cc = 20;
         this.a(this.dX().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(4, new cnl.a());
      this.bT.a(8, new cnl.d());
      this.bT.a(9, new cdm(this, cpx.class, 3.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
      this.bU.a(1, new cew(this, crl.class).a());
      this.bU.a(2, new cnl.b(this));
      this.bU.a(3, new cex<>(this, cpx.class, true));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 14.0).a(bxo.c, 4.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.ca = new jh($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bvk $$0) {
      super.x($$0);
      if ($$0 instanceof cnl $$1) {
         this.bZ = $$1.t();
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.ca != null) {
         $$0.a("BoundX", this.ca.u());
         $$0.a("BoundY", this.ca.v());
         $$0.a("BoundZ", this.ca.w());
      }

      if (this.cb) {
         $$0.a("LifeTicks", this.cc);
      }
   }

   @Nullable
   public bwi t() {
      return this.bZ;
   }

   @Nullable
   public jh x() {
      return this.ca;
   }

   public void h(@Nullable jh $$0) {
      this.ca = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.al.a(c);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.al.a(c);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(c, (byte)($$2 & 0xFF));
   }

   public boolean go() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bwi $$0) {
      this.bZ = $$0;
   }

   public void b(int $$0) {
      this.cb = true;
      this.cc = $$0;
   }

   @Override
   protected axe u() {
      return axf.Bn;
   }

   @Override
   protected axe o_() {
      return axf.Bp;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.Bq;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      this.a(bvs.a, new cxp(cxt.px));
      this.a(bvs.a, 0.0F);
   }

   class a extends cde {
      public a() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         bwg $$0 = cnl.this.O_();
         return $$0 != null && $$0.bL() && !cnl.this.I().b() && cnl.this.ae.a(b(7)) == 0 ? cnl.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cnl.this.I().b() && cnl.this.go() && cnl.this.O_() != null && cnl.this.O_().bL();
      }

      @Override
      public void d() {
         bwg $$0 = cnl.this.O_();
         if ($$0 != null) {
            fby $$1 = $$0.bF();
            cnl.this.bQ.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cnl.this.x(true);
         cnl.this.a(axf.Bo, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cnl.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bwg $$0 = cnl.this.O_();
         if ($$0 != null) {
            if (cnl.this.cR().c($$0.cR())) {
               cnl.this.c(a(cnl.this.dW()), $$0);
               cnl.this.x(false);
            } else {
               double $$1 = cnl.this.g($$0);
               if ($$1 < 9.0) {
                  fby $$2 = $$0.bF();
                  cnl.this.bQ.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cfe {
      private final cgx b = cgx.b().d().e();

      public b(final bwo $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cnl.this.bZ != null && cnl.this.bZ.O_() != null && this.a(cnl.this.bZ.O_(), this.b);
      }

      @Override
      public void d() {
         cnl.this.h(cnl.this.bZ.O_());
         super.d();
      }
   }

   class c extends cch {
      public c(final cnl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cch.a.b) {
            fby $$0 = new fby(this.e - cnl.this.dB(), this.f - cnl.this.dD(), this.g - cnl.this.dH());
            double $$1 = $$0.g();
            if ($$1 < cnl.this.cR().a()) {
               this.k = cch.a.a;
               cnl.this.h(cnl.this.dz().c(0.5));
            } else {
               cnl.this.h(cnl.this.dz().e($$0.c(this.h * 0.05 / $$1)));
               if (cnl.this.O_() == null) {
                  fby $$2 = cnl.this.dz();
                  cnl.this.v(-((float)bae.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cnl.this.aX = cnl.this.dM();
               } else {
                  double $$3 = cnl.this.O_().dB() - cnl.this.dB();
                  double $$4 = cnl.this.O_().dH() - cnl.this.dH();
                  cnl.this.v(-((float)bae.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cnl.this.aX = cnl.this.dM();
               }
            }
         }
      }
   }

   class d extends cde {
      public d() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         return !cnl.this.I().b() && cnl.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cnl.this.x();
         if ($$0 == null) {
            $$0 = cnl.this.dw();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cnl.this.ae.a(15) - 7, cnl.this.ae.a(11) - 5, cnl.this.ae.a(15) - 7);
            if (cnl.this.dW().u($$2)) {
               cnl.this.bQ.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cnl.this.O_() == null) {
                  cnl.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
