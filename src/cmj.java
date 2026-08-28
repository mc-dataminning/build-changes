import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmj extends clv implements bwd {
   public static final float b = 45.836624F;
   public static final int c = azn.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ako<Byte> d = aks.a(cmj.class, akq.a);
   private static final int e = 1;
   @Nullable
   bvg bY;
   @Nullable
   private jh bZ;
   private boolean ca;
   private int cb;

   public cmj(bup<? extends cmj> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cmj.c(this);
      this.bN = 3;
   }

   @Override
   public boolean bc() {
      return this.ag % c == 0;
   }

   @Override
   protected boolean aN() {
      return !this.dT();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dZ().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(4, new cmj.a());
      this.bS.a(8, new cmj.d());
      this.bS.a(9, new cck(this, cor.class, 3.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
      this.bT.a(1, new cdu(this, cqf.class).a());
      this.bT.a(2, new cmj.b(this));
      this.bT.a(3, new cdv<>(this, cor.class, true));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 14.0).a(bwm.c, 4.0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new jh($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bui $$0) {
      super.x($$0);
      if ($$0 instanceof cmj $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(un $$0) {
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
   public bvg t() {
      return this.bY;
   }

   @Nullable
   public jh y() {
      return this.bZ;
   }

   public void h(@Nullable jh $$0) {
      this.bZ = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.am.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.am.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gv() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bvg $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected awn w() {
      return awo.AS;
   }

   @Override
   protected awn o_() {
      return awo.AU;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.AV;
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      this.a(buq.a, new cwf(cwj.pc));
      this.a(buq.a, 0.0F);
   }

   class a extends ccc {
      public a() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         bve $$0 = cmj.this.m();
         return $$0 != null && $$0.bN() && !cmj.this.M().b() && cmj.this.af.a(b(7)) == 0 ? cmj.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cmj.this.M().b() && cmj.this.gv() && cmj.this.m() != null && cmj.this.m().bN();
      }

      @Override
      public void d() {
         bve $$0 = cmj.this.m();
         if ($$0 != null) {
            ezr $$1 = $$0.bH();
            cmj.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cmj.this.x(true);
         cmj.this.a(awo.AT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cmj.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bve $$0 = cmj.this.m();
         if ($$0 != null) {
            if (cmj.this.cT().c($$0.cT())) {
               cmj.this.E($$0);
               cmj.this.x(false);
            } else {
               double $$1 = cmj.this.g($$0);
               if ($$1 < 9.0) {
                  ezr $$2 = $$0.bH();
                  cmj.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cec {
      private final cfv b = cfv.b().d().e();

      public b(final bvm $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cmj.this.bY != null && cmj.this.bY.m() != null && this.a(cmj.this.bY.m(), this.b);
      }

      @Override
      public void d() {
         cmj.this.h(cmj.this.bY.m());
         super.d();
      }
   }

   class c extends cbf {
      public c(final cmj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbf.a.b) {
            ezr $$0 = new ezr(this.e - cmj.this.dD(), this.f - cmj.this.dF(), this.g - cmj.this.dJ());
            double $$1 = $$0.g();
            if ($$1 < cmj.this.cT().a()) {
               this.k = cbf.a.a;
               cmj.this.h(cmj.this.dB().c(0.5));
            } else {
               cmj.this.h(cmj.this.dB().e($$0.c(this.h * 0.05 / $$1)));
               if (cmj.this.m() == null) {
                  ezr $$2 = cmj.this.dB();
                  cmj.this.v(-((float)azn.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cmj.this.aX = cmj.this.dO();
               } else {
                  double $$3 = cmj.this.m().dD() - cmj.this.dD();
                  double $$4 = cmj.this.m().dJ() - cmj.this.dJ();
                  cmj.this.v(-((float)azn.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cmj.this.aX = cmj.this.dO();
               }
            }
         }
      }
   }

   class d extends ccc {
      public d() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         return !cmj.this.M().b() && cmj.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cmj.this.y();
         if ($$0 == null) {
            $$0 = cmj.this.dy();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cmj.this.af.a(15) - 7, cmj.this.af.a(11) - 5, cmj.this.af.a(15) - 7);
            if (cmj.this.dY().u($$2)) {
               cmj.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cmj.this.m() == null) {
                  cmj.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
