import java.util.EnumSet;

public class cjv extends btc implements cjt {
   private static final ajv<Boolean> b = ajz.a(cjv.class, ajx.k);
   private int c = 1;

   public cjv(bsw<? extends cjv> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjv.b(this);
   }

   @Override
   protected void z() {
      this.bU.a(5, new cjv.d(this));
      this.bU.a(7, new cjv.a(this));
      this.bU.a(7, new cjv.c(this));
      this.bV.a(1, new ccd<>(this, cmv.class, 10, true, false, $$0 -> Math.abs($$0.dx() - this.dx()) <= 4.0));
   }

   public boolean s() {
      return this.ao.a(b);
   }

   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean g(brj $$0) {
      return $$0.c() instanceof cnl && $$0.d() instanceof cmv;
   }

   @Override
   public boolean b(brj $$0) {
      return this.cv() && !$$0.a(awf.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static but.a x() {
      return btn.A().a(buu.s, 10.0).a(buu.m, 100.0);
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected avn v() {
      return avo.kk;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.km;
   }

   @Override
   protected avn n_() {
      return avo.kl;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public static boolean b(bsw<cjv> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.al() != bqn.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int af() {
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
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cak {
      private final cjv a;

      public a(cjv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.b));
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
         if (this.a.p() == null) {
            eww $$0 = this.a.dt();
            this.a.s(-((float)ayn.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aY = this.a.dG();
         } else {
            btl $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dv() - this.a.dv();
               double $$4 = $$1.dB() - this.a.dB();
               this.a.s(-((float)ayn.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aY = this.a.dG();
            }
         }
      }
   }

   static class b extends bzn {
      private final cjv l;
      private int m;

      public b(cjv $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzn.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dT().a(5) + 2;
               eww $$0 = new eww(this.e - this.l.dv(), this.f - this.l.dx(), this.g - this.l.dB());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayn.c($$1))) {
                  this.l.i(this.l.dt().e($$0.a(0.1)));
               } else {
                  this.k = bzn.a.a;
               }
            }
         }
      }

      private boolean a(eww $$0, int $$1) {
         ewr $$2 = this.l.cL();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dQ().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cak {
      private final cjv b;
      public int a;

      public c(cjv $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.p() != null;
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
         btl $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dcu $$2 = this.b.dQ();
               this.a++;
               if (this.a == 10 && !this.b.aX()) {
                  $$2.a(null, 1015, this.b.dq(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eww $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dv() - (this.b.dv() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dB() - (this.b.dB() + $$4.e * 4.0);
                  eww $$8 = new eww($$5, $$6, $$7);
                  if (!this.b.aX()) {
                     $$2.a(null, 1016, this.b.dq(), 0);
                  }

                  cnl $$9 = new cnl($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dv() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$9.dB() + $$4.e * 4.0);
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

   static class d extends cak {
      private final cjv a;

      public d(cjv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         bzn $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dv();
            double $$2 = $$0.e() - this.a.dx();
            double $$3 = $$0.f() - this.a.dB();
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
         ayv $$0 = this.a.dT();
         double $$1 = this.a.dv() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
