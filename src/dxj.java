import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dxj<C extends drn> {
   Optional<dxi<C>> createGenerator(dxj.a<C> var1);

   static <C extends drn> dxj<C> simple(Predicate<dxj.a<C>> $$0, dxi<C> $$1) {
      Optional<dxi<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends drn> Predicate<dxj.a<C>> checkForBiomeOnTop(dmf.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends drn>(dit a, csu b, dmt c, long d, cqz e, C f, cru g, Predicate<ib<csq>> h, eaw i, ip j) {
      public boolean a(dmf.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ib<csq> $$4 = this.a.c().getNoiseBiome(in.a($$1), in.a($$3), in.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
