import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface esp<C extends emp> {
   Optional<eso<C>> createGenerator(esp.a<C> var1);

   static <C extends emp> esp<C> simple(Predicate<esp.a<C>> $$0, eso<C> $$1) {
      Optional<eso<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends emp> Predicate<esp.a<C>> checkForBiomeOnTop(ehd.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends emp>(edc a, dle b, ehr c, long d, djc e, C f, djz g, Predicate<jf<dla>> h, ewe i, jt j) {
      public boolean a(ehd.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jf<dla> $$4 = this.a.d().getNoiseBiome(jq.a($$1), jq.a($$3), jq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
