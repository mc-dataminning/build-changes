import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bpp {
   public static bod<cev> a() {
      return brp.a(
         (Function<brp.b<cev>, ? extends App<brp.c<cev>, brs<cev>>>)($$0 -> $$0.group($$0.b(bvn.c), $$0.b(bvn.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ig $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bml>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cev && $$1xxx != $$4)
                                    .map($$0xxxx -> (cev)$$0xxxx)
                                    .filter(bml::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bpp::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cev a(cev $$0, cev $$1) {
      cev $$2;
      cev $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bvn.c);
      return $$2;
   }

   private static boolean a(ig $$0, ih<bxp> $$1, cev $$2) {
      Optional<ig> $$3 = $$2.dO().c(bvn.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ih<bxp> $$0, cey $$1) {
      return $$1.b().test($$0);
   }
}
