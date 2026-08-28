import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface eae {
   eae a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bwt::cG)
         .toList();
   eae b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bwt::cG)
         .toList();
   eae c = ($$0, $$1, $$2, $$3, $$4) -> {
      ffl $$5 = new ffl($$2).g($$3);
      return $$1.a($$0, bxc.bc, $$5, bxu::bJ).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD())).map(bwt::cG).toList();
   };

   List<UUID> detect(ars var1, eae.a var2, iv var3, double var4, boolean var6);

   private static boolean a(djx $$0, ffq $$1, ffq $$2) {
      ffm $$3 = $$0.a(new dje($$2, $$1, dje.a.c, dje.b.a, ffv.a()));
      return $$3.b().equals(iv.a((jp)$$1)) || $$3.d() == ffo.a.a;
   }

   public interface a {
      eae.a a = new eae.a() {
         @Override
         public List<art> a(ars $$0, Predicate<? super crx> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwt> List<T> a(ars $$0, efq<bwt, T> $$1, ffl $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends crx> a(ars var1, Predicate<? super crx> var2);

      <T extends bwt> List<T> a(ars var1, efq<bwt, T> var2, ffl var3, Predicate<? super T> var4);

      static eae.a a(crx $$0) {
         return a(List.of($$0));
      }

      static eae.a a(final List<crx> $$0) {
         return new eae.a() {
            @Override
            public List<crx> a(ars $$0x, Predicate<? super crx> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwt> List<T> a(ars $$0x, efq<bwt, T> $$1, ffl $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
