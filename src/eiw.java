import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface eiw<C extends eda> {
   Optional<eiv<C>> createGenerator(eiw.a<C> var1);

   static <C extends eda> eiw<C> simple(Predicate<eiw.a<C>> $$0, eiv<C> $$1) {
      Optional<eiv<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends eda> Predicate<eiw.a<C>> checkForBiomeOnTop(dxs.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends eda>(dtx a, dcz b, dyg c, long d, dbd e, C f, dby g, Predicate<ji<dcv>> h, emj i, jw j) {
      public boolean a(dxs.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ji<dcv> $$4 = this.a.d().getNoiseBiome(jt.a($$1), jt.a($$3), jt.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
