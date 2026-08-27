import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dzc<C extends dtg> {
   Optional<dzb<C>> createGenerator(dzc.a<C> var1);

   static <C extends dtg> dzc<C> simple(Predicate<dzc.a<C>> $$0, dzb<C> $$1) {
      Optional<dzb<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dtg> Predicate<dzc.a<C>> checkForBiomeOnTop(dny.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dtg>(dkm a, cub b, dom c, long d, csf e, C f, cta g, Predicate<ie<ctx>> h, ecp i, is j) {
      public boolean a(dny.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ie<ctx> $$4 = this.a.c().getNoiseBiome(iq.a($$1), iq.a($$3), iq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
