import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccm extends cbt {
   public static final int b = 1;
   protected final bvd c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvd, axp<bsr>> a;

   public ccm(bvd $$0, double $$1) {
      this($$0, $$1, axb.F);
   }

   public ccm(bvd $$0, double $$1, axp<bsr> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccm(bvd $$0, double $$1, Function<bvd, axp<bsr>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cbt.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bZ()) {
            jg $$0 = this.a(this.c.dX(), this.c, 5);
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
      ezh $$0 = cfq.a(this.c, 5, 4);
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
      return !this.c.P().m();
   }

   @Nullable
   protected jg a(dea $$0, btz $$1, int $$2) {
      jg $$3 = $$1.dx();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : jg.a($$1.dx(), $$2, 1, $$1x -> $$0.b_($$1x).a(axf.a)).orElse(null);
   }
}
