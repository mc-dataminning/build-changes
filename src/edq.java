import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface edq<C extends dxu> {
   Optional<edp<C>> createGenerator(edq.a<C> var1);

   static <C extends dxu> edq<C> simple(Predicate<edq.a<C>> $$0, edp<C> $$1) {
      Optional<edp<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dxu> Predicate<edq.a<C>> checkForBiomeOnTop(dsm.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dxu>(dow a, cyc b, dta c, long d, cwg e, C f, cxb g, Predicate<il<cxy>> h, ehd i, iz j) {
      public boolean a(dsm.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         il<cxy> $$4 = this.a.c().getNoiseBiome(iw.a($$1), iw.a($$3), iw.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
