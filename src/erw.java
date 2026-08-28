import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface erw<C extends elx> {
   Optional<erv<C>> createGenerator(erw.a<C> var1);

   static <C extends elx> erw<C> simple(Predicate<erw.a<C>> $$0, erv<C> $$1) {
      Optional<erv<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends elx> Predicate<erw.a<C>> checkForBiomeOnTop(egn.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends elx>(ecm a, dko b, ehb c, long d, dio e, C f, djj g, Predicate<jf<dkk>> h, evl i, jt j) {
      public boolean a(egn.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jf<dkk> $$4 = this.a.d().getNoiseBiome(jq.a($$1), jq.a($$3), jq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
