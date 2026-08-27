import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eac<C extends dug> {
   Optional<eab<C>> createGenerator(eac.a<C> var1);

   static <C extends dug> eac<C> simple(Predicate<eac.a<C>> $$0, eab<C> $$1) {
      Optional<eab<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dug> Predicate<eac.a<C>> checkForBiomeOnTop(doy.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dug>(dlm a, cva b, dpm c, long d, cte e, C f, ctz g, Predicate<ih<cuw>> h, edp i, iu j) {
      public boolean a(doy.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ih<cuw> $$4 = this.a.c().getNoiseBiome(is.a($$1), is.a($$3), is.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
