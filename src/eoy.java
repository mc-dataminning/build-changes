import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eoy<C extends eja> {
   Optional<eox<C>> createGenerator(eoy.a<C> var1);

   static <C extends eja> eoy<C> simple(Predicate<eoy.a<C>> $$0, eox<C> $$1) {
      Optional<eox<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eja> Predicate<eoy.a<C>> checkForBiomeOnTop(edq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eja>(dzr a, dio b, eee c, long d, dgo e, C f, dhk g, Predicate<jq<dik>> h, esn i, ke j) {
      public boolean a(edq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dik> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
