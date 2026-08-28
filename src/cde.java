import java.util.EnumSet;

public class cde<T extends clw & cma & clj> extends ccd {
   public static final brt a = baa.a(1, 2);
   private final T b;
   private cde.a c = cde.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cde(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccd.a.a, ccd.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cwr.wV);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.L().k()) && this.h();
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
         this.b.fB().b(kv.O, cys.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bvf $$0 = this.b.O_();
      if ($$0 != null) {
         boolean $$1 = this.b.N().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((buj)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.L().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dZ());
            }
         } else {
            this.h = 0;
            this.b.L().m();
         }

         this.b.H().a($$0, 30.0F, 30.0F);
         if (this.c == cde.a.a) {
            if (!$$4) {
               this.b.c(cpq.a(this.b, cwr.wV));
               this.c = cde.a.b;
               this.b.b(true);
            }
         } else if (this.c == cde.a.b) {
            if (!this.b.fz()) {
               this.c = cde.a.a;
            }

            int $$5 = this.b.fD();
            cwn $$6 = this.b.fB();
            if ($$5 >= cve.b($$6, this.b)) {
               this.b.fE();
               this.c = cde.a.c;
               this.g = 20 + this.b.dZ().a(20);
               this.b.b(false);
            }
         } else if (this.c == cde.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cde.a.d;
            }
         } else if (this.c == cde.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cde.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cde.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
