import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eoq<C extends eis> {
   Optional<eop<C>> createGenerator(eoq.a<C> var1);

   static <C extends eis> eoq<C> simple(Predicate<eoq.a<C>> $$0, eop<C> $$1) {
      Optional<eop<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eis> Predicate<eoq.a<C>> checkForBiomeOnTop(edi.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eis>(dzj a, dig b, edw c, long d, dgg e, C f, dhc g, Predicate<jq<dic>> h, esf i, ke j) {
      public boolean a(edi.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dic> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
