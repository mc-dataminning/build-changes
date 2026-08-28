import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ejl<C extends edp> {
   Optional<ejk<C>> createGenerator(ejl.a<C> var1);

   static <C extends edp> ejl<C> simple(Predicate<ejl.a<C>> $$0, ejk<C> $$1) {
      Optional<ejk<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edp> Predicate<ejl.a<C>> checkForBiomeOnTop(dyg.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edp>(dui a, ddk b, dyu c, long d, dbn e, C f, dci g, Predicate<jj<ddg>> h, emz i, jx j) {
      public boolean a(dyg.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jj<ddg> $$4 = this.a.d().getNoiseBiome(ju.a($$1), ju.a($$3), ju.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
