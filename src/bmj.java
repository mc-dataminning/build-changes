import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bmj {
   public static bky<cbh> a() {
      return boj.a(
         (Function<boj.b<cbh>, ? extends App<boj.c<cbh>, bom<cbh>>>)($$0 -> $$0.group($$0.b(bsh.c), $$0.b(bsh.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bjg>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cbh && $$1xxx != $$4)
                                    .map($$0xxxx -> (cbh)$$0xxxx)
                                    .filter(bjg::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bmj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cbh a(cbh $$0, cbh $$1) {
      cbh $$2;
      cbh $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(bsh.c);
      return $$2;
   }

   private static boolean a(hd $$0, he<bui> $$1, cbh $$2) {
      Optional<hd> $$3 = $$2.dN().c(bsh.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.go().b());
   }

   private static boolean a(he<bui> $$0, cbk $$1) {
      return $$1.b().test($$0);
   }
}
