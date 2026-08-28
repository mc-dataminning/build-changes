import java.util.EnumSet;

public class cku extends bub implements cks {
   private static final akg<Boolean> b = akk.a(cku.class, aki.k);
   private int c = 1;

   public cku(btv<? extends cku> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cku.b(this);
   }

   @Override
   protected void D() {
      this.bS.a(5, new cku.d(this));
      this.bS.a(7, new cku.a(this));
      this.bS.a(7, new cku.c(this));
      this.bT.a(1, new cda<>(this, cnu.class, 10, true, false, $$0 -> Math.abs($$0.dz() - this.dz()) <= 4.0));
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
   protected boolean ab() {
      return true;
   }

   private static boolean g(bsg $$0) {
      return $$0.c() instanceof col && $$0.d() instanceof cnu;
   }

   @Override
   public boolean b(bsg $$0) {
      return this.cz() && !$$0.a(awv.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bvq.a y() {
      return bum.E().a(bvr.s, 10.0).a(bvr.m, 100.0);
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd w() {
      return awe.kl;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.kn;
   }

   @Override
   protected awd n_() {
      return awe.km;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public static boolean b(btv<cku> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.am() != brm.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fS() {
      return 1;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends cbh {
      private final cku a;

      public a(cku $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.m() == null) {
            eys $$0 = this.a.dv();
            this.a.v(-((float)azd.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aT = this.a.dI();
         } else {
            buk $$1 = this.a.m();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dx() - this.a.dx();
               double $$4 = $$1.dD() - this.a.dD();
               this.a.v(-((float)azd.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aT = this.a.dI();
            }
         }
      }
   }

   static class b extends cak {
      private final cku l;
      private int m;

      public b(cku $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cak.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dV().a(5) + 2;
               eys $$0 = new eys(this.e - this.l.dx(), this.f - this.l.dz(), this.g - this.l.dD());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azd.c($$1))) {
                  this.l.h(this.l.dv().e($$0.c(0.1)));
               } else {
                  this.k = cak.a.a;
               }
            }
         }
      }

      private boolean a(eys $$0, int $$1) {
         eyn $$2 = this.l.cO();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dS().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends cbh {
      private final cku b;
      public int a;

      public c(cku $$0) {
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
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buk $$0 = this.b.m();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.G($$0)) {
               deg $$2 = this.b.dS();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.ds(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eys $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dx() - (this.b.dx() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dD() - (this.b.dD() + $$4.f * 4.0);
                  eys $$8 = new eys($$5, $$6, $$7);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.ds(), 0);
                  }

                  col $$9 = new col($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dx() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dD() + $$4.f * 4.0);
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

   static class d extends cbh {
      private final cku a;

      public d(cku $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         cak $$0 = this.a.M();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dx();
            double $$2 = $$0.e() - this.a.dz();
            double $$3 = $$0.f() - this.a.dD();
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
         azl $$0 = this.a.dV();
         double $$1 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.M().a($$1, $$2, $$3, 1.0);
      }
   }
}
