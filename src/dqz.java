import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dqz {
   dqz a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsp::cz)
         .toList();
   dqz b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsp::cz)
         .toList();
   dqz c = ($$0, $$1, $$2, $$3, $$4) -> {
      evh $$5 = new evh($$2).g($$3);
      return $$1.a($$0, bsv.aJ, $$5, btk::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bsp::cz).toList();
   };

   List<UUID> detect(arb var1, dqz.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dbt $$0, evm $$1, evm $$2) {
      evi $$3 = $$0.a(new dbc($$2, $$1, dbc.a.c, dbc.b.a, evr.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evk.a.a;
   }

   public interface a {
      dqz.a a = new dqz.a() {
         @Override
         public List<arc> a(arb $$0, Predicate<? super cms> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsp> List<T> a(arb $$0, dwe<bsp, T> $$1, evh $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cms> a(arb var1, Predicate<? super cms> var2);

      <T extends bsp> List<T> a(arb var1, dwe<bsp, T> var2, evh var3, Predicate<? super T> var4);

      static dqz.a a(cms $$0) {
         return a(List.of($$0));
      }

      static dqz.a a(final List<cms> $$0) {
         return new dqz.a() {
            @Override
            public List<cms> a(arb $$0x, Predicate<? super cms> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsp> List<T> a(arb $$0x, dwe<bsp, T> $$1, evh $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
