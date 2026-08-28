import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface etb<C extends enb> {
   Optional<eta<C>> createGenerator(etb.a<C> var1);

   static <C extends enb> etb<C> simple(Predicate<etb.a<C>> $$0, eta<C> $$1) {
      Optional<eta<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends enb> Predicate<etb.a<C>> checkForBiomeOnTop(ehp.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends enb>(edo a, dlq b, eid c, long d, djo e, C f, dkl g, Predicate<jg<dlm>> h, ewq i, ju j) {
      public boolean a(ehp.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jg<dlm> $$4 = this.a.d().getNoiseBiome(jr.a($$1), jr.a($$3), jr.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
