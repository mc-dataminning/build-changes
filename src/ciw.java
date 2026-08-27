import java.util.EnumSet;

public class ciw extends bsf implements ciu {
   private static final ajy<Boolean> b = akc.a(ciw.class, aka.k);
   private int c = 1;

   public ciw(bsb<? extends ciw> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
      this.bY = new ciw.b(this);
   }

   @Override
   protected void y() {
      this.cb.a(5, new ciw.d(this));
      this.cb.a(7, new ciw.a(this));
      this.cb.a(7, new ciw.c(this));
      this.cc.a(1, new cbe<>(this, cly.class, 10, true, false, $$0 -> Math.abs($$0.dB() - this.dB()) <= 4.0));
   }

   public boolean r() {
      return this.as.a(b);
   }

   public void w(boolean $$0) {
      this.as.a(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean W() {
      return true;
   }

   private static boolean i(bqt $$0) {
      return $$0.c() instanceof cmp && $$0.d() instanceof cly;
   }

   @Override
   public boolean b(bqt $$0) {
      return this.cz() && !$$0.a(awg.e) || !i($$0) && super.b($$0);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (i($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   public static btu.a x() {
      return bsq.A().a(btv.q, 10.0).a(btv.k, 100.0);
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn u() {
      return avo.kx;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.kz;
   }

   @Override
   protected avn n_() {
      return avo.ky;
   }

   @Override
   protected float fn() {
      return 5.0F;
   }

   public static boolean b(bsb<ciw> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int ad() {
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

   static class a extends bzl {
      private final ciw a;

      public a(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.p() == null) {
            ewu $$0 = this.a.dx();
            this.a.r(-((float)aym.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.bj = this.a.dK();
         } else {
            bso $$1 = this.a.p();
            double $$2 = 64.0;
            if ($$1.g(this.a) < 4096.0) {
               double $$3 = $$1.dz() - this.a.dz();
               double $$4 = $$1.dF() - this.a.dF();
               this.a.r(-((float)aym.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.bj = this.a.dK();
            }
         }
      }
   }

   static class b extends byo {
      private final ciw l;
      private int m;

      public b(ciw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byo.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.et().a(5) + 2;
               ewu $$0 = new ewu(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aym.c($$1))) {
                  this.l.g(this.l.dx().e($$0.a(0.1)));
               } else {
                  this.k = byo.a.a;
               }
            }
         }
      }

      private boolean a(ewu $$0, int $$1) {
         ewp $$2 = this.l.cP();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dU().b(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bzl {
      private final ciw b;
      public int a;

      public c(ciw $$0) {
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
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dca $$2 = this.b.dU();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  $$2.a(null, 1015, this.b.du(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ewu $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dz() - (this.b.dz() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dF() - (this.b.dF() + $$4.e * 4.0);
                  if (!this.b.ba()) {
                     $$2.a(null, 1016, this.b.du(), 0);
                  }

                  cmp $$8 = new cmp($$2, this.b, $$5, $$6, $$7, this.b.t());
                  $$8.a_(this.b.dz() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dF() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends bzl {
      private final ciw a;

      public d(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         byo $$0 = this.a.G();
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
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         ayt $$0 = this.a.et();
         double $$1 = this.a.dz() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dB() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dF() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.G().a($$1, $$2, $$3, 1.0);
      }
   }
}
