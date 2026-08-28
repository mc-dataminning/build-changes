import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpc extends coo implements byh {
   public static final float a = 45.836624F;
   public static final int b = azm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> c = akn.a(cpc.class, akl.a);
   private static final int d = 1;
   @Nullable
   bxl bG;
   @Nullable
   private iv bH;
   private boolean bI;
   private int bJ;

   public cpc(bwr<? extends cpc> $$0, djm $$1) {
      super($$0, $$1);
      this.bA = new cpc.c(this);
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
      this.bD.a(4, new cpc.a());
      this.bD.a(8, new cpc.d());
      this.bD.a(9, new cen(this, crm.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(1, new cfx(this, ctd.class).a());
      this.bE.a(2, new cpc.b(this));
      this.bE.a(3, new cfy<>(this, crm.class, true));
   }

   public static byo.a j() {
      return coo.gw().a(byp.s, 14.0).a(byp.c, 4.0);
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
      if ($$0 instanceof cpc $$1) {
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
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czn(czr.pP));
      this.a(bws.a, 0.0F);
   }

   class a extends cef {
      public a() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         bxj $$0 = cpc.this.f();
         return $$0 != null && $$0.bI() && !cpc.this.L().b() && cpc.this.ae.a(b(7)) == 0 ? cpc.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cpc.this.L().b() && cpc.this.t() && cpc.this.f() != null && cpc.this.f().bI();
      }

      @Override
      public void d() {
         bxj $$0 = cpc.this.f();
         if ($$0 != null) {
            ffc $$1 = $$0.bC();
            cpc.this.bA.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cpc.this.w(true);
         cpc.this.a(awn.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cpc.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxj $$0 = cpc.this.f();
         if ($$0 != null) {
            if (cpc.this.cQ().c($$0.cQ())) {
               cpc.this.c(a(cpc.this.dU()), $$0);
               cpc.this.w(false);
            } else {
               double $$1 = cpc.this.g($$0);
               if ($$1 < 9.0) {
                  ffc $$2 = $$0.bC();
                  cpc.this.bA.a($$2.d, $$2.e, $$2.f, 1.0);
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
         return cpc.this.bG != null && cpc.this.bG.f() != null && this.a(cpc.this.bG.f(), this.b);
      }

      @Override
      public void d() {
         cpc.this.g(cpc.this.bG.f());
         super.d();
      }
   }

   class c extends cdi {
      public c(final cpc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdi.a.b) {
            ffc $$0 = new ffc(this.e - cpc.this.dz(), this.f - cpc.this.dB(), this.g - cpc.this.dF());
            double $$1 = $$0.g();
            if ($$1 < cpc.this.cQ().a()) {
               this.k = cdi.a.a;
               cpc.this.i(cpc.this.dx().c(0.5));
            } else {
               cpc.this.i(cpc.this.dx().e($$0.c(this.h * 0.05 / $$1)));
               if (cpc.this.f() == null) {
                  ffc $$2 = cpc.this.dx();
                  cpc.this.w(-((float)azm.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cpc.this.aV = cpc.this.dK();
               } else {
                  double $$3 = cpc.this.f().dz() - cpc.this.dz();
                  double $$4 = cpc.this.f().dF() - cpc.this.dF();
                  cpc.this.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cpc.this.aV = cpc.this.dK();
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
         return !cpc.this.L().b() && cpc.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iv $$0 = cpc.this.n();
         if ($$0 == null) {
            $$0 = cpc.this.du();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iv $$2 = $$0.b(cpc.this.ae.a(15) - 7, cpc.this.ae.a(11) - 5, cpc.this.ae.a(15) - 7);
            if (cpc.this.dU().v($$2)) {
               cpc.this.bA.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cpc.this.f() == null) {
                  cpc.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
