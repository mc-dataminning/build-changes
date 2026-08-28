import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eor<C extends eit> {
   Optional<eoq<C>> createGenerator(eor.a<C> var1);

   static <C extends eit> eor<C> simple(Predicate<eor.a<C>> $$0, eoq<C> $$1) {
      Optional<eoq<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eit> Predicate<eor.a<C>> checkForBiomeOnTop(edj.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eit>(dzk a, dif b, edx c, long d, dgf e, C f, dhb g, Predicate<jq<dib>> h, esg i, ke j) {
      public boolean a(edj.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dib> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
