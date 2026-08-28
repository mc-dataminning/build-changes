import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmn extends clz implements bwh {
   public static final float a = 45.836624F;
   public static final int b = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajy<Byte> c = akc.a(cmn.class, aka.a);
   private static final int d = 1;
   @Nullable
   bvk bY;
   @Nullable
   private ji bZ;
   private boolean ca;
   private int cb;

   public cmn(but<? extends cmn> $$0, dgj $$1) {
      super($$0, $$1);
      this.bP = new cmn.c(this);
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
      this.bS.a(0, new cca(this));
      this.bS.a(4, new cmn.a());
      this.bS.a(8, new cmn.d());
      this.bS.a(9, new cco(this, coy.class, 3.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
      this.bT.a(1, new cdy(this, cqm.class).a());
      this.bT.a(2, new cmn.b(this));
      this.bT.a(3, new cdz<>(this, coy.class, true));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 14.0).a(bwq.c, 4.0);
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
   public void x(bum $$0) {
      super.x($$0);
      if ($$0 instanceof cmn $$1) {
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
   public bvk t() {
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

   public void a(bvk $$0) {
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
   protected avz e(btc $$0) {
      return awa.BF;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      this.a(buu.a, new cwq(cwu.pG));
      this.a(buu.a, 0.0F);
   }

   class a extends ccg {
      public a() {
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         bvi $$0 = cmn.this.O_();
         return $$0 != null && $$0.bL() && !cmn.this.N().b() && cmn.this.ae.a(b(7)) == 0 ? cmn.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cmn.this.N().b() && cmn.this.gs() && cmn.this.O_() != null && cmn.this.O_().bL();
      }

      @Override
      public void d() {
         bvi $$0 = cmn.this.O_();
         if ($$0 != null) {
            fbb $$1 = $$0.bF();
            cmn.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cmn.this.x(true);
         cmn.this.a(awa.BD, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cmn.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvi $$0 = cmn.this.O_();
         if ($$0 != null) {
            if (cmn.this.cR().c($$0.cR())) {
               cmn.this.c(a(cmn.this.dV()), $$0);
               cmn.this.x(false);
            } else {
               double $$1 = cmn.this.g($$0);
               if ($$1 < 9.0) {
                  fbb $$2 = $$0.bF();
                  cmn.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends ceg {
      private final cfz b = cfz.b().d().e();

      public b(final bvq $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cmn.this.bY != null && cmn.this.bY.O_() != null && this.a(cmn.this.bY.O_(), this.b);
      }

      @Override
      public void d() {
         cmn.this.h(cmn.this.bY.O_());
         super.d();
      }
   }

   class c extends cbj {
      public c(final cmn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cbj.a.b) {
            fbb $$0 = new fbb(this.e - cmn.this.dA(), this.f - cmn.this.dC(), this.g - cmn.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cmn.this.cR().a()) {
               this.k = cbj.a.a;
               cmn.this.i(cmn.this.dy().c(0.5));
            } else {
               cmn.this.i(cmn.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cmn.this.O_() == null) {
                  fbb $$2 = cmn.this.dy();
                  cmn.this.v(-((float)ayz.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cmn.this.aX = cmn.this.dL();
               } else {
                  double $$3 = cmn.this.O_().dA() - cmn.this.dA();
                  double $$4 = cmn.this.O_().dG() - cmn.this.dG();
                  cmn.this.v(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cmn.this.aX = cmn.this.dL();
               }
            }
         }
      }
   }

   class d extends ccg {
      public d() {
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         return !cmn.this.N().b() && cmn.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         ji $$0 = cmn.this.x();
         if ($$0 == null) {
            $$0 = cmn.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ji $$2 = $$0.b(cmn.this.ae.a(15) - 7, cmn.this.ae.a(11) - 5, cmn.this.ae.a(15) - 7);
            if (cmn.this.dV().u($$2)) {
               cmn.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cmn.this.O_() == null) {
                  cmn.this.L().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
