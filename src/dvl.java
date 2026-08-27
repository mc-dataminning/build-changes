import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvl<C extends dpp> {
   Optional<dvk<C>> createGenerator(dvl.a<C> var1);

   static <C extends dpp> dvl<C> simple(Predicate<dvl.a<C>> $$0, dvk<C> $$1) {
      Optional<dvk<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dpp> Predicate<dvl.a<C>> checkForBiomeOnTop(dkh.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dpp>(dgv a, cqm b, dkv c, long d, cor e, C f, cpm g, Predicate<hf<cqi>> h, dyr i, ht j) {
      public boolean a(dkh.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         hf<cqi> $$4 = this.a.c().getNoiseBiome(hr.a($$1), hr.a($$3), hr.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
