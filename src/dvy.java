import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dvy {
   dvy a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bul::cG)
         .toList();
   dvy b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bul::cG)
         .toList();
   dvy c = ($$0, $$1, $$2, $$3, $$4) -> {
      fav $$5 = new fav($$2).g($$3);
      return $$1.a($$0, bus.ba, $$5, bvh::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bul::cG).toList();
   };

   List<UUID> detect(ard var1, dvy.a var2, ji var3, double var4, boolean var6);

   private static boolean a(dgi $$0, fba $$1, fba $$2) {
      faw $$3 = $$0.a(new dfq($$2, $$1, dfq.a.c, dfq.b.a, fbf.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == fay.a.a;
   }

   public interface a {
      dvy.a a = new dvy.a() {
         @Override
         public List<are> a(ard $$0, Predicate<? super cox> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bul> List<T> a(ard $$0, ebh<bul, T> $$1, fav $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cox> a(ard var1, Predicate<? super cox> var2);

      <T extends bul> List<T> a(ard var1, ebh<bul, T> var2, fav var3, Predicate<? super T> var4);

      static dvy.a a(cox $$0) {
         return a(List.of($$0));
      }

      static dvy.a a(final List<cox> $$0) {
         return new dvy.a() {
            @Override
            public List<cox> a(ard $$0x, Predicate<? super cox> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bul> List<T> a(ard $$0x, ebh<bul, T> $$1, fav $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
