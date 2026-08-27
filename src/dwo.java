import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dwo<C extends dqs> {
   Optional<dwn<C>> createGenerator(dwo.a<C> var1);

   static <C extends dqs> dwo<C> simple(Predicate<dwo.a<C>> $$0, dwn<C> $$1) {
      Optional<dwn<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dqs> Predicate<dwo.a<C>> checkForBiomeOnTop(dlk.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dqs>(dhy a, csb b, dly c, long d, cqg e, C f, crb g, Predicate<ib<crx>> h, dzu i, ip j) {
      public boolean a(dlk.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ib<crx> $$4 = this.a.c().getNoiseBiome(in.a($$1), in.a($$3), in.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
