import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ehz<C extends ecd> {
   Optional<ehy<C>> createGenerator(ehz.a<C> var1);

   static <C extends ecd> ehz<C> simple(Predicate<ehz.a<C>> $$0, ehy<C> $$1) {
      Optional<ehy<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ecd> Predicate<ehz.a<C>> checkForBiomeOnTop(dwv.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ecd>(dta a, dcc b, dxj c, long d, dag e, C f, dbb g, Predicate<ix<dby>> h, elm i, jl j) {
      public boolean a(dwv.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ix<dby> $$4 = this.a.c().getNoiseBiome(ji.a($$1), ji.a($$3), ji.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
