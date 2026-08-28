import java.util.EnumSet;
import javax.annotation.Nullable;

public class cml extends clx implements bwf {
   public static final float a = 45.836624F;
   public static final int b = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajx<Byte> c = akb.a(cml.class, ajz.a);
   private static final int d = 1;
   @Nullable
   bvi bY;
   @Nullable
   private ji bZ;
   private boolean ca;
   private int cb;

   public cml(bur<? extends cml> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cml.c(this);
      this.bN = 3;
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
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dX().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cby(this));
      this.bS.a(4, new cml.a());
      this.bS.a(8, new cml.d());
      this.bS.a(9, new ccm(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
      this.bT.a(1, new cdw(this, cql.class).a());
      this.bT.a(2, new cml.b(this));
      this.bT.a(3, new cdx<>(this, cox.class, true));
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.s, 14.0).a(bwo.c, 4.0);
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
         this.bZ = new ji($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(buk $$0) {
      super.x($$0);
      if ($$0 instanceof cml $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bZ != null) {
         $$0.a("BoundX", this.bZ.u());
         $$0.a("BoundY", this.bZ.v());
         $$0.a("BoundZ", this.bZ.w());
      }

      if (this.ca) {
         $$0.a("LifeTicks", this.cb);
      }
   }

   @Nullable
   public bvi t() {
      return this.bY;
   }

   @Nullable
   public ji x() {
      return this.bZ;
   }

   public void h(@Nullable ji $$0) {
      this.bZ = $$0;
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

   public boolean gp() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bvi $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avz u() {
      return awa.BD;
   }

   @Override
   protected avz o_() {
      return awa.BF;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.BG;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwp(cwt.pG));
      this.a(bus.a, 0.0F);
   }

   class a extends cce {
      public a() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         bvg $$0 = cml.this.O_();
         return $$0 != null && $$0.bL() && !cml.this.I().b() && cml.this.ae.a(b(7)) == 0 ? cml.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cml.this.I().b() && cml.this.gp() && cml.this.O_() != null && cml.this.O_().bL();
      }

      @Override
      public void d() {
         bvg $$0 = cml.this.O_();
         if ($$0 != null) {
            fba $$1 = $$0.bF();
            cml.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cml.this.x(true);
         cml.this.a(awa.BE, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cml.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvg $$0 = cml.this.O_();
         if ($$0 != null) {
            if (cml.this.cR().c($$0.cR())) {
               cml.this.c(a(cml.this.dW()), $$0);
               cml.this.x(false);
            } else {
               double $$1 = cml.this.g($$0);
               if ($$1 < 9.0) {
                  fba $$2 = $$0.bF();
                  cml.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cee {
      private final cfx b = cfx.b().d().e();

      public b(final bvo $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cml.this.bY != null && cml.this.bY.O_() != null && this.a(cml.this.bY.O_(), this.b);
      }

      @Override
      public void d() {
         cml.this.h(cml.this.bY.O_());
         super.d();
      }
   }

   class c extends cbh {
      public c(final cml $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbh.a.b) {
            fba $$0 = new fba(this.e - cml.this.dB(), this.f - cml.this.dD(), this.g - cml.this.dH());
            double $$1 = $$0.g();
            if ($$1 < cml.this.cR().a()) {
               this.k = cbh.a.a;
               cml.this.h(cml.this.dz().c(0.5));
            } else {
               cml.this.h(cml.this.dz().e($$0.c(this.h * 0.05 / $$1)));
               if (cml.this.O_() == null) {
                  fba $$2 = cml.this.dz();
                  cml.this.v(-((float)ayz.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cml.this.aX = cml.this.dM();
               } else {
                  double $$3 = cml.this.O_().dB() - cml.this.dB();
                  double $$4 = cml.this.O_().dH() - cml.this.dH();
                  cml.this.v(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cml.this.aX = cml.this.dM();
               }
            }
         }
      }
   }

   class d extends cce {
      public d() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         return !cml.this.I().b() && cml.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         ji $$0 = cml.this.x();
         if ($$0 == null) {
            $$0 = cml.this.dw();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ji $$2 = $$0.b(cml.this.ae.a(15) - 7, cml.this.ae.a(11) - 5, cml.this.ae.a(15) - 7);
            if (cml.this.dW().u($$2)) {
               cml.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cml.this.O_() == null) {
                  cml.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
