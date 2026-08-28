import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dwp {
   dwp a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.b() && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvb::cG)
         .toList();
   dwp b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvb::cG)
         .toList();
   dwp c = ($$0, $$1, $$2, $$3, $$4) -> {
      fbm $$5 = new fbm($$2).g($$3);
      return $$1.a($$0, bvi.bb, $$5, bvx::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bvb::cG).toList();
   };

   List<UUID> detect(arx var1, dwp.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dgz $$0, fbr $$1, fbr $$2) {
      fbn $$3 = $$0.a(new dgh($$2, $$1, dgh.a.c, dgh.b.a, fbw.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == fbp.a.a;
   }

   public interface a {
      dwp.a a = new dwp.a() {
         @Override
         public List<ary> a(arx $$0, Predicate<? super cpo> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bvb> List<T> a(arx $$0, eby<bvb, T> $$1, fbm $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cpo> a(arx var1, Predicate<? super cpo> var2);

      <T extends bvb> List<T> a(arx var1, eby<bvb, T> var2, fbm var3, Predicate<? super T> var4);

      static dwp.a a(cpo $$0) {
         return a(List.of($$0));
      }

      static dwp.a a(final List<cpo> $$0) {
         return new dwp.a() {
            @Override
            public List<cpo> a(arx $$0x, Predicate<? super cpo> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bvb> List<T> a(arx $$0x, eby<bvb, T> $$1, fbm $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
