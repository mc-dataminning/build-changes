import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface enz<C extends eib> {
   Optional<eny<C>> createGenerator(enz.a<C> var1);

   static <C extends eib> enz<C> simple(Predicate<enz.a<C>> $$0, eny<C> $$1) {
      Optional<eny<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eib> Predicate<enz.a<C>> checkForBiomeOnTop(ecr.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eib>(dys a, dhn b, edf c, long d, dfn e, C f, dgj g, Predicate<jr<dhj>> h, ero i, kf j) {
      public boolean a(ecr.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jr<dhj> $$4 = this.a.d().getNoiseBiome(kc.a($$1), kc.a($$3), kc.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
