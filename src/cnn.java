import java.util.EnumSet;

public class cnn extends bwp implements cnl {
   private static final akh<Boolean> a = akl.a(cnn.class, akj.k);
   private int b = 1;

   public cnn(bwj<? extends cnn> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cnn.b(this);
   }

   @Override
   protected void D() {
      this.bC.a(5, new cnn.d(this));
      this.bC.a(7, new cnn.a(this));
      this.bC.a(7, new cnn.c(this));
      this.bD.a(1, new cfo<>(this, cqs.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean j(bup $$0) {
      return $$0.c() instanceof crk && $$0.d() instanceof cqs;
   }

   @Override
   public boolean a(aro $$0, bup $$1) {
      return this.cC() && !$$1.a(axb.d) || !j($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (j($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bye.a n() {
      return bxb.E().a(byf.s, 10.0).a(byf.m, 100.0);
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   protected awk u() {
      return awl.kK;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.kM;
   }

   @Override
   protected awk l_() {
      return awl.kL;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(bwj<cnn> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.an() != btv.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ai() {
      return 1;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends cdv {
      private final cnn a;

      public a(cnn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.b));
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
            fdw $$0 = this.a.dy();
            this.a.w(-((float)azk.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            bwz $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dL();
            }
         }
      }
   }

   static class b extends ccy {
      private final cnn l;
      private int m;

      public b(cnn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccy.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               fdw $$0 = new fdw(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azk.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = ccy.a.a;
               }
            }
         }
      }

      private boolean a(fdw $$0, int $$1) {
         fdr $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cdv {
      private final cnn b;
      public int a;

      public c(cnn $$0) {
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
         bwz $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dip $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fdw $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  fdw $$8 = new fdw($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  crk $$9 = new crk($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends cdv {
      private final cnn a;

      public d(cnn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         ccy $$0 = this.a.L();
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
         azt $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
