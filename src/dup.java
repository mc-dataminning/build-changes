import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dup {
   dup a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dy().a($$2, $$3) && !$$2x.f() && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bH()))
         .map(bui::cI)
         .toList();
   dup b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dy().a($$2, $$3) && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bH()))
         .map(bui::cI)
         .toList();
   dup c = ($$0, $$1, $$2, $$3, $$4) -> {
      ezm $$5 = new ezm($$2).g($$3);
      return $$1.a($$0, bup.aJ, $$5, bve::bN).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bH())).map(bui::cI).toList();
   };

   List<UUID> detect(arq var1, dup.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dff $$0, ezr $$1, ezr $$2) {
      ezn $$3 = $$0.a(new den($$2, $$1, den.a.c, den.b.a, ezw.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == ezp.a.a;
   }

   public interface a {
      dup.a a = new dup.a() {
         @Override
         public List<arr> a(arq $$0, Predicate<? super cor> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bui> List<T> a(arq $$0, dzy<bui, T> $$1, ezm $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cor> a(arq var1, Predicate<? super cor> var2);

      <T extends bui> List<T> a(arq var1, dzy<bui, T> var2, ezm var3, Predicate<? super T> var4);

      static dup.a a(cor $$0) {
         return a(List.of($$0));
      }

      static dup.a a(final List<cor> $$0) {
         return new dup.a() {
            @Override
            public List<cor> a(arq $$0x, Predicate<? super cor> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bui> List<T> a(arq $$0x, dzy<bui, T> $$1, ezm $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
