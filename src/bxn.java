import java.util.EnumSet;

public class bxn<T extends cga & cge & cfn> extends bwm {
   public static final bmo a = axv.a(1, 2);
   private final T b;
   private bxn.a c = bxn.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bxn(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bwm.a.a, bwm.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cqp.vR);
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
         cox.a(this.b.fu(), false);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bpp $$0 = this.b.p();
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
         if (this.c == bxn.a.a) {
            if (!$$4) {
               this.b.c(cjo.a(this.b, cqp.vR));
               this.c = bxn.a.b;
               this.b.b(true);
            }
         } else if (this.c == bxn.a.b) {
            if (!this.b.fs()) {
               this.c = bxn.a.a;
            }

            int $$5 = this.b.fw();
            cqm $$6 = this.b.fu();
            if ($$5 >= cox.k($$6)) {
               this.b.fx();
               this.c = bxn.a.c;
               this.g = 20 + this.b.ei().a(20);
               this.b.b(false);
            }
         } else if (this.c == bxn.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bxn.a.d;
            }
         } else if (this.c == bxn.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cqm $$7 = this.b.b(cjo.a(this.b, cqp.vR));
            cox.a($$7, false);
            this.c = bxn.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bxn.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
