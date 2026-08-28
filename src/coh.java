import java.util.EnumSet;

public class coh extends bwx implements cof {
   private static final akj<Boolean> a = akn.a(coh.class, akl.k);
   private int b = 1;

   public coh(bwr<? extends coh> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bA = new coh.b(this);
   }

   @Override
   protected void D() {
      this.bD.a(5, new coh.d(this));
      this.bD.a(7, new coh.a(this));
      this.bD.a(7, new coh.c(this));
      this.bE.a(1, new cfy<>(this, crm.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dB() - this.dB()) <= 4.0));
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

   private static boolean i(bux $$0) {
      return $$0.c() instanceof csf && $$0.d() instanceof crm;
   }

   @Override
   public boolean a(arq $$0, bux $$1) {
      return this.cB() && !$$1.a(axd.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
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

   public static byo.a n() {
      return bxl.E().a(byp.s, 10.0).a(byp.m, 100.0);
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.kO;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.kQ;
   }

   @Override
   protected awm l_() {
      return awn.kP;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(bwr<coh> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.an() != bud.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fW() {
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
         this.b = $$0.d("ExplosionPower");
      }
   }

   static class a extends cef {
      private final coh a;

      public a(coh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.b));
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
            ffc $$0 = this.a.dx();
            this.a.w(-((float)azm.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aV = this.a.dK();
         } else {
            bxj $$1 = this.a.f();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dz() - this.a.dz();
               double $$4 = $$1.dF() - this.a.dF();
               this.a.w(-((float)azm.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aV = this.a.dK();
            }
         }
      }
   }

   static class b extends cdi {
      private final coh l;
      private int m;

      public b(coh $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cdi.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dX().a(5) + 2;
               ffc $$0 = new ffc(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azm.c($$1))) {
                  this.l.i(this.l.dx().e($$0.c(0.1)));
               } else {
                  this.k = cdi.a.a;
               }
            }
         }
      }

      private boolean a(ffc $$0, int $$1) {
         fex $$2 = this.l.cQ();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dU().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cef {
      private final coh b;
      public int a;

      public c(coh $$0) {
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
         bxj $$0 = this.b.f();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               djm $$2 = this.b.dU();
               this.a++;
               if (this.a == 10 && !this.b.aZ()) {
                  $$2.a(null, 1015, this.b.du(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ffc $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dz() - (this.b.dz() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dF() - (this.b.dF() + $$4.f * 4.0);
                  ffc $$8 = new ffc($$5, $$6, $$7);
                  if (!this.b.aZ()) {
                     $$2.a(null, 1016, this.b.du(), 0);
                  }

                  csf $$9 = new csf($$2, this.b, $$8.d(), this.b.m());
                  $$9.a_(this.b.dz() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dF() + $$4.f * 4.0);
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

   static class d extends cef {
      private final coh a;

      public d(coh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         cdi $$0 = this.a.L();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dz();
            double $$2 = $$0.e() - this.a.dB();
            double $$3 = $$0.f() - this.a.dF();
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
         azv $$0 = this.a.dX();
         double $$1 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dF() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.L().a($$1, $$2, $$3, 1.0);
      }
   }
}
