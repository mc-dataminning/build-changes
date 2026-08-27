import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class brj {
   public static bpx<cgu> a() {
      return btj.a(
         (Function<btj.b<cgu>, ? extends App<btj.c<cgu>, btm<cgu>>>)($$0 -> $$0.group($$0.b(bxh.c), $$0.b(bxh.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ii $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bog>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cgu && $$1xxx != $$4)
                                    .map($$0xxxx -> (cgu)$$0xxxx)
                                    .filter(bog::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, brj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cgu a(cgu $$0, cgu $$1) {
      cgu $$2;
      cgu $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bxh.c);
      return $$2;
   }

   private static boolean a(ii $$0, ij<bzk> $$1, cgu $$2) {
      Optional<ii> $$3 = $$2.dO().c(bxh.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gr().b());
   }

   private static boolean a(ij<bzk> $$0, cgx $$1) {
      return $$1.b().test($$0);
   }
}
