import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ege<C extends eai> {
   Optional<egd<C>> createGenerator(ege.a<C> var1);

   static <C extends eai> ege<C> simple(Predicate<ege.a<C>> $$0, egd<C> $$1) {
      Optional<egd<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eai> Predicate<ege.a<C>> checkForBiomeOnTop(dva.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eai>(drf a, daj b, dvo c, long d, cyn e, C f, czi g, Predicate<in<daf>> h, ejr i, jb j) {
      public boolean a(dva.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         in<daf> $$4 = this.a.c().getNoiseBiome(iy.a($$1), iy.a($$3), iy.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
