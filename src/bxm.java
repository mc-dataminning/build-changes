import java.util.EnumSet;

public class bxm<T extends cfy & cgc & cfl> extends bwl {
   public static final bmn a = axv.a(1, 2);
   private final T b;
   private bxm.a c = bxm.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bxm(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bwl.a.a, bwl.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cqn.vQ);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.K().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bA();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fs()) {
         this.b.fy();
         this.b.b(false);
         cov.a(this.b.fu(), false);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bpo $$0 = this.b.p();
      if ($$0 != null) {
         boolean $$1 = this.b.M().a($$0);
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
               this.b.K().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ei());
            }
         } else {
            this.h = 0;
            this.b.K().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == bxm.a.a) {
            if (!$$4) {
               this.b.c(cjm.a(this.b, cqn.vQ));
               this.c = bxm.a.b;
               this.b.b(true);
            }
         } else if (this.c == bxm.a.b) {
            if (!this.b.fs()) {
               this.c = bxm.a.a;
            }

            int $$5 = this.b.fw();
            cqk $$6 = this.b.fu();
            if ($$5 >= cov.k($$6)) {
               this.b.fx();
               this.c = bxm.a.c;
               this.g = 20 + this.b.ei().a(20);
               this.b.b(false);
            }
         } else if (this.c == bxm.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bxm.a.d;
            }
         } else if (this.c == bxm.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cqk $$7 = this.b.b(cjm.a(this.b, cqn.vQ));
            cov.a($$7, false);
            this.c = bxm.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bxm.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
