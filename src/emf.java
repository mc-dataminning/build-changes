import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface emf<C extends egj> {
   Optional<eme<C>> createGenerator(emf.a<C> var1);

   static <C extends egj> emf<C> simple(Predicate<emf.a<C>> $$0, eme<C> $$1) {
      Optional<eme<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends egj> Predicate<emf.a<C>> checkForBiomeOnTop(eaz.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends egj>(dxa a, dga b, ebn c, long d, deb e, C f, dex g, Predicate<jp<dfw>> h, epu i, kd j) {
      public boolean a(eaz.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jp<dfw> $$4 = this.a.d().getNoiseBiome(ka.a($$1), ka.a($$3), ka.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
