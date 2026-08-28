import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface erh<C extends eli> {
   Optional<erg<C>> createGenerator(erh.a<C> var1);

   static <C extends eli> erh<C> simple(Predicate<erh.a<C>> $$0, erg<C> $$1) {
      Optional<erg<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eli> Predicate<erh.a<C>> checkForBiomeOnTop(efy.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eli>(ebx a, dkc b, egm c, long d, dic e, C f, dix g, Predicate<je<djy>> h, euw i, js j) {
      public boolean a(efy.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         je<djy> $$4 = this.a.d().getNoiseBiome(jp.a($$1), jp.a($$3), jp.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
