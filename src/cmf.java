import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmf extends clr implements bvz {
   public static final float b = 45.836624F;
   public static final int c = azk.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akl<Byte> d = akp.a(cmf.class, akn.a);
   private static final int e = 1;
   @Nullable
   bvc bY;
   @Nullable
   private jh bZ;
   private boolean ca;
   private int cb;

   public cmf(bul<? extends cmf> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cmf.c(this);
      this.bN = 3;
   }

   @Override
   public boolean bb() {
      return this.ag % c == 0;
   }

   @Override
   protected boolean aM() {
      return !this.dS();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dY().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(4, new cmf.a());
      this.bS.a(8, new cmf.d());
      this.bS.a(9, new ccg(this, com.class, 3.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
      this.bT.a(1, new cdq(this, cqb.class).a());
      this.bT.a(2, new cmf.b(this));
      this.bT.a(3, new cdr<>(this, com.class, true));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 14.0).a(bwi.c, 4.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new jh($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bue $$0) {
      super.x($$0);
      if ($$0 instanceof cmf $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(uk $$0) {
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
   public bvc t() {
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

   public boolean gu() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bvc $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected awk w() {
      return awl.AS;
   }

   @Override
   protected awk o_() {
      return awl.AU;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.AV;
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      this.a(bum.a, new cwb(cwf.pc));
      this.a(bum.a, 0.0F);
   }

   class a extends cby {
      public a() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         bva $$0 = cmf.this.m();
         return $$0 != null && $$0.bM() && !cmf.this.M().b() && cmf.this.af.a(b(7)) == 0 ? cmf.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cmf.this.M().b() && cmf.this.gu() && cmf.this.m() != null && cmf.this.m().bM();
      }

      @Override
      public void d() {
         bva $$0 = cmf.this.m();
         if ($$0 != null) {
            ezn $$1 = $$0.bG();
            cmf.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cmf.this.x(true);
         cmf.this.a(awl.AT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cmf.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bva $$0 = cmf.this.m();
         if ($$0 != null) {
            if (cmf.this.cS().c($$0.cS())) {
               cmf.this.E($$0);
               cmf.this.x(false);
            } else {
               double $$1 = cmf.this.g($$0);
               if ($$1 < 9.0) {
                  ezn $$2 = $$0.bG();
                  cmf.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cdy {
      private final cfr b = cfr.b().d().e();

      public b(final bvi $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cmf.this.bY != null && cmf.this.bY.m() != null && this.a(cmf.this.bY.m(), this.b);
      }

      @Override
      public void d() {
         cmf.this.h(cmf.this.bY.m());
         super.d();
      }
   }

   class c extends cbb {
      public c(final cmf $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbb.a.b) {
            ezn $$0 = new ezn(this.e - cmf.this.dC(), this.f - cmf.this.dE(), this.g - cmf.this.dI());
            double $$1 = $$0.g();
            if ($$1 < cmf.this.cS().a()) {
               this.k = cbb.a.a;
               cmf.this.h(cmf.this.dA().c(0.5));
            } else {
               cmf.this.h(cmf.this.dA().e($$0.c(this.h * 0.05 / $$1)));
               if (cmf.this.m() == null) {
                  ezn $$2 = cmf.this.dA();
                  cmf.this.v(-((float)azk.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cmf.this.aX = cmf.this.dN();
               } else {
                  double $$3 = cmf.this.m().dC() - cmf.this.dC();
                  double $$4 = cmf.this.m().dI() - cmf.this.dI();
                  cmf.this.v(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cmf.this.aX = cmf.this.dN();
               }
            }
         }
      }
   }

   class d extends cby {
      public d() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         return !cmf.this.M().b() && cmf.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cmf.this.y();
         if ($$0 == null) {
            $$0 = cmf.this.dx();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cmf.this.af.a(15) - 7, cmf.this.af.a(11) - 5, cmf.this.af.a(15) - 7);
            if (cmf.this.dX().u($$2)) {
               cmf.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cmf.this.m() == null) {
                  cmf.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
