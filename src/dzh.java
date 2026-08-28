import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dzh {
   dzh a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwf::cG)
         .toList();
   dzh b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwf::cG)
         .toList();
   dzh c = ($$0, $$1, $$2, $$3, $$4) -> {
      fel $$5 = new fel($$2).g($$3);
      return $$1.a($$0, bwo.bb, $$5, bxe::bK).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE())).map(bwf::cG).toList();
   };

   List<UUID> detect(arq var1, dzh.a var2, iu var3, double var4, boolean var6);

   private static boolean a(dja $$0, feq $$1, feq $$2) {
      fem $$3 = $$0.a(new dij($$2, $$1, dij.a.c, dij.b.a, fev.a()));
      return $$3.b().equals(iu.a((jo)$$1)) || $$3.d() == feo.a.a;
   }

   public interface a {
      dzh.a a = new dzh.a() {
         @Override
         public List<arr> a(arq $$0, Predicate<? super crc> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwf> List<T> a(arq $$0, eet<bwf, T> $$1, fel $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends crc> a(arq var1, Predicate<? super crc> var2);

      <T extends bwf> List<T> a(arq var1, eet<bwf, T> var2, fel var3, Predicate<? super T> var4);

      static dzh.a a(crc $$0) {
         return a(List.of($$0));
      }

      static dzh.a a(final List<crc> $$0) {
         return new dzh.a() {
            @Override
            public List<crc> a(arq $$0x, Predicate<? super crc> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwf> List<T> a(arq $$0x, eet<bwf, T> $$1, fel $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
