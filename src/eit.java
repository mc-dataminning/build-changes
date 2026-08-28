import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eit<C extends ecx> {
   Optional<eis<C>> createGenerator(eit.a<C> var1);

   static <C extends ecx> eit<C> simple(Predicate<eit.a<C>> $$0, eis<C> $$1) {
      Optional<eis<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ecx> Predicate<eit.a<C>> checkForBiomeOnTop(dxp.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ecx>(dtu a, dcw b, dyd c, long d, dba e, C f, dbv g, Predicate<ji<dcs>> h, emg i, jw j) {
      public boolean a(dxp.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcs> $$4 = this.a.c().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
