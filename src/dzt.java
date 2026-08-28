import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dzt {
   dzt a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.b() && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bwi::cF)
         .toList();
   dzt b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.V_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bwi::cF)
         .toList();
   dzt c = ($$0, $$1, $$2, $$3, $$4) -> {
      fex $$5 = new fex($$2).g($$3);
      return $$1.a($$0, bwr.bb, $$5, bxj::bI).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC())).map(bwi::cF).toList();
   };

   List<UUID> detect(arq var1, dzt.a var2, iv var3, double var4, boolean var6);

   private static boolean a(djm $$0, ffc $$1, ffc $$2) {
      fey $$3 = $$0.a(new dit($$2, $$1, dit.a.c, dit.b.a, ffh.a()));
      return $$3.b().equals(iv.a((jp)$$1)) || $$3.d() == ffa.a.a;
   }

   public interface a {
      dzt.a a = new dzt.a() {
         @Override
         public List<arr> a(arq $$0, Predicate<? super crm> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwi> List<T> a(arq $$0, eff<bwi, T> $$1, fex $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends crm> a(arq var1, Predicate<? super crm> var2);

      <T extends bwi> List<T> a(arq var1, eff<bwi, T> var2, fex var3, Predicate<? super T> var4);

      static dzt.a a(crm $$0) {
         return a(List.of($$0));
      }

      static dzt.a a(final List<crm> $$0) {
         return new dzt.a() {
            @Override
            public List<crm> a(arq $$0x, Predicate<? super crm> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwi> List<T> a(arq $$0x, eff<bwi, T> $$1, fex $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
