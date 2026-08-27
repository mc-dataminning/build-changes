import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dse {
   dse a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.f() && !$$2x.O_()).stream().map(brv::cE).toList();
   dse b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.O_()).stream().map(brv::cE).toList();
   dse c = ($$0, $$1, $$2, $$3) -> {
      ewp $$4 = new ewp($$2).g($$3);
      return $$1.a($$0, bsb.aL, $$4, bso::bI).stream().map(brv::cE).toList();
   };

   List<UUID> detect(aqt var1, dse.a var2, ir var3, double var4);

   public interface a {
      dse.a a = new dse.a() {
         @Override
         public List<aqu> a(aqt $$0, Predicate<? super cly> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends brv> List<T> a(aqt $$0, dxj<brv, T> $$1, ewp $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cly> a(aqt var1, Predicate<? super cly> var2);

      <T extends brv> List<T> a(aqt var1, dxj<brv, T> var2, ewp var3, Predicate<? super T> var4);

      static dse.a a(cly $$0) {
         return a(List.of($$0));
      }

      static dse.a a(final List<cly> $$0) {
         return new dse.a() {
            @Override
            public List<cly> a(aqt $$0x, Predicate<? super cly> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends brv> List<T> a(aqt $$0x, dxj<brv, T> $$1, ewp $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
