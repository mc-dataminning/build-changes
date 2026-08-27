import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvy<C extends dqc> {
   Optional<dvx<C>> createGenerator(dvy.a<C> var1);

   static <C extends dqc> dvy<C> simple(Predicate<dvy.a<C>> $$0, dvx<C> $$1) {
      Optional<dvx<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dqc> Predicate<dvy.a<C>> checkForBiomeOnTop(dku.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dqc>(dhi a, cqz b, dli c, long d, cpe e, C f, cpz g, Predicate<hg<cqv>> h, dze i, hu j) {
      public boolean a(dku.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         hg<cqv> $$4 = this.a.c().getNoiseBiome(hs.a($$1), hs.a($$3), hs.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
