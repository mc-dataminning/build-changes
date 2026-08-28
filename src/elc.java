import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface elc<C extends efg> {
   Optional<elb<C>> createGenerator(elc.a<C> var1);

   static <C extends efg> elc<C> simple(Predicate<elc.a<C>> $$0, elb<C> $$1) {
      Optional<elb<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends efg> Predicate<elc.a<C>> checkForBiomeOnTop(dzw.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends efg>(dvx a, dex b, eak c, long d, dcy e, C f, ddu g, Predicate<jn<det>> h, eor i, kb j) {
      public boolean a(dzw.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jn<det> $$4 = this.a.d().getNoiseBiome(jy.a($$1), jy.a($$3), jy.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
