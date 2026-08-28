import java.util.EnumSet;
import javax.annotation.Nullable;

public class cos extends cod implements byc {
   public static final float a = 45.836624F;
   public static final int b = azm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> c = akn.a(cos.class, akl.a);
   private static final int d = 1;
   @Nullable
   bxg bG;
   @Nullable
   private iu bH;
   private boolean bI;
   private int bJ;

   public cos(bwo<? extends cos> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cos.c(this);
      this.by = 3;
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
      if (this.bI && --this.bJ <= 0) {
         this.bJ = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(4, new cos.a());
      this.bD.a(8, new cos.d());
      this.bD.a(9, new cei(this, crc.class, 3.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
      this.bE.a(1, new cfs(this, cst.class).a());
      this.bE.a(2, new cos.b(this));
      this.bE.a(3, new cft<>(this, crc.class, true));
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 14.0).a(byk.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bH = new iu($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bwf $$0) {
      super.x($$0);
      if ($$0 instanceof cos $$1) {
         this.bG = $$1.m();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.bH != null) {
         $$0.a("BoundX", this.bH.u());
         $$0.a("BoundY", this.bH.v());
         $$0.a("BoundZ", this.bH.w());
      }

      if (this.bI) {
         $$0.a("LifeTicks", this.bJ);
      }
   }

   @Nullable
   public bxg m() {
      return this.bG;
   }

   @Nullable
   public iu n() {
      return this.bH;
   }

   public void h(@Nullable iu $$0) {
      this.bH = $$0;
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

   public void a(bxg $$0) {
      this.bG = $$0;
   }

   public void b(int $$0) {
      this.bI = true;
      this.bJ = $$0;
   }

   @Override
   protected awm u() {
      return awn.BS;
   }

   @Override
   protected awm l_() {
      return awn.BU;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.BV;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      this.a(bwp.a, new czd(czh.pP));
      this.a(bwp.a, 0.0F);
   }

   class a extends cea {
      public a() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         bxe $$0 = cos.this.f();
         return $$0 != null && $$0.bK() && !cos.this.L().b() && cos.this.ae.a(b(7)) == 0 ? cos.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cos.this.L().b() && cos.this.t() && cos.this.f() != null && cos.this.f().bK();
      }

      @Override
      public void d() {
         bxe $$0 = cos.this.f();
         if ($$0 != null) {
            feq $$1 = $$0.bE();
            cos.this.bA.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cos.this.w(true);
         cos.this.a(awn.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cos.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxe $$0 = cos.this.f();
         if ($$0 != null) {
            if (cos.this.cR().c($$0.cR())) {
               cos.this.c(a(cos.this.dV()), $$0);
               cos.this.w(false);
            } else {
               double $$1 = cos.this.g($$0);
               if ($$1 < 9.0) {
                  feq $$2 = $$0.bE();
                  cos.this.bA.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cga {
      private final cht b = cht.b().d().e();

      public b(final bxm $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cos.this.bG != null && cos.this.bG.f() != null && this.a(cos.this.bG.f(), this.b);
      }

      @Override
      public void d() {
         cos.this.g(cos.this.bG.f());
         super.d();
      }
   }

   class c extends cdd {
      public c(final cos $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdd.a.b) {
            feq $$0 = new feq(this.e - cos.this.dA(), this.f - cos.this.dC(), this.g - cos.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cos.this.cR().a()) {
               this.k = cdd.a.a;
               cos.this.i(cos.this.dy().c(0.5));
            } else {
               cos.this.i(cos.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cos.this.f() == null) {
                  feq $$2 = cos.this.dy();
                  cos.this.w(-((float)azm.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cos.this.aV = cos.this.dL();
               } else {
                  double $$3 = cos.this.f().dA() - cos.this.dA();
                  double $$4 = cos.this.f().dG() - cos.this.dG();
                  cos.this.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cos.this.aV = cos.this.dL();
               }
            }
         }
      }
   }

   class d extends cea {
      public d() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         return !cos.this.L().b() && cos.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iu $$0 = cos.this.n();
         if ($$0 == null) {
            $$0 = cos.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iu $$2 = $$0.b(cos.this.ae.a(15) - 7, cos.this.ae.a(11) - 5, cos.this.ae.a(15) - 7);
            if (cos.this.dV().v($$2)) {
               cos.this.bA.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cos.this.f() == null) {
                  cos.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
