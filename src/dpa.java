import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dpa {
   dpa a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dn().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(bql::cx).toList();
   dpa b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dn().a($$2, $$3) && !$$2x.N_()).stream().map(bql::cx).toList();
   dpa c = ($$0, $$1, $$2, $$3) -> {
      eta $$4 = new eta($$2).g($$3);
      return $$1.a($$0, bqr.aI, $$4, bre::bB).stream().map(bql::cx).toList();
   };

   List<UUID> detect(aqe var1, dpa.a var2, im var3, double var4);

   public interface a {
      dpa.a a = new dpa.a() {
         @Override
         public List<aqf> a(aqe $$0, Predicate<? super ckl> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bql> List<T> a(aqe $$0, duf<bql, T> $$1, eta $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends ckl> a(aqe var1, Predicate<? super ckl> var2);

      <T extends bql> List<T> a(aqe var1, duf<bql, T> var2, eta var3, Predicate<? super T> var4);

      static dpa.a a(ckl $$0) {
         return a(List.of($$0));
      }

      static dpa.a a(final List<ckl> $$0) {
         return new dpa.a() {
            @Override
            public List<ckl> a(aqe $$0x, Predicate<? super ckl> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bql> List<T> a(aqe $$0x, duf<bql, T> $$1, eta $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
