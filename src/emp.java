import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface emp<C extends egt> {
   Optional<emo<C>> createGenerator(emp.a<C> var1);

   static <C extends egt> emp<C> simple(Predicate<emp.a<C>> $$0, emo<C> $$1) {
      Optional<emo<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends egt> Predicate<emp.a<C>> checkForBiomeOnTop(ebj.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends egt>(dxk a, dgl b, ebx c, long d, del e, C f, dfh g, Predicate<jq<dgh>> h, eqe i, ke j) {
      public boolean a(ebj.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jq<dgh> $$4 = this.a.d().getNoiseBiome(kb.a($$1), kb.a($$3), kb.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
