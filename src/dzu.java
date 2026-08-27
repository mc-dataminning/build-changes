import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dzu<C extends dty> {
   Optional<dzt<C>> createGenerator(dzu.a<C> var1);

   static <C extends dty> dzu<C> simple(Predicate<dzu.a<C>> $$0, dzt<C> $$1) {
      Optional<dzt<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dty> Predicate<dzu.a<C>> checkForBiomeOnTop(doq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dty>(dle a, cus b, dpe c, long d, csw e, C f, ctr g, Predicate<ih<cuo>> h, edh i, iu j) {
      public boolean a(doq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ih<cuo> $$4 = this.a.c().getNoiseBiome(is.a($$1), is.a($$3), is.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
