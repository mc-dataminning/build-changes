import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwh {
   public static buv<clx> a() {
      return byh.a(
         (Function<byh.b<clx>, ? extends App<byh.c<clx>, byk<clx>>>)($$0 -> $$0.group($$0.b(ccf.c), $$0.b(ccf.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ji $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btb>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof clx && $$1xxx != $$4)
                                    .map($$0xxxx -> (clx)$$0xxxx)
                                    .filter(btb::bE)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwh::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static clx a(clx $$0, clx $$1) {
      clx $$2;
      clx $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dU().b(ccf.c);
      return $$2;
   }

   private static boolean a(ji $$0, jj<cei> $$1, clx $$2) {
      Optional<ji> $$3 = $$2.dU().c(ccf.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gz().b());
   }

   private static boolean a(jj<cei> $$0, cma $$1) {
      return $$1.b().test($$0);
   }
}
