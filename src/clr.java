import java.util.EnumSet;

public class clr extends bux implements clp {
   private static final ajx<Boolean> a = akb.a(clr.class, ajz.k);
   private int b = 1;

   public clr(bur<? extends clr> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clr.b(this);
   }

   @Override
   protected void B() {
      this.bS.a(5, new clr.d(this));
      this.bS.a(7, new clr.a(this));
      this.bS.a(7, new clr.c(this));
      this.bT.a(1, new cdx<>(this, cox.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
   }

   public boolean m() {
      return this.al.a(a);
   }

   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int p() {
      return this.b;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   private static boolean i(bta $$0) {
      return $$0.c() instanceof cpo && $$0.d() instanceof cox;
   }

   @Override
   public boolean a(arc $$0, bta $$1) {
      return this.cC() && !$$1.a(awr.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bwn.a t() {
      return bvi.C().a(bwo.s, 10.0).a(bwo.m, 100.0);
   }

   @Override
   public awb dn() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.kK;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.kM;
   }

   @Override
   protected avz o_() {
      return awa.kL;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public static boolean b(bur<clr> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.b);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.b = $$0.f("ExplosionPower");
      }
   }

   static class a extends cce {
      private final clr a;

      public a(clr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.b));
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
         if (this.a.O_() == null) {
            fba $$0 = this.a.dz();
            this.a.v(-((float)ayz.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dM();
         } else {
            bvg $$1 = this.a.O_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dB() - this.a.dB();
               double $$4 = $$1.dH() - this.a.dH();
               this.a.v(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dM();
            }
         }
      }
   }

   static class b extends cbh {
      private final clr l;
      private int m;

      public b(clr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbh.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dZ().a(5) + 2;
               fba $$0 = new fba(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, ayz.c($$1))) {
                  this.l.h(this.l.dz().e($$0.c(0.1)));
               } else {
                  this.k = cbh.a.a;
               }
            }
         }
      }

      private boolean a(fba $$0, int $$1) {
         fav $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dW().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cce {
      private final clr b;
      public int a;

      public c(clr $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.O_() != null;
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
         bvg $$0 = this.b.O_();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dgi $$2 = this.b.dW();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dw(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fba $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dB() - (this.b.dB() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dH() - (this.b.dH() + $$4.f * 4.0);
                  fba $$8 = new fba($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dw(), 0);
                  }

                  cpo $$9 = new cpo($$2, this.b, $$8.d(), this.b.p());
                  $$9.a_(this.b.dB() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dH() + $$4.f * 4.0);
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

   static class d extends cce {
      private final clr a;

      public d(clr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         cbh $$0 = this.a.I();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dB();
            double $$2 = $$0.e() - this.a.dD();
            double $$3 = $$0.f() - this.a.dH();
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
         azh $$0 = this.a.dZ();
         double $$1 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dH() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
