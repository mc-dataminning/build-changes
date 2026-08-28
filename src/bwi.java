import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwi {
   public static buw<cly> a() {
      return byi.a(
         (Function<byi.b<cly>, ? extends App<byi.c<cly>, byl<cly>>>)($$0 -> $$0.group($$0.b(ccg.c), $$0.b(ccg.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ji $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btc>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cly && $$1xxx != $$4)
                                    .map($$0xxxx -> (cly)$$0xxxx)
                                    .filter(btc::bF)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwi::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cly a(cly $$0, cly $$1) {
      cly $$2;
      cly $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dV().b(ccg.c);
      return $$2;
   }

   private static boolean a(ji $$0, jj<cej> $$1, cly $$2) {
      Optional<ji> $$3 = $$2.dV().c(ccg.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jj<cej> $$0, cmb $$1) {
      return $$1.b().test($$0);
   }
}
