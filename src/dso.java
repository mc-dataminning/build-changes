import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dso<C extends dms> {
   Optional<dsn<C>> createGenerator(dso.a<C> var1);

   static <C extends dms> dso<C> simple(Predicate<dso.a<C>> $$0, dsn<C> $$1) {
      Optional<dsn<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dms> Predicate<dso.a<C>> checkForBiomeOnTop(dhk.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dms>(ddy a, cno b, dhy c, long d, clt e, C f, cmo g, Predicate<he<cnk>> h, dvu i, hs j) {
      public boolean a(dhk.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         he<cnk> $$4 = this.a.c().getNoiseBiome(hq.a($$1), hq.a($$3), hq.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
