import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdh<T extends bxe> extends cea {
   protected final bxm a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected exc d;
   protected final cgo e;
   protected final Class<T> f;
   protected final Predicate<bxe> g;
   protected final Predicate<bxe> h;
   private final cht k;

   public cdh(bxm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bwm.e::test);
   }

   public cdh(bxm $$0, Class<T> $$1, Predicate<bxe> $$2, float $$3, double $$4, double $$5, Predicate<bxe> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.O();
      this.a(EnumSet.of(cea.a.a));
      this.k = cht.a().a((double)$$3).a(($$2x, $$3x) -> $$6.test($$2x) && $$2.test($$2x));
   }

   public cdh(bxm $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bxe> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = a(this.a)
         .a(this.a.dV().a(this.f, this.a.cR().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dA(), this.a.dC(), this.a.dG());
      if (this.b == null) {
         return false;
      } else {
         feq $$0 = chx.a(this.a, 16, 7, this.b.dt());
         if ($$0 == null) {
            return false;
         } else if (this.b.h($$0.d, $$0.e, $$0.f) < this.b.g(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.d, $$0.e, $$0.f, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.e.k();
   }

   @Override
   public void d() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void a() {
      if (this.a.g((bwf)this.b) < 49.0) {
         this.a.O().a(this.j);
      } else {
         this.a.O().a(this.i);
      }
   }
}
