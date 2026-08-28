import java.util.EnumSet;

public class cnd extends bwh implements cnb {
   private static final akg<Boolean> a = akk.a(cnd.class, aki.k);
   private int b = 1;

   public cnd(bwb<? extends cnd> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
      this.by = new cnd.b(this);
   }

   @Override
   protected void D() {
      this.bB.a(5, new cnd.d(this));
      this.bB.a(7, new cnd.a(this));
      this.bB.a(7, new cnd.c(this));
      this.bC.a(1, new cfg<>(this, cqi.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean j(buh $$0) {
      return $$0.c() instanceof cqz && $$0.d() instanceof cqi;
   }

   @Override
   public boolean a(arn $$0, buh $$1) {
      return this.cC() && !$$1.a(axb.d) || !j($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (j($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bxw.a n() {
      return bwt.E().a(bxx.s, 10.0).a(bxx.m, 100.0);
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj u() {
      return awk.kK;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.kM;
   }

   @Override
   protected awj l_() {
      return awk.kL;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(bwb<cnd> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.an() != btn.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ai() {
      return 1;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends cdn {
      private final cnd a;

      public a(cnd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.b));
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
            fcu $$0 = this.a.dy();
            this.a.w(-((float)azk.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dL();
         } else {
            bwr $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dL();
            }
         }
      }
   }

   static class b extends ccq {
      private final cnd l;
      private int m;

      public b(cnd $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccq.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               fcu $$0 = new fcu(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azk.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = ccq.a.a;
               }
            }
         }
      }

      private boolean a(fcu $$0, int $$1) {
         fcp $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cdn {
      private final cnd b;
      public int a;

      public c(cnd $$0) {
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
         bwr $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dhp $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fcu $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  fcu $$8 = new fcu($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  cqz $$9 = new cqz($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends cdn {
      private final cnd a;

      public d(cnd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         ccq $$0 = this.a.L();
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
         azs $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
