import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eob<C extends eid> {
   Optional<eoa<C>> createGenerator(eob.a<C> var1);

   static <C extends eid> eob<C> simple(Predicate<eob.a<C>> $$0, eoa<C> $$1) {
      Optional<eoa<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eid> Predicate<eob.a<C>> checkForBiomeOnTop(ect.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eid>(dyu a, dhp b, edh c, long d, dfp e, C f, dgl g, Predicate<jr<dhl>> h, erq i, kf j) {
      public boolean a(ect.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jr<dhl> $$4 = this.a.d().getNoiseBiome(kc.a($$1), kc.a($$3), kc.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
