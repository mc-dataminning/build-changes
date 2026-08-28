import java.util.EnumSet;
import javax.annotation.Nullable;

public class cng extends cms implements bxa {
   public static final float a = 45.836624F;
   public static final int b = bae.f((float) (Math.PI * 5.0 / 4.0));
   protected static final alc<Byte> c = alg.a(cng.class, ale.a);
   private static final int d = 1;
   @Nullable
   bwd bZ;
   @Nullable
   private jh ca;
   private boolean cb;
   private int cc;

   public cng(bvm<? extends cng> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cng.c(this);
      this.bO = 3;
   }

   @Override
   public boolean ba() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dQ();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.cb && --this.cc <= 0) {
         this.cc = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(4, new cng.a());
      this.bT.a(8, new cng.d());
      this.bT.a(9, new cdh(this, cps.class, 3.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
      this.bU.a(1, new cer(this, crg.class).a());
      this.bU.a(2, new cng.b(this));
      this.bU.a(3, new ces<>(this, cps.class, true));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 14.0).a(bxj.c, 4.0);
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
   public void x(bvf $$0) {
      super.x($$0);
      if ($$0 instanceof cng $$1) {
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
   public bwd t() {
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

   public boolean gm() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bwd $$0) {
      this.bZ = $$0;
   }

   public void b(int $$0) {
      this.cb = true;
      this.cc = $$0;
   }

   @Override
   protected axe u() {
      return axf.Bm;
   }

   @Override
   protected axe o_() {
      return axf.Bo;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Bp;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      this.a(bvn.a, new cxk(cxo.px));
      this.a(bvn.a, 0.0F);
   }

   class a extends ccz {
      public a() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         bwb $$0 = cng.this.O_();
         return $$0 != null && $$0.bL() && !cng.this.I().b() && cng.this.ae.a(b(7)) == 0 ? cng.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cng.this.I().b() && cng.this.gm() && cng.this.O_() != null && cng.this.O_().bL();
      }

      @Override
      public void d() {
         bwb $$0 = cng.this.O_();
         if ($$0 != null) {
            fbs $$1 = $$0.bF();
            cng.this.bQ.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cng.this.x(true);
         cng.this.a(axf.Bn, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cng.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bwb $$0 = cng.this.O_();
         if ($$0 != null) {
            if (cng.this.cR().c($$0.cR())) {
               cng.this.c(a(cng.this.dV()), $$0);
               cng.this.x(false);
            } else {
               double $$1 = cng.this.g($$0);
               if ($$1 < 9.0) {
                  fbs $$2 = $$0.bF();
                  cng.this.bQ.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cez {
      private final cgs b = cgs.b().d().e();

      public b(final bwj $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cng.this.bZ != null && cng.this.bZ.O_() != null && this.a(cng.this.bZ.O_(), this.b);
      }

      @Override
      public void d() {
         cng.this.h(cng.this.bZ.O_());
         super.d();
      }
   }

   class c extends ccc {
      public c(final cng $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == ccc.a.b) {
            fbs $$0 = new fbs(this.e - cng.this.dA(), this.f - cng.this.dC(), this.g - cng.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cng.this.cR().a()) {
               this.k = ccc.a.a;
               cng.this.h(cng.this.dy().c(0.5));
            } else {
               cng.this.h(cng.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cng.this.O_() == null) {
                  fbs $$2 = cng.this.dy();
                  cng.this.v(-((float)bae.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cng.this.aX = cng.this.dL();
               } else {
                  double $$3 = cng.this.O_().dA() - cng.this.dA();
                  double $$4 = cng.this.O_().dG() - cng.this.dG();
                  cng.this.v(-((float)bae.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cng.this.aX = cng.this.dL();
               }
            }
         }
      }
   }

   class d extends ccz {
      public d() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         return !cng.this.I().b() && cng.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cng.this.x();
         if ($$0 == null) {
            $$0 = cng.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cng.this.ae.a(15) - 7, cng.this.ae.a(11) - 5, cng.this.ae.a(15) - 7);
            if (cng.this.dV().u($$2)) {
               cng.this.bQ.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cng.this.O_() == null) {
                  cng.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
