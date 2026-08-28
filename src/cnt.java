import java.util.EnumSet;

public class cnt extends bws implements cnr {
   private static final akj<Boolean> a = akn.a(cnt.class, akl.k);
   private int b = 1;

   public cnt(bwm<? extends cnt> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cnt.b(this);
   }

   @Override
   protected void D() {
      this.bC.a(5, new cnt.d(this));
      this.bC.a(7, new cnt.a(this));
      this.bC.a(7, new cnt.c(this));
      this.bD.a(1, new cfr<>(this, cqy.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
   }

   public boolean j() {
      return this.al.a(a);
   }

   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return this.b;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   private static boolean i(bus $$0) {
      return $$0.c() instanceof crq && $$0.d() instanceof cqy;
   }

   @Override
   public boolean a(arq $$0, bus $$1) {
      return this.cC() && !$$1.a(axd.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static byh.a n() {
      return bxe.E().a(byi.s, 10.0).a(byi.m, 100.0);
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.kL;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.kN;
   }

   @Override
   protected awm l_() {
      return awn.kM;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(bwm<cnt> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.an() != bty.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ai() {
      return 1;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends cdy {
      private final cnt a;

      public a(cnt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.f() == null) {
            fei $$0 = this.a.dy();
            this.a.w(-((float)azm.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            bxc $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dL();
            }
         }
      }
   }

   static class b extends cdb {
      private final cnt l;
      private int m;

      public b(cnt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdb.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               fei $$0 = new fei(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azm.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cdb.a.a;
               }
            }
         }
      }

      private boolean a(fei $$0, int $$1) {
         fed $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cdy {
      private final cnt b;
      public int a;

      public c(cnt $$0) {
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
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bxc $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               div $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fei $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  fei $$8 = new fei($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  crq $$9 = new crq($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends cdy {
      private final cnt a;

      public d(cnt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         cdb $$0 = this.a.L();
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
         azv $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
