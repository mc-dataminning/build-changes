import java.util.EnumSet;
import javax.annotation.Nullable;

public class coz extends cok implements byh {
   public static final float a = 45.836624F;
   public static final int b = azm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> c = akn.a(coz.class, akl.a);
   private static final int d = 1;
   @Nullable
   bxl bG;
   @Nullable
   private iv bH;
   private boolean bI;
   private int bJ;

   public coz(bwr<? extends coz> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new coz.c(this);
      this.by = 3;
   }

   @Override
   public boolean aY() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aJ() {
      return !this.dP();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.bI && --this.bJ <= 0) {
         this.bJ = 20;
         this.a(this.dV().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(4, new coz.a());
      this.bD.a(8, new coz.d());
      this.bD.a(9, new cen(this, crj.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(1, new cfx(this, cta.class).a());
      this.bE.a(2, new coz.b(this));
      this.bE.a(3, new cfy<>(this, crj.class, true));
   }

   public static byo.a j() {
      return cok.gw().a(byp.s, 14.0).a(byp.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bH = $$0.<iv>a("bound_pos", iv.a).orElse(null);
      if ($$0.c("life_ticks")) {
         this.b($$0.f("life_ticks"));
      }
   }

   @Override
   public void x(bwi $$0) {
      super.x($$0);
      if ($$0 instanceof coz $$1) {
         this.bG = $$1.m();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("bound_pos", iv.a, this.bH);
      if (this.bI) {
         $$0.a("life_ticks", this.bJ);
      }
   }

   @Nullable
   public bxl m() {
      return this.bG;
   }

   @Nullable
   public iv n() {
      return this.bH;
   }

   public void h(@Nullable iv $$0) {
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

   public void a(bxl $$0) {
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
   protected awm e(bux $$0) {
      return awn.BV;
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czk(czo.pP));
      this.a(bws.a, 0.0F);
   }

   class a extends cef {
      public a() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         bxj $$0 = coz.this.f();
         return $$0 != null && $$0.bI() && !coz.this.L().b() && coz.this.ae.a(b(7)) == 0 ? coz.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return coz.this.L().b() && coz.this.t() && coz.this.f() != null && coz.this.f().bI();
      }

      @Override
      public void d() {
         bxj $$0 = coz.this.f();
         if ($$0 != null) {
            fex $$1 = $$0.bC();
            coz.this.bA.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         coz.this.w(true);
         coz.this.a(awn.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         coz.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxj $$0 = coz.this.f();
         if ($$0 != null) {
            if (coz.this.cQ().c($$0.cQ())) {
               coz.this.c(a(coz.this.dU()), $$0);
               coz.this.w(false);
            } else {
               double $$1 = coz.this.g($$0);
               if ($$1 < 9.0) {
                  fex $$2 = $$0.bC();
                  coz.this.bA.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cgf {
      private final chy b = chy.b().d().e();

      public b(final bxr $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return coz.this.bG != null && coz.this.bG.f() != null && this.a(coz.this.bG.f(), this.b);
      }

      @Override
      public void d() {
         coz.this.g(coz.this.bG.f());
         super.d();
      }
   }

   class c extends cdi {
      public c(final coz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdi.a.b) {
            fex $$0 = new fex(this.e - coz.this.dz(), this.f - coz.this.dB(), this.g - coz.this.dF());
            double $$1 = $$0.g();
            if ($$1 < coz.this.cQ().a()) {
               this.k = cdi.a.a;
               coz.this.i(coz.this.dx().c(0.5));
            } else {
               coz.this.i(coz.this.dx().e($$0.c(this.h * 0.05 / $$1)));
               if (coz.this.f() == null) {
                  fex $$2 = coz.this.dx();
                  coz.this.w(-((float)azm.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  coz.this.aV = coz.this.dK();
               } else {
                  double $$3 = coz.this.f().dz() - coz.this.dz();
                  double $$4 = coz.this.f().dF() - coz.this.dF();
                  coz.this.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  coz.this.aV = coz.this.dK();
               }
            }
         }
      }
   }

   class d extends cef {
      public d() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         return !coz.this.L().b() && coz.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iv $$0 = coz.this.n();
         if ($$0 == null) {
            $$0 = coz.this.du();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iv $$2 = $$0.b(coz.this.ae.a(15) - 7, coz.this.ae.a(11) - 5, coz.this.ae.a(15) - 7);
            if (coz.this.dU().v($$2)) {
               coz.this.bA.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (coz.this.f() == null) {
                  coz.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
