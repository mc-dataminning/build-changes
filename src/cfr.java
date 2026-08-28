import java.util.EnumSet;

public class cfr<T extends coz & cpd & col> extends ceq {
   public static final buc a = bas.a(1, 2);
   private final T b;
   private cfr.a c = cfr.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cfr(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ceq.a.a, ceq.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(dac.xg);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.O().k()) && this.h();
   }

   private boolean i() {
      return this.b.f() != null && this.b.f().bJ();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.g(null);
      this.f = 0;
      if (this.b.fz()) {
         this.b.fF();
         this.b.b(false);
         this.b.fB().b(kk.P, dcc.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bxu $$0 = this.b.f();
      if ($$0 != null) {
         boolean $$1 = this.b.P().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bwt)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.O().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.O().m();
         }

         this.b.J().a($$0, 30.0F, 30.0F);
         if (this.c == cfr.a.a) {
            if (!$$4) {
               this.b.c(csu.a(this.b, dac.xg));
               this.c = cfr.a.b;
               this.b.b(true);
            }
         } else if (this.c == cfr.a.b) {
            if (!this.b.fz()) {
               this.c = cfr.a.a;
            }

            int $$5 = this.b.fD();
            czy $$6 = this.b.fB();
            if ($$5 >= cyr.b($$6, this.b)) {
               this.b.fE();
               this.c = cfr.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == cfr.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cfr.a.d;
            }
         } else if (this.c == cfr.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cfr.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cfr.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
