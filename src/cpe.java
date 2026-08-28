import java.util.EnumSet;

public class cpe extends bxt implements cpc {
   private static final aku<Boolean> a = aky.a(cpe.class, akw.k);
   private static final byte b = 1;
   private int c = 1;

   public cpe(bxn<? extends cpe> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cpe.b(this);
   }

   @Override
   protected void D() {
      this.bF.a(5, new cpe.d(this));
      this.bF.a(7, new cpe.a(this));
      this.bF.a(7, new cpe.c(this));
      this.bG.a(1, new cgu<>(this, csi.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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

   private static boolean i(bvt $$0) {
      return $$0.c() instanceof ctb && $$0.d() instanceof csi;
   }

   @Override
   public boolean a(asb $$0, bvt $$1) {
      return this.cC() && !$$1.a(axo.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bzk.a n() {
      return byh.E().a(bzl.s, 10.0).a(bzl.m, 100.0);
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx u() {
      return awy.kO;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.kQ;
   }

   @Override
   protected awx l_() {
      return awy.kP;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public static boolean b(bxn<cpe> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.an() != buz.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
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

   static class a extends cfb {
      private final cpe a;

      public a(cpe $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.f() == null) {
            fgc $$0 = this.a.dy();
            this.a.w(-((float)azz.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dL();
         } else {
            byf $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.w(-((float)azz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dL();
            }
         }
      }
   }

   static class b extends cee {
      private final cpe l;
      private int m;

      public b(cpe $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cee.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dY().a(5) + 2;
               fgc $$0 = new fgc(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azz.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cee.a.a;
               }
            }
         }
      }

      private boolean a(fgc $$0, int $$1) {
         ffx $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cfb {
      private final cpe b;
      public int a;

      public c(cpe $$0) {
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
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         byf $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dkj $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fgc $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  fgc $$8 = new fgc($$5, $$6, $$7);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  ctb $$9 = new ctb($$2, this.b, $$8.d(), this.b.m());
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

   static class d extends cfb {
      private final cpe a;

      public d(cpe $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         cee $$0 = this.a.L();
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
         bai $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
