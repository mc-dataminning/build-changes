import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvq<C extends dpu> {
   Optional<dvp<C>> createGenerator(dvq.a<C> var1);

   static <C extends dpu> dvq<C> simple(Predicate<dvq.a<C>> $$0, dvp<C> $$1) {
      Optional<dvp<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dpu> Predicate<dvq.a<C>> checkForBiomeOnTop(dkm.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dpu>(dha a, crd b, dla c, long d, cpi e, C f, cqd g, Predicate<he<cqz>> h, dyw i, hr j) {
      public boolean a(dkm.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         he<cqz> $$4 = this.a.c().getNoiseBiome(hp.a($$1), hp.a($$3), hp.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
