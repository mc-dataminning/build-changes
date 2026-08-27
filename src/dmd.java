import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dmd {
   dmd a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(box::cw).toList();
   dmd b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.N_()).stream().map(box::cw).toList();
   dmd c = ($$0, $$1, $$2, $$3) -> {
      epo $$4 = new epo($$2).g($$3);
      return $$1.a($$0, bpd.aJ, $$4, bpp::bA).stream().map(box::cw).toList();
   };

   List<UUID> detect(apf var1, dmd.a var2, ib var3, double var4);

   public interface a {
      dmd.a a = new dmd.a() {
         @Override
         public List<apg> a(apf $$0, Predicate<? super ciu> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends box> List<T> a(apf $$0, drd<box, T> $$1, epo $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends ciu> a(apf var1, Predicate<? super ciu> var2);

      <T extends box> List<T> a(apf var1, drd<box, T> var2, epo var3, Predicate<? super T> var4);

      static dmd.a a(ciu $$0) {
         return a(List.of($$0));
      }

      static dmd.a a(final List<ciu> $$0) {
         return new dmd.a() {
            @Override
            public List<ciu> a(apf $$0x, Predicate<? super ciu> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends box> List<T> a(apf $$0x, drd<box, T> $$1, epo $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
