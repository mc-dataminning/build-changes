import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface epu<C extends ejv> {
   Optional<ept<C>> createGenerator(epu.a<C> var1);

   static <C extends ejv> epu<C> simple(Predicate<epu.a<C>> $$0, ept<C> $$1) {
      Optional<ept<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ejv> Predicate<epu.a<C>> checkForBiomeOnTop(eel.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ejv>(eak a, diw b, eez c, long d, dgw e, C f, dhr g, Predicate<js<dis>> h, etj i, kg j) {
      public boolean a(eel.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         js<dis> $$4 = this.a.d().getNoiseBiome(kd.a($$1), kd.a($$3), kd.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
