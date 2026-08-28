import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dre {
   dre a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsu::cz)
         .toList();
   dre b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsu::cz)
         .toList();
   dre c = ($$0, $$1, $$2, $$3, $$4) -> {
      evm $$5 = new evm($$2).g($$3);
      return $$1.a($$0, bta.aJ, $$5, btp::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bsu::cz).toList();
   };

   List<UUID> detect(arf var1, dre.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dby $$0, evr $$1, evr $$2) {
      evn $$3 = $$0.a(new dbh($$2, $$1, dbh.a.c, dbh.b.a, evw.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evp.a.a;
   }

   public interface a {
      dre.a a = new dre.a() {
         @Override
         public List<arg> a(arf $$0, Predicate<? super cmx> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsu> List<T> a(arf $$0, dwj<bsu, T> $$1, evm $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmx> a(arf var1, Predicate<? super cmx> var2);

      <T extends bsu> List<T> a(arf var1, dwj<bsu, T> var2, evm var3, Predicate<? super T> var4);

      static dre.a a(cmx $$0) {
         return a(List.of($$0));
      }

      static dre.a a(final List<cmx> $$0) {
         return new dre.a() {
            @Override
            public List<cmx> a(arf $$0x, Predicate<? super cmx> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsu> List<T> a(arf $$0x, dwj<bsu, T> $$1, evm $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
