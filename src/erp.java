import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface erp<C extends elq> {
   Optional<ero<C>> createGenerator(erp.a<C> var1);

   static <C extends elq> erp<C> simple(Predicate<erp.a<C>> $$0, ero<C> $$1) {
      Optional<ero<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends elq> Predicate<erp.a<C>> checkForBiomeOnTop(egg.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends elq>(ecf a, dkh b, egu c, long d, dih e, C f, djc g, Predicate<je<dkd>> h, eve i, js j) {
      public boolean a(egg.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         je<dkd> $$4 = this.a.d().getNoiseBiome(jp.a($$1), jp.a($$3), jp.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
