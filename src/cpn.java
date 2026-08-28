import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpn extends coz implements bys {
   public static final float a = 45.836624F;
   public static final int b = azo.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akl<Byte> c = akp.a(cpn.class, akn.a);
   private static final int d = 1;
   @Nullable
   bxw e;
   @Nullable
   private iv f;
   private boolean bI;
   private int bJ;

   public cpn(bxc<? extends cpn> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cpn.c(this);
      this.bA = 3;
   }

   @Override
   public boolean aZ() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aK() {
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
      this.bF.a(0, new cek(this));
      this.bF.a(4, new cpn.a());
      this.bF.a(8, new cpn.d());
      this.bF.a(9, new cey(this, crx.class, 3.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
      this.bG.a(1, new cgi(this, cto.class).a());
      this.bG.a(2, new cpn.b(this));
      this.bG.a(3, new cgj<>(this, crx.class, true));
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 14.0).a(bza.c, 4.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.f = $$0.<iv>a("bound_pos", iv.a).orElse(null);
      $$0.e("life_ticks").ifPresentOrElse(this::b, () -> this.bI = false);
   }

   @Override
   public void x(bwt $$0) {
      super.x($$0);
      if ($$0 instanceof cpn $$1) {
         this.e = $$1.m();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("bound_pos", iv.a, this.f);
      if (this.bI) {
         $$0.a("life_ticks", this.bJ);
      }
   }

   @Nullable
   public bxw m() {
      return this.e;
   }

   @Nullable
   public iv n() {
      return this.f;
   }

   public void h(@Nullable iv $$0) {
      this.f = $$0;
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

   public void a(bxw $$0) {
      this.e = $$0;
   }

   public void b(int $$0) {
      this.bI = true;
      this.bJ = $$0;
   }

   @Override
   protected awo u() {
      return awp.BS;
   }

   @Override
   protected awo l_() {
      return awp.BU;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.BV;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      this.a(bxd.a, new czy(dac.pP));
      this.a(bxd.a, 0.0F);
   }

   class a extends ceq {
      public a() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         bxu $$0 = cpn.this.f();
         return $$0 != null && $$0.bJ() && !cpn.this.L().b() && cpn.this.ae.a(b(7)) == 0 ? cpn.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cpn.this.L().b() && cpn.this.t() && cpn.this.f() != null && cpn.this.f().bJ();
      }

      @Override
      public void d() {
         bxu $$0 = cpn.this.f();
         if ($$0 != null) {
            ffq $$1 = $$0.bD();
            cpn.this.bC.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cpn.this.w(true);
         cpn.this.a(awp.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cpn.this.w(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bxu $$0 = cpn.this.f();
         if ($$0 != null) {
            if (cpn.this.cR().c($$0.cR())) {
               cpn.this.c(a(cpn.this.dV()), $$0);
               cpn.this.w(false);
            } else {
               double $$1 = cpn.this.g($$0);
               if ($$1 < 9.0) {
                  ffq $$2 = $$0.bD();
                  cpn.this.bC.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cgq {
      private final cij b = cij.b().d().e();

      public b(final byc $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cpn.this.e != null && cpn.this.e.f() != null && this.a(cpn.this.e.f(), this.b);
      }

      @Override
      public void d() {
         cpn.this.g(cpn.this.e.f());
         super.d();
      }
   }

   class c extends cdt {
      public c(final cpn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdt.a.b) {
            ffq $$0 = new ffq(this.e - cpn.this.dA(), this.f - cpn.this.dC(), this.g - cpn.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cpn.this.cR().a()) {
               this.k = cdt.a.a;
               cpn.this.i(cpn.this.dy().c(0.5));
            } else {
               cpn.this.i(cpn.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cpn.this.f() == null) {
                  ffq $$2 = cpn.this.dy();
                  cpn.this.w(-((float)azo.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cpn.this.aV = cpn.this.dL();
               } else {
                  double $$3 = cpn.this.f().dA() - cpn.this.dA();
                  double $$4 = cpn.this.f().dG() - cpn.this.dG();
                  cpn.this.w(-((float)azo.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cpn.this.aV = cpn.this.dL();
               }
            }
         }
      }
   }

   class d extends ceq {
      public d() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         return !cpn.this.L().b() && cpn.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iv $$0 = cpn.this.n();
         if ($$0 == null) {
            $$0 = cpn.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iv $$2 = $$0.b(cpn.this.ae.a(15) - 7, cpn.this.ae.a(11) - 5, cpn.this.ae.a(15) - 7);
            if (cpn.this.dV().v($$2)) {
               cpn.this.bC.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cpn.this.f() == null) {
                  cpn.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
