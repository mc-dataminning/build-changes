import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dzt<C extends dtx> {
   Optional<dzs<C>> createGenerator(dzt.a<C> var1);

   static <C extends dtx> dzt<C> simple(Predicate<dzt.a<C>> $$0, dzs<C> $$1) {
      Optional<dzs<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dtx> Predicate<dzt.a<C>> checkForBiomeOnTop(dop.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dtx>(dld a, cur b, dpd c, long d, csv e, C f, ctq g, Predicate<ih<cun>> h, edg i, iu j) {
      public boolean a(dop.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ih<cun> $$4 = this.a.c().getNoiseBiome(is.a($$1), is.a($$3), is.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
