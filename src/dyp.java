import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dyp {
   dyp a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwa::cG)
         .toList();
   dyp b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwa::cG)
         .toList();
   dyp c = ($$0, $$1, $$2, $$3, $$4) -> {
      fdr $$5 = new fdr($$2).g($$3);
      return $$1.a($$0, bwj.bb, $$5, bwz::bK).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE())).map(bwa::cG).toList();
   };

   List<UUID> detect(aro var1, dyp.a var2, iu var3, double var4, boolean var6);

   private static boolean a(dip $$0, fdw $$1, fdw $$2) {
      fds $$3 = $$0.a(new dhy($$2, $$1, dhy.a.c, dhy.b.a, feb.a()));
      return $$3.b().equals(iu.a((jo)$$1)) || $$3.d() == fdu.a.a;
   }

   public interface a {
      dyp.a a = new dyp.a() {
         @Override
         public List<arp> a(aro $$0, Predicate<? super cqs> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwa> List<T> a(aro $$0, eea<bwa, T> $$1, fdr $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cqs> a(aro var1, Predicate<? super cqs> var2);

      <T extends bwa> List<T> a(aro var1, eea<bwa, T> var2, fdr var3, Predicate<? super T> var4);

      static dyp.a a(cqs $$0) {
         return a(List.of($$0));
      }

      static dyp.a a(final List<cqs> $$0) {
         return new dyp.a() {
            @Override
            public List<cqs> a(aro $$0x, Predicate<? super cqs> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwa> List<T> a(aro $$0x, eea<bwa, T> $$1, fdr $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
