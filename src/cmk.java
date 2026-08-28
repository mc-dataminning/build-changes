import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmk extends clw implements bwe {
   public static final float a = 45.836624F;
   public static final int b = ayy.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajx<Byte> c = akb.a(cmk.class, ajz.a);
   private static final int d = 1;
   @Nullable
   bvh bY;
   @Nullable
   private ji bZ;
   private boolean ca;
   private int cb;

   public cmk(buq<? extends cmk> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cmk.c(this);
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
      this.bS.a(0, new cbx(this));
      this.bS.a(4, new cmk.a());
      this.bS.a(8, new cmk.d());
      this.bS.a(9, new ccl(this, cov.class, 3.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
      this.bT.a(1, new cdv(this, cqj.class).a());
      this.bT.a(2, new cmk.b(this));
      this.bT.a(3, new cdw<>(this, cov.class, true));
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 14.0).a(bwn.c, 4.0);
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
   public void x(buj $$0) {
      super.x($$0);
      if ($$0 instanceof cmk $$1) {
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
   public bvh t() {
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

   public void a(bvh $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avy u() {
      return avz.BC;
   }

   @Override
   protected avy o_() {
      return avz.BE;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.BF;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      this.a(bur.a, new cwn(cwr.pG));
      this.a(bur.a, 0.0F);
   }

   class a extends ccd {
      public a() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         bvf $$0 = cmk.this.O_();
         return $$0 != null && $$0.bL() && !cmk.this.I().b() && cmk.this.ae.a(b(7)) == 0 ? cmk.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cmk.this.I().b() && cmk.this.gp() && cmk.this.O_() != null && cmk.this.O_().bL();
      }

      @Override
      public void d() {
         bvf $$0 = cmk.this.O_();
         if ($$0 != null) {
            fay $$1 = $$0.bF();
            cmk.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cmk.this.x(true);
         cmk.this.a(avz.BD, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cmk.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvf $$0 = cmk.this.O_();
         if ($$0 != null) {
            if (cmk.this.cR().c($$0.cR())) {
               cmk.this.c(a(cmk.this.dW()), $$0);
               cmk.this.x(false);
            } else {
               double $$1 = cmk.this.g($$0);
               if ($$1 < 9.0) {
                  fay $$2 = $$0.bF();
                  cmk.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends ced {
      private final cfw b = cfw.b().d().e();

      public b(final bvn $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cmk.this.bY != null && cmk.this.bY.O_() != null && this.a(cmk.this.bY.O_(), this.b);
      }

      @Override
      public void d() {
         cmk.this.h(cmk.this.bY.O_());
         super.d();
      }
   }

   class c extends cbg {
      public c(final cmk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbg.a.b) {
            fay $$0 = new fay(this.e - cmk.this.dB(), this.f - cmk.this.dD(), this.g - cmk.this.dH());
            double $$1 = $$0.g();
            if ($$1 < cmk.this.cR().a()) {
               this.k = cbg.a.a;
               cmk.this.h(cmk.this.dz().c(0.5));
            } else {
               cmk.this.h(cmk.this.dz().e($$0.c(this.h * 0.05 / $$1)));
               if (cmk.this.O_() == null) {
                  fay $$2 = cmk.this.dz();
                  cmk.this.v(-((float)ayy.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cmk.this.aX = cmk.this.dM();
               } else {
                  double $$3 = cmk.this.O_().dB() - cmk.this.dB();
                  double $$4 = cmk.this.O_().dH() - cmk.this.dH();
                  cmk.this.v(-((float)ayy.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cmk.this.aX = cmk.this.dM();
               }
            }
         }
      }
   }

   class d extends ccd {
      public d() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         return !cmk.this.I().b() && cmk.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         ji $$0 = cmk.this.x();
         if ($$0 == null) {
            $$0 = cmk.this.dw();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ji $$2 = $$0.b(cmk.this.ae.a(15) - 7, cmk.this.ae.a(11) - 5, cmk.this.ae.a(15) - 7);
            if (cmk.this.dW().u($$2)) {
               cmk.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cmk.this.O_() == null) {
                  cmk.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
