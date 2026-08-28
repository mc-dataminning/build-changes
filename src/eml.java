import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eml<C extends egp> {
   Optional<emk<C>> createGenerator(eml.a<C> var1);

   static <C extends egp> eml<C> simple(Predicate<eml.a<C>> $$0, emk<C> $$1) {
      Optional<emk<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends egp> Predicate<eml.a<C>> checkForBiomeOnTop(ebf.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends egp>(dxg a, dgg b, ebt c, long d, deh e, C f, dfd g, Predicate<jq<dgc>> h, eqa i, ke j) {
      public boolean a(ebf.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dgc> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
