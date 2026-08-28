import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eiy<C extends edc> {
   Optional<eix<C>> createGenerator(eiy.a<C> var1);

   static <C extends edc> eiy<C> simple(Predicate<eiy.a<C>> $$0, eix<C> $$1) {
      Optional<eix<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edc> Predicate<eiy.a<C>> checkForBiomeOnTop(dxu.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edc>(dtz a, ddb b, dyi c, long d, dbf e, C f, dca g, Predicate<ji<dcx>> h, eml i, jw j) {
      public boolean a(dxu.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcx> $$4 = this.a.d().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
