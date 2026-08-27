import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dya<C extends dse> {
   Optional<dxz<C>> createGenerator(dya.a<C> var1);

   static <C extends dse> dya<C> simple(Predicate<dya.a<C>> $$0, dxz<C> $$1) {
      Optional<dxz<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dse> Predicate<dya.a<C>> checkForBiomeOnTop(dmw.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dse>(djk a, cth b, dnk c, long d, crm e, C f, csh g, Predicate<ig<ctd>> h, ebn i, it j) {
      public boolean a(dmw.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         ig<ctd> $$4 = this.a.c().getNoiseBiome(ir.a($$1), ir.a($$3), ir.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
