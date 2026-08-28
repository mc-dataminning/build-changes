import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface elq<C extends efu> {
   Optional<elp<C>> createGenerator(elq.a<C> var1);

   static <C extends efu> elq<C> simple(Predicate<elq.a<C>> $$0, elp<C> $$1) {
      Optional<elp<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends efu> Predicate<elq.a<C>> checkForBiomeOnTop(eak.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends efu>(dwl a, dfl b, eay c, long d, ddm e, C f, dei g, Predicate<jn<dfh>> h, epf i, kb j) {
      public boolean a(eak.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jn<dfh> $$4 = this.a.d().getNoiseBiome(jy.a($$1), jy.a($$3), jy.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
