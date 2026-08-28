import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eje<C extends edi> {
   Optional<ejd<C>> createGenerator(eje.a<C> var1);

   static <C extends edi> eje<C> simple(Predicate<eje.a<C>> $$0, ejd<C> $$1) {
      Optional<ejd<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends edi> Predicate<eje.a<C>> checkForBiomeOnTop(dxz.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends edi>(due a, ddh b, dyn c, long d, dbk e, C f, dcf g, Predicate<jj<ddd>> h, emr i, jx j) {
      public boolean a(dxz.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jj<ddd> $$4 = this.a.d().getNoiseBiome(ju.a($$1), ju.a($$3), ju.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
