import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvn<C extends dpr> {
   Optional<dvm<C>> createGenerator(dvn.a<C> var1);

   static <C extends dpr> dvn<C> simple(Predicate<dvn.a<C>> $$0, dvm<C> $$1) {
      Optional<dvm<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dpr> Predicate<dvn.a<C>> checkForBiomeOnTop(dkj.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dpr>(dgx a, cqo b, dkx c, long d, cot e, C f, cpo g, Predicate<he<cqk>> h, dyt i, hs j) {
      public boolean a(dkj.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         he<cqk> $$4 = this.a.c().getNoiseBiome(hq.a($$1), hq.a($$3), hq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
