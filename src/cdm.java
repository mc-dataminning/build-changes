import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdm<T extends bxj> extends cef {
   protected final bxr a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected exo d;
   protected final cgt e;
   protected final Class<T> f;
   protected final Predicate<bxj> g;
   protected final Predicate<bxj> h;
   private final chy k;

   public cdm(bxr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bwp.e::test);
   }

   public cdm(bxr $$0, Class<T> $$1, Predicate<bxj> $$2, float $$3, double $$4, double $$5, Predicate<bxj> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.O();
      this.a(EnumSet.of(cef.a.a));
      this.k = chy.a().a((double)$$3).a(($$2x, $$3x) -> $$6.test($$2x) && $$2.test($$2x));
   }

   public cdm(bxr $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bxj> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = a(this.a)
         .a(this.a.dU().a(this.f, this.a.cQ().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dz(), this.a.dB(), this.a.dF());
      if (this.b == null) {
         return false;
      } else {
         ffc $$0 = cic.a(this.a, 16, 7, this.b.ds());
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
      if (this.a.g((bwi)this.b) < 49.0) {
         this.a.O().a(this.j);
      } else {
         this.a.O().a(this.i);
      }
   }
}
