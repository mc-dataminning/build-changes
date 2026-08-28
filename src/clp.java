import java.util.EnumSet;

public class clp extends buv implements cln {
   private static final ako<Boolean> b = aks.a(clp.class, akq.k);
   private int c = 1;

   public clp(bup<? extends clp> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clp.b(this);
   }

   @Override
   protected void D() {
      this.bS.a(5, new clp.d(this));
      this.bS.a(7, new clp.a(this));
      this.bS.a(7, new clp.c(this));
      this.bT.a(1, new cdv<>(this, cor.class, 10, true, false, $$0 -> Math.abs($$0.dF() - this.dF()) <= 4.0));
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

   private static boolean g(bsy $$0) {
      return $$0.c() instanceof cpi && $$0.d() instanceof cor;
   }

   @Override
   public boolean b(bsy $$0) {
      return this.cE() && !$$0.a(axf.d) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static bwl.a y() {
      return bvg.E().a(bwm.s, 10.0).a(bwm.m, 100.0);
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn w() {
      return awo.kl;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.kn;
   }

   @Override
   protected awn o_() {
      return awo.km;
   }

   @Override
   protected float fj() {
      return 5.0F;
   }

   public static boolean b(bup<clp> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.ak() != bse.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int aj() {
      return 1;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends ccc {
      private final clp a;

      public a(clp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.b));
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
            ezr $$0 = this.a.dB();
            this.a.v(-((float)azn.d($$0.d, $$0.f)) * (180.0F / (float)Math.PI));
            this.a.aX = this.a.dO();
         } else {
            bve $$1 = this.a.m();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dD() - this.a.dD();
               double $$4 = $$1.dJ() - this.a.dJ();
               this.a.v(-((float)azn.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aX = this.a.dO();
            }
         }
      }
   }

   static class b extends cbf {
      private final clp l;
      private int m;

      public b(clp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbf.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.eb().a(5) + 2;
               ezr $$0 = new ezr(this.e - this.l.dD(), this.f - this.l.dF(), this.g - this.l.dJ());
               double $$1 = $$0.g();
               $$0 = $$0.d();
               if (this.a($$0, azn.c($$1))) {
                  this.l.h(this.l.dB().e($$0.c(0.1)));
               } else {
                  this.k = cbf.a.a;
               }
            }
         }
      }

      private boolean a(ezr $$0, int $$1) {
         ezm $$2 = this.l.cT();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dY().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends ccc {
      private final clp b;
      public int a;

      public c(clp $$0) {
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
         bve $$0 = this.b.m();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.G($$0)) {
               dff $$2 = this.b.dY();
               this.a++;
               if (this.a == 10 && !this.b.bd()) {
                  $$2.a(null, 1015, this.b.dy(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ezr $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dD() - (this.b.dD() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dJ() - (this.b.dJ() + $$4.f * 4.0);
                  ezr $$8 = new ezr($$5, $$6, $$7);
                  if (!this.b.bd()) {
                     $$2.a(null, 1016, this.b.dy(), 0);
                  }

                  cpi $$9 = new cpi($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dD() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dJ() + $$4.f * 4.0);
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

   static class d extends ccc {
      private final clp a;

      public d(clp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         cbf $$0 = this.a.M();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dD();
            double $$2 = $$0.e() - this.a.dF();
            double $$3 = $$0.f() - this.a.dJ();
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
         azv $$0 = this.a.eb();
         double $$1 = this.a.dD() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dF() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dJ() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.M().a($$1, $$2, $$3, 1.0);
      }
   }
}
