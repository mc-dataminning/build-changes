import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface elu<C extends efy> {
   Optional<elt<C>> createGenerator(elu.a<C> var1);

   static <C extends efy> elu<C> simple(Predicate<elu.a<C>> $$0, elt<C> $$1) {
      Optional<elt<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends efy> Predicate<elu.a<C>> checkForBiomeOnTop(eao.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends efy>(dwp a, dfo b, ebc c, long d, ddp e, C f, del g, Predicate<jo<dfk>> h, epj i, kc j) {
      public boolean a(eao.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jo<dfk> $$4 = this.a.d().getNoiseBiome(jz.a($$1), jz.a($$3), jz.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
