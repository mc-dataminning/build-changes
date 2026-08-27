import java.util.EnumSet;
import org.joml.Vector3f;

public class byt extends bin implements byr {
   private static final adx<Boolean> b = aea.a(byt.class, adz.k);
   private int c = 1;

   public byt(bik<? extends byt> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new byt.b(this);
   }

   @Override
   protected void w() {
      this.bO.a(5, new byt.d(this));
      this.bO.a(7, new byt.a(this));
      this.bO.a(7, new byt.c(this));
      this.bP.a(1, new brl<>(this, cbl.class, 10, true, false, $$0 -> Math.abs($$0.dr() - this.dr()) <= 4.0));
   }

   @Override
   public boolean p() {
      return this.an.b(b);
   }

   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int q() {
      return this.c;
   }

   @Override
   protected boolean S() {
      return true;
   }

   private static boolean h(bhe $$0) {
      return $$0.c() instanceof ccb && $$0.d() instanceof cbl;
   }

   @Override
   public boolean b(bhe $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   public static bkc.a t() {
      return biy.x().a(bkd.a, 10.0).a(bkd.b, 100.0);
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   protected aot r() {
      return aou.jd;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.jf;
   }

   @Override
   protected aot h_() {
      return aou.je;
   }

   @Override
   protected float eU() {
      return 5.0F;
   }

   public static boolean b(bik<byt> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.ai() != bgl.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(big $$0) {
      return 0.5F;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 2.6F;
   }

   static class a extends bps {
      private final byt a;

      public a(byt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.j() == null) {
            ehf $$0 = this.a.dn();
            this.a.r(-((float)aro.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dA();
         } else {
            biw $$1 = this.a.j();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dp() - this.a.dp();
               double $$4 = $$1.dv() - this.a.dv();
               this.a.r(-((float)aro.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dA();
            }
         }
      }
   }

   static class b extends bov {
      private final byt l;
      private int m;

      public b(byt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bov.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ee().a(5) + 2;
               ehf $$0 = new ehf(this.e - this.l.dp(), this.f - this.l.dr(), this.g - this.l.dv());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aro.c($$1))) {
                  this.l.f(this.l.dn().e($$0.a(0.1)));
               } else {
                  this.k = bov.a.a;
               }
            }
         }
      }

      private boolean a(ehf $$0, int $$1) {
         eha $$2 = this.l.cG();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dK().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bps {
      private final byt b;
      public int a;

      public c(byt $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.j() != null;
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
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biw $$0 = this.b.j();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.E($$0)) {
               cpk $$2 = this.b.dK();
               this.a++;
               if (this.a == 10 && !this.b.aS()) {
                  $$2.a(null, 1015, this.b.dk(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ehf $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dp() - (this.b.dp() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dv() - (this.b.dv() + $$4.e * 4.0);
                  if (!this.b.aS()) {
                     $$2.a(null, 1016, this.b.dk(), 0);
                  }

                  ccb $$8 = new ccb($$2, this.b, $$5, $$6, $$7, this.b.q());
                  $$8.e(this.b.dp() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dv() + $$4.e * 4.0);
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

   static class d extends bps {
      private final byt a;

      public d(byt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         bov $$0 = this.a.E();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dp();
            double $$2 = $$0.e() - this.a.dr();
            double $$3 = $$0.f() - this.a.dv();
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
         art $$0 = this.a.ee();
         double $$1 = this.a.dp() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dr() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dv() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.E().a($$1, $$2, $$3, 1.0);
      }
   }
}
