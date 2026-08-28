import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dyz {
   dyz a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwd::cG)
         .toList();
   dyz b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bwd::cG)
         .toList();
   dyz c = ($$0, $$1, $$2, $$3, $$4) -> {
      fed $$5 = new fed($$2).g($$3);
      return $$1.a($$0, bwm.bb, $$5, bxc::bK).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE())).map(bwd::cG).toList();
   };

   List<UUID> detect(arq var1, dyz.a var2, iu var3, double var4, boolean var6);

   private static boolean a(div $$0, fei $$1, fei $$2) {
      fee $$3 = $$0.a(new die($$2, $$1, die.a.c, die.b.a, fen.a()));
      return $$3.b().equals(iu.a((jo)$$1)) || $$3.d() == feg.a.a;
   }

   public interface a {
      dyz.a a = new dyz.a() {
         @Override
         public List<arr> a(arq $$0, Predicate<? super cqy> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bwd> List<T> a(arq $$0, eel<bwd, T> $$1, fed $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cqy> a(arq var1, Predicate<? super cqy> var2);

      <T extends bwd> List<T> a(arq var1, eel<bwd, T> var2, fed var3, Predicate<? super T> var4);

      static dyz.a a(cqy $$0) {
         return a(List.of($$0));
      }

      static dyz.a a(final List<cqy> $$0) {
         return new dyz.a() {
            @Override
            public List<cqy> a(arq $$0x, Predicate<? super cqy> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bwd> List<T> a(arq $$0x, eel<bwd, T> $$1, fed $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
