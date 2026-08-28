import java.util.EnumSet;

public class cjx extends btd implements cjv {
   private static final ajw<Boolean> b = aka.a(cjx.class, ajy.k);
   private int c = 1;

   public cjx(bsx<? extends cjx> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjx.b(this);
   }

   @Override
   protected void B() {
      this.bU.a(5, new cjx.d(this));
      this.bU.a(7, new cjx.a(this));
      this.bU.a(7, new cjx.c(this));
      this.bV.a(1, new ccf<>(this, cmx.class, 10, true, false, $$0 -> Math.abs($$0.dv() - this.dv()) <= 4.0));
   }

   public boolean s() {
      return this.ao.a(b);
   }

   public void x(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean Z() {
      return true;
   }

   private static boolean g(brk $$0) {
      return $$0.c() instanceof cnn && $$0.d() instanceof cmx;
   }

   @Override
   public boolean b(brk $$0) {
      return this.cv() && !$$0.a(awg.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static buv.a x() {
      return btp.C().a(buw.s, 10.0).a(buw.m, 100.0);
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected avo v() {
      return avp.kk;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.km;
   }

   @Override
   protected avo n_() {
      return avp.kl;
   }

   @Override
   protected float fa() {
      return 5.0F;
   }

   public static boolean b(bsx<cjx> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.al() != bqo.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fN() {
      return 1;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cam {
      private final cjx a;

      public a(cjx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.b));
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
         if (this.a.p() == null) {
            exc $$0 = this.a.dr();
            this.a.t(-((float)ayo.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aY = this.a.dE();
         } else {
            btn $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dt() - this.a.dt();
               double $$4 = $$1.dz() - this.a.dz();
               this.a.t(-((float)ayo.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aY = this.a.dE();
            }
         }
      }
   }

   static class b extends bzp {
      private final cjx l;
      private int m;

      public b(cjx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dR().a(5) + 2;
               exc $$0 = new exc(this.e - this.l.dt(), this.f - this.l.dv(), this.g - this.l.dz());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayo.c($$1))) {
                  this.l.i(this.l.dr().e($$0.a(0.1)));
               } else {
                  this.k = bzp.a.a;
               }
            }
         }
      }

      private boolean a(exc $$0, int $$1) {
         ewx $$2 = this.l.cK();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dO().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cam {
      private final cjx b;
      public int a;

      public c(cjx $$0) {
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
         this.b.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         btn $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dcw $$2 = this.b.dO();
               this.a++;
               if (this.a == 10 && !this.b.aX()) {
                  $$2.a(null, 1015, this.b.do(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  exc $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dt() - (this.b.dt() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dz() - (this.b.dz() + $$4.e * 4.0);
                  exc $$8 = new exc($$5, $$6, $$7);
                  if (!this.b.aX()) {
                     $$2.a(null, 1016, this.b.do(), 0);
                  }

                  cnn $$9 = new cnn($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dt() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$9.dz() + $$4.e * 4.0);
                  $$2.b($$9);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.x(this.a > 10);
         }
      }
   }

   static class d extends cam {
      private final cjx a;

      public d(cjx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         bzp $$0 = this.a.J();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dt();
            double $$2 = $$0.e() - this.a.dv();
            double $$3 = $$0.f() - this.a.dz();
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
         ayw $$0 = this.a.dR();
         double $$1 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dv() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.J().a($$1, $$2, $$3, 1.0);
      }
   }
}
