import java.util.EnumSet;

public class cbb<T extends cjr & cjv & cje> extends caa {
   public static final bps a = azh.a(1, 2);
   private final T b;
   private cbb.a c = cbb.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cbb(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cug.vW);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.J().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bF();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.ft()) {
         this.b.fz();
         this.b.b(false);
         this.b.fv().b(kn.E, cwq.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      btc $$0 = this.b.p();
      if ($$0 != null) {
         boolean $$1 = this.b.L().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.J().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dU());
            }
         } else {
            this.h = 0;
            this.b.J().n();
         }

         this.b.F().a($$0, 30.0F, 30.0F);
         if (this.c == cbb.a.a) {
            if (!$$4) {
               this.b.c(cnf.a(this.b, cug.vW));
               this.c = cbb.a.b;
               this.b.b(true);
            }
         } else if (this.c == cbb.a.b) {
            if (!this.b.ft()) {
               this.c = cbb.a.a;
            }

            int $$5 = this.b.fx();
            cud $$6 = this.b.fv();
            if ($$5 >= csq.a(this.b)) {
               this.b.fy();
               this.c = cbb.a.c;
               this.g = 20 + this.b.dU().a(20);
               this.b.b(false);
            }
         } else if (this.c == cbb.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cbb.a.d;
            }
         } else if (this.c == cbb.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cbb.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cbb.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
