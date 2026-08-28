import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bww {
   public static bvk<cml> a() {
      return byw.a(
         (Function<byw.b<cml>, ? extends App<byw.c<cml>, byz<cml>>>)($$0 -> $$0.group($$0.b(ccu.c), $$0.b(ccu.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btq>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cml && $$1xxx != $$4)
                                    .map($$0xxxx -> (cml)$$0xxxx)
                                    .filter(btq::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bww::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cml a(cml $$0, cml $$1) {
      cml $$2;
      cml $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(ccu.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<cex> $$1, cml $$2) {
      Optional<jh> $$3 = $$2.dS().c(ccu.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<cex> $$0, cmo $$1) {
      return $$1.b().test($$0);
   }
}
