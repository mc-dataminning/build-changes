import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drn {
   drn a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dr().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bz()))
         .map(bsh::cB)
         .toList();
   drn b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dr().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bz()))
         .map(bsh::cB)
         .toList();
   drn c = ($$0, $$1, $$2, $$3, $$4) -> {
      ewc $$5 = new ewc($$2).g($$3);
      return $$1.a($$0, bsn.aJ, $$5, btc::bF).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bz())).map(bsh::cB).toList();
   };

   List<UUID> detect(aqm var1, drn.a var2, ja var3, double var4, boolean var6);

   private static boolean a(dcg $$0, ewh $$1, ewh $$2) {
      ewd $$3 = $$0.a(new dbp($$2, $$1, dbp.a.c, dbp.b.a, ewm.a()));
      return $$3.a().equals(ja.a($$1)) || $$3.c() == ewf.a.a;
   }

   public interface a {
      drn.a a = new drn.a() {
         @Override
         public List<aqn> a(aqm $$0, Predicate<? super cml> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsh> List<T> a(aqm $$0, dwv<bsh, T> $$1, ewc $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cml> a(aqm var1, Predicate<? super cml> var2);

      <T extends bsh> List<T> a(aqm var1, dwv<bsh, T> var2, ewc var3, Predicate<? super T> var4);

      static drn.a a(cml $$0) {
         return a(List.of($$0));
      }

      static drn.a a(final List<cml> $$0) {
         return new drn.a() {
            @Override
            public List<cml> a(aqm $$0x, Predicate<? super cml> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsh> List<T> a(aqm $$0x, dwv<bsh, T> $$1, ewc $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
