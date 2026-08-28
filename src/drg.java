import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drg {
   drg a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsw::cz)
         .toList();
   drg b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsw::cz)
         .toList();
   drg c = ($$0, $$1, $$2, $$3, $$4) -> {
      evo $$5 = new evo($$2).g($$3);
      return $$1.a($$0, btc.aJ, $$5, btr::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bsw::cz).toList();
   };

   List<UUID> detect(arf var1, drg.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dca $$0, evt $$1, evt $$2) {
      evp $$3 = $$0.a(new dbj($$2, $$1, dbj.a.c, dbj.b.a, evy.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evr.a.a;
   }

   public interface a {
      drg.a a = new drg.a() {
         @Override
         public List<arg> a(arf $$0, Predicate<? super cmz> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsw> List<T> a(arf $$0, dwl<bsw, T> $$1, evo $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmz> a(arf var1, Predicate<? super cmz> var2);

      <T extends bsw> List<T> a(arf var1, dwl<bsw, T> var2, evo var3, Predicate<? super T> var4);

      static drg.a a(cmz $$0) {
         return a(List.of($$0));
      }

      static drg.a a(final List<cmz> $$0) {
         return new drg.a() {
            @Override
            public List<cmz> a(arf $$0x, Predicate<? super cmz> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsw> List<T> a(arf $$0x, dwl<bsw, T> $$1, evo $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
