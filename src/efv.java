import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface efv<C extends dzz> {
   Optional<efu<C>> createGenerator(efv.a<C> var1);

   static <C extends dzz> efv<C> simple(Predicate<efv.a<C>> $$0, efu<C> $$1) {
      Optional<efu<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dzz> Predicate<efv.a<C>> checkForBiomeOnTop(dur.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dzz>(dqw a, daa b, dvf c, long d, cye e, C f, cyz g, Predicate<il<czw>> h, eji i, iz j) {
      public boolean a(dur.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         il<czw> $$4 = this.a.c().getNoiseBiome(iw.a($$1), iw.a($$3), iw.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
