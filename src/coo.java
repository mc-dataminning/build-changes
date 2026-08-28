import java.util.EnumSet;
import javax.annotation.Nullable;

public class coo extends cnz implements bya {
   public static final float a = 45.836624F;
   public static final int b = azm.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> c = akn.a(coo.class, akl.a);
   private static final int d = 1;
   @Nullable
   bxe bF;
   @Nullable
   private iu bG;
   private boolean bH;
   private int bI;

   public coo(bwm<? extends coo> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new coo.c(this);
      this.bx = 3;
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
      if (this.bH && --this.bI <= 0) {
         this.bI = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(4, new coo.a());
      this.bC.a(8, new coo.d());
      this.bC.a(9, new ceg(this, cqy.class, 3.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 8.0F));
      this.bD.a(1, new cfq(this, cso.class).a());
      this.bD.a(2, new coo.b(this));
      this.bD.a(3, new cfr<>(this, cqy.class, true));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.s, 14.0).a(byi.c, 4.0);
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
         this.bG = new iu($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bwd $$0) {
      super.x($$0);
      if ($$0 instanceof coo $$1) {
         this.bF = $$1.m();
      }
   }

   @Override
   public void b(tz $$0) {
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
   public bxe m() {
      return this.bF;
   }

   @Nullable
   public iu n() {
      return this.bG;
   }

   public void h(@Nullable iu $$0) {
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

   public void a(bxe $$0) {
      this.bF = $$0;
   }

   public void b(int $$0) {
      this.bH = true;
      this.bI = $$0;
   }

   @Override
   protected awm u() {
      return awn.BP;
   }

   @Override
   protected awm l_() {
      return awn.BR;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.BS;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      this.a(bwn.a, new cyy(czc.pM));
      this.a(bwn.a, 0.0F);
   }

   class a extends cdy {
      public a() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         bxc $$0 = coo.this.f();
         return $$0 != null && $$0.bK() && !coo.this.L().b() && coo.this.ae.a(b(7)) == 0 ? coo.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return coo.this.L().b() && coo.this.t() && coo.this.f() != null && coo.this.f().bK();
      }

      @Override
      public void d() {
         bxc $$0 = coo.this.f();
         if ($$0 != null) {
            fei $$1 = $$0.bE();
            coo.this.bz.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         coo.this.w(true);
         coo.this.a(awn.BQ, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         coo.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bxc $$0 = coo.this.f();
         if ($$0 != null) {
            if (coo.this.cR().c($$0.cR())) {
               coo.this.c(a(coo.this.dV()), $$0);
               coo.this.w(false);
            } else {
               double $$1 = coo.this.g($$0);
               if ($$1 < 9.0) {
                  fei $$2 = $$0.bE();
                  coo.this.bz.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cfy {
      private final chr b = chr.b().d().e();

      public b(final bxk $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return coo.this.bF != null && coo.this.bF.f() != null && this.a(coo.this.bF.f(), this.b);
      }

      @Override
      public void d() {
         coo.this.g(coo.this.bF.f());
         super.d();
      }
   }

   class c extends cdb {
      public c(final coo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdb.a.b) {
            fei $$0 = new fei(this.e - coo.this.dA(), this.f - coo.this.dC(), this.g - coo.this.dG());
            double $$1 = $$0.g();
            if ($$1 < coo.this.cR().a()) {
               this.k = cdb.a.a;
               coo.this.i(coo.this.dy().c(0.5));
            } else {
               coo.this.i(coo.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (coo.this.f() == null) {
                  fei $$2 = coo.this.dy();
                  coo.this.w(-((float)azm.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  coo.this.aV = coo.this.dL();
               } else {
                  double $$3 = coo.this.f().dA() - coo.this.dA();
                  double $$4 = coo.this.f().dG() - coo.this.dG();
                  coo.this.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  coo.this.aV = coo.this.dL();
               }
            }
         }
      }
   }

   class d extends cdy {
      public d() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         return !coo.this.L().b() && coo.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iu $$0 = coo.this.n();
         if ($$0 == null) {
            $$0 = coo.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iu $$2 = $$0.b(coo.this.ae.a(15) - 7, coo.this.ae.a(11) - 5, coo.this.ae.a(15) - 7);
            if (coo.this.dV().v($$2)) {
               coo.this.bz.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (coo.this.f() == null) {
                  coo.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
