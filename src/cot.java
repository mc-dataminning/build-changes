import java.util.EnumSet;

public class cot extends bxi implements cor {
   private static final akl<Boolean> a = akp.a(cot.class, akn.k);
   private static final byte b = 1;
   private int c = 1;

   public cot(bxc<? extends cot> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cot.b(this);
   }

   @Override
   protected void D() {
      this.bF.a(5, new cot.d(this));
      this.bF.a(7, new cot.a(this));
      this.bF.a(7, new cot.c(this));
      this.bG.a(1, new cgj<>(this, crx.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean i(bvi $$0) {
      return $$0.c() instanceof csq && $$0.d() instanceof crx;
   }

   @Override
   public boolean a(ars $$0, bvi $$1) {
      return this.cC() && !$$1.a(axf.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static byz.a n() {
      return bxw.E().a(bza.s, 10.0).a(bza.m, 100.0);
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected awo u() {
      return awp.kO;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.kQ;
   }

   @Override
   protected awo l_() {
      return awp.kP;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bxc<cot> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.an() != buo.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fX() {
      return 1;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c = $$0.b("ExplosionPower", (byte)1);
   }

   static class a extends ceq {
      private final cot a;

      public a(cot $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.b));
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
            ffq $$0 = this.a.dy();
            this.a.w(-((float)azo.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            bxu $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azo.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dL();
            }
         }
      }
   }

   static class b extends cdt {
      private final cot l;
      private int m;

      public b(cot $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdt.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               ffq $$0 = new ffq(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azo.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cdt.a.a;
               }
            }
         }
      }

      private boolean a(ffq $$0, int $$1) {
         ffl $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ceq {
      private final cot b;
      public int a;

      public c(cot $$0) {
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
         bxu $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               djx $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ffq $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  ffq $$8 = new ffq($$5, $$6, $$7);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  csq $$9 = new csq($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends ceq {
      private final cot a;

      public d(cot $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         cdt $$0 = this.a.L();
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
         azx $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
