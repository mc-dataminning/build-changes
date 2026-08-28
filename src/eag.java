import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface eag {
   eag a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bwv::cG)
         .toList();
   eag b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bwv::cG)
         .toList();
   eag c = ($$0, $$1, $$2, $$3, $$4) -> {
      ffn $$5 = new ffn($$2).g($$3);
      return $$1.a($$0, bxe.bc, $$5, bxw::bJ).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD())).map(bwv::cG).toList();
   };

   List<UUID> detect(aru var1, eag.a var2, iw var3, double var4, boolean var6);

   private static boolean a(djz $$0, ffs $$1, ffs $$2) {
      ffo $$3 = $$0.a(new djg($$2, $$1, djg.a.c, djg.b.a, ffx.a()));
      return $$3.b().equals(iw.a((jq)$$1)) || $$3.d() == ffq.a.a;
   }

   public interface a {
      eag.a a = new eag.a() {
         @Override
         public List<arv> a(aru $$0, Predicate<? super crz> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwv> List<T> a(aru $$0, efs<bwv, T> $$1, ffn $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends crz> a(aru var1, Predicate<? super crz> var2);

      <T extends bwv> List<T> a(aru var1, efs<bwv, T> var2, ffn var3, Predicate<? super T> var4);

      static eag.a a(crz $$0) {
         return a(List.of($$0));
      }

      static eag.a a(final List<crz> $$0) {
         return new eag.a() {
            @Override
            public List<crz> a(aru $$0x, Predicate<? super crz> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwv> List<T> a(aru $$0x, efs<bwv, T> $$1, ffn $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
