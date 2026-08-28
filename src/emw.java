import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface emw<C extends eha> {
   Optional<emv<C>> createGenerator(emw.a<C> var1);

   static <C extends eha> emw<C> simple(Predicate<emw.a<C>> $$0, emv<C> $$1) {
      Optional<emv<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eha> Predicate<emw.a<C>> checkForBiomeOnTop(ebq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eha>(dxr a, dgs b, ece c, long d, des e, C f, dfo g, Predicate<jq<dgo>> h, eql i, ke j) {
      public boolean a(ebq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dgo> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
