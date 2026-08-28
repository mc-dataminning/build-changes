import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpp extends cpb implements byu {
   public static final float a = 45.836624F;
   public static final int b = azq.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akn<Byte> c = akr.a(cpp.class, akp.a);
   private static final int d = 1;
   @Nullable
   bxy e;
   @Nullable
   private iw f;
   private boolean bI;
   private int bJ;

   public cpp(bxe<? extends cpp> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cpp.c(this);
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
      this.bF.a(0, new cem(this));
      this.bF.a(4, new cpp.a());
      this.bF.a(8, new cpp.d());
      this.bF.a(9, new cfa(this, crz.class, 3.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
      this.bG.a(1, new cgk(this, ctq.class).a());
      this.bG.a(2, new cpp.b(this));
      this.bG.a(3, new cgl<>(this, crz.class, true));
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 14.0).a(bzc.c, 4.0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.f = $$0.<iw>a("bound_pos", iw.a).orElse(null);
      $$0.e("life_ticks").ifPresentOrElse(this::b, () -> this.bI = false);
   }

   @Override
   public void x(bwv $$0) {
      super.x($$0);
      if ($$0 instanceof cpp $$1) {
         this.e = $$1.m();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("bound_pos", iw.a, this.f);
      if (this.bI) {
         $$0.a("life_ticks", this.bJ);
      }
   }

   @Nullable
   public bxy m() {
      return this.e;
   }

   @Nullable
   public iw n() {
      return this.f;
   }

   public void h(@Nullable iw $$0) {
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

   public void a(bxy $$0) {
      this.e = $$0;
   }

   public void b(int $$0) {
      this.bI = true;
      this.bJ = $$0;
   }

   @Override
   protected awq u() {
      return awr.BS;
   }

   @Override
   protected awq l_() {
      return awr.BU;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.BV;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      this.a(bxf.a, new daa(dae.pP));
      this.a(bxf.a, 0.0F);
   }

   class a extends ces {
      public a() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         bxw $$0 = cpp.this.f();
         return $$0 != null && $$0.bJ() && !cpp.this.L().b() && cpp.this.ae.a(b(7)) == 0 ? cpp.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cpp.this.L().b() && cpp.this.t() && cpp.this.f() != null && cpp.this.f().bJ();
      }

      @Override
      public void d() {
         bxw $$0 = cpp.this.f();
         if ($$0 != null) {
            ffs $$1 = $$0.bD();
            cpp.this.bC.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cpp.this.w(true);
         cpp.this.a(awr.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cpp.this.w(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bxw $$0 = cpp.this.f();
         if ($$0 != null) {
            if (cpp.this.cR().c($$0.cR())) {
               cpp.this.c(a(cpp.this.dV()), $$0);
               cpp.this.w(false);
            } else {
               double $$1 = cpp.this.g($$0);
               if ($$1 < 9.0) {
                  ffs $$2 = $$0.bD();
                  cpp.this.bC.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cgs {
      private final cil b = cil.b().d().e();

      public b(final bye $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cpp.this.e != null && cpp.this.e.f() != null && this.a(cpp.this.e.f(), this.b);
      }

      @Override
      public void d() {
         cpp.this.g(cpp.this.e.f());
         super.d();
      }
   }

   class c extends cdv {
      public c(final cpp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cdv.a.b) {
            ffs $$0 = new ffs(this.e - cpp.this.dA(), this.f - cpp.this.dC(), this.g - cpp.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cpp.this.cR().a()) {
               this.k = cdv.a.a;
               cpp.this.i(cpp.this.dy().c(0.5));
            } else {
               cpp.this.i(cpp.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cpp.this.f() == null) {
                  ffs $$2 = cpp.this.dy();
                  cpp.this.w(-((float)azq.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cpp.this.aV = cpp.this.dL();
               } else {
                  double $$3 = cpp.this.f().dA() - cpp.this.dA();
                  double $$4 = cpp.this.f().dG() - cpp.this.dG();
                  cpp.this.w(-((float)azq.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cpp.this.aV = cpp.this.dL();
               }
            }
         }
      }
   }

   class d extends ces {
      public d() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         return !cpp.this.L().b() && cpp.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iw $$0 = cpp.this.n();
         if ($$0 == null) {
            $$0 = cpp.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iw $$2 = $$0.b(cpp.this.ae.a(15) - 7, cpp.this.ae.a(11) - 5, cpp.this.ae.a(15) - 7);
            if (cpp.this.dV().v($$2)) {
               cpp.this.bC.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cpp.this.f() == null) {
                  cpp.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
