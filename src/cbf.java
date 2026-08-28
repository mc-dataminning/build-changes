import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbf<T extends bva> extends cby {
   protected final bvi a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected ery d;
   protected final cem e;
   protected final Class<T> f;
   protected final Predicate<bva> g;
   protected final Predicate<bva> h;
   private final cfr k;

   public cbf(bvi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, buj.e::test);
   }

   public cbf(bvi $$0, Class<T> $$1, Predicate<bva> $$2, float $$3, double $$4, double $$5, Predicate<bva> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.P();
      this.a(EnumSet.of(cby.a.a));
      this.k = cfr.a().a((double)$$3).a($$6.and($$2));
   }

   public cbf(bvi $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bva> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = this.a
         .dX()
         .a(this.a.dX().a(this.f, this.a.cS().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dC(), this.a.dE(), this.a.dI());
      if (this.b == null) {
         return false;
      } else {
         ezn $$0 = cfv.a(this.a, 16, 7, this.b.dv());
         if ($$0 == null) {
            return false;
         } else if (this.b.i($$0.d, $$0.e, $$0.f) < this.b.g(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.d, $$0.e, $$0.f, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.e.m();
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
      if (this.a.g((bue)this.b) < 49.0) {
         this.a.P().a(this.j);
      } else {
         this.a.P().a(this.i);
      }
   }
}
