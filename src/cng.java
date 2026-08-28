import java.util.EnumSet;
import javax.annotation.Nullable;

public class cng extends cms implements bwx {
   public static final float a = 45.836624F;
   public static final int b = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajx<Byte> c = akb.a(cng.class, ajz.a);
   private static final int d = 1;
   @Nullable
   bwa bF;
   @Nullable
   private ji bG;
   private boolean bH;
   private int bI;

   public cng(bvi<? extends cng> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cng.c(this);
      this.bx = 3;
   }

   @Override
   public boolean ba() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dP();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.bH && --this.bI <= 0) {
         this.bI = 20;
         this.a(this.dV().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(4, new cng.a());
      this.bC.a(8, new cng.d());
      this.bC.a(9, new cde(this, cpr.class, 3.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
      this.bD.a(1, new ceo(this, crf.class).a());
      this.bD.a(2, new cng.b(this));
      this.bD.a(3, new cep<>(this, cpr.class, true));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 14.0).a(bxg.c, 4.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bG = new ji($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bva $$0) {
      super.x($$0);
      if ($$0 instanceof cng $$1) {
         this.bF = $$1.m();
      }
   }

   @Override
   public void b(tq $$0) {
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
   public bwa m() {
      return this.bF;
   }

   @Nullable
   public ji n() {
      return this.bG;
   }

   public void i(@Nullable ji $$0) {
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

   public void a(bwa $$0) {
      this.bF = $$0;
   }

   public void b(int $$0) {
      this.bH = true;
      this.bI = $$0;
   }

   @Override
   protected avz u() {
      return awa.BM;
   }

   @Override
   protected avz l_() {
      return awa.BO;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.BP;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      this.a(bvj.a, new cxh(cxl.pI));
      this.a(bvj.a, 0.0F);
   }

   class a extends ccw {
      public a() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         bvy $$0 = cng.this.f();
         return $$0 != null && $$0.bJ() && !cng.this.L().b() && cng.this.ae.a(b(7)) == 0 ? cng.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cng.this.L().b() && cng.this.t() && cng.this.f() != null && cng.this.f().bJ();
      }

      @Override
      public void d() {
         bvy $$0 = cng.this.f();
         if ($$0 != null) {
            fbx $$1 = $$0.bD();
            cng.this.bz.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cng.this.w(true);
         cng.this.a(awa.BN, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cng.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bvy $$0 = cng.this.f();
         if ($$0 != null) {
            if (cng.this.cQ().c($$0.cQ())) {
               cng.this.c(a(cng.this.dU()), $$0);
               cng.this.w(false);
            } else {
               double $$1 = cng.this.g($$0);
               if ($$1 < 9.0) {
                  fbx $$2 = $$0.bD();
                  cng.this.bz.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cew {
      private final cgp b = cgp.b().d().e();

      public b(final bwg $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cng.this.bF != null && cng.this.bF.f() != null && this.a(cng.this.bF.f(), this.b);
      }

      @Override
      public void d() {
         cng.this.h(cng.this.bF.f());
         super.d();
      }
   }

   class c extends cbz {
      public c(final cng $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbz.a.b) {
            fbx $$0 = new fbx(this.e - cng.this.dz(), this.f - cng.this.dB(), this.g - cng.this.dF());
            double $$1 = $$0.g();
            if ($$1 < cng.this.cQ().a()) {
               this.k = cbz.a.a;
               cng.this.i(cng.this.dx().c(0.5));
            } else {
               cng.this.i(cng.this.dx().e($$0.c(this.h * 0.05 / $$1)));
               if (cng.this.f() == null) {
                  fbx $$2 = cng.this.dx();
                  cng.this.w(-((float)ayz.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cng.this.aV = cng.this.dK();
               } else {
                  double $$3 = cng.this.f().dz() - cng.this.dz();
                  double $$4 = cng.this.f().dF() - cng.this.dF();
                  cng.this.w(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cng.this.aV = cng.this.dK();
               }
            }
         }
      }
   }

   class d extends ccw {
      public d() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         return !cng.this.L().b() && cng.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         ji $$0 = cng.this.n();
         if ($$0 == null) {
            $$0 = cng.this.du();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ji $$2 = $$0.b(cng.this.ae.a(15) - 7, cng.this.ae.a(11) - 5, cng.this.ae.a(15) - 7);
            if (cng.this.dU().u($$2)) {
               cng.this.bz.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cng.this.f() == null) {
                  cng.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
