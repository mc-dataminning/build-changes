import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eox<C extends eiy> {
   Optional<eow<C>> createGenerator(eox.a<C> var1);

   static <C extends eiy> eox<C> simple(Predicate<eox.a<C>> $$0, eow<C> $$1) {
      Optional<eow<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eiy> Predicate<eox.a<C>> checkForBiomeOnTop(edo.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eiy>(dzn a, dig b, eec c, long d, dgg e, C f, dhb g, Predicate<jr<dic>> h, esm i, kf j) {
      public boolean a(edo.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jr<dic> $$4 = this.a.d().getNoiseBiome(kc.a($$1), kc.a($$3), kc.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
