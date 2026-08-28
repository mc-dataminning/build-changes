import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface eaq {
   eaq a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bxe::cG)
         .toList();
   eaq b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bxe::cG)
         .toList();
   eaq c = ($$0, $$1, $$2, $$3, $$4) -> {
      ffx $$5 = new ffx($$2).g($$3);
      return $$1.a($$0, bxn.bc, $$5, byf::bJ).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD())).map(bxe::cG).toList();
   };

   List<UUID> detect(asb var1, eaq.a var2, iw var3, double var4, boolean var6);

   private static boolean a(dkj $$0, fgc $$1, fgc $$2) {
      ffy $$3 = $$0.a(new djq($$2, $$1, djq.a.c, djq.b.a, fgh.a()));
      return $$3.b().equals(iw.a((jq)$$1)) || $$3.d() == fga.a.a;
   }

   public interface a {
      eaq.a a = new eaq.a() {
         @Override
         public List<asc> a(asb $$0, Predicate<? super csi> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bxe> List<T> a(asb $$0, egc<bxe, T> $$1, ffx $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends csi> a(asb var1, Predicate<? super csi> var2);

      <T extends bxe> List<T> a(asb var1, egc<bxe, T> var2, ffx var3, Predicate<? super T> var4);

      static eaq.a a(csi $$0) {
         return a(List.of($$0));
      }

      static eaq.a a(final List<csi> $$0) {
         return new eaq.a() {
            @Override
            public List<csi> a(asb $$0x, Predicate<? super csi> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bxe> List<T> a(asb $$0x, egc<bxe, T> $$1, ffx $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
