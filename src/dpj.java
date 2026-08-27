import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dpj {
   dpj a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dn().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(brh::cx).toList();
   dpj b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dn().a($$2, $$3) && !$$2x.N_()).stream().map(brh::cx).toList();
   dpj c = ($$0, $$1, $$2, $$3) -> {
      etk $$4 = new etk($$2).g($$3);
      return $$1.a($$0, brn.aI, $$4, bsa::bB).stream().map(brh::cx).toList();
   };

   List<UUID> detect(aqh var1, dpj.a var2, in var3, double var4);

   public interface a {
      dpj.a a = new dpj.a() {
         @Override
         public List<aqi> a(aqh $$0, Predicate<? super clh> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends brh> List<T> a(aqh $$0, duo<brh, T> $$1, etk $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends clh> a(aqh var1, Predicate<? super clh> var2);

      <T extends brh> List<T> a(aqh var1, duo<brh, T> var2, etk var3, Predicate<? super T> var4);

      static dpj.a a(clh $$0) {
         return a(List.of($$0));
      }

      static dpj.a a(final List<clh> $$0) {
         return new dpj.a() {
            @Override
            public List<clh> a(aqh $$0x, Predicate<? super clh> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends brh> List<T> a(aqh $$0x, duo<brh, T> $$1, etk $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
