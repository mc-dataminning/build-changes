import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ekf<C extends eei> {
   Optional<eke<C>> createGenerator(ekf.a<C> var1);

   static <C extends eei> ekf<C> simple(Predicate<ekf.a<C>> $$0, eke<C> $$1) {
      Optional<eke<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eei> Predicate<ekf.a<C>> checkForBiomeOnTop(dyy.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eei>(duz a, dea b, dzm c, long d, dcd e, C f, dcy g, Predicate<jm<ddw>> h, enu i, ka j) {
      public boolean a(dyy.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jm<ddw> $$4 = this.a.d().getNoiseBiome(jx.a($$1), jx.a($$3), jx.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
