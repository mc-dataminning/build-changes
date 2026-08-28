import java.util.EnumSet;

public class cjk extends bss implements cji {
   private static final ajp<Boolean> b = ajt.a(cjk.class, ajr.k);
   private int c = 1;

   public cjk(bsm<? extends cjk> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjk.b(this);
   }

   @Override
   protected void z() {
      this.bU.a(5, new cjk.d(this));
      this.bU.a(7, new cjk.a(this));
      this.bU.a(7, new cjk.c(this));
      this.bV.a(1, new cbs<>(this, cmk.class, 10, true, false, $$0 -> Math.abs($$0.dx() - this.dx()) <= 4.0));
   }

   public boolean s() {
      return this.ao.a(b);
   }

   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(bqz $$0) {
      return $$0.c() instanceof cna && $$0.d() instanceof cmk;
   }

   @Override
   public boolean b(bqz $$0) {
      return this.cv() && !$$0.a(avy.e) || !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (h($$0)) {
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

   public static bui.a y() {
      return btd.A().a(buj.s, 10.0).a(buj.m, 100.0);
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.kk;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.km;
   }

   @Override
   protected avg o_() {
      return avh.kl;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public static boolean b(bsm<cjk> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqd.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fN() {
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

   static class a extends bzz {
      private final cjk a;

      public a(cjk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.b));
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
            ewf $$0 = this.a.dt();
            this.a.s(-((float)ayg.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aY = this.a.dG();
         } else {
            btb $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dv() - this.a.dv();
               double $$4 = $$1.dB() - this.a.dB();
               this.a.s(-((float)ayg.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aY = this.a.dG();
            }
         }
      }
   }

   static class b extends bzc {
      private final cjk l;
      private int m;

      public b(cjk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzc.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.dT().a(5) + 2;
               ewf $$0 = new ewf(this.e - this.l.dv(), this.f - this.l.dx(), this.g - this.l.dB());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ayg.c($$1))) {
                  this.l.i(this.l.dt().e($$0.a(0.1)));
               } else {
                  this.k = bzc.a.a;
               }
            }
         }
      }

      private boolean a(ewf $$0, int $$1) {
         ewa $$2 = this.l.cL();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dQ().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bzz {
      private final cjk b;
      public int a;

      public c(cjk $$0) {
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
         btb $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dcf $$2 = this.b.dQ();
               this.a++;
               if (this.a == 10 && !this.b.aX()) {
                  $$2.a(null, 1015, this.b.dq(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ewf $$4 = this.b.g(1.0F);
                  double $$5 = $$0.dv() - (this.b.dv() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dB() - (this.b.dB() + $$4.e * 4.0);
                  ewf $$8 = new ewf($$5, $$6, $$7);
                  if (!this.b.aX()) {
                     $$2.a(null, 1016, this.b.dq(), 0);
                  }

                  cna $$9 = new cna($$2, this.b, $$8.d(), this.b.u());
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

   static class d extends bzz {
      private final cjk a;

      public d(cjk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         bzc $$0 = this.a.H();
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
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         ayo $$0 = this.a.dT();
         double $$1 = this.a.dv() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.H().a($$1, $$2, $$3, 1.0);
      }
   }
}
