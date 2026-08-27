import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dvw<C extends dqa> {
   Optional<dvv<C>> createGenerator(dvw.a<C> var1);

   static <C extends dqa> dvw<C> simple(Predicate<dvw.a<C>> $$0, dvv<C> $$1) {
      Optional<dvv<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dqa> Predicate<dvw.a<C>> checkForBiomeOnTop(dks.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dqa>(dhg a, cqx b, dlg c, long d, cpc e, C f, cpx g, Predicate<hg<cqt>> h, dzc i, hu j) {
      public boolean a(dks.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         hg<cqt> $$4 = this.a.c().getNoiseBiome(hs.a($$1), hs.a($$3), hs.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
