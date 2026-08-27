import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ehd<C extends ebh> {
   Optional<ehc<C>> createGenerator(ehd.a<C> var1);

   static <C extends ebh> ehd<C> simple(Predicate<ehd.a<C>> $$0, ehc<C> $$1) {
      Optional<ehc<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ebh> Predicate<ehd.a<C>> checkForBiomeOnTop(dvz.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ebh>(dse a, dbg b, dwn c, long d, czk e, C f, daf g, Predicate<iw<dbc>> h, ekq i, jk j) {
      public boolean a(dvz.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         iw<dbc> $$4 = this.a.c().getNoiseBiome(jh.a($$1), jh.a($$3), jh.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
