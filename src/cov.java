import java.util.EnumSet;

public class cov extends bxk implements cot {
   private static final akn<Boolean> a = akr.a(cov.class, akp.k);
   private static final byte b = 1;
   private int c = 1;

   public cov(bxe<? extends cov> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cov.b(this);
   }

   @Override
   protected void D() {
      this.bF.a(5, new cov.d(this));
      this.bF.a(7, new cov.a(this));
      this.bF.a(7, new cov.c(this));
      this.bG.a(1, new cgl<>(this, crz.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
   }

   public boolean j() {
      return this.al.a(a);
   }

   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return this.c;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   private static boolean i(bvk $$0) {
      return $$0.c() instanceof css && $$0.d() instanceof crz;
   }

   @Override
   public boolean a(aru $$0, bvk $$1) {
      return this.cC() && !$$1.a(axh.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bzb.a n() {
      return bxy.E().a(bzc.s, 10.0).a(bzc.m, 100.0);
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected awq u() {
      return awr.kO;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.kQ;
   }

   @Override
   protected awq l_() {
      return awr.kP;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bxe<cov> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.an() != buq.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fX() {
      return 1;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.b("ExplosionPower", (byte)1);
   }

   static class a extends ces {
      private final cov a;

      public a(cov $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.f() == null) {
            ffs $$0 = this.a.dy();
            this.a.w(-((float)azq.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            bxw $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azq.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dL();
            }
         }
      }
   }

   static class b extends cdv {
      private final cov l;
      private int m;

      public b(cov $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdv.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               ffs $$0 = new ffs(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azq.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cdv.a.a;
               }
            }
         }
      }

      private boolean a(ffs $$0, int $$1) {
         ffn $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ces {
      private final cov b;
      public int a;

      public c(cov $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.f() != null;
      }

      @Override
      public void d() {
         this.a = 0;
      }

      @Override
      public void e() {
         this.b.w(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bxw $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               djz $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ffs $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  ffs $$8 = new ffs($$5, $$6, $$7);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  css $$9 = new css($$2, this.b, $$8.d(), this.b.m());
                  $$9.a_(this.b.dA() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dG() + $$4.f * 4.0);
                  $$2.b($$9);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends ces {
      private final cov a;

      public d(cov $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         cdv $$0 = this.a.L();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dA();
            double $$2 = $$0.e() - this.a.dC();
            double $$3 = $$0.f() - this.a.dG();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         azz $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
