import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dwv {
   dwv a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvj::cG)
         .toList();
   dwv b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvj::cG)
         .toList();
   dwv c = ($$0, $$1, $$2, $$3, $$4) -> {
      fbs $$5 = new fbs($$2).g($$3);
      return $$1.a($$0, bvq.bb, $$5, bwf::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bvj::cG).toList();
   };

   List<UUID> detect(ash var1, dwv.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dhh $$0, fbx $$1, fbx $$2) {
      fbt $$3 = $$0.a(new dgp($$2, $$1, dgp.a.c, dgp.b.a, fcc.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == fbv.a.a;
   }

   public interface a {
      dwv.a a = new dwv.a() {
         @Override
         public List<asi> a(ash $$0, Predicate<? super cpw> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bvj> List<T> a(ash $$0, ece<bvj, T> $$1, fbs $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cpw> a(ash var1, Predicate<? super cpw> var2);

      <T extends bvj> List<T> a(ash var1, ece<bvj, T> var2, fbs var3, Predicate<? super T> var4);

      static dwv.a a(cpw $$0) {
         return a(List.of($$0));
      }

      static dwv.a a(final List<cpw> $$0) {
         return new dwv.a() {
            @Override
            public List<cpw> a(ash $$0x, Predicate<? super cpw> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bvj> List<T> a(ash $$0x, ece<bvj, T> $$1, fbs $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
