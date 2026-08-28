import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eja<C extends ede> {
   Optional<eiz<C>> createGenerator(eja.a<C> var1);

   static <C extends ede> eja<C> simple(Predicate<eja.a<C>> $$0, eiz<C> $$1) {
      Optional<eiz<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ede> Predicate<eja.a<C>> checkForBiomeOnTop(dxw.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ede>(dub a, ddd b, dyk c, long d, dbh e, C f, dcc g, Predicate<ji<dcz>> h, emn i, jw j) {
      public boolean a(dxw.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcz> $$4 = this.a.d().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
