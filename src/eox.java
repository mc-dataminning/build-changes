import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eox<C extends eiz> {
   Optional<eow<C>> createGenerator(eox.a<C> var1);

   static <C extends eiz> eox<C> simple(Predicate<eox.a<C>> $$0, eow<C> $$1) {
      Optional<eow<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eiz> Predicate<eox.a<C>> checkForBiomeOnTop(edp.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eiz>(dzq a, din b, eed c, long d, dgn e, C f, dhj g, Predicate<jq<dij>> h, esm i, ke j) {
      public boolean a(edp.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dij> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
