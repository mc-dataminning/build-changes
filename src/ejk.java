import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ejk<C extends edo> {
   Optional<ejj<C>> createGenerator(ejk.a<C> var1);

   static <C extends edo> ejk<C> simple(Predicate<ejk.a<C>> $$0, ejj<C> $$1) {
      Optional<ejj<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edo> Predicate<ejk.a<C>> checkForBiomeOnTop(dyf.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edo>(duh a, ddj b, dyt c, long d, dbm e, C f, dch g, Predicate<jj<ddf>> h, emx i, jx j) {
      public boolean a(dyf.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jj<ddf> $$4 = this.a.d().getNoiseBiome(ju.a($$1), ju.a($$3), ju.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
