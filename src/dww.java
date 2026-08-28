import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dww {
   dww a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.b() && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvk::cG)
         .toList();
   dww b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvk::cG)
         .toList();
   dww c = ($$0, $$1, $$2, $$3, $$4) -> {
      fbt $$5 = new fbt($$2).g($$3);
      return $$1.a($$0, bvr.bb, $$5, bwg::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bvk::cG).toList();
   };

   List<UUID> detect(ash var1, dww.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dhi $$0, fby $$1, fby $$2) {
      fbu $$3 = $$0.a(new dgq($$2, $$1, dgq.a.c, dgq.b.a, fcd.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == fbw.a.a;
   }

   public interface a {
      dww.a a = new dww.a() {
         @Override
         public List<asi> a(ash $$0, Predicate<? super cpx> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bvk> List<T> a(ash $$0, ecf<bvk, T> $$1, fbt $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cpx> a(ash var1, Predicate<? super cpx> var2);

      <T extends bvk> List<T> a(ash var1, ecf<bvk, T> var2, fbt var3, Predicate<? super T> var4);

      static dww.a a(cpx $$0) {
         return a(List.of($$0));
      }

      static dww.a a(final List<cpx> $$0) {
         return new dww.a() {
            @Override
            public List<cpx> a(ash $$0x, Predicate<? super cpx> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bvk> List<T> a(ash $$0x, ecf<bvk, T> $$1, fbt $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
