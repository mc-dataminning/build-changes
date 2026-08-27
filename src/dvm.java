import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvm<C extends dpq> {
   Optional<dvl<C>> createGenerator(dvm.a<C> var1);

   static <C extends dpq> dvm<C> simple(Predicate<dvm.a<C>> $$0, dvl<C> $$1) {
      Optional<dvl<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dpq> Predicate<dvm.a<C>> checkForBiomeOnTop(dki.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dpq>(dgw a, cqn b, dkw c, long d, cos e, C f, cpn g, Predicate<he<cqj>> h, dys i, hs j) {
      public boolean a(dki.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         he<cqj> $$4 = this.a.c().getNoiseBiome(hq.a($$1), hq.a($$3), hq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
