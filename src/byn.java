import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byn {
   public static bxb<coi> a() {
      return can.a(
         (Function<can.b<coi>, ? extends App<can.c<coi>, caq<coi>>>)($$0 -> $$0.group($$0.b(cel.c), $$0.b(cel.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvh>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof coi && $$1xxx != $$4)
                                    .map($$0xxxx -> (coi)$$0xxxx)
                                    .filter(bvh::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byn::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static coi a(coi $$0, coi $$1) {
      coi $$2;
      coi $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cel.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<cgo> $$1, coi $$2) {
      Optional<jq> $$3 = $$2.eb().c(cel.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jr<cgo> $$0, col $$1) {
      return $$1.b().test($$0);
   }
}
