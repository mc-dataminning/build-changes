import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eoa<C extends eic> {
   Optional<enz<C>> createGenerator(eoa.a<C> var1);

   static <C extends eic> eoa<C> simple(Predicate<eoa.a<C>> $$0, enz<C> $$1) {
      Optional<enz<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eic> Predicate<eoa.a<C>> checkForBiomeOnTop(ecs.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eic>(dyt a, dho b, edg c, long d, dfo e, C f, dgk g, Predicate<jr<dhk>> h, erp i, kf j) {
      public boolean a(ecs.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jr<dhk> $$4 = this.a.d().getNoiseBiome(kc.a($$1), kc.a($$3), kc.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
