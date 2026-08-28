import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface esb<C extends emc> {
   Optional<esa<C>> createGenerator(esb.a<C> var1);

   static <C extends emc> esb<C> simple(Predicate<esb.a<C>> $$0, esa<C> $$1) {
      Optional<esa<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends emc> Predicate<esb.a<C>> checkForBiomeOnTop(egs.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends emc>(ecr a, dkt b, ehg c, long d, dir e, C f, djo g, Predicate<jf<dkp>> h, evq i, jt j) {
      public boolean a(egs.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jf<dkp> $$4 = this.a.d().getNoiseBiome(jq.a($$1), jq.a($$3), jq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
