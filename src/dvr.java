import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvr<C extends dpv> {
   Optional<dvq<C>> createGenerator(dvr.a<C> var1);

   static <C extends dpv> dvr<C> simple(Predicate<dvr.a<C>> $$0, dvq<C> $$1) {
      Optional<dvq<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dpv> Predicate<dvr.a<C>> checkForBiomeOnTop(dkn.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dpv>(dhb a, cqs b, dlb c, long d, cox e, C f, cps g, Predicate<hg<cqo>> h, dyx i, hu j) {
      public boolean a(dkn.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         hg<cqo> $$4 = this.a.c().getNoiseBiome(hs.a($$1), hs.a($$3), hs.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
