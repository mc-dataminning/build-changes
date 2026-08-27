import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eds<C extends dxw> {
   Optional<edr<C>> createGenerator(eds.a<C> var1);

   static <C extends dxw> eds<C> simple(Predicate<eds.a<C>> $$0, edr<C> $$1) {
      Optional<edr<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dxw> Predicate<eds.a<C>> checkForBiomeOnTop(dso.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dxw>(doy a, cye b, dtc c, long d, cwi e, C f, cxd g, Predicate<il<cya>> h, ehf i, iz j) {
      public boolean a(dso.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         il<cya> $$4 = this.a.c().getNoiseBiome(iw.a($$1), iw.a($$3), iw.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
