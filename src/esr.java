import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface esr<C extends emr> {
   Optional<esq<C>> createGenerator(esr.a<C> var1);

   static <C extends emr> esr<C> simple(Predicate<esr.a<C>> $$0, esq<C> $$1) {
      Optional<esq<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends emr> Predicate<esr.a<C>> checkForBiomeOnTop(ehf.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends emr>(ede a, dlg b, eht c, long d, dje e, C f, dkb g, Predicate<jg<dlc>> h, ewg i, ju j) {
      public boolean a(ehf.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jg<dlc> $$4 = this.a.d().getNoiseBiome(jr.a($$1), jr.a($$3), jr.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
