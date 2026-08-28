import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmm extends cly implements bwg {
   public static final float a = 45.836624F;
   public static final int b = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajy<Byte> c = akc.a(cmm.class, aka.a);
   private static final int d = 1;
   @Nullable
   bvj bY;
   @Nullable
   private ji bZ;
   private boolean ca;
   private int cb;

   public cmm(bus<? extends cmm> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cmm.c(this);
      this.bN = 3;
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
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cbz(this));
      this.bS.a(4, new cmm.a());
      this.bS.a(8, new cmm.d());
      this.bS.a(9, new ccn(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
      this.bT.a(1, new cdx(this, cql.class).a());
      this.bT.a(2, new cmm.b(this));
      this.bT.a(3, new cdy<>(this, cox.class, true));
   }

   public static bwo.a m() {
      return cly.gx().a(bwp.s, 14.0).a(bwp.c, 4.0);
   }

   @Override
   protected void a(akc.a $$0) {
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
   public void x(bul $$0) {
      super.x($$0);
      if ($$0 instanceof cmm $$1) {
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
   public bvj t() {
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

   public boolean gs() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bvj $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avz u() {
      return awa.BC;
   }

   @Override
   protected avz o_() {
      return awa.BE;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.BF;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      this.a(but.a, new cwp(cwt.pG));
      this.a(but.a, 0.0F);
   }

   class a extends ccf {
      public a() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         bvh $$0 = cmm.this.O_();
         return $$0 != null && $$0.bL() && !cmm.this.N().b() && cmm.this.ae.a(b(7)) == 0 ? cmm.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cmm.this.N().b() && cmm.this.gs() && cmm.this.O_() != null && cmm.this.O_().bL();
      }

      @Override
      public void d() {
         bvh $$0 = cmm.this.O_();
         if ($$0 != null) {
            fba $$1 = $$0.bF();
            cmm.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cmm.this.x(true);
         cmm.this.a(awa.BD, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cmm.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvh $$0 = cmm.this.O_();
         if ($$0 != null) {
            if (cmm.this.cR().c($$0.cR())) {
               cmm.this.c(a(cmm.this.dV()), $$0);
               cmm.this.x(false);
            } else {
               double $$1 = cmm.this.g($$0);
               if ($$1 < 9.0) {
                  fba $$2 = $$0.bF();
                  cmm.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cef {
      private final cfy b = cfy.b().d().e();

      public b(final bvp $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cmm.this.bY != null && cmm.this.bY.O_() != null && this.a(cmm.this.bY.O_(), this.b);
      }

      @Override
      public void d() {
         cmm.this.h(cmm.this.bY.O_());
         super.d();
      }
   }

   class c extends cbi {
      public c(final cmm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbi.a.b) {
            fba $$0 = new fba(this.e - cmm.this.dA(), this.f - cmm.this.dC(), this.g - cmm.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cmm.this.cR().a()) {
               this.k = cbi.a.a;
               cmm.this.i(cmm.this.dy().c(0.5));
            } else {
               cmm.this.i(cmm.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cmm.this.O_() == null) {
                  fba $$2 = cmm.this.dy();
                  cmm.this.v(-((float)ayz.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cmm.this.aX = cmm.this.dL();
               } else {
                  double $$3 = cmm.this.O_().dA() - cmm.this.dA();
                  double $$4 = cmm.this.O_().dG() - cmm.this.dG();
                  cmm.this.v(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cmm.this.aX = cmm.this.dL();
               }
            }
         }
      }
   }

   class d extends ccf {
      public d() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         return !cmm.this.N().b() && cmm.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         ji $$0 = cmm.this.x();
         if ($$0 == null) {
            $$0 = cmm.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ji $$2 = $$0.b(cmm.this.ae.a(15) - 7, cmm.this.ae.a(11) - 5, cmm.this.ae.a(15) - 7);
            if (cmm.this.dV().u($$2)) {
               cmm.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cmm.this.O_() == null) {
                  cmm.this.L().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
