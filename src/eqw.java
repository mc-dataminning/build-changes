import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eqw<C extends ekx> {
   Optional<eqv<C>> createGenerator(eqw.a<C> var1);

   static <C extends ekx> eqw<C> simple(Predicate<eqw.a<C>> $$0, eqv<C> $$1) {
      Optional<eqv<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ekx> Predicate<eqw.a<C>> checkForBiomeOnTop(efn.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ekx>(ebm a, djw b, egb c, long d, dhw e, C f, dir g, Predicate<je<djs>> h, eul i, js j) {
      public boolean a(efn.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         je<djs> $$4 = this.a.d().getNoiseBiome(jp.a($$1), jp.a($$3), jp.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
