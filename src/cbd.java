import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cbd extends cak {
   public static final int b = 1;
   protected final btu c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<btu, awt<brl>> a;

   public cbd(btu $$0, double $$1) {
      this($$0, $$1, awf.F);
   }

   public cbd(btu $$0, double $$1, awt<brl> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cbd(btu $$0, double $$1, Function<btu, awt<brl>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bR()) {
            jd $$0 = this.a(this.c.dQ(), this.c, 5);
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
      return this.c.ez() != null && this.c.ez().a(this.a.apply(this.c));
   }

   protected boolean i() {
      eww $$0 = ceh.a(this.c, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.e = $$0.c;
         this.f = $$0.d;
         this.g = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.h;
   }

   @Override
   public void d() {
      this.c.J().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.J().l();
   }

   @Nullable
   protected jd a(dca $$0, bsq $$1, int $$2) {
      jd $$3 = $$1.dq();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : jd.a($$1.dq(), $$2, 1, $$1x -> $$0.b_($$1x).a(awj.a)).orElse(null);
   }
}
