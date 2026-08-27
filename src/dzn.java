import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dzn<C extends dtr> {
   Optional<dzm<C>> createGenerator(dzn.a<C> var1);

   static <C extends dtr> dzn<C> simple(Predicate<dzn.a<C>> $$0, dzm<C> $$1) {
      Optional<dzm<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dtr> Predicate<dzn.a<C>> checkForBiomeOnTop(doj.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dtr>(dkx a, cul b, dox c, long d, csp e, C f, ctk g, Predicate<ih<cuh>> h, eda i, iu j) {
      public boolean a(doj.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ih<cuh> $$4 = this.a.c().getNoiseBiome(is.a($$1), is.a($$3), is.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
