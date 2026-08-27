import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bso<T extends bml> extends bth {
   protected final bmu a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected efg d;
   protected final bvv e;
   protected final Class<T> f;
   protected final Predicate<bml> g;
   protected final Predicate<bml> h;
   private final bwz k;

   public bso(bmu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bly.e::test);
   }

   public bso(bmu $$0, Class<T> $$1, Predicate<bml> $$2, float $$3, double $$4, double $$5, Predicate<bml> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.N();
      this.a(EnumSet.of(bth.a.a));
      this.k = bwz.a().a((double)$$3).a($$6.and($$2));
   }

   public bso(bmu $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bml> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dM()
         .a(this.a.dM().a(this.f, this.a.cH().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dr(), this.a.dt(), this.a.dx());
      if (this.b == null) {
         return false;
      } else {
         elt $$0 = bxd.a(this.a, 16, 7, this.b.dk());
         if ($$0 == null) {
            return false;
         } else if (this.b.i($$0.c, $$0.d, $$0.e) < this.b.f(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.c, $$0.d, $$0.e, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.e.l();
   }

   @Override
   public void c() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public void e() {
      if (this.a.f((blv)this.b) < 49.0) {
         this.a.N().a(this.j);
      } else {
         this.a.N().a(this.i);
      }
   }
}
