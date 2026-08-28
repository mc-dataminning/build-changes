import java.util.EnumSet;

public class cdh<T extends clz & cmd & clm> extends ccg {
   public static final brw a = bab.a(1, 2);
   private final T b;
   private cdh.a c = cdh.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cdh(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccg.a.a, ccg.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cwu.wV);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.P().k()) && this.h();
   }

   private boolean i() {
      return this.b.O_() != null && this.b.O_().bL();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fz()) {
         this.b.fF();
         this.b.b(false);
         this.b.fB().b(kv.O, cyv.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bvi $$0 = this.b.O_();
      if ($$0 != null) {
         boolean $$1 = this.b.Q().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bum)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.P().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.P().m();
         }

         this.b.L().a($$0, 30.0F, 30.0F);
         if (this.c == cdh.a.a) {
            if (!$$4) {
               this.b.c(cpt.a(this.b, cwu.wV));
               this.c = cdh.a.b;
               this.b.b(true);
            }
         } else if (this.c == cdh.a.b) {
            if (!this.b.fz()) {
               this.c = cdh.a.a;
            }

            int $$5 = this.b.fD();
            cwq $$6 = this.b.fB();
            if ($$5 >= cvh.b($$6, this.b)) {
               this.b.fE();
               this.c = cdh.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == cdh.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cdh.a.d;
            }
         } else if (this.c == cdh.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cdh.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cdh.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
