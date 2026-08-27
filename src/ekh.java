import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ekh<C extends eek> {
   Optional<ekg<C>> createGenerator(ekh.a<C> var1);

   static <C extends eek> ekh<C> simple(Predicate<ekh.a<C>> $$0, ekg<C> $$1) {
      Optional<ekg<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eek> Predicate<ekh.a<C>> checkForBiomeOnTop(dyu.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eek>(duz a, ddd b, dzi c, long d, dbh e, C f, dcc g, Predicate<ja<dcz>> h, enu i, jo j) {
      public boolean a(dyu.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ja<dcz> $$4 = this.a.c().getNoiseBiome(jl.a($$1), jl.a($$3), jl.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
