import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byn {
   public static bxb<cof> a() {
      return can.a(
         (Function<can.b<cof>, ? extends App<can.c<cof>, caq<cof>>>)($$0 -> $$0.group($$0.b(cel.c), $$0.b(cel.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.z()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvh>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cof && $$1xxx != $$4)
                                    .map($$0xxxx -> (cof)$$0xxxx)
                                    .filter(bvh::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byn::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cof a(cof $$0, cof $$1) {
      cof $$2;
      cof $$3;
      if ($$0.q() > $$1.q()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cel.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<cgo> $$1, cof $$2) {
      Optional<jp> $$3 = $$2.eb().c(cel.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gx().b());
   }

   private static boolean a(jq<cgo> $$0, coi $$1) {
      return $$1.b().test($$0);
   }
}
