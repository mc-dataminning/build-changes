import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eny<C extends eia> {
   Optional<enx<C>> createGenerator(eny.a<C> var1);

   static <C extends eia> eny<C> simple(Predicate<eny.a<C>> $$0, enx<C> $$1) {
      Optional<enx<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eia> Predicate<eny.a<C>> checkForBiomeOnTop(ecq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eia>(dyr a, dhm b, ede c, long d, dfm e, C f, dgi g, Predicate<jr<dhi>> h, ern i, kf j) {
      public boolean a(ecq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jr<dhi> $$4 = this.a.d().getNoiseBiome(kc.a($$1), kc.a($$3), kc.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
