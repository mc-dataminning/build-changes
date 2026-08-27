import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dok {
   dok a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(bqa::cw).toList();
   dok b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.N_()).stream().map(bqa::cw).toList();
   dok c = ($$0, $$1, $$2, $$3) -> {
      ese $$4 = new ese($$2).g($$3);
      return $$1.a($$0, bqg.aI, $$4, bqt::bA).stream().map(bqa::cw).toList();
   };

   List<UUID> detect(apu var1, dok.a var2, id var3, double var4);

   public interface a {
      dok.a a = new dok.a() {
         @Override
         public List<apv> a(apu $$0, Predicate<? super cka> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bqa> List<T> a(apu $$0, dtp<bqa, T> $$1, ese $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cka> a(apu var1, Predicate<? super cka> var2);

      <T extends bqa> List<T> a(apu var1, dtp<bqa, T> var2, ese var3, Predicate<? super T> var4);

      static dok.a a(cka $$0) {
         return a(List.of($$0));
      }

      static dok.a a(final List<cka> $$0) {
         return new dok.a() {
            @Override
            public List<cka> a(apu $$0x, Predicate<? super cka> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bqa> List<T> a(apu $$0x, dtp<bqa, T> $$1, ese $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
