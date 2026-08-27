import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ebz<C extends dwd> {
   Optional<eby<C>> createGenerator(ebz.a<C> var1);

   static <C extends dwd> ebz<C> simple(Predicate<ebz.a<C>> $$0, eby<C> $$1) {
      Optional<eby<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dwd> Predicate<ebz.a<C>> checkForBiomeOnTop(dqv.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dwd>(dng a, cwu b, drj c, long d, cuy e, C f, cvt g, Predicate<ij<cwq>> h, efm i, iw j) {
      public boolean a(dqv.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ij<cwq> $$4 = this.a.c().getNoiseBiome(iu.a($$1), iu.a($$3), iu.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
