import java.util.EnumSet;
import javax.annotation.Nullable;

public class coh extends cnt implements bxx {
   public static final float a = 45.836624F;
   public static final int b = azk.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akh<Byte> c = akl.a(coh.class, akj.a);
   private static final int d = 1;
   @Nullable
   bxb bF;
   @Nullable
   private iu bG;
   private boolean bH;
   private int bI;

   public coh(bwj<? extends coh> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new coh.c(this);
      this.bx = 3;
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
      if (this.bH && --this.bI <= 0) {
         this.bI = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(4, new coh.a());
      this.bC.a(8, new coh.d());
      this.bC.a(9, new ced(this, cqs.class, 3.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
      this.bD.a(1, new cfn(this, csi.class).a());
      this.bD.a(2, new coh.b(this));
      this.bD.a(3, new cfo<>(this, cqs.class, true));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 14.0).a(byf.c, 4.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bG = new iu($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bwa $$0) {
      super.x($$0);
      if ($$0 instanceof coh $$1) {
         this.bF = $$1.m();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.bG != null) {
         $$0.a("BoundX", this.bG.u());
         $$0.a("BoundY", this.bG.v());
         $$0.a("BoundZ", this.bG.w());
      }

      if (this.bH) {
         $$0.a("LifeTicks", this.bI);
      }
   }

   @Nullable
   public bxb m() {
      return this.bF;
   }

   @Nullable
   public iu n() {
      return this.bG;
   }

   public void h(@Nullable iu $$0) {
      this.bG = $$0;
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

   public boolean t() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bxb $$0) {
      this.bF = $$0;
   }

   public void b(int $$0) {
      this.bH = true;
      this.bI = $$0;
   }

   @Override
   protected awk u() {
      return awl.BM;
   }

   @Override
   protected awk l_() {
      return awl.BO;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.BP;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      this.a(bwk.a, new cys(cyw.pK));
      this.a(bwk.a, 0.0F);
   }

   class a extends cdv {
      public a() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         bwz $$0 = coh.this.f();
         return $$0 != null && $$0.bK() && !coh.this.L().b() && coh.this.ae.a(b(7)) == 0 ? coh.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return coh.this.L().b() && coh.this.t() && coh.this.f() != null && coh.this.f().bK();
      }

      @Override
      public void d() {
         bwz $$0 = coh.this.f();
         if ($$0 != null) {
            fdw $$1 = $$0.bE();
            coh.this.bz.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         coh.this.w(true);
         coh.this.a(awl.BN, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         coh.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bwz $$0 = coh.this.f();
         if ($$0 != null) {
            if (coh.this.cR().c($$0.cR())) {
               coh.this.c(a(coh.this.dV()), $$0);
               coh.this.w(false);
            } else {
               double $$1 = coh.this.g($$0);
               if ($$1 < 9.0) {
                  fdw $$2 = $$0.bE();
                  coh.this.bz.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cfv {
      private final cho b = cho.b().d().e();

      public b(final bxh $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return coh.this.bF != null && coh.this.bF.f() != null && this.a(coh.this.bF.f(), this.b);
      }

      @Override
      public void d() {
         coh.this.g(coh.this.bF.f());
         super.d();
      }
   }

   class c extends ccy {
      public c(final coh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == ccy.a.b) {
            fdw $$0 = new fdw(this.e - coh.this.dA(), this.f - coh.this.dC(), this.g - coh.this.dG());
            double $$1 = $$0.g();
            if ($$1 < coh.this.cR().a()) {
               this.k = ccy.a.a;
               coh.this.i(coh.this.dy().c(0.5));
            } else {
               coh.this.i(coh.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (coh.this.f() == null) {
                  fdw $$2 = coh.this.dy();
                  coh.this.w(-((float)azk.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  coh.this.aV = coh.this.dL();
               } else {
                  double $$3 = coh.this.f().dA() - coh.this.dA();
                  double $$4 = coh.this.f().dG() - coh.this.dG();
                  coh.this.w(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  coh.this.aV = coh.this.dL();
               }
            }
         }
      }
   }

   class d extends cdv {
      public d() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         return !coh.this.L().b() && coh.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iu $$0 = coh.this.n();
         if ($$0 == null) {
            $$0 = coh.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iu $$2 = $$0.b(coh.this.ae.a(15) - 7, coh.this.ae.a(11) - 5, coh.this.ae.a(15) - 7);
            if (coh.this.dV().v($$2)) {
               coh.this.bz.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (coh.this.f() == null) {
                  coh.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
