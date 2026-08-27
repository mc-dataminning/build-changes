import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface egu<C extends eay> {
   Optional<egt<C>> createGenerator(egu.a<C> var1);

   static <C extends eay> egu<C> simple(Predicate<egu.a<C>> $$0, egt<C> $$1) {
      Optional<egt<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eay> Predicate<egu.a<C>> checkForBiomeOnTop(dvq.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eay>(drv a, dax b, dwe c, long d, czb e, C f, czw g, Predicate<iv<dat>> h, ekh i, jj j) {
      public boolean a(dvq.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         iv<dat> $$4 = this.a.c().getNoiseBiome(jg.a($$1), jg.a($$3), jg.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
