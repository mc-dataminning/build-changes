import java.util.EnumSet;

public class bqv<T extends bzb & bzf & byo> extends bpu {
   public static final bgb a = asm.a(1, 2);
   private final T b;
   private bqv.a c = bqv.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bqv(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bpu.a.a, bpu.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cjb.uZ);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.H().l()) && this.h();
   }

   private boolean i() {
      return this.b.j() != null && this.b.j().bv();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fl()) {
         this.b.fr();
         this.b.b(false);
         chg.a(this.b.fn(), false);
      }
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      biy $$0 = this.b.j();
      if ($$0 != null) {
         boolean $$1 = this.b.J().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.f($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.H().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ee());
            }
         } else {
            this.h = 0;
            this.b.H().n();
         }

         this.b.D().a($$0, 30.0F, 30.0F);
         if (this.c == bqv.a.a) {
            if (!$$4) {
               this.b.c(ccg.a(this.b, cjb.uZ));
               this.c = bqv.a.b;
               this.b.b(true);
            }
         } else if (this.c == bqv.a.b) {
            if (!this.b.fl()) {
               this.c = bqv.a.a;
            }

            int $$5 = this.b.fp();
            ciy $$6 = this.b.fn();
            if ($$5 >= chg.k($$6)) {
               this.b.fq();
               this.c = bqv.a.c;
               this.g = 20 + this.b.ee().a(20);
               this.b.b(false);
            }
         } else if (this.c == bqv.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bqv.a.d;
            }
         } else if (this.c == bqv.a.d && $$1) {
            this.b.a($$0, 1.0F);
            ciy $$7 = this.b.b(ccg.a(this.b, cjb.uZ));
            chg.a($$7, false);
            this.c = bqv.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bqv.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
