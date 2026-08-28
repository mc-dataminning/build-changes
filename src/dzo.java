import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dzo {
   dzo a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.b() && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bwi::cF)
         .toList();
   dzo b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bwi::cF)
         .toList();
   dzo c = ($$0, $$1, $$2, $$3, $$4) -> {
      fes $$5 = new fes($$2).g($$3);
      return $$1.a($$0, bwr.bb, $$5, bxj::bI).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC())).map(bwi::cF).toList();
   };

   List<UUID> detect(arq var1, dzo.a var2, iv var3, double var4, boolean var6);

   private static boolean a(djh $$0, fex $$1, fex $$2) {
      fet $$3 = $$0.a(new diq($$2, $$1, diq.a.c, diq.b.a, ffc.a()));
      return $$3.b().equals(iv.a((jp)$$1)) || $$3.d() == fev.a.a;
   }

   public interface a {
      dzo.a a = new dzo.a() {
         @Override
         public List<arr> a(arq $$0, Predicate<? super crj> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwi> List<T> a(arq $$0, efa<bwi, T> $$1, fes $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends crj> a(arq var1, Predicate<? super crj> var2);

      <T extends bwi> List<T> a(arq var1, efa<bwi, T> var2, fes var3, Predicate<? super T> var4);

      static dzo.a a(crj $$0) {
         return a(List.of($$0));
      }

      static dzo.a a(final List<crj> $$0) {
         return new dzo.a() {
            @Override
            public List<crj> a(arq $$0x, Predicate<? super crj> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwi> List<T> a(arq $$0x, efa<bwi, T> $$1, fes $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
