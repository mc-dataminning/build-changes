import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eix<C extends edb> {
   Optional<eiw<C>> createGenerator(eix.a<C> var1);

   static <C extends edb> eix<C> simple(Predicate<eix.a<C>> $$0, eiw<C> $$1) {
      Optional<eiw<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edb> Predicate<eix.a<C>> checkForBiomeOnTop(dxt.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edb>(dty a, dda b, dyh c, long d, dbe e, C f, dbz g, Predicate<ji<dcw>> h, emk i, jw j) {
      public boolean a(dxt.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcw> $$4 = this.a.d().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
