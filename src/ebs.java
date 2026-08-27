import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface ebs<C extends dvw> {
   Optional<ebr<C>> createGenerator(ebs.a<C> var1);

   static <C extends dvw> ebs<C> simple(Predicate<ebs.a<C>> $$0, ebr<C> $$1) {
      Optional<ebr<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dvw> Predicate<ebs.a<C>> checkForBiomeOnTop(dqo.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dvw>(dnc a, cwq b, drc c, long d, cuu e, C f, cvp g, Predicate<ij<cwm>> h, eff i, iw j) {
      public boolean a(dqo.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ij<cwm> $$4 = this.a.c().getNoiseBiome(iu.a($$1), iu.a($$3), iu.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
