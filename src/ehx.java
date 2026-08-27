import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ehx<C extends ecb> {
   Optional<ehw<C>> createGenerator(ehx.a<C> var1);

   static <C extends ecb> ehx<C> simple(Predicate<ehx.a<C>> $$0, ehw<C> $$1) {
      Optional<ehw<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends ecb> Predicate<ehx.a<C>> checkForBiomeOnTop(dwt.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends ecb>(dsy a, dca b, dxh c, long d, dae e, C f, daz g, Predicate<ix<dbw>> h, elk i, jl j) {
      public boolean a(dwt.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ix<dbw> $$4 = this.a.c().getNoiseBiome(ji.a($$1), ji.a($$3), ji.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
