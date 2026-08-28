import java.util.EnumSet;

public class clr extends bux implements clp {
   private static final ajy<Boolean> a = akc.a(clr.class, aka.k);
   private int b = 1;

   public clr(bur<? extends clr> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clr.b(this);
   }

   @Override
   protected void E() {
      this.bS.a(5, new clr.d(this));
      this.bS.a(7, new clr.a(this));
      this.bS.a(7, new clr.c(this));
      this.bT.a(1, new cdx<>(this, cow.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
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
   protected boolean ab() {
      return true;
   }

   private static boolean j(bta $$0) {
      return $$0.c() instanceof cpn && $$0.d() instanceof cow;
   }

   @Override
   public boolean a(ard $$0, bta $$1) {
      return this.cC() && !$$1.a(awr.d) || !j($$1) && super.a($$0, $$1);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (j($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static bwn.a t() {
      return bvi.F().a(bwo.s, 10.0).a(bwo.m, 100.0);
   }

   @Override
   public awb dm() {
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

   public static boolean b(bur<clr> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int aj() {
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
            faz $$0 = this.a.dy();
            this.a.v(-((float)ayz.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dL();
         } else {
            bvg $$1 = this.a.O_();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dA() - this.a.dA();
               double $$4 = $$1.dG() - this.a.dG();
               this.a.v(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dL();
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
               this.m = this.m + this.l.dY().a(5) + 2;
               faz $$0 = new faz(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, ayz.c($$1))) {
                  this.l.i(this.l.dy().e($$0.c(0.1)));
               } else {
                  this.k = cbh.a.a;
               }
            }
         }
      }

      private boolean a(faz $$0, int $$1) {
         fau $$2 = this.l.cR();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dV().a(this.l, $$2)) {
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
               dgh $$2 = this.b.dV();
               this.a++;
               if (this.a == 10 && !this.b.bb()) {
                  $$2.a(null, 1015, this.b.dv(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  faz $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dA() - (this.b.dA() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dG() - (this.b.dG() + $$4.f * 4.0);
                  faz $$8 = new faz($$5, $$6, $$7);
                  if (!this.b.bb()) {
                     $$2.a(null, 1016, this.b.dv(), 0);
                  }

                  cpn $$9 = new cpn($$2, this.b, $$8.d(), this.b.p());
                  $$9.a_(this.b.dA() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dG() + $$4.f * 4.0);
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
         cbh $$0 = this.a.N();
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
         azh $$0 = this.a.dY();
         double $$1 = this.a.dA() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dG() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.N().a($$1, $$2, $$3, 1.0);
      }
   }
}
