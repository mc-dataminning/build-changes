import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dtq {
   dtq a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.f() && !$$2x.P_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bto::cD)
         .toList();
   dtq b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.P_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(bto::cD)
         .toList();
   dtq c = ($$0, $$1, $$2, $$3, $$4) -> {
      eyn $$5 = new eyn($$2).g($$3);
      return $$1.a($$0, btv.aJ, $$5, buk::bI).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC())).map(bto::cD).toList();
   };

   List<UUID> detect(arh var1, dtq.a var2, je var3, double var4, boolean var6);

   private static boolean a(deg $$0, eys $$1, eys $$2) {
      eyo $$3 = $$0.a(new ddo($$2, $$1, ddo.a.c, ddo.b.a, eyx.a()));
      return $$3.b().equals(je.a((jx)$$1)) || $$3.d() == eyq.a.a;
   }

   public interface a {
      dtq.a a = new dtq.a() {
         @Override
         public List<ari> a(arh $$0, Predicate<? super cnu> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bto> List<T> a(arh $$0, dyz<bto, T> $$1, eyn $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cnu> a(arh var1, Predicate<? super cnu> var2);

      <T extends bto> List<T> a(arh var1, dyz<bto, T> var2, eyn var3, Predicate<? super T> var4);

      static dtq.a a(cnu $$0) {
         return a(List.of($$0));
      }

      static dtq.a a(final List<cnu> $$0) {
         return new dtq.a() {
            @Override
            public List<cnu> a(arh $$0x, Predicate<? super cnu> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bto> List<T> a(arh $$0x, dyz<bto, T> $$1, eyn $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
