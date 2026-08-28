import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwx {
   public static bvl<cmm> a() {
      return byx.a(
         (Function<byx.b<cmm>, ? extends App<byx.c<cmm>, bza<cmm>>>)($$0 -> $$0.group($$0.b(ccv.c), $$0.b(ccv.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btr>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmm && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmm)$$0xxxx)
                                    .filter(btr::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwx::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmm a(cmm $$0, cmm $$1) {
      cmm $$2;
      cmm $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(ccv.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<cey> $$1, cmm $$2) {
      Optional<jh> $$3 = $$2.dS().c(ccv.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<cey> $$0, cmp $$1) {
      return $$1.b().test($$0);
   }
}
