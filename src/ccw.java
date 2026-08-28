import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccw extends ccd {
   public static final int b = 1;
   protected final bvn c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvn, axe<btb>> a;

   public ccw(bvn $$0, double $$1) {
      this($$0, $$1, awq.F);
   }

   public ccw(bvn $$0, double $$1, axe<btb> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccw(bvn $$0, double $$1, Function<bvn, axe<btb>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ccd.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            ji $$0 = this.a(this.c.dW(), this.c, 5);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.c.eG() != null && this.c.eG().a(this.a.apply(this.c));
   }

   protected boolean i() {
      fay $$0 = cga.a(this.c, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.e = $$0.d;
         this.f = $$0.e;
         this.g = $$0.f;
         return true;
      }
   }

   public boolean k() {
      return this.h;
   }

   @Override
   public void d() {
      this.c.L().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.L().k();
   }

   @Nullable
   protected ji a(dfl $$0, buj $$1, int $$2) {
      ji $$3 = $$1.dw();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : ji.a($$1.dw(), $$2, 1, $$1x -> $$0.b_($$1x).a(awu.a)).orElse(null);
   }
}
