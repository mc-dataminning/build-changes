import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eiz<C extends edd> {
   Optional<eiy<C>> createGenerator(eiz.a<C> var1);

   static <C extends edd> eiz<C> simple(Predicate<eiz.a<C>> $$0, eiy<C> $$1) {
      Optional<eiy<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edd> Predicate<eiz.a<C>> checkForBiomeOnTop(dxv.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edd>(dua a, ddc b, dyj c, long d, dbg e, C f, dcb g, Predicate<ji<dcy>> h, emm i, jw j) {
      public boolean a(dxv.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcy> $$4 = this.a.d().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
