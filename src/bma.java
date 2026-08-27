import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bma {
   public static bkp<cay> a() {
      return boa.a(
         (Function<boa.b<cay>, ? extends App<boa.c<cay>, bod<cay>>>)($$0 -> $$0.group($$0.b(bry.c), $$0.b(bry.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        he $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<biw>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cay && $$1xxx != $$4)
                                    .map($$0xxxx -> (cay)$$0xxxx)
                                    .filter(biw::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bma::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cay a(cay $$0, cay $$1) {
      cay $$2;
      cay $$3;
      if ($$0.q() > $$1.q()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dM().b(bry.c);
      return $$2;
   }

   private static boolean a(he $$0, hf<btz> $$1, cay $$2) {
      Optional<he> $$3 = $$2.dM().c(bry.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gk().b());
   }

   private static boolean a(hf<btz> $$0, cbb $$1) {
      return $$1.b().test($$0);
   }
}
