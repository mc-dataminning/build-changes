import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dmb {
   dmb a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(bow::cw).toList();
   dmb b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.N_()).stream().map(bow::cw).toList();
   dmb c = ($$0, $$1, $$2, $$3) -> {
      epm $$4 = new epm($$2).g($$3);
      return $$1.a($$0, bpc.aI, $$4, bpo::bA).stream().map(bow::cw).toList();
   };

   List<UUID> detect(apf var1, dmb.a var2, ib var3, double var4);

   public interface a {
      dmb.a a = new dmb.a() {
         @Override
         public List<apg> a(apf $$0, Predicate<? super cis> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bow> List<T> a(apf $$0, drb<bow, T> $$1, epm $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cis> a(apf var1, Predicate<? super cis> var2);

      <T extends bow> List<T> a(apf var1, drb<bow, T> var2, epm var3, Predicate<? super T> var4);

      static dmb.a a(cis $$0) {
         return a(List.of($$0));
      }

      static dmb.a a(final List<cis> $$0) {
         return new dmb.a() {
            @Override
            public List<cis> a(apf $$0x, Predicate<? super cis> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bow> List<T> a(apf $$0x, drb<bow, T> $$1, epm $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
