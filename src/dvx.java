import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dvx {
   dvx a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(buk::cG)
         .toList();
   dvx b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(buk::cG)
         .toList();
   dvx c = ($$0, $$1, $$2, $$3, $$4) -> {
      fau $$5 = new fau($$2).g($$3);
      return $$1.a($$0, bur.ba, $$5, bvg::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(buk::cG).toList();
   };

   List<UUID> detect(ard var1, dvx.a var2, ji var3, double var4, boolean var6);

   private static boolean a(dgh $$0, faz $$1, faz $$2) {
      fav $$3 = $$0.a(new dfp($$2, $$1, dfp.a.c, dfp.b.a, fbe.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == fax.a.a;
   }

   public interface a {
      dvx.a a = new dvx.a() {
         @Override
         public List<are> a(ard $$0, Predicate<? super cow> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends buk> List<T> a(ard $$0, ebg<buk, T> $$1, fau $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cow> a(ard var1, Predicate<? super cow> var2);

      <T extends buk> List<T> a(ard var1, ebg<buk, T> var2, fau var3, Predicate<? super T> var4);

      static dvx.a a(cow $$0) {
         return a(List.of($$0));
      }

      static dvx.a a(final List<cow> $$0) {
         return new dvx.a() {
            @Override
            public List<cow> a(ard $$0x, Predicate<? super cow> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends buk> List<T> a(ard $$0x, ebg<buk, T> $$1, fau $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
