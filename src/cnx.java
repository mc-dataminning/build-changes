import java.util.EnumSet;

public class cnx extends bwu implements cnv {
   private static final akj<Boolean> a = akn.a(cnx.class, akl.k);
   private int b = 1;

   public cnx(bwo<? extends cnx> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bA = new cnx.b(this);
   }

   @Override
   protected void D() {
      this.bD.a(5, new cnx.d(this));
      this.bD.a(7, new cnx.a(this));
      this.bD.a(7, new cnx.c(this));
      this.bE.a(1, new cft<>(this, crc.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean i(buu $$0) {
      return $$0.c() instanceof crv && $$0.d() instanceof crc;
   }

   @Override
   public boolean a(arq $$0, buu $$1) {
      return this.cC() && !$$1.a(axd.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
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

   public static byj.a n() {
      return bxg.E().a(byk.s, 10.0).a(byk.m, 100.0);
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.kO;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.kQ;
   }

   @Override
   protected awm l_() {
      return awn.kP;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bwo<cnx> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.an() != bua.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
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

   static class a extends cea {
      private final cnx a;

      public a(cnx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.f() == null) {
            feq $$0 = this.a.dy();
            this.a.w(-((float)azm.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            bxe $$1 = this.a.f();
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

   static class b extends cdd {
      private final cnx l;
      private int m;

      public b(cnx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdd.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               feq $$0 = new feq(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azm.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cdd.a.a;
               }
            }
         }
      }

      private boolean a(feq $$0, int $$1) {
         fel $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cea {
      private final cnx b;
      public int a;

      public c(cnx $$0) {
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
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxe $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dja $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  feq $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  feq $$8 = new feq($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  crv $$9 = new crv($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends cea {
      private final cnx a;

      public d(cnx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         cdd $$0 = this.a.L();
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
