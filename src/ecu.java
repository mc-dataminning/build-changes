import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ecu<C extends dwy> {
   Optional<ect<C>> createGenerator(ecu.a<C> var1);

   static <C extends dwy> ecu<C> simple(Predicate<ecu.a<C>> $$0, ect<C> $$1) {
      Optional<ect<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dwy> Predicate<ecu.a<C>> checkForBiomeOnTop(drq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dwy>(dob a, cxh b, dse c, long d, cvl e, C f, cwg g, Predicate<il<cxd>> h, egh i, iy j) {
      public boolean a(drq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         il<cxd> $$4 = this.a.c().getNoiseBiome(iw.a($$1), iw.a($$3), iw.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
