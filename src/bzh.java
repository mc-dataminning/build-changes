import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzh {
   public static bxv<cpe> a() {
      return cbh.a(
         (Function<cbh.b<cpe>, ? extends App<cbh.c<cpe>, cbk<cpe>>>)($$0 -> $$0.group($$0.b(cff.c), $$0.b(cff.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.z()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bwb>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpe && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpe)$$0xxxx)
                                    .filter(bwb::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bzh::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpe a(cpe $$0, cpe $$1) {
      cpe $$2;
      cpe $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cff.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<chi> $$1, cpe $$2) {
      Optional<jp> $$3 = $$2.eb().c(cff.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gw().b());
   }

   private static boolean a(jq<chi> $$0, cph $$1) {
      return $$1.b().test($$0);
   }
}
