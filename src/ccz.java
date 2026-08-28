import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccz extends ccg {
   public static final int b = 1;
   protected final bvq c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvq, axf<bte>> a;

   public ccz(bvq $$0, double $$1) {
      this($$0, $$1, awr.F);
   }

   public ccz(bvq $$0, double $$1, axf<bte> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccz(bvq $$0, double $$1, Function<bvq, axf<bte>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            ji $$0 = this.a(this.c.dV(), this.c, 5);
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
      return this.c.eF() != null && this.c.eF().a(this.a.apply(this.c));
   }

   protected boolean i() {
      fbb $$0 = cgd.a(this.c, 5, 4);
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
      this.c.P().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.P().k();
   }

   @Nullable
   protected ji a(dfo $$0, bum $$1, int $$2) {
      ji $$3 = $$1.dv();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : ji.a($$1.dv(), $$2, 1, $$1x -> $$0.b_($$1x).a(awv.a)).orElse(null);
   }
}
