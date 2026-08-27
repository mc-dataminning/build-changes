import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dxv<C extends drz> {
   Optional<dxu<C>> createGenerator(dxv.a<C> var1);

   static <C extends drz> dxv<C> simple(Predicate<dxv.a<C>> $$0, dxu<C> $$1) {
      Optional<dxu<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends drz> Predicate<dxv.a<C>> checkForBiomeOnTop(dmr.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends drz>(djf a, ctc b, dnf c, long d, crh e, C f, csc g, Predicate<ib<csy>> h, ebi i, ip j) {
      public boolean a(dmr.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ib<csy> $$4 = this.a.c().getNoiseBiome(in.a($$1), in.a($$3), in.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
