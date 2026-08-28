import java.util.EnumSet;

public class cjl extends bst implements cjj {
   private static final ajp<Boolean> b = ajt.a(cjl.class, ajr.k);
   private int c = 1;

   public cjl(bsn<? extends cjl> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjl.b(this);
   }

   @Override
   protected void z() {
      this.bU.a(5, new cjl.d(this));
      this.bU.a(7, new cjl.a(this));
      this.bU.a(7, new cjl.c(this));
      this.bV.a(1, new cbt<>(this, cml.class, 10, true, false, $$0 -> Math.abs($$0.dy() - this.dy()) <= 4.0));
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

   private static boolean g(bra $$0) {
      return $$0.c() instanceof cnb && $$0.d() instanceof cml;
   }

   @Override
   public boolean b(bra $$0) {
      return this.cw() && !$$0.a(avy.e) || !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static buj.a x() {
      return bte.A().a(buk.s, 10.0).a(buk.m, 100.0);
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.kk;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.km;
   }

   @Override
   protected avg n_() {
      return avh.kl;
   }

   @Override
   protected float fc() {
      return 5.0F;
   }

   public static boolean b(bsn<cjl> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqe.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   static class a extends caa {
      private final cjl a;

      public a(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.p() == null) {
            ewh $$0 = this.a.du();
            this.a.s(-((float)ayg.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aZ = this.a.dH();
         } else {
            btc $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dw() - this.a.dw();
               double $$4 = $$1.dC() - this.a.dC();
               this.a.s(-((float)ayg.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aZ = this.a.dH();
            }
         }
      }
   }

   static class b extends bzd {
      private final cjl l;
      private int m;

      public b(cjl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzd.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dU().a(5) + 2;
               ewh $$0 = new ewh(this.e - this.l.dw(), this.f - this.l.dy(), this.g - this.l.dC());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayg.c($$1))) {
                  this.l.j(this.l.du().e($$0.a(0.1)));
               } else {
                  this.k = bzd.a.a;
               }
            }
         }
      }

      private boolean a(ewh $$0, int $$1) {
         ewc $$2 = this.l.cM();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dR().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends caa {
      private final cjl b;
      public int a;

      public c(cjl $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.p() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btc $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dcg $$2 = this.b.dR();
               this.a++;
               if (this.a == 10 && !this.b.aY()) {
                  $$2.a(null, 1015, this.b.dr(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ewh $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dw() - (this.b.dw() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dC() - (this.b.dC() + $$4.e * 4.0);
                  ewh $$8 = new ewh($$5, $$6, $$7);
                  if (!this.b.aY()) {
                     $$2.a(null, 1016, this.b.dr(), 0);
                  }

                  cnb $$9 = new cnb($$2, this.b, $$8.d(), this.b.t());
                  $$9.a_(this.b.dw() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$9.dC() + $$4.e * 4.0);
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

   static class d extends caa {
      private final cjl a;

      public d(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         bzd $$0 = this.a.H();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dw();
            double $$2 = $$0.e() - this.a.dy();
            double $$3 = $$0.f() - this.a.dC();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         ayo $$0 = this.a.dU();
         double $$1 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dy() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dC() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
