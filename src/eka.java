import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eka<C extends eee> {
   Optional<ejz<C>> createGenerator(eka.a<C> var1);

   static <C extends eee> eka<C> simple(Predicate<eka.a<C>> $$0, ejz<C> $$1) {
      Optional<ejz<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eee> Predicate<eka.a<C>> checkForBiomeOnTop(dyv.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eee>(dux a, ddy b, dzj c, long d, dcb e, C f, dcw g, Predicate<jm<ddu>> h, eno i, ka j) {
      public boolean a(dyv.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jm<ddu> $$4 = this.a.d().getNoiseBiome(jx.a($$1), jx.a($$3), jx.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
