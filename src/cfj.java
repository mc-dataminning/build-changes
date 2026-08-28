import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cfj extends ceq {
   public static final int b = 1;
   protected final byc c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<byc, axt<bvk>> a;

   public cfj(byc $$0, double $$1) {
      this($$0, $$1, axf.F);
   }

   public cfj(byc $$0, double $$1, axt<bvk> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cfj(byc $$0, double $$1, Function<byc, axt<bvk>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ceq.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bX()) {
            iv $$0 = this.a(this.c.dV(), this.c, 5);
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
      return this.c.eI() != null && this.c.eI().a(this.a.apply(this.c));
   }

   protected boolean i() {
      ffq $$0 = cin.a(this.c, 5, 4);
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
      this.c.O().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.O().k();
   }

   @Nullable
   protected iv a(djb $$0, bwt $$1, int $$2) {
      iv $$3 = $$1.dv();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : iv.a($$1.dv(), $$2, 1, $$1x -> $$0.b_($$1x).a(axj.a)).orElse(null);
   }
}
