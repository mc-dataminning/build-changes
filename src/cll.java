import java.util.EnumSet;

public class cll extends bur implements clj {
   private static final akl<Boolean> b = akp.a(cll.class, akn.k);
   private int c = 1;

   public cll(bul<? extends cll> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cll.b(this);
   }

   @Override
   protected void D() {
      this.bS.a(5, new cll.d(this));
      this.bS.a(7, new cll.a(this));
      this.bS.a(7, new cll.c(this));
      this.bT.a(1, new cdr<>(this, com.class, 10, true, false, $$0 -> Math.abs($$0.dE() - this.dE()) <= 4.0));
   }

   @Override
   public boolean q() {
      return this.am.a(b);
   }

   public void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   private static boolean g(bsu $$0) {
      return $$0.c() instanceof cpe && $$0.d() instanceof com;
   }

   @Override
   public boolean b(bsu $$0) {
      return this.cD() && !$$0.a(axc.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bwh.a y() {
      return bvc.E().a(bwi.s, 10.0).a(bwi.m, 100.0);
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected awk w() {
      return awl.kl;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.kn;
   }

   @Override
   protected awk o_() {
      return awl.km;
   }

   @Override
   protected float fi() {
      return 5.0F;
   }

   public static boolean b(bul<cll> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.ak() != bsa.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int aj() {
      return 1;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cby {
      private final cll a;

      public a(cll $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.b));
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
         if (this.a.m() == null) {
            ezn $$0 = this.a.dA();
            this.a.v(-((float)azk.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dN();
         } else {
            bva $$1 = this.a.m();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dC() - this.a.dC();
               double $$4 = $$1.dI() - this.a.dI();
               this.a.v(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dN();
            }
         }
      }
   }

   static class b extends cbb {
      private final cll l;
      private int m;

      public b(cll $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbb.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ea().a(5) + 2;
               ezn $$0 = new ezn(this.e - this.l.dC(), this.f - this.l.dE(), this.g - this.l.dI());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azk.c($$1))) {
                  this.l.h(this.l.dA().e($$0.c(0.1)));
               } else {
                  this.k = cbb.a.a;
               }
            }
         }
      }

      private boolean a(ezn $$0, int $$1) {
         ezi $$2 = this.l.cS();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dX().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cby {
      private final cll b;
      public int a;

      public c(cll $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.m() != null;
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
         bva $$0 = this.b.m();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.G($$0)) {
               dfb $$2 = this.b.dX();
               this.a++;
               if (this.a == 10 && !this.b.bc()) {
                  $$2.a(null, 1015, this.b.dx(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ezn $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dC() - (this.b.dC() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dI() - (this.b.dI() + $$4.f * 4.0);
                  ezn $$8 = new ezn($$5, $$6, $$7);
                  if (!this.b.bc()) {
                     $$2.a(null, 1016, this.b.dx(), 0);
                  }

                  cpe $$9 = new cpe($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dC() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dI() + $$4.f * 4.0);
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

   static class d extends cby {
      private final cll a;

      public d(cll $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         cbb $$0 = this.a.M();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dC();
            double $$2 = $$0.e() - this.a.dE();
            double $$3 = $$0.f() - this.a.dI();
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
         azs $$0 = this.a.ea();
         double $$1 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dE() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dI() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.M().a($$1, $$2, $$3, 1.0);
      }
   }
}
